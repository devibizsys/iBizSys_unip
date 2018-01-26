/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.codelist;


import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;

import net.ibizsys.paas.sysmodel.DynamicCodeListModelBase;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.srv.subsys.service.WFWorkListService;
import com.sa.unip.srv.subsys.demodel.WFWorkListDEModel;

@CodeList(id="4B8ABFD8-FBDF-43CB-BCD1-490E3D8D1192",name="我的待办工作类型",type="DYNAMIC",userscope=false,emptytext="未定义",ormode="STR",valueseparator=";",textseparator="、")

@CodeItems({
})



/**
 * 动态代码表[我的待办工作类型]模型类
 */
public class CL_MYWORKTYPECodeListModel extends net.ibizsys.paas.sysmodel.DynamicCodeListModelBase  {



    public CL_MYWORKTYPECodeListModel() {
        super();
        this.initAnnotation(CL_MYWORKTYPECodeListModel.class);
        this.setTextField("WFWORKFLOWNAME");
        this.setValueField("WFWORKFLOWID");
        this.setDSCondition("");
        CodeListGlobal.registerCodeList("com.sa.unip.srv.subsys.codelist.CL_MYWORKTYPECodeListModel", this);
    }

    private WFWorkListDEModel wFWorkListDEModel;

    /**
     * 获取实体[WFWORKLIST]模型对象
     */
    public  WFWorkListDEModel getWFWorkListDEModel() {
        if(this.wFWorkListDEModel==null) {
            try {
                this.wFWorkListDEModel = (WFWorkListDEModel)DEModelGlobal.getDEModel(WFWorkListDEModel.class);
            } catch(Exception ex) {
            }
        }
        return this.wFWorkListDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.sysmodel.DynamicCodeListModelBase#getDEModel()
     */
    @Override
    protected IDataEntityModel getDEModel() {
        return this.getWFWorkListDEModel();
    }

    private WFWorkListService wFWorkListService;

    /**
     * 获取实体[WFWORKLIST]实际服务对象
     */
    public  WFWorkListService getRealService() {
        if(this.wFWorkListService==null) {
            try {
                this.wFWorkListService = (WFWorkListService)ServiceGlobal.getService(WFWorkListService.class,this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.wFWorkListService;
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.sysmodel.DynamicCodeListModelBase#getService()
    */
    @Override
    protected IService getService() {
        return getRealService();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.sysmodel.DynamicCodeListModelBase#onPrepareCodeItems()
     */
    @Override
    protected void onPrepareCodeItems() throws Exception {
        DEDataSetFetchContext deDataSetFetchContextImpl = new DEDataSetFetchContext(null);
        deDataSetFetchContextImpl.setSort(this.getMinorSortField());
        deDataSetFetchContextImpl.setSortDir(this.getMinorSortDir());
        fillFetchConditions(deDataSetFetchContextImpl);
        DBFetchResult fetchResult = this.getRealService().fetchMyWorkType(deDataSetFetchContextImpl);
        fillFetchResult(fetchResult.getDataSet().getDataTable(0));
    }

}