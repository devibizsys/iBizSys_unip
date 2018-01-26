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
 * 实体[工作流配置]数据关系栏[drbar]部件模型
 */
public class  WFWorkflowDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public WFWorkflowDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.wf.demodel.WFWorkflowDEModel wFWorkflowDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFWorkflowDEModel getWFWorkflowDEModel() {
        if(this.wFWorkflowDEModel==null) {
            try {
                this.wFWorkflowDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFWorkflowDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFWorkflowDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFWorkflowDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFWorkflowDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 工作流配置
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("工作流配置");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("DE.LNAME.WFWORKFLOW");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("0166e9c016bf57201ba996cba3a67a45","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 工作流实例
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem2.setText("工作流实例");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_WFINSTANCE_WFWORKFLOW_WFWORKFLOWID");
        //添加 工作流用户代办
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem3.setText("工作流用户代办");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_WFUSERASSIST_WFWORKFLOW_WFWORKFLOWID");
        //添加 工作流用户操作
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem4.setText("工作流用户操作");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_WFACTION_WFWORKFLOW_WFWORKFLOWID");
        //添加 工作流配置版本
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem5.setText("工作流配置版本");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","0166e9c016bf57201ba996cba3a67a45");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_WFWFVERSION_WFWORKFLOW_WFWFID");
    }
}