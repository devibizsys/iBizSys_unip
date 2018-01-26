/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlmodel;


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
 * 实体[门户视图部件]数据关系栏[drbar]部件模型
 */
public class  PVPartDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public PVPartDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.common.demodel.PVPartDEModel pVPartDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.PVPartDEModel getPVPartDEModel() {
        if(this.pVPartDEModel==null) {
            try {
                this.pVPartDEModel = (net.ibizsys.psrt.srv.common.demodel.PVPartDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.PVPartDEModel");
            } catch(Exception ex) {
            }
        }
        return this.pVPartDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getPVPartDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 门户视图部件
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("门户视图部件");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("d1ce1f760d77192f620b4f6b9d7769f8","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem2.setText("门户页面模型");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_L1PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem3.setText("门户页面模型");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_L2PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem4.setText("门户页面模型");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_L3PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem5.setText("门户页面模型");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_L4PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem5","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem6.setText("门户页面模型");
        drCtrlItem6.setDRViewId("DRITEM5");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_C4PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem7 = drCtrlRootItem.addItem("dritem6","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem7.setText("门户页面模型");
        drCtrlItem7.setDRViewId("DRITEM6");
        drCtrlItem7.setTextLanResTag("");
        drCtrlItem7.setIconPath("");
        drCtrlItem7.setIconCls("");
        drCtrlItem7.setEnableMode("ALL");
        drCtrlItem7.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem7.setViewParam("srfparenttype","DER1N");
        drCtrlItem7.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_C3PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem8 = drCtrlRootItem.addItem("dritem7","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem8.setText("门户页面模型");
        drCtrlItem8.setDRViewId("DRITEM7");
        drCtrlItem8.setTextLanResTag("");
        drCtrlItem8.setIconPath("");
        drCtrlItem8.setIconCls("");
        drCtrlItem8.setEnableMode("ALL");
        drCtrlItem8.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem8.setViewParam("srfparenttype","DER1N");
        drCtrlItem8.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_C2PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem9 = drCtrlRootItem.addItem("dritem8","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem9.setText("门户页面模型");
        drCtrlItem9.setDRViewId("DRITEM8");
        drCtrlItem9.setTextLanResTag("");
        drCtrlItem9.setIconPath("");
        drCtrlItem9.setIconCls("");
        drCtrlItem9.setEnableMode("ALL");
        drCtrlItem9.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem9.setViewParam("srfparenttype","DER1N");
        drCtrlItem9.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_C1PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem10 = drCtrlRootItem.addItem("dritem9","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem10.setText("门户页面模型");
        drCtrlItem10.setDRViewId("DRITEM9");
        drCtrlItem10.setTextLanResTag("");
        drCtrlItem10.setIconPath("");
        drCtrlItem10.setIconCls("");
        drCtrlItem10.setEnableMode("ALL");
        drCtrlItem10.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem10.setViewParam("srfparenttype","DER1N");
        drCtrlItem10.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_R1PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem11 = drCtrlRootItem.addItem("dritem10","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem11.setText("门户页面模型");
        drCtrlItem11.setDRViewId("DRITEM10");
        drCtrlItem11.setTextLanResTag("");
        drCtrlItem11.setIconPath("");
        drCtrlItem11.setIconCls("");
        drCtrlItem11.setEnableMode("ALL");
        drCtrlItem11.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem11.setViewParam("srfparenttype","DER1N");
        drCtrlItem11.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_R2PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem12 = drCtrlRootItem.addItem("dritem11","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem12.setText("门户页面模型");
        drCtrlItem12.setDRViewId("DRITEM11");
        drCtrlItem12.setTextLanResTag("");
        drCtrlItem12.setIconPath("");
        drCtrlItem12.setIconCls("");
        drCtrlItem12.setEnableMode("ALL");
        drCtrlItem12.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem12.setViewParam("srfparenttype","DER1N");
        drCtrlItem12.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_R3PVPARTID");
        //添加 门户页面模型
        DRCtrlItem drCtrlItem13 = drCtrlRootItem.addItem("dritem12","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem13.setText("门户页面模型");
        drCtrlItem13.setDRViewId("DRITEM12");
        drCtrlItem13.setTextLanResTag("");
        drCtrlItem13.setIconPath("");
        drCtrlItem13.setIconCls("");
        drCtrlItem13.setEnableMode("ALL");
        drCtrlItem13.setViewParam("srfparentdeid","d1ce1f760d77192f620b4f6b9d7769f8");
        drCtrlItem13.setViewParam("srfparenttype","DER1N");
        drCtrlItem13.setViewParam("srfder1nid","DER1N_PPMODEL_PVPART_R4PVPARTID");
    }
}