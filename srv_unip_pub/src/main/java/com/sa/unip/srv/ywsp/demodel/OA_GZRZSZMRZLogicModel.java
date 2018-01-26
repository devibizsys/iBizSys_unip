/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import java.util.List;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.IActionContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.IDataRow;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.db.SqlParamList;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.pswf.core.IWFService;
import net.ibizsys.pswf.core.WFActionParam;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_GZRZ;
import com.sa.unip.srv.ywsp.service.OA_GZRZService;

/**
 * 实体[OA_GZRZ]逻辑处理[设置默认值]模型对象
 */
public class OA_GZRZSZMRZLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_GZRZ> {

    private static final Log log = LogFactory.getLog(OA_GZRZSZMRZLogicModel.class);

    public OA_GZRZSZMRZLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("75E822B6-E0B4-424D-B616-2D9F1CB5B389");
        this.setName("SZMRZ");
        //设置默认参数名称
        this.setDefaultParamName("Default");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DELogicModelBase#onExecute(net.ibizsys.paas.core.IActionContext)
     */
    @Override
    protected void onExecute(IActionContext iActionContext) throws Exception {
        executeBegin(iActionContext);
    }

    /**
    * 执行逻辑处理[设置默认值（月报）]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam3(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_GZRZ _default = (com.sa.unip.srv.ywsp.entity.OA_GZRZ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //直接值[本月工作成效] ==> Default[XSBT]
        _default.set("XSBT","本月工作成效");
        //Default[BYGZCX] ==> Default[JRGZCX]
        _default.set("JRGZCX",_default.get("BYGZCX"));

        if(true) {
            executeRawsqlcall1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_GZRZ _default = (com.sa.unip.srv.ywsp.entity.OA_GZRZ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(testCond(_default.get("RZLX"),"EQ","30")) {
            executePrepareparam3(iActionContext);
        }
        if(testCond(_default.get("RZLX"),"EQ","20")) {
            executePrepareparam2(iActionContext);
        }
        if(testCond(_default.get("RZLX"),"EQ","10")) {
            executePrepareparam1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[设置默认值（日报）]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_GZRZ _default = (com.sa.unip.srv.ywsp.entity.OA_GZRZ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //直接值[今日工作成效] ==> Default[XSBT]
        _default.set("XSBT","今日工作成效");

        if(true) {
            executeRawsqlcall1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[设置默认值（周报）]
    * @Param iActionContext 处理上下文参数
    */
    protected void executePrepareparam2(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_GZRZ _default = (com.sa.unip.srv.ywsp.entity.OA_GZRZ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        //直接值[本周工作成效] ==> Default[XSBT]
        _default.set("XSBT","本周工作成效");
        //Default[BZGZCX] ==> Default[JRGZCX]
        _default.set("JRGZCX",_default.get("BZGZCX"));

        if(true) {
            executeRawsqlcall1(iActionContext);
        }
    }
    /**
    * 执行逻辑处理[设置标题默认值]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeRawsqlcall1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_GZRZ _default = (com.sa.unip.srv.ywsp.entity.OA_GZRZ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        String strSQL = "select concat(?,'的',(case when ?=10 then '日报' when ?=20 then '周报' when ?=30 then '月报' end)) oa_gzrzname  from dual";
//准备参数
        SqlParamList sqlParamList = new SqlParamList();

        //Default[ORGUSERNAME]
        sqlParamList.addObject(_default.get("ORGUSERNAME"));
        //Default[RZLX]
        sqlParamList.addObject(_default.get("RZLX"));
        //Default[RZLX]
        sqlParamList.addObject(_default.get("RZLX"));
        //Default[RZLX]
        sqlParamList.addObject(_default.get("RZLX"));

        DBCallResult dbFetchResult= getDAO(iActionContext).executeRawSql(null, strSQL , sqlParamList);
        if (dbFetchResult.getDataSet() == null || (dbFetchResult.getDataSet().getDataTableCount() == 0)) {
            throw new ErrorException(Errors.INVALIDDATA);
        }

        dbFetchResult.getDataSet().cacheDataRow();
        IDataTable iDataTable = dbFetchResult.getDataSet().getDataTable(0);
        if (iDataTable.getCachedRowCount() == 0) {
            throw new ErrorException(Errors.INVALIDDATA);
        }
        //填充对象
        IDataRow iDataRow = iDataTable.getCachedRow(0);
        DataObject.fromDataRow(_default, iDataRow,false);

    }

}