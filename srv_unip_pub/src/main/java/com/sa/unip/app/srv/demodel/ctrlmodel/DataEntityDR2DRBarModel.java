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
 * 实体[实体]数据关系栏[drbar]部件模型
 */
public class  DataEntityDR2DRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public DataEntityDR2DRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.demodel.demodel.DataEntityDEModel dataEntityDEModel;
    protected  net.ibizsys.psrt.srv.demodel.demodel.DataEntityDEModel getDataEntityDEModel() {
        if(this.dataEntityDEModel==null) {
            try {
                this.dataEntityDEModel = (net.ibizsys.psrt.srv.demodel.demodel.DataEntityDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.demodel.demodel.DataEntityDEModel");
            } catch(Exception ex) {
            }
        }
        return this.dataEntityDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getDataEntityDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 实体
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("实体");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("0cbbb4ccda4e86a9e6f16ed5f3a171c2","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 实体
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem2.setText("实体");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_DATAENTITY_DATAENTITY_DER11DEID");
        //添加 实体查询模型
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem3.setText("实体查询模型");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_QUERYMODEL_DATAENTITY_DEID");
        //添加 代码表
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem4.setText("代码表");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_CODELIST_DATAENTITY_DEID");
        //添加 数据对象能力
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem5.setText("数据对象能力");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","0cbbb4ccda4e86a9e6f16ed5f3a171c2");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_USERROLEDATA_DATAENTITY_DEID");
    }
}