/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.wf.ctrlmodel;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.datamodel.DataItemModel;
import net.ibizsys.paas.datamodel.DataItemParamModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;

import net.ibizsys.paas.control.drctrl.DRCtrlItem;
import net.ibizsys.paas.control.drctrl.DRCtrlRootItem;

/**
 * 实体[工作流实例]数据关系栏[drbar]部件模型
 */
public class  WFInstanceDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public WFInstanceDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.wf.demodel.WFInstanceDEModel wFInstanceDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFInstanceDEModel getWFInstanceDEModel() {
        if(this.wFInstanceDEModel==null) {
            try {
                this.wFInstanceDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFInstanceDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFInstanceDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFInstanceDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFInstanceDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 工作流实例
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("工作流实例");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("0211d06b901d7948d2394149b7d0d96e","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 工作流实例
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem2.setText("工作流实例");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_WFINSTANCE_WFINSTANCE_PWFINSTANCEID");
        //添加 工作流步骤
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem3.setText("工作流步骤");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_WFSTEP_WFINSTANCE_WFINSTANCEID");
        //添加 工作流步骤数据
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem4.setText("工作流步骤数据");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_WFSTEPDATA_WFINSTANCE_WFINSTANCEID");
        //添加 工作流步骤子实例
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem5.setText("工作流步骤子实例");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_WFSTEPINST_WFINSTANCE_WFINSTANCEID");
        //添加 流程工作列表
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem5","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem6.setText("流程工作列表");
        drCtrlItem6.setDRViewId("DRITEM5");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","0211d06b901d7948d2394149b7d0d96e");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_WFWORKLIST_WFINSTANCE_WFINSTANCEID");
    }
}