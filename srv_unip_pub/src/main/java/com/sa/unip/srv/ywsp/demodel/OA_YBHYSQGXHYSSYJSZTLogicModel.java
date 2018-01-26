/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import java.util.List;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.IActionContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.IDataRow;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.db.SqlParamList;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.pswf.core.IWFService;
import net.ibizsys.pswf.core.WFActionParam;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_YBHYSQ;
import com.sa.unip.srv.ywsp.service.OA_YBHYSQService;

/**
 * 实体[OA_YBHYSQ]逻辑处理[更新会议室使用结束状态]模型对象
 */
public class OA_YBHYSQGXHYSSYJSZTLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_YBHYSQ> {

    private static final Log log = LogFactory.getLog(OA_YBHYSQGXHYSSYJSZTLogicModel.class);

    public OA_YBHYSQGXHYSSYJSZTLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("F93F7228-C401-4A46-85B5-1E0C91129970");
        this.setName("GXHYSSYJSZT");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        iActionContext.setParam("HYSDX2",new com.sa.unip.srv.jcsj.entity.OA_HYS());
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.jcsj.entity.OA_HYS hYSDX2 = (com.sa.unip.srv.jcsj.entity.OA_HYS)iActionContext.getParam("HYSDX2");
        com.sa.unip.srv.ywsp.entity.OA_YBHYSQ _default = (com.sa.unip.srv.ywsp.entity.OA_YBHYSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executePrepareparam1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[更新会议室结束状态]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.jcsj.entity.OA_HYS hYSDX2 = (com.sa.unip.srv.jcsj.entity.OA_HYS)iActionContext.getParam("HYSDX2");
        com.sa.unip.srv.ywsp.entity.OA_YBHYSQ _default = (com.sa.unip.srv.ywsp.entity.OA_YBHYSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[OA_HYSID] ==> HYSDX2[OA_HYSID]
        hYSDX2.set("OA_HYSID",_default.get("OA_HYSID"));
        //直接值[10] ==> HYSDX2[SYQK]
        hYSDX2.set("SYQK","10");
        //直接值[null] ==> HYSDX2[SYSJ]
        hYSDX2.set("SYSJ","");

        if(true) {
            executeDeaction1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[更新会议室使用结束状态]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.jcsj.entity.OA_HYS hYSDX2 = (com.sa.unip.srv.jcsj.entity.OA_HYS)iActionContext.getParam("HYSDX2");
        com.sa.unip.srv.ywsp.entity.OA_YBHYSQ _default = (com.sa.unip.srv.ywsp.entity.OA_YBHYSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_HYSService.class,sessionFactory );
        service.executeAction(com.sa.unip.srv.jcsj.service.OA_HYSService.ACTION_UPDATE,hYSDX2);

    }

}