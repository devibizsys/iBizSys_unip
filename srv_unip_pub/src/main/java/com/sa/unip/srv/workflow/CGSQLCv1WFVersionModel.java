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
 * 采购申请流程 v1 流程模型
 */
public class CGSQLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 开始处理
     */
    class P0WFProcessModel extends WFStartProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("C292309F-917B-4232-8445-EAFE0FB61511");
            this.setName("提交");
            this.setLeftPos(10);
            this.setTopPos(55);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P1WFProcessModel extends WFInteractiveProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("7B6753A6-704F-45AD-B2E3-08D5984E103D");
            this.setName("部门申报");
            this.setLeftPos(60);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("036BF50A-B4C3-4784-BCBD-55A6AE086D16");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("650E4500-A935-4A35-BE45-32477539EF9E");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
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
            this.setId("40CA62F3-71C7-4E4E-8CFD-E113B2021B33");
            this.setName("更新结束状态值");
            this.setLeftPos(1020);
            this.setTopPos(300);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("CGSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("CGSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P3WFProcessModel extends WFInteractiveProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("D0731FE4-CACE-4609-BD69-FEDF50A8B9BC");
            this.setName("固定资产相关人员审核");
            this.setLeftPos(480);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("30");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("504C71EE-5EF9-4D58-81D8-DD0CE7052825");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("CC939CA3-C771-4206-83A6-80B14FF3EC1B");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 结束处理
     */
    class P4WFProcessModel extends WFEndProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("01E3569D-2779-4140-BD29-3E57B4D8D608");
            this.setName("结束");
            this.setLeftPos(540);
            this.setTopPos(480);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P5WFProcessModel extends WFInteractiveProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("2810D92C-AB15-46F8-9DBA-B01438279B71");
            this.setName("计财负责人审核");
            this.setLeftPos(700);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("40");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("20BF36C7-7843-4400-B090-A155E43F69E9");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("D1436E62-2896-4EF7-8DCC-94ED4CD696ED");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 交互处理
     */
    class P6WFProcessModel extends WFInteractiveProcessModelBase {
        public P6WFProcessModel() {
            super();
            this.setId("1E1ECED7-28F8-436E-8140-FAE90F4DC962");
            this.setName("分管院领导审核");
            this.setLeftPos(940);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("50");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("1E690AB3-22DB-442B-9FFF-5ACCB91F4A69");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("FE17FB10-65D7-400C-85E9-C1E206CF0640");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P7WFProcessModel extends WFDEActionProcessModelBase {
        public P7WFProcessModel() {
            super();
            this.setId("8C2433F6-128F-40CB-973B-14F579E39A42");
            this.setName("拒绝");
            this.setLeftPos(480);
            this.setTopPos(300);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("CGSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("CGSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("50");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P8WFProcessModel extends WFInteractiveProcessModelBase {
        public P8WFProcessModel() {
            super();
            this.setId("308EECBB-E837-4449-AE69-D5B1FE8AEF05");
            this.setName("部门负责人审核");
            this.setLeftPos(260);
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
            procRole0.setId("8D1BF70C-DD60-4DCE-9155-E9C4646F507B");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("C6A2C82E-C4F6-4E25-BE6F-B6D1B0DDAA41");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
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
            this.setId("EEB79523-7EB2-41A8-B8AB-9DF614B4F107");
            this.setName("AC5020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("8C2433F6-128F-40CB-973B-14F579E39A42");
            //分管院领导审核
            this.setFrom("1E1ECED7-28F8-436E-8140-FAE90F4DC962");
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
            this.setId("E0B58A64-A7A1-4455-B905-3B7E992DE3A9");
            this.setName("AC5010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("40CA62F3-71C7-4E4E-8CFD-E113B2021B33");
            //分管院领导审核
            this.setFrom("1E1ECED7-28F8-436E-8140-FAE90F4DC962");
            this.setLogicName("确认");
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
    class P2WFLinkModel extends WFInteractiveLinkModelBase {
        public P2WFLinkModel() {
            super();
            this.setId("E7106C56-0152-406A-AD47-716B4E1FC255");
            this.setName("AC4020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("8C2433F6-128F-40CB-973B-14F579E39A42");
            //计财负责人审核
            this.setFrom("2810D92C-AB15-46F8-9DBA-B01438279B71");
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
    class P3WFLinkModel extends WFInteractiveLinkModelBase {
        public P3WFLinkModel() {
            super();
            this.setId("7969C018-EE26-4692-B36C-00FED7F66520");
            this.setName("AC4010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //分管院领导审核
            this.setNext("1E1ECED7-28F8-436E-8140-FAE90F4DC962");
            //计财负责人审核
            this.setFrom("2810D92C-AB15-46F8-9DBA-B01438279B71");
            this.setLogicName("确认");
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
            this.setId("A3D05B9B-AA1E-423D-8F92-91607527724E");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("8C2433F6-128F-40CB-973B-14F579E39A42");
            //部门负责人审核
            this.setFrom("308EECBB-E837-4449-AE69-D5B1FE8AEF05");
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
            this.setId("16DE48FC-9BDD-4CD9-AEBF-F82399D068EE");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //固定资产相关人员审核
            this.setNext("D0731FE4-CACE-4609-BD69-FEDF50A8B9BC");
            //部门负责人审核
            this.setFrom("308EECBB-E837-4449-AE69-D5B1FE8AEF05");
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
            this.setId("16412E6B-FE2A-4CF4-9E95-4F824B9ACD4D");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("01E3569D-2779-4140-BD29-3E57B4D8D608");
            //更新结束状态值
            this.setFrom("40CA62F3-71C7-4E4E-8CFD-E113B2021B33");
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
    class P7WFLinkModel extends WFInteractiveLinkModelBase {
        public P7WFLinkModel() {
            super();
            this.setId("A413EF02-B172-4F28-988A-B87A0ED01960");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("8C2433F6-128F-40CB-973B-14F579E39A42");
            //部门申报
            this.setFrom("7B6753A6-704F-45AD-B2E3-08D5984E103D");
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
    class P8WFLinkModel extends WFInteractiveLinkModelBase {
        public P8WFLinkModel() {
            super();
            this.setId("DD84D177-8E02-45A1-98B7-09959A0428B8");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门负责人审核
            this.setNext("308EECBB-E837-4449-AE69-D5B1FE8AEF05");
            //部门申报
            this.setFrom("7B6753A6-704F-45AD-B2E3-08D5984E103D");
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
    class P9WFLinkModel extends WFRouteLinkModelBase {
        public P9WFLinkModel() {
            super();
            this.setId("C12099A5-2741-4B46-A1C7-8E48CCAB2CFB");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("01E3569D-2779-4140-BD29-3E57B4D8D608");
            //拒绝
            this.setFrom("8C2433F6-128F-40CB-973B-14F579E39A42");
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
    class P10WFLinkModel extends WFRouteLinkModelBase {
        public P10WFLinkModel() {
            super();
            this.setId("F9FC9971-4C59-4476-9F32-88E43C98EB26");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门申报
            this.setNext("7B6753A6-704F-45AD-B2E3-08D5984E103D");
            //提交
            this.setFrom("C292309F-917B-4232-8445-EAFE0FB61511");
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
    class P11WFLinkModel extends WFInteractiveLinkModelBase {
        public P11WFLinkModel() {
            super();
            this.setId("A977315E-C53A-4E86-A29A-76077D9A6D11");
            this.setName("AC3020");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("8C2433F6-128F-40CB-973B-14F579E39A42");
            //固定资产相关人员审核
            this.setFrom("D0731FE4-CACE-4609-BD69-FEDF50A8B9BC");
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
    class P12WFLinkModel extends WFInteractiveLinkModelBase {
        public P12WFLinkModel() {
            super();
            this.setId("2429D0AA-25EF-4F80-9908-3C4981516DCF");
            this.setName("AC3010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //计财负责人审核
            this.setNext("2810D92C-AB15-46F8-9DBA-B01438279B71");
            //固定资产相关人员审核
            this.setFrom("D0731FE4-CACE-4609-BD69-FEDF50A8B9BC");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public CGSQLCv1WFVersionModel() {
        super();

        this.setId("C292309F-917B-4232-8445-EAFE0FB61511");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 提交
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 部门申报
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 更新结束状态值
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 固定资产相关人员审核
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 结束
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 计财负责人审核
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        //注册处理 分管院领导审核
        P6WFProcessModel p6 = new P6WFProcessModel();
        p6.init(this);
        registerWFProcessModel(p6);

        //注册处理 拒绝
        P7WFProcessModel p7 = new P7WFProcessModel();
        p7.init(this);
        registerWFProcessModel(p7);

        //注册处理 部门负责人审核
        P8WFProcessModel p8 = new P8WFProcessModel();
        p8.init(this);
        registerWFProcessModel(p8);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 AC5020
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC5010
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 AC4020
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 AC4010
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

        //注册处理 AC1020
        P7WFLinkModel p7 = new P7WFLinkModel();
        p7.init(this);
        registerWFLinkModel(p7);

        //注册处理 AC1010
        P8WFLinkModel p8 = new P8WFLinkModel();
        p8.init(this);
        registerWFLinkModel(p8);

        //注册处理 结束
        P9WFLinkModel p9 = new P9WFLinkModel();
        p9.init(this);
        registerWFLinkModel(p9);

        //注册处理 提交
        P10WFLinkModel p10 = new P10WFLinkModel();
        p10.init(this);
        registerWFLinkModel(p10);

        //注册处理 AC3020
        P11WFLinkModel p11 = new P11WFLinkModel();
        p11.init(this);
        registerWFLinkModel(p11);

        //注册处理 AC3010
        P12WFLinkModel p12 = new P12WFLinkModel();
        p12.init(this);
        registerWFLinkModel(p12);

        super.prepareWFLinkModels();
    }

}