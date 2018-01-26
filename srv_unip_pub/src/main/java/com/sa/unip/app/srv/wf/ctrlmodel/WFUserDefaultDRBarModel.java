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
 * 实体[工作流用户]数据关系栏[drbar]部件模型
 */
public class  WFUserDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public WFUserDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel wFUserDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel getWFUserDEModel() {
        if(this.wFUserDEModel==null) {
            try {
                this.wFUserDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFUserDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFUserDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 工作流用户
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("工作流用户");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("ef2c7b349c855e594aa4fe0cb7ad8b48","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 工作流用户组成员
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem2.setText("工作流用户组成员");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID");
        //添加 工作流用户候选者
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem3.setText("工作流用户候选者");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_WFUSERCANDIDATE_WFUSER_WFMAJORUSERID");
        //添加 工作流用户候选者
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem4.setText("工作流用户候选者");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_WFUSERCANDIDATE_WFUSER_WFMINORUSERID");
        //添加 工作流用户代办
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem5.setText("工作流用户代办");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_WFUSERASSIST_WFUSER_WFMAJORUSERID");
        //添加 工作流用户代办
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem5","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem6.setText("工作流用户代办");
        drCtrlItem6.setDRViewId("DRITEM5");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_WFUSERASSIST_WFUSER_WFMINORUSERID");
        //添加 工作流工作催办
        DRCtrlItem drCtrlItem7 = drCtrlRootItem.addItem("dritem6","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem7.setText("工作流工作催办");
        drCtrlItem7.setDRViewId("DRITEM6");
        drCtrlItem7.setTextLanResTag("");
        drCtrlItem7.setIconPath("");
        drCtrlItem7.setIconCls("");
        drCtrlItem7.setEnableMode("ALL");
        drCtrlItem7.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem7.setViewParam("srfparenttype","DER1N");
        drCtrlItem7.setViewParam("srfder1nid","DER1N_WFREMINDER_WFUSER_WFUSERID");
        //添加 工作流步骤操作者
        DRCtrlItem drCtrlItem8 = drCtrlRootItem.addItem("dritem7","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem8.setText("工作流步骤操作者");
        drCtrlItem8.setDRViewId("DRITEM7");
        drCtrlItem8.setTextLanResTag("");
        drCtrlItem8.setIconPath("");
        drCtrlItem8.setIconCls("");
        drCtrlItem8.setEnableMode("ALL");
        drCtrlItem8.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem8.setViewParam("srfparenttype","DER1N");
        drCtrlItem8.setViewParam("srfder1nid","DER1N_WFSTEPACTOR_WFUSER_ORIGINALWFUSERID");
        //添加 源流程用户
        DRCtrlItem drCtrlItem9 = drCtrlRootItem.addItem("dritem8","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem9.setText("源流程用户");
        drCtrlItem9.setDRViewId("DRITEM8");
        drCtrlItem9.setTextLanResTag("");
        drCtrlItem9.setIconPath("");
        drCtrlItem9.setIconCls("");
        drCtrlItem9.setEnableMode("ALL");
        drCtrlItem9.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem9.setViewParam("srfparenttype","DER1N");
        drCtrlItem9.setViewParam("srfder1nid","DER1N_WFWORKLIST_WFUSER_ORIGINALWFUSERID");
        //添加 工作流步骤数据
        DRCtrlItem drCtrlItem10 = drCtrlRootItem.addItem("dritem9","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem10.setText("工作流步骤数据");
        drCtrlItem10.setDRViewId("DRITEM9");
        drCtrlItem10.setTextLanResTag("");
        drCtrlItem10.setIconPath("");
        drCtrlItem10.setIconCls("");
        drCtrlItem10.setEnableMode("ALL");
        drCtrlItem10.setViewParam("srfparentdeid","ef2c7b349c855e594aa4fe0cb7ad8b48");
        drCtrlItem10.setViewParam("srfparenttype","DER1N");
        drCtrlItem10.setViewParam("srfder1nid","DER1N_WFSTEPDATA_WFUSER_ORIGINALWFUSERID");
    }
}