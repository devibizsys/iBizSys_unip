/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.ywsp.ctrlmodel;


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
 * 实体[项目进度]搜索表单[searchform]部件模型
 */
public class  OA_XMJDDefaultSearchFormModel extends net.ibizsys.paas.ctrlmodel.SearchFormModelBase {

    public OA_XMJDDefaultSearchFormModel() {
        super();
        this.setName("searchform");
    }


    private com.sa.unip.srv.ywsp.demodel.OA_XMJDDEModel oA_XMJDDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_XMJDDEModel getOA_XMJDDEModel() {
        if(this.oA_XMJDDEModel==null) {
            try {
                this.oA_XMJDDEModel = (com.sa.unip.srv.ywsp.demodel.OA_XMJDDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_XMJDDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_XMJDDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_XMJDDEModel();
    }


    /**
      * 准备表单项模型
      * @throws Exception
      */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;
        // n_oa_xmjdname_like
        iFormItem = this.createFormItem("n_oa_xmjdname_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_oa_xmjdname_like");
            formItem.setDEFName("OA_XMJDNAME");
            formItem.setCaption("项目进度名称(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_oa_xmjdname_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // n_xmmc_like
        iFormItem = this.createFormItem("n_xmmc_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_xmmc_like");
            formItem.setDEFName("XMMC");
            formItem.setCaption("项目名称(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_xmmc_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
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