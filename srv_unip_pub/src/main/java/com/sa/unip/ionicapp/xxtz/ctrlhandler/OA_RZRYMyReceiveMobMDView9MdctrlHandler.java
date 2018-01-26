/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.xxtz.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_RZRYMobMyReceiveMOBMDCTRLModel;
import com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel;
import com.sa.unip.srv.xxtz.service.OA_RZRYService;
import com.sa.unip.srv.xxtz.dao.OA_RZRYDAO;
import com.sa.unip.srv.xxtz.entity.OA_RZRY;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IListModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 列表控件后台处理基类
 */
public class OA_RZRYMyReceiveMobMDView9MdctrlHandler extends net.ibizsys.paas.ctrlhandler.ListHandlerBase {
    protected OA_RZRYMobMyReceiveMOBMDCTRLModel listModel = null;
    public OA_RZRYMyReceiveMobMDView9MdctrlHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        listModel = (OA_RZRYMobMyReceiveMOBMDCTRLModel)this.getViewController().getCtrlModel("mdctrl");
        super.onInit();
    }

    @Override
    protected IListModel getListModel() {
        return this.getRealListModel();
    }

    protected OA_RZRYMobMyReceiveMOBMDCTRLModel getRealListModel() {
        return this.listModel;
    }

    protected OA_RZRYService getRealService() {
        return (OA_RZRYService)this.getService();
    }


    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchMyReceive(deDataSetFetchContext);
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
        OA_RZRY entity = new OA_RZRY();
        entity.set(OA_RZRY.FIELD_OA_RZRYID,objKeyValue);
        this.getRealService().executeAction(OA_RZRYService.ACTION_GET,entity);
        return entity;
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#createEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_RZRYService.ACTION_CREATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#updateEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_RZRYService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#removeEntity(java.lang.Object)
     */
    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_RZRY entity = new OA_RZRY();
        entity.set(OA_RZRY.FIELD_OA_RZRYID,objKeyValue);
        this.getRealService().executeAction(OA_RZRYService.ACTION_REMOVE,entity);
    }

}