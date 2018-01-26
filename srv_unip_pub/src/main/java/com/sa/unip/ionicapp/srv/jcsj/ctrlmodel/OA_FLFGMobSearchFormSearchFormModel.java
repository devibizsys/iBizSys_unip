/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.jcsj.ctrlmodel;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.datamodel.DataItemModel;
import net.ibizsys.paas.datamodel.DataItemParamModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;

import net.ibizsys.paas.ctrlmodel.SearchFormItemModel;
import net.ibizsys.paas.control.form.FormError;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.control.form.FormItemError;

/**
 * 实体[法律法规]搜索表单[searchform]部件模型
 */
public class  OA_FLFGMobSearchFormSearchFormModel extends net.ibizsys.paas.ctrlmodel.SearchFormModelBase {

    public OA_FLFGMobSearchFormSearchFormModel() {
        super();
        this.setName("searchform");
    }


    private com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel oA_FLFGDEModel;
    protected  com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel getOA_FLFGDEModel() {
        if(this.oA_FLFGDEModel==null) {
            try {
                this.oA_FLFGDEModel = (com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_FLFGDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_FLFGDEModel();
    }


    /**
      * 准备表单项模型
      * @throws Exception
      */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;
        // n_oa_flfgname_like
        iFormItem = this.createFormItem("n_oa_flfgname_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_oa_flfgname_like");
            formItem.setDEFName("OA_FLFGNAME");
            formItem.setCaption("标题(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_oa_flfgname_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // n_createdate_gtandeq
        iFormItem = this.createFormItem("n_createdate_gtandeq");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_createdate_gtandeq");
            formItem.setDEFName("CREATEDATE");
            formItem.setCaption("建立时间(>=)");
            formItem.setValueTranslator("DATE|YYYY-MM-DD HH:mm:ss");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_createdate_gtandeq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // n_createdate_ltandeq
        iFormItem = this.createFormItem("n_createdate_ltandeq");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_createdate_ltandeq");
            formItem.setDEFName("CREATEDATE");
            formItem.setCaption("建立时间(<=)");
            formItem.setValueTranslator("DATE|YYYY-MM-DD HH:mm:ss");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_createdate_ltandeq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);

    }

    /**
    * 填充表单值
    * @param iDataObject
    * @param bUpdate
    * @param bIgnoreEmpty
    * @param formError
    * @throws Exception
    */
    @Override
    protected void onFillInputValues(IDataObject iDataObject,boolean bUpdate,boolean bIgnoreEmpty,FormError formError)throws Exception {
        super.onFillInputValues(iDataObject,bUpdate,bIgnoreEmpty,formError);
        if(formError.hasError())
            return;


    }

}