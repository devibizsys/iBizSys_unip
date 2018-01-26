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

import com.sa.unip.srv.ywsp.entity.OA_PCSQ;
import com.sa.unip.srv.ywsp.service.OA_PCSQService;

/**
 * 实体[OA_PCSQ]逻辑处理[更新车辆使用开始状态]模型对象
 */
public class OA_PCSQGXCLSYKSZTLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_PCSQ> {

    private static final Log log = LogFactory.getLog(OA_PCSQGXCLSYKSZTLogicModel.class);

    public OA_PCSQGXCLSYKSZTLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("659CF30A-07B8-4F1B-A9E5-06348CC99B94");
        this.setName("GXCLSYKSZT");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        iActionContext.setParam("CLDX",new com.sa.unip.srv.jcsj.entity.OA_CL());
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[设置车辆使用参数]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.jcsj.entity.OA_CL cLDX = (com.sa.unip.srv.jcsj.entity.OA_CL)iActionContext.getParam("CLDX");
        com.sa.unip.srv.ywsp.entity.OA_PCSQ _default = (com.sa.unip.srv.ywsp.entity.OA_PCSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[CFSJ] ==> CLDX[SYSJ]
        cLDX.set("SYSJ",_default.get("CFSJ"));
        //Default[OA_CLID] ==> CLDX[OA_CLID]
        cLDX.set("OA_CLID",_default.get("OA_CLID"));
        //直接值[20] ==> CLDX[SYQK]
        cLDX.set("SYQK","20");

        if(true) {
            executeDeaction1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[更新车辆使用开始状态]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.jcsj.entity.OA_CL cLDX = (com.sa.unip.srv.jcsj.entity.OA_CL)iActionContext.getParam("CLDX");
        com.sa.unip.srv.ywsp.entity.OA_PCSQ _default = (com.sa.unip.srv.ywsp.entity.OA_PCSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_CLService.class,sessionFactory );
        service.executeAction(com.sa.unip.srv.jcsj.service.OA_CLService.ACTION_UPDATE,cLDX);

    }
    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.jcsj.entity.OA_CL cLDX = (com.sa.unip.srv.jcsj.entity.OA_CL)iActionContext.getParam("CLDX");
        com.sa.unip.srv.ywsp.entity.OA_PCSQ _default = (com.sa.unip.srv.ywsp.entity.OA_PCSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executePrepareparam1(iActionContext);
        }
    }

}