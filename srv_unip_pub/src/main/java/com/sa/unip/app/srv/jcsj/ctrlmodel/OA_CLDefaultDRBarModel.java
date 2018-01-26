/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.jcsj.ctrlmodel;


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
 * 实体[车辆]数据关系栏[drbar]部件模型
 */
public class  OA_CLDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OA_CLDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private com.sa.unip.srv.jcsj.demodel.OA_CLDEModel oA_CLDEModel;
    protected  com.sa.unip.srv.jcsj.demodel.OA_CLDEModel getOA_CLDEModel() {
        if(this.oA_CLDEModel==null) {
            try {
                this.oA_CLDEModel = (com.sa.unip.srv.jcsj.demodel.OA_CLDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_CLDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CLDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_CLDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 车辆
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("车辆");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("DE.LNAME.OA_CL");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("3d6b755c3692debb8fd539de77b21099","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 车辆维修
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","3d6b755c3692debb8fd539de77b21099");
        drCtrlItem2.setText("车辆维修");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","3d6b755c3692debb8fd539de77b21099");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_OA_CLWX_OA_CL_OA_CLID");
        //添加 派车申请
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","3d6b755c3692debb8fd539de77b21099");
        drCtrlItem3.setText("派车申请");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","3d6b755c3692debb8fd539de77b21099");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_OA_PCSQ_OA_CL_OA_CLID");
        //添加 车牌门禁申请
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","3d6b755c3692debb8fd539de77b21099");
        drCtrlItem4.setText("车牌门禁申请");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","3d6b755c3692debb8fd539de77b21099");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_OA_CPMJSQ_OA_CL_OA_CLID");
    }
}