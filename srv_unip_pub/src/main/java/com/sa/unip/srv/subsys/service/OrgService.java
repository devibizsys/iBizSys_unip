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



import com.sa.unip.srv.subsys.demodel.OrgDEModel;
import net.ibizsys.psrt.srv.common.dao.OrgDAO;
import net.ibizsys.psrt.srv.common.entity.Org;

/**
 * 组织机构 服务对象基类
 * 注意，此文件不能修改
 *
 */
@Component
public class OrgService extends net.ibizsys.psrt.srv.common.service.OrgService {

    public final static String DATASET_CURANDLOWERORG = "CurAndLowerOrg";
    public final static String DATASET_AHUX_ALL = "AHUX_All";
    public final static String DATASET_UX_PRO_PCY = "UX_PRO_PCY";
    public final static String DATASET_UX_ALL = "UX_All";
    public final static String DATASET_UX_ORGXJDW = "UX_ORGXJDW";
    public final static String DATASET_UX_CITYDW = "UX_CITYDW";
    public final static String DATASET_UX_ALLROOT = "UX_AllRoot";
    public final static String DATASET_UX_PRO = "UX_PRO";
    public final static String DATASET_UX_CITY = "UX_CITY";
    public final static String DATASET_UX_ALL_CDOELIST = "UX_All_CDOELIST";
    public final static String DATASET_UX_CXSYQZ = "UX_CXSYQZ";


    public OrgService () {
        super();

    }

    /**
     * 获取实体[Org]服务对象
     * @return
     * @throws Exception
     */
    public static OrgService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[Org]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static OrgService getInstance(SessionFactory sessionFactory) throws Exception {
        return (OrgService)ServiceGlobal.getService(OrgService.class, sessionFactory);
    }


    @PostConstruct
    public void postConstruct() throws Exception {
        super.postConstruct();
        ServiceGlobal.registerService("com.sa.unip.srv.subsys.service.OrgService", this);
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
        if(StringHelper.compare(strDataSetName,DATASET_CURANDLOWERORG,true)==0) {
            return this.fetchCurAndLowerOrg(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_AHUX_ALL,true)==0) {
            return this.fetchAHUX_All(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_PRO_PCY,true)==0) {
            return this.fetchUX_PRO_PCY(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_ALL,true)==0) {
            return this.fetchUX_All(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_ORGXJDW,true)==0) {
            return this.fetchUX_ORGXJDW(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_CITYDW,true)==0) {
            return this.fetchUX_CITYDW(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_ALLROOT,true)==0) {
            return this.fetchUX_AllRoot(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_PRO,true)==0) {
            return this.fetchUX_PRO(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_CITY,true)==0) {
            return this.fetchUX_CITY(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_ALL_CDOELIST,true)==0) {
            return this.fetchUX_All_CDOELIST(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_UX_CXSYQZ,true)==0) {
            return this.fetchUX_CXSYQZ(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }



    /*
    * 获取数据集合[CurAndLowerOrg]
    */
    public DBFetchResult fetchCurAndLowerOrg(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_CURANDLOWERORG,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[AHUX_All]
    */
    public DBFetchResult fetchAHUX_All(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_AHUX_ALL,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }





    /*
    * 获取数据集合[UX_PRO_PCY]
    */
    public DBFetchResult fetchUX_PRO_PCY(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_PRO_PCY,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_All]
    */
    public DBFetchResult fetchUX_All(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_ALL,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_ORGXJDW]
    */
    public DBFetchResult fetchUX_ORGXJDW(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_ORGXJDW,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_CITYDW]
    */
    public DBFetchResult fetchUX_CITYDW(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_CITYDW,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_AllRoot]
    */
    public DBFetchResult fetchUX_AllRoot(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_ALLROOT,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_PRO]
    */
    public DBFetchResult fetchUX_PRO(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_PRO,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_CITY]
    */
    public DBFetchResult fetchUX_CITY(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_CITY,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }









    /*
    * 获取数据集合[UX_All_CDOELIST]
    */
    public DBFetchResult fetchUX_All_CDOELIST(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_ALL_CDOELIST,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[UX_CXSYQZ]
    */
    public DBFetchResult fetchUX_CXSYQZ(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_UX_CXSYQZ,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }







}