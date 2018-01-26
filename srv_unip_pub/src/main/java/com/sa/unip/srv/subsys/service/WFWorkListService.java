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



import com.sa.unip.srv.subsys.demodel.WFWorkListDEModel;
import net.ibizsys.psrt.srv.wf.dao.WFWorkListDAO;
import net.ibizsys.psrt.srv.wf.entity.WFWorkList;

/**
 * 工作流工作列表 服务对象基类
 * 注意，此文件不能修改
 *
 */
@Component
public class WFWorkListService extends net.ibizsys.psrt.srv.wf.service.WFWorkListService {

    public final static String DATASET_MYWORKLIST2 = "MyWorkList2";
    public final static String DATASET_MYWORKTYPE = "MyWorkType";
    public final static String DATASET_MYWORKLIST = "MyWorkList";


    public WFWorkListService () {
        super();

    }

    /**
     * 获取实体[WFWorkList]服务对象
     * @return
     * @throws Exception
     */
    public static WFWorkListService getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[WFWorkList]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static WFWorkListService getInstance(SessionFactory sessionFactory) throws Exception {
        return (WFWorkListService)ServiceGlobal.getService(WFWorkListService.class, sessionFactory);
    }


    @PostConstruct
    public void postConstruct() throws Exception {
        super.postConstruct();
        ServiceGlobal.registerService("com.sa.unip.srv.subsys.service.WFWorkListService", this);
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
        if(StringHelper.compare(strDataSetName,DATASET_MYWORKLIST2,true)==0) {
            return this.fetchMyWorkList2(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_MYWORKTYPE,true)==0) {
            return this.fetchMyWorkType(iDEDataSetFetchContext);
        }
        if(StringHelper.compare(strDataSetName,DATASET_MYWORKLIST,true)==0) {
            return this.fetchMyWorkList(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }



    /*
    * 获取数据集合[MyWorkList2]
    */
    public DBFetchResult fetchMyWorkList2(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_MYWORKLIST2,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[MyWorkType]
    */
    public DBFetchResult fetchMyWorkType(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_MYWORKTYPE,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }



    /*
    * 获取数据集合[MyWorkList]
    */
    public DBFetchResult fetchMyWorkList(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_MYWORKLIST,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }







}