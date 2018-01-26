/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.service;


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



import com.sa.unip.srv.ywsp.entity.OA_STWMDG;
import com.sa.unip.srv.ywsp.dao.OA_STWMDGDAO;
import com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel;


/**
 * 实体[OA_STWMDG] 服务对象基类
 */
@Component
public class OA_STWMDGService extends com.sa.unip.srv.UniPSampleSysServiceBase<OA_STWMDG> {
    private static final Log log = LogFactory.getLog(OA_STWMDGService.class);
    /**
     * 实体数据集合[我的外卖订购记录]标识
     */
    public final static String DATASET_CURSTWMDG = "CurStwmdg";
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";


    public OA_STWMDGService () {
        super();

    }

    /**
     * 获取实体[OA_STWMDG]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_STWMDGService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OA_STWMDG]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_STWMDGService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OA_STWMDGService)ServiceGlobal.getService(OA_STWMDGService.class, sessionFactory);
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
        return "com.sa.unip.srv.ywsp.service.OA_STWMDGService";
    }

    private OA_STWMDGDEModel oA_STWMDGDEModel;
    /**
     * 获取实体[OA_STWMDG]模型对象
     */
    public  OA_STWMDGDEModel getOA_STWMDGDEModel() {
        if(this.oA_STWMDGDEModel==null) {
            try {
                this.oA_STWMDGDEModel = (OA_STWMDGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_STWMDGDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_STWMDGDEModel();
    }


    private OA_STWMDGDAO oA_STWMDGDAO;

    /**
     * 获取实体[OA_STWMDG]数据操作对象
     */
    public  OA_STWMDGDAO getOA_STWMDGDAO() {
        if(this.oA_STWMDGDAO==null) {
            try {
                this.oA_STWMDGDAO= (OA_STWMDGDAO)DAOGlobal.getDAO("com.sa.unip.srv.ywsp.dao.OA_STWMDGDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.oA_STWMDGDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOA_STWMDGDAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_CURSTWMDG,true)==0) {
            return this.fetchCurStwmdg(iDEDataSetFetchContext);
        }
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
     * 获取数据集合[我的外卖订购记录]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchCurStwmdg(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_CURSTWMDG,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
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
    protected void onFillParentInfo(OA_STWMDG et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_STWMDG_ORGUSER_ORGUSERID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgUserService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgUser)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgUser.FIELD_ORGUSERID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_DCRBS(et,parentEntity );
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
    * 填充数据的父数据信息[组织人员]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_DCRBS(OA_STWMDG et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
        et.setOrgUserName(parentEntity.getOrgUserName());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OA_STWMDG et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
            if(et.getSTWMDGZT()==null) {
                et.setSTWMDGZT((String)DefaultValueHelper.getValue(this.getWebContext(),"","10",25));
            }
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_DCRBS(et, bCreate);
    }

    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_DCRBS(OA_STWMDG et, boolean bCreate) throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OA_STWMDG et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_STWMDG> selectByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        return selectByDCRBS(parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_STWMDG> selectByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_STWMDG.FIELD_ORGUSERID, parentEntity.getOrgUserId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByDCRBSCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织人员]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByDCRBSCond(SelectCond selectCond) throws Exception {

    }




    /**
     * 判断是否能够通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
    }


    /**
     * 通过关系[组织人员]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OA_STWMDG> list =  this.selectByDCRBS(parentEntity);
        for(OA_STWMDG item:list) {
            OA_STWMDG item2 = (OA_STWMDG)getDEModel().createEntity();
            item2.setOA_STWMDGId(item.getOA_STWMDGId());
            item2.setOrgUserId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByDCRBS(parentEntity2);
                internalRemoveByDCRBS(parentEntity2);
                onAfterRemoveByDCRBS(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织人员]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OA_STWMDG> removeList = selectByDCRBS(parentEntity);
        onBeforeRemoveByDCRBS(parentEntity,removeList );

        // 执行删除
        for (OA_STWMDG item : removeList ) {
            remove(item );
        }
        onAfterRemoveByDCRBS(parentEntity,removeList );
    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_STWMDG> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByDCRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_STWMDG> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OA_STWMDG et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OA_STWMDG et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_DCRBS(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OA_STWMDG et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OA_STWMDG  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 食堂外卖是否审核通过
        entityFieldError = onCheckField_Stwmsfshtg( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 备注
        entityFieldError = onCheckField_Bz( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 食堂外卖订购名称
        entityFieldError = onCheckField_OA_STWMDGName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 食堂外卖订购标识
        entityFieldError = onCheckField_OA_STWMDGId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 订餐人标识
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 用餐地点
        entityFieldError = onCheckField_Ycdd( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 送餐时间
        entityFieldError = onCheckField_SCSJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 用餐人数
        entityFieldError = onCheckField_Ycrs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 事由
        entityFieldError = onCheckField_Sy( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 审核意见
        entityFieldError = onCheckField_Memo( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 附件
        entityFieldError = onCheckField_FJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 工作流实例
        entityFieldError = onCheckField_WFINSTANCEID( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 工作流状态
        entityFieldError = onCheckField_WFSTATE( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 食堂外卖订购步骤
        entityFieldError = onCheckField_STWMDGBZ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 食堂外卖订购状态
        entityFieldError = onCheckField_STWMDGZT( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[Stwmsfshtg]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Stwmsfshtg(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isStwmsfshtgDirty())
            return null;

        String value = et.getStwmsfshtg();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Stwmsfshtg_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_STWMSFSHTG);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Bz]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Bz(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isBzDirty())
            return null;

        String value = et.getBz();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Bz_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_BZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_STWMDGName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_STWMDGName(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_STWMDGNameDirty())
            return null;

        String value = et.getOA_STWMDGName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_STWMDGName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_OA_STWMDGNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_STWMDGId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_STWMDGId(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_STWMDGIdDirty())
            return null;

        String value = et.getOA_STWMDGId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_STWMDG.FIELD_OA_STWMDGID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_STWMDGId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_OA_STWMDGID);
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
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgUserIdDirty())
            return null;

        String value = et.getOrgUserId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_STWMDG.FIELD_ORGUSERID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgUserId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_ORGUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Ycdd]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Ycdd(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isYcddDirty())
            return null;

        String value = et.getYcdd();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_STWMDG.FIELD_YCDD);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Ycdd_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_YCDD);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[SCSJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_SCSJ(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSCSJDirty())
            return null;

        Timestamp value = et.getSCSJ();
        if(bBaseMode) {
            if(bCreate) {
                if(value==null) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_STWMDG.FIELD_SCSJ);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_SCSJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_SCSJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Ycrs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Ycrs(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isYcrsDirty())
            return null;

        Integer value = et.getYcrs();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Ycrs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_YCRS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Sy]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Sy(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSyDirty())
            return null;

        String value = et.getSy();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_STWMDG.FIELD_SY);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Sy_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_SY);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Memo]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Memo(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isMemoDirty())
            return null;

        String value = et.getMemo();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Memo_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_MEMO);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[FJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_FJ(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isFJDirty())
            return null;

        String value = et.getFJ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_FJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_FJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[WFINSTANCEID]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_WFINSTANCEID(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isWFINSTANCEIDDirty())
            return null;

        String value = et.getWFINSTANCEID();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_WFINSTANCEID_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_WFINSTANCEID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[WFSTATE]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_WFSTATE(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isWFSTATEDirty())
            return null;

        Integer value = et.getWFSTATE();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_WFSTATE_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_WFSTATE);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[STWMDGBZ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_STWMDGBZ(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSTWMDGBZDirty())
            return null;

        String value = et.getSTWMDGBZ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_STWMDGBZ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_STWMDGBZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[STWMDGZT]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_STWMDGZT(boolean bBaseMode,OA_STWMDG et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSTWMDGZTDirty())
            return null;

        String value = et.getSTWMDGZT();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_STWMDGZT_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_STWMDG.FIELD_STWMDGZT);
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
    protected void onSyncEntity(OA_STWMDG et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OA_STWMDG et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OA_STWMDG et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_STWMSFSHTG,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Stwmsfshtg_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_BZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Bz_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_STWMDGZT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_STWMDGZT_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_OA_STWMDGNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_STWMDGName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_WFINSTANCEID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFINSTANCEID_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_SY,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Sy_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_MEMO,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Memo_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_YCRS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Ycrs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_FJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_FJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_OA_STWMDGID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_STWMDGId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_STWMDGBZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_STWMDGBZ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_YCDD,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Ycdd_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_WFSTATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFSTATE_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_SCSJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_SCSJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_ORGUSERNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_STWMDG.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
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
     * 判断值规则[食堂外卖是否审核通过][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Stwmsfshtg_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("STWMSFSHTG", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[备注][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Bz_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("BZ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
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
     * 判断值规则[食堂外卖订购状态][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_STWMDGZT_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("STWMDGZT", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[食堂外卖订购名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_STWMDGName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_STWMDGNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
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
     * 判断值规则[工作流实例][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_WFINSTANCEID_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("WFINSTANCEID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[事由][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Sy_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("SY", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[审核意见][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Memo_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("MEMO", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[用餐人数][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Ycrs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[附件][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_FJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("FJ", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[食堂外卖订购标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_STWMDGId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_STWMDGID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[食堂外卖订购步骤][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_STWMDGBZ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("STWMDGBZ", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[用餐地点][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Ycdd_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("YCDD", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[工作流状态][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_WFSTATE_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[送餐时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_SCSJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[订餐人姓名][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgUserName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGUSERNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[订餐人标识][默认规则]
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
    protected boolean onMergeChild(String strChildType, String strTypeParam, OA_STWMDG et) throws Exception {
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
    protected void onUpdateParent(OA_STWMDG et)throws Exception {
        super.onUpdateParent(et);
    }


}