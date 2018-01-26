/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.workflow;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.annotation.Annotation;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.DynamicCodeListModelBase;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.pswf.core.IWFService;
import net.ibizsys.pswf.core.IWFVersionModel;
import com.sa.unip.srv.UniPSampleSysModel;


/**
 * 车牌门禁申请流程 流程模型
 */
public class CPMJSQLCWFModel extends net.ibizsys.pswf.core.WFModelBase {

    public CPMJSQLCWFModel() throws Exception {

        super();
        this.setId("BCE28AB4-6801-4E94-B40C-1B4DEA610230");
        this.setName("车牌门禁申请流程");
        //注册流程
        getUniPSampleSysModel().registerWFModel(this);

        //设置相关代码表
        this.setWFStepCodeList(CodeListGlobal.getCodeList("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel"));
        this.setEntityStateCodeList(CodeListGlobal.getCodeList("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel"));

        //设置业务状态中的流程状态
        this.registerEntityWFState("20");
        //注册流程版本
        prepareWFVersionModels();

        //准备流程服务
        prepareWFService();
    }

    /**
     * 准备流程版本
     * @throws Exception
     */
    protected void prepareWFVersionModels() throws Exception {
        IWFVersionModel cPMJSQLCv1WFVersionModel = (IWFVersionModel)getUniPSampleSysModel().createObject("com.sa.unip.srv.workflow.CPMJSQLCv1WFVersionModel");
        cPMJSQLCv1WFVersionModel.init(this);
        this.registerWFVersionModel(cPMJSQLCv1WFVersionModel);
    }

    /**
    * 准备流程服务
     * @throws Exception
     */
    protected void prepareWFService() throws Exception {
        IWFService iWFService = (IWFService)getUniPSampleSysModel().createObject("com.sa.unip.srv.workflow.CPMJSQLCWFService");
        iWFService.init(this);
        this.setWFService(iWFService);
    }


    private UniPSampleSysModel uniPSampleSysModel;
    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    @Override
    public  ISystemModel getSystemModel() {
        return this.getUniPSampleSysModel();
    }



}