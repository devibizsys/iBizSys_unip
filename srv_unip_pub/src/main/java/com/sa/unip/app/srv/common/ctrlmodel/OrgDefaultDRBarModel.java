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
 * 实体[组织机构]数据关系栏[drbar]部件模型
 */
public class  OrgDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OrgDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private com.sa.unip.srv.subsys.demodel.OrgDEModel orgDEModel;
    protected  com.sa.unip.srv.subsys.demodel.OrgDEModel getOrgDEModel() {
        if(this.orgDEModel==null) {
            try {
                this.orgDEModel = (com.sa.unip.srv.subsys.demodel.OrgDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOrgDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 组织机构
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("组织机构");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("DE.LNAME.ORG");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("e3e158d75b7bc6f589686b6e1beb966c","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 组织部门人员
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem2.setText("组织部门人员");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_ORGSECUSER_ORG_ORGID");
        //添加 组织人员
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem3.setText("组织人员");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_ORGUSER_ORG_ORGID");
        //添加 组织部门
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem4.setText("组织部门");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_ORGSECTOR_ORG_ORGID");
        //添加 组织机构
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem5.setText("组织机构");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_ORG_ORG_PORGID");
        //添加 数据对象能力
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem5","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem6.setText("数据对象能力");
        drCtrlItem6.setDRViewId("DRITEM5");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_USERROLEDATA_ORG_DSTORGID");
        //添加 工作流实例
        DRCtrlItem drCtrlItem7 = drCtrlRootItem.addItem("dritem6","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem7.setText("工作流实例");
        drCtrlItem7.setDRViewId("DRITEM6");
        drCtrlItem7.setTextLanResTag("");
        drCtrlItem7.setIconPath("");
        drCtrlItem7.setIconCls("");
        drCtrlItem7.setEnableMode("ALL");
        drCtrlItem7.setViewParam("srfparentdeid","e3e158d75b7bc6f589686b6e1beb966c");
        drCtrlItem7.setViewParam("srfparenttype","DER1N");
        drCtrlItem7.setViewParam("srfder1nid","DER1N_WFINSTANCE_ORG_ORGID");
    }
}