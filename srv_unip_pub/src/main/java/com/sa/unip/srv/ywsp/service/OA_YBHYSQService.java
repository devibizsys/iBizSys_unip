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


import com.sa.unip.srv.ywsp.service.OA_CHRYService;
import com.sa.unip.srv.ywsp.entity.OA_CHRY;
import com.sa.unip.srv.ywsp.service.OA_QXJService;
import com.sa.unip.srv.ywsp.entity.OA_QXJ;

import com.sa.unip.srv.ywsp.entity.OA_YBHYSQ;
import com.sa.unip.srv.ywsp.dao.OA_YBHYSQDAO;
import com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel;


/**
 * 实体[OA_YBHYSQ] 服务对象基类
 */
@Component
public class OA_YBHYSQService extends com.sa.unip.srv.UniPSampleSysServiceBase<OA_YBHYSQ> {
    private static final Log log = LogFactory.getLog(OA_YBHYSQService.class);
    /**
     * 实体数据集合[我的会议申请记录]标识
     */
    public final static String DATASET_CURYBHYSQ = "CurYbhysq";
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";

    /**
     * 实体行为[添加会议参会人员]标识
     */
    public final static String ACTION_TJHYCHRY = "TJHYCHRY";
    /**
     * 实体行为[发送座位号通知]标识
     */
    public final static String ACTION_FSZWHTZ = "FSZWHTZ";
    /**
     * 实体行为[更新会议室使用结束状态]标识
     */
    public final static String ACTION_GXHYSSYJSZT = "GXHYSSYJSZT";
    /**
     * 实体行为[更新会议室使用开始状态]标识
     */
    public final static String ACTION_GXHYSKSZT = "GXHYSKSZT";
    /**
     * 实体行为[参会情况通报]标识
     */
    public final static String ACTION_CHQKTB = "CHQKTB";

    public OA_YBHYSQService () {
        super();

    }

    /**
     * 获取实体[OA_YBHYSQ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_YBHYSQService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OA_YBHYSQ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_YBHYSQService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OA_YBHYSQService)ServiceGlobal.getService(OA_YBHYSQService.class, sessionFactory);
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
        return "com.sa.unip.srv.ywsp.service.OA_YBHYSQService";
    }

    private OA_YBHYSQDEModel oA_YBHYSQDEModel;
    /**
     * 获取实体[OA_YBHYSQ]模型对象
     */
    public  OA_YBHYSQDEModel getOA_YBHYSQDEModel() {
        if(this.oA_YBHYSQDEModel==null) {
            try {
                this.oA_YBHYSQDEModel = (OA_YBHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_YBHYSQDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_YBHYSQDEModel();
    }


    private OA_YBHYSQDAO oA_YBHYSQDAO;

    /**
     * 获取实体[OA_YBHYSQ]数据操作对象
     */
    public  OA_YBHYSQDAO getOA_YBHYSQDAO() {
        if(this.oA_YBHYSQDAO==null) {
            try {
                this.oA_YBHYSQDAO= (OA_YBHYSQDAO)DAOGlobal.getDAO("com.sa.unip.srv.ywsp.dao.OA_YBHYSQDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.oA_YBHYSQDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOA_YBHYSQDAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_CURYBHYSQ,true)==0) {
            return this.fetchCurYbhysq(iDEDataSetFetchContext);
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
        if(StringHelper.compare(strAction,ACTION_TJHYCHRY,true)==0) {
            this.tJHYCHRY((OA_YBHYSQ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_FSZWHTZ,true)==0) {
            this.fSZWHTZ((OA_YBHYSQ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_GXHYSSYJSZT,true)==0) {
            this.gXHYSSYJSZT((OA_YBHYSQ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_GXHYSKSZT,true)==0) {
            this.gXHYSKSZT((OA_YBHYSQ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_CHQKTB,true)==0) {
            this.cHQKTB((OA_YBHYSQ)entity);
            return;
        }
        super.onExecuteAction(strAction,entity);
    }

    /**
     * 获取数据集合[我的会议申请记录]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchCurYbhysq(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_CURYBHYSQ,false);
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





    /**
     * 执行操作[TJHYCHRY]
     */
    public void tJHYCHRY(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        final IServicePlugin iServicePlugin = getPlugin();
        if(iServicePlugin!=null && iServicePlugin.doCustomAction(this,ACTION_TJHYCHRY, IServicePlugin.ACTIONPOS_ENTER,oA_YBHYSQ,null).getResult()==PluginActionResult.RESULT_REPLACE)
            return;
        this.testDEMainStateAction(oA_YBHYSQ,ACTION_TJHYCHRY);
        final OA_YBHYSQ oA_YBHYSQ2 = oA_YBHYSQ;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                if(iServicePlugin==null || iServicePlugin.doCustomAction(getService(),ACTION_TJHYCHRY, IServicePlugin.ACTIONPOS_ACTION,oA_YBHYSQ2,null).getResult()!=PluginActionResult.RESULT_REPLACE)
                    onTJHYCHRY(oA_YBHYSQ2);
            }
        });

        if(iServicePlugin!=null)
            iServicePlugin.doCustomAction(this,ACTION_TJHYCHRY,IServicePlugin.ACTIONPOS_LEAVE,oA_YBHYSQ,null);
    }

    /*
     * 执行操作[TJHYCHRY]
     */
    protected void onTJHYCHRY(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        throw new Exception("没有实现自定义行为[TJHYCHRY]");
    }

    /**
     * 执行操作[FSZWHTZ]
     */
    public void fSZWHTZ(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        final IServicePlugin iServicePlugin = getPlugin();
        if(iServicePlugin!=null && iServicePlugin.doCustomAction(this,ACTION_FSZWHTZ, IServicePlugin.ACTIONPOS_ENTER,oA_YBHYSQ,null).getResult()==PluginActionResult.RESULT_REPLACE)
            return;
        this.testDEMainStateAction(oA_YBHYSQ,ACTION_FSZWHTZ);
        final OA_YBHYSQ oA_YBHYSQ2 = oA_YBHYSQ;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                if(iServicePlugin==null || iServicePlugin.doCustomAction(getService(),ACTION_FSZWHTZ, IServicePlugin.ACTIONPOS_ACTION,oA_YBHYSQ2,null).getResult()!=PluginActionResult.RESULT_REPLACE)
                    onFSZWHTZ(oA_YBHYSQ2);
            }
        });

        if(iServicePlugin!=null)
            iServicePlugin.doCustomAction(this,ACTION_FSZWHTZ,IServicePlugin.ACTIONPOS_LEAVE,oA_YBHYSQ,null);
    }

    /*
     * 执行操作[FSZWHTZ]
     */
    protected void onFSZWHTZ(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        throw new Exception("没有实现自定义行为[FSZWHTZ]");
    }

    /**
     * 执行操作[CHQKTB]
     */
    public void cHQKTB(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        final IServicePlugin iServicePlugin = getPlugin();
        if(iServicePlugin!=null && iServicePlugin.doCustomAction(this,ACTION_CHQKTB, IServicePlugin.ACTIONPOS_ENTER,oA_YBHYSQ,null).getResult()==PluginActionResult.RESULT_REPLACE)
            return;
        this.testDEMainStateAction(oA_YBHYSQ,ACTION_CHQKTB);
        final OA_YBHYSQ oA_YBHYSQ2 = oA_YBHYSQ;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                if(iServicePlugin==null || iServicePlugin.doCustomAction(getService(),ACTION_CHQKTB, IServicePlugin.ACTIONPOS_ACTION,oA_YBHYSQ2,null).getResult()!=PluginActionResult.RESULT_REPLACE)
                    onCHQKTB(oA_YBHYSQ2);
            }
        });

        if(iServicePlugin!=null)
            iServicePlugin.doCustomAction(this,ACTION_CHQKTB,IServicePlugin.ACTIONPOS_LEAVE,oA_YBHYSQ,null);
    }

    /*
     * 执行操作[CHQKTB]
     */
    protected void onCHQKTB(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        throw new Exception("没有实现自定义行为[CHQKTB]");
    }


    /**
     * 执行操作[GXHYSSYJSZT]
     */
    public void gXHYSSYJSZT(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        final OA_YBHYSQ et = oA_YBHYSQ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(oA_YBHYSQ,ACTION_GXHYSSYJSZT);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getOA_YBHYSQDEModel().getDELogic("GXHYSSYJSZT");
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
     * 执行操作[GXHYSKSZT]
     */
    public void gXHYSKSZT(OA_YBHYSQ oA_YBHYSQ) throws Exception {

        final OA_YBHYSQ et = oA_YBHYSQ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(oA_YBHYSQ,ACTION_GXHYSKSZT);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getOA_YBHYSQDEModel().getDELogic("GXHYSSYKSZT");
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
    protected void onFillParentInfo(OA_YBHYSQ et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID", true)==0)) {
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
        //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_HYSService",this.getSessionFactory());
            com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity = ( com.sa.unip.srv.jcsj.entity.OA_HYS)iService.getDEModel().createEntity();
            parentEntity.set(com.sa.unip.srv.jcsj.entity.OA_HYS.FIELD_OA_HYSID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_HYSID(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgSectorService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgSector)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgSector.FIELD_ORGSECTORID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_ORGSECTOR(et,parentEntity );
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
    protected void onFillParentInfo_ORGUSER(OA_YBHYSQ et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
        et.setOrgUserName(parentEntity.getOrgUserName());
        et.setDhhm(parentEntity.getReserver30());
    }

    /**
    * 填充数据的父数据信息[会议室]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_HYSID(OA_YBHYSQ et,com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        et.setOA_HYSId(parentEntity.getOA_HYSId());
        et.setOA_HYSName(parentEntity.getOA_HYSName());
    }

    /**
    * 填充数据的父数据信息[组织部门]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_ORGSECTOR(OA_YBHYSQ et,net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        et.setOrgSectorId(parentEntity.getOrgSectorId());
        et.setOrgSectorName(parentEntity.getOrgSectorName());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OA_YBHYSQ et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
            if(et.getHYSQZT()==null) {
                et.setHYSQZT((String)DefaultValueHelper.getValue(this.getWebContext(),"","10",25));
            }
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_ORGUSER(et, bCreate);
        //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
        onFillEntityFullInfo_HYSID(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        onFillEntityFullInfo_ORGSECTOR(et, bCreate);
    }

    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_ORGUSER(OA_YBHYSQ et, boolean bCreate) throws Exception {
    }
    /**
    * 填充实体的数据信息 会议室
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_HYSID(OA_YBHYSQ et, boolean bCreate) throws Exception {
    }
    /**
    * 填充实体的数据信息 组织部门
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_ORGSECTOR(OA_YBHYSQ et, boolean bCreate) throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OA_YBHYSQ et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_YBHYSQ> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        return selectByORGUSER(parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_YBHYSQ> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_YBHYSQ.FIELD_ORGUSERID, parentEntity.getOrgUserId());
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
     * 通过关系[会议室]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_YBHYSQ> selectByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        return selectByHYSID(parentEntity,"");
    }
    /**
     * 通过关系[会议室]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_YBHYSQ> selectByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_YBHYSQ.FIELD_OA_HYSID, parentEntity.getOA_HYSId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByHYSIDCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[会议室]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByHYSIDCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_YBHYSQ> selectByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        return selectByORGSECTOR(parentEntity,"");
    }
    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_YBHYSQ> selectByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_YBHYSQ.FIELD_ORGSECTORID, parentEntity.getOrgSectorId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByORGSECTORCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织部门]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByORGSECTORCond(SelectCond selectCond) throws Exception {

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
        java.util.ArrayList<OA_YBHYSQ> list =  this.selectByORGUSER(parentEntity);
        for(OA_YBHYSQ item:list) {
            OA_YBHYSQ item2 = (OA_YBHYSQ)getDEModel().createEntity();
            item2.setOA_YBHYSQId(item.getOA_YBHYSQId());
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
        java.util.ArrayList<OA_YBHYSQ> removeList = selectByORGUSER(parentEntity);
        onBeforeRemoveByORGUSER(parentEntity,removeList );

        // 执行删除
        for (OA_YBHYSQ item : removeList ) {
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
    protected void onBeforeRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_YBHYSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_YBHYSQ> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[会议室]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
    }


    /**
     * 通过关系[会议室]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        java.util.ArrayList<OA_YBHYSQ> list =  this.selectByHYSID(parentEntity);
        for(OA_YBHYSQ item:list) {
            OA_YBHYSQ item2 = (OA_YBHYSQ)getDEModel().createEntity();
            item2.setOA_YBHYSQId(item.getOA_YBHYSQId());
            item2.setOA_HYSId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[会议室]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        final com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByHYSID(parentEntity2);
                internalRemoveByHYSID(parentEntity2);
                onAfterRemoveByHYSID(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[会议室]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[会议室]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        java.util.ArrayList<OA_YBHYSQ> removeList = selectByHYSID(parentEntity);
        onBeforeRemoveByHYSID(parentEntity,removeList );

        // 执行删除
        for (OA_YBHYSQ item : removeList ) {
            remove(item );
        }
        onAfterRemoveByHYSID(parentEntity,removeList );
    }

    /**
     * 通过关系[会议室]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {

    }

    /**
     * 通过关系[会议室]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity,java.util.ArrayList<OA_YBHYSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[会议室]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByHYSID(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity,java.util.ArrayList<OA_YBHYSQ> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[组织部门]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
    }


    /**
     * 通过关系[组织部门]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OA_YBHYSQ> list =  this.selectByORGSECTOR(parentEntity);
        for(OA_YBHYSQ item:list) {
            OA_YBHYSQ item2 = (OA_YBHYSQ)getDEModel().createEntity();
            item2.setOA_YBHYSQId(item.getOA_YBHYSQId());
            item2.setOrgSectorId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织部门]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByORGSECTOR(parentEntity2);
                internalRemoveByORGSECTOR(parentEntity2);
                onAfterRemoveByORGSECTOR(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织部门]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织部门]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OA_YBHYSQ> removeList = selectByORGSECTOR(parentEntity);
        onBeforeRemoveByORGSECTOR(parentEntity,removeList );

        // 执行删除
        for (OA_YBHYSQ item : removeList ) {
            remove(item );
        }
        onAfterRemoveByORGSECTOR(parentEntity,removeList );
    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OA_YBHYSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OA_YBHYSQ> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OA_YBHYSQ et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OA_YBHYSQ et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_ORGUSER(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
        if(et.getOA_HYSId()!=null) {
            IEntity entity = cloneSession.getEntity("OA_HYS",et.getOA_HYSId());
            if(entity !=null) {
                onFillParentInfo_HYSID(et,(com.sa.unip.srv.jcsj.entity.OA_HYS) entity);
            }
        }
        if(et.getOrgSectorId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGSECTOR",et.getOrgSectorId());
            if(entity !=null) {
                onFillParentInfo_ORGSECTOR(et,(net.ibizsys.psrt.srv.common.entity.OrgSector) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OA_YBHYSQ et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OA_YBHYSQ  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 是否审核通过
        entityFieldError = onCheckField_SFSHTG( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 备注
        entityFieldError = onCheckField_Bz( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议申请标识
        entityFieldError = onCheckField_OA_YBHYSQId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议标题
        entityFieldError = onCheckField_OA_YBHYSQName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 申请人标识
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议时间
        entityFieldError = onCheckField_HYSJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议要求
        entityFieldError = onCheckField_Hyyq( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议类型
        entityFieldError = onCheckField_HYLX( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 申请时间
        entityFieldError = onCheckField_SQSJ( bBaseMode,  et,  bCreate,  bTempMode);
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
        //检查属性 工作流状态
        entityFieldError = onCheckField_WFSTATE( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 工作流实例
        entityFieldError = onCheckField_WFINSTANCEID( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议申请状态
        entityFieldError = onCheckField_HYSQZT( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 通知总人数
        entityFieldError = onCheckField_Tzzrs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 已迟到人数
        entityFieldError = onCheckField_Ycdrs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 未参会人数
        entityFieldError = onCheckField_Wchrs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 已参会人数
        entityFieldError = onCheckField_Ychrs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 已请假人数
        entityFieldError = onCheckField_Yqjrs( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议申请步骤
        entityFieldError = onCheckField_HYSQBZ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议内容
        entityFieldError = onCheckField_HYNR( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 参会人员座位数据
        entityFieldError = onCheckField_Chryzwsj( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议室标识
        entityFieldError = onCheckField_OA_HYSId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[SFSHTG]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_SFSHTG(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSFSHTGDirty())
            return null;

        Integer value = et.getSFSHTG();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_SFSHTG_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_SFSHTG);
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
    protected EntityFieldError onCheckField_Bz(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_BZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_YBHYSQId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_YBHYSQId(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_YBHYSQIdDirty())
            return null;

        String value = et.getOA_YBHYSQId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_YBHYSQ.FIELD_OA_YBHYSQID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_YBHYSQId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_OA_YBHYSQID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_YBHYSQName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_YBHYSQName(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_YBHYSQNameDirty())
            return null;

        String value = et.getOA_YBHYSQName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_YBHYSQName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_OA_YBHYSQNAME);
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
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_ORGUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYSJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYSJ(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYSJDirty())
            return null;

        Timestamp value = et.getHYSJ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYSJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_HYSJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Hyyq]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Hyyq(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHyyqDirty())
            return null;

        String value = et.getHyyq();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Hyyq_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_HYYQ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYLX]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYLX(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYLXDirty())
            return null;

        String value = et.getHYLX();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYLX_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_HYLX);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[SQSJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_SQSJ(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isSQSJDirty())
            return null;

        Timestamp value = et.getSQSJ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_SQSJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_SQSJ);
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
    protected EntityFieldError onCheckField_Memo(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_MEMO);
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
    protected EntityFieldError onCheckField_FJ(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_FJ);
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
    protected EntityFieldError onCheckField_WFSTATE(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_WFSTATE);
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
    protected EntityFieldError onCheckField_WFINSTANCEID(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_WFINSTANCEID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYSQZT]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYSQZT(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYSQZTDirty())
            return null;

        String value = et.getHYSQZT();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYSQZT_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_HYSQZT);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Tzzrs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Tzzrs(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isTzzrsDirty())
            return null;

        Integer value = et.getTzzrs();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Tzzrs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_TZZRS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Ycdrs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Ycdrs(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isYcdrsDirty())
            return null;

        Integer value = et.getYcdrs();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Ycdrs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_YCDRS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Wchrs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Wchrs(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isWchrsDirty())
            return null;

        Integer value = et.getWchrs();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Wchrs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_WCHRS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Ychrs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Ychrs(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isYchrsDirty())
            return null;

        Integer value = et.getYchrs();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Ychrs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_YCHRS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Yqjrs]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Yqjrs(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isYqjrsDirty())
            return null;

        Integer value = et.getYqjrs();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Yqjrs_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_YQJRS);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYSQBZ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYSQBZ(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYSQBZDirty())
            return null;

        String value = et.getHYSQBZ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYSQBZ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_HYSQBZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYNR]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYNR(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYNRDirty())
            return null;

        String value = et.getHYNR();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYNR_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_HYNR);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Chryzwsj]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Chryzwsj(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isChryzwsjDirty())
            return null;

        String value = et.getChryzwsj();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Chryzwsj_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_CHRYZWSJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_HYSId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_HYSId(boolean bBaseMode,OA_YBHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_HYSIdDirty())
            return null;

        String value = et.getOA_HYSId();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_HYSId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_YBHYSQ.FIELD_OA_HYSID);
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
    protected void onSyncEntity(OA_YBHYSQ et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OA_YBHYSQ et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OA_YBHYSQ et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_HYYQ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Hyyq_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_WCHRS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Wchrs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_HYLX,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYLX_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_BZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Bz_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_ENABLE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Enable_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_SFSHTG,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_SFSHTG_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_OA_YBHYSQID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_YBHYSQId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_MEMO,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Memo_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_WFSTATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFSTATE_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_YCHRS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Ychrs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_HYNR,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYNR_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_OA_YBHYSQNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_YBHYSQName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_HYSJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYSJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_YCDRS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Ycdrs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_HYSQZT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYSQZT_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_HYSQBZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYSQBZ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_WFINSTANCEID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFINSTANCEID_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_SQSJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_SQSJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_YQJRS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Yqjrs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_TZZRS,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Tzzrs_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_FJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_FJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_CHRYZWSJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Chryzwsj_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_ORGUSERNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_OA_HYSNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_HYSName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_ORGSECTORNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_DHHM,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Dhhm_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_OA_HYSID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_HYSId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_ORGSECTORID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_YBHYSQ.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[会议要求][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Hyyq_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYYQ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
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
     * 判断值规则[未参会人数][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Wchrs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
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
     * 判断值规则[会议类型][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYLX_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYLX", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[逻辑有效标志][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Enable_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[是否审核通过][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_SFSHTG_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[会议申请标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_YBHYSQId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_YBHYSQID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
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
     * 判断值规则[已参会人数][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Ychrs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[会议内容][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYNR_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYNR", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[会议标题][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_YBHYSQName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_YBHYSQNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[会议时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYSJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[已迟到人数][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Ycdrs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[会议申请状态][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYSQZT_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYSQZT", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[会议申请步骤][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYSQBZ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYSQBZ", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[申请时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_SQSJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[已请假人数][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Yqjrs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[通知总人数][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Tzzrs_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
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
            if((checkFieldStringLengthRule("FJ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
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
     * 判断值规则[参会人员座位数据][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Chryzwsj_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CHRYZWSJ", et, bTempMode,null,false,1048576,true,"内容长度必须小于等于[1048576]")))
                return null;
            return "内容长度必须小于等于[1048576]";
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
     * 判断值规则[会议室名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_HYSName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_HYSNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
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
     * 判断值规则[电话号码][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Dhhm_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DHHM", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[会议室标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_HYSId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_HYSID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
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



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onMergeChild(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected boolean onMergeChild(String strChildType, String strTypeParam, OA_YBHYSQ et) throws Exception {
        boolean bRet = false;
        //关系类型 : DER1N ,从实体 :OA_CHRY / 参会人员
        if (StringHelper.isNullOrEmpty(strChildType)||(((StringHelper.compare(strChildType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strChildType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID", true)==0))) {
            if( onMergeChild_CHRY(et))
                bRet = true;
        }
        if(super.onMergeChild( strChildType, strTypeParam,  et))
            bRet = true;
        return bRet;
    }

    /**
     * 合并子数据（参会人员）
     * @param et
     * @return 是否发生变化
     * @throws Exception
     */
    protected boolean onMergeChild_CHRY(OA_YBHYSQ et) throws Exception {
        if(true) {
            net.ibizsys.paas.db.SelectContext selectContext = new net.ibizsys.paas.db.SelectContext();
            net.ibizsys.paas.db.SelectField field4 = new  net.ibizsys.paas.db.SelectField();
            field4.setAlias("TZZRS");
            field4.setFunc("COUNT");
            selectContext.addSelectField(field4);
            String strKey = DataObject.getStringValue(et.getOA_YBHYSQId());
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
            selectContext.set("YBHYSQID",et.getOA_YBHYSQId());
            ArrayList selectList = null;
            if(strKey.indexOf(ServiceBase.TEMPKEY) == 0)
                selectList = iService.selectTemp(selectContext);
            else
                selectList = iService.select(selectContext);

            if(selectList.size()==0)
                throw new Exception("无法获取指定数据");

            IEntity iEntity = (IEntity)selectList.get(0);
            iEntity.copyTo(et,false);
        }
        if(true) {
            net.ibizsys.paas.db.SelectContext selectContext = new net.ibizsys.paas.db.SelectContext();
            net.ibizsys.paas.db.SelectField field0 = new  net.ibizsys.paas.db.SelectField();
            field0.setAlias("YCHRS");
            selectContext.setDEDataQueryName("YCH");
            field0.setFunc("COUNT");
            selectContext.addSelectField(field0);
            String strKey = DataObject.getStringValue(et.getOA_YBHYSQId());
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
            selectContext.set("YBHYSQID",et.getOA_YBHYSQId());
            ArrayList selectList = null;
            if(strKey.indexOf(ServiceBase.TEMPKEY) == 0)
                selectList = iService.selectTemp(selectContext);
            else
                selectList = iService.select(selectContext);

            if(selectList.size()==0)
                throw new Exception("无法获取指定数据");

            IEntity iEntity = (IEntity)selectList.get(0);
            iEntity.copyTo(et,false);
        }
        if(true) {
            net.ibizsys.paas.db.SelectContext selectContext = new net.ibizsys.paas.db.SelectContext();
            net.ibizsys.paas.db.SelectField field1 = new  net.ibizsys.paas.db.SelectField();
            field1.setAlias("YQJRS");
            selectContext.setDEDataQueryName("YQJ");
            field1.setFunc("COUNT");
            selectContext.addSelectField(field1);
            String strKey = DataObject.getStringValue(et.getOA_YBHYSQId());
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
            selectContext.set("YBHYSQID",et.getOA_YBHYSQId());
            ArrayList selectList = null;
            if(strKey.indexOf(ServiceBase.TEMPKEY) == 0)
                selectList = iService.selectTemp(selectContext);
            else
                selectList = iService.select(selectContext);

            if(selectList.size()==0)
                throw new Exception("无法获取指定数据");

            IEntity iEntity = (IEntity)selectList.get(0);
            iEntity.copyTo(et,false);
        }
        if(true) {
            net.ibizsys.paas.db.SelectContext selectContext = new net.ibizsys.paas.db.SelectContext();
            net.ibizsys.paas.db.SelectField field2 = new  net.ibizsys.paas.db.SelectField();
            field2.setAlias("YCDRS");
            selectContext.setDEDataQueryName("YCDJ");
            field2.setFunc("COUNT");
            selectContext.addSelectField(field2);
            String strKey = DataObject.getStringValue(et.getOA_YBHYSQId());
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
            selectContext.set("YBHYSQID",et.getOA_YBHYSQId());
            ArrayList selectList = null;
            if(strKey.indexOf(ServiceBase.TEMPKEY) == 0)
                selectList = iService.selectTemp(selectContext);
            else
                selectList = iService.select(selectContext);

            if(selectList.size()==0)
                throw new Exception("无法获取指定数据");

            IEntity iEntity = (IEntity)selectList.get(0);
            iEntity.copyTo(et,false);
        }
        if(true) {
            net.ibizsys.paas.db.SelectContext selectContext = new net.ibizsys.paas.db.SelectContext();
            net.ibizsys.paas.db.SelectField field3 = new  net.ibizsys.paas.db.SelectField();
            field3.setAlias("WCHRS");
            selectContext.setDEDataQueryName("WCH");
            field3.setFunc("COUNT");
            selectContext.addSelectField(field3);
            String strKey = DataObject.getStringValue(et.getOA_YBHYSQId());
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
            selectContext.set("YBHYSQID",et.getOA_YBHYSQId());
            ArrayList selectList = null;
            if(strKey.indexOf(ServiceBase.TEMPKEY) == 0)
                selectList = iService.selectTemp(selectContext);
            else
                selectList = iService.select(selectContext);

            if(selectList.size()==0)
                throw new Exception("无法获取指定数据");

            IEntity iEntity = (IEntity)selectList.get(0);
            iEntity.copyTo(et,false);
        }
        return true;
    }


    /**
     * 更新父数据
     * @param et
     * @throws Exception
     */
    @Override
    protected void onUpdateParent(OA_YBHYSQ et)throws Exception {
        super.onUpdateParent(et);
    }


}