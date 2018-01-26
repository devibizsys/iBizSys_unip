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

import net.ibizsys.paas.control.form.FormError;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.control.form.FormItemError;
import net.ibizsys.paas.ctrlmodel.EditFormItemModel;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.service.IService;

/**
 * 实体[机票预订]编辑表单[form]部件模型
 */
public class OA_JPYDMainEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public OA_JPYDMainEditFormModel()  {
        super();
        this.setName("form");
    }

    private com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel oA_JPYDDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel getOA_JPYDDEModel() {
        if(this.oA_JPYDDEModel==null) {
            try {
                this.oA_JPYDDEModel = (com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_JPYDDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_JPYDDEModel();
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
            formItem.setDEFName("OA_JPYDID");
            formItem.setCaption("机票预订标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_JPYDID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_JPYDID");
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
            formItem.setDEFName("OA_JPYDNAME");
            formItem.setCaption("机票预订名称");
            formItem.setCapLanResTag("DEF.LNAME.OA_JPYDNAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_JPYDNAME");
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
        // orguserid
        iFormItem = this.createFormItem("orguserid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orguserid");
            formItem.setDEFName("ORGUSERID");
            formItem.setCreateDVT("OPERATOR");
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
        // orgusername
        iFormItem = this.createFormItem("orgusername");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgusername");
            formItem.setDEFName("ORGUSERNAME");
            formItem.setCreateDVT("OPERATORNAME");
            formItem.setCaption("人员姓名");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgusername");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgsectorid
        iFormItem = this.createFormItem("orgsectorid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsectorid");
            formItem.setDEFName("ORGSECTORID");
            formItem.setCreateDVT("SESSION");
            formItem.setCreateDV("SRFORGSECTORID");
            formItem.setCaption("部门标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgsectorid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgsectorname
        iFormItem = this.createFormItem("orgsectorname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsectorname");
            formItem.setDEFName("ORGSECTORNAME");
            formItem.setCreateDVT("SESSION");
            formItem.setCreateDV("SRFORGSECTORNAME");
            formItem.setCaption("部门名称");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgsectorname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // mdd
        iFormItem = this.createFormItem("mdd");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("mdd");
            formItem.setDEFName("MDD");
            formItem.setCaption("目的地");
            formItem.setCapLanResTag("DEF.LNAME.MDD");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("mdd");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // zw
        iFormItem = this.createFormItem("zw");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("zw");
            formItem.setDEFName("ZW");
            formItem.setCaption("职务");
            formItem.setCapLanResTag("DEF.LNAME.ZW");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("zw");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // je
        iFormItem = this.createFormItem("je");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("je");
            formItem.setDEFName("JE");
            formItem.setCaption("金额");
            formItem.setCapLanResTag("DEF.LNAME.JE");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("je");
            dataItem.setDataType(7);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // sfzhm
        iFormItem = this.createFormItem("sfzhm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("sfzhm");
            formItem.setDEFName("SFZHM");
            formItem.setCaption("身份证号码");
            formItem.setCapLanResTag("DEF.LNAME.SFZHM");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("sfzhm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // jbrid
        iFormItem = this.createFormItem("jbrid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("jbrid");
            formItem.setDEFName("JBRID");
            formItem.setCaption("经办人");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("jbrid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // jbrname
        iFormItem = this.createFormItem("jbrname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("jbrname");
            formItem.setDEFName("JBRNAME");
            formItem.setCaption("经办人");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("jbrname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cfsj
        iFormItem = this.createFormItem("cfsj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cfsj");
            formItem.setDEFName("CFSJ");
            formItem.setCaption("出发时间");
            formItem.setCapLanResTag("DEF.LNAME.CFSJ");
            formItem.setAllowEmpty(false);
            formItem.setValueTranslator("DATE|YYYY-MM-DD HH:mm:ss");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cfsj");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // fcsj
        iFormItem = this.createFormItem("fcsj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("fcsj");
            formItem.setDEFName("FCSJ");
            formItem.setCaption("返程时间");
            formItem.setCapLanResTag("DEF.LNAME.FCSJ");
            formItem.setAllowEmpty(false);
            formItem.setValueTranslator("DATE|YYYY-MM-DD HH:mm:ss");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("fcsj");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // sqsy
        iFormItem = this.createFormItem("sqsy");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("sqsy");
            formItem.setDEFName("SQSY");
            formItem.setCaption("申请事由");
            formItem.setCapLanResTag("DEF.LNAME.SQSY");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("sqsy");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // fj
        iFormItem = this.createFormItem("fj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("fj");
            formItem.setDEFName("FJ");
            formItem.setCaption("附件");
            formItem.setCapLanResTag("DEF.LNAME.FJ");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("fj");
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
        // oa_jpydid
        iFormItem = this.createFormItem("oa_jpydid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("oa_jpydid");
            formItem.setDEFName("OA_JPYDID");
            formItem.setCaption("机票预订标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_JPYDID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("oa_jpydid");
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