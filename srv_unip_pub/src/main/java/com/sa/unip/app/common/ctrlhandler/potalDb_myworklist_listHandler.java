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

import com.sa.unip.app.srv.wf.ctrlmodel.WFWorkListMyWorkListListModel;
import com.sa.unip.srv.subsys.demodel.WFWorkListDEModel;
import com.sa.unip.srv.subsys.service.WFWorkListService;
import net.ibizsys.psrt.srv.wf.dao.WFWorkListDAO;
import net.ibizsys.psrt.srv.wf.entity.WFWorkList;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IListModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 列表控件后台处理基类
 */
public class potalDb_myworklist_listHandler extends net.ibizsys.paas.ctrlhandler.ListHandlerBase {

    protected WFWorkListMyWorkListListModel listModel = null;
    public potalDb_myworklist_listHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        this.setMinorSortField("CREATEDATE");
        this.setMinorSortDir("DESC");
        listModel = (WFWorkListMyWorkListListModel)this.getViewController().getCtrlModel("db_myworklist_list");

        super.onInit();

    }

    @Override
    protected IListModel getListModel() {
        return this.getRealListModel();
    }

    protected WFWorkListMyWorkListListModel getRealListModel() {
        return this.listModel;
    }

    protected WFWorkListService getRealService() {
        return (WFWorkListService)this.getService();
    }

    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchMyWorkList(deDataSetFetchContext);
    }

}