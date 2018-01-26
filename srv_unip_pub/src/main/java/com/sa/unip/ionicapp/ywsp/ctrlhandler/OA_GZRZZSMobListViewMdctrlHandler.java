/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_GZRZMobMOBMDCTRLModel;
import com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel;
import com.sa.unip.srv.ywsp.service.OA_GZRZService;
import com.sa.unip.srv.ywsp.dao.OA_GZRZDAO;
import com.sa.unip.srv.ywsp.entity.OA_GZRZ;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IListModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 列表控件后台处理基类
 */
public class OA_GZRZZSMobListViewMdctrlHandler extends net.ibizsys.paas.ctrlhandler.ListHandlerBase {
    protected OA_GZRZMobMOBMDCTRLModel listModel = null;
    public OA_GZRZZSMobListViewMdctrlHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setMinorSortField("CREATEDATE");
        this.setMinorSortDir("DESC");
        listModel = (OA_GZRZMobMOBMDCTRLModel)this.getViewController().getCtrlModel("mdctrl");
        super.onInit();
    }

    @Override
    protected IListModel getListModel() {
        return this.getRealListModel();
    }

    protected OA_GZRZMobMOBMDCTRLModel getRealListModel() {
        return this.listModel;
    }

    protected OA_GZRZService getRealService() {
        return (OA_GZRZService)this.getService();
    }


    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchDefault(deDataSetFetchContext);
    }

    /**
    * 准备部件操作数据访问能力
     * @throws Exception
     */
    @Override
    protected void prepareDataAccessActions()throws Exception {
        super.prepareDataAccessActions();
        this.registerDataAccessAction("update","UPDATE");
        this.registerDataAccessAction("remove","DELETE");
        this.registerDataAccessAction("load","READ");
        this.registerDataAccessAction("create","CREATE");
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getEntity(java.lang.Object)
     */
    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_GZRZ entity = new OA_GZRZ();
        entity.set(OA_GZRZ.FIELD_OA_GZRZID,objKeyValue);
        this.getRealService().executeAction(OA_GZRZService.ACTION_GET,entity);
        return entity;
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#createEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_GZRZService.ACTION_CREATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#updateEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_GZRZService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#removeEntity(java.lang.Object)
     */
    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_GZRZ entity = new OA_GZRZ();
        entity.set(OA_GZRZ.FIELD_OA_GZRZID,objKeyValue);
        this.getRealService().executeAction(OA_GZRZService.ACTION_REMOVE,entity);
    }

}