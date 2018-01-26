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
 * 实体[会议申请]流程导航栏[expbar]部件模型
 */
public class  OA_YBHYSQexpbarWFExpBarModel extends net.ibizsys.pswf.ctrlmodel.WFExpBarModelBase {

    public OA_YBHYSQexpbarWFExpBarModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setWFModel(this.getViewController().getSystemModel().getWFModel("8202F292-D8BD-4FA8-B9C3-7948EEFCC24D"));
        super.onInit();
    }


    private com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel oA_YBHYSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel getOA_YBHYSQDEModel() {
        if(this.oA_YBHYSQDEModel==null) {
            try {
                this.oA_YBHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_YBHYSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_YBHYSQDEModel();
    }


    /**
     * 准备导航栏根节点
     * @param expBarRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(ExpBarRootItem expBarRootItem) throws Exception {
        //添加 我的工作
        ExpBarItem expBarItem0 = expBarRootItem.addItem("MYWFWORK","");
        expBarItem0.setText("我的工作");
        expBarItem0.setExpViewId("YBHYSQ:W");
        expBarItem0.setCounterId("V");
        expBarItem0.setCounterMode(0);
        expBarItem0.setTextLanResTag("");
        //添加 各单位反馈参会名单
        ExpBarItem expBarItem1 = expBarRootItem.addItem("MYWFWORK:10","MYWFWORK");
        expBarItem1.setText("各单位反馈参会名单");
        expBarItem1.setExpViewId("YBHYSQ:W:10");
        expBarItem1.setCounterId("V10");
        expBarItem1.setCounterMode(1);
        expBarItem1.setTextLanResTag("");
        expBarItem1.setViewParam("srfwfstep","10");
        //添加 会议室申请
        ExpBarItem expBarItem2 = expBarRootItem.addItem("MYWFWORK:20","MYWFWORK");
        expBarItem2.setText("会议室申请");
        expBarItem2.setExpViewId("YBHYSQ:W:20");
        expBarItem2.setCounterId("V20");
        expBarItem2.setCounterMode(1);
        expBarItem2.setTextLanResTag("");
        expBarItem2.setViewParam("srfwfstep","20");
        //添加 编制座位图
        ExpBarItem expBarItem3 = expBarRootItem.addItem("MYWFWORK:30","MYWFWORK");
        expBarItem3.setText("编制座位图");
        expBarItem3.setExpViewId("YBHYSQ:W:30");
        expBarItem3.setCounterId("V30");
        expBarItem3.setCounterMode(1);
        expBarItem3.setTextLanResTag("");
        expBarItem3.setViewParam("srfwfstep","30");
        //添加 参会人员对号入座
        ExpBarItem expBarItem4 = expBarRootItem.addItem("MYWFWORK:40","MYWFWORK");
        expBarItem4.setText("参会人员对号入座");
        expBarItem4.setExpViewId("YBHYSQ:W:40");
        expBarItem4.setCounterId("V40");
        expBarItem4.setCounterMode(1);
        expBarItem4.setTextLanResTag("");
        expBarItem4.setViewParam("srfwfstep","40");
        //添加 会情况通报
        ExpBarItem expBarItem5 = expBarRootItem.addItem("MYWFWORK:50","MYWFWORK");
        expBarItem5.setText("会情况通报");
        expBarItem5.setExpViewId("YBHYSQ:W:50");
        expBarItem5.setCounterId("V50");
        expBarItem5.setCounterMode(1);
        expBarItem5.setTextLanResTag("");
        expBarItem5.setViewParam("srfwfstep","50");
        //添加 我的会议申请
        ExpBarItem expBarItem6 = expBarRootItem.addItem("MY","");
        expBarItem6.setText("我的会议申请");
        expBarItem6.setExpViewId("YBHYSQ:D");
        expBarItem6.setTextLanResTag("");
        //添加 未提交
        ExpBarItem expBarItem7 = expBarRootItem.addItem("MY:10","MY");
        expBarItem7.setText("未提交");
        expBarItem7.setExpViewId("YBHYSQ:D:10");
        expBarItem7.setTextLanResTag("");
        expBarItem7.setViewParam("srfwfudstate","10");
        //添加 流程中
        ExpBarItem expBarItem8 = expBarRootItem.addItem("MY:20","MY");
        expBarItem8.setText("流程中");
        expBarItem8.setExpViewId("YBHYSQ:D:20");
        expBarItem8.setCounterId("S");
        expBarItem8.setCounterMode(0);
        expBarItem8.setTextLanResTag("");
        expBarItem8.setViewParam("srfwfudstate","20");
        //添加 各单位反馈参会名单
        ExpBarItem expBarItem9 = expBarRootItem.addItem("MY:20:10","MY:20");
        expBarItem9.setText("各单位反馈参会名单");
        expBarItem9.setExpViewId("YBHYSQ:D:20:10");
        expBarItem9.setCounterId("S10");
        expBarItem9.setCounterMode(0);
        expBarItem9.setTextLanResTag("");
        expBarItem9.setViewParam("srfwfstep","10");
        expBarItem9.setViewParam("srfwfudstate","20");
        //添加 会议室申请
        ExpBarItem expBarItem10 = expBarRootItem.addItem("MY:20:20","MY:20");
        expBarItem10.setText("会议室申请");
        expBarItem10.setExpViewId("YBHYSQ:D:20:20");
        expBarItem10.setCounterId("S20");
        expBarItem10.setCounterMode(0);
        expBarItem10.setTextLanResTag("");
        expBarItem10.setViewParam("srfwfstep","20");
        expBarItem10.setViewParam("srfwfudstate","20");
        //添加 编制座位图
        ExpBarItem expBarItem11 = expBarRootItem.addItem("MY:20:30","MY:20");
        expBarItem11.setText("编制座位图");
        expBarItem11.setExpViewId("YBHYSQ:D:20:30");
        expBarItem11.setCounterId("S30");
        expBarItem11.setCounterMode(0);
        expBarItem11.setTextLanResTag("");
        expBarItem11.setViewParam("srfwfstep","30");
        expBarItem11.setViewParam("srfwfudstate","20");
        //添加 参会人员对号入座
        ExpBarItem expBarItem12 = expBarRootItem.addItem("MY:20:40","MY:20");
        expBarItem12.setText("参会人员对号入座");
        expBarItem12.setExpViewId("YBHYSQ:D:20:40");
        expBarItem12.setCounterId("S40");
        expBarItem12.setCounterMode(0);
        expBarItem12.setTextLanResTag("");
        expBarItem12.setViewParam("srfwfstep","40");
        expBarItem12.setViewParam("srfwfudstate","20");
        //添加 会情况通报
        ExpBarItem expBarItem13 = expBarRootItem.addItem("MY:20:50","MY:20");
        expBarItem13.setText("会情况通报");
        expBarItem13.setExpViewId("YBHYSQ:D:20:50");
        expBarItem13.setCounterId("S50");
        expBarItem13.setCounterMode(0);
        expBarItem13.setTextLanResTag("");
        expBarItem13.setViewParam("srfwfstep","50");
        expBarItem13.setViewParam("srfwfudstate","20");
        //添加 已完成
        ExpBarItem expBarItem14 = expBarRootItem.addItem("MY:30","MY");
        expBarItem14.setText("已完成");
        expBarItem14.setExpViewId("YBHYSQ:D:30");
        expBarItem14.setTextLanResTag("");
        expBarItem14.setViewParam("srfwfudstate","30");
        //添加 已取消
        ExpBarItem expBarItem15 = expBarRootItem.addItem("MY:40","MY");
        expBarItem15.setText("已取消");
        expBarItem15.setExpViewId("YBHYSQ:D:40");
        expBarItem15.setTextLanResTag("");
        expBarItem15.setViewParam("srfwfudstate","40");
        //添加 已拒绝
        ExpBarItem expBarItem16 = expBarRootItem.addItem("MY:50","MY");
        expBarItem16.setText("已拒绝");
        expBarItem16.setExpViewId("YBHYSQ:D:50");
        expBarItem16.setTextLanResTag("");
        expBarItem16.setViewParam("srfwfudstate","50");
    }
}