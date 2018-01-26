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
 * 实体[内设机构会议申请]编辑表单[form]部件模型
 */
public class OA_NSJGHYSQMobWFFromEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public OA_NSJGHYSQMobWFFromEditFormModel()  {
        super();
        this.setName("form");
    }

    private com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel oA_NSJGHYSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel getOA_NSJGHYSQDEModel() {
        if(this.oA_NSJGHYSQDEModel==null) {
            try {
                this.oA_NSJGHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_NSJGHYSQDEModel();
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
            formItem.setDEFName("OA_NSJGHYSQID");
            formItem.setCaption("内设机构会议申请标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_NSJGHYSQID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_NSJGHYSQID");
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
            formItem.setDEFName("OA_NSJGHYSQNAME");
            formItem.setCaption("内设机构会议申请名称");
            formItem.setCapLanResTag("DEF.LNAME.OA_NSJGHYSQNAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_NSJGHYSQNAME");
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
            formItem.setCaption("组织人员名称");

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
        // srfobj2
        iFormItem = this.createFormItem("srfobj2");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfobj2");
            formItem.setDEFName("NSJGHYSQZT");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.CL_NSJGHYSQZTCodeListModel");
            formItem.setCaption("内设机构会议申请状态");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfobj2");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.CL_NSJGHYSQZTCodeListModel");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("NSJGHYSQZT");
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
            formItem.setDEFName("NSJGHYSQBZ");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel");
            formItem.setCaption("内设机构会议申请步骤");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfobj");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("NSJGHYSQBZ");
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
            formItem.setDEFName("NSJGSFSHTG");
            formItem.setCodeListId("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
            formItem.setCaption("内设机构会议申请是否审核通过");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfobj3");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("NSJGSFSHTG");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // oa_nsjghysqid
        iFormItem = this.createFormItem("oa_nsjghysqid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("oa_nsjghysqid");
            formItem.setDEFName("OA_NSJGHYSQID");
            formItem.setCaption("内设机构会议申请标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_NSJGHYSQID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("oa_nsjghysqid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // oa_nsjghysqname
        iFormItem = this.createFormItem("oa_nsjghysqname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("oa_nsjghysqname");
            formItem.setDEFName("OA_NSJGHYSQNAME");
            formItem.setCaption("会议名称");
            formItem.setCapLanResTag("DEF.LNAME.OA_NSJGHYSQNAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("oa_nsjghysqname");
            dataItem.setDataType(25);
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
            formItem.setCaption("组织人员标识");

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
        // orgsectorid
        iFormItem = this.createFormItem("orgsectorid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsectorid");
            formItem.setDEFName("ORGSECTORID");
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
            formItem.setCaption("组织部门名称");

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
        // hysj
        iFormItem = this.createFormItem("hysj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("hysj");
            formItem.setDEFName("HYSJ");
            formItem.setCaption("会议时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("hysj");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // hysname
        iFormItem = this.createFormItem("hysname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("hysname");
            formItem.setDEFName("HYSNAME");
            formItem.setCaption("会议室");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("hysname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // hyyq
        iFormItem = this.createFormItem("hyyq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("hyyq");
            formItem.setDEFName("HYYQ");
            formItem.setCaption("会议要求");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("hyyq");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // chld
        iFormItem = this.createFormItem("chld");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("chld");
            formItem.setDEFName("CHLD");
            formItem.setCaption("参会领导");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("chld");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cbcsfzryj
        iFormItem = this.createFormItem("cbcsfzryj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cbcsfzryj");
            formItem.setDEFName("CBCSFZRYJ");
            formItem.setCaption("承办处室负责人意见");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cbcsfzryj");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // mscyj
        iFormItem = this.createFormItem("mscyj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("mscyj");
            formItem.setDEFName("MSCYJ");
            formItem.setCaption("秘书处意见");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("mscyj");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ybfzryj
        iFormItem = this.createFormItem("ybfzryj");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ybfzryj");
            formItem.setDEFName("YBFZRYJ");
            formItem.setCaption("院办负责人意见");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ybfzryj");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // bz
        iFormItem = this.createFormItem("bz");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("bz");
            formItem.setDEFName("BZ");
            formItem.setCaption("备注");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("bz");
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