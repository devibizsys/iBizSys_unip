/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;


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

import com.sa.unip.srv.xxtz.entity.OA_RZRY;
import com.sa.unip.srv.xxtz.service.OA_RZRYService;

/**
 * 实体[OA_RZRY]逻辑处理[更新是否已读的状态]模型对象
 */
public class OA_RZRYUPDATESFYDZTLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_RZRY> {

    private static final Log log = LogFactory.getLog(OA_RZRYUPDATESFYDZTLogicModel.class);

    public OA_RZRYUPDATESFYDZTLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("030F0D2E-8EC5-47E6-92BA-70A4A5B26352");
        this.setName("UPDATESFYDZT");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.xxtz.entity.OA_RZRY _default = (com.sa.unip.srv.xxtz.entity.OA_RZRY)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executePrepareparam1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[更新值]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.xxtz.entity.OA_RZRY _default = (com.sa.unip.srv.xxtz.entity.OA_RZRY)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(com.sa.unip.srv.xxtz.service.OA_RZRYService.class,sessionFactory );
        service.executeAction(com.sa.unip.srv.xxtz.service.OA_RZRYService.ACTION_UPDATE,_default);

    }
    /**
    * 执行逻辑处理[设置值]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.xxtz.entity.OA_RZRY _default = (com.sa.unip.srv.xxtz.entity.OA_RZRY)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[OA_RZRYID] ==> Default[OA_RZRYID]
        _default.set("OA_RZRYID",_default.get("OA_RZRYID"));
        //直接值[20] ==> Default[SFYD]
        _default.set("SFYD","20");

        if(true) {
            executeDeaction1(iActionContext);
        }
    }

}