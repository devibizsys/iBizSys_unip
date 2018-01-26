/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.service;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.ibizsys.paas.exception.ErrorException;
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
import org.springframework.stereotype.Component;
import net.ibizsys.paas.service.ServiceGlobal;



import com.sa.unip.srv.subsys.demodel.OrgUserDEModel;
import net.ibizsys.psrt.srv.common.dao.OrgUserDAO;
import net.ibizsys.psrt.srv.common.entity.OrgUser;

/**
 * 组织人员 服务对象基类
 * 注意，此文件不能修改
 *
 */
@Component
public class OrgUserService extends net.ibizsys.psrt.srv.common.service.OrgUserService {

    public final static String DATASET_UX_ORGXJRY = "UX_ORGXJRY";
    public final static String DATASET_QLCBRXZGL = "QLCBRXZGL";
    public final static String DATASET_PCFZRXZGL = "PCFZRXZGL";
    public final static String DATASET_UX_ORGUSERSPEC = "UX_ORGUSERSPEC";
    public final static String DATASET_DQCBR = "DQCBR";
    public final static String DATASET_ORGSECTORUSER = "ORGSECTORUSER";


    public OrgUserService () {
        super();

    }

    /**
     * 获取实体[OrgUser]服务对象
     * @return
     * @throws Exception
     */
    public static OrgUserService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[OrgUser]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OrgUserService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OrgUserService)ServiceGlobal.getService(OrgUserService.class, sessionFactory);
    }


    @PostConstruct
    public void postConstruct() throws Exception {
        super.postConstruct();
        ServiceGlobal.registerService("com.sa.unip.srv.subsys.service.OrgUserService", this);
    }



    /**
     * 获取数据集合
     * @param strDataSetName
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_UX_ORGXJRY,true)==0) {
            return this.fetchUX_ORGXJRY(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_QLCBRXZGL,true)==0) {
            return this.fetchQLCBRXZGL(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_PCFZRXZGL,true)==0) {
            return this.fetchPCFZRXZGL(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_ORGUSERSPEC,true)==0) {
            return this.fetchUX_ORGUSERSPEC(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_DQCBR,true)==0) {
            return this.fetchDQCBR(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_ORGSECTORUSER,true)==0) {
            return this.fetchOrgSectorUser(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }







    /*
    * 获取数据集合[UX_ORGXJRY]
    */
    public DBFetchResult fetchUX_ORGXJRY(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_ORGXJRY,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[QLCBRXZGL]
    */
    public DBFetchResult fetchQLCBRXZGL(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_QLCBRXZGL,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }





    /*
    * 获取数据集合[PCFZRXZGL]
    */
    public DBFetchResult fetchPCFZRXZGL(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_PCFZRXZGL,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }





    /*
    * 获取数据集合[UX_ORGUSERSPEC]
    */
    public DBFetchResult fetchUX_ORGUSERSPEC(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_ORGUSERSPEC,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[DQCBR]
    */
    public DBFetchResult fetchDQCBR(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_DQCBR,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }





    /*
    * 获取数据集合[OrgSectorUser]
    */
    public DBFetchResult fetchOrgSectorUser(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_ORGSECTORUSER,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }





}