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
 * 实体[项目进度]编辑表单[form]部件模型
 */
public class OA_XMJDMainEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public OA_XMJDMainEditFormModel()  {
        super();
        this.setName("form");
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
            formItem.setDEFName("OA_XMJDID");
            formItem.setCaption("项目进度标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_XMJDID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_XMJDID");
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
            formItem.setDEFName("OA_XMJDNAME");
            formItem.setCaption("项目进度名称");
            formItem.setCapLanResTag("DEF.LNAME.OA_XMJDNAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_XMJDNAME");
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
        // oa_xmjdname
        iFormItem = this.createFormItem("oa_xmjdname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("oa_xmjdname");
            formItem.setDEFName("OA_XMJDNAME");
            formItem.setCaption("项目进度名称");
            formItem.setCapLanResTag("DEF.LNAME.OA_XMJDNAME");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("oa_xmjdname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // xmbh
        iFormItem = this.createFormItem("xmbh");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("xmbh");
            formItem.setDEFName("XMBH");
            formItem.setCaption("项目编号");
            formItem.setCapLanResTag("DEF.LNAME.XMBH");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("xmbh");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // sdxmbhrq
        iFormItem = this.createFormItem("sdxmbhrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("sdxmbhrq");
            formItem.setDEFName("SDXMBHRQ");
            formItem.setCaption("收到项目编号日期");
            formItem.setCapLanResTag("DEF.LNAME.SDXMBHRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("sdxmbhrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ysje
        iFormItem = this.createFormItem("ysje");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ysje");
            formItem.setDEFName("YSJE");
            formItem.setCaption("预算金额");
            formItem.setCapLanResTag("DEF.LNAME.YSJE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ysje");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ksxczsbrq
        iFormItem = this.createFormItem("ksxczsbrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ksxczsbrq");
            formItem.setDEFName("KSXCZSBRQ");
            formItem.setCaption("开始向财政申报期日期");
            formItem.setCapLanResTag("DEF.LNAME.KSXCZSBRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ksxczsbrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // zbwjqrrq
        iFormItem = this.createFormItem("zbwjqrrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("zbwjqrrq");
            formItem.setDEFName("ZBWJQRRQ");
            formItem.setCaption("招标文件确认日期");
            formItem.setCapLanResTag("DEF.LNAME.ZBWJQRRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("zbwjqrrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cgfs
        iFormItem = this.createFormItem("cgfs");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cgfs");
            formItem.setDEFName("CGFS");
            formItem.setCaption("采购方式");
            formItem.setCapLanResTag("DEF.LNAME.CGFS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cgfs");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // psrq
        iFormItem = this.createFormItem("psrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("psrq");
            formItem.setDEFName("PSRQ");
            formItem.setCaption("评审日期");
            formItem.setCapLanResTag("DEF.LNAME.PSRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("psrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // psdb
        iFormItem = this.createFormItem("psdb");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("psdb");
            formItem.setDEFName("PSDB");
            formItem.setCaption("评审代表");
            formItem.setCapLanResTag("DEF.LNAME.PSDB");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("psdb");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dljgpsbgbh
        iFormItem = this.createFormItem("dljgpsbgbh");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dljgpsbgbh");
            formItem.setDEFName("DLJGPSBGBH");
            formItem.setCaption("代理机构评审报告编号");
            formItem.setCapLanResTag("DEF.LNAME.DLJGPSBGBH");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dljgpsbgbh");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ztbwjgdrq
        iFormItem = this.createFormItem("ztbwjgdrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ztbwjgdrq");
            formItem.setDEFName("ZTBWJGDRQ");
            formItem.setCaption("招投标文件归档日期");
            formItem.setCapLanResTag("DEF.LNAME.ZTBWJGDRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ztbwjgdrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cjzbgs
        iFormItem = this.createFormItem("cjzbgs");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cjzbgs");
            formItem.setDEFName("CJZBGS");
            formItem.setCaption("成交中标公司");
            formItem.setCapLanResTag("DEF.LNAME.CJZBGS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cjzbgs");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // htze
        iFormItem = this.createFormItem("htze");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("htze");
            formItem.setDEFName("HTZE");
            formItem.setCaption("合同总额");
            formItem.setCapLanResTag("DEF.LNAME.HTZE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("htze");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // barq
        iFormItem = this.createFormItem("barq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("barq");
            formItem.setDEFName("BARQ");
            formItem.setCaption("备案日期");
            formItem.setCapLanResTag("DEF.LNAME.BARQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("barq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // zbbhje
        iFormItem = this.createFormItem("zbbhje");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("zbbhje");
            formItem.setDEFName("ZBBHJE");
            formItem.setCaption("质保保函金额");
            formItem.setCapLanResTag("DEF.LNAME.ZBBHJE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("zbbhje");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // bhfyjcfdd
        iFormItem = this.createFormItem("bhfyjcfdd");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("bhfyjcfdd");
            formItem.setDEFName("BHFYJCFDD");
            formItem.setCaption("保函复印件存放地点");
            formItem.setCapLanResTag("DEF.LNAME.BHFYJCFDD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("bhfyjcfdd");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ysrq
        iFormItem = this.createFormItem("ysrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ysrq");
            formItem.setDEFName("YSRQ");
            formItem.setCaption("验收日期");
            formItem.setCapLanResTag("DEF.LNAME.YSRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ysrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // tbrq
        iFormItem = this.createFormItem("tbrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("tbrq");
            formItem.setDEFName("TBRQ");
            formItem.setCaption("退保日期");
            formItem.setCapLanResTag("DEF.LNAME.TBRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("tbrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // wfyk
        iFormItem = this.createFormItem("wfyk");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("wfyk");
            formItem.setDEFName("WFYK");
            formItem.setCaption("未付余款");
            formItem.setCapLanResTag("DEF.LNAME.WFYK");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("wfyk");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // xmmc
        iFormItem = this.createFormItem("xmmc");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("xmmc");
            formItem.setDEFName("XMMC");
            formItem.setCaption("项目名称");
            formItem.setCapLanResTag("DEF.LNAME.XMMC");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("xmmc");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // lxbg
        iFormItem = this.createFormItem("lxbg");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("lxbg");
            formItem.setDEFName("LXBG");
            formItem.setCaption("立项报告");
            formItem.setCapLanResTag("DEF.LNAME.LXBG");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("lxbg");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // sdzzhbh
        iFormItem = this.createFormItem("sdzzhbh");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("sdzzhbh");
            formItem.setDEFName("SDZZHBH");
            formItem.setCaption("上党组织会编号");
            formItem.setCapLanResTag("DEF.LNAME.SDZZHBH");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("sdzzhbh");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // syzjwh
        iFormItem = this.createFormItem("syzjwh");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("syzjwh");
            formItem.setDEFName("SYZJWH");
            formItem.setCaption("使用资金文号");
            formItem.setCapLanResTag("DEF.LNAME.SYZJWH");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("syzjwh");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dlgs
        iFormItem = this.createFormItem("dlgs");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dlgs");
            formItem.setDEFName("DLGS");
            formItem.setCaption("代理公司");
            formItem.setCapLanResTag("DEF.LNAME.DLGS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dlgs");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // zbwjqrqz
        iFormItem = this.createFormItem("zbwjqrqz");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("zbwjqrqz");
            formItem.setDEFName("ZBWJQRQZ");
            formItem.setCaption("招标文件确认签字");
            formItem.setCapLanResTag("DEF.LNAME.ZBWJQRQZ");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("zbwjqrqz");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // zbwjqrdsm
        iFormItem = this.createFormItem("zbwjqrdsm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("zbwjqrdsm");
            formItem.setDEFName("ZBWJQRDSM");
            formItem.setCaption("招标文件确认单扫描");
            formItem.setCapLanResTag("DEF.LNAME.ZBWJQRDSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("zbwjqrdsm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cgggrq
        iFormItem = this.createFormItem("cgggrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cgggrq");
            formItem.setDEFName("CGGGRQ");
            formItem.setCaption("采购公告日期");
            formItem.setCapLanResTag("DEF.LNAME.CGGGRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cgggrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // jcry
        iFormItem = this.createFormItem("jcry");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("jcry");
            formItem.setDEFName("JCRY");
            formItem.setCaption("监察人员");
            formItem.setCapLanResTag("DEF.LNAME.JCRY");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("jcry");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cgjgbgpfrq
        iFormItem = this.createFormItem("cgjgbgpfrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cgjgbgpfrq");
            formItem.setDEFName("CGJGBGPFRQ");
            formItem.setCaption("采购结果报告批复日期");
            formItem.setCapLanResTag("DEF.LNAME.CGJGBGPFRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cgjgbgpfrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // cgjgpssm
        iFormItem = this.createFormItem("cgjgpssm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("cgjgpssm");
            formItem.setDEFName("CGJGPSSM");
            formItem.setCaption("采购结果批示扫描");
            formItem.setCapLanResTag("DEF.LNAME.CGJGPSSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("cgjgpssm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ztbwjcfd
        iFormItem = this.createFormItem("ztbwjcfd");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ztbwjcfd");
            formItem.setDEFName("ZTBWJCFD");
            formItem.setCaption("招投标文件存放地");
            formItem.setCapLanResTag("DEF.LNAME.ZTBWJCFD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ztbwjcfd");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // htsm
        iFormItem = this.createFormItem("htsm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("htsm");
            formItem.setDEFName("HTSM");
            formItem.setCaption("合同扫描");
            formItem.setCapLanResTag("DEF.LNAME.HTSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("htsm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // htqdrq
        iFormItem = this.createFormItem("htqdrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("htqdrq");
            formItem.setDEFName("HTQDRQ");
            formItem.setCaption("合同签订日期");
            formItem.setCapLanResTag("DEF.LNAME.HTQDRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("htqdrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // babsm
        iFormItem = this.createFormItem("babsm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("babsm");
            formItem.setDEFName("BABSM");
            formItem.setCaption("备案表扫描");
            formItem.setCapLanResTag("DEF.LNAME.BABSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("babsm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // bhcfdd
        iFormItem = this.createFormItem("bhcfdd");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("bhcfdd");
            formItem.setDEFName("BHCFDD");
            formItem.setCaption("保函存放地点");
            formItem.setCapLanResTag("DEF.LNAME.BHCFDD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("bhcfdd");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ydlxrq
        iFormItem = this.createFormItem("ydlxrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ydlxrq");
            formItem.setDEFName("YDLXRQ");
            formItem.setCaption("约定履行日期");
            formItem.setCapLanResTag("DEF.LNAME.YDLXRQ");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ydlxrq");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ysbgsn
        iFormItem = this.createFormItem("ysbgsn");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ysbgsn");
            formItem.setDEFName("YSBGSN");
            formItem.setCaption("要收报告扫描");
            formItem.setCapLanResTag("DEF.LNAME.YSBGSN");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ysbgsn");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // jxpg
        iFormItem = this.createFormItem("jxpg");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("jxpg");
            formItem.setDEFName("JXPG");
            formItem.setCaption("绩效评估");
            formItem.setCapLanResTag("DEF.LNAME.JXPG");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("jxpg");
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
            formItem.setCapLanResTag("DEF.LNAME.BZ");

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
        // dycfkjdps
        iFormItem = this.createFormItem("dycfkjdps");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dycfkjdps");
            formItem.setDEFName("DYCFKJDPS");
            formItem.setCaption("第一次付款进度批示");
            formItem.setCapLanResTag("DEF.LNAME.DYCFKJDPS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dycfkjdps");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dycfkje
        iFormItem = this.createFormItem("dycfkje");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dycfkje");
            formItem.setDEFName("DYCFKJE");
            formItem.setCaption("第一次付款金额");
            formItem.setCapLanResTag("DEF.LNAME.DYCFKJE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dycfkje");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dyczfpsrq
        iFormItem = this.createFormItem("dyczfpsrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dyczfpsrq");
            formItem.setDEFName("DYCZFPSRQ");
            formItem.setCaption("第一次支付批示日期");
            formItem.setCapLanResTag("DEF.LNAME.DYCZFPSRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dyczfpsrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dyczfpssm
        iFormItem = this.createFormItem("dyczfpssm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dyczfpssm");
            formItem.setDEFName("DYCZFPSSM");
            formItem.setCaption("第一次支付批示扫描");
            formItem.setCapLanResTag("DEF.LNAME.DYCZFPSSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dyczfpssm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // decfkjdps
        iFormItem = this.createFormItem("decfkjdps");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("decfkjdps");
            formItem.setDEFName("DECFKJDPS");
            formItem.setCaption("第二次付款进度批示");
            formItem.setCapLanResTag("DEF.LNAME.DECFKJDPS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("decfkjdps");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // decfkje
        iFormItem = this.createFormItem("decfkje");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("decfkje");
            formItem.setDEFName("DECFKJE");
            formItem.setCaption("第二次付款金额");
            formItem.setCapLanResTag("DEF.LNAME.DECFKJE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("decfkje");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // deczfpsrq
        iFormItem = this.createFormItem("deczfpsrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("deczfpsrq");
            formItem.setDEFName("DECZFPSRQ");
            formItem.setCaption("第二次支付批示日期");
            formItem.setCapLanResTag("DEF.LNAME.DECZFPSRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("deczfpsrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // deczfpssm
        iFormItem = this.createFormItem("deczfpssm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("deczfpssm");
            formItem.setDEFName("DECZFPSSM");
            formItem.setCaption("第二次支付批示扫描");
            formItem.setCapLanResTag("DEF.LNAME.DECZFPSSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("deczfpssm");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dscfkjdps
        iFormItem = this.createFormItem("dscfkjdps");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dscfkjdps");
            formItem.setDEFName("DSCFKJDPS");
            formItem.setCaption("第三次付款进度批示");
            formItem.setCapLanResTag("DEF.LNAME.DSCFKJDPS");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dscfkjdps");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dscfkje
        iFormItem = this.createFormItem("dscfkje");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dscfkje");
            formItem.setDEFName("DSCFKJE");
            formItem.setCaption("第三次付款金额");
            formItem.setCapLanResTag("DEF.LNAME.DSCFKJE");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dscfkje");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dsczfpsrq
        iFormItem = this.createFormItem("dsczfpsrq");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dsczfpsrq");
            formItem.setDEFName("DSCZFPSRQ");
            formItem.setCaption("第三次支付批示日期");
            formItem.setCapLanResTag("DEF.LNAME.DSCZFPSRQ");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dsczfpsrq");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // dsczfpssm
        iFormItem = this.createFormItem("dsczfpssm");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("dsczfpssm");
            formItem.setDEFName("DSCZFPSSM");
            formItem.setCaption("第三次支付批示扫描");
            formItem.setCapLanResTag("DEF.LNAME.DSCZFPSSM");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("dsczfpssm");
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
        // oa_xmjdid
        iFormItem = this.createFormItem("oa_xmjdid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("oa_xmjdid");
            formItem.setDEFName("OA_XMJDID");
            formItem.setCaption("项目进度标识");
            formItem.setCapLanResTag("DEF.LNAME.OA_XMJDID");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("oa_xmjdid");
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