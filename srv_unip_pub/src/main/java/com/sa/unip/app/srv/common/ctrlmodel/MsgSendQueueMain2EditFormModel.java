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
 * 实体[消息发送队列]编辑表单[form]部件模型
 */
public class MsgSendQueueMain2EditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public MsgSendQueueMain2EditFormModel()  {
        super();
        this.setName("form");
    }

    private net.ibizsys.psrt.srv.common.demodel.MsgSendQueueDEModel msgSendQueueDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.MsgSendQueueDEModel getMsgSendQueueDEModel() {
        if(this.msgSendQueueDEModel==null) {
            try {
                this.msgSendQueueDEModel = (net.ibizsys.psrt.srv.common.demodel.MsgSendQueueDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.MsgSendQueueDEModel");
            } catch(Exception ex) {
            }
        }
        return this.msgSendQueueDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getMsgSendQueueDEModel();
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
            formItem.setEnableCond(0);
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
            formItem.setDEFName("MSGSENDQUEUEID");
            formItem.setEnableCond(0);
            formItem.setCaption("消息发送队列标识");
            formItem.setCapLanResTag("DEF.LNAME.MSGSENDQUEUEID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("MSGSENDQUEUEID");
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
            formItem.setDEFName("MSGSENDQUEUENAME");
            formItem.setCaption("消息发送队列名称");
            formItem.setCapLanResTag("DEF.LNAME.MSGSENDQUEUENAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("MSGSENDQUEUENAME");
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
        // subject
        iFormItem = this.createFormItem("subject");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("subject");
            formItem.setDEFName("SUBJECT");
            formItem.setCaption("消息标题");
            formItem.setCapLanResTag("DEF.LNAME.SUBJECT");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("subject");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // msgtype
        iFormItem = this.createFormItem("msgtype");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("msgtype");
            formItem.setDEFName("MSGTYPE");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgTypeCodeListModel");
            formItem.setCaption("消息类型");
            formItem.setCapLanResTag("DEF.LNAME.MSGTYPE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("msgtype");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgTypeCodeListModel");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // contenttype
        iFormItem = this.createFormItem("contenttype");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("contenttype");
            formItem.setDEFName("CONTENTTYPE");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgContentTypeCodeListModel");
            formItem.setCaption("内容类型");
            formItem.setCapLanResTag("DEF.LNAME.CONTENTTYPE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("contenttype");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgContentTypeCodeListModel");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstusers
        iFormItem = this.createFormItem("dstusers");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstusers");
            formItem.setDEFName("DSTUSERS");
            formItem.setCaption("目标用户");
            formItem.setCapLanResTag("DEF.LNAME.DSTUSERS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstusers");
            dataItem.setDataType(21);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dstaddresses
        iFormItem = this.createFormItem("dstaddresses");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dstaddresses");
            formItem.setDEFName("DSTADDRESSES");
            formItem.setCaption("目标地址");
            formItem.setCapLanResTag("DEF.LNAME.DSTADDRESSES");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dstaddresses");
            dataItem.setDataType(21);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // content
        iFormItem = this.createFormItem("content");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("content");
            formItem.setDEFName("CONTENT");
            formItem.setCaption("消息内容");
            formItem.setCapLanResTag("DEF.LNAME.CONTENT");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("content");
            dataItem.setDataType(21);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // importanceflag
        iFormItem = this.createFormItem("importanceflag");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("importanceflag");
            formItem.setDEFName("IMPORTANCEFLAG");
            formItem.setIgnoreInput(3);
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgImportanceLevelCodeListModel");
            formItem.setCaption("重要程度");
            formItem.setCapLanResTag("DEF.LNAME.IMPORTANCEFLAG");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("importanceflag");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            dataItem.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgImportanceLevelCodeListModel");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // plansendtime
        iFormItem = this.createFormItem("plansendtime");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("plansendtime");
            formItem.setDEFName("PLANSENDTIME");
            formItem.setEnableCond(0);
            formItem.setCaption("计划发送时间");
            formItem.setCapLanResTag("DEF.LNAME.PLANSENDTIME");
            formItem.setValueTranslator("DATE|YYYY-MM-DD HH:mm:ss");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("plansendtime");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // sendtag
        iFormItem = this.createFormItem("sendtag");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("sendtag");
            formItem.setDEFName("SENDTAG");
            formItem.setCaption("发送者标识");
            formItem.setCapLanResTag("DEF.LNAME.SENDTAG");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("sendtag");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // processtime
        iFormItem = this.createFormItem("processtime");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("processtime");
            formItem.setDEFName("PROCESSTIME");
            formItem.setEnableCond(0);
            formItem.setCaption("处理时间");
            formItem.setCapLanResTag("DEF.LNAME.PROCESSTIME");
            formItem.setValueTranslator("DATE|YYYY-MM-DD HH:mm:ss");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("processtime");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // issend
        iFormItem = this.createFormItem("issend");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("issend");
            formItem.setDEFName("ISSEND");
            formItem.setEnableCond(0);
            formItem.setCodeListId("com.sa.unip.srv.codelist.CodeList50CodeListModel");
            formItem.setCaption("是否发送");
            formItem.setCapLanResTag("DEF.LNAME.ISSEND");
            formItem.setAllowEmpty(false);
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("issend");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // iserror
        iFormItem = this.createFormItem("iserror");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("iserror");
            formItem.setDEFName("ISERROR");
            formItem.setEnableCond(0);
            formItem.setCodeListId("com.sa.unip.srv.codelist.CodeList50CodeListModel");
            formItem.setCaption("处理错误");
            formItem.setCapLanResTag("DEF.LNAME.ISERROR");
            formItem.setAllowEmpty(false);
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("iserror");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // totaldstaddresses
        iFormItem = this.createFormItem("totaldstaddresses");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("totaldstaddresses");
            formItem.setDEFName("TOTALDSTADDRESSES");
            formItem.setCaption("全部地址");
            formItem.setCapLanResTag("DEF.LNAME.TOTALDSTADDRESSES");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("totaldstaddresses");
            dataItem.setDataType(21);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // fileat
        iFormItem = this.createFormItem("fileat");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("fileat");
            formItem.setDEFName("FILEAT");
            formItem.setCaption("文件附件");
            formItem.setCapLanResTag("DEF.LNAME.FILEAT");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("fileat");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // fileat2
        iFormItem = this.createFormItem("fileat2");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("fileat2");
            formItem.setDEFName("FILEAT2");
            formItem.setCaption("文件附件2");
            formItem.setCapLanResTag("DEF.LNAME.FILEAT2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("fileat2");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // fileat3
        iFormItem = this.createFormItem("fileat3");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("fileat3");
            formItem.setDEFName("FILEAT3");
            formItem.setCaption("文件附件3");
            formItem.setCapLanResTag("DEF.LNAME.FILEAT3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("fileat3");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // fileat4
        iFormItem = this.createFormItem("fileat4");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("fileat4");
            formItem.setDEFName("FILEAT4");
            formItem.setCaption("文件附件4");
            formItem.setCapLanResTag("DEF.LNAME.FILEAT4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("fileat4");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // errorinfo
        iFormItem = this.createFormItem("errorinfo");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("errorinfo");
            formItem.setDEFName("ERRORINFO");
            formItem.setCaption("错误信息");
            formItem.setCapLanResTag("DEF.LNAME.ERRORINFO");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("errorinfo");
            dataItem.setDataType(21);
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
            formItem.setEnableCond(0);
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
            formItem.setEnableCond(0);
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
            formItem.setEnableCond(0);
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
            formItem.setEnableCond(0);
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
        // msgsendqueueid
        iFormItem = this.createFormItem("msgsendqueueid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("msgsendqueueid");
            formItem.setDEFName("MSGSENDQUEUEID");
            formItem.setEnableCond(0);
            formItem.setCaption("消息发送队列标识");
            formItem.setCapLanResTag("DEF.LNAME.MSGSENDQUEUEID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("msgsendqueueid");
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