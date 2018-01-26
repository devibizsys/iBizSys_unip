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
 * 实体[组织部门]数据关系栏[drbar]部件模型
 */
public class  OrgSectorDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OrgSectorDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private com.sa.unip.srv.subsys.demodel.OrgSectorDEModel orgSectorDEModel;
    protected  com.sa.unip.srv.subsys.demodel.OrgSectorDEModel getOrgSectorDEModel() {
        if(this.orgSectorDEModel==null) {
            try {
                this.orgSectorDEModel = (com.sa.unip.srv.subsys.demodel.OrgSectorDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgSectorDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgSectorDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOrgSectorDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 组织部门
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("组织部门");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("63061bfdafbbd213fc0ce66d3f26419e","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 组织部门人员
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem2.setText("组织部门人员");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID");
        //添加 组织人员
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem3.setText("组织人员");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_ORGUSER_ORGSECTOR_ORGSECTORID");
        //添加 组织部门
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem4.setText("组织部门");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_ORGSECTOR_ORGSECTOR_PORGSECTORID");
        //添加 组织部门
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem5.setText("组织部门");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_ORGSECTOR_ORGSECTOR_REPORGSECTORID");
        //添加 数据对象能力
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem5","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem6.setText("数据对象能力");
        drCtrlItem6.setDRViewId("DRITEM5");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_USERROLEDATA_ORGSECTOR_DSTORGSECTORID");
        //添加 院办会议申请
        DRCtrlItem drCtrlItem7 = drCtrlRootItem.addItem("dritem6","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem7.setText("院办会议申请");
        drCtrlItem7.setDRViewId("DRITEM6");
        drCtrlItem7.setTextLanResTag("");
        drCtrlItem7.setIconPath("");
        drCtrlItem7.setIconCls("");
        drCtrlItem7.setEnableMode("ALL");
        drCtrlItem7.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem7.setViewParam("srfparenttype","DER1N");
        drCtrlItem7.setViewParam("srfder1nid","DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID");
        //添加 派车申请
        DRCtrlItem drCtrlItem8 = drCtrlRootItem.addItem("dritem7","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem8.setText("派车申请");
        drCtrlItem8.setDRViewId("DRITEM7");
        drCtrlItem8.setTextLanResTag("");
        drCtrlItem8.setIconPath("");
        drCtrlItem8.setIconCls("");
        drCtrlItem8.setEnableMode("ALL");
        drCtrlItem8.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem8.setViewParam("srfparenttype","DER1N");
        drCtrlItem8.setViewParam("srfder1nid","DER1N_OA_PCSQ_ORGSECTOR_ORGSECTORID");
        //添加 车牌门禁申请
        DRCtrlItem drCtrlItem9 = drCtrlRootItem.addItem("dritem8","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem9.setText("车牌门禁申请");
        drCtrlItem9.setDRViewId("DRITEM8");
        drCtrlItem9.setTextLanResTag("");
        drCtrlItem9.setIconPath("");
        drCtrlItem9.setIconCls("");
        drCtrlItem9.setEnableMode("ALL");
        drCtrlItem9.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem9.setViewParam("srfparenttype","DER1N");
        drCtrlItem9.setViewParam("srfder1nid","DER1N_OA_CPMJSQ_ORGSECTOR_ORGSECTORID");
        //添加 饮用水申请
        DRCtrlItem drCtrlItem10 = drCtrlRootItem.addItem("dritem9","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem10.setText("饮用水申请");
        drCtrlItem10.setDRViewId("DRITEM9");
        drCtrlItem10.setTextLanResTag("");
        drCtrlItem10.setIconPath("");
        drCtrlItem10.setIconCls("");
        drCtrlItem10.setEnableMode("ALL");
        drCtrlItem10.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem10.setViewParam("srfparenttype","DER1N");
        drCtrlItem10.setViewParam("srfder1nid","DER1N_OA_YYSSQ_ORGSECTOR_ORGSECTORID");
        //添加 采购申请
        DRCtrlItem drCtrlItem11 = drCtrlRootItem.addItem("dritem10","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem11.setText("采购申请");
        drCtrlItem11.setDRViewId("DRITEM10");
        drCtrlItem11.setTextLanResTag("");
        drCtrlItem11.setIconPath("");
        drCtrlItem11.setIconCls("");
        drCtrlItem11.setEnableMode("ALL");
        drCtrlItem11.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem11.setViewParam("srfparenttype","DER1N");
        drCtrlItem11.setViewParam("srfder1nid","DER1N_OA_CGSQ_ORGSECTOR_ORGSECTORID");
        //添加 设备维修
        DRCtrlItem drCtrlItem12 = drCtrlRootItem.addItem("dritem12","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem12.setText("设备维修");
        drCtrlItem12.setDRViewId("DRITEM12");
        drCtrlItem12.setTextLanResTag("");
        drCtrlItem12.setIconPath("");
        drCtrlItem12.setIconCls("");
        drCtrlItem12.setEnableMode("ALL");
        drCtrlItem12.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem12.setViewParam("srfparenttype","DER1N");
        drCtrlItem12.setViewParam("srfder1nid","DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID");
        //添加 知识库
        DRCtrlItem drCtrlItem13 = drCtrlRootItem.addItem("dritem13","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem13.setText("知识库");
        drCtrlItem13.setDRViewId("DRITEM13");
        drCtrlItem13.setTextLanResTag("");
        drCtrlItem13.setIconPath("");
        drCtrlItem13.setIconCls("");
        drCtrlItem13.setEnableMode("ALL");
        drCtrlItem13.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem13.setViewParam("srfparenttype","DER1N");
        drCtrlItem13.setViewParam("srfder1nid","DER1N_OA_ZSK_ORGSECTOR_ORGSECTORID");
        //添加 机票预订
        DRCtrlItem drCtrlItem14 = drCtrlRootItem.addItem("dritem14","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem14.setText("机票预订");
        drCtrlItem14.setDRViewId("DRITEM14");
        drCtrlItem14.setTextLanResTag("");
        drCtrlItem14.setIconPath("");
        drCtrlItem14.setIconCls("");
        drCtrlItem14.setEnableMode("ALL");
        drCtrlItem14.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem14.setViewParam("srfparenttype","DER1N");
        drCtrlItem14.setViewParam("srfder1nid","DER1N_OA_JPYD_ORGSECTOR_ORGSECTORID");
        //添加 车辆维修
        DRCtrlItem drCtrlItem15 = drCtrlRootItem.addItem("dritem15","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem15.setText("车辆维修");
        drCtrlItem15.setDRViewId("DRITEM15");
        drCtrlItem15.setTextLanResTag("");
        drCtrlItem15.setIconPath("");
        drCtrlItem15.setIconCls("");
        drCtrlItem15.setEnableMode("ALL");
        drCtrlItem15.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem15.setViewParam("srfparenttype","DER1N");
        drCtrlItem15.setViewParam("srfder1nid","DER1N_OA_CLWX_ORGSECTOR_ORGSECTORID");
        //添加 办公用品申请
        DRCtrlItem drCtrlItem16 = drCtrlRootItem.addItem("dritem16","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem16.setText("办公用品申请");
        drCtrlItem16.setDRViewId("DRITEM16");
        drCtrlItem16.setTextLanResTag("");
        drCtrlItem16.setIconPath("");
        drCtrlItem16.setIconCls("");
        drCtrlItem16.setEnableMode("ALL");
        drCtrlItem16.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem16.setViewParam("srfparenttype","DER1N");
        drCtrlItem16.setViewParam("srfder1nid","DER1N_OA_BGYPSQ_ORGSECTOR_ORGSECTORID");
        //添加 内设机构会议申请
        DRCtrlItem drCtrlItem17 = drCtrlRootItem.addItem("dritem11","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem17.setText("内设机构会议申请");
        drCtrlItem17.setDRViewId("DRITEM11");
        drCtrlItem17.setTextLanResTag("");
        drCtrlItem17.setIconPath("");
        drCtrlItem17.setIconCls("");
        drCtrlItem17.setEnableMode("ALL");
        drCtrlItem17.setViewParam("srfparentdeid","63061bfdafbbd213fc0ce66d3f26419e");
        drCtrlItem17.setViewParam("srfparenttype","DER1N");
        drCtrlItem17.setViewParam("srfder1nid","DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID");
    }
}