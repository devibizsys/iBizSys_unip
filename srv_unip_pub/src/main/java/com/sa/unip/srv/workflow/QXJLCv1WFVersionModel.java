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
 * 请休假流程 v1 流程模型
 */
public class QXJLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 实体操作处理
     */
    class P0WFProcessModel extends WFDEActionProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("D19C452A-9281-4447-B022-4EB2C77BCFD3");
            this.setName("拒绝");
            this.setLeftPos(500);
            this.setTopPos(240);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("QXJZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("QXJSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 实体操作处理
     */
    class P1WFProcessModel extends WFDEActionProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("752709F9-68F9-4730-9369-64B0DD80B331");
            this.setName("更新结束状态值");
            this.setLeftPos(960);
            this.setTopPos(300);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("QXJZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("QXJSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 结束处理
     */
    class P2WFProcessModel extends WFEndProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("7051B222-722D-4857-9717-179DDA8FC339");
            this.setName("结束");
            this.setLeftPos(560);
            this.setTopPos(420);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P3WFProcessModel extends WFInteractiveProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("9FA8B8B6-A1BB-4E03-BA8B-5836346F24A1");
            this.setName("干部处备案审核");
            this.setLeftPos(520);
            this.setTopPos(40);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("266BF158-1E38-4AE7-AD6C-B0469128F3BA");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("FEDE67E4-D6D3-439E-819F-42E55507D8B2");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 交互处理
     */
    class P4WFProcessModel extends WFInteractiveProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("8D3CE605-6F41-46AE-93F1-CBADE28E4AC3");
            this.setName("院领导审批");
            this.setLeftPos(880);
            this.setTopPos(20);
            this.setThreadSN(-1);
            this.setWFStepValue("30");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("51D9DBC2-CFAD-4303-B434-47DF6D27F28D");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("E40CE33A-8925-4CFD-9111-7888652DCD71");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 开始处理
     */
    class P5WFProcessModel extends WFStartProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("D1C55BD0-C4D7-42B0-BC2D-EAF08A7C474A");
            this.setName("提交");
            this.setLeftPos(40);
            this.setTopPos(45);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P6WFProcessModel extends WFInteractiveProcessModelBase {
        public P6WFProcessModel() {
            super();
            this.setId("E45258F0-1C23-4A0A-906B-A9289F143244");
            this.setName("处室领导审核");
            this.setLeftPos(120);
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
            procRole0.setId("28016401-9DA5-4409-BF91-615C298500A5");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("34A849DB-84A1-4C62-9111-5CD7743782F0");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }

//定义流程连接
    /**
     * 路由处理
     */
    class P0WFLinkModel extends WFRouteLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("75A3ABB4-1088-42C9-A5B5-3937B430468B");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("7051B222-722D-4857-9717-179DDA8FC339");
            //更新结束状态值
            this.setFrom("752709F9-68F9-4730-9369-64B0DD80B331");
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
            this.setId("D04AD46E-36C9-4916-A02A-BF3E30FD79BE");
            this.setName("AC3020");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("D19C452A-9281-4447-B022-4EB2C77BCFD3");
            //院领导审批
            this.setFrom("8D3CE605-6F41-46AE-93F1-CBADE28E4AC3");
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
            this.setId("349042E1-E320-439E-BDC0-3D1B9AC34CD8");
            this.setName("AC3010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("752709F9-68F9-4730-9369-64B0DD80B331");
            //院领导审批
            this.setFrom("8D3CE605-6F41-46AE-93F1-CBADE28E4AC3");
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
    class P3WFLinkModel extends WFInteractiveLinkModelBase {
        public P3WFLinkModel() {
            super();
            this.setId("0010CC62-18F6-4D68-9AE6-B884D5F6A92B");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("D19C452A-9281-4447-B022-4EB2C77BCFD3");
            //干部处备案审核
            this.setFrom("9FA8B8B6-A1BB-4E03-BA8B-5836346F24A1");
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
            this.setId("E0A7EF72-6197-497A-9AA5-D348123F011F");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //院领导审批
            this.setNext("8D3CE605-6F41-46AE-93F1-CBADE28E4AC3");
            //干部处备案审核
            this.setFrom("9FA8B8B6-A1BB-4E03-BA8B-5836346F24A1");
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
            this.setId("3C1BFAB9-9328-4FB0-A2A8-BF71058D89B3");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("7051B222-722D-4857-9717-179DDA8FC339");
            //拒绝
            this.setFrom("D19C452A-9281-4447-B022-4EB2C77BCFD3");
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
            this.setId("EA36366A-6E9C-42B3-B773-145DF7CCBC61");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //处室领导审核
            this.setNext("E45258F0-1C23-4A0A-906B-A9289F143244");
            //提交
            this.setFrom("D1C55BD0-C4D7-42B0-BC2D-EAF08A7C474A");
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
            this.setId("AE3146CE-0220-4E36-AB3B-44F3D1F0A9E7");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("D19C452A-9281-4447-B022-4EB2C77BCFD3");
            //处室领导审核
            this.setFrom("E45258F0-1C23-4A0A-906B-A9289F143244");
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
            this.setId("722E438B-9F61-4083-B49A-D8CCFBBE8AA4");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //干部处备案审核
            this.setNext("9FA8B8B6-A1BB-4E03-BA8B-5836346F24A1");
            //处室领导审核
            this.setFrom("E45258F0-1C23-4A0A-906B-A9289F143244");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public QXJLCv1WFVersionModel() {
        super();

        this.setId("D1C55BD0-C4D7-42B0-BC2D-EAF08A7C474A");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 拒绝
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 更新结束状态值
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 结束
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 干部处备案审核
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 院领导审批
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 提交
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        //注册处理 处室领导审核
        P6WFProcessModel p6 = new P6WFProcessModel();
        p6.init(this);
        registerWFProcessModel(p6);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 结束
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC3020
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 AC3010
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 AC2020
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 AC2010
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        //注册处理 结束
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 提交
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

        super.prepareWFLinkModels();
    }

}