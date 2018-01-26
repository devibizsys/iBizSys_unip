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

import com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ;
import com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService;


/**
 * 实体[OA_NSJGHYSQ]模型对象
 */
public class OA_NSJGHYSQDEModel extends net.ibizsys.paas.demodel.DataEntityModelBase<OA_NSJGHYSQ>  {

    public OA_NSJGHYSQDEModel() throws Exception {
        super();

        this.setId("4ab8e29eef72eb9ce66e677cef7051f9");
        this.setName("OA_NSJGHYSQ");
        this.setTableName("T_OA_NSJGHYSQ");
        this.setViewName("V_OA_NSJGHYSQ");
        this.setLogicName("内设机构会议申请");
        this.setLogicValid(true);
        this.setValidValue("1");
        this.setInvalidValue("0");
        this.setDSLink("DEFAULT");
        this.setDataAccCtrlMode(1);
        this.setAuditMode(0);
        DEModelGlobal.registerDEModel("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel",this);
        this.prepareModels();

        //注册到系统中
        this.getUniPSampleSysModel().registerDataEntityModel(this);
    }

    /**
     * 获取实体[OA_NSJGHYSQ]模型对象
     * @return
     * @throws Exception
     */
    public static OA_NSJGHYSQDEModel getInstance() throws Exception {
        return (OA_NSJGHYSQDEModel)DEModelGlobal.getDEModel(OA_NSJGHYSQDEModel.class);
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

    private OA_NSJGHYSQService oA_NSJGHYSQService;

    /**
     * 获取实际实体服务对象
     * @return
     */
    public  OA_NSJGHYSQService getRealService() {
        if(this.oA_NSJGHYSQService==null) {
            try {
                this.oA_NSJGHYSQService = (OA_NSJGHYSQService)ServiceGlobal.getService(getServiceId());
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQService;
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
        return "com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#createEntity()
     */
    @Override
    public OA_NSJGHYSQ createEntity() {
        return new OA_NSJGHYSQ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEFields()
     */
    @Override
    protected void prepareDEFields() throws Exception {
        IDEField iDEField = null;
        IDEFSearchMode iDEFSearchMode = null;
        //注册属性 "NSJGSFSHTG"
        iDEField = this.createDEField("NSJGSFSHTG");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("9a65b0a67d220e061164eb4c3825e01c");
            deFieldModel.setName("NSJGSFSHTG");
            deFieldModel.setLogicName("内设机构会议申请是否审核通过");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_NSJGSFSHTG_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_NSJGSFSHTG_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "MEMO"
        iDEField = this.createDEField("MEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("900d21337ca4ef9960c116aa791faf60");
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
        //注册属性 "ENABLE"
        iDEField = this.createDEField("ENABLE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("43b8070a929dd78a5234c636f07c2a46");
            deFieldModel.setName("ENABLE");
            deFieldModel.setLogicName("逻辑有效标志");
            deFieldModel.setDataType("YESNO");
            deFieldModel.setStdDataType(9);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("LOGICVALID");
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
            deFieldModel.setId("45c98ffcec7c0402b17a28c5cd46aa58");
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
        //注册属性 "OA_NSJGHYSQID"
        iDEField = this.createDEField("OA_NSJGHYSQID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("906d459bd4c8b89f72de3dce43d2d358");
            deFieldModel.setName("OA_NSJGHYSQID");
            deFieldModel.setLogicName("内设机构会议申请标识");
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
        //注册属性 "OA_NSJGHYSQNAME"
        iDEField = this.createDEField("OA_NSJGHYSQNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("e64e8bdffb0489242879597cd5eff1d0");
            deFieldModel.setName("OA_NSJGHYSQNAME");
            deFieldModel.setLogicName("内设机构会议申请名称");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setMajorDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_OA_NSJGHYSQNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_OA_NSJGHYSQNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "UPDATEMAN"
        iDEField = this.createDEField("UPDATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("69a75a81cd5e7fbcedbc35d0a4152241");
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
        //注册属性 "UPDATEDATE"
        iDEField = this.createDEField("UPDATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("a366304fe96fcf20690cf6554c9323ee");
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
        //注册属性 "CREATEDATE"
        iDEField = this.createDEField("CREATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("bf249fe850423c07f26f04883f2bece7");
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
        //注册属性 "HYSJ"
        iDEField = this.createDEField("HYSJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("7abbbd0da278cd08504dda49adcbef63");
            deFieldModel.setName("HYSJ");
            deFieldModel.setLogicName("会议时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "HYDD"
        iDEField = this.createDEField("HYDD");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("32f2ea9e22a1ca976f0513cb1f34016b");
            deFieldModel.setName("HYDD");
            deFieldModel.setLogicName("会议地点");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "HYYQ"
        iDEField = this.createDEField("HYYQ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("73dc96937791964ab51b7f94f46c78c4");
            deFieldModel.setName("HYYQ");
            deFieldModel.setLogicName("会议要求");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CHLD"
        iDEField = this.createDEField("CHLD");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("1b39fe3b6a9d56d847ac093ac16c6c86");
            deFieldModel.setName("CHLD");
            deFieldModel.setLogicName("参会领导");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CBCSFZRYJ"
        iDEField = this.createDEField("CBCSFZRYJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("531f6293012934da357456a3b63a43e0");
            deFieldModel.setName("CBCSFZRYJ");
            deFieldModel.setLogicName("承办处室负责人意见");
            deFieldModel.setDataType("LONGTEXT_1000");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "MSCYJ"
        iDEField = this.createDEField("MSCYJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("1e98036460602f4131458927b0ec4f84");
            deFieldModel.setName("MSCYJ");
            deFieldModel.setLogicName("秘书处意见");
            deFieldModel.setDataType("LONGTEXT_1000");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "YBFZRYJ"
        iDEField = this.createDEField("YBFZRYJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("fa8709cf26d786efa2b506e597f80d55");
            deFieldModel.setName("YBFZRYJ");
            deFieldModel.setLogicName("院办负责人意见");
            deFieldModel.setDataType("LONGTEXT_1000");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "BZ"
        iDEField = this.createDEField("BZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("e1103f6a64fadc74cff119d78b115d26");
            deFieldModel.setName("BZ");
            deFieldModel.setLogicName("备注");
            deFieldModel.setDataType("LONGTEXT_1000");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "NSJGHYSQZT"
        iDEField = this.createDEField("NSJGHYSQZT");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("5e5e2fa72c6987ced36738950b6ff025");
            deFieldModel.setName("NSJGHYSQZT");
            deFieldModel.setLogicName("内设机构会议申请状态");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_NSJGHYSQZTCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_NSJGHYSQZT_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_NSJGHYSQZT_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "NSJGHYSQBZ"
        iDEField = this.createDEField("NSJGHYSQBZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("59debc9c1750fc24a5cb0e8a4306fbfc");
            deFieldModel.setName("NSJGHYSQBZ");
            deFieldModel.setLogicName("内设机构会议申请步骤");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_NSJGHYSQBZ_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_NSJGHYSQBZ_EQ");
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
            deFieldModel.setId("75589fb879fa851019696565b703e9bc");
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
            deFieldModel.setId("c2b2247615bc2ee2e55a7ca78ca9d5af");
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
        //注册属性 "ORGUSERID"
        iDEField = this.createDEField("ORGUSERID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("88419fd4f123971b6303e9050e3ebbc1");
            deFieldModel.setName("ORGUSERID");
            deFieldModel.setLogicName("组织人员标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID");
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
        //注册属性 "ORGSECTORID"
        iDEField = this.createDEField("ORGSECTORID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("03700994ed3b912f66c9f6fc9a605146");
            deFieldModel.setName("ORGSECTORID");
            deFieldModel.setLogicName("部门标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID");
            deFieldModel.setLinkDEFName("ORGSECTORID");
            deFieldModel.setPreDefinedType("ORGSECTORID");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGSECTORID_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGSECTORID_EQ");
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
            deFieldModel.setId("ca7da05c71117339c6c8479b28c9a10e");
            deFieldModel.setName("ORGUSERNAME");
            deFieldModel.setLogicName("组织人员名称");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID");
            deFieldModel.setLinkDEFName("ORGUSERNAME");
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
        //注册属性 "ORGSECTORNAME"
        iDEField = this.createDEField("ORGSECTORNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("3bd7fcb1fccb72267a1748a8a5076c22");
            deFieldModel.setName("ORGSECTORNAME");
            deFieldModel.setLogicName("组织部门名称");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID");
            deFieldModel.setLinkDEFName("ORGSECTORNAME");
            deFieldModel.setPreDefinedType("ORGSECTORNAME");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGSECTORNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGSECTORNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGSECTORNAME_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGSECTORNAME_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "HYSID"
        iDEField = this.createDEField("HYSID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("827fc53f85431df67f714d764fcb33d8");
            deFieldModel.setName("HYSID");
            deFieldModel.setLogicName("会议室标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_NSJGHYSQ_OA_HYS_HYSID");
            deFieldModel.setLinkDEFName("OA_HYSID");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_HYSID_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_HYSID_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "HYSNAME"
        iDEField = this.createDEField("HYSNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("70848e06f369dd29e3210acda57428f7");
            deFieldModel.setName("HYSNAME");
            deFieldModel.setLogicName("会议室");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_NSJGHYSQ_OA_HYS_HYSID");
            deFieldModel.setLinkDEFName("OA_HYSNAME");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_HYSNAME_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_HYSNAME_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_HYSNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_HYSNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
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
        IDEACMode _defaultACModel = (IDEACMode)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDefaultACModel");
        _defaultACModel.init(this);
        this.registerDEACMode(_defaultACModel);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        //注册  DEFAULT
        IDEDataSet _defaultDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDefaultDSModel");
        _defaultDSModel.init(this);
        this.registerDEDataSet(_defaultDSModel);
        //注册  CurNsjghysq
        IDEDataSet curNsjghysqDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQCurNsjghysqDSModel");
        curNsjghysqDSModel.init(this);
        this.registerDEDataSet(curNsjghysqDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        //注册  DEFAULT
        IDEDataQuery _defaultDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDefaultDQModel");
        _defaultDQModel.init(this);
        this.registerDEDataQuery(_defaultDQModel);
        //注册  CurNsjghysq
        IDEDataQuery curNsjghysqDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQCurNsjghysqDQModel");
        curNsjghysqDQModel.init(this);
        this.registerDEDataQuery(curNsjghysqDQModel);
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
        //注册  更新内设会议室使用开始状态
        IDELogic gXNSHYSSYKSZTLogicModel = (IDELogic)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQGXNSHYSSYKSZTLogicModel");
        gXNSHYSSYKSZTLogicModel.init(this);
        this.registerDELogic(gXNSHYSSYKSZTLogicModel);
        //注册  更新内设会议室使用结束状态
        IDELogic gXNSHYSSYJSZTLogicModel = (IDELogic)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQGXNSHYSSYJSZTLogicModel");
        gXNSHYSSYJSZTLogicModel.init(this);
        this.registerDELogic(gXNSHYSSYJSZTLogicModel);
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
        //注册  内设机构会议申请
        IDEWF nSJGHYSQDEWFModel =(IDEWF)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQNSJGHYSQDEWFModel");
        nSJGHYSQDEWFModel.init(this);
        this.registerDEWF(nSJGHYSQDEWFModel);

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
        //注册视图 内设机构会议申请实体表格视图
        this.registerPDTDEView("MDATAVIEW","32a18af3090322f4919d5e2dd967d533");
        //注册视图 内设机构会议申请实体移动端编辑视图（审核结束）
        this.registerPDTDEView("MOBEDITVIEW","8A7183EB-C24A-422B-9BA0-F6F28BA14A9D");
        //注册视图 内设机构会议申请实体移动端工作流编辑视图（分页关系）(内设机构会议申请)
        this.registerPDTDEView("MOBWFEDITVIEW:NSJGHYSQ:D","afcc4d5f32d7b21b0d9b8784c3b7137c");
        //注册视图 内设机构会议申请实体移动端工作流编辑视图（分页关系）(内设机构会议申请v1:参会领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:NSJGHYSQ:W:10","44393f605dca60970bbdb592691ec689");
        //注册视图 内设机构会议申请实体移动端工作流编辑视图（分页关系）(内设机构会议申请v1:承办处室负责人审核)
        this.registerPDTDEView("MOBWFEDITVIEW:NSJGHYSQ:W:20","612ca7d3afa14efafef738d0cd72d6da");
        //注册视图 内设机构会议申请实体移动端工作流编辑视图（分页关系）(内设机构会议申请v1:秘书处审核)
        this.registerPDTDEView("MOBWFEDITVIEW:NSJGHYSQ:W:30","2f04e7e7dd243732574da6d6ef9acd16");
        //注册视图 内设机构会议申请实体移动端工作流编辑视图（分页关系）(内设机构会议申请v1:院办负责人审核)
        this.registerPDTDEView("MOBWFEDITVIEW:NSJGHYSQ:W:40","aa8aa27c83983a252cedb0eb000f4a53");
        //注册视图 内设机构会议申请实体移动端工作流多数据视图(内设机构会议申请)
        this.registerPDTDEView("MOBWFMDATAVIEW:NSJGHYSQ:D","088a03eacad076d29254e44dbfb1d1ad");
        //注册视图 内设机构会议申请实体移动端工作流多数据视图(内设机构会议申请)
        this.registerPDTDEView("MOBWFMDATAVIEW:NSJGHYSQ:W","a85beec9dab1b3675dd63379881b1af2");
        //注册视图 内设机构会议申请实体数据多项选择视图
        this.registerPDTDEView("MPICKUPVIEW","df8f76d6055fa58e9699a9e75607defd");
        //注册视图 内设机构会议申请实体数据选择视图
        this.registerPDTDEView("PICKUPVIEW","3aa86a2b5898799b9d4d46d08b9a8ae3");
        //注册视图 内设机构会议申请实体数据重定向视图
        this.registerPDTDEView("REDIRECTVIEW","fc42e8f19ab28975ce31ff70c46c2bc7");
        //注册视图 内设机构会议申请实体工作流视图（分页关系）(内设机构会议申请)
        this.registerPDTDEView("WFEDITVIEW:NSJGHYSQ:D","e66d2639f695b1575adbeef9e0cf6838");
        //注册视图 内设机构会议申请实体工作流视图（分页关系）(内设机构会议申请v1:参会领导审核)
        this.registerPDTDEView("WFEDITVIEW:NSJGHYSQ:W:10","6e48eac40dd4e0b131ad1e1d0304bbf1");
        //注册视图 内设机构会议申请实体工作流视图（分页关系）(内设机构会议申请v1:承办处室负责人审核)
        this.registerPDTDEView("WFEDITVIEW:NSJGHYSQ:W:20","c72d14ce8a34753e7953d80f4b5af399");
        //注册视图 内设机构会议申请实体工作流视图（分页关系）(内设机构会议申请v1:秘书处审核)
        this.registerPDTDEView("WFEDITVIEW:NSJGHYSQ:W:30","38c94c4457859737d31df83f9d1e10ea");
        //注册视图 内设机构会议申请实体工作流视图（分页关系）(内设机构会议申请v1:院办负责人审核)
        this.registerPDTDEView("WFEDITVIEW:NSJGHYSQ:W:40","cf1bdf7c72da02f50bbd81a951b29f09");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:D","04acf38e217379238c68e7931fadfb15");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:未提交)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:D:10","1c4185718371a247edbe2f726e8e482c");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:审批中)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:D:20","4db9d7c7939e7f5efd3456f4fe07a1d1");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:已完成)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:D:30","0d5aaca250b3cb615b5573083e0aa04c");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:已取消)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:D:40","922b4f747ba67a8230f67826a73a55b5");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:W","cf8261bce0765e7e020d369ed4363ec0");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:参会领导审核)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:W:10","00901fb0f59aae72b9b964dfd11364c3");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:承办处室负责人审核)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:W:20","c776fb2913ac063529fe45181b8b7280");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:秘书处审核)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:W:30","15347a1fce2cbcb7109902cb46d9986f");
        //注册视图 内设机构会议申请实体工作流表格视图(内设机构会议申请:院办负责人审核)
        this.registerPDTDEView("WFMDATAVIEW:NSJGHYSQ:W:40","2fea32caf4b3a4703b811e8ee5987346");
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

        //放入属性 OA_NSJGHYSQNAME - 内设机构会议申请名称
        if(true) {
            DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
            deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
            deDataSetCondImpl.setCondOp(ICondition.CONDOP_LIKE);
            deDataSetCondImpl.setDEFName(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQNAME);
            deDataSetCondImpl.setCondValue(strQuickSearch);
            groupCondImpl.addChildDEDataQueryCond(deDataSetCondImpl);
        }
    }
}