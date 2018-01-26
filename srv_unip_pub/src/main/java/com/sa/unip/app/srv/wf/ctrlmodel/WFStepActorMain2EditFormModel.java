/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.wf.ctrlmodel;


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

import net.ibizsys.paas.control.form.FormError;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.control.form.FormItemError;
import net.ibizsys.paas.ctrlmodel.EditFormItemModel;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.service.IService;

/**
 * 实体[工作流步骤操作者]编辑表单[form]部件模型
 */
public class WFStepActorMain2EditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public WFStepActorMain2EditFormModel()  {
        super();
        this.setName("form");
    }

    private net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel wFStepActorDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel getWFStepActorDEModel() {
        if(this.wFStepActorDEModel==null) {
            try {
                this.wFStepActorDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFStepActorDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFStepActorDEModel();
    }

    /**
     * 准备表单项模型
     * @throws Exception
     */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;
        // srfupdatedate
        iFormItem = this.createFormItem("srfupdatedate");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfupdatedate");
            formItem.setDEFName("UPDATEDATE");
            formItem.setCaption("更新时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfupdatedate");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("UPDATEDATE");
            dataItemParam0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srforikey
        iFormItem = this.createFormItem("srforikey");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srforikey");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srforikey");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfkey
        iFormItem = this.createFormItem("srfkey");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfkey");
            formItem.setDEFName("WFSTEPACTORID");
            formItem.setCaption("工作流步骤操作者标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPACTORID");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfmajortext
        iFormItem = this.createFormItem("srfmajortext");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfmajortext");
            formItem.setDEFName("WFSTEPACTORNAME");
            formItem.setCaption("工作流步骤操作者名称");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPACTORNAME");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srftempmode
        iFormItem = this.createFormItem("srftempmode");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srftempmode");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srftempmode");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfuf
        iFormItem = this.createFormItem("srfuf");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfuf");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfuf");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfdeid
        iFormItem = this.createFormItem("srfdeid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfdeid");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfdeid");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfsourcekey
        iFormItem = this.createFormItem("srfsourcekey");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfsourcekey");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfsourcekey");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // wfstepactorname
        iFormItem = this.createFormItem("wfstepactorname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("wfstepactorname");
            formItem.setDEFName("WFSTEPACTORNAME");
            formItem.setCaption("操作者");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("wfstepactorname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // firstreadtime
        iFormItem = this.createFormItem("firstreadtime");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("firstreadtime");
            formItem.setDEFName("FIRSTREADTIME");
            formItem.setIgnoreInput(3);
            formItem.setCaption("查看时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("firstreadtime");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // isfinish1
        iFormItem = this.createFormItem("isfinish1");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("isfinish1");
            formItem.setDEFName("ISFINISH");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.YesNoCodeListModel");
            formItem.setCaption("是否完成");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("isfinish1");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.YesNoCodeListModel");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ISFINISH");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // isfinish
        iFormItem = this.createFormItem("isfinish");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("isfinish");
            formItem.setDEFName("ISFINISH");
            formItem.setEnableCond(0);
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.YesNoCodeListModel");
            formItem.setCaption("是否完成");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("isfinish");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // finishdate
        iFormItem = this.createFormItem("finishdate");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("finishdate");
            formItem.setDEFName("FINISHDATE");
            formItem.setIgnoreInput(3);
            formItem.setCaption("完成时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("finishdate");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // remindercount
        iFormItem = this.createFormItem("remindercount");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("remindercount");
            formItem.setDEFName("REMINDERCOUNT");
            formItem.setIgnoreInput(3);
            formItem.setCaption("督促次数");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("remindercount");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // remindmemo
        iFormItem = this.createFormItem("remindmemo");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("remindmemo");
            formItem.setDEFName("");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("remindmemo");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // wfstepactorid
        iFormItem = this.createFormItem("wfstepactorid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("wfstepactorid");
            formItem.setDEFName("WFSTEPACTORID");
            formItem.setCaption("工作流步骤操作者标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("wfstepactorid");
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
    @Override
    protected void onTestValueRule(IService iService, IDataObject iDataObject, boolean bUpdate,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        super.onTestValueRule( iService,  iDataObject,  bUpdate, entityError) ;
    }

    @Override
    protected Boolean onTestFormItemEnabled(IFormItem iFormItem, IDataObject iDataObject, boolean bUpdate) throws Exception {
        return super.onTestFormItemEnabled(iFormItem, iDataObject, bUpdate);
    }

}