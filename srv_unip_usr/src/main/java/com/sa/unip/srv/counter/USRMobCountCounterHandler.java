/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.counter;

import java.util.ArrayList;

import com.sa.unip.ionicapp.xxtz.controller.OA_RZRYMyReceiveMobMDView9Controller;
import com.sa.unip.ionicapp.ywsp.controller.WFWorkListDSPMobMDView9Controller;

import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.controller.IViewController;
import net.ibizsys.paas.controller.ViewControllerGlobal;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.util.spring.IBizOverride;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 移动端计数器计数器处理基类
 */
@IBizOverride
public class USRMobCountCounterHandler extends MobCountCounterHandler {

	@Override
	protected AjaxActionResult onFetch() throws Exception {
		MDAjaxActionResult mdAjaxResult = new MDAjaxActionResult();
		JSONObject ajaxObject = mdAjaxResult.getData(true);
		// 获取待我审批的数量
		String dwspCount = getDwspCount();

		// 获取未读日志的数量
		String wdrzCount = getWdrzCount();

		ajaxObject.put("DWSPCOUNT", dwspCount);
		ajaxObject.put("WDRZCOUNT", wdrzCount);

		return mdAjaxResult;
	}

	private String getWdrzCount() throws Exception {
		String wdrzCount = "";
		int total = 0;
		
		IViewController iViewController = ViewControllerGlobal.getViewController(OA_RZRYMyReceiveMobMDView9Controller.class);
 		iViewController.prepareViewController();
		ICtrlHandler mdctrl = iViewController.getCtrlHandler("mdctrl");
		MDAjaxActionResult mdAjaxActionResult = (MDAjaxActionResult) mdctrl.processAction("fetch", this.getWebContext());
		this.getWebContext().getCurUserId();
		ArrayList rzrys = mdAjaxActionResult.getRows();
		
		if(rzrys != null){
			JSONArray jsrsJsonArr = JSONArray.fromCollection(rzrys);
			
			for(int i = 0;i<jsrsJsonArr.length() ; i++){
				JSONObject jsrsJsonObj = jsrsJsonArr.getJSONObject(i);
				if(jsrsJsonObj.has("srfstate")){
					String sfyd = jsrsJsonObj.get("srfstate") == null?"":jsrsJsonObj.get("srfstate").toString() ;
					
					 ICodeList cl= CodeListGlobal.getCodeList("com.sa.unip.srv.codelist.CL_SFYDCodeListModel");
				 	 String text = cl.getCodeListText("20", true);
					if(StringHelper.compare(text, sfyd, true) != 0){
						total++;
					}
				}
			}
			
		}
		
		
		
		wdrzCount= total>99? 99+"+":total+"";
		
		return wdrzCount;
	}

	private String getDwspCount() throws Exception {
		String dwspCount = "";
		
		IViewController iViewController = ViewControllerGlobal.getViewController(WFWorkListDSPMobMDView9Controller.class);
		iViewController.prepareViewController();
		ICtrlHandler mdctrl = iViewController.getCtrlHandler("mdctrl");
		MDAjaxActionResult mdAjaxActionResult = (MDAjaxActionResult) mdctrl.processAction("fetch", this.getWebContext());
		this.getWebContext().getCurUserId();
		int total = mdAjaxActionResult.getTotalRow();
		
		dwspCount = total>99? 99+"+":total+"";
		
		return dwspCount;
	}
}