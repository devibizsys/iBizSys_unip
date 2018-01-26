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
 * 实体[API_XT_FJLJ]逻辑处理[保存用户信息到登录账号]模型对象
 */
public class APIXTFJLJOrgUser2LoginAccountLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<APIXTFJLJ> {

    private static final Log log = LogFactory.getLog(APIXTFJLJOrgUser2LoginAccountLogicModel.class);

    public APIXTFJLJOrgUser2LoginAccountLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("574F72FB-DD68-43BE-BC94-EC19163BFDE5");
        this.setName("OrgUser2LoginAccount");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        iActionContext.setParam("LoginAccountEntity2",new net.ibizsys.psrt.srv.common.entity.LoginAccount());
        iActionContext.setParam("LoginAccountEntity",new net.ibizsys.psrt.srv.common.entity.LoginAccount());
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[查询是否存在密码]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeRawsqlcall1(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        String strSQL = "select  count(1) as havpwd, ?  as loginname from t_srfloginaccount where pwd is not null and userid=?";
//准备参数
        SqlParamList sqlParamList = new SqlParamList();

        //Default[RESERVER]
        sqlParamList.addObject(_default.get("RESERVER"));
        //Default[OrgUserId]
        sqlParamList.addObject(_default.get("OrgUserId"));

        DBCallResult dbFetchResult= getDAO(iActionContext).executeRawSql(null, strSQL , sqlParamList);
        if (dbFetchResult.getDataSet() == null || (dbFetchResult.getDataSet().getDataTableCount() == 0)) {
            throw new ErrorException(Errors.INVALIDDATA);
        }

        dbFetchResult.getDataSet().cacheDataRow();
        IDataTable iDataTable = dbFetchResult.getDataSet().getDataTable(0);
        if (iDataTable.getCachedRowCount() == 0) {
            throw new ErrorException(Errors.INVALIDDATA);
        }
        //填充对象
        IDataRow iDataRow = iDataTable.getCachedRow(0);
        DataObject.fromDataRow(loginAccountEntity, iDataRow,false);

        if(true) {
            executePrepareparam1(iActionContext);
            return;
        }
    }
    /**
    * 执行逻辑处理[获取登录账户信息]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction1(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.LoginAccountService.class,sessionFactory );
        service.executeAction(net.ibizsys.psrt.srv.common.service.LoginAccountService.ACTION_GET,loginAccountEntity2);

        if(true) {
            executeDeaction2(iActionContext);
            return;
        }
        if(testCond(loginAccountEntity2.get("LOGINACCOUNTNAME"),"NOTEQ","LOGINNAME")) {
            executePrepareparam3(iActionContext);
            return;
        }
    }
    /**
    * 执行逻辑处理[新建设置密码]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam3(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //直接值[123456] ==> LoginAccountEntity[PWD]
        loginAccountEntity.set("PWD","123456");

        if(true) {
            executeDeaction2(iActionContext);
            return;
        }
    }
    /**
    * 执行逻辑处理[保存登陆信息]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeDeaction2(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();
        IService service = ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.LoginAccountService.class,sessionFactory );
        service.executeAction(net.ibizsys.psrt.srv.common.service.LoginAccountService.ACTION_SAVEHASHMODE,loginAccountEntity);

    }
    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executeRawsqlcall1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[设置登陆账户主键]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam2(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[ORGUSERID] ==> LoginAccountEntity2[LOGINACCOUNTID]
        loginAccountEntity2.set("LOGINACCOUNTID",_default.get("ORGUSERID"));

        if(true) {
            executeDeaction1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[准备LoginAccount参数]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity2 = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity2");
        com.sa.unip.srv.ggsj.entity.APIXTFJLJ _default = (com.sa.unip.srv.ggsj.entity.APIXTFJLJ)iActionContext.getParam("Default");
        net.ibizsys.psrt.srv.common.entity.LoginAccount loginAccountEntity = (net.ibizsys.psrt.srv.common.entity.LoginAccount)iActionContext.getParam("LoginAccountEntity");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //Default[OrgUserId] ==> LoginAccountEntity[LOGINACCOUNTID]
        loginAccountEntity.set("LOGINACCOUNTID",_default.get("OrgUserId"));
        //LoginAccountEntity[LOGINNAME] ==> LoginAccountEntity[LOGINACCOUNTNAME]
        loginAccountEntity.set("LOGINACCOUNTNAME",loginAccountEntity.get("LOGINNAME"));
        //Default[OrgUserId] ==> LoginAccountEntity[USERID]
        loginAccountEntity.set("USERID",_default.get("OrgUserId"));
        //Default[RESERVER2] ==> LoginAccountEntity[USERDATA3]
        loginAccountEntity.set("USERDATA3",_default.get("RESERVER2"));
        //Default[LOGINNAME] ==> LoginAccountEntity[USERDATA2]
        loginAccountEntity.set("USERDATA2",_default.get("LOGINNAME"));
        //Default[RESERVER3] ==> LoginAccountEntity[USERDATA]
        loginAccountEntity.set("USERDATA",_default.get("RESERVER3"));
        //Default[ValidFlag] ==> LoginAccountEntity[ISENABLE]
        loginAccountEntity.set("ISENABLE",_default.get("ValidFlag"));

        if(testCond(loginAccountEntity.get("havpwd"),"EQ","0")) {
            executePrepareparam3(iActionContext);
        }
        if(true) {
            executeDeaction2(iActionContext);
        }
        if(testCond(loginAccountEntity.get("havpwd"),"GT","0")) {
            executePrepareparam2(iActionContext);
        }
    }

}