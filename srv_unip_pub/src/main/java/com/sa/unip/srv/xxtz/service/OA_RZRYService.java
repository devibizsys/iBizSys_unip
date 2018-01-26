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



import com.sa.unip.srv.xxtz.entity.OA_RZRY;
import com.sa.unip.srv.xxtz.dao.OA_RZRYDAO;
import com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel;


/**
 * 实体[OA_RZRY] 服务对象基类
 */
@Component
public class OA_RZRYService extends com.sa.unip.srv.UniPSampleSysServiceBase<OA_RZRY> {
    private static final Log log = LogFactory.getLog(OA_RZRYService.class);
    /**
     * 实体数据集合[我收到的]标识
     */
    public final static String DATASET_MYRECEIVE = "MyReceive";
    /**
     * 实体数据集合[我发出的]标识
     */
    public final static String DATASET_MYSENDER = "MySender";
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";


    public OA_RZRYService () {
        super();

    }

    /**
     * 获取实体[OA_RZRY]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_RZRYService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OA_RZRY]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_RZRYService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OA_RZRYService)ServiceGlobal.getService(OA_RZRYService.class, sessionFactory);
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
        return "com.sa.unip.srv.xxtz.service.OA_RZRYService";
    }

    private OA_RZRYDEModel oA_RZRYDEModel;
    /**
     * 获取实体[OA_RZRY]模型对象
     */
    public  OA_RZRYDEModel getOA_RZRYDEModel() {
        if(this.oA_RZRYDEModel==null) {
            try {
                this.oA_RZRYDEModel = (OA_RZRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_RZRYDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_RZRYDEModel();
    }


    private OA_RZRYDAO oA_RZRYDAO;

    /**
     * 获取实体[OA_RZRY]数据操作对象
     */
    public  OA_RZRYDAO getOA_RZRYDAO() {
        if(this.oA_RZRYDAO==null) {
            try {
                this.oA_RZRYDAO= (OA_RZRYDAO)DAOGlobal.getDAO("com.sa.unip.srv.xxtz.dao.OA_RZRYDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.oA_RZRYDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOA_RZRYDAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_MYRECEIVE,true)==0) {
            return this.fetchMyReceive(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_MYSENDER,true)==0) {
            return this.fetchMySender(iDEDataSetFetchContext);
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
     * 获取数据集合[我收到的]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchMyReceive(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_MYRECEIVE,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /**
     * 获取数据集合[我发出的]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchMySender(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_MYSENDER,false);
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
    protected void onFillParentInfo(OA_RZRY et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_RZRY_ORGUSER_ORGUSERID", true)==0)) {
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
        //关系类型 : DER1N ,主实体 :OA_GZRZ / 工作日志
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_RZRY_OA_GZRZ_GZRZID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_GZRZService",this.getSessionFactory());
            com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity = ( com.sa.unip.srv.ywsp.entity.OA_GZRZ)iService.getDEModel().createEntity();
            parentEntity.set(com.sa.unip.srv.ywsp.entity.OA_GZRZ.FIELD_OA_GZRZID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_GZRZ(et,parentEntity );
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
    protected void onFillParentInfo_ORGUSER(OA_RZRY et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
    }

    /**
    * 填充数据的父数据信息[工作日志]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_GZRZ(OA_RZRY et,com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {
        et.setGzrzid(parentEntity.getOA_GZRZId());
        et.setJrgzcx(parentEntity.getJRGZCX());
        et.setXxt(parentEntity.getXXT());
        et.setRzlx(parentEntity.getRZLX());
        et.setMrjh(parentEntity.getMRJH());
        et.setCZWT(parentEntity.getCZWT());
        et.setMemo(parentEntity.getMemo());
        et.setTjrid(parentEntity.getOrgUserId());
        et.setTjrname(parentEntity.getOrgUserName());
        et.setXsbt(parentEntity.getXsbt());
        et.setOA_GZRZName(parentEntity.getOA_GZRZName());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OA_RZRY et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
            if(et.getSFYD()==null) {
                et.setSFYD((String)DefaultValueHelper.getValue(this.getWebContext(),"","10",25));
            }
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_ORGUSER(et, bCreate);
        //关系类型 : DER1N ,主实体 :OA_GZRZ / 工作日志
        onFillEntityFullInfo_GZRZ(et, bCreate);
    }

    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_ORGUSER(OA_RZRY et, boolean bCreate) throws Exception {
    }
    /**
    * 填充实体的数据信息 工作日志
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_GZRZ(OA_RZRY et, boolean bCreate) throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OA_RZRY et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_RZRY> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        return selectByORGUSER(parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_RZRY> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_RZRY.FIELD_ORGUSERID, parentEntity.getOrgUserId());
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
     * 通过关系[工作日志]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_RZRY> selectByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {
        return selectByGZRZ(parentEntity,"");
    }
    /**
     * 通过关系[工作日志]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_RZRY> selectByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_RZRY.FIELD_GZRZID, parentEntity.getOA_GZRZId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByGZRZCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[工作日志]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByGZRZCond(SelectCond selectCond) throws Exception {

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
        java.util.ArrayList<OA_RZRY> list =  this.selectByORGUSER(parentEntity);
        for(OA_RZRY item:list) {
            OA_RZRY item2 = (OA_RZRY)getDEModel().createEntity();
            item2.setOA_RZRYId(item.getOA_RZRYId());
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
        java.util.ArrayList<OA_RZRY> removeList = selectByORGUSER(parentEntity);
        onBeforeRemoveByORGUSER(parentEntity,removeList );

        // 执行删除
        for (OA_RZRY item : removeList ) {
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
    protected void onBeforeRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_RZRY> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_RZRY> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[工作日志]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {
    }


    /**
     * 通过关系[工作日志]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {
        java.util.ArrayList<OA_RZRY> list =  this.selectByGZRZ(parentEntity);
        for(OA_RZRY item:list) {
            OA_RZRY item2 = (OA_RZRY)getDEModel().createEntity();
            item2.setOA_RZRYId(item.getOA_RZRYId());
            item2.setGzrzid(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[工作日志]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {
        final com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByGZRZ(parentEntity2);
                internalRemoveByGZRZ(parentEntity2);
                onAfterRemoveByGZRZ(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[工作日志]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[工作日志]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {
        java.util.ArrayList<OA_RZRY> removeList = selectByGZRZ(parentEntity);
        onBeforeRemoveByGZRZ(parentEntity,removeList );

        // 执行删除
        for (OA_RZRY item : removeList ) {
            remove(item );
        }
        onAfterRemoveByGZRZ(parentEntity,removeList );
    }

    /**
     * 通过关系[工作日志]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity) throws Exception {

    }

    /**
     * 通过关系[工作日志]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity,java.util.ArrayList<OA_RZRY> removeList) throws Exception {

    }

    /**
     * 通过关系[工作日志]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByGZRZ(com.sa.unip.srv.ywsp.entity.OA_GZRZ parentEntity,java.util.ArrayList<OA_RZRY> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OA_RZRY et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OA_RZRY et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_ORGUSER(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
        if(et.getGzrzid()!=null) {
            IEntity entity = cloneSession.getEntity("OA_GZRZ",et.getGzrzid());
            if(entity !=null) {
                onFillParentInfo_GZRZ(et,(com.sa.unip.srv.ywsp.entity.OA_GZRZ) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OA_RZRY et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OA_RZRY  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 日志人员名称
        entityFieldError = onCheckField_OA_RZRYName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 日志人员标识
        entityFieldError = onCheckField_OA_RZRYId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 工作日志标识
        entityFieldError = onCheckField_Gzrzid( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 人员标识
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
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
     * 获取属性[OA_RZRYName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_RZRYName(boolean bBaseMode,OA_RZRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_RZRYNameDirty())
            return null;

        String value = et.getOA_RZRYName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_RZRYName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_RZRY.FIELD_OA_RZRYNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_RZRYId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_RZRYId(boolean bBaseMode,OA_RZRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_RZRYIdDirty())
            return null;

        String value = et.getOA_RZRYId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_RZRY.FIELD_OA_RZRYID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_RZRYId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_RZRY.FIELD_OA_RZRYID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Gzrzid]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Gzrzid(boolean bBaseMode,OA_RZRY et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isGzrzidDirty())
            return null;

        String value = et.getGzrzid();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Gzrzid_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_RZRY.FIELD_GZRZID);
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
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OA_RZRY et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_RZRY.FIELD_ORGUSERID);
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
    protected EntityFieldError onCheckField_SFYD(boolean bBaseMode,OA_RZRY et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_RZRY.FIELD_SFYD);
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
    protected void onSyncEntity(OA_RZRY et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OA_RZRY et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OA_RZRY et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_SFYD,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_SFYD_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_OA_RZRYNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_RZRYName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_OA_RZRYID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_RZRYId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_JRGZCX,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Jrgzcx_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_MEMO,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Memo_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_CZWT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CZWT_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_TJRID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Tjrid_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_XXT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Xxt_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_RZLX,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Rzlx_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_XSBT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Xsbt_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_MRJH,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Mrjh_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_OA_GZRZNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_GZRZName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_TJRNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Tjrname_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_GZRZID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Gzrzid_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_RZRY.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
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
     * 判断值规则[日志人员名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_RZRYName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_RZRYNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[日志人员标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_RZRYId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_RZRYID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[今日工作成效][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Jrgzcx_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("JRGZCX", et, bTempMode,null,false,1000,true,"内容长度必须小于等于[1000]")))
                return null;
            return "内容长度必须小于等于[1000]";
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
    protected String onTestValueRule_Memo_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("MEMO", et, bTempMode,null,false,1000,true,"内容长度必须小于等于[1000]")))
                return null;
            return "内容长度必须小于等于[1000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[存在问题][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CZWT_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CZWT", et, bTempMode,null,false,1000,true,"内容长度必须小于等于[1000]")))
                return null;
            return "内容长度必须小于等于[1000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[提交人标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Tjrid_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("TJRID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[需协调][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Xxt_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("XXT", et, bTempMode,null,false,1000,true,"内容长度必须小于等于[1000]")))
                return null;
            return "内容长度必须小于等于[1000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[日志类型][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Rzlx_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("RZLX", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[显示标题][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Xsbt_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("XSBT", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[明日计划][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Mrjh_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("MRJH", et, bTempMode,null,false,1000,true,"内容长度必须小于等于[1000]")))
                return null;
            return "内容长度必须小于等于[1000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[工作日志名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_GZRZName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_GZRZNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[提交人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Tjrname_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("TJRNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[工作日志标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Gzrzid_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("GZRZID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[人员标识][默认规则]
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
    protected boolean onMergeChild(String strChildType, String strTypeParam, OA_RZRY et) throws Exception {
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
    protected void onUpdateParent(OA_RZRY et)throws Exception {
        super.onUpdateParent(et);
    }


}