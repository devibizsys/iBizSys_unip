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
 * 院办会议申请 v1 流程模型
 */
public class YBHYSQv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 实体操作处理
     */
    class P0WFProcessModel extends WFDEActionProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("ACF78B18-DC14-4E1E-A974-C0CEDCC6C907");
            this.setName("更新会议室使用结束状态");
            this.setLeftPos(1500);
            this.setTopPos(480);
            this.setThreadSN(-1);
            this.setDEActionName("GXHYSSYJSZT");
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
            this.setId("910C1461-7F1D-47BA-A547-F212DBCBAD4C");
            this.setName("发送座位号通知");
            this.setLeftPos(1080);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setDEActionName("FSZWHTZ");
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
    class P2WFProcessModel extends WFDEActionProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
            this.setName("拒绝");
            this.setLeftPos(860);
            this.setTopPos(480);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("HYSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("50");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("SFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P3WFProcessModel extends WFInteractiveProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("F6DB1111-25DF-4AF5-AF71-E367D289A070");
            this.setName("参会情况通报");
            this.setLeftPos(1500);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setWFStepValue("50");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("687360C4-E536-47D8-ACF7-8247BD29CC0D");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("CC990728-4526-42BB-9B29-59B8D1E0C11D");
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
            this.setId("169CDA62-D254-4CC3-B908-B8C13AE002B8");
            this.setName("结束");
            this.setLeftPos(920);
            this.setTopPos(720);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P5WFProcessModel extends WFInteractiveProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("1EB4AF52-D4B7-4C99-B97D-3169538EF69D");
            this.setName("会议室申请");
            this.setLeftPos(480);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setWFStepValue("20");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("5042EF27-0EBA-459A-94A2-DD6E21A0C502");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("F56BCF16-1F6A-4F55-8F92-955A5612BAA3");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P6WFProcessModel extends WFDEActionProcessModelBase {
        public P6WFProcessModel() {
            super();
            this.setId("EE820C02-53F2-4378-8E95-91921302BC39");
            this.setName("更新会议室使用开始状态");
            this.setLeftPos(680);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setDEActionName("GXHYSKSZT");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
        }

    }
    /**
     * 开始处理
     */
    class P7WFProcessModel extends WFStartProcessModelBase {
        public P7WFProcessModel() {
            super();
            this.setId("44D5934C-23D3-441C-892F-95A79AC57267");
            this.setName("提交");
            this.setLeftPos(5);
            this.setTopPos(165);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P8WFProcessModel extends WFInteractiveProcessModelBase {
        public P8WFProcessModel() {
            super();
            this.setId("2427ED71-B321-4743-842F-491811870AD1");
            this.setName("入座确认");
            this.setLeftPos(1280);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setWFStepValue("40");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcRoleModel procRole0 = new WFProcRoleModel();
            procRole0.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole0.setId("E24E1587-1989-42BF-98F0-1F2661BB1A55");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("FFBD0A55-6AE6-42AE-8FA2-22039DA4FEA8");
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
            this.setId("2471ABDC-15E7-44C9-8796-5BB96FAD4591");
            this.setName("确认通报");
            this.setLeftPos(1500);
            this.setTopPos(340);
            this.setThreadSN(-1);
            this.setDEActionName("CHQKTB");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
        }

    }
    /**
     * 交互处理
     */
    class P10WFProcessModel extends WFInteractiveProcessModelBase {
        public P10WFProcessModel() {
            super();
            this.setId("333FB8B5-D228-4891-B843-6F20D364F4C7");
            this.setName("参会名单确认");
            this.setLeftPos(280);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("9E20B2E3-42D0-4B0C-BFD8-B61813BA5F38");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("F76FE824-38A8-4530-80A7-63FA60CD5EC6");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P11WFProcessModel extends WFDEActionProcessModelBase {
        public P11WFProcessModel() {
            super();
            this.setId("D8F91F4D-4608-4B07-9D5F-B0C4065BB1EA");
            this.setName("设置结束状态值");
            this.setLeftPos(1500);
            this.setTopPos(660);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("HYSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("SFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P12WFProcessModel extends WFInteractiveProcessModelBase {
        public P12WFProcessModel() {
            super();
            this.setId("54CE2F5B-3283-4C75-98FB-445194CB041B");
            this.setName("座位图确认");
            this.setLeftPos(880);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setWFStepValue("30");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("B00C73AD-CB57-418F-A46A-8B4DA9A51ABC");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("B7F74141-12DE-42D2-83D7-97B58D8282BB");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 实体操作处理
     */
    class P13WFProcessModel extends WFDEActionProcessModelBase {
        public P13WFProcessModel() {
            super();
            this.setId("8FEEA5AB-5A87-4102-8DCD-5935EE0156E8");
            this.setName("添加参会人员");
            this.setLeftPos(80);
            this.setTopPos(160);
            this.setThreadSN(-1);
            this.setDEActionName("TJHYCHRY");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
        }

    }

//定义流程连接
    /**
     * 交互处理
     */
    class P0WFLinkModel extends WFInteractiveLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("5E99A539-2A2A-45DC-A18A-6B08DFE734A0");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
            //会议室申请
            this.setFrom("1EB4AF52-D4B7-4C99-B97D-3169538EF69D");
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
            this.setId("AFECB75F-7675-4EED-AB5B-A422CB0F14F7");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新会议室使用开始状态
            this.setNext("EE820C02-53F2-4378-8E95-91921302BC39");
            //会议室申请
            this.setFrom("1EB4AF52-D4B7-4C99-B97D-3169538EF69D");
            this.setLogicName("申请成功");
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
            this.setId("6A0352D2-0905-44F2-A379-C6E4122C658E");
            this.setName("AC4020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
            //入座确认
            this.setFrom("2427ED71-B321-4743-842F-491811870AD1");
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
            this.setId("A2B734F1-37DC-47E8-9164-ED757D65E03E");
            this.setName("AC4010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //参会情况通报
            this.setNext("F6DB1111-25DF-4AF5-AF71-E367D289A070");
            //入座确认
            this.setFrom("2427ED71-B321-4743-842F-491811870AD1");
            this.setLogicName("入座确认");
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
            this.setId("923E8168-F376-4E5D-B58D-5B705FA68C8F");
            this.setName("通报完成");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //更新会议室使用结束状态
            this.setNext("ACF78B18-DC14-4E1E-A974-C0CEDCC6C907");
            //确认通报
            this.setFrom("2471ABDC-15E7-44C9-8796-5BB96FAD4591");
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
            this.setId("581A9CC7-9952-45F7-B542-425C603A0E77");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
            //参会名单确认
            this.setFrom("333FB8B5-D228-4891-B843-6F20D364F4C7");
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
            this.setId("1D8956A8-464E-4EBF-8A67-AE265573A559");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //会议室申请
            this.setNext("1EB4AF52-D4B7-4C99-B97D-3169538EF69D");
            //参会名单确认
            this.setFrom("333FB8B5-D228-4891-B843-6F20D364F4C7");
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
    class P7WFLinkModel extends WFRouteLinkModelBase {
        public P7WFLinkModel() {
            super();
            this.setId("087E6148-8A7D-45EE-B769-7ADCF1173C87");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //添加参会人员
            this.setNext("8FEEA5AB-5A87-4102-8DCD-5935EE0156E8");
            //提交
            this.setFrom("44D5934C-23D3-441C-892F-95A79AC57267");
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
    class P8WFLinkModel extends WFInteractiveLinkModelBase {
        public P8WFLinkModel() {
            super();
            this.setId("96352101-D201-42B2-9562-917248DE0676");
            this.setName("AC3020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
            //座位图确认
            this.setFrom("54CE2F5B-3283-4C75-98FB-445194CB041B");
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
    class P9WFLinkModel extends WFInteractiveLinkModelBase {
        public P9WFLinkModel() {
            super();
            this.setId("7D806F79-3BC3-472D-99C3-3F3A510A7323");
            this.setName("AC3010");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //发送座位号通知
            this.setNext("910C1461-7F1D-47BA-A547-F212DBCBAD4C");
            //座位图确认
            this.setFrom("54CE2F5B-3283-4C75-98FB-445194CB041B");
            this.setLogicName("发送座位号通知");
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
    class P10WFLinkModel extends WFRouteLinkModelBase {
        public P10WFLinkModel() {
            super();
            this.setId("E65F9B47-1531-433F-B322-5A5BE2B81997");
            this.setName("添加参会人员结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //参会名单确认
            this.setNext("333FB8B5-D228-4891-B843-6F20D364F4C7");
            //添加参会人员
            this.setFrom("8FEEA5AB-5A87-4102-8DCD-5935EE0156E8");
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
    class P11WFLinkModel extends WFRouteLinkModelBase {
        public P11WFLinkModel() {
            super();
            this.setId("5683FC2B-019E-4EB9-990B-C502050F6AD1");
            this.setName("通知完成");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //入座确认
            this.setNext("2427ED71-B321-4743-842F-491811870AD1");
            //发送座位号通知
            this.setFrom("910C1461-7F1D-47BA-A547-F212DBCBAD4C");
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
    class P12WFLinkModel extends WFRouteLinkModelBase {
        public P12WFLinkModel() {
            super();
            this.setId("0CE768F8-D2FB-4A6C-B78F-373B75DB9099");
            this.setName("更新会议室使用状态成功");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //设置结束状态值
            this.setNext("D8F91F4D-4608-4B07-9D5F-B0C4065BB1EA");
            //更新会议室使用结束状态
            this.setFrom("ACF78B18-DC14-4E1E-A974-C0CEDCC6C907");
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
    class P13WFLinkModel extends WFRouteLinkModelBase {
        public P13WFLinkModel() {
            super();
            this.setId("AA16FBA9-C218-426D-B0D2-CD903DCEB5E2");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("169CDA62-D254-4CC3-B908-B8C13AE002B8");
            //拒绝
            this.setFrom("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
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
    class P14WFLinkModel extends WFRouteLinkModelBase {
        public P14WFLinkModel() {
            super();
            this.setId("23058D72-8FA1-4F7B-91C3-C13623CB8866");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("169CDA62-D254-4CC3-B908-B8C13AE002B8");
            //设置结束状态值
            this.setFrom("D8F91F4D-4608-4B07-9D5F-B0C4065BB1EA");
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
    class P15WFLinkModel extends WFRouteLinkModelBase {
        public P15WFLinkModel() {
            super();
            this.setId("6BF28060-26FC-4875-82B5-2E61B6C0E8E7");
            this.setName("更新会议室状态成功");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //座位图确认
            this.setNext("54CE2F5B-3283-4C75-98FB-445194CB041B");
            //更新会议室使用开始状态
            this.setFrom("EE820C02-53F2-4378-8E95-91921302BC39");
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
    class P16WFLinkModel extends WFInteractiveLinkModelBase {
        public P16WFLinkModel() {
            super();
            this.setId("7CDAA1AE-9BB6-453C-A2E5-6E31E4C43479");
            this.setName("AC5020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("C0B849D9-CC6D-4DED-8DB9-9111260D6B50");
            //参会情况通报
            this.setFrom("F6DB1111-25DF-4AF5-AF71-E367D289A070");
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
    class P17WFLinkModel extends WFInteractiveLinkModelBase {
        public P17WFLinkModel() {
            super();
            this.setId("8E5E1FA3-6CA3-4662-A962-AC938792B031");
            this.setName("AC5010");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //确认通报
            this.setNext("2471ABDC-15E7-44C9-8796-5BB96FAD4591");
            //参会情况通报
            this.setFrom("F6DB1111-25DF-4AF5-AF71-E367D289A070");
            this.setLogicName("通报");
            this.setNextCondition("ANY");
        }
        @Override
        protected void onInit() throws Exception {
            super.onInit();
        }
    }




    public YBHYSQv1WFVersionModel() {
        super();

        this.setId("44D5934C-23D3-441C-892F-95A79AC57267");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 更新会议室使用结束状态
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 发送座位号通知
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 拒绝
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 参会情况通报
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 结束
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 会议室申请
        P5WFProcessModel p5 = new P5WFProcessModel();
        p5.init(this);
        registerWFProcessModel(p5);

        //注册处理 更新会议室使用开始状态
        P6WFProcessModel p6 = new P6WFProcessModel();
        p6.init(this);
        registerWFProcessModel(p6);

        //注册处理 提交
        P7WFProcessModel p7 = new P7WFProcessModel();
        p7.init(this);
        registerWFProcessModel(p7);

        //注册处理 入座确认
        P8WFProcessModel p8 = new P8WFProcessModel();
        p8.init(this);
        registerWFProcessModel(p8);

        //注册处理 确认通报
        P9WFProcessModel p9 = new P9WFProcessModel();
        p9.init(this);
        registerWFProcessModel(p9);

        //注册处理 参会名单确认
        P10WFProcessModel p10 = new P10WFProcessModel();
        p10.init(this);
        registerWFProcessModel(p10);

        //注册处理 设置结束状态值
        P11WFProcessModel p11 = new P11WFProcessModel();
        p11.init(this);
        registerWFProcessModel(p11);

        //注册处理 座位图确认
        P12WFProcessModel p12 = new P12WFProcessModel();
        p12.init(this);
        registerWFProcessModel(p12);

        //注册处理 添加参会人员
        P13WFProcessModel p13 = new P13WFProcessModel();
        p13.init(this);
        registerWFProcessModel(p13);

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

        //注册处理 AC4020
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        //注册处理 AC4010
        P3WFLinkModel p3 = new P3WFLinkModel();
        p3.init(this);
        registerWFLinkModel(p3);

        //注册处理 通报完成
        P4WFLinkModel p4 = new P4WFLinkModel();
        p4.init(this);
        registerWFLinkModel(p4);

        //注册处理 AC1020
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 AC1010
        P6WFLinkModel p6 = new P6WFLinkModel();
        p6.init(this);
        registerWFLinkModel(p6);

        //注册处理 提交
        P7WFLinkModel p7 = new P7WFLinkModel();
        p7.init(this);
        registerWFLinkModel(p7);

        //注册处理 AC3020
        P8WFLinkModel p8 = new P8WFLinkModel();
        p8.init(this);
        registerWFLinkModel(p8);

        //注册处理 AC3010
        P9WFLinkModel p9 = new P9WFLinkModel();
        p9.init(this);
        registerWFLinkModel(p9);

        //注册处理 添加参会人员结束
        P10WFLinkModel p10 = new P10WFLinkModel();
        p10.init(this);
        registerWFLinkModel(p10);

        //注册处理 通知完成
        P11WFLinkModel p11 = new P11WFLinkModel();
        p11.init(this);
        registerWFLinkModel(p11);

        //注册处理 更新会议室使用状态成功
        P12WFLinkModel p12 = new P12WFLinkModel();
        p12.init(this);
        registerWFLinkModel(p12);

        //注册处理 结束
        P13WFLinkModel p13 = new P13WFLinkModel();
        p13.init(this);
        registerWFLinkModel(p13);

        //注册处理 结束
        P14WFLinkModel p14 = new P14WFLinkModel();
        p14.init(this);
        registerWFLinkModel(p14);

        //注册处理 更新会议室状态成功
        P15WFLinkModel p15 = new P15WFLinkModel();
        p15.init(this);
        registerWFLinkModel(p15);

        //注册处理 AC5020
        P16WFLinkModel p16 = new P16WFLinkModel();
        p16.init(this);
        registerWFLinkModel(p16);

        //注册处理 AC5010
        P17WFLinkModel p17 = new P17WFLinkModel();
        p17.init(this);
        registerWFLinkModel(p17);

        super.prepareWFLinkModels();
    }

}