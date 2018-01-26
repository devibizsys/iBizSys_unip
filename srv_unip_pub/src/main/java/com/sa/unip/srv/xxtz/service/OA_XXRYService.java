/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.service;


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



import com.sa.unip.srv.xxtz.entity.OA_XXRY;
import com.sa.unip.srv.xxtz.dao.OA_XXRYDAO;
import com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel;


/**
 * 实体[OA_XXRY] 服务对象基类
 */
@Component
public class OA_XXRYService extends com.sa.unip.srv.UniPSampleSysServiceBase<OA_XXRY> {
    private static final Log log = LogFactory.getLog(OA_XXRYService.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";


    public OA_XXRYService () {
        super();

    }

    /**
     * 获取实体[OA_XXRY]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_XXRYService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OA_XXRY]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_XXRYService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OA_XXRYService)ServiceGlobal.getService(OA_XXRYService.class, sessionFactory);
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
        return "com.sa.unip.srv.xxtz.service.OA_XXRYService";
    }

    private OA_XXRYDEModel oA_XXRYDEModel;
    /**
     * 获取实体[OA_XXRY]模型对象
     */
    public  OA_XXRYDEModel getOA_XXRYDEModel() {
        if(this.oA_XXRYDEModel==null) {
            try {
                this.oA_XXRYDEModel = (OA_XXRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_XXRYDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_XXRYDEModel();
    }


    private OA_XXRYDAO oA_XXRYDAO;

    /**
     * 获取实体[OA_XXRY]数据操作对象
     */
    public  OA_XXRYDAO getOA_XXRYDAO() {
        if(this.oA_XXRYDAO==null) {
            try {
                this.oA_XXRYDAO= (OA_XXRYDAO)DAOGlobal.getDAO("com.sa.unip.srv.xxtz.dao.OA_XXRYDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.oA_XXRYDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOA_XXRYDAO();
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







    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected void onFillParentInfo(OA_XXRY et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :OA_XX / 消息
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_XXRY_OA_XX_OA_XXID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.xxtz.service.OA_XXService",this.getSessionFactory());
            com.sa.unip.srv.xxtz.entity.OA_XX parentEntity = ( com.sa.unip.srv.xxtz.entity.OA_XX)iService.getDEModel().createEntity();
            parentEntity.set(com.sa.unip.srv.xxtz.entity.OA_XX.FIELD_OA_XXID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_XXID(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_XXRY_ORGUSER_ORGUSERID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgUserService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgUser)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgUser.FIELD_ORGUSERID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_ORGUSER(et,parentEntity );
            return;
        }
        super.onFillParentInfo(et,strParentType,strTypeParam,strParentKey);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncDER1NData(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected String onSyncDER1NData(String strDER1NId, String strParentKey, String strDatas) throws Exception {
        return super.onSyncDER1NData( strDER1NId,  strParentKey,  strDatas);
    }


    /**
    * 填充数据的父数据信息[消息]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_XXID(OA_XXRY et,com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {
        et.setOA_XXID(parentEntity.getOA_XXID());
    }

    /**
    * 填充数据的父数据信息[组织人员]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_ORGUSER(OA_XXRY et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OA_XXRY et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :OA_XX / 消息
        onFillEntityFullInfo_XXID(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_ORGUSER(et, bCreate);
    }

    /**
    * 填充实体的数据信息 消息
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_XXID(OA_XXRY et, boolean bCreate) throws Exception {
    }
    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_ORGUSER(OA_XXRY et, boolean bCreate) throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OA_XXRY et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[消息]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_XXRY> selectByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {
        return selectByXXID(parentEntity,"");
    }
    /**
     * 通过关系[消息]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_XXRY> selectByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_XXRY.FIELD_OA_XXID, parentEntity.getOA_XXID());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByXXIDCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[消息]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByXXIDCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_XXRY> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        return selectByORGUSER(parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_XXRY> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_XXRY.FIELD_ORGUSERID, parentEntity.getOrgUserId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByORGUSERCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织人员]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByORGUSERCond(SelectCond selectCond) throws Exception {

    }




    /**
     * 判断是否能够通过关系[消息]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {
    }


    /**
     * 通过关系[消息]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {
        java.util.ArrayList<OA_XXRY> list =  this.selectByXXID(parentEntity);
        for(OA_XXRY item:list) {
            OA_XXRY item2 = (OA_XXRY)getDEModel().createEntity();
            item2.setOA_XXRYID(item.getOA_XXRYID());
            item2.setOA_XXID(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[消息]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {
        final com.sa.unip.srv.xxtz.entity.OA_XX parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByXXID(parentEntity2);
                internalRemoveByXXID(parentEntity2);
                onAfterRemoveByXXID(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[消息]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[消息]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {
        java.util.ArrayList<OA_XXRY> removeList = selectByXXID(parentEntity);
        onBeforeRemoveByXXID(parentEntity,removeList );

        // 执行删除
        for (OA_XXRY item : removeList ) {
            remove(item );
        }
        onAfterRemoveByXXID(parentEntity,removeList );
    }

    /**
     * 通过关系[消息]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity) throws Exception {

    }

    /**
     * 通过关系[消息]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity,java.util.ArrayList<OA_XXRY> removeList) throws Exception {

    }

    /**
     * 通过关系[消息]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByXXID(com.sa.unip.srv.xxtz.entity.OA_XX parentEntity,java.util.ArrayList<OA_XXRY> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
    }


    /**
     * 通过关系[组织人员]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OA_XXRY> list =  this.selectByORGUSER(parentEntity);
        for(OA_XXRY item:list) {
            OA_XXRY item2 = (OA_XXRY)getDEModel().createEntity();
            item2.setOA_XXRYID(item.getOA_XXRYID());
            item2.setOrgUserId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByORGUSER(parentEntity2);
                internalRemoveByORGUSER(parentEntity2);
                onAfterRemoveByORGUSER(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织人员]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OA_XXRY> removeList = selectByORGUSER(parentEntity);
        onBeforeRemoveByORGUSER(parentEntity,removeList );

        // 执行删除
        for (OA_XXRY item : removeList ) {
            remove(item );
        }
        onAfterRemoveByORGUSER(parentEntity,removeList );
    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_XXRY> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_XXRY> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OA_XXRY et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OA_XXRY et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOA_XXID()!=null) {
            IEntity entity = cloneSession.getEntity("OA_XX",et.getOA_XXID());
            if(entity !=null) {
                onFillParentInfo_XXID(et,(com.sa.unip.srv.xxtz.entity.OA_XX) entity);
            }
        }
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_ORGUSER(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OA_XXRY et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OA_XXRY  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 消息人员标识
        entityFieldError = onCheckField_OA_XXRYID( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 消息人员名称
        entityFieldError = onCheckField_OA_XXRYName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织人员标识
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 消息标识
        entityFieldError = onCheckField_OA_XXID( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 是否已读
        entityFieldError = onCheckField_SFYD( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[OA_XXRYID]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_XXRYID(boolean bBaseMode,OA_XXRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_XXRYIDDirty())
            return null;

        String value = et.getOA_XXRYID();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_XXRY.FIELD_OA_XXRYID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_XXRYID_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_XXRY.FIELD_OA_XXRYID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_XXRYName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_XXRYName(boolean bBaseMode,OA_XXRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_XXRYNameDirty())
            return null;

        String value = et.getOA_XXRYName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_XXRYName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_XXRY.FIELD_OA_XXRYNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgUserId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OA_XXRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgUserIdDirty())
            return null;

        String value = et.getOrgUserId();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgUserId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_XXRY.FIELD_ORGUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_XXID]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_XXID(boolean bBaseMode,OA_XXRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_XXIDDirty())
            return null;

        String value = et.getOA_XXID();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_XXID_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_XXRY.FIELD_OA_XXID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[SFYD]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_SFYD(boolean bBaseMode,OA_XXRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSFYDDirty())
            return null;

        String value = et.getSFYD();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_SFYD_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_XXRY.FIELD_SFYD);
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
    protected void onSyncEntity(OA_XXRY et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OA_XXRY et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OA_XXRY et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_OA_XXRYID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_XXRYID_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_SFYD,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_SFYD_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_OA_XXRYNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_XXRYName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_OA_XXID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_XXID_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_XXRY.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[消息人员标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_XXRYID_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_XXRYID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
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
     * 判断值规则[是否已读][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_SFYD_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("SFYD", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
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
     * 判断值规则[消息人员名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_XXRYName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_XXRYNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
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
     * 判断值规则[消息标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_XXID_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_XXID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织人员标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgUserId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGUSERID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
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
    protected boolean onMergeChild(String strChildType, String strTypeParam, OA_XXRY et) throws Exception {
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
    protected void onUpdateParent(OA_XXRY et)throws Exception {
        super.onUpdateParent(et);
    }


}