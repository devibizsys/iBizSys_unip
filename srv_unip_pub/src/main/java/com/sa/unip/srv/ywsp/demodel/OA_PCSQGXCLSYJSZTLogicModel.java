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
 * 实体[OA_PCSQ]逻辑处理[更新车辆使用结束状态]模型对象
 */
public class OA_PCSQGXCLSYJSZTLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_PCSQ> {

    private static final Log log = LogFactory.getLog(OA_PCSQGXCLSYJSZTLogicModel.class);

    public OA_PCSQGXCLSYJSZTLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("B76864F6-62A4-402D-8F7E-F7E82255EA14");
        this.setName("GXCLSYJSZT");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        iActionContext.setParam("CLDX2",new com.sa.unip.srv.jcsj.entity.OA_CL());
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_PCSQ _default = (com.sa.unip.srv.ywsp.entity.OA_PCSQ)iActionContext.getParam("Default");
        com.sa.unip.srv.jcsj.entity.OA_CL cLDX2 = (com.sa.unip.srv.jcsj.entity.OA_CL)iActionContext.getParam("CLDX2");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executePrepareparam1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[设置车辆使用参数]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_PCSQ _default = (com.sa.unip.srv.ywsp.entity.OA_PCSQ)iActionContext.getParam("Default");
        com.sa.unip.srv.jcsj.entity.OA_CL cLDX2 = (com.sa.unip.srv.jcsj.entity.OA_CL)iActionContext.getParam("CLDX2");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[OA_CLID] ==> CLDX2[OA_CLID]
        cLDX2.set("OA_CLID",_default.get("OA_CLID"));
        //直接值[10] ==> CLDX2[SYQK]
        cLDX2.set("SYQK","10");
        //空值（NULL） ==> CLDX2[SYSJ]
        cLDX2.set("SYSJ",null);

        if(true) {
            executeDeaction1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[更新车辆使用结束状态]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_PCSQ _default = (com.sa.unip.srv.ywsp.entity.OA_PCSQ)iActionContext.getParam("Default");
        com.sa.unip.srv.jcsj.entity.OA_CL cLDX2 = (com.sa.unip.srv.jcsj.entity.OA_CL)iActionContext.getParam("CLDX2");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_CLService.class,sessionFactory );
        service.executeAction(com.sa.unip.srv.jcsj.service.OA_CLService.ACTION_UPDATE,cLDX2);

    }

}