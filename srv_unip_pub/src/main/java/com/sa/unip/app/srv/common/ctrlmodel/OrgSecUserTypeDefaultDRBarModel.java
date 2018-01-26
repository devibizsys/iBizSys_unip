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
 * 实体[部门人员关系类型]数据关系栏[drbar]部件模型
 */
public class  OrgSecUserTypeDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OrgSecUserTypeDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.common.demodel.OrgSecUserTypeDEModel orgSecUserTypeDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.OrgSecUserTypeDEModel getOrgSecUserTypeDEModel() {
        if(this.orgSecUserTypeDEModel==null) {
            try {
                this.orgSecUserTypeDEModel = (net.ibizsys.psrt.srv.common.demodel.OrgSecUserTypeDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.OrgSecUserTypeDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgSecUserTypeDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOrgSecUserTypeDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 部门人员关系类型
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("部门人员关系类型");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("576dd33b28a3ee34ba68561c68aa93b3","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 组织部门人员
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","576dd33b28a3ee34ba68561c68aa93b3");
        drCtrlItem2.setText("组织部门人员");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","576dd33b28a3ee34ba68561c68aa93b3");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID");
        //添加 组织人员
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","576dd33b28a3ee34ba68561c68aa93b3");
        drCtrlItem3.setText("组织人员");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","576dd33b28a3ee34ba68561c68aa93b3");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_ORGUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID");
    }
}