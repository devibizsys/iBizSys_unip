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
 * 派车申请流程 v1 流程模型
 */
public class PCSQLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 交互处理
     */
    class P0WFProcessModel extends WFInteractiveProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("AB9B1AD2-9820-4D60-ABCE-2CFF0866D952");
            this.setName("部门领导审核");
            this.setLeftPos(260);
            this.setTopPos(100);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("CC8D1966-E3D1-42FF-9323-3D4E9E7A6457");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("E283AE6B-61D5-4D82-B310-5C7774B3AB1B");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 交互处理
     */
    class P1WFProcessModel extends WFInteractiveProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("E9715D0A-34A0-4B15-AB37-64DD41C4ABD3");
            this.setName("承办处领导审核");
            this.setLeftPos(600);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("02765B98-9208-4E9D-991E-E95F5FE15BC6");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("6EED9410-9B61-4DF1-9E19-4BB3DB510372");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 结束处理
     */
    class P2WFProcessModel extends WFEndProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("D6FAF8F9-BF9E-4F9D-83E8-5B0B80C889C0");
            this.setName("结束");
            this.setLeftPos(440);
            this.setTopPos(520);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P3WFProcessModel extends WFDEActionProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("6225950E-1F1B-43DC-829A-5B71972AFB62");
            this.setName("拒绝");
            this.setLeftPos(380);
            this.setTopPos(360);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("PCSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("PCSQSFSHTG");
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
            this.setId("8C4A9343-F786-4F45-AD98-AFFDA7AF9B6D");
            this.setName("提交");
            this.setLeftPos(70);
            this.setTopPos(100);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P5WFProcessModel extends WFDEActionProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("0DC67503-AAD5-4CFE-9DD4-99208B9E2E87");
            this.setName("更新结束状态值");
            this.setLeftPos(920);
            this.setTopPos(320);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("PCSQSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("PCSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 实体操作处理
     */
    class P6WFProcessModel extends WFDEActionProcessModelBase {
        public P6WFProcessModel() {
            super();
            this.setId("A001367F-EFBC-46C9-B112-7C2D75CE789F");
            this.setName("更新车辆使用状态");
            this.setLeftPos(920);
            this.setTopPos(80);
            this.setThreadSN(-1);
            this.setDEActionName("GXCLSYKSZT");
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
            this.setId("99218AB6-54BF-4FCE-8EED-E6F27A9B6C1D");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("D6FAF8F9-BF9E-4F9D-83E8-5B0B80C889C0");
            //更新结束状态值
            this.setFrom("0DC67503-AAD5-4CFE-9DD4-99208B9E2E87");
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
            this.setId("400D5E7E-4A23-4928-81F7-61F60F0C4C2C");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("D6FAF8F9-BF9E-4F9D-83E8-5B0B80C889C0");
            //拒绝
            this.setFrom("6225950E-1F1B-43DC-829A-5B71972AFB62");
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
            this.setId("975AA827-7860-4EA0-94A0-79180AEBEE94");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("AB9B1AD2-9820-4D60-ABCE-2CFF0866D952");
            //提交
            this.setFrom("8C4A9343-F786-4F45-AD98-AFFDA7AF9B6D");
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
            this.setId("2425C005-68B3-48A7-A43E-44EF166C0044");
            this.setName("修改车辆使用状态成功");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("0DC67503-AAD5-4CFE-9DD4-99208B9E2E87");
            //更新车辆使用状态
            this.setFrom("A001367F-EFBC-46C9-B112-7C2D75CE789F");
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
            this.setId("CB0727B9-94E7-460E-91DD-9B4B5911E5C2");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("6225950E-1F1B-43DC-829A-5B71972AFB62");
            //部门领导审核
            this.setFrom("AB9B1AD2-9820-4D60-ABCE-2CFF0866D952");
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
            this.setId("4E1114BC-CBBE-4F32-BA57-AE5FE2BBCF59");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处领导审核
            this.setNext("E9715D0A-34A0-4B15-AB37-64DD41C4ABD3");
            //部门领导审核
            this.setFrom("AB9B1AD2-9820-4D60-ABCE-2CFF0866D952");
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
    class P6WFLinkModel extends WFInteractiveLinkModelBase {
        public P6WFLinkModel() {
            super();
            this.setId("200CA06C-770D-4183-ABC5-697CDF7F8DEC");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("6225950E-1F1B-43DC-829A-5B71972AFB62");
            //承办处领导审核
            this.setFrom("E9715D0A-34A0-4B15-AB37-64DD41C4ABD3");
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
    class P7WFLinkModel extends WFInteractiveLinkModelBase {
        public P7WFLinkModel() {
            super();
            this.setId("8E28081E-6DA9-4102-9854-B12D41104356");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新车辆使用状态
            this.setNext("A001367F-EFBC-46C9-B112-7C2D75CE789F");
            //承办处领导审核
            this.setFrom("E9715D0A-34A0-4B15-AB37-64DD41C4ABD3");
            this.setLogicName("确认");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public PCSQLCv1WFVersionModel() {
        super();

        this.setId("8C4A9343-F786-4F45-AD98-AFFDA7AF9B6D");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 部门领导审核
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 承办处领导审核
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 结束
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

        //注册处理 更新结束状态值
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        //注册处理 更新车辆使用状态
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

        //注册处理 结束
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 提交
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 修改车辆使用状态成功
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 AC1020
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        //注册处理 AC1010
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 AC2020
        P6WFLinkModel p6 = new P6WFLinkModel();
        p6.init(this);
        registerWFLinkModel(p6);

        //注册处理 AC2010
        P7WFLinkModel p7 = new P7WFLinkModel();
        p7.init(this);
        registerWFLinkModel(p7);

        super.prepareWFLinkModels();
    }

}