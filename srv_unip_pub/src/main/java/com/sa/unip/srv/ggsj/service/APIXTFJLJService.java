/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.service;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.core.PluginActionResult;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.IProcParam;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.ActionContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDELogicModel;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.KeyValueHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import net.ibizsys.paas.db.SelectCond;
import net.ibizsys.paas.service.IServiceWork;
import net.ibizsys.paas.service.IServicePlugin;
import net.ibizsys.paas.service.ITransaction;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.service.CloneSession;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import java.sql.Timestamp;
import net.ibizsys.paas.util.DefaultValueHelper;
import javax.annotation.PostConstruct;
import net.ibizsys.paas.service.IDataContextParam;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



import com.sa.unip.srv.ggsj.entity.APIXTFJLJ;
import com.sa.unip.srv.ggsj.dao.APIXTFJLJDAO;
import com.sa.unip.srv.ggsj.demodel.APIXTFJLJDEModel;


/**
 * 实体[APIXTFJLJ] 服务对象基类
 */
@Component
public class APIXTFJLJService extends com.sa.unip.srv.UniPSampleSysServiceBase<APIXTFJLJ> {
    private static final Log log = LogFactory.getLog(APIXTFJLJService.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";

    /**
     * 实体行为[删除角色用户时重置ORGUSER中的Role]标识
     */
    public final static String ACTION_PROXYRESETORGUSERROLE = "ProxyResetOrgUserRole";
    /**
     * 实体行为[更新用户额外信息]标识
     */
    public final static String ACTION_UPDATEORGUSEREXINFO = "UpdateOrgUserExInfo";
    /**
     * 实体行为[添加用户额外信息]标识
     */
    public final static String ACTION_ADDORGUSEREXINFO = "AddOrgUserExInfo";
    /**
     * 实体行为[代理保存用户信息到登录账号]标识
     */
    public final static String ACTION_PROXYORGUSER2LOGINACCOUNT = "ProxyOrgUser2LoginAccount";
    /**
     * 实体行为[新建角色用户时重置ORGUSER中的Role]标识
     */
    public final static String ACTION_PROXYADDORGUSERROLE = "ProxyAddOrgUserRole";

    public APIXTFJLJService () {
        super();

    }

    /**
     * 获取实体[APIXTFJLJ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static APIXTFJLJService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[APIXTFJLJ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static APIXTFJLJService getInstance(SessionFactory sessionFactory) throws Exception {
        return (APIXTFJLJService)ServiceGlobal.getService(APIXTFJLJService.class, sessionFactory);
    }

    /**
     * Spring注册后执行构造处理
     * @throws Exception
     */
    @PostConstruct
    public void postConstruct() throws Exception {
        ServiceGlobal.registerService(getServiceId(), this);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getServiceId()
     */
    @Override
    protected String getServiceId() {
        return "com.sa.unip.srv.ggsj.service.APIXTFJLJService";
    }

    private APIXTFJLJDEModel aPIXTFJLJDEModel;
    /**
     * 获取实体[APIXTFJLJ]模型对象
     */
    public  APIXTFJLJDEModel getAPIXTFJLJDEModel() {
        if(this.aPIXTFJLJDEModel==null) {
            try {
                this.aPIXTFJLJDEModel = (APIXTFJLJDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ggsj.demodel.APIXTFJLJDEModel");
            } catch(Exception ex) {
            }
        }
        return this.aPIXTFJLJDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getAPIXTFJLJDEModel();
    }


    private APIXTFJLJDAO aPIXTFJLJDAO;

    /**
     * 获取实体[APIXTFJLJ]数据操作对象
     */
    public  APIXTFJLJDAO getAPIXTFJLJDAO() {
        if(this.aPIXTFJLJDAO==null) {
            try {
                this.aPIXTFJLJDAO= (APIXTFJLJDAO)DAOGlobal.getDAO("com.sa.unip.srv.ggsj.dao.APIXTFJLJDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.aPIXTFJLJDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getAPIXTFJLJDAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_DEFAULT,true)==0) {
            return this.fetchDefault(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onExecuteAction(java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected  void onExecuteAction(String strAction,IEntity entity) throws Exception {
        if(StringHelper.compare(strAction,ACTION_PROXYRESETORGUSERROLE,true)==0) {
            this.proxyResetOrgUserRole((APIXTFJLJ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_UPDATEORGUSEREXINFO,true)==0) {
            this.updateOrgUserExInfo((APIXTFJLJ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_ADDORGUSEREXINFO,true)==0) {
            this.addOrgUserExInfo((APIXTFJLJ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_PROXYORGUSER2LOGINACCOUNT,true)==0) {
            this.proxyOrgUser2LoginAccount((APIXTFJLJ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_PROXYADDORGUSERROLE,true)==0) {
            this.proxyAddOrgUserRole((APIXTFJLJ)entity);
            return;
        }
        super.onExecuteAction(strAction,entity);
    }

    /**
     * 获取数据集合[DEFAULT]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchDefault(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_DEFAULT,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }





    /**
     * 执行操作[ProxyResetOrgUserRole]
     */
    public void proxyResetOrgUserRole(APIXTFJLJ aPIXTFJLJ) throws Exception {

        final IServicePlugin iServicePlugin = getPlugin();
        if(iServicePlugin!=null && iServicePlugin.doCustomAction(this,ACTION_PROXYRESETORGUSERROLE, IServicePlugin.ACTIONPOS_ENTER,aPIXTFJLJ,null).getResult()==PluginActionResult.RESULT_REPLACE)
            return;
        this.testDEMainStateAction(aPIXTFJLJ,ACTION_PROXYRESETORGUSERROLE);
        final APIXTFJLJ aPIXTFJLJ2 = aPIXTFJLJ;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                if(iServicePlugin==null || iServicePlugin.doCustomAction(getService(),ACTION_PROXYRESETORGUSERROLE, IServicePlugin.ACTIONPOS_ACTION,aPIXTFJLJ2,null).getResult()!=PluginActionResult.RESULT_REPLACE)
                    onProxyResetOrgUserRole(aPIXTFJLJ2);
            }
        });

        if(iServicePlugin!=null)
            iServicePlugin.doCustomAction(this,ACTION_PROXYRESETORGUSERROLE,IServicePlugin.ACTIONPOS_LEAVE,aPIXTFJLJ,null);
    }

    /*
     * 执行操作[ProxyResetOrgUserRole]
     */
    protected void onProxyResetOrgUserRole(APIXTFJLJ aPIXTFJLJ) throws Exception {

        throw new Exception("没有实现自定义行为[ProxyResetOrgUserRole]");
    }

    /**
     * 执行操作[ProxyAddOrgUserRole]
     */
    public void proxyAddOrgUserRole(APIXTFJLJ aPIXTFJLJ) throws Exception {

        final IServicePlugin iServicePlugin = getPlugin();
        if(iServicePlugin!=null && iServicePlugin.doCustomAction(this,ACTION_PROXYADDORGUSERROLE, IServicePlugin.ACTIONPOS_ENTER,aPIXTFJLJ,null).getResult()==PluginActionResult.RESULT_REPLACE)
            return;
        this.testDEMainStateAction(aPIXTFJLJ,ACTION_PROXYADDORGUSERROLE);
        final APIXTFJLJ aPIXTFJLJ2 = aPIXTFJLJ;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                if(iServicePlugin==null || iServicePlugin.doCustomAction(getService(),ACTION_PROXYADDORGUSERROLE, IServicePlugin.ACTIONPOS_ACTION,aPIXTFJLJ2,null).getResult()!=PluginActionResult.RESULT_REPLACE)
                    onProxyAddOrgUserRole(aPIXTFJLJ2);
            }
        });

        if(iServicePlugin!=null)
            iServicePlugin.doCustomAction(this,ACTION_PROXYADDORGUSERROLE,IServicePlugin.ACTIONPOS_LEAVE,aPIXTFJLJ,null);
    }

    /*
     * 执行操作[ProxyAddOrgUserRole]
     */
    protected void onProxyAddOrgUserRole(APIXTFJLJ aPIXTFJLJ) throws Exception {

        throw new Exception("没有实现自定义行为[ProxyAddOrgUserRole]");
    }


    /**
     * 执行操作[UpdateOrgUserExInfo]
     */
    public void updateOrgUserExInfo(APIXTFJLJ aPIXTFJLJ) throws Exception {

        final APIXTFJLJ et = aPIXTFJLJ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(aPIXTFJLJ,ACTION_UPDATEORGUSEREXINFO);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getAPIXTFJLJDEModel().getDELogic("UpdateOrgUserExInfo");
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                ActionContext actionContextImpl = new ActionContext(null);
                actionContextImpl.setParam(iDELogicModel.getDefaultParamName(), et);
                actionContextImpl.setSessionFactory(getSessionFactory());
                iDELogicModel.execute(actionContextImpl);
            }
        });
    }
    /**
     * 执行操作[AddOrgUserExInfo]
     */
    public void addOrgUserExInfo(APIXTFJLJ aPIXTFJLJ) throws Exception {

        final APIXTFJLJ et = aPIXTFJLJ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(aPIXTFJLJ,ACTION_ADDORGUSEREXINFO);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getAPIXTFJLJDEModel().getDELogic("SaveOrgUserExInfo");
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                ActionContext actionContextImpl = new ActionContext(null);
                actionContextImpl.setParam(iDELogicModel.getDefaultParamName(), et);
                actionContextImpl.setSessionFactory(getSessionFactory());
                iDELogicModel.execute(actionContextImpl);
            }
        });
    }
    /**
     * 执行操作[ProxyOrgUser2LoginAccount]
     */
    public void proxyOrgUser2LoginAccount(APIXTFJLJ aPIXTFJLJ) throws Exception {

        final APIXTFJLJ et = aPIXTFJLJ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(aPIXTFJLJ,ACTION_PROXYORGUSER2LOGINACCOUNT);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getAPIXTFJLJDEModel().getDELogic("OrgUser2LoginAccount");
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                ActionContext actionContextImpl = new ActionContext(null);
                actionContextImpl.setParam(iDELogicModel.getDefaultParamName(), et);
                actionContextImpl.setSessionFactory(getSessionFactory());
                iDELogicModel.execute(actionContextImpl);
            }
        });
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected void onFillParentInfo(APIXTFJLJ et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        super.onFillParentInfo(et,strParentType,strTypeParam,strParentKey);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncDER1NData(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected String onSyncDER1NData(String strDER1NId, String strParentKey, String strDatas) throws Exception {
        return super.onSyncDER1NData( strDER1NId,  strParentKey,  strDatas);
    }





    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(APIXTFJLJ et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(APIXTFJLJ et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }







    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(APIXTFJLJ et) throws Exception {
        super.onBeforeRemove(et);
    }






    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(APIXTFJLJ et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,APIXTFJLJ  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 UKEY
        entityFieldError = onCheckField_UKEY( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织人员关系
        entityFieldError = onCheckField_OrgSecUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 IP
        entityFieldError = onCheckField_IP( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 附加逻辑标识
        entityFieldError = onCheckField_Api_xt_fjljid( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 附加逻辑名称
        entityFieldError = onCheckField_Api_xt_fjljname( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 登录名
        entityFieldError = onCheckField_LoginName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[UKEY]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_UKEY(boolean bBaseMode,APIXTFJLJ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isUKEYDirty())
            return null;

        String value = et.getUKEY();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_UKEY_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(APIXTFJLJ.FIELD_UKEY);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgSecUserId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgSecUserId(boolean bBaseMode,APIXTFJLJ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgSecUserIdDirty())
            return null;

        String value = et.getOrgSecUserId();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgSecUserId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(APIXTFJLJ.FIELD_ORGSECUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[IP]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_IP(boolean bBaseMode,APIXTFJLJ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isIPDirty())
            return null;

        String value = et.getIP();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_IP_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(APIXTFJLJ.FIELD_IP);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Api_xt_fjljid]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Api_xt_fjljid(boolean bBaseMode,APIXTFJLJ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isApi_xt_fjljidDirty())
            return null;

        String value = et.getApi_xt_fjljid();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(APIXTFJLJ.FIELD_API_XT_FJLJID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Api_xt_fjljid_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(APIXTFJLJ.FIELD_API_XT_FJLJID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Api_xt_fjljname]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Api_xt_fjljname(boolean bBaseMode,APIXTFJLJ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isApi_xt_fjljnameDirty())
            return null;

        String value = et.getApi_xt_fjljname();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Api_xt_fjljname_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(APIXTFJLJ.FIELD_API_XT_FJLJNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[LoginName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_LoginName(boolean bBaseMode,APIXTFJLJ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isLoginNameDirty())
            return null;

        String value = et.getLoginName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_LoginName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(APIXTFJLJ.FIELD_LOGINNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncEntity(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncEntity(APIXTFJLJ et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(APIXTFJLJ et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(APIXTFJLJ et,String strField,IDataContextParam iDataContextParam)throws Exception {
        Object objValue = null;
        if(iDataContextParam!=null) {
        }

        objValue = super.getDataContextValue(et,strField,iDataContextParam);
        if(objValue!=null)
            return objValue;

        return null;
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onTestValueRule(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity, boolean, boolean)
     */
    @Override
    protected String onTestValueRule(String strDEFieldName,String strRule,IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_UKEY,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UKEY_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_ORGSECUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSecUserId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_IP,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_IP_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_API_XT_FJLJID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Api_xt_fjljid_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_API_XT_FJLJNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Api_xt_fjljname_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,APIXTFJLJ.FIELD_LOGINNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_LoginName_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[UKEY][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UKEY_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("UKEY", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[建立人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CreateMan_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CREATEMAN", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[建立时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CreateDate_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[更新人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UpdateMan_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("UPDATEMAN", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织人员关系][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSecUserId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECUSERID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[更新时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UpdateDate_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[IP][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_IP_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("IP", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[附加逻辑标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Api_xt_fjljid_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("API_XT_FJLJID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[附加逻辑名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Api_xt_fjljname_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("API_XT_FJLJNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[登录名][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_LoginName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("LOGINNAME", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onMergeChild(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected boolean onMergeChild(String strChildType, String strTypeParam, APIXTFJLJ et) throws Exception {
        boolean bRet = false;
        if(super.onMergeChild( strChildType, strTypeParam,  et))
            bRet = true;
        return bRet;
    }



    /**
     * 更新父数据
     * @param et
     * @throws Exception
     */
    @Override
    protected void onUpdateParent(APIXTFJLJ et)throws Exception {
        super.onUpdateParent(et);
    }


}