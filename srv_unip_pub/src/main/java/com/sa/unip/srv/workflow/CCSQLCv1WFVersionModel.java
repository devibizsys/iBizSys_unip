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
 * 出差申请流程 v1 流程模型
 */
public class CCSQLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 开始处理
     */
    class P0WFProcessModel extends WFStartProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("206DA19A-2B8A-4EAB-B5A7-18DE08E6CE0D");
            this.setName("提交");
            this.setLeftPos(35);
            this.setTopPos(45);
            this.setThreadSN(-1);
        }
    }
    /**
     * 结束处理
     */
    class P1WFProcessModel extends WFEndProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("5530E599-AAD8-450F-AB57-7C99BC6BB746");
            this.setName("结束");
            this.setLeftPos(340);
            this.setTopPos(480);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P2WFProcessModel extends WFInteractiveProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("3D62EFDB-3382-409D-B06F-13FA89C1CBC0");
            this.setName("部门领导审核");
            this.setLeftPos(160);
            this.setTopPos(60);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("057760C0-2087-4A13-B9DA-0CC44E8A8BBF");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("D3B56260-90B2-4109-B9E9-C4D8055F45BE");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P3WFProcessModel extends WFDEActionProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("14B6D17E-4E66-4A03-BBCE-302FE33A3BD3");
            this.setName("拒绝");
            this.setLeftPos(260);
            this.setTopPos(280);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("CCSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("CCSQSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P4WFProcessModel extends WFInteractiveProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("B54DAB69-429E-418E-A5E1-DAA2139BE235");
            this.setName("承办处领导审核");
            this.setLeftPos(440);
            this.setTopPos(60);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("04D7D2B2-4AA6-4FF1-81B9-715B03ECDE5D");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("ABC9BEBF-A8F9-4D6A-A92F-99A54FC1B9D1");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P5WFProcessModel extends WFDEActionProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("97E7BC68-8C6C-4577-BE84-1981E77EE3EA");
            this.setName("更新结束状态值");
            this.setLeftPos(740);
            this.setTopPos(60);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("CCSQSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("CCSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }

//定义流程连接
    /**
     * 路由处理
     */
    class P0WFLinkModel extends WFRouteLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("98FAE2C8-6F5A-4DFD-9FDC-E2C6B5579154");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("5530E599-AAD8-450F-AB57-7C99BC6BB746");
            //拒绝
            this.setFrom("14B6D17E-4E66-4A03-BBCE-302FE33A3BD3");
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
            this.setId("79C554FA-E22D-4F0B-8870-FFB852A4B516");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("3D62EFDB-3382-409D-B06F-13FA89C1CBC0");
            //提交
            this.setFrom("206DA19A-2B8A-4EAB-B5A7-18DE08E6CE0D");
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
    class P2WFLinkModel extends WFInteractiveLinkModelBase {
        public P2WFLinkModel() {
            super();
            this.setId("F74DF164-3FC0-45F7-87F8-8CABC0FF761E");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("14B6D17E-4E66-4A03-BBCE-302FE33A3BD3");
            //部门领导审核
            this.setFrom("3D62EFDB-3382-409D-B06F-13FA89C1CBC0");
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
            this.setId("BA4F390A-FCA9-46C1-98A8-750933EEEE7F");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处领导审核
            this.setNext("B54DAB69-429E-418E-A5E1-DAA2139BE235");
            //部门领导审核
            this.setFrom("3D62EFDB-3382-409D-B06F-13FA89C1CBC0");
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
    class P4WFLinkModel extends WFRouteLinkModelBase {
        public P4WFLinkModel() {
            super();
            this.setId("A4B5905F-0340-413E-A2BD-EC7FFE78E4E9");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("5530E599-AAD8-450F-AB57-7C99BC6BB746");
            //更新结束状态值
            this.setFrom("97E7BC68-8C6C-4577-BE84-1981E77EE3EA");
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
    class P5WFLinkModel extends WFInteractiveLinkModelBase {
        public P5WFLinkModel() {
            super();
            this.setId("110220C9-361B-4068-9586-AF5CFD27A699");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("14B6D17E-4E66-4A03-BBCE-302FE33A3BD3");
            //承办处领导审核
            this.setFrom("B54DAB69-429E-418E-A5E1-DAA2139BE235");
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
            this.setId("62E7BB46-2CF8-4313-9EC6-A24830154F2D");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("97E7BC68-8C6C-4577-BE84-1981E77EE3EA");
            //承办处领导审核
            this.setFrom("B54DAB69-429E-418E-A5E1-DAA2139BE235");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public CCSQLCv1WFVersionModel() {
        super();

        this.setId("206DA19A-2B8A-4EAB-B5A7-18DE08E6CE0D");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 提交
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 结束
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 部门领导审核
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 拒绝
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 承办处领导审核
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 更新结束状态值
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

        //注册处理 提交
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 AC1020
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 AC1010
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 结束
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