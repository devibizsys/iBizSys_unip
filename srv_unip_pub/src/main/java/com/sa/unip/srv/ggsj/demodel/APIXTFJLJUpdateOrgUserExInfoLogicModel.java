/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.demodel;


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

import com.sa.unip.srv.ggsj.entity.APIXTFJLJ;
import com.sa.unip.srv.ggsj.service.APIXTFJLJService;

/**
 * 实体[API_XT_FJLJ]逻辑处理[更新用户额外信息]模型对象
 */
public class APIXTFJLJUpdateOrgUserExInfoLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<APIXTFJLJ> {

    private static final Log log = LogFactory.getLog(APIXTFJLJUpdateOrgUserExInfoLogicModel.class);

    public APIXTFJLJUpdateOrgUserExInfoLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("5CE93B32-7BBD-4DC3-A79D-6B4BE5C70DEA");
        this.setName("UpdateOrgUserExInfo");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        iActionContext.setParam("UserExInfo",new com.sa.unip.srv.ggsj.entity.APIXTFJLJ());
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[更新用户数据]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ userExInfo = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("UserExInfo");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(com.sa.unip.srv.ggsj.service.APIXTFJLJService.class,sessionFactory );
        service.executeAction(com.sa.unip.srv.ggsj.service.APIXTFJLJService.ACTION_SAVE,userExInfo);

    }
    /**
    * 执行逻辑处理[准备用户存储数据]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ userExInfo = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("UserExInfo");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[RESERVER2] ==> UserExInfo[IP]
        userExInfo.set("IP",_default.get("RESERVER2"));
        //Default[RESERVER3] ==> UserExInfo[UKEY]
        userExInfo.set("UKEY",_default.get("RESERVER3"));
        //Default[RESERVER] ==> UserExInfo[API_XT_FJLJNAME]
        userExInfo.set("API_XT_FJLJNAME",_default.get("RESERVER"));
        //Default[RESERVER] ==> UserExInfo[LOGINNAME]
        userExInfo.set("LOGINNAME",_default.get("RESERVER"));
        //Default[USERDATA] ==> UserExInfo[API_XT_FJLJID]
        userExInfo.set("API_XT_FJLJID",_default.get("USERDATA"));

        if(true) {
            executeDeaction1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ userExInfo = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("UserExInfo");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executePrepareparam1(iActionContext);
        }
    }

}