/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import java.io.Serializable;
import java.util.ArrayList;
import org.hibernate.SessionFactory;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.view.IView;
import net.ibizsys.paas.core.IDEFSearchMode;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.demodel.DEFSearchModeModel;
import net.ibizsys.paas.demodel.DEFieldModel;
import net.ibizsys.paas.demodel.DEMainStateModel;
import net.ibizsys.paas.demodel.DEDataSyncModel;
import net.ibizsys.paas.demodel.DEActionWizardGroupModel;
import net.ibizsys.paas.demodel.DEActionWizardModel;
import net.ibizsys.paas.demodel.DEDataSetDEAWModel;
import net.ibizsys.paas.demodel.DEActionWizardItemModel;
import net.ibizsys.paas.demodel.IDEActionWizardModel;
import net.ibizsys.paas.demodel.DEUniStateModel;
import net.ibizsys.paas.core.IDEDataQuery;
import net.ibizsys.paas.core.IDEDataSet;
import net.ibizsys.paas.core.IDEAction;
import net.ibizsys.paas.core.IDEACMode;
import net.ibizsys.paas.core.IDELogic;
import net.ibizsys.paas.core.IDEUIAction;
import net.ibizsys.paas.core.IDEWF;
import net.ibizsys.paas.core.IDEMainState;
import net.ibizsys.paas.core.IDEDataImport;
import net.ibizsys.paas.report.IPrintService;
import net.ibizsys.paas.report.IReportService;
import net.ibizsys.paas.demodel.IDEDataExportModel;

import net.ibizsys.paas.demodel.DEBATableModel;
import com.sa.unip.srv.UniPSampleSysModel;

import com.sa.unip.srv.ywsp.entity.Demo;
import com.sa.unip.srv.ywsp.service.DemoService;


/**
 * 实体[DEMO]模型对象
 */
public class DemoDEModel extends net.ibizsys.paas.demodel.DataEntityModelBase<Demo>  {

    public DemoDEModel() throws Exception {
        super();

        this.setId("6882a0ebeaba71c3557f87d860621328");
        this.setName("DEMO");
        this.setTableName("T_DEMO");
        this.setViewName("V_DEMO");
        this.setLogicName("演示");
        this.setDSLink("DEFAULT");
        this.setDataAccCtrlMode(1);
        this.setAuditMode(0);
        DEModelGlobal.registerDEModel("com.sa.unip.srv.ywsp.demodel.DemoDEModel",this);
        this.prepareModels();

        //注册到系统中
        this.getUniPSampleSysModel().registerDataEntityModel(this);
    }

    /**
     * 获取实体[Demo]模型对象
     * @return
     * @throws Exception
     */
    public static DemoDEModel getInstance() throws Exception {
        return (DemoDEModel)DEModelGlobal.getDEModel(DemoDEModel.class);
    }


    private UniPSampleSysModel uniPSampleSysModel;
    /**
     * 获取当前系统[UniPSample]模型对象
     * @return
     */
    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#getSystem()
     */
    @Override
    public  ISystem getSystem() {
        return this.getUniPSampleSysModel();
    }

    private DemoService demoService;

    /**
     * 获取实际实体服务对象
     * @return
     */
    public  DemoService getRealService() {
        if(this.demoService==null) {
            try {
                this.demoService = (DemoService)ServiceGlobal.getService(getServiceId());
            } catch(Exception ex) {
            }
        }
        return this.demoService;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#getService()
     */
    @Override
    public IService getService() {
        return this.getRealService();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#getServiceId()
     */
    @Override
    public String getServiceId() {
        return "com.sa.unip.srv.ywsp.service.DemoService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#createEntity()
     */
    @Override
    public Demo createEntity() {
        return new Demo();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEFields()
     */
    @Override
    protected void prepareDEFields() throws Exception {
        IDEField iDEField = null;
        IDEFSearchMode iDEFSearchMode = null;
        //注册属性 "DEMONAME"
        iDEField = this.createDEField("DEMONAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8cfeaac6bb69676a51d26de7f5c55a5f");
            deFieldModel.setName("DEMONAME");
            deFieldModel.setLogicName("演示名称");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setMajorDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_DEMONAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_DEMONAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DEMOID"
        iDEField = this.createDEField("DEMOID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("bd619e239e1932ce52d6d495f191fef6");
            deFieldModel.setName("DEMOID");
            deFieldModel.setLogicName("演示标识");
            deFieldModel.setDataType("GUID");
            deFieldModel.setStdDataType(25);
            deFieldModel.setKeyDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CREATEMAN"
        iDEField = this.createDEField("CREATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("35f03767b10a3db850ec28518d7cfc24");
            deFieldModel.setName("CREATEMAN");
            deFieldModel.setLogicName("建立人");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("CREATEMAN");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "UPDATEMAN"
        iDEField = this.createDEField("UPDATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("3aca8f6544421304a78a5764a49b5f98");
            deFieldModel.setName("UPDATEMAN");
            deFieldModel.setLogicName("更新人");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("UPDATEMAN");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CREATEDATE"
        iDEField = this.createDEField("CREATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("81a0f581c4a78f4cc3f4ceabf741045f");
            deFieldModel.setName("CREATEDATE");
            deFieldModel.setLogicName("建立时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("CREATEDATE");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "UPDATEDATE"
        iDEField = this.createDEField("UPDATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d2564ba7550de9e53c36deaf217dd528");
            deFieldModel.setName("UPDATEDATE");
            deFieldModel.setLogicName("更新时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("UPDATEDATE");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SJDEMO"
        iDEField = this.createDEField("SJDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("7cf6e33e837ac0dfafd6ec31f6e13b73");
            deFieldModel.setName("SJDEMO");
            deFieldModel.setLogicName("时间控件演示");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WBKDEMO"
        iDEField = this.createDEField("WBKDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("a0295781f3ce40c6f69089d4670866bc");
            deFieldModel.setName("WBKDEMO");
            deFieldModel.setLogicName("文本框演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DHWBKDEMO"
        iDEField = this.createDEField("DHWBKDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("88a41c30267692eeff56ad46ba38e524");
            deFieldModel.setName("DHWBKDEMO");
            deFieldModel.setLogicName("多行文本框演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "TPDEMO"
        iDEField = this.createDEField("TPDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d96ed9b63058b4d5c04a85442f8d00bd");
            deFieldModel.setName("TPDEMO");
            deFieldModel.setLogicName("图片上传演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WJDEMO"
        iDEField = this.createDEField("WJDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("59b2af0ca43cc9b0b7aaaf337c3a35fd");
            deFieldModel.setName("WJDEMO");
            deFieldModel.setLogicName("文件上传演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "TPLBDEMO"
        iDEField = this.createDEField("TPLBDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("5e91fef5de1a1a80ec94f43d09f078d6");
            deFieldModel.setName("TPLBDEMO");
            deFieldModel.setLogicName("图片列表上传演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SJXZDEMO"
        iDEField = this.createDEField("SJXZDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("32861e337f5615437868e55afeb97ce0");
            deFieldModel.setName("SJXZDEMO");
            deFieldModel.setLogicName("数据选择演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DSJXZDEMO"
        iDEField = this.createDEField("DSJXZDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("35742fc354e8122d044b14630d3a0ad2");
            deFieldModel.setName("DSJXZDEMO");
            deFieldModel.setLogicName("多数据选择演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DXLBDEMO"
        iDEField = this.createDEField("DXLBDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("f88e008d850b5a5bc941cf7ef3e83e0e");
            deFieldModel.setName("DXLBDEMO");
            deFieldModel.setLogicName("单选列表演示");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFYDCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_DXLBDEMO_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_DXLBDEMO_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "XLLBDEMO"
        iDEField = this.createDEField("XLLBDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("358e7dadeb0d88c3c8c14ccaab705b2e");
            deFieldModel.setName("XLLBDEMO");
            deFieldModel.setLogicName("下拉列表演示");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFYDCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_XLLBDEMO_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_XLLBDEMO_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "XXKLBDEMO"
        iDEField = this.createDEField("XXKLBDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("2e836095243dccb974d981c7164f85b1");
            deFieldModel.setName("XXKLBDEMO");
            deFieldModel.setLogicName("选项框演示");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFYDCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_XXKLBDEMO_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_XXKLBDEMO_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "BKBJDEMO"
        iDEField = this.createDEField("BKBJDEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8cebd78a46cc62c9a05703f88ce0468e");
            deFieldModel.setName("BKBJDEMO");
            deFieldModel.setLogicName("不可编辑演示");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DEMOSQZT"
        iDEField = this.createDEField("DEMOSQZT");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("025e8b809d1eb679a48633ef56a3cbcf");
            deFieldModel.setName("DEMOSQZT");
            deFieldModel.setLogicName("演示申请状态");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_DEMOSQZT_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_DEMOSQZT_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DEMOSQBZ"
        iDEField = this.createDEField("DEMOSQBZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("24c6d56b5b8f366196a2b1b9a671e9a2");
            deFieldModel.setName("DEMOSQBZ");
            deFieldModel.setLogicName("演示申请步骤");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_DEMOSQBZ_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_DEMOSQBZ_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WFINSTANCEID"
        iDEField = this.createDEField("WFINSTANCEID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("92aacee021210998a130b8820cdedf4c");
            deFieldModel.setName("WFINSTANCEID");
            deFieldModel.setLogicName("工作流实例");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WFSTATE"
        iDEField = this.createDEField("WFSTATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("eaf62587fad2ff130ce62df4efe721b3");
            deFieldModel.setName("WFSTATE");
            deFieldModel.setLogicName("工作流状态");
            deFieldModel.setDataType("WFSTATE");
            deFieldModel.setStdDataType(9);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.WFStatesCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEACModes()
     */
    @Override
    protected void prepareDEACModes() throws Exception {
        //注册  DEFAULT
        IDEACMode _defaultACModel = (IDEACMode)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.DemoDefaultACModel");
        _defaultACModel.init(this);
        this.registerDEACMode(_defaultACModel);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        //注册  DEFAULT
        IDEDataSet _defaultDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.DemoDefaultDSModel");
        _defaultDSModel.init(this);
        this.registerDEDataSet(_defaultDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        //注册  DEFAULT
        IDEDataQuery _defaultDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.DemoDefaultDQModel");
        _defaultDQModel.init(this);
        this.registerDEDataQuery(_defaultDQModel);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEActions()
     */
    @Override
    protected void prepareDEActions() throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDELogics()
     */
    @Override
    protected void prepareDELogics() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEUIActions()
    */
    @Override
    protected void prepareDEUIActions() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEWFs()
     */
    @Override
    protected void prepareDEWFs() throws Exception {
        //注册  演示申请（测试）
        IDEWF dEMOLCDEWFModel =(IDEWF)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.DemoDEMOLCDEWFModel");
        dEMOLCDEWFModel.init(this);
        this.registerDEWF(dEMOLCDEWFModel);

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEUniStates()
     */
    @Override
    protected void prepareDEUniStates() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEMainStates()
     */
    @Override
    protected void prepareDEMainStates() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSyncs()
     */
    @Override
    protected void prepareDEDataSyncs() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#preparePDTDEViews()
     */
    @Override
    protected void preparePDTDEViews() throws Exception {
        //注册视图 演示实体表格视图
        this.registerPDTDEView("MDATAVIEW","41863ee7d71fa4caccaf3b690f9945db");
        //注册视图 演示实体移动端工作流编辑视图（分页关系）(演示申请（测试）)
        this.registerPDTDEView("MOBWFEDITVIEW:DEMOLC:D","a5edec66d5176bd5ec5cff2f9b981bd9");
        //注册视图 演示实体移动端工作流编辑视图（分页关系）(演示申请（测试）v1:部门领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:DEMOLC:W:10","1c410bfba6914a6ba8328ccde294eeae");
        //注册视图 演示实体移动端工作流多数据视图(演示申请（测试）)
        this.registerPDTDEView("MOBWFMDATAVIEW:DEMOLC:D","d10a7cea3585f3cd60973953f53f845b");
        //注册视图 演示实体移动端工作流多数据视图(演示申请（测试）)
        this.registerPDTDEView("MOBWFMDATAVIEW:DEMOLC:W","d19536c465c50b3f8b23de2b32e45812");
        //注册视图 演示实体数据多项选择视图
        this.registerPDTDEView("MPICKUPVIEW","2b845869459326451fcd8faae61b8800");
        //注册视图 演示实体数据选择视图
        this.registerPDTDEView("PICKUPVIEW","518a17f84688d7ec46c96916f826559b");
        //注册视图 演示实体数据重定向视图
        this.registerPDTDEView("REDIRECTVIEW","19c38f8576fec91fef3d65ff22a107b2");
        //注册视图 演示实体工作流视图（分页关系）(演示申请（测试）)
        this.registerPDTDEView("WFEDITVIEW:DEMOLC:D","51750cc1bd810e16eba98fdb1078f435");
        //注册视图 演示实体工作流视图（分页关系）(演示申请（测试）v1:部门领导审核)
        this.registerPDTDEView("WFEDITVIEW:DEMOLC:W:10","22b80344098996be2eb197e43c6569bc");
        //注册视图 演示实体工作流表格视图(演示申请（测试）)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:D","fa252e0af0d4e91382e51f33cf1b6128");
        //注册视图 演示实体工作流表格视图(演示申请（测试）:未提交)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:D:10","53f966efda4aea3cce92230e6ad0237f");
        //注册视图 演示实体工作流表格视图(演示申请（测试）:流程中)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:D:20","5728b9eede516948588c6e817a93e082");
        //注册视图 演示实体工作流表格视图(演示申请（测试）:已完成)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:D:30","ee536ca8c8107668ebd463839883d0eb");
        //注册视图 演示实体工作流表格视图(演示申请（测试）:已拒绝)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:D:40","ad7e669e0228918bcbf8222b11a8df5f");
        //注册视图 演示实体工作流表格视图(演示申请（测试）)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:W","dbe2ecf76cecc107888008e3645c9fca");
        //注册视图 演示实体工作流表格视图(演示申请（测试）:部门领导审核)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:W:10","366070d3af1139e55a73c034c1fe350b");
        //注册视图 演示实体工作流表格视图(演示申请（测试）:承办处领导审核)
        this.registerPDTDEView("WFMDATAVIEW:DEMOLC:W:20","31776816fd5b7a33f2da07b4dcde1901");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEOPPrivTagMaps()
     */
    @Override
    protected void prepareDEOPPrivTagMaps()throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEPrints()
     */
    @Override
    protected void prepareDEPrints()throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEReports()
     */
    @Override
    protected void prepareDEReports()throws Exception {
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataExports()
     */
    @Override
    protected void prepareDEDataExports() throws Exception {

    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEActionWizards()
     */
    @Override
    protected void prepareDEActionWizards() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEActionWizardGroups()
     */
    @Override
    protected void prepareDEActionWizardGroups() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEBATables()
     */
    @Override
    protected void prepareDEBATables() throws Exception {
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#onFillFetchQuickSearchConditions(net.ibizsys.paas.core.DEDataSetCond, java.lang.String)
     */
    @Override
    protected void onFillFetchQuickSearchConditions(DEDataSetCond groupCondImpl,String strQuickSearch)  throws Exception {
        super.onFillFetchQuickSearchConditions(groupCondImpl,strQuickSearch);

        //放入属性 DEMONAME - 演示名称
        if(true) {
            DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
            deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
            deDataSetCondImpl.setCondOp(ICondition.CONDOP_LIKE);
            deDataSetCondImpl.setDEFName(Demo.FIELD_DEMONAME);
            deDataSetCondImpl.setCondValue(strQuickSearch);
            groupCondImpl.addChildDEDataQueryCond(deDataSetCondImpl);
        }
    }
}