/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.ywsp.ctrlmodel;


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

import net.ibizsys.paas.control.expbar.ExpBarItem;
import net.ibizsys.paas.control.expbar.ExpBarRootItem;

/**
 * 实体[内设机构会议申请]流程导航栏[expbar]部件模型
 */
public class  OA_NSJGHYSQexpbarWFExpBarModel extends net.ibizsys.pswf.ctrlmodel.WFExpBarModelBase {

    public OA_NSJGHYSQexpbarWFExpBarModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setWFModel(this.getViewController().getSystemModel().getWFModel("0A378005-5F3C-4BEB-ADE2-6D3E1ABC441B"));
        super.onInit();
    }


    private com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel oA_NSJGHYSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel getOA_NSJGHYSQDEModel() {
        if(this.oA_NSJGHYSQDEModel==null) {
            try {
                this.oA_NSJGHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_NSJGHYSQDEModel();
    }


    /**
     * 准备导航栏根节点
     * @param expBarRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(ExpBarRootItem expBarRootItem) throws Exception {
        //添加 我的内设机构会议申请
        ExpBarItem expBarItem0 = expBarRootItem.addItem("MY","");
        expBarItem0.setText("我的内设机构会议申请");
        expBarItem0.setExpViewId("NSJGHYSQ:D");
        expBarItem0.setTextLanResTag("");
        //添加 未提交
        ExpBarItem expBarItem1 = expBarRootItem.addItem("MY:10","MY");
        expBarItem1.setText("未提交");
        expBarItem1.setExpViewId("NSJGHYSQ:D:10");
        expBarItem1.setTextLanResTag("");
        expBarItem1.setViewParam("srfwfudstate","10");
        //添加 流程中
        ExpBarItem expBarItem2 = expBarRootItem.addItem("MY:20","MY");
        expBarItem2.setText("流程中");
        expBarItem2.setExpViewId("NSJGHYSQ:D:20");
        expBarItem2.setCounterId("S");
        expBarItem2.setCounterMode(0);
        expBarItem2.setTextLanResTag("");
        expBarItem2.setViewParam("srfwfudstate","20");
        //添加 参会领导审核
        ExpBarItem expBarItem3 = expBarRootItem.addItem("MY:20:10","MY:20");
        expBarItem3.setText("参会领导审核");
        expBarItem3.setExpViewId("NSJGHYSQ:D:20:10");
        expBarItem3.setCounterId("S10");
        expBarItem3.setCounterMode(0);
        expBarItem3.setTextLanResTag("");
        expBarItem3.setViewParam("srfwfstep","10");
        expBarItem3.setViewParam("srfwfudstate","20");
        //添加 承办处室负责人审核
        ExpBarItem expBarItem4 = expBarRootItem.addItem("MY:20:20","MY:20");
        expBarItem4.setText("承办处室负责人审核");
        expBarItem4.setExpViewId("NSJGHYSQ:D:20:20");
        expBarItem4.setCounterId("S20");
        expBarItem4.setCounterMode(0);
        expBarItem4.setTextLanResTag("");
        expBarItem4.setViewParam("srfwfstep","20");
        expBarItem4.setViewParam("srfwfudstate","20");
        //添加 秘书处审核
        ExpBarItem expBarItem5 = expBarRootItem.addItem("MY:20:30","MY:20");
        expBarItem5.setText("秘书处审核");
        expBarItem5.setExpViewId("NSJGHYSQ:D:20:30");
        expBarItem5.setCounterId("S30");
        expBarItem5.setCounterMode(0);
        expBarItem5.setTextLanResTag("");
        expBarItem5.setViewParam("srfwfstep","30");
        expBarItem5.setViewParam("srfwfudstate","20");
        //添加 院办负责人审核
        ExpBarItem expBarItem6 = expBarRootItem.addItem("MY:20:40","MY:20");
        expBarItem6.setText("院办负责人审核");
        expBarItem6.setExpViewId("NSJGHYSQ:D:20:40");
        expBarItem6.setCounterId("S40");
        expBarItem6.setCounterMode(0);
        expBarItem6.setTextLanResTag("");
        expBarItem6.setViewParam("srfwfstep","40");
        expBarItem6.setViewParam("srfwfudstate","20");
        //添加 已完成
        ExpBarItem expBarItem7 = expBarRootItem.addItem("MY:30","MY");
        expBarItem7.setText("已完成");
        expBarItem7.setExpViewId("NSJGHYSQ:D:30");
        expBarItem7.setTextLanResTag("");
        expBarItem7.setViewParam("srfwfudstate","30");
        //添加 已取消
        ExpBarItem expBarItem8 = expBarRootItem.addItem("MY:40","MY");
        expBarItem8.setText("已取消");
        expBarItem8.setExpViewId("NSJGHYSQ:D:40");
        expBarItem8.setTextLanResTag("");
        expBarItem8.setViewParam("srfwfudstate","40");
        //添加 已拒绝
        ExpBarItem expBarItem9 = expBarRootItem.addItem("MY:50","MY");
        expBarItem9.setText("已拒绝");
        expBarItem9.setExpViewId("NSJGHYSQ:D:50");
        expBarItem9.setTextLanResTag("");
        expBarItem9.setViewParam("srfwfudstate","50");
        //添加 我的工作
        ExpBarItem expBarItem10 = expBarRootItem.addItem("MYWFWORK","");
        expBarItem10.setText("我的工作");
        expBarItem10.setExpViewId("NSJGHYSQ:W");
        expBarItem10.setCounterId("V");
        expBarItem10.setCounterMode(0);
        expBarItem10.setTextLanResTag("");
        //添加 参会领导审核
        ExpBarItem expBarItem11 = expBarRootItem.addItem("MYWFWORK:10","MYWFWORK");
        expBarItem11.setText("参会领导审核");
        expBarItem11.setExpViewId("NSJGHYSQ:W:10");
        expBarItem11.setCounterId("V10");
        expBarItem11.setCounterMode(1);
        expBarItem11.setTextLanResTag("");
        expBarItem11.setViewParam("srfwfstep","10");
        //添加 承办处室负责人审核
        ExpBarItem expBarItem12 = expBarRootItem.addItem("MYWFWORK:20","MYWFWORK");
        expBarItem12.setText("承办处室负责人审核");
        expBarItem12.setExpViewId("NSJGHYSQ:W:20");
        expBarItem12.setCounterId("V20");
        expBarItem12.setCounterMode(1);
        expBarItem12.setTextLanResTag("");
        expBarItem12.setViewParam("srfwfstep","20");
        //添加 秘书处审核
        ExpBarItem expBarItem13 = expBarRootItem.addItem("MYWFWORK:30","MYWFWORK");
        expBarItem13.setText("秘书处审核");
        expBarItem13.setExpViewId("NSJGHYSQ:W:30");
        expBarItem13.setCounterId("V30");
        expBarItem13.setCounterMode(1);
        expBarItem13.setTextLanResTag("");
        expBarItem13.setViewParam("srfwfstep","30");
        //添加 院办负责人审核
        ExpBarItem expBarItem14 = expBarRootItem.addItem("MYWFWORK:40","MYWFWORK");
        expBarItem14.setText("院办负责人审核");
        expBarItem14.setExpViewId("NSJGHYSQ:W:40");
        expBarItem14.setCounterId("V40");
        expBarItem14.setCounterMode(1);
        expBarItem14.setTextLanResTag("");
        expBarItem14.setViewParam("srfwfstep","40");
    }
}