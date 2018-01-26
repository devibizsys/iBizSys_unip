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

import com.sa.unip.app.srv.common.ctrlmodel.OrgtreeexpbarTreeExpBarModel;
import com.sa.unip.srv.subsys.demodel.OrgDEModel;
import com.sa.unip.srv.subsys.service.OrgService;
import net.ibizsys.psrt.srv.common.dao.OrgDAO;
import net.ibizsys.psrt.srv.common.entity.Org;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.ITreeModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.ITreeExpBarModel;
import net.ibizsys.paas.ctrlhandler.ITreeHandler;
import net.ibizsys.paas.ctrlmodel.ITreeModel;

/**
 * 树导航视图控件后台处理基类
 */
public class OrgUX_UserMgrViewTreeExpBarHandler extends net.ibizsys.paas.ctrlhandler.TreeExpBarHandlerBase {


    protected OrgtreeexpbarTreeExpBarModel treeExpBarModel = null;
    public OrgUX_UserMgrViewTreeExpBarHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        treeExpBarModel  = (OrgtreeexpbarTreeExpBarModel)this.getViewController().getCtrlModel("treeexpbar");
        super.onInit();
    }

    @Override
    protected ITreeExpBarModel getTreeExpBarModel() {
        return this.getRealTreeExpBarModel();
    }

    protected OrgtreeexpbarTreeExpBarModel getRealTreeExpBarModel() {
        return this.treeExpBarModel;
    }


    @Override
    protected ITreeHandler getTreeHandler() throws Exception {
        return (ITreeHandler )this.getViewController().getCtrlHandler("treeexpbar_tree");
    }

    @Override
    protected ITreeModel getTreeModel() throws Exception {
        return (ITreeModel)this.getViewController().getCtrlModel("treeexpbar_tree");
    }


}