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
 * 实体[设备维修]流程导航栏[expbar]部件模型
 */
public class  OA_SBWXexpbarWFExpBarModel extends net.ibizsys.pswf.ctrlmodel.WFExpBarModelBase {

    public OA_SBWXexpbarWFExpBarModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setWFModel(this.getViewController().getSystemModel().getWFModel("EAF48546-27E1-44CE-BB9D-3660F92B6A39"));
        super.onInit();
    }


    private com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel oA_SBWXDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel getOA_SBWXDEModel() {
        if(this.oA_SBWXDEModel==null) {
            try {
                this.oA_SBWXDEModel = (com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_SBWXDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_SBWXDEModel();
    }


    /**
     * 准备导航栏根节点
     * @param expBarRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(ExpBarRootItem expBarRootItem) throws Exception {
        //添加 我的设备维修
        ExpBarItem expBarItem0 = expBarRootItem.addItem("MY","");
        expBarItem0.setText("我的设备维修");
        expBarItem0.setExpViewId("SBWXLC:D");
        expBarItem0.setTextLanResTag("");
        //添加 未提交
        ExpBarItem expBarItem1 = expBarRootItem.addItem("MY:10","MY");
        expBarItem1.setText("未提交");
        expBarItem1.setExpViewId("SBWXLC:D:10");
        expBarItem1.setTextLanResTag("");
        expBarItem1.setViewParam("srfwfudstate","10");
        //添加 流程中
        ExpBarItem expBarItem2 = expBarRootItem.addItem("MY:20","MY");
        expBarItem2.setText("流程中");
        expBarItem2.setExpViewId("SBWXLC:D:20");
        expBarItem2.setCounterId("S");
        expBarItem2.setCounterMode(0);
        expBarItem2.setTextLanResTag("");
        expBarItem2.setViewParam("srfwfudstate","20");
        //添加 部门领导审核
        ExpBarItem expBarItem3 = expBarRootItem.addItem("MY:20:10","MY:20");
        expBarItem3.setText("部门领导审核");
        expBarItem3.setExpViewId("SBWXLC:D:20:10");
        expBarItem3.setCounterId("S10");
        expBarItem3.setCounterMode(0);
        expBarItem3.setTextLanResTag("");
        expBarItem3.setViewParam("srfwfstep","10");
        expBarItem3.setViewParam("srfwfudstate","20");
        //添加 资产管理处审核
        ExpBarItem expBarItem4 = expBarRootItem.addItem("MY:20:20","MY:20");
        expBarItem4.setText("资产管理处审核");
        expBarItem4.setExpViewId("SBWXLC:D:20:20");
        expBarItem4.setCounterId("S20");
        expBarItem4.setCounterMode(0);
        expBarItem4.setTextLanResTag("");
        expBarItem4.setViewParam("srfwfstep","20");
        expBarItem4.setViewParam("srfwfudstate","20");
        //添加 已完成
        ExpBarItem expBarItem5 = expBarRootItem.addItem("MY:30","MY");
        expBarItem5.setText("已完成");
        expBarItem5.setExpViewId("SBWXLC:D:30");
        expBarItem5.setTextLanResTag("");
        expBarItem5.setViewParam("srfwfudstate","30");
        //添加 已取消
        ExpBarItem expBarItem6 = expBarRootItem.addItem("MY:40","MY");
        expBarItem6.setText("已取消");
        expBarItem6.setExpViewId("SBWXLC:D:40");
        expBarItem6.setTextLanResTag("");
        expBarItem6.setViewParam("srfwfudstate","40");
        //添加 已拒绝
        ExpBarItem expBarItem7 = expBarRootItem.addItem("MY:50","MY");
        expBarItem7.setText("已拒绝");
        expBarItem7.setExpViewId("SBWXLC:D:50");
        expBarItem7.setTextLanResTag("");
        expBarItem7.setViewParam("srfwfudstate","50");
        //添加 我的工作
        ExpBarItem expBarItem8 = expBarRootItem.addItem("MYWFWORK","");
        expBarItem8.setText("我的工作");
        expBarItem8.setExpViewId("SBWXLC:W");
        expBarItem8.setCounterId("V");
        expBarItem8.setCounterMode(0);
        expBarItem8.setTextLanResTag("");
        //添加 部门领导审核
        ExpBarItem expBarItem9 = expBarRootItem.addItem("MYWFWORK:10","MYWFWORK");
        expBarItem9.setText("部门领导审核");
        expBarItem9.setExpViewId("SBWXLC:W:10");
        expBarItem9.setCounterId("V10");
        expBarItem9.setCounterMode(1);
        expBarItem9.setTextLanResTag("");
        expBarItem9.setViewParam("srfwfstep","10");
        //添加 资产管理处审核
        ExpBarItem expBarItem10 = expBarRootItem.addItem("MYWFWORK:20","MYWFWORK");
        expBarItem10.setText("资产管理处审核");
        expBarItem10.setExpViewId("SBWXLC:W:20");
        expBarItem10.setCounterId("V20");
        expBarItem10.setCounterMode(1);
        expBarItem10.setTextLanResTag("");
        expBarItem10.setViewParam("srfwfstep","20");
    }
}