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
 * 通知公告申请 v1 流程模型
 */
public class TXGGSQv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 结束处理
     */
    class P0WFProcessModel extends WFEndProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("4FB7C4C4-F8D0-4CE2-972B-BA5CD5C2A183");
            this.setName("结束");
            this.setLeftPos(700);
            this.setTopPos(320);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P1WFProcessModel extends WFDEActionProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("BD9B0D4A-EF31-4D23-AB37-BBA957A053A8");
            this.setName("拒绝");
            this.setLeftPos(260);
            this.setTopPos(300);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("TZGGSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("GGSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P2WFProcessModel extends WFInteractiveProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("5DA5A56E-35C3-4883-98F2-5D77BF2FC964");
            this.setName("部门领导审核");
            this.setLeftPos(240);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("19290FF9-4789-4703-B0F8-DE64A9160372");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("FD6B5A8F-879C-43BB-8340-C5062E00D3C2");
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
            this.setId("933A526E-BD66-4497-9A0C-DAC5B7EBE189");
            this.setName("更新结束状态值");
            this.setLeftPos(800);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("TZGGSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("GGSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 开始处理
     */
    class P4WFProcessModel extends WFStartProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("45189E31-DA34-4F25-8AF4-9E28085BD516");
            this.setName("提交");
            this.setLeftPos(20);
            this.setTopPos(50);
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
            this.setId("B803328B-68B1-46CB-A95E-B6738D28F582");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("5DA5A56E-35C3-4883-98F2-5D77BF2FC964");
            //提交
            this.setFrom("45189E31-DA34-4F25-8AF4-9E28085BD516");
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
            this.setId("E5DC1F18-AB4E-4940-B39E-48210BF63092");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("933A526E-BD66-4497-9A0C-DAC5B7EBE189");
            //部门领导审核
            this.setFrom("5DA5A56E-35C3-4883-98F2-5D77BF2FC964");
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
            this.setId("A4C3425E-ACBF-4864-926F-A4E7A7B31FDB");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("BD9B0D4A-EF31-4D23-AB37-BBA957A053A8");
            //部门领导审核
            this.setFrom("5DA5A56E-35C3-4883-98F2-5D77BF2FC964");
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
     * 路由处理
     */
    class P3WFLinkModel extends WFRouteLinkModelBase {
        public P3WFLinkModel() {
            super();
            this.setId("28B991FB-A328-4FE9-AB6F-BE55FD546081");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("4FB7C4C4-F8D0-4CE2-972B-BA5CD5C2A183");
            //更新结束状态值
            this.setFrom("933A526E-BD66-4497-9A0C-DAC5B7EBE189");
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
    class P4WFLinkModel extends WFRouteLinkModelBase {
        public P4WFLinkModel() {
            super();
            this.setId("146609D1-4C82-4D61-9227-1245F9D44C25");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("4FB7C4C4-F8D0-4CE2-972B-BA5CD5C2A183");
            //拒绝
            this.setFrom("BD9B0D4A-EF31-4D23-AB37-BBA957A053A8");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }




    public TXGGSQv1WFVersionModel() {
        super();

        this.setId("45189E31-DA34-4F25-8AF4-9E28085BD516");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 结束
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 拒绝
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 部门领导审核
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 更新结束状态值
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 提交
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 提交
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC1010
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 AC1020
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 结束
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 结束
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        super.prepareWFLinkModels();
    }

}