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
 * 实体[门户页面模型]编辑表单[form]部件模型
 */
public class PPModelUserMainEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public PPModelUserMainEditFormModel()  {
        super();
        this.setName("form");
    }

    private net.ibizsys.psrt.srv.common.demodel.PPModelDEModel pPModelDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.PPModelDEModel getPPModelDEModel() {
        if(this.pPModelDEModel==null) {
            try {
                this.pPModelDEModel = (net.ibizsys.psrt.srv.common.demodel.PPModelDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.PPModelDEModel");
            } catch(Exception ex) {
            }
        }
        return this.pPModelDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getPPModelDEModel();
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
            formItem.setDEFName("PPMODELID");
            formItem.setEnableCond(0);
            formItem.setCaption("用户频道页标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("PPMODELID");
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
            formItem.setDEFName("PORTALPAGENAME");
            formItem.setEnableCond(1);
            formItem.setCaption("频道页");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("PORTALPAGENAME");
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
        // portalpageid
        iFormItem = this.createFormItem("portalpageid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("portalpageid");
            formItem.setDEFName("PORTALPAGEID");
            formItem.setEnableCond(1);
            formItem.setCaption("门户页面");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("portalpageid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ppmodel
        iFormItem = this.createFormItem("ppmodel");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ppmodel");
            formItem.setDEFName("PPMODEL");
            formItem.setCodeListId("net.ibizsys.psrt.srv.codelist.PVLayoutModeCodeListModel");
            formItem.setCaption("页面布局");
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ppmodel");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l1pvpartname
        iFormItem = this.createFormItem("l1pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l1pvpartname");
            formItem.setDEFName("L1PVPARTNAME");
            formItem.setCaption("左侧部件1");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l1pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c1pvpartname
        iFormItem = this.createFormItem("c1pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c1pvpartname");
            formItem.setDEFName("C1PVPARTNAME");
            formItem.setCaption("中间部件1");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c1pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r1pvpartname
        iFormItem = this.createFormItem("r1pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r1pvpartname");
            formItem.setDEFName("R1PVPARTNAME");
            formItem.setCaption("右侧部件1");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r1pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l2pvpartname
        iFormItem = this.createFormItem("l2pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l2pvpartname");
            formItem.setDEFName("L2PVPARTNAME");
            formItem.setCaption("左侧部件2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l2pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c2pvpartname
        iFormItem = this.createFormItem("c2pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c2pvpartname");
            formItem.setDEFName("C2PVPARTNAME");
            formItem.setCaption("中间部件2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c2pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r2pvpartname
        iFormItem = this.createFormItem("r2pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r2pvpartname");
            formItem.setDEFName("R2PVPARTNAME");
            formItem.setCaption("右侧部件2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r2pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l3pvpartname
        iFormItem = this.createFormItem("l3pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l3pvpartname");
            formItem.setDEFName("L3PVPARTNAME");
            formItem.setCaption("左侧部件3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l3pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c3pvpartname
        iFormItem = this.createFormItem("c3pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c3pvpartname");
            formItem.setDEFName("C3PVPARTNAME");
            formItem.setCaption("中间部件3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c3pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r3pvpartname
        iFormItem = this.createFormItem("r3pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r3pvpartname");
            formItem.setDEFName("R3PVPARTNAME");
            formItem.setCaption("右侧部件3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r3pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l4pvpartname
        iFormItem = this.createFormItem("l4pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l4pvpartname");
            formItem.setDEFName("L4PVPARTNAME");
            formItem.setCaption("左侧部件4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l4pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c4pvpartname
        iFormItem = this.createFormItem("c4pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c4pvpartname");
            formItem.setDEFName("C4PVPARTNAME");
            formItem.setCaption("中间部件4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c4pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r4pvpartname
        iFormItem = this.createFormItem("r4pvpartname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r4pvpartname");
            formItem.setDEFName("R4PVPARTNAME");
            formItem.setCaption("右侧部件4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r4pvpartname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r1pvpartid
        iFormItem = this.createFormItem("r1pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r1pvpartid");
            formItem.setDEFName("R1PVPARTID");
            formItem.setCaption("右侧部件1");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r1pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l3pvpartid
        iFormItem = this.createFormItem("l3pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l3pvpartid");
            formItem.setDEFName("L3PVPARTID");
            formItem.setCaption("左侧部件3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l3pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r2pvpartid
        iFormItem = this.createFormItem("r2pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r2pvpartid");
            formItem.setDEFName("R2PVPARTID");
            formItem.setCaption("右侧部件2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r2pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c2pvpartid
        iFormItem = this.createFormItem("c2pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c2pvpartid");
            formItem.setDEFName("C2PVPARTID");
            formItem.setCaption("中间部件2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c2pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c4pvpartid
        iFormItem = this.createFormItem("c4pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c4pvpartid");
            formItem.setDEFName("C4PVPARTID");
            formItem.setCaption("中间部件4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c4pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r3pvpartid
        iFormItem = this.createFormItem("r3pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r3pvpartid");
            formItem.setDEFName("R3PVPARTID");
            formItem.setCaption("右侧部件3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r3pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c1pvpartid
        iFormItem = this.createFormItem("c1pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c1pvpartid");
            formItem.setDEFName("C1PVPARTID");
            formItem.setCaption("中间部件1");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c1pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l2pvpartid
        iFormItem = this.createFormItem("l2pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l2pvpartid");
            formItem.setDEFName("L2PVPARTID");
            formItem.setCaption("左侧部件2");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l2pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // c3pvpartid
        iFormItem = this.createFormItem("c3pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("c3pvpartid");
            formItem.setDEFName("C3PVPARTID");
            formItem.setCaption("中间部件3");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("c3pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ppmodelid
        iFormItem = this.createFormItem("ppmodelid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ppmodelid");
            formItem.setDEFName("PPMODELID");
            formItem.setEnableCond(0);
            formItem.setCaption("用户频道页标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ppmodelid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // r4pvpartid
        iFormItem = this.createFormItem("r4pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("r4pvpartid");
            formItem.setDEFName("R4PVPARTID");
            formItem.setCaption("右侧部件4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("r4pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l4pvpartid
        iFormItem = this.createFormItem("l4pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l4pvpartid");
            formItem.setDEFName("L4PVPARTID");
            formItem.setCaption("左侧部件4");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l4pvpartid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // l1pvpartid
        iFormItem = this.createFormItem("l1pvpartid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("l1pvpartid");
            formItem.setDEFName("L1PVPARTID");
            formItem.setCaption("左侧部件1");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("l1pvpartid");
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