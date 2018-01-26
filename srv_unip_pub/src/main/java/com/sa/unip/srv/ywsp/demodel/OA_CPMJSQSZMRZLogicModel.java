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

import com.sa.unip.srv.ywsp.entity.OA_CPMJSQ;
import com.sa.unip.srv.ywsp.service.OA_CPMJSQService;

/**
 * 实体[OA_CPMJSQ]逻辑处理[设置默认值]模型对象
 */
public class OA_CPMJSQSZMRZLogicModel extends net.ibizsys.paas.demodel.DELogicModelBase<OA_CPMJSQ> {

    private static final Log log = LogFactory.getLog(OA_CPMJSQSZMRZLogicModel.class);

    public OA_CPMJSQSZMRZLogicModel() {
        super();
        //设置逻辑基本信息
        this.setId("48B4389D-3852-49C8-A147-CF730219C84D");
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
    * 执行逻辑处理[设置默认值]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeRawsqlcall1(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_CPMJSQ _default = (com.sa.unip.srv.ywsp.entity.OA_CPMJSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();

        String strSQL = "select concat( ?,'的车牌门禁申请') oa_cpmjsqname from dual";
//准备参数
        SqlParamList sqlParamList = new SqlParamList();

        //Default[ORGUSERNAME]
        sqlParamList.addObject(_default.get("ORGUSERNAME"));

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
    /**
    * 执行逻辑处理[开始]
    * @Param iActionContext 处理上下文参数
    */
    protected void executeBegin(IActionContext iActionContext) throws Exception {
        com.sa.unip.srv.ywsp.entity.OA_CPMJSQ _default = (com.sa.unip.srv.ywsp.entity.OA_CPMJSQ)iActionContext.getParam("Default");
        SessionFactory sessionFactory = iActionContext.getSessionFactory();


        if(true) {
            executeRawsqlcall1(iActionContext);
        }
    }

}