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
 * 日志提交流程 v1 流程模型
 */
public class RZTJLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 开始处理
     */
    class P0WFProcessModel extends WFStartProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("9752FFBD-4237-472D-ADE3-65E4D6F77A0B");
            this.setName("提交");
            this.setLeftPos(30);
            this.setTopPos(60);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P1WFProcessModel extends WFDEActionProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("5B1F7F2B-69C0-46D1-BB6E-3401288C5D8F");
            this.setName("更新结束状态值");
            this.setLeftPos(660);
            this.setTopPos(40);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("RZSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("RZTJZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 实体操作处理
     */
    class P2WFProcessModel extends WFDEActionProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("E52F72FD-C8D9-4ECF-AAF0-1F8270DF1BAE");
            this.setName("发送日志消息");
            this.setLeftPos(140);
            this.setTopPos(40);
            this.setThreadSN(-1);
            this.setDEActionName("FSRZXX");
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
    class P3WFProcessModel extends WFInteractiveProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("97621928-0BC6-4966-A391-C5B61CDFC043");
            this.setName("部门领导审核");
            this.setLeftPos(400);
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
            procRole0.setId("BCA92107-68E0-4930-B42C-B6EC5DD80767");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("CCE4E433-DFB1-4723-9484-10C8FEFF20CE");
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
            this.setId("2E9A58C0-1EC2-40FF-9ACE-48942A8E8CCF");
            this.setName("结束");
            this.setLeftPos(500);
            this.setTopPos(420);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P5WFProcessModel extends WFDEActionProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("065AA3D3-85DF-4AAB-9166-01FCB6958721");
            this.setName("拒绝");
            this.setLeftPos(440);
            this.setTopPos(220);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("RZTJZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("RZSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("0");
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
            this.setId("E868A848-4A19-4A63-AF40-E32A15B5C470");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("2E9A58C0-1EC2-40FF-9ACE-48942A8E8CCF");
            //拒绝
            this.setFrom("065AA3D3-85DF-4AAB-9166-01FCB6958721");
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
            this.setId("73D62417-BFCA-41D7-A2B1-32B59A579898");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("2E9A58C0-1EC2-40FF-9ACE-48942A8E8CCF");
            //更新结束状态值
            this.setFrom("5B1F7F2B-69C0-46D1-BB6E-3401288C5D8F");
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
            this.setId("B5641EC8-B83F-4BF8-BFCB-23A287047B9F");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //发送日志消息
            this.setNext("E52F72FD-C8D9-4ECF-AAF0-1F8270DF1BAE");
            //提交
            this.setFrom("9752FFBD-4237-472D-ADE3-65E4D6F77A0B");
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
            this.setId("A9315413-754E-46B3-8D35-5140CBBD08DF");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("065AA3D3-85DF-4AAB-9166-01FCB6958721");
            //部门领导审核
            this.setFrom("97621928-0BC6-4966-A391-C5B61CDFC043");
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
            this.setId("7F758091-5448-48EB-9A24-265E329C7BB8");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("5B1F7F2B-69C0-46D1-BB6E-3401288C5D8F");
            //部门领导审核
            this.setFrom("97621928-0BC6-4966-A391-C5B61CDFC043");
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
            this.setId("612D8733-7F23-47E1-9C27-56A67AF0AABB");
            this.setName("日志发送完成");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("97621928-0BC6-4966-A391-C5B61CDFC043");
            //发送日志消息
            this.setFrom("E52F72FD-C8D9-4ECF-AAF0-1F8270DF1BAE");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }




    public RZTJLCv1WFVersionModel() {
        super();

        this.setId("9752FFBD-4237-472D-ADE3-65E4D6F77A0B");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 提交
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 更新结束状态值
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 发送日志消息
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 部门领导审核
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        //注册处理 结束
        P4WFProcessModel p4 = new P4WFProcessModel();
        p4.init(this);
        registerWFProcessModel(p4);

        //注册处理 拒绝
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

        //注册处理 日志发送完成
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        super.prepareWFLinkModels();
    }

}