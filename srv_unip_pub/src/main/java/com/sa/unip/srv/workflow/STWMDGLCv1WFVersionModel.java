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
 * 食堂外卖订购流程 v1 流程模型
 */
public class STWMDGLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 交互处理
     */
    class P0WFProcessModel extends WFInteractiveProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("EFDB1161-7FF9-4A6A-91BB-3146B12EDD20");
            this.setName("承办处领导审核");
            this.setLeftPos(640);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("3C5674A7-BFB6-4734-B74C-FA341E50DC4A");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("874E7AF5-9E15-4CC7-8612-5ABBCB3F11F1");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 开始处理
     */
    class P1WFProcessModel extends WFStartProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("74B38413-82C6-4E01-89A0-C520CE89927E");
            this.setName("提交");
            this.setLeftPos(45);
            this.setTopPos(110);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P2WFProcessModel extends WFDEActionProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("276317E9-BA3D-4DFE-BBED-EA529413082C");
            this.setName("拒绝");
            this.setLeftPos(320);
            this.setTopPos(320);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("STWMSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("STWMDGZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P3WFProcessModel extends WFInteractiveProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("90EE993C-2099-40A2-9395-351A7979EF9B");
            this.setName("部门领导审核");
            this.setLeftPos(280);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("8F46EE67-0F5A-4A7E-BB89-C44335FB5921");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("B5C68616-FAAF-4CFA-9783-8C3810000E82");
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
            this.setId("380FDB9C-4572-4474-A909-9B27229B5333");
            this.setName("更新结束状态值");
            this.setLeftPos(720);
            this.setTopPos(360);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("STWMDGZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("STWMSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 结束处理
     */
    class P5WFProcessModel extends WFEndProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("4317B5D2-1419-439F-990A-A9EDDA6AFD4E");
            this.setName("结束");
            this.setLeftPos(380);
            this.setTopPos(500);
            this.setThreadSN(-1);
        }
    }

//定义流程连接
    /**
     * 路由处理
     */
    class P0WFLinkModel extends WFRouteLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("26B8194D-011B-4D37-A9C4-DAFFB8B695D5");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("4317B5D2-1419-439F-990A-A9EDDA6AFD4E");
            //拒绝
            this.setFrom("276317E9-BA3D-4DFE-BBED-EA529413082C");
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
    class P1WFLinkModel extends WFRouteLinkModelBase {
        public P1WFLinkModel() {
            super();
            this.setId("32EE2656-C1A1-442B-BC8B-4BEE20D24A58");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("4317B5D2-1419-439F-990A-A9EDDA6AFD4E");
            //更新结束状态值
            this.setFrom("380FDB9C-4572-4474-A909-9B27229B5333");
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
    class P2WFLinkModel extends WFRouteLinkModelBase {
        public P2WFLinkModel() {
            super();
            this.setId("625FF805-B8A4-448F-AC4F-6BBF09015733");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("90EE993C-2099-40A2-9395-351A7979EF9B");
            //提交
            this.setFrom("74B38413-82C6-4E01-89A0-C520CE89927E");
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
            this.setId("6028537B-9967-4C76-B01B-25448161A7BF");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("276317E9-BA3D-4DFE-BBED-EA529413082C");
            //部门领导审核
            this.setFrom("90EE993C-2099-40A2-9395-351A7979EF9B");
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
            this.setId("145DB7D5-A518-4273-BD2B-26797A4FFB0F");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处领导审核
            this.setNext("EFDB1161-7FF9-4A6A-91BB-3146B12EDD20");
            //部门领导审核
            this.setFrom("90EE993C-2099-40A2-9395-351A7979EF9B");
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
    class P5WFLinkModel extends WFInteractiveLinkModelBase {
        public P5WFLinkModel() {
            super();
            this.setId("A79E37D8-9D5D-4E8E-A9B6-A0DCDBDDA2C9");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("276317E9-BA3D-4DFE-BBED-EA529413082C");
            //承办处领导审核
            this.setFrom("EFDB1161-7FF9-4A6A-91BB-3146B12EDD20");
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
    class P6WFLinkModel extends WFInteractiveLinkModelBase {
        public P6WFLinkModel() {
            super();
            this.setId("C2EE3385-321F-41E4-8C63-45194912E260");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("380FDB9C-4572-4474-A909-9B27229B5333");
            //承办处领导审核
            this.setFrom("EFDB1161-7FF9-4A6A-91BB-3146B12EDD20");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public STWMDGLCv1WFVersionModel() {
        super();

        this.setId("74B38413-82C6-4E01-89A0-C520CE89927E");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 承办处领导审核
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 提交
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 拒绝
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 部门领导审核
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 更新结束状态值
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
        //注册处理 结束
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 结束
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 提交
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

        //注册处理 AC2020
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 AC2010
        P6WFLinkModel p6 = new P6WFLinkModel();
        p6.init(this);
        registerWFLinkModel(p6);

        super.prepareWFLinkModels();
    }

}