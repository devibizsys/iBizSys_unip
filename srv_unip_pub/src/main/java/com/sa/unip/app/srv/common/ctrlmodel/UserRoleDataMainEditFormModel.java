/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlmodel;


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
 * 实体[数据对象能力]编辑表单[form]部件模型
 */
public class UserRoleDataMainEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public UserRoleDataMainEditFormModel()  {
        super();
        this.setName("form");
    }

    private net.ibizsys.psrt.srv.common.demodel.UserRoleDataDEModel userRoleDataDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserRoleDataDEModel getUserRoleDataDEModel() {
        if(this.userRoleDataDEModel==null) {
            try {
                this.userRoleDataDEModel = (net.ibizsys.psrt.srv.common.demodel.UserRoleDataDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserRoleDataDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userRoleDataDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserRoleDataDEModel();
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
            formItem.setDEFName("USERROLEDATAID");
            formItem.setCaption("数据对象能力标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATAID");
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
            formItem.setDEFName("USERROLEDATANAME");
            formItem.setCaption("能力名称");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATANAME");
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
        // dename
        iFormItem = this.createFormItem("dename");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dename");
            formItem.setDEFName("DENAME");
            formItem.setEnableCond(1);
            formItem.setCaption("数据对象");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dename");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // userroledataname
        iFormItem = this.createFormItem("userroledataname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("userroledataname");
            formItem.setDEFName("USERROLEDATANAME");
            formItem.setCaption("能力名称");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("userroledataname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // isalldata
        iFormItem = this.createFormItem("isalldata");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("isalldata");
            formItem.setDEFName("ISALLDATA");
            formItem.setCodeListId("com.sa.unip.srv.codelist.YesNoCodeListModel");
            formItem.setCaption("全部数据");
            formItem.setAllowEmpty(false);
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("isalldata");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgdr
        iFormItem = this.createFormItem("orgdr");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgdr");
            formItem.setDEFName("ORGDR");
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.URDOrgDRCodeListModel");
            formItem.setCaption("机构数据类型");
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgdr");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstorgname
        iFormItem = this.createFormItem("dstorgname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstorgname");
            formItem.setDEFName("DSTORGNAME");
            formItem.setCaption("指定当前机构");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstorgname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // secdr
        iFormItem = this.createFormItem("secdr");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("secdr");
            formItem.setDEFName("SECDR");
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.URDSecDRCodeListModel");
            formItem.setCaption("部门数据类型");
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("secdr");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstorgsectorname
        iFormItem = this.createFormItem("dstorgsectorname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstorgsectorname");
            formItem.setDEFName("DSTORGSECTORNAME");
            formItem.setCaption("指定当前部门");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstorgsectorname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // bcdr
        iFormItem = this.createFormItem("bcdr");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("bcdr");
            formItem.setDEFName("BCDR");
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.URDBCDRCodeListModel");
            formItem.setCaption("条线数据类型");
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("bcdr");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstsecbc
        iFormItem = this.createFormItem("dstsecbc");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstsecbc");
            formItem.setDEFName("DSTSECBC");
            formItem.setCaption("指定部门业务类型");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstsecbc");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // userdr
        iFormItem = this.createFormItem("userdr");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("userdr");
            formItem.setDEFName("USERDR");
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.URDUserDRCodeListModel");
            formItem.setCaption("用户数据类型");
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("userdr");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // memo
        iFormItem = this.createFormItem("memo");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("memo");
            formItem.setDEFName("MEMO");
            formItem.setCaption("备注");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("memo");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // deid
        iFormItem = this.createFormItem("deid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("deid");
            formItem.setDEFName("DEID");
            formItem.setEnableCond(1);
            formItem.setCaption("数据实体");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("deid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // userroledataid
        iFormItem = this.createFormItem("userroledataid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("userroledataid");
            formItem.setDEFName("USERROLEDATAID");
            formItem.setCaption("数据对象能力标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("userroledataid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstorgsectorid
        iFormItem = this.createFormItem("dstorgsectorid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstorgsectorid");
            formItem.setDEFName("DSTORGSECTORID");
            formItem.setCaption("指定当前部门");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstorgsectorid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstorgid
        iFormItem = this.createFormItem("dstorgid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstorgid");
            formItem.setDEFName("DSTORGID");
            formItem.setCaption("指定当前机构");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstorgid");
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
        if(net.ibizsys.paas.util.StringHelper.compare(iFormItem.getName(),"dstsecbc",true) == 0) {
            Object _bcdr=iDataObject.get("bcdr");
            return (DataTypeHelper.testCond(_bcdr,"NOTEQ","1"));
        }

        return super.onTestFormItemEnabled(iFormItem, iDataObject, bUpdate);
    }

}