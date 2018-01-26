/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.demodel.ctrlmodel;


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
 * 实体[实体查询模型]数据关系栏[drbar]部件模型
 */
public class  QueryModelDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public QueryModelDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.demodel.demodel.QueryModelDEModel queryModelDEModel;
    protected  net.ibizsys.psrt.srv.demodel.demodel.QueryModelDEModel getQueryModelDEModel() {
        if(this.queryModelDEModel==null) {
            try {
                this.queryModelDEModel = (net.ibizsys.psrt.srv.demodel.demodel.QueryModelDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.demodel.demodel.QueryModelDEModel");
            } catch(Exception ex) {
            }
        }
        return this.queryModelDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getQueryModelDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 实体查询模型
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("实体查询模型");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("ee650aec5d0df3c9880100dc57441146","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 数据对象能力明细
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","ee650aec5d0df3c9880100dc57441146");
        drCtrlItem2.setText("数据对象能力明细");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","ee650aec5d0df3c9880100dc57441146");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_USERROLEDATADETAIL_QUERYMODEL_QUERYMODELID");
        //添加 实体
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","ee650aec5d0df3c9880100dc57441146");
        drCtrlItem3.setText("实体");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","ee650aec5d0df3c9880100dc57441146");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_DATAENTITY_QUERYMODEL_ACQUERYMODELID");
    }
}