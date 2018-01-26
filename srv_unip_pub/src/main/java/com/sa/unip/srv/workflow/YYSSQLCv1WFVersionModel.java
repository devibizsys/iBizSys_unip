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
 * 饮用水申请流程 v1 流程模型
 */
public class YYSSQLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 实体操作处理
     */
    class P0WFProcessModel extends WFDEActionProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("6EC1E8CA-1FC5-415A-99E0-B379F25344D7");
            this.setName("更新结束状态值");
            this.setLeftPos(880);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("YYSSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("YYSSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 开始处理
     */
    class P1WFProcessModel extends WFStartProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("515F18D2-39AA-4E92-89AB-9257479CAA7D");
            this.setName("提交");
            this.setLeftPos(45);
            this.setTopPos(95);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P2WFProcessModel extends WFInteractiveProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("B7969E04-190A-462B-8D8A-F0CC17D46B2F");
            this.setName("承办处领导审核");
            this.setLeftPos(500);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("9A78A8BB-6381-421D-BD54-B4046CD7DC7C");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("D3C3A44D-1023-42C5-81F1-968E48F4607C");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 交互处理
     */
    class P3WFProcessModel extends WFInteractiveProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("20415737-677D-43BD-87ED-DFAC4BC7F35D");
            this.setName("部门领导审核");
            this.setLeftPos(200);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("727C33C4-1288-4936-B256-90CB1BDF89CC");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("D571EF1F-38CB-4F09-9FAD-4B4DDD96A35C");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P4WFProcessModel extends WFDEActionProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("C9EFB117-E2F1-479A-B5AD-C8959C34FF34");
            this.setName("拒绝");
            this.setLeftPos(300);
            this.setTopPos(300);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("YYSSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("YYSSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 结束处理
     */
    class P5WFProcessModel extends WFEndProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("2BCCEC37-DA5D-4BA5-A4B8-20157BCD4DD8");
            this.setName("结束");
            this.setLeftPos(360);
            this.setTopPos(480);
            this.setThreadSN(-1);
        }
    }

//定义流程连接
    /**
     * 交互处理
     */
    class P0WFLinkModel extends WFInteractiveLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("D5BD1154-3CE4-4B8B-8F8D-676824371CB8");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C9EFB117-E2F1-479A-B5AD-C8959C34FF34");
            //部门领导审核
            this.setFrom("20415737-677D-43BD-87ED-DFAC4BC7F35D");
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
            this.setId("DEBEC0B2-1059-4AE3-A84F-7D04E4EA7CD3");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处领导审核
            this.setNext("B7969E04-190A-462B-8D8A-F0CC17D46B2F");
            //部门领导审核
            this.setFrom("20415737-677D-43BD-87ED-DFAC4BC7F35D");
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
            this.setId("5E65B461-39C6-4C9C-BA77-037E7E07FF72");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("20415737-677D-43BD-87ED-DFAC4BC7F35D");
            //提交
            this.setFrom("515F18D2-39AA-4E92-89AB-9257479CAA7D");
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
    class P3WFLinkModel extends WFRouteLinkModelBase {
        public P3WFLinkModel() {
            super();
            this.setId("50E4846A-02AB-4AA2-B613-940517957BE3");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("2BCCEC37-DA5D-4BA5-A4B8-20157BCD4DD8");
            //更新结束状态值
            this.setFrom("6EC1E8CA-1FC5-415A-99E0-B379F25344D7");
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
    class P4WFLinkModel extends WFInteractiveLinkModelBase {
        public P4WFLinkModel() {
            super();
            this.setId("A7CBD790-C4D5-4EAC-80A5-0013BE85DA74");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C9EFB117-E2F1-479A-B5AD-C8959C34FF34");
            //承办处领导审核
            this.setFrom("B7969E04-190A-462B-8D8A-F0CC17D46B2F");
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
    class P5WFLinkModel extends WFInteractiveLinkModelBase {
        public P5WFLinkModel() {
            super();
            this.setId("3ECA652F-1A6B-4B19-B6ED-279E8AFB5B9C");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("6EC1E8CA-1FC5-415A-99E0-B379F25344D7");
            //承办处领导审核
            this.setFrom("B7969E04-190A-462B-8D8A-F0CC17D46B2F");
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
    class P6WFLinkModel extends WFRouteLinkModelBase {
        public P6WFLinkModel() {
            super();
            this.setId("7D25784E-385D-4418-8798-86D14F7D8AEB");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("2BCCEC37-DA5D-4BA5-A4B8-20157BCD4DD8");
            //拒绝
            this.setFrom("C9EFB117-E2F1-479A-B5AD-C8959C34FF34");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }




    public YYSSQLCv1WFVersionModel() {
        super();

        this.setId("515F18D2-39AA-4E92-89AB-9257479CAA7D");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 更新结束状态值
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 提交
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 承办处领导审核
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 部门领导审核
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 拒绝
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 结束
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 AC1020
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC1010
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 提交
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 结束
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 AC2020
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        //注册处理 AC2010
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