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
 * 实体[请休假]流程导航栏[expbar]部件模型
 */
public class  OA_QXJexpbarWFExpBarModel extends net.ibizsys.pswf.ctrlmodel.WFExpBarModelBase {

    public OA_QXJexpbarWFExpBarModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setWFModel(this.getViewController().getSystemModel().getWFModel("88045D1E-5E70-4191-8A50-F0B3A98AE865"));
        super.onInit();
    }


    private com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel oA_QXJDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel getOA_QXJDEModel() {
        if(this.oA_QXJDEModel==null) {
            try {
                this.oA_QXJDEModel = (com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_QXJDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_QXJDEModel();
    }


    /**
     * 准备导航栏根节点
     * @param expBarRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(ExpBarRootItem expBarRootItem) throws Exception {
        //添加 我的请休假
        ExpBarItem expBarItem0 = expBarRootItem.addItem("MY","");
        expBarItem0.setText("我的请休假");
        expBarItem0.setExpViewId("QXJLC:D");
        expBarItem0.setTextLanResTag("");
        //添加 未提交
        ExpBarItem expBarItem1 = expBarRootItem.addItem("MY:10","MY");
        expBarItem1.setText("未提交");
        expBarItem1.setExpViewId("QXJLC:D:10");
        expBarItem1.setTextLanResTag("");
        expBarItem1.setViewParam("srfwfudstate","10");
        //添加 流程中
        ExpBarItem expBarItem2 = expBarRootItem.addItem("MY:20","MY");
        expBarItem2.setText("流程中");
        expBarItem2.setExpViewId("QXJLC:D:20");
        expBarItem2.setCounterId("S");
        expBarItem2.setCounterMode(0);
        expBarItem2.setTextLanResTag("");
        expBarItem2.setViewParam("srfwfudstate","20");
        //添加 处室领导审核
        ExpBarItem expBarItem3 = expBarRootItem.addItem("MY:20:10","MY:20");
        expBarItem3.setText("处室领导审核");
        expBarItem3.setExpViewId("QXJLC:D:20:10");
        expBarItem3.setCounterId("S10");
        expBarItem3.setCounterMode(0);
        expBarItem3.setTextLanResTag("");
        expBarItem3.setViewParam("srfwfstep","10");
        expBarItem3.setViewParam("srfwfudstate","20");
        //添加 干部处备案审核
        ExpBarItem expBarItem4 = expBarRootItem.addItem("MY:20:20","MY:20");
        expBarItem4.setText("干部处备案审核");
        expBarItem4.setExpViewId("QXJLC:D:20:20");
        expBarItem4.setCounterId("S20");
        expBarItem4.setCounterMode(0);
        expBarItem4.setTextLanResTag("");
        expBarItem4.setViewParam("srfwfstep","20");
        expBarItem4.setViewParam("srfwfudstate","20");
        //添加 院领导审批
        ExpBarItem expBarItem5 = expBarRootItem.addItem("MY:20:30","MY:20");
        expBarItem5.setText("院领导审批");
        expBarItem5.setExpViewId("QXJLC:D:20:30");
        expBarItem5.setCounterId("S30");
        expBarItem5.setCounterMode(0);
        expBarItem5.setTextLanResTag("");
        expBarItem5.setViewParam("srfwfstep","30");
        expBarItem5.setViewParam("srfwfudstate","20");
        //添加 已完成
        ExpBarItem expBarItem6 = expBarRootItem.addItem("MY:30","MY");
        expBarItem6.setText("已完成");
        expBarItem6.setExpViewId("QXJLC:D:30");
        expBarItem6.setTextLanResTag("");
        expBarItem6.setViewParam("srfwfudstate","30");
        //添加 已拒绝
        ExpBarItem expBarItem7 = expBarRootItem.addItem("MY:40","MY");
        expBarItem7.setText("已拒绝");
        expBarItem7.setExpViewId("QXJLC:D:40");
        expBarItem7.setTextLanResTag("");
        expBarItem7.setViewParam("srfwfudstate","40");
        //添加 我的工作
        ExpBarItem expBarItem8 = expBarRootItem.addItem("MYWFWORK","");
        expBarItem8.setText("我的工作");
        expBarItem8.setExpViewId("QXJLC:W");
        expBarItem8.setCounterId("V");
        expBarItem8.setCounterMode(0);
        expBarItem8.setTextLanResTag("");
        //添加 处室领导审核
        ExpBarItem expBarItem9 = expBarRootItem.addItem("MYWFWORK:10","MYWFWORK");
        expBarItem9.setText("处室领导审核");
        expBarItem9.setExpViewId("QXJLC:W:10");
        expBarItem9.setCounterId("V10");
        expBarItem9.setCounterMode(1);
        expBarItem9.setTextLanResTag("");
        expBarItem9.setViewParam("srfwfstep","10");
        //添加 干部处备案审核
        ExpBarItem expBarItem10 = expBarRootItem.addItem("MYWFWORK:20","MYWFWORK");
        expBarItem10.setText("干部处备案审核");
        expBarItem10.setExpViewId("QXJLC:W:20");
        expBarItem10.setCounterId("V20");
        expBarItem10.setCounterMode(1);
        expBarItem10.setTextLanResTag("");
        expBarItem10.setViewParam("srfwfstep","20");
        //添加 院领导审批
        ExpBarItem expBarItem11 = expBarRootItem.addItem("MYWFWORK:30","MYWFWORK");
        expBarItem11.setText("院领导审批");
        expBarItem11.setExpViewId("QXJLC:W:30");
        expBarItem11.setCounterId("V30");
        expBarItem11.setCounterMode(1);
        expBarItem11.setTextLanResTag("");
        expBarItem11.setViewParam("srfwfstep","30");
    }
}