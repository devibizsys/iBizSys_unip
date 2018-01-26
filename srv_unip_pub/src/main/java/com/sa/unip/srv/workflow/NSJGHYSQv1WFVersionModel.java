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
 * 内设机构会议申请 v1 流程模型
 */
public class NSJGHYSQv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 实体操作处理
     */
    class P0WFProcessModel extends WFDEActionProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("448F84D0-6C48-4332-90A5-F5A0DD6025A1");
            this.setName("更新内设会议室使用结束状态");
            this.setLeftPos(1020);
            this.setTopPos(260);
            this.setThreadSN(-1);
            this.setDEActionName("GXNSHYSSYJSZT");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
        }

    }
    /**
     * 实体操作处理
     */
    class P1WFProcessModel extends WFDEActionProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("36159E56-D3CD-481B-9875-F5B90BB64D53");
            this.setName("更新结束状态值");
            this.setLeftPos(1020);
            this.setTopPos(420);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("NSJGSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("NSJGHYSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P2WFProcessModel extends WFInteractiveProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("5DF228AF-B389-4336-84B1-39412101A463");
            this.setName("承办处室负责人审核");
            this.setLeftPos(360);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("3232D253-2C75-4AE8-95AF-47D74BE26457");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("FFEB8459-0DC3-4AAF-90F5-1FAB072B8D2E");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 结束处理
     */
    class P3WFProcessModel extends WFEndProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("1F453AA6-BAB2-409E-B77A-F5FC95055675");
            this.setName("结束");
            this.setLeftPos(520);
            this.setTopPos(560);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P4WFProcessModel extends WFDEActionProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("238326B7-5D6E-484E-944A-51AB97DEB887");
            this.setName("拒绝");
            this.setLeftPos(460);
            this.setTopPos(360);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("NSJGSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("NSJGHYSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("50");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P5WFProcessModel extends WFInteractiveProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("20C53298-E1AA-4EC2-95D7-9F992D421E2E");
            this.setName("参会领导审核");
            this.setLeftPos(120);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("2A4AA8B2-D93D-4847-8283-B0F9A24156A5");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("AFBDF5ED-3F2D-4179-8ECB-867226F3B745");
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
            this.setId("F63DFDD0-55DD-41A0-A48F-4A587D3585CD");
            this.setName("院办负责人审核");
            this.setLeftPos(980);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("40");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("7D8D2F0F-F72C-485C-A055-AFB7D1371D46");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("D9E61599-D674-4940-BAB6-0B4565A4AE67");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 开始处理
     */
    class P7WFProcessModel extends WFStartProcessModelBase {
        public P7WFProcessModel() {
            super();
            this.setId("3CDE3E23-0D4D-4800-8A51-B61FE3CCD5B9");
            this.setName("提交");
            this.setLeftPos(25);
            this.setTopPos(130);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P8WFProcessModel extends WFInteractiveProcessModelBase {
        public P8WFProcessModel() {
            super();
            this.setId("29540A36-C0DC-4A6F-A0A8-1E6BD611D3A7");
            this.setName("秘书处审核");
            this.setLeftPos(740);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("30");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("320213D1-985A-4CF4-A34E-61BB72554BCA");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("5950E59D-FC82-4833-A5F0-8EFB9782CF42");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P9WFProcessModel extends WFDEActionProcessModelBase {
        public P9WFProcessModel() {
            super();
            this.setId("028BAAB2-88C2-44BF-A4E5-F3859192E788");
            this.setName("更新会议室使用开始状态");
            this.setLeftPos(540);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setDEActionName("GXNSHYSSYKSZT");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
        }

    }

//定义流程连接
    /**
     * 路由处理
     */
    class P0WFLinkModel extends WFRouteLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("817324B3-EA0F-4397-99D4-40305D7E4E30");
            this.setName("更新会议室使用状态");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //秘书处审核
            this.setNext("29540A36-C0DC-4A6F-A0A8-1E6BD611D3A7");
            //更新会议室使用开始状态
            this.setFrom("028BAAB2-88C2-44BF-A4E5-F3859192E788");
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
    class P1WFLinkModel extends WFInteractiveLinkModelBase {
        public P1WFLinkModel() {
            super();
            this.setId("FFBD2E96-1695-4D8A-A4EF-654110063952");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("238326B7-5D6E-484E-944A-51AB97DEB887");
            //参会领导审核
            this.setFrom("20C53298-E1AA-4EC2-95D7-9F992D421E2E");
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
    class P2WFLinkModel extends WFInteractiveLinkModelBase {
        public P2WFLinkModel() {
            super();
            this.setId("746AD715-9082-4046-A1EE-0785711A59E7");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处室负责人审核
            this.setNext("5DF228AF-B389-4336-84B1-39412101A463");
            //参会领导审核
            this.setFrom("20C53298-E1AA-4EC2-95D7-9F992D421E2E");
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
    class P3WFLinkModel extends WFRouteLinkModelBase {
        public P3WFLinkModel() {
            super();
            this.setId("1F02050C-06B8-4BAF-B555-CC857C1B8340");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("1F453AA6-BAB2-409E-B77A-F5FC95055675");
            //拒绝
            this.setFrom("238326B7-5D6E-484E-944A-51AB97DEB887");
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
            this.setId("CA92BA97-354B-46BC-92BD-521729AA357A");
            this.setName("AC3020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("238326B7-5D6E-484E-944A-51AB97DEB887");
            //秘书处审核
            this.setFrom("29540A36-C0DC-4A6F-A0A8-1E6BD611D3A7");
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
            this.setId("29186C83-E490-4F6D-913F-B76F84CFD528");
            this.setName("AC3010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //院办负责人审核
            this.setNext("F63DFDD0-55DD-41A0-A48F-4A587D3585CD");
            //秘书处审核
            this.setFrom("29540A36-C0DC-4A6F-A0A8-1E6BD611D3A7");
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
            this.setId("D5EC8C67-592D-4289-BC37-EB346E9973EE");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("1F453AA6-BAB2-409E-B77A-F5FC95055675");
            //更新结束状态值
            this.setFrom("36159E56-D3CD-481B-9875-F5B90BB64D53");
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
    class P7WFLinkModel extends WFRouteLinkModelBase {
        public P7WFLinkModel() {
            super();
            this.setId("042D72F8-758C-4D5C-9B5B-B0B68EE3CE9E");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //参会领导审核
            this.setNext("20C53298-E1AA-4EC2-95D7-9F992D421E2E");
            //提交
            this.setFrom("3CDE3E23-0D4D-4800-8A51-B61FE3CCD5B9");
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
    class P8WFLinkModel extends WFRouteLinkModelBase {
        public P8WFLinkModel() {
            super();
            this.setId("B65106AC-87A6-451C-A6C7-4AA2DEC53BFF");
            this.setName("更新会议室使用状态");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("36159E56-D3CD-481B-9875-F5B90BB64D53");
            //更新内设会议室使用结束状态
            this.setFrom("448F84D0-6C48-4332-90A5-F5A0DD6025A1");
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
    class P9WFLinkModel extends WFInteractiveLinkModelBase {
        public P9WFLinkModel() {
            super();
            this.setId("A8099D13-B0DB-4734-8209-2286763320E0");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("238326B7-5D6E-484E-944A-51AB97DEB887");
            //承办处室负责人审核
            this.setFrom("5DF228AF-B389-4336-84B1-39412101A463");
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
    class P10WFLinkModel extends WFInteractiveLinkModelBase {
        public P10WFLinkModel() {
            super();
            this.setId("C24484A6-7914-46F5-BE62-36D83858C87F");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新会议室使用开始状态
            this.setNext("028BAAB2-88C2-44BF-A4E5-F3859192E788");
            //承办处室负责人审核
            this.setFrom("5DF228AF-B389-4336-84B1-39412101A463");
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
    class P11WFLinkModel extends WFInteractiveLinkModelBase {
        public P11WFLinkModel() {
            super();
            this.setId("A3704DC9-7EAE-4DF3-9111-AEA3C6243F54");
            this.setName("AC4020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("238326B7-5D6E-484E-944A-51AB97DEB887");
            //院办负责人审核
            this.setFrom("F63DFDD0-55DD-41A0-A48F-4A587D3585CD");
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
            this.setId("D9CA9A7A-8831-4C62-9B54-2813D36890E1");
            this.setName("AC4010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新内设会议室使用结束状态
            this.setNext("448F84D0-6C48-4332-90A5-F5A0DD6025A1");
            //院办负责人审核
            this.setFrom("F63DFDD0-55DD-41A0-A48F-4A587D3585CD");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public NSJGHYSQv1WFVersionModel() {
        super();

        this.setId("3CDE3E23-0D4D-4800-8A51-B61FE3CCD5B9");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 更新内设会议室使用结束状态
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 更新结束状态值
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 承办处室负责人审核
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 结束
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 拒绝
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 参会领导审核
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        //注册处理 院办负责人审核
        P6WFProcessModel p6 = new P6WFProcessModel();
        p6.init(this);
        registerWFProcessModel(p6);

        //注册处理 提交
        P7WFProcessModel p7 = new P7WFProcessModel();
        p7.init(this);
        registerWFProcessModel(p7);

        //注册处理 秘书处审核
        P8WFProcessModel p8 = new P8WFProcessModel();
        p8.init(this);
        registerWFProcessModel(p8);

        //注册处理 更新会议室使用开始状态
        P9WFProcessModel p9 = new P9WFProcessModel();
        p9.init(this);
        registerWFProcessModel(p9);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 更新会议室使用状态
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC1020
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 AC1010
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 结束
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 AC3020
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        //注册处理 AC3010
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 结束
        P6WFLinkModel p6 = new P6WFLinkModel();
        p6.init(this);
        registerWFLinkModel(p6);

        //注册处理 提交
        P7WFLinkModel p7 = new P7WFLinkModel();
        p7.init(this);
        registerWFLinkModel(p7);

        //注册处理 更新会议室使用状态
        P8WFLinkModel p8 = new P8WFLinkModel();
        p8.init(this);
        registerWFLinkModel(p8);

        //注册处理 AC2020
        P9WFLinkModel p9 = new P9WFLinkModel();
        p9.init(this);
        registerWFLinkModel(p9);

        //注册处理 AC2010
        P10WFLinkModel p10 = new P10WFLinkModel();
        p10.init(this);
        registerWFLinkModel(p10);

        //注册处理 AC4020
        P11WFLinkModel p11 = new P11WFLinkModel();
        p11.init(this);
        registerWFLinkModel(p11);

        //注册处理 AC4010
        P12WFLinkModel p12 = new P12WFLinkModel();
        p12.init(this);
        registerWFLinkModel(p12);

        super.prepareWFLinkModels();
    }

}