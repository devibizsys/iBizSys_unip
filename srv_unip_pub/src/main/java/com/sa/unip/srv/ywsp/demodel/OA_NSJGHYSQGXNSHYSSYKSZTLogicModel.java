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

import com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ;
import com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService;

/**
 * 实体[OA_NSJGHYSQ]逻辑处理[更新内设会议室使用开始状态]模型对象
 */
public class OA_NSJGHYSQGXNSHYSSYKSZTLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_NSJGHYSQ> {

    private static final Log log = LogFactory.getLog(OA_NSJGHYSQGXNSHYSSYKSZTLogicModel.class);

    public OA_NSJGHYSQGXNSHYSSYKSZTLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("AA79668D-02A5-44CD-8823-D3782DC810E6");
        this.setName("GXNSHYSSYKSZT");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        iActionContext.setParam("HYSDX",new com.sa.unip.srv.jcsj.entity.OA_HYS());
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[更新内设会议室状态]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ _default = (com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ)iActionContext.getParam("Default");
        com.sa.unip.srv.jcsj.entity.OA_HYS hYSDX = (com.sa.unip.srv.jcsj.entity.OA_HYS)iActionContext.getParam("HYSDX");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_HYSService.class,sessionFactory );
        service.executeAction(com.sa.unip.srv.jcsj.service.OA_HYSService.ACTION_UPDATE,hYSDX);

    }
    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ _default = (com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ)iActionContext.getParam("Default");
        com.sa.unip.srv.jcsj.entity.OA_HYS hYSDX = (com.sa.unip.srv.jcsj.entity.OA_HYS)iActionContext.getParam("HYSDX");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executePrepareparam1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[设置内设会议室参数]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ _default = (com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ)iActionContext.getParam("Default");
        com.sa.unip.srv.jcsj.entity.OA_HYS hYSDX = (com.sa.unip.srv.jcsj.entity.OA_HYS)iActionContext.getParam("HYSDX");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[HYSID] ==> HYSDX[OA_HYSID]
        hYSDX.set("OA_HYSID",_default.get("HYSID"));
        //Default[HYSJ] ==> HYSDX[SYSJ]
        hYSDX.set("SYSJ",_default.get("HYSJ"));
        //直接值[20] ==> HYSDX[SYQK]
        hYSDX.set("SYQK","20");

        if(true) {
            executeDeaction1(iActionContext);
        }
    }

}