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
 * 演示申请（测试） v1 流程模型
 */
public class DEMOLCv1WFVersionModel extends net.ibizsys.pswf.core.WFVersionModelBase  {

    //定义流程处理
    /**
     * 开始处理
     */
    class P0WFProcessModel extends WFStartProcessModelBase {
        public P0WFProcessModel() {
            super();
            this.setId("D97E8A17-019C-47D5-A772-4D8BF677AD26");
            this.setName("开始流程");
            this.setLeftPos(55);
            this.setTopPos(45);
            this.setThreadSN(-1);
        }
    }
    /**
     * 交互处理
     */
    class P1WFProcessModel extends WFInteractiveProcessModelBase {
        public P1WFProcessModel() {
            super();
            this.setId("8FB40B80-F562-44FB-AC7E-D44217B41079");
            this.setName("部门领导审核");
            this.setLeftPos(220);
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
            procRole0.setId("23070BE0-5AF8-4C2C-B119-CCCB329C3B15");
            procRole0.setName("消息用户组");
            procRole0.setWFProcRoleType("WFROLE");
            procRole0.init(this);
            this.registerWFProcRoleModel(procRole0);
            WFProcSysActorRoleModel procRole1 = new WFProcSysActorRoleModel();
            procRole1.setId("D3994F68-B2E1-4D78-B111-A81B54170F17");
            procRole1.setName("[当前操作者]");
            procRole1.setWFProcRoleType("CURACTOR");
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
            this.setId("77D0C67C-644A-40E2-90EB-849C23CF7645");
            this.setName("结束");
            this.setLeftPos(680);
            this.setTopPos(60);
            this.setThreadSN(-1);
        }
    }
    /**
     * 实体操作处理
     */
    class P3WFProcessModel extends WFDEActionProcessModelBase {
        public P3WFProcessModel() {
            super();
            this.setId("102F7185-5609-4EF1-A948-3C2887FD58A1");
            this.setName("更新结束状态值");
            this.setLeftPos(440);
            this.setTopPos(40);
            this.setThreadSN(-1);
            this.setDEActionName("Update");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();

            //注册处理参数
            WFDEActionProcessParamModel procParam0 = new WFDEActionProcessParamModel();
            procParam0.setDstField("DEMOSQZT");
            procParam0.setSrcValueType("");
            procParam0.setSrcValue("30");
            this.registerWFDEActionProcessParamModel(procParam0);
        }

    }

//定义流程连接
    /**
     * 路由处理
     */
    class P0WFLinkModel extends WFRouteLinkModelBase {
        public P0WFLinkModel() {
            super();
            this.setId("F7C23633-68D9-4360-876A-C18D2C161545");
            this.setName("结束");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //结束
            this.setNext("77D0C67C-644A-40E2-90EB-849C23CF7645");
            //更新结束状态值
            this.setFrom("102F7185-5609-4EF1-A948-3C2887FD58A1");
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
            this.setId("E9CB7C0D-0197-43DC-8819-A4BA47C33FB5");
            this.setName("AC1010");
            this.setSrcEndPoint("BottomRight");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //更新结束状态值
            this.setNext("102F7185-5609-4EF1-A948-3C2887FD58A1");
            //部门领导审核
            this.setFrom("8FB40B80-F562-44FB-AC7E-D44217B41079");
            this.setLogicName("提交");
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
    class P2WFLinkModel extends WFRouteLinkModelBase {
        public P2WFLinkModel() {
            super();
            this.setId("91516C88-95B3-406E-BE43-F4A7126E92FD");
            this.setName("提交");
            this.setSrcEndPoint("BottomCenter");
            this.setDstEndPoint("LeftMiddle");
            this.setThreadLinkMode(1);
            //部门领导审核
            this.setNext("8FB40B80-F562-44FB-AC7E-D44217B41079");
            //开始流程
            this.setFrom("D97E8A17-019C-47D5-A772-4D8BF677AD26");
            this.setLogicName("");
        }

        @Override
        protected void onInit() throws Exception {
            super.onInit();
            //注册条件
        }
    }




    public DEMOLCv1WFVersionModel() {
        super();

        this.setId("D97E8A17-019C-47D5-A772-4D8BF677AD26");
        this.setWFVersion(1);
    }

    @Override
    protected void prepareWFProcessModels() throws Exception {
        //注册处理 开始流程
        P0WFProcessModel p0 = new P0WFProcessModel();
        p0.init(this);
        registerWFProcessModel(p0);

        //注册处理 部门领导审核
        P1WFProcessModel p1 = new P1WFProcessModel();
        p1.init(this);
        registerWFProcessModel(p1);

        //注册处理 结束
        P2WFProcessModel p2 = new P2WFProcessModel();
        p2.init(this);
        registerWFProcessModel(p2);

        //注册处理 更新结束状态值
        P3WFProcessModel p3 = new P3WFProcessModel();
        p3.init(this);
        registerWFProcessModel(p3);

        super.prepareWFProcessModels();
    }


    @Override
    protected void prepareWFLinkModels() throws Exception {
        //注册处理 结束
        P0WFLinkModel p0 = new P0WFLinkModel();
        p0.init(this);
        registerWFLinkModel(p0);

        //注册处理 AC1010
        P1WFLinkModel p1 = new P1WFLinkModel();
        p1.init(this);
        registerWFLinkModel(p1);

        //注册处理 提交
        P2WFLinkModel p2 = new P2WFLinkModel();
        p2.init(this);
        registerWFLinkModel(p2);

        super.prepareWFLinkModels();
    }

}