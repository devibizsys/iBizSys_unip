/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGTZGG_MHListModel;
import com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel;
import com.sa.unip.srv.xxtz.service.OA_TZGGService;
import com.sa.unip.srv.xxtz.dao.OA_TZGGDAO;
import com.sa.unip.srv.xxtz.entity.OA_TZGG;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IListModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 列表控件后台处理基类
 */
public class potalDb_tzgg_listHandler extends net.ibizsys.paas.ctrlhandler.ListHandlerBase {

    protected OA_TZGGTZGG_MHListModel listModel = null;
    public potalDb_tzgg_listHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setMinorSortField("CREATEDATE");
        this.setMinorSortDir("DESC");
        listModel = (OA_TZGGTZGG_MHListModel)this.getViewController().getCtrlModel("db_tzgg_list");

        super.onInit();

    }

    @Override
    protected IListModel getListModel() {
        return this.getRealListModel();
    }

    protected OA_TZGGTZGG_MHListModel getRealListModel() {
        return this.listModel;
    }

    protected OA_TZGGService getRealService() {
        return (OA_TZGGService)this.getService();
    }

    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchCurTzgg(deDataSetFetchContext);
    }

}