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
 * 实体[组织人员]数据关系栏[drbar]部件模型
 */
public class  OrgUserDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OrgUserDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private com.sa.unip.srv.subsys.demodel.OrgUserDEModel orgUserDEModel;
    protected  com.sa.unip.srv.subsys.demodel.OrgUserDEModel getOrgUserDEModel() {
        if(this.orgUserDEModel==null) {
            try {
                this.orgUserDEModel = (com.sa.unip.srv.subsys.demodel.OrgUserDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgUserDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOrgUserDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 组织人员
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("组织人员");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("1f9576cdcc6a949230c7669182c73648","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 组织部门人员
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem2.setText("组织部门人员");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_ORGSECUSER_ORGUSER_ORGUSERID");
        //添加 ORGUSER
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem3.setText("ORGUSER");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID");
        //添加 参会人员
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem4.setText("参会人员");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_OA_CHRY_ORGUSER_ORGUSERID");
        //添加 派车申请
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem5","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem5.setText("派车申请");
        drCtrlItem5.setDRViewId("DRITEM5");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_OA_PCSQ_ORGUSER_ORGUSERID");
        //添加 车牌门禁申请
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem11","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem6.setText("车牌门禁申请");
        drCtrlItem6.setDRViewId("DRITEM11");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_OA_CPMJSQ_ORGUSER_ORGUSERID");
        //添加 用餐申请
        DRCtrlItem drCtrlItem7 = drCtrlRootItem.addItem("dritem12","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem7.setText("用餐申请");
        drCtrlItem7.setDRViewId("DRITEM12");
        drCtrlItem7.setTextLanResTag("");
        drCtrlItem7.setIconPath("");
        drCtrlItem7.setIconCls("");
        drCtrlItem7.setEnableMode("ALL");
        drCtrlItem7.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem7.setViewParam("srfparenttype","DER1N");
        drCtrlItem7.setViewParam("srfder1nid","DER1N_OA_YCSQ_ORGUSER_ORGUSERID");
        //添加 食堂外卖订购
        DRCtrlItem drCtrlItem8 = drCtrlRootItem.addItem("dritem13","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem8.setText("食堂外卖订购");
        drCtrlItem8.setDRViewId("DRITEM13");
        drCtrlItem8.setTextLanResTag("");
        drCtrlItem8.setIconPath("");
        drCtrlItem8.setIconCls("");
        drCtrlItem8.setEnableMode("ALL");
        drCtrlItem8.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem8.setViewParam("srfparenttype","DER1N");
        drCtrlItem8.setViewParam("srfder1nid","DER1N_OA_STWMDG_ORGUSER_ORGUSERID");
        //添加 饮用水申请
        DRCtrlItem drCtrlItem9 = drCtrlRootItem.addItem("dritem14","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem9.setText("饮用水申请");
        drCtrlItem9.setDRViewId("DRITEM14");
        drCtrlItem9.setTextLanResTag("");
        drCtrlItem9.setIconPath("");
        drCtrlItem9.setIconCls("");
        drCtrlItem9.setEnableMode("ALL");
        drCtrlItem9.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem9.setViewParam("srfparenttype","DER1N");
        drCtrlItem9.setViewParam("srfder1nid","DER1N_OA_YYSSQ_ORGUSER_ORGUSERID");
        //添加 采购申请
        DRCtrlItem drCtrlItem10 = drCtrlRootItem.addItem("dritem15","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem10.setText("采购申请");
        drCtrlItem10.setDRViewId("DRITEM15");
        drCtrlItem10.setTextLanResTag("");
        drCtrlItem10.setIconPath("");
        drCtrlItem10.setIconCls("");
        drCtrlItem10.setEnableMode("ALL");
        drCtrlItem10.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem10.setViewParam("srfparenttype","DER1N");
        drCtrlItem10.setViewParam("srfder1nid","DER1N_OA_CGSQ_ORGUSER_ORGUSERID");
        //添加 设备维修
        DRCtrlItem drCtrlItem11 = drCtrlRootItem.addItem("dritem17","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem11.setText("设备维修");
        drCtrlItem11.setDRViewId("DRITEM17");
        drCtrlItem11.setTextLanResTag("");
        drCtrlItem11.setIconPath("");
        drCtrlItem11.setIconCls("");
        drCtrlItem11.setEnableMode("ALL");
        drCtrlItem11.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem11.setViewParam("srfparenttype","DER1N");
        drCtrlItem11.setViewParam("srfder1nid","DER1N_OA_SBWX_ORGUSER_ORGUSERID");
        //添加 知识库
        DRCtrlItem drCtrlItem12 = drCtrlRootItem.addItem("dritem18","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem12.setText("知识库");
        drCtrlItem12.setDRViewId("DRITEM18");
        drCtrlItem12.setTextLanResTag("");
        drCtrlItem12.setIconPath("");
        drCtrlItem12.setIconCls("");
        drCtrlItem12.setEnableMode("ALL");
        drCtrlItem12.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem12.setViewParam("srfparenttype","DER1N");
        drCtrlItem12.setViewParam("srfder1nid","DER1N_OA_ZSK_ORGUSER_ORGUSERID");
        //添加 请休假
        DRCtrlItem drCtrlItem13 = drCtrlRootItem.addItem("dritem19","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem13.setText("请休假");
        drCtrlItem13.setDRViewId("DRITEM19");
        drCtrlItem13.setTextLanResTag("");
        drCtrlItem13.setIconPath("");
        drCtrlItem13.setIconCls("");
        drCtrlItem13.setEnableMode("ALL");
        drCtrlItem13.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem13.setViewParam("srfparenttype","DER1N");
        drCtrlItem13.setViewParam("srfder1nid","DER1N_OA_QXJ_ORGUSER_ORGUSERID");
        //添加 出差申请
        DRCtrlItem drCtrlItem14 = drCtrlRootItem.addItem("dritem20","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem14.setText("出差申请");
        drCtrlItem14.setDRViewId("DRITEM20");
        drCtrlItem14.setTextLanResTag("");
        drCtrlItem14.setIconPath("");
        drCtrlItem14.setIconCls("");
        drCtrlItem14.setEnableMode("ALL");
        drCtrlItem14.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem14.setViewParam("srfparenttype","DER1N");
        drCtrlItem14.setViewParam("srfder1nid","DER1N_OA_CCSQ_ORGUSER_ORGUSERID");
        //添加 机票预订
        DRCtrlItem drCtrlItem15 = drCtrlRootItem.addItem("dritem4","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem15.setText("机票预订");
        drCtrlItem15.setDRViewId("DRITEM4");
        drCtrlItem15.setTextLanResTag("");
        drCtrlItem15.setIconPath("");
        drCtrlItem15.setIconCls("");
        drCtrlItem15.setEnableMode("ALL");
        drCtrlItem15.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem15.setViewParam("srfparenttype","DER1N");
        drCtrlItem15.setViewParam("srfder1nid","DER1N_OA_JPYD_ORGUSER_ORGUSERID");
        //添加 机票预订
        DRCtrlItem drCtrlItem16 = drCtrlRootItem.addItem("dritem6","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem16.setText("机票预订");
        drCtrlItem16.setDRViewId("DRITEM6");
        drCtrlItem16.setTextLanResTag("");
        drCtrlItem16.setIconPath("");
        drCtrlItem16.setIconCls("");
        drCtrlItem16.setEnableMode("ALL");
        drCtrlItem16.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem16.setViewParam("srfparenttype","DER1N");
        drCtrlItem16.setViewParam("srfder1nid","DER1N_OA_JPYD_ORGUSER_JBRID");
        //添加 车辆维修
        DRCtrlItem drCtrlItem17 = drCtrlRootItem.addItem("dritem21","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem17.setText("车辆维修");
        drCtrlItem17.setDRViewId("DRITEM21");
        drCtrlItem17.setTextLanResTag("");
        drCtrlItem17.setIconPath("");
        drCtrlItem17.setIconCls("");
        drCtrlItem17.setEnableMode("ALL");
        drCtrlItem17.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem17.setViewParam("srfparenttype","DER1N");
        drCtrlItem17.setViewParam("srfder1nid","DER1N_OA_CLWX_ORGUSER_ORGUSERID");
        //添加 办公用品申请
        DRCtrlItem drCtrlItem18 = drCtrlRootItem.addItem("dritem22","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem18.setText("办公用品申请");
        drCtrlItem18.setDRViewId("DRITEM22");
        drCtrlItem18.setTextLanResTag("");
        drCtrlItem18.setIconPath("");
        drCtrlItem18.setIconCls("");
        drCtrlItem18.setEnableMode("ALL");
        drCtrlItem18.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem18.setViewParam("srfparenttype","DER1N");
        drCtrlItem18.setViewParam("srfder1nid","DER1N_OA_BGYPSQ_ORGUSER_ORGUSERID");
        //添加 ORGUSER
        DRCtrlItem drCtrlItem19 = drCtrlRootItem.addItem("dritem23","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem19.setText("ORGUSER");
        drCtrlItem19.setDRViewId("DRITEM23");
        drCtrlItem19.setTextLanResTag("");
        drCtrlItem19.setIconPath("");
        drCtrlItem19.setIconCls("");
        drCtrlItem19.setEnableMode("ALL");
        drCtrlItem19.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem19.setViewParam("srfparenttype","DER1N");
        drCtrlItem19.setViewParam("srfder1nid","DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID");
        //添加 工作日志
        DRCtrlItem drCtrlItem20 = drCtrlRootItem.addItem("dritem16","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem20.setText("工作日志");
        drCtrlItem20.setDRViewId("DRITEM16");
        drCtrlItem20.setTextLanResTag("");
        drCtrlItem20.setIconPath("");
        drCtrlItem20.setIconCls("");
        drCtrlItem20.setEnableMode("ALL");
        drCtrlItem20.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem20.setViewParam("srfparenttype","DER1N");
        drCtrlItem20.setViewParam("srfder1nid","DER1N_OA_GZRZ_ORGUSER_ORGUSERID");
        //添加 日志人员
        DRCtrlItem drCtrlItem21 = drCtrlRootItem.addItem("dritem24","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem21.setText("日志人员");
        drCtrlItem21.setDRViewId("DRITEM24");
        drCtrlItem21.setTextLanResTag("");
        drCtrlItem21.setIconPath("");
        drCtrlItem21.setIconCls("");
        drCtrlItem21.setEnableMode("ALL");
        drCtrlItem21.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem21.setViewParam("srfparenttype","DER1N");
        drCtrlItem21.setViewParam("srfder1nid","DER1N_OA_RZRY_ORGUSER_ORGUSERID");
        //添加 通知公告
        DRCtrlItem drCtrlItem22 = drCtrlRootItem.addItem("dritem9","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem22.setText("通知公告");
        drCtrlItem22.setDRViewId("DRITEM9");
        drCtrlItem22.setTextLanResTag("");
        drCtrlItem22.setIconPath("");
        drCtrlItem22.setIconCls("");
        drCtrlItem22.setEnableMode("ALL");
        drCtrlItem22.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem22.setViewParam("srfparenttype","DER1N");
        drCtrlItem22.setViewParam("srfder1nid","DER1N_OA_TZGG_ORGUSER_ORGUSERID");
        //添加 通知公告人员
        DRCtrlItem drCtrlItem23 = drCtrlRootItem.addItem("dritem10","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem23.setText("通知公告人员");
        drCtrlItem23.setDRViewId("DRITEM10");
        drCtrlItem23.setTextLanResTag("");
        drCtrlItem23.setIconPath("");
        drCtrlItem23.setIconCls("");
        drCtrlItem23.setEnableMode("ALL");
        drCtrlItem23.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem23.setViewParam("srfparenttype","DER1N");
        drCtrlItem23.setViewParam("srfder1nid","DER1N_OA_TZGGRY_ORGUSER_ORGUSERID");
        //添加 消息
        DRCtrlItem drCtrlItem24 = drCtrlRootItem.addItem("dritem7","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem24.setText("消息");
        drCtrlItem24.setDRViewId("DRITEM7");
        drCtrlItem24.setTextLanResTag("");
        drCtrlItem24.setIconPath("");
        drCtrlItem24.setIconCls("");
        drCtrlItem24.setEnableMode("ALL");
        drCtrlItem24.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem24.setViewParam("srfparenttype","DER1N");
        drCtrlItem24.setViewParam("srfder1nid","DER1N_OA_XX_ORGUSER_ORGUSERID");
        //添加 消息人员
        DRCtrlItem drCtrlItem25 = drCtrlRootItem.addItem("dritem8","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem25.setText("消息人员");
        drCtrlItem25.setDRViewId("DRITEM8");
        drCtrlItem25.setTextLanResTag("");
        drCtrlItem25.setIconPath("");
        drCtrlItem25.setIconCls("");
        drCtrlItem25.setEnableMode("ALL");
        drCtrlItem25.setViewParam("srfparentdeid","1f9576cdcc6a949230c7669182c73648");
        drCtrlItem25.setViewParam("srfparenttype","DER1N");
        drCtrlItem25.setViewParam("srfder1nid","DER1N_OA_XXRY_ORGUSER_ORGUSERID");
    }
}