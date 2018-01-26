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

import com.sa.unip.srv.ywsp.entity.OA_STWMDG;
import com.sa.unip.srv.ywsp.service.OA_STWMDGService;


/**
 * 实体[OA_STWMDG]模型对象
 */
public class OA_STWMDGDEModel extends net.ibizsys.paas.demodel.DataEntityModelBase<OA_STWMDG>  {

    public OA_STWMDGDEModel() throws Exception {
        super();

        this.setId("9e3412d4cc2071a7028a726531005e82");
        this.setName("OA_STWMDG");
        this.setTableName("T_OA_STWMDG");
        this.setViewName("V_OA_STWMDG");
        this.setLogicName("食堂外卖订购");
        this.setDSLink("DEFAULT");
        this.setDataAccCtrlMode(1);
        this.setAuditMode(0);
        DEModelGlobal.registerDEModel("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel",this);
        this.prepareModels();

        //注册到系统中
        this.getUniPSampleSysModel().registerDataEntityModel(this);
    }

    /**
     * 获取实体[OA_STWMDG]模型对象
     * @return
     * @throws Exception
     */
    public static OA_STWMDGDEModel getInstance() throws Exception {
        return (OA_STWMDGDEModel)DEModelGlobal.getDEModel(OA_STWMDGDEModel.class);
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

    private OA_STWMDGService oA_STWMDGService;

    /**
     * 获取实际实体服务对象
     * @return
     */
    public  OA_STWMDGService getRealService() {
        if(this.oA_STWMDGService==null) {
            try {
                this.oA_STWMDGService = (OA_STWMDGService)ServiceGlobal.getService(getServiceId());
            } catch(Exception ex) {
            }
        }
        return this.oA_STWMDGService;
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
        return "com.sa.unip.srv.ywsp.service.OA_STWMDGService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#createEntity()
     */
    @Override
    public OA_STWMDG createEntity() {
        return new OA_STWMDG();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEFields()
     */
    @Override
    protected void prepareDEFields() throws Exception {
        IDEField iDEField = null;
        IDEFSearchMode iDEFSearchMode = null;
        //注册属性 "STWMSFSHTG"
        iDEField = this.createDEField("STWMSFSHTG");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("4481a4b3e120865b5e38676e6c5f1059");
            deFieldModel.setName("STWMSFSHTG");
            deFieldModel.setLogicName("食堂外卖是否审核通过");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_STWMSFSHTG_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_STWMSFSHTG_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "BZ"
        iDEField = this.createDEField("BZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("6510ec229cc1359a3e3a9725c8de9fa9");
            deFieldModel.setName("BZ");
            deFieldModel.setLogicName("备注");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "OA_STWMDGNAME"
        iDEField = this.createDEField("OA_STWMDGNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("79369fe3354f86e0b94a41c50b299b19");
            deFieldModel.setName("OA_STWMDGNAME");
            deFieldModel.setLogicName("食堂外卖订购名称");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setMajorDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_OA_STWMDGNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_OA_STWMDGNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "OA_STWMDGID"
        iDEField = this.createDEField("OA_STWMDGID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("c6bc58d30acb8c5db515273fb7c99174");
            deFieldModel.setName("OA_STWMDGID");
            deFieldModel.setLogicName("食堂外卖订购标识");
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
        //注册属性 "UPDATEDATE"
        iDEField = this.createDEField("UPDATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("1aee235bf3c5804df37b077b00ad9bab");
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
        //注册属性 "UPDATEMAN"
        iDEField = this.createDEField("UPDATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("481df0f79395cf32d72aa9ac40d8c098");
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
            deFieldModel.setId("66cc695206aa49ff54068b8e4622895b");
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
        //注册属性 "CREATEMAN"
        iDEField = this.createDEField("CREATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("79f4d27f9ce52c9787ed84708936f916");
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
        //注册属性 "ORGUSERID"
        iDEField = this.createDEField("ORGUSERID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("ea1f359430b7c81c6d572d870ba389af");
            deFieldModel.setName("ORGUSERID");
            deFieldModel.setLogicName("订餐人标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_STWMDG_ORGUSER_ORGUSERID");
            deFieldModel.setLinkDEFName("ORGUSERID");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGUSERID_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGUSERID_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ORGUSERNAME"
        iDEField = this.createDEField("ORGUSERNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("1fd48c1185e2e9001bd939ba4adb34a9");
            deFieldModel.setName("ORGUSERNAME");
            deFieldModel.setLogicName("订餐人姓名");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_STWMDG_ORGUSER_ORGUSERID");
            deFieldModel.setLinkDEFName("ORGUSERNAME");
            deFieldModel.setPhisicalDEField(false);
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGUSERNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGUSERNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGUSERNAME_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGUSERNAME_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "YCDD"
        iDEField = this.createDEField("YCDD");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("ec938f8e41273652e997d1fca38d94c7");
            deFieldModel.setName("YCDD");
            deFieldModel.setLogicName("用餐地点");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SCSJ"
        iDEField = this.createDEField("SCSJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("f7468b9c53f95e670949f4518bab40e4");
            deFieldModel.setName("SCSJ");
            deFieldModel.setLogicName("送餐时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "YCRS"
        iDEField = this.createDEField("YCRS");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8aa041dc55af4bb488cd0b8cb100b2b9");
            deFieldModel.setName("YCRS");
            deFieldModel.setLogicName("用餐人数");
            deFieldModel.setDataType("INT");
            deFieldModel.setStdDataType(9);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SY"
        iDEField = this.createDEField("SY");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("800ec5e8f1452d63da75df445958043d");
            deFieldModel.setName("SY");
            deFieldModel.setLogicName("事由");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "MEMO"
        iDEField = this.createDEField("MEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8079d8b74e91e3f9b3e436dc312badf9");
            deFieldModel.setName("MEMO");
            deFieldModel.setLogicName("审核意见");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "FJ"
        iDEField = this.createDEField("FJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("a3091d5f1ad0e52ec2cda95cdf5a2440");
            deFieldModel.setName("FJ");
            deFieldModel.setLogicName("附件");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WFINSTANCEID"
        iDEField = this.createDEField("WFINSTANCEID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("7c9056d7ba472360d73ff71fbf47fc54");
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
            deFieldModel.setId("f41992189aff15c551786762c58a6469");
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
        //注册属性 "STWMDGBZ"
        iDEField = this.createDEField("STWMDGBZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("ce64596f43b2a816b1551134b5e4d6c0");
            deFieldModel.setName("STWMDGBZ");
            deFieldModel.setLogicName("食堂外卖订购步骤");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_STWMDGBZ_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_STWMDGBZ_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "STWMDGZT"
        iDEField = this.createDEField("STWMDGZT");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("6ed2f62b803c54fe6bfc168d49d63c03");
            deFieldModel.setName("STWMDGZT");
            deFieldModel.setLogicName("食堂外卖订购状态");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_STWMDGZT_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_STWMDGZT_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
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
        IDEACMode _defaultACModel = (IDEACMode)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDefaultACModel");
        _defaultACModel.init(this);
        this.registerDEACMode(_defaultACModel);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        //注册  CurStwmdg
        IDEDataSet curStwmdgDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGCurStwmdgDSModel");
        curStwmdgDSModel.init(this);
        this.registerDEDataSet(curStwmdgDSModel);
        //注册  DEFAULT
        IDEDataSet _defaultDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDefaultDSModel");
        _defaultDSModel.init(this);
        this.registerDEDataSet(_defaultDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        //注册  DEFAULT
        IDEDataQuery _defaultDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDefaultDQModel");
        _defaultDQModel.init(this);
        this.registerDEDataQuery(_defaultDQModel);
        //注册  CurStwmdg
        IDEDataQuery curStwmdgDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGCurStwmdgDQModel");
        curStwmdgDQModel.init(this);
        this.registerDEDataQuery(curStwmdgDQModel);
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
        //注册  设置默认值
        IDELogic sZMRZLogicModel = (IDELogic)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGSZMRZLogicModel");
        sZMRZLogicModel.init(this);
        this.registerDELogic(sZMRZLogicModel);
        this.registerDEActionLogic("CREATE","BEFORE","SZMRZ");
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
        //注册  食堂外卖订购流程
        IDEWF sTWMDGLCDEWFModel =(IDEWF)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGSTWMDGLCDEWFModel");
        sTWMDGLCDEWFModel.init(this);
        this.registerDEWF(sTWMDGLCDEWFModel);

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
        //注册视图 食堂外卖订购实体表格视图
        this.registerPDTDEView("MDATAVIEW","419726fb183fed8d10557e740c80e95d");
        //注册视图 食堂外卖订购实体移动端编辑视图（审核结束）
        this.registerPDTDEView("MOBEDITVIEW","49908396-A524-45F6-941B-53B1828B77A7");
        //注册视图 食堂外卖订购实体移动端工作流编辑视图（分页关系）(食堂外卖订购流程)
        this.registerPDTDEView("MOBWFEDITVIEW:STWMDGLC:D","22141ad85af75d574c877af634f8331f");
        //注册视图 食堂外卖订购实体移动端工作流编辑视图（分页关系）(食堂外卖订购流程v1:部门领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:STWMDGLC:W:10","c9ff25df0f298916a7c5864a1c333c24");
        //注册视图 食堂外卖订购实体移动端工作流编辑视图（分页关系）(食堂外卖订购流程v1:承办处领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:STWMDGLC:W:20","c6e870b65b188054cff3d58b4b1b97d9");
        //注册视图 食堂外卖订购实体移动端工作流多数据视图(食堂外卖订购流程)
        this.registerPDTDEView("MOBWFMDATAVIEW:STWMDGLC:D","3fa66f213bef7af0a28868b87c1db9ba");
        //注册视图 食堂外卖订购实体移动端工作流多数据视图(食堂外卖订购流程)
        this.registerPDTDEView("MOBWFMDATAVIEW:STWMDGLC:W","7a41a645e0030ab06e7897e32bc3ef75");
        //注册视图 食堂外卖订购实体数据多项选择视图
        this.registerPDTDEView("MPICKUPVIEW","808a3cfa1bbe233b9d4f995544110908");
        //注册视图 食堂外卖订购实体数据选择视图
        this.registerPDTDEView("PICKUPVIEW","7bc2a3982374304e251e5d6ac80d9673");
        //注册视图 食堂外卖订购实体数据重定向视图
        this.registerPDTDEView("REDIRECTVIEW","f866fa5db6fb920fb93c6858e9cfef6c");
        //注册视图 食堂外卖订购实体工作流视图（分页关系）(食堂外卖订购流程)
        this.registerPDTDEView("WFEDITVIEW:STWMDGLC:D","c5d5a4831e8406b30a9ca03b9aa09e83");
        //注册视图 食堂外卖订购实体工作流视图（分页关系）(食堂外卖订购流程v1:部门领导审核)
        this.registerPDTDEView("WFEDITVIEW:STWMDGLC:W:10","892ccb49daa291bd41930d71332ac8eb");
        //注册视图 食堂外卖订购实体工作流视图（分页关系）(食堂外卖订购流程v1:承办处领导审核)
        this.registerPDTDEView("WFEDITVIEW:STWMDGLC:W:20","9b3ba1ef7f92444cd40e7a448702cca7");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:D","ada6cdc5818185ab1bde738664652c8e");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程:未提交)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:D:10","08d5e7040769623df075db30cdf30cbe");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程:审核中)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:D:20","bc33ecd4437a62a1f80516f88fdb4bf0");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程:已完成)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:D:30","42ace9449c28a68cfa0579ed8f0090b2");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:W","f57c3ec4ac7faf647c50d0db2e39d7af");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程:部门领导审核)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:W:10","910b1193a8b43b9d6362f2c9ee487717");
        //注册视图 食堂外卖订购实体工作流表格视图(食堂外卖订购流程:承办处领导审核)
        this.registerPDTDEView("WFMDATAVIEW:STWMDGLC:W:20","a11a6e031802aab793883133f81ce356");
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

        //放入属性 OA_STWMDGNAME - 食堂外卖订购名称
        if(true) {
            DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
            deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
            deDataSetCondImpl.setCondOp(ICondition.CONDOP_LIKE);
            deDataSetCondImpl.setDEFName(OA_STWMDG.FIELD_OA_STWMDGNAME);
            deDataSetCondImpl.setCondValue(strQuickSearch);
            groupCondImpl.addChildDEDataQueryCond(deDataSetCondImpl);
        }
    }
}