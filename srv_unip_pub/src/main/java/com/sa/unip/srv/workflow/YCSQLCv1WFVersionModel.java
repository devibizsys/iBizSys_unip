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
 * 用餐申请流程 v1 流程模型
 */
public class YCSQLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 结束处理
     */
    class P0WFProcessModel extends WFEndProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("A01916E6-45E5-47D3-B43A-06B5B782C307");
            this.setName("结束");
            this.setLeftPos(320);
            this.setTopPos(480);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P1WFProcessModel extends WFDEActionProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("370EC48A-9B9E-4FFA-818F-77FE4B52928E");
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
            procParam0.setDstField("YCSFSHTG");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("0");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("YCSQZT");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("40");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }
    /**
     * 交互处理
     */
    class P2WFProcessModel extends WFInteractiveProcessModelBase {
        public P2WFProcessModel() {
            super();
            this.setId("1B4282E7-288B-4BB8-822A-E61974A00632");
            this.setName("部门领导审核");
            this.setLeftPos(180);
            this.setTopPos(60);
            this.setThreadSN(-1);
            this.setWFStepValue("10");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理角色
            WFProcSysActorRoleModel procRole0 = new WFProcSysActorRoleModel();
            procRole0.setId("40E649C8-ED80-49E4-A096-8B7A639F78C8");
            procRole0.setName("[当前操作者]");
            procRole0.setWFProcRoleType("CURACTOR");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcRoleModel procRole1 = new WFProcRoleModel();
            procRole1.setWFRoleId("28155180-21CF-4620-B528-3944BE8C5537");
            procRole1.setId("80D11945-DC0B-4480-A8E6-5499813DEBF8");
            procRole1.setName("消息用户组");
            procRole1.setWFProcRoleType("WFROLE");
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
            this.setId("0D12AE5B-87C9-42C6-B549-84241A7D6864");
            this.setName("承办处领导审核");
            this.setLeftPos(480);
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
            procRole0.setId("7C2427BE-CAB6-497F-8498-174048215947");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("834641E7-45D2-4BA7-9319-1BED624D9AEE");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
            procRole1.init(this);
            this.registerWFProcRoleModel(procRole1);
        }
    }
    /**
     * 开始处理
     */
    class P4WFProcessModel extends WFStartProcessModelBase {
        public P4WFProcessModel() {
            super();
            this.setId("C61341C9-BAA5-432A-A31D-0497DB687569");
            this.setName("提交");
            this.setLeftPos(60);
            this.setTopPos(60);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P5WFProcessModel extends WFDEActionProcessModelBase {
        public P5WFProcessModel() {
            super();
            this.setId("1C764D9D-CD90-479E-BED1-F7C822690820");
            this.setName("更新结束状态值");
            this.setLeftPos(700);
            this.setTopPos(60);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("YCSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
            WFDEActionProcessParamModel procParam1 = new WFDEActionProcessParamModel();
            procParam1.setDstField("YCSFSHTG");
            procParam1.setSrcValueType("");
            procParam1.setSrcValue("1");
            this.registerWFDEActionProcessParamModel(procParam1);
        }

    }

//定义流程连接
    /**
     * 交互处理
     */
    class P0WFLinkModel extends WFInteractiveLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("AAF06E96-05BB-4B73-96FF-D7B8DA6B0D3F");
            this.setName("AC2020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("370EC48A-9B9E-4FFA-818F-77FE4B52928E");
            //承办处领导审核
            this.setFrom("0D12AE5B-87C9-42C6-B549-84241A7D6864");
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
            this.setId("C4C75AAC-CC10-4FDF-9268-A13B88B3AFD0");
            this.setName("AC2010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("1C764D9D-CD90-479E-BED1-F7C822690820");
            //承办处领导审核
            this.setFrom("0D12AE5B-87C9-42C6-B549-84241A7D6864");
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
            this.setId("9882E870-DE51-4B81-BAE8-F5689E8A61F5");
            this.setName("AC1020");
            this.setSrcEndPoint("BottomLeft");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //拒绝
            this.setNext("370EC48A-9B9E-4FFA-818F-77FE4B52928E");
            //部门领导审核
            this.setFrom("1B4282E7-288B-4BB8-822A-E61974A00632");
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
            this.setId("467EE761-A415-4DE4-9B77-1369B9CC5714");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //承办处领导审核
            this.setNext("0D12AE5B-87C9-42C6-B549-84241A7D6864");
            //部门领导审核
            this.setFrom("1B4282E7-288B-4BB8-822A-E61974A00632");
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
            this.setId("A4E9A7EF-FBF0-4A13-BA06-EF66348AFBE7");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("RightMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("A01916E6-45E5-47D3-B43A-06B5B782C307");
            //更新结束状态值
            this.setFrom("1C764D9D-CD90-479E-BED1-F7C822690820");
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
    class P5WFLinkModel extends WFRouteLinkModelBase {
        public P5WFLinkModel() {
            super();
            this.setId("8B5A77CB-D726-43AB-8A79-4084245C4726");
            this.setName("结束");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("TopCenter");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("A01916E6-45E5-47D3-B43A-06B5B782C307");
            //拒绝
            this.setFrom("370EC48A-9B9E-4FFA-818F-77FE4B52928E");
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
            this.setId("B3E0045F-DFAB-4086-8EA5-512BC8C1FAC4");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("1B4282E7-288B-4BB8-822A-E61974A00632");
            //提交
            this.setFrom("C61341C9-BAA5-432A-A31D-0497DB687569");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }




    public YCSQLCv1WFVersionModel() {
        super();

        this.setId("C61341C9-BAA5-432A-A31D-0497DB687569");
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

        //注册处理 承办处领导审核
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

        //注册处理 结束
        P5WFLinkModel p5 = new P5WFLinkModel();
        p5.init(this);
        registerWFLinkModel(p5);

        //注册处理 提交
        P6WFLinkModel p6 = new P6WFLinkModel();
        p6.init(this);
        registerWFLinkModel(p6);

        super.prepareWFLinkModels();
    }

}