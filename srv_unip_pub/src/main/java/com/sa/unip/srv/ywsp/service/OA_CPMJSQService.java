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



import com.sa.unip.srv.ywsp.entity.OA_CPMJSQ;
import com.sa.unip.srv.ywsp.dao.OA_CPMJSQDAO;
import com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel;


/**
 * 实体[OA_CPMJSQ] 服务对象基类
 */
@Component
public class OA_CPMJSQService extends com.sa.unip.srv.UniPSampleSysServiceBase<OA_CPMJSQ> {
    private static final Log log = LogFactory.getLog(OA_CPMJSQService.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";
    /**
     * 实体数据集合[我的车牌门禁申请记录]标识
     */
    public final static String DATASET_CURCPMJSQ = "CurCpmjsq";


    public OA_CPMJSQService () {
        super();

    }

    /**
     * 获取实体[OA_CPMJSQ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_CPMJSQService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OA_CPMJSQ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_CPMJSQService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OA_CPMJSQService)ServiceGlobal.getService(OA_CPMJSQService.class, sessionFactory);
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
        return "com.sa.unip.srv.ywsp.service.OA_CPMJSQService";
    }

    private OA_CPMJSQDEModel oA_CPMJSQDEModel;
    /**
     * 获取实体[OA_CPMJSQ]模型对象
     */
    public  OA_CPMJSQDEModel getOA_CPMJSQDEModel() {
        if(this.oA_CPMJSQDEModel==null) {
            try {
                this.oA_CPMJSQDEModel = (OA_CPMJSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CPMJSQDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_CPMJSQDEModel();
    }


    private OA_CPMJSQDAO oA_CPMJSQDAO;

    /**
     * 获取实体[OA_CPMJSQ]数据操作对象
     */
    public  OA_CPMJSQDAO getOA_CPMJSQDAO() {
        if(this.oA_CPMJSQDAO==null) {
            try {
                this.oA_CPMJSQDAO= (OA_CPMJSQDAO)DAOGlobal.getDAO("com.sa.unip.srv.ywsp.dao.OA_CPMJSQDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.oA_CPMJSQDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOA_CPMJSQDAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_DEFAULT,true)==0) {
            return this.fetchDefault(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_CURCPMJSQ,true)==0) {
            return this.fetchCurCpmjsq(iDEDataSetFetchContext);
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



    /**
     * 获取数据集合[我的车牌门禁申请记录]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchCurCpmjsq(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_CURCPMJSQ,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }







    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected void onFillParentInfo(OA_CPMJSQ et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :OA_CL / 车辆
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_CPMJSQ_OA_CL_OA_CLID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_CLService",this.getSessionFactory());
            com.sa.unip.srv.jcsj.entity.OA_CL parentEntity = ( com.sa.unip.srv.jcsj.entity.OA_CL)iService.getDEModel().createEntity();
            parentEntity.set(com.sa.unip.srv.jcsj.entity.OA_CL.FIELD_OA_CLID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_CLBS(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_CPMJSQ_ORGSECTOR_ORGSECTORID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgSectorService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgSector)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgSector.FIELD_ORGSECTORID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_BMBS(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_CPMJSQ_ORGUSER_ORGUSERID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgUserService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgUser)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgUser.FIELD_ORGUSERID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_SQRBS(et,parentEntity );
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
    * 填充数据的父数据信息[车辆]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_CLBS(OA_CPMJSQ et,com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {
        et.setOA_CLId(parentEntity.getOA_CLId());
        et.setOA_CLName(parentEntity.getOA_CLName());
    }

    /**
    * 填充数据的父数据信息[组织部门]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_BMBS(OA_CPMJSQ et,net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        et.setOrgSectorId(parentEntity.getOrgSectorId());
        et.setOrgSectorName(parentEntity.getOrgSectorName());
    }

    /**
    * 填充数据的父数据信息[组织人员]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_SQRBS(OA_CPMJSQ et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
        et.setOrgUserName(parentEntity.getOrgUserName());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OA_CPMJSQ et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
            if(et.getCPMJSQZT()==null) {
                et.setCPMJSQZT((String)DefaultValueHelper.getValue(this.getWebContext(),"","10",25));
            }
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :OA_CL / 车辆
        onFillEntityFullInfo_CLBS(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        onFillEntityFullInfo_BMBS(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_SQRBS(et, bCreate);
    }

    /**
    * 填充实体的数据信息 车辆
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_CLBS(OA_CPMJSQ et, boolean bCreate) throws Exception {
    }
    /**
    * 填充实体的数据信息 组织部门
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_BMBS(OA_CPMJSQ et, boolean bCreate) throws Exception {
    }
    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_SQRBS(OA_CPMJSQ et, boolean bCreate) throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OA_CPMJSQ et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[车辆]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_CPMJSQ> selectByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {
        return selectByCLBS(parentEntity,"");
    }
    /**
     * 通过关系[车辆]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_CPMJSQ> selectByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_CPMJSQ.FIELD_OA_CLID, parentEntity.getOA_CLId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByCLBSCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[车辆]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByCLBSCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_CPMJSQ> selectByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        return selectByBMBS(parentEntity,"");
    }
    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_CPMJSQ> selectByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_CPMJSQ.FIELD_ORGSECTORID, parentEntity.getOrgSectorId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByBMBSCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织部门]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByBMBSCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_CPMJSQ> selectBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        return selectBySQRBS(parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_CPMJSQ> selectBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_CPMJSQ.FIELD_ORGUSERID, parentEntity.getOrgUserId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectBySQRBSCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织人员]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectBySQRBSCond(SelectCond selectCond) throws Exception {

    }




    /**
     * 判断是否能够通过关系[车辆]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {
    }


    /**
     * 通过关系[车辆]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {
        java.util.ArrayList<OA_CPMJSQ> list =  this.selectByCLBS(parentEntity);
        for(OA_CPMJSQ item:list) {
            OA_CPMJSQ item2 = (OA_CPMJSQ)getDEModel().createEntity();
            item2.setOA_CPMJSQId(item.getOA_CPMJSQId());
            item2.setOA_CLId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[车辆]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {
        final com.sa.unip.srv.jcsj.entity.OA_CL parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByCLBS(parentEntity2);
                internalRemoveByCLBS(parentEntity2);
                onAfterRemoveByCLBS(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[车辆]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[车辆]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {
        java.util.ArrayList<OA_CPMJSQ> removeList = selectByCLBS(parentEntity);
        onBeforeRemoveByCLBS(parentEntity,removeList );

        // 执行删除
        for (OA_CPMJSQ item : removeList ) {
            remove(item );
        }
        onAfterRemoveByCLBS(parentEntity,removeList );
    }

    /**
     * 通过关系[车辆]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity) throws Exception {

    }

    /**
     * 通过关系[车辆]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity,java.util.ArrayList<OA_CPMJSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[车辆]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByCLBS(com.sa.unip.srv.jcsj.entity.OA_CL parentEntity,java.util.ArrayList<OA_CPMJSQ> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[组织部门]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
    }


    /**
     * 通过关系[组织部门]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OA_CPMJSQ> list =  this.selectByBMBS(parentEntity);
        for(OA_CPMJSQ item:list) {
            OA_CPMJSQ item2 = (OA_CPMJSQ)getDEModel().createEntity();
            item2.setOA_CPMJSQId(item.getOA_CPMJSQId());
            item2.setOrgSectorId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织部门]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByBMBS(parentEntity2);
                internalRemoveByBMBS(parentEntity2);
                onAfterRemoveByBMBS(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织部门]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织部门]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OA_CPMJSQ> removeList = selectByBMBS(parentEntity);
        onBeforeRemoveByBMBS(parentEntity,removeList );

        // 执行删除
        for (OA_CPMJSQ item : removeList ) {
            remove(item );
        }
        onAfterRemoveByBMBS(parentEntity,removeList );
    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OA_CPMJSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByBMBS(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OA_CPMJSQ> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
    }


    /**
     * 通过关系[组织人员]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetSQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OA_CPMJSQ> list =  this.selectBySQRBS(parentEntity);
        for(OA_CPMJSQ item:list) {
            OA_CPMJSQ item2 = (OA_CPMJSQ)getDEModel().createEntity();
            item2.setOA_CPMJSQId(item.getOA_CPMJSQId());
            item2.setOrgUserId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveBySQRBS(parentEntity2);
                internalRemoveBySQRBS(parentEntity2);
                onAfterRemoveBySQRBS(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织人员]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OA_CPMJSQ> removeList = selectBySQRBS(parentEntity);
        onBeforeRemoveBySQRBS(parentEntity,removeList );

        // 执行删除
        for (OA_CPMJSQ item : removeList ) {
            remove(item );
        }
        onAfterRemoveBySQRBS(parentEntity,removeList );
    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_CPMJSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveBySQRBS(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_CPMJSQ> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OA_CPMJSQ et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OA_CPMJSQ et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOA_CLId()!=null) {
            IEntity entity = cloneSession.getEntity("OA_CL",et.getOA_CLId());
            if(entity !=null) {
                onFillParentInfo_CLBS(et,(com.sa.unip.srv.jcsj.entity.OA_CL) entity);
            }
        }
        if(et.getOrgSectorId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGSECTOR",et.getOrgSectorId());
            if(entity !=null) {
                onFillParentInfo_BMBS(et,(net.ibizsys.psrt.srv.common.entity.OrgSector) entity);
            }
        }
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_SQRBS(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OA_CPMJSQ et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OA_CPMJSQ  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 车牌门禁申请是否通过
        entityFieldError = onCheckField_CPMJSFSHTG( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 备注
        entityFieldError = onCheckField_Bz( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 车牌门禁申请标识
        entityFieldError = onCheckField_OA_CPMJSQId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 车牌门禁申请名称
        entityFieldError = onCheckField_OA_CPMJSQName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 申请人标识
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 职务
        entityFieldError = onCheckField_ZW( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 联系方式
        entityFieldError = onCheckField_Lxfs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 车辆品牌
        entityFieldError = onCheckField_Clpp( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 车牌号
        entityFieldError = onCheckField_Cph( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 颜色
        entityFieldError = onCheckField_Color( bBaseMode,  et,  bCreate,  bTempMode);
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
        //检查属性 车牌门禁申请步骤
        entityFieldError = onCheckField_CPMJSQBZ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 车牌门禁申请状态
        entityFieldError = onCheckField_CPMJSQZT( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 车辆标识
        entityFieldError = onCheckField_OA_CLId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[CPMJSFSHTG]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_CPMJSFSHTG(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isCPMJSFSHTGDirty())
            return null;

        String value = et.getCPMJSFSHTG();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_CPMJSFSHTG_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_CPMJSFSHTG);
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
    protected EntityFieldError onCheckField_Bz(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_BZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_CPMJSQId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_CPMJSQId(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_CPMJSQIdDirty())
            return null;

        String value = et.getOA_CPMJSQId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_CPMJSQ.FIELD_OA_CPMJSQID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_CPMJSQId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_OA_CPMJSQID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_CPMJSQName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_CPMJSQName(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_CPMJSQNameDirty())
            return null;

        String value = et.getOA_CPMJSQName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_CPMJSQName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_OA_CPMJSQNAME);
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
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgUserIdDirty())
            return null;

        String value = et.getOrgUserId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_CPMJSQ.FIELD_ORGUSERID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgUserId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_ORGUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[ZW]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_ZW(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isZWDirty())
            return null;

        String value = et.getZW();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_CPMJSQ.FIELD_ZW);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_ZW_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_ZW);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Lxfs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Lxfs(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isLxfsDirty())
            return null;

        String value = et.getLxfs();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_CPMJSQ.FIELD_LXFS);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Lxfs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_LXFS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Clpp]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Clpp(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isClppDirty())
            return null;

        String value = et.getClpp();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Clpp_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_CLPP);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Cph]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Cph(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isCphDirty())
            return null;

        String value = et.getCph();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Cph_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_CPH);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Color]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Color(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isColorDirty())
            return null;

        String value = et.getColor();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Color_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_COLOR);
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
    protected EntityFieldError onCheckField_Memo(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_MEMO);
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
    protected EntityFieldError onCheckField_FJ(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_FJ);
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
    protected EntityFieldError onCheckField_WFINSTANCEID(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_WFINSTANCEID);
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
    protected EntityFieldError onCheckField_WFSTATE(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_WFSTATE);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[CPMJSQBZ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_CPMJSQBZ(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isCPMJSQBZDirty())
            return null;

        String value = et.getCPMJSQBZ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_CPMJSQBZ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_CPMJSQBZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[CPMJSQZT]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_CPMJSQZT(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isCPMJSQZTDirty())
            return null;

        String value = et.getCPMJSQZT();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_CPMJSQZT_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_CPMJSQZT);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_CLId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_CLId(boolean bBaseMode,OA_CPMJSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_CLIdDirty())
            return null;

        String value = et.getOA_CLId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_CPMJSQ.FIELD_OA_CLID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_CLId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_CPMJSQ.FIELD_OA_CLID);
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
    protected void onSyncEntity(OA_CPMJSQ et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OA_CPMJSQ et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OA_CPMJSQ et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_WFSTATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFSTATE_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_BZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Bz_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CPH,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Cph_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_FJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_FJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CPMJSQZT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CPMJSQZT_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_OA_CPMJSQID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_CPMJSQId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CPMJSFSHTG,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CPMJSFSHTG_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CLPP,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Clpp_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_MEMO,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Memo_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_WFINSTANCEID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFINSTANCEID_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_ZW,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_ZW_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_OA_CPMJSQNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_CPMJSQName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_LXFS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Lxfs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_COLOR,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Color_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_CPMJSQBZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CPMJSQBZ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_ORGUSERNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_ORGSECTORNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_OA_CLNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_CLName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_ORGSECTORID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_CPMJSQ.FIELD_OA_CLID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_CLId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
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
     * 判断值规则[车牌号][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Cph_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CPH", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[车牌门禁申请状态][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CPMJSQZT_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CPMJSQZT", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[车牌门禁申请标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_CPMJSQId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_CPMJSQID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[车牌门禁申请是否通过][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CPMJSFSHTG_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CPMJSFSHTG", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[车辆品牌][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Clpp_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CLPP", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
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
     * 判断值规则[职务][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_ZW_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ZW", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[车牌门禁申请名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_CPMJSQName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_CPMJSQNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[联系方式][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Lxfs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("LXFS", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")
                    &&checkFieldRegExRule("LXFS", et, bTempMode,"((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\\\d{8}","内容必须为电话号码格式",false)))
                return null;
            return "(内容长度必须小于等于[200] 并且 内容必须为电话号码格式)";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[颜色][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Color_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("COLOR", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[车牌门禁申请步骤][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CPMJSQBZ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CPMJSQBZ", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[申请人][默认规则]
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
     * 判断值规则[部门名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSectorName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECTORNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[车辆名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_CLName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_CLNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[部门标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSectorId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECTORID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[申请人标识][默认规则]
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

    /**
     * 判断值规则[车辆标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_CLId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_CLID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
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
    protected boolean onMergeChild(String strChildType, String strTypeParam, OA_CPMJSQ et) throws Exception {
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
    protected void onUpdateParent(OA_CPMJSQ et)throws Exception {
        super.onUpdateParent(et);
    }


}