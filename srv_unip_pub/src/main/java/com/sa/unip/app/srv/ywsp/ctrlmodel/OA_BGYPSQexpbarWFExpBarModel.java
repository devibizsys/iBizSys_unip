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
 * 实体[办公用品申请]流程导航栏[expbar]部件模型
 */
public class  OA_BGYPSQexpbarWFExpBarModel extends net.ibizsys.pswf.ctrlmodel.WFExpBarModelBase {

    public OA_BGYPSQexpbarWFExpBarModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setWFModel(this.getViewController().getSystemModel().getWFModel("DE0E3BE2-18D6-45AF-8D11-B57FE2335985"));
        super.onInit();
    }


    private com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel oA_BGYPSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel getOA_BGYPSQDEModel() {
        if(this.oA_BGYPSQDEModel==null) {
            try {
                this.oA_BGYPSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_BGYPSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_BGYPSQDEModel();
    }


    /**
     * 准备导航栏根节点
     * @param expBarRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(ExpBarRootItem expBarRootItem) throws Exception {
        //添加 我的办公用品申请
        ExpBarItem expBarItem0 = expBarRootItem.addItem("MY","");
        expBarItem0.setText("我的办公用品申请");
        expBarItem0.setExpViewId("BGYPSQLC:D");
        expBarItem0.setTextLanResTag("");
        //添加 未提交
        ExpBarItem expBarItem1 = expBarRootItem.addItem("MY:10","MY");
        expBarItem1.setText("未提交");
        expBarItem1.setExpViewId("BGYPSQLC:D:10");
        expBarItem1.setTextLanResTag("");
        expBarItem1.setViewParam("srfwfudstate","10");
        //添加 流程中
        ExpBarItem expBarItem2 = expBarRootItem.addItem("MY:20","MY");
        expBarItem2.setText("流程中");
        expBarItem2.setExpViewId("BGYPSQLC:D:20");
        expBarItem2.setCounterId("S");
        expBarItem2.setCounterMode(0);
        expBarItem2.setTextLanResTag("");
        expBarItem2.setViewParam("srfwfudstate","20");
        //添加 部门领导审核
        ExpBarItem expBarItem3 = expBarRootItem.addItem("MY:20:10","MY:20");
        expBarItem3.setText("部门领导审核");
        expBarItem3.setExpViewId("BGYPSQLC:D:20:10");
        expBarItem3.setCounterId("S10");
        expBarItem3.setCounterMode(0);
        expBarItem3.setTextLanResTag("");
        expBarItem3.setViewParam("srfwfstep","10");
        expBarItem3.setViewParam("srfwfudstate","20");
        //添加 承办处领导审核
        ExpBarItem expBarItem4 = expBarRootItem.addItem("MY:20:20","MY:20");
        expBarItem4.setText("承办处领导审核");
        expBarItem4.setExpViewId("BGYPSQLC:D:20:20");
        expBarItem4.setCounterId("S20");
        expBarItem4.setCounterMode(0);
        expBarItem4.setTextLanResTag("");
        expBarItem4.setViewParam("srfwfstep","20");
        expBarItem4.setViewParam("srfwfudstate","20");
        //添加 已完成
        ExpBarItem expBarItem5 = expBarRootItem.addItem("MY:30","MY");
        expBarItem5.setText("已完成");
        expBarItem5.setExpViewId("BGYPSQLC:D:30");
        expBarItem5.setTextLanResTag("");
        expBarItem5.setViewParam("srfwfudstate","30");
        //添加 已拒绝
        ExpBarItem expBarItem6 = expBarRootItem.addItem("MY:40","MY");
        expBarItem6.setText("已拒绝");
        expBarItem6.setExpViewId("BGYPSQLC:D:40");
        expBarItem6.setTextLanResTag("");
        expBarItem6.setViewParam("srfwfudstate","40");
        //添加 我的工作
        ExpBarItem expBarItem7 = expBarRootItem.addItem("MYWFWORK","");
        expBarItem7.setText("我的工作");
        expBarItem7.setExpViewId("BGYPSQLC:W");
        expBarItem7.setCounterId("V");
        expBarItem7.setCounterMode(0);
        expBarItem7.setTextLanResTag("");
        //添加 部门领导审核
        ExpBarItem expBarItem8 = expBarRootItem.addItem("MYWFWORK:10","MYWFWORK");
        expBarItem8.setText("部门领导审核");
        expBarItem8.setExpViewId("BGYPSQLC:W:10");
        expBarItem8.setCounterId("V10");
        expBarItem8.setCounterMode(1);
        expBarItem8.setTextLanResTag("");
        expBarItem8.setViewParam("srfwfstep","10");
        //添加 承办处领导审核
        ExpBarItem expBarItem9 = expBarRootItem.addItem("MYWFWORK:20","MYWFWORK");
        expBarItem9.setText("承办处领导审核");
        expBarItem9.setExpViewId("BGYPSQLC:W:20");
        expBarItem9.setCounterId("V20");
        expBarItem9.setCounterMode(1);
        expBarItem9.setTextLanResTag("");
        expBarItem9.setViewParam("srfwfstep","20");
    }
}