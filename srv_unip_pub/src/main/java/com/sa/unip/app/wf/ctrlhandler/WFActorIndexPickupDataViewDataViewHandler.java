/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.wf.ctrlmodel.WFActorIndexTypeDataViewModel;
import net.ibizsys.psrt.srv.wf.demodel.WFActorDEModel;
import net.ibizsys.psrt.srv.wf.service.WFActorService;
import net.ibizsys.psrt.srv.wf.dao.WFActorDAO;
import net.ibizsys.psrt.srv.wf.entity.WFActor;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IDataViewModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
/**
 * 应用视图[工作流操作者实体索引关系选择数据视图（dataview）]数据看板dataview部件后台处理对象基类
 */
public class WFActorIndexPickupDataViewDataViewHandler extends net.ibizsys.paas.ctrlhandler.DataViewHandlerBase {
    protected WFActorIndexTypeDataViewModel dataViewModel = null;
    public WFActorIndexPickupDataViewDataViewHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        dataViewModel = (WFActorIndexTypeDataViewModel)this.getViewController().getCtrlModel("dataview");
        super.onInit();
    }

    @Override
    protected IDataViewModel getDataViewModel() {
        return this.getRealDataViewModel();
    }

    protected WFActorIndexTypeDataViewModel getRealDataViewModel() {
        return this.dataViewModel;
    }

    protected WFActorService getRealService() {
        return (WFActorService)this.getService();
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

    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchIndexDER(deDataSetFetchContext);
    }




}