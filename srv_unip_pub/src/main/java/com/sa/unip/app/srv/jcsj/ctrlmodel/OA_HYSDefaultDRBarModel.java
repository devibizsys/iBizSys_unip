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
 * 实体[会议室]数据关系栏[drbar]部件模型
 */
public class  OA_HYSDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OA_HYSDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private com.sa.unip.srv.jcsj.demodel.OA_HYSDEModel oA_HYSDEModel;
    protected  com.sa.unip.srv.jcsj.demodel.OA_HYSDEModel getOA_HYSDEModel() {
        if(this.oA_HYSDEModel==null) {
            try {
                this.oA_HYSDEModel = (com.sa.unip.srv.jcsj.demodel.OA_HYSDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_HYSDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_HYSDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_HYSDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 会议室
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("会议室");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("DE.LNAME.OA_HYS");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("8919f057dd97c6ac882a2d23420be1a3","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 院办会议申请
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","8919f057dd97c6ac882a2d23420be1a3");
        drCtrlItem2.setText("院办会议申请");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","8919f057dd97c6ac882a2d23420be1a3");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID");
        //添加 内设机构会议申请
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","8919f057dd97c6ac882a2d23420be1a3");
        drCtrlItem3.setText("内设机构会议申请");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","8919f057dd97c6ac882a2d23420be1a3");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_OA_NSJGHYSQ_OA_HYS_HYSID");
    }
}