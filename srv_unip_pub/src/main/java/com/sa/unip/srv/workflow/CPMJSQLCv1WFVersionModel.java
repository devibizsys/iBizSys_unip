/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.workflow;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.annotation.Annotation;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;


import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.DynamicCodeListModelBase;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.pswf.core.IWFLinkSingleCondModel;
import net.ibizsys.pswf.core.WFStartProcessModelBase;
import net.ibizsys.pswf.core.WFEndProcessModelBase;
import net.ibizsys.pswf.core.WFInteractiveProcessModelBase;
import net.ibizsys.pswf.core.WFDEActionProcessModelBase;
import net.ibizsys.pswf.core.WFEmbedWFProcessModelBase;
import net.ibizsys.pswf.core.WFParallelSubWFProcessModelBase;
import net.ibizsys.pswf.core.WFInteractiveLinkModelBase;
import net.ibizsys.pswf.core.WFTimeoutLinkModelBase;
import net.ibizsys.pswf.core.WFRouteLinkModelBase;
import net.ibizsys.pswf.core.WFEmbedWFReturnModelBase;
import net.ibizsys.pswf.core.WFProcRoleModel;
import net.ibizsys.pswf.core.WFProcSysActorRoleModel;
import net.ibizsys.pswf.core.WFProcUDActorRoleModel;
import net.ibizsys.pswf.core.WFDEActionProcessParamModel;
import net.ibizsys.pswf.core.WFLinkGroupCondModel;
import net.ibizsys.pswf.core.WFLinkSingleCondModel;
import net.ibizsys.pswf.core.WFLinkCustomCondModel;
import net.ibizsys.pswf.core.WFProcSubWFModel;


/**
 * 车牌门禁申请流程 v1 流程模型
 */
public class CPMJSQLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 结束处理
     */
    class P0WFProcessModel extends WFEndProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("A6075272-AA3E-42BC-A8FD-680C772262DD");
            this.setName("结束");
            this.setLeftPos(380);
            this.setTopPos(520);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P1WFProcessModel extends WFInteractiveProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("5E6E6885-3134-47F9-AFEC-4AFE1C9BC52D");
            this.setName("部门领导审核");
            this.setLeftPos(280);
            this.setTopPos(40);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("0DBE555A-067F-4EE4-91C4-28A43FA733A7");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("50B28578-0888-403A-A393-BB3193BBDE7A");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P2WFProcessModel extends WFDEActionProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("E5D1C5F5-AE39-428F-8505-CD1B71C03253");
            this.setName("更新结束状态值");
            this.setLeftPos(700);
            this.setTopPos(280);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("CPMJSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("CPMJSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 实体操作处理
     */
    class P3WFProcessModel extends WFDEActionProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("42A85179-F7D0-4574-BB44-3D4919FF05D4");
            this.setName("拒绝");
            this.setLeftPos(320);
            this.setTopPos(260);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("CPMJSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("CPMJSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 开始处理
     */
    class P4WFProcessModel extends WFStartProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("B661264C-FAA2-4AC2-9EF7-2C7761F27818");
            this.setName("提交");
            this.setLeftPos(105);
            this.setTopPos(55);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P5WFProcessModel extends WFInteractiveProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("2F455EA6-CD36-438D-8D6B-ED4075BEC473");
            this.setName("承办处领导审核");
            this.setLeftPos(620);
            this.setTopPos(40);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("932850E3-4210-409D-84FE-60C80E41946D");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("B7965926-AFE5-416F-9609-9F62BECF64A6");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }

//定义流程连接
    /**
     * 交互处理
     */
    class P0WFLinkModel extends WFInteractiveLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("8CC74724-F805-40AB-8BE3-6F3AFCA8B38E");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("42A85179-F7D0-4574-BB44-3D4919FF05D4");
            //承办处领导审核
            this.setFrom("2F455EA6-CD36-438D-8D6B-ED4075BEC473");
            this.setLogicName("拒绝");
            this.setMemoField("memo");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }


    /**
     * 交互处理
     */
    class P1WFLinkModel extends WFInteractiveLinkModelBase {
        public P1WFLinkModel() {
            super();
            this.setId("5DE99D0B-6CE7-4D81-9065-876612520345");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("E5D1C5F5-AE39-428F-8505-CD1B71C03253");
            //承办处领导审核
            this.setFrom("2F455EA6-CD36-438D-8D6B-ED4075BEC473");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }


    /**
     * 路由处理
     */
    class P2WFLinkModel extends WFRouteLinkModelBase {
        public P2WFLinkModel() {
            super();
            this.setId("29AC9972-F3BB-43A6-B785-DF9052D77649");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("A6075272-AA3E-42BC-A8FD-680C772262DD");
            //拒绝
            this.setFrom("42A85179-F7D0-4574-BB44-3D4919FF05D4");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }


    /**
     * 交互处理
     */
    class P3WFLinkModel extends WFInteractiveLinkModelBase {
        public P3WFLinkModel() {
            super();
            this.setId("76070FF1-16F0-494E-8FBF-499C7E5000A5");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("42A85179-F7D0-4574-BB44-3D4919FF05D4");
            //部门领导审核
            this.setFrom("5E6E6885-3134-47F9-AFEC-4AFE1C9BC52D");
            this.setLogicName("拒绝");
            this.setMemoField("memo");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }


    /**
     * 交互处理
     */
    class P4WFLinkModel extends WFInteractiveLinkModelBase {
        public P4WFLinkModel() {
            super();
            this.setId("37216172-BCC3-4AA7-A825-76DB430BC0F4");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处领导审核
            this.setNext("2F455EA6-CD36-438D-8D6B-ED4075BEC473");
            //部门领导审核
            this.setFrom("5E6E6885-3134-47F9-AFEC-4AFE1C9BC52D");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }


    /**
     * 路由处理
     */
    class P5WFLinkModel extends WFRouteLinkModelBase {
        public P5WFLinkModel() {
            super();
            this.setId("7F4622E9-D106-4959-919C-85DFA8CFEA71");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("5E6E6885-3134-47F9-AFEC-4AFE1C9BC52D");
            //提交
            this.setFrom("B661264C-FAA2-4AC2-9EF7-2C7761F27818");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }


    /**
     * 路由处理
     */
    class P6WFLinkModel extends WFRouteLinkModelBase {
        public P6WFLinkModel() {
            super();
            this.setId("6DC51547-B6F6-4DD2-91D5-32088A62176A");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("A6075272-AA3E-42BC-A8FD-680C772262DD");
            //更新结束状态值
            this.setFrom("E5D1C5F5-AE39-428F-8505-CD1B71C03253");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }




    public CPMJSQLCv1WFVersionModel() {
        super();

        this.setId("B661264C-FAA2-4AC2-9EF7-2C7761F27818");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 结束
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 部门领导审核
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 更新结束状态值
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 拒绝
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 提交
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 承办处领导审核
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 AC2020
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC2010
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 结束
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 AC1020
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 AC1010
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        //注册处理 提交
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 结束
        P6WFLinkModel p6 = new P6WFLinkModel();
        p6.init(this);
        registerWFLinkModel(p6);

        super.prepareWFLinkModels();
    }

}