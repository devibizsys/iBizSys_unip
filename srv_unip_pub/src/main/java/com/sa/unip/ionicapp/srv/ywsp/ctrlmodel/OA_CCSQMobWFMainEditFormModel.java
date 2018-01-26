/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.ywsp.ctrlmodel;


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
 * 实体[出差申请]编辑表单[form]部件模型
 */
public class OA_CCSQMobWFMainEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public OA_CCSQMobWFMainEditFormModel()  {
        super();
        this.setName("form");
    }

    private com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel oA_CCSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel getOA_CCSQDEModel() {
        if(this.oA_CCSQDEModel==null) {
            try {
                this.oA_CCSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CCSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_CCSQDEModel();
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
            formItem.setCapLanResTag("DEF.LNAME.UPDATEDATE");

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
            formItem.setDEFName("OA_CCSQID");
            formItem.setCaption("出差申请标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_CCSQID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_CCSQID");
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
            formItem.setDEFName("OA_CCSQNAME");
            formItem.setCaption("出差申请名称");
            formItem.setCapLanResTag("DEF.LNAME.OA_CCSQNAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_CCSQNAME");
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
        // srfusername
        iFormItem = this.createFormItem("srfusername");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfusername");
            formItem.setDEFName("ORGUSERNAME");
            formItem.setCaption("申请人");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfusername");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORGUSERNAME");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfobj
        iFormItem = this.createFormItem("srfobj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfobj");
            formItem.setDEFName("CCSQBZ");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel");
            formItem.setCaption("出差申请步骤");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfobj");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("CCSQBZ");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfobj2
        iFormItem = this.createFormItem("srfobj2");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfobj2");
            formItem.setDEFName("CCSQZT");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel");
            formItem.setCaption("出差申请状态");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfobj2");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("CCSQZT");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfobj3
        iFormItem = this.createFormItem("srfobj3");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfobj3");
            formItem.setDEFName("CCSQSFSHTG");
            formItem.setCodeListId("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
            formItem.setCaption("出差申请是否审核通过");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfobj3");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("CCSQSFSHTG");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orguserid
        iFormItem = this.createFormItem("orguserid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orguserid");
            formItem.setDEFName("ORGUSERID");
            formItem.setCaption("人员标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orguserid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // oa_ccsqid
        iFormItem = this.createFormItem("oa_ccsqid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("oa_ccsqid");
            formItem.setDEFName("OA_CCSQID");
            formItem.setCaption("出差申请标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_CCSQID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("oa_ccsqid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ccdz
        iFormItem = this.createFormItem("ccdz");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ccdz");
            formItem.setDEFName("CCDZ");
            formItem.setCaption("出差地址");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ccdz");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // sc
        iFormItem = this.createFormItem("sc");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("sc");
            formItem.setDEFName("SC");
            formItem.setCaption("时长（天）");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("sc");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // kssj
        iFormItem = this.createFormItem("kssj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("kssj");
            formItem.setDEFName("KSSJ");
            formItem.setCaption("开始时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("kssj");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // jssj
        iFormItem = this.createFormItem("jssj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("jssj");
            formItem.setDEFName("JSSJ");
            formItem.setCaption("结束时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("jssj");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ccsy
        iFormItem = this.createFormItem("ccsy");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ccsy");
            formItem.setDEFName("CCSY");
            formItem.setCaption("出差事由");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ccsy");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // createman
        iFormItem = this.createFormItem("createman");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("createman");
            formItem.setDEFName("CREATEMAN");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            formItem.setCaption("建立人");
            formItem.setCapLanResTag("DEF.LNAME.CREATEMAN");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("createman");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // createdate
        iFormItem = this.createFormItem("createdate");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("createdate");
            formItem.setDEFName("CREATEDATE");
            formItem.setCaption("建立时间");
            formItem.setCapLanResTag("DEF.LNAME.CREATEDATE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("createdate");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // updateman
        iFormItem = this.createFormItem("updateman");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("updateman");
            formItem.setDEFName("UPDATEMAN");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            formItem.setCaption("更新人");
            formItem.setCapLanResTag("DEF.LNAME.UPDATEMAN");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("updateman");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // updatedate
        iFormItem = this.createFormItem("updatedate");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("updatedate");
            formItem.setDEFName("UPDATEDATE");
            formItem.setCaption("更新时间");
            formItem.setCapLanResTag("DEF.LNAME.UPDATEDATE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("updatedate");
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