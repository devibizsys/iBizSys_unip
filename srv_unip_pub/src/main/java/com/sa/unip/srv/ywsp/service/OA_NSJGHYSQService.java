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



import com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ;
import com.sa.unip.srv.ywsp.dao.OA_NSJGHYSQDAO;
import com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel;


/**
 * 实体[OA_NSJGHYSQ] 服务对象基类
 */
@Component
public class OA_NSJGHYSQService extends com.sa.unip.srv.UniPSampleSysServiceBase<OA_NSJGHYSQ> {
    private static final Log log = LogFactory.getLog(OA_NSJGHYSQService.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";
    /**
     * 实体数据集合[我的内设机构会议申请记录]标识
     */
    public final static String DATASET_CURNSJGHYSQ = "CurNsjghysq";

    /**
     * 实体行为[更新内设会议室使用结束状态]标识
     */
    public final static String ACTION_GXNSHYSSYJSZT = "GXNSHYSSYJSZT";
    /**
     * 实体行为[更新内设会议室使用开始状态]标识
     */
    public final static String ACTION_GXNSHYSSYKSZT = "GXNSHYSSYKSZT";

    public OA_NSJGHYSQService () {
        super();

    }

    /**
     * 获取实体[OA_NSJGHYSQ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_NSJGHYSQService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OA_NSJGHYSQ]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OA_NSJGHYSQService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OA_NSJGHYSQService)ServiceGlobal.getService(OA_NSJGHYSQService.class, sessionFactory);
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
        return "com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService";
    }

    private OA_NSJGHYSQDEModel oA_NSJGHYSQDEModel;
    /**
     * 获取实体[OA_NSJGHYSQ]模型对象
     */
    public  OA_NSJGHYSQDEModel getOA_NSJGHYSQDEModel() {
        if(this.oA_NSJGHYSQDEModel==null) {
            try {
                this.oA_NSJGHYSQDEModel = (OA_NSJGHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_NSJGHYSQDEModel();
    }


    private OA_NSJGHYSQDAO oA_NSJGHYSQDAO;

    /**
     * 获取实体[OA_NSJGHYSQ]数据操作对象
     */
    public  OA_NSJGHYSQDAO getOA_NSJGHYSQDAO() {
        if(this.oA_NSJGHYSQDAO==null) {
            try {
                this.oA_NSJGHYSQDAO= (OA_NSJGHYSQDAO)DAOGlobal.getDAO("com.sa.unip.srv.ywsp.dao.OA_NSJGHYSQDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOA_NSJGHYSQDAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_DEFAULT,true)==0) {
            return this.fetchDefault(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_CURNSJGHYSQ,true)==0) {
            return this.fetchCurNsjghysq(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onExecuteAction(java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected  void onExecuteAction(String strAction,IEntity entity) throws Exception {
        if(StringHelper.compare(strAction,ACTION_GXNSHYSSYJSZT,true)==0) {
            this.gXNSHYSSYJSZT((OA_NSJGHYSQ)entity);
            return;
        }
        if(StringHelper.compare(strAction,ACTION_GXNSHYSSYKSZT,true)==0) {
            this.gXNSHYSSYKSZT((OA_NSJGHYSQ)entity);
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
     * 获取数据集合[我的内设机构会议申请记录]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchCurNsjghysq(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_CURNSJGHYSQ,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }






    /**
     * 执行操作[GXNSHYSSYJSZT]
     */
    public void gXNSHYSSYJSZT(OA_NSJGHYSQ oA_NSJGHYSQ) throws Exception {

        final OA_NSJGHYSQ et = oA_NSJGHYSQ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(oA_NSJGHYSQ,ACTION_GXNSHYSSYJSZT);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getOA_NSJGHYSQDEModel().getDELogic("GXNSHYSSYJSZT");
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
     * 执行操作[GXNSHYSSYKSZT]
     */
    public void gXNSHYSSYKSZT(OA_NSJGHYSQ oA_NSJGHYSQ) throws Exception {

        final OA_NSJGHYSQ et = oA_NSJGHYSQ;
        et.setSessionFactory(this.getSessionFactory());
        this.testDEMainStateAction(oA_NSJGHYSQ,ACTION_GXNSHYSSYKSZT);
        final IDELogicModel iDELogicModel = (IDELogicModel ) this.getOA_NSJGHYSQDEModel().getDELogic("GXNSHYSSYKSZT");
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
    protected void onFillParentInfo(OA_NSJGHYSQ et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID", true)==0)) {
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
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID", true)==0)) {
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
        //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_OA_NSJGHYSQ_OA_HYS_HYSID", true)==0)) {
            IService iService= ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_HYSService",this.getSessionFactory());
            com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity = ( com.sa.unip.srv.jcsj.entity.OA_HYS)iService.getDEModel().createEntity();
            parentEntity.set(com.sa.unip.srv.jcsj.entity.OA_HYS.FIELD_OA_HYSID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_HYS(et,parentEntity );
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
    protected void onFillParentInfo_ORGUSER(OA_NSJGHYSQ et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
        et.setOrgUserName(parentEntity.getOrgUserName());
    }

    /**
    * 填充数据的父数据信息[组织部门]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_ORGSECTOR(OA_NSJGHYSQ et,net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        et.setOrgSectorId(parentEntity.getOrgSectorId());
        et.setOrgSectorName(parentEntity.getOrgSectorName());
    }

    /**
    * 填充数据的父数据信息[会议室]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_HYS(OA_NSJGHYSQ et,com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        et.setHysid(parentEntity.getOA_HYSId());
        et.setHYSNAME(parentEntity.getOA_HYSName());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OA_NSJGHYSQ et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
            if(et.getNSJGHYSQZT()==null) {
                et.setNSJGHYSQZT((String)DefaultValueHelper.getValue(this.getWebContext(),"","10",25));
            }
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_ORGUSER(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        onFillEntityFullInfo_ORGSECTOR(et, bCreate);
        //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
        onFillEntityFullInfo_HYS(et, bCreate);
    }

    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_ORGUSER(OA_NSJGHYSQ et, boolean bCreate) throws Exception {
        if(et.isOrgUserIdDirty()) {
            if(et.getOrgUserId()!=null) {
                if((true&&et.getOrgUserId()==null)||(true&&et.getOrgUserName()==null)) {
                    net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity  = et.getORGUSER();
                    et.setOrgUserName(parentEntity.getOrgUserName());
                }

            } else {
                et.setOrgUserName(null);
            }
        }
    }
    /**
    * 填充实体的数据信息 组织部门
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_ORGSECTOR(OA_NSJGHYSQ et, boolean bCreate) throws Exception {
        if(et.isOrgSectorIdDirty()) {
            if(et.getOrgSectorId()!=null) {
                if((true&&et.getOrgSectorId()==null)||(true&&et.getOrgSectorName()==null)) {
                    net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity  = et.getORGSECTOR();
                    et.setOrgSectorName(parentEntity.getOrgSectorName());
                }

            } else {
                et.setOrgSectorName(null);
            }
        }
    }
    /**
    * 填充实体的数据信息 会议室
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_HYS(OA_NSJGHYSQ et, boolean bCreate) throws Exception {
        if(et.isHysidDirty()) {
            if(et.getHysid()!=null) {
                if((true&&et.getHysid()==null)||(true&&et.getHYSNAME()==null)) {
                    com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity  = et.getHYS();
                    et.setHYSNAME(parentEntity.getOA_HYSName());
                }

            } else {
                et.setHYSNAME(null);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OA_NSJGHYSQ et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_NSJGHYSQ> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        return selectByORGUSER(parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_NSJGHYSQ> selectByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_NSJGHYSQ.FIELD_ORGUSERID, parentEntity.getOrgUserId());
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
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_NSJGHYSQ> selectByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        return selectByORGSECTOR(parentEntity,"");
    }
    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_NSJGHYSQ> selectByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_NSJGHYSQ.FIELD_ORGSECTORID, parentEntity.getOrgSectorId());
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
     * 通过关系[会议室]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OA_NSJGHYSQ> selectByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        return selectByHYS(parentEntity,"");
    }
    /**
     * 通过关系[会议室]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OA_NSJGHYSQ> selectByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OA_NSJGHYSQ.FIELD_HYSID, parentEntity.getOA_HYSId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByHYSCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[会议室]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByHYSCond(SelectCond selectCond) throws Exception {

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
        java.util.ArrayList<OA_NSJGHYSQ> list =  this.selectByORGUSER(parentEntity);
        for(OA_NSJGHYSQ item:list) {
            OA_NSJGHYSQ item2 = (OA_NSJGHYSQ)getDEModel().createEntity();
            item2.setOA_NSJGHYSQId(item.getOA_NSJGHYSQId());
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
        java.util.ArrayList<OA_NSJGHYSQ> removeList = selectByORGUSER(parentEntity);
        onBeforeRemoveByORGUSER(parentEntity,removeList );

        // 执行删除
        for (OA_NSJGHYSQ item : removeList ) {
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
    protected void onBeforeRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_NSJGHYSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByORGUSER(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OA_NSJGHYSQ> removeList) throws Exception {

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
        java.util.ArrayList<OA_NSJGHYSQ> list =  this.selectByORGSECTOR(parentEntity);
        for(OA_NSJGHYSQ item:list) {
            OA_NSJGHYSQ item2 = (OA_NSJGHYSQ)getDEModel().createEntity();
            item2.setOA_NSJGHYSQId(item.getOA_NSJGHYSQId());
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
        java.util.ArrayList<OA_NSJGHYSQ> removeList = selectByORGSECTOR(parentEntity);
        onBeforeRemoveByORGSECTOR(parentEntity,removeList );

        // 执行删除
        for (OA_NSJGHYSQ item : removeList ) {
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
    protected void onBeforeRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OA_NSJGHYSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByORGSECTOR(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OA_NSJGHYSQ> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[会议室]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
    }


    /**
     * 通过关系[会议室]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        java.util.ArrayList<OA_NSJGHYSQ> list =  this.selectByHYS(parentEntity);
        for(OA_NSJGHYSQ item:list) {
            OA_NSJGHYSQ item2 = (OA_NSJGHYSQ)getDEModel().createEntity();
            item2.setOA_NSJGHYSQId(item.getOA_NSJGHYSQId());
            item2.setHysid(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[会议室]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        final com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByHYS(parentEntity2);
                internalRemoveByHYS(parentEntity2);
                onAfterRemoveByHYS(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[会议室]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[会议室]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {
        java.util.ArrayList<OA_NSJGHYSQ> removeList = selectByHYS(parentEntity);
        onBeforeRemoveByHYS(parentEntity,removeList );

        // 执行删除
        for (OA_NSJGHYSQ item : removeList ) {
            remove(item );
        }
        onAfterRemoveByHYS(parentEntity,removeList );
    }

    /**
     * 通过关系[会议室]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity) throws Exception {

    }

    /**
     * 通过关系[会议室]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity,java.util.ArrayList<OA_NSJGHYSQ> removeList) throws Exception {

    }

    /**
     * 通过关系[会议室]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByHYS(com.sa.unip.srv.jcsj.entity.OA_HYS parentEntity,java.util.ArrayList<OA_NSJGHYSQ> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OA_NSJGHYSQ et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OA_NSJGHYSQ et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_ORGUSER(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
        if(et.getOrgSectorId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGSECTOR",et.getOrgSectorId());
            if(entity !=null) {
                onFillParentInfo_ORGSECTOR(et,(net.ibizsys.psrt.srv.common.entity.OrgSector) entity);
            }
        }
        if(et.getHysid()!=null) {
            IEntity entity = cloneSession.getEntity("OA_HYS",et.getHysid());
            if(entity !=null) {
                onFillParentInfo_HYS(et,(com.sa.unip.srv.jcsj.entity.OA_HYS) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OA_NSJGHYSQ et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OA_NSJGHYSQ  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 内设机构会议申请是否审核通过
        entityFieldError = onCheckField_Nsjgsfshtg( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 审核意见
        entityFieldError = onCheckField_Memo( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 内设机构会议申请标识
        entityFieldError = onCheckField_OA_NSJGHYSQId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 内设机构会议申请名称
        entityFieldError = onCheckField_OA_NSJGHYSQName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议时间
        entityFieldError = onCheckField_HYSJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议地点
        entityFieldError = onCheckField_HYDD( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议要求
        entityFieldError = onCheckField_HYYQ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 参会领导
        entityFieldError = onCheckField_CHLD( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 承办处室负责人意见
        entityFieldError = onCheckField_CBCSFZRYJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 秘书处意见
        entityFieldError = onCheckField_MSCYJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 院办负责人意见
        entityFieldError = onCheckField_YBFZRYJ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 备注
        entityFieldError = onCheckField_BZ( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 内设机构会议申请状态
        entityFieldError = onCheckField_NSJGHYSQZT( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 内设机构会议申请步骤
        entityFieldError = onCheckField_NSJGHYSQBZ( bBaseMode,  et,  bCreate,  bTempMode);
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
        //检查属性 组织人员标识
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织人员名称
        entityFieldError = onCheckField_OrgUserName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议室标识
        entityFieldError = onCheckField_Hysid( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 会议室
        entityFieldError = onCheckField_HYSNAME( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[Nsjgsfshtg]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Nsjgsfshtg(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isNsjgsfshtgDirty())
            return null;

        String value = et.getNsjgsfshtg();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Nsjgsfshtg_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_NSJGSFSHTG);
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
    protected EntityFieldError onCheckField_Memo(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_MEMO);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_NSJGHYSQId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_NSJGHYSQId(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_NSJGHYSQIdDirty())
            return null;

        String value = et.getOA_NSJGHYSQId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_NSJGHYSQId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OA_NSJGHYSQName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OA_NSJGHYSQName(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOA_NSJGHYSQNameDirty())
            return null;

        String value = et.getOA_NSJGHYSQName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OA_NSJGHYSQName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQNAME);
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
    protected EntityFieldError onCheckField_HYSJ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_HYSJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYDD]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYDD(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYDDDirty())
            return null;

        String value = et.getHYDD();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYDD_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_HYDD);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYYQ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYYQ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYYQDirty())
            return null;

        String value = et.getHYYQ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYYQ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_HYYQ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[CHLD]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_CHLD(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isCHLDDirty())
            return null;

        String value = et.getCHLD();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_CHLD_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_CHLD);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[CBCSFZRYJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_CBCSFZRYJ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isCBCSFZRYJDirty())
            return null;

        String value = et.getCBCSFZRYJ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_CBCSFZRYJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_CBCSFZRYJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[MSCYJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_MSCYJ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isMSCYJDirty())
            return null;

        String value = et.getMSCYJ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_MSCYJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_MSCYJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[YBFZRYJ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_YBFZRYJ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isYBFZRYJDirty())
            return null;

        String value = et.getYBFZRYJ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_YBFZRYJ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_YBFZRYJ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[BZ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_BZ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isBZDirty())
            return null;

        String value = et.getBZ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_BZ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_BZ);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[NSJGHYSQZT]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_NSJGHYSQZT(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isNSJGHYSQZTDirty())
            return null;

        String value = et.getNSJGHYSQZT();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_NSJGHYSQZT_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_NSJGHYSQZT);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[NSJGHYSQBZ]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_NSJGHYSQBZ(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isNSJGHYSQBZDirty())
            return null;

        String value = et.getNSJGHYSQBZ();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_NSJGHYSQBZ_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_NSJGHYSQBZ);
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
    protected EntityFieldError onCheckField_WFINSTANCEID(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_WFINSTANCEID);
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
    protected EntityFieldError onCheckField_WFSTATE(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_WFSTATE);
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
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
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
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_ORGUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgUserName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgUserName(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgUserNameDirty())
            return null;

        String value = et.getOrgUserName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgUserName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_ORGUSERNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Hysid]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Hysid(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHysidDirty())
            return null;

        String value = et.getHysid();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Hysid_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_HYSID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[HYSNAME]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_HYSNAME(boolean bBaseMode,OA_NSJGHYSQ et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isHYSNAMEDirty())
            return null;

        String value = et.getHYSNAME();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_HYSNAME_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OA_NSJGHYSQ.FIELD_HYSNAME);
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
    protected void onSyncEntity(OA_NSJGHYSQ et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OA_NSJGHYSQ et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OA_NSJGHYSQ et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_CHLD,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CHLD_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_MSCYJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_MSCYJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_HYDD,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYDD_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_ENABLE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Enable_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_CBCSFZRYJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CBCSFZRYJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_NSJGHYSQBZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_NSJGHYSQBZ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_NSJGHYSQZT,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_NSJGHYSQZT_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_HYYQ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYYQ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_WFINSTANCEID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFINSTANCEID_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_HYSJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYSJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_MEMO,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Memo_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_OA_NSJGHYSQID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_NSJGHYSQId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_NSJGSFSHTG,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Nsjgsfshtg_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_WFSTATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_WFSTATE_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_BZ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_BZ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_OA_NSJGHYSQNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OA_NSJGHYSQName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_YBFZRYJ,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_YBFZRYJ_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_ORGSECTORNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_HYSNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_HYSNAME_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_ORGUSERNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_ORGSECTORID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_HYSID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Hysid_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OA_NSJGHYSQ.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[参会领导][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CHLD_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CHLD", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[秘书处意见][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_MSCYJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("MSCYJ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[会议地点][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYDD_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYDD", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
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
     * 判断值规则[承办处室负责人意见][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CBCSFZRYJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CBCSFZRYJ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[内设机构会议申请步骤][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_NSJGHYSQBZ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("NSJGHYSQBZ", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[内设机构会议申请状态][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_NSJGHYSQZT_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("NSJGHYSQZT", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
     * 判断值规则[会议要求][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYYQ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYYQ", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
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
     * 判断值规则[内设机构会议申请标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_NSJGHYSQId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_NSJGHYSQID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[内设机构会议申请是否审核通过][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Nsjgsfshtg_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("NSJGSFSHTG", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
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
    protected String onTestValueRule_BZ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("BZ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[内设机构会议申请名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OA_NSJGHYSQName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("OA_NSJGHYSQNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[院办负责人意见][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_YBFZRYJ_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("YBFZRYJ", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织部门名称][默认规则]
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
     * 判断值规则[会议室][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_HYSNAME_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYSNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织人员名称][默认规则]
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
     * 判断值规则[会议室标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Hysid_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("HYSID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
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
    protected boolean onMergeChild(String strChildType, String strTypeParam, OA_NSJGHYSQ et) throws Exception {
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
    protected void onUpdateParent(OA_NSJGHYSQ et)throws Exception {
        super.onUpdateParent(et);
    }


}