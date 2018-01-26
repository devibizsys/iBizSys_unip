/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.demodel;


import java.io.Serializable;
import java.util.ArrayList;
import org.hibernate.SessionFactory;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.core.IDEDataSetCond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
import com.sa.unip.srv.UniPSampleSysModel;


import com.sa.unip.srv.subsys.service.OrgSectorService;
import net.ibizsys.psrt.srv.common.dao.OrgSectorDAO;
import net.ibizsys.psrt.srv.common.entity.OrgSector;


/**
 * 组织部门 实体模型
 * 注意，此文件不能修改
 */
public class OrgSectorDEModel extends net.ibizsys.psrt.srv.common.demodel.OrgSectorDEModel  {

    public OrgSectorDEModel() throws Exception {
        super();

        DEModelGlobal.registerDEModel("com.sa.unip.srv.subsys.demodel.OrgSectorDEModel",this);
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

    /**
     * 获取实体[OrgSector]模型对象
     * @return
     * @throws Exception
     */
    public static OrgSectorDEModel getInstance() throws Exception {
        return (OrgSectorDEModel)DEModelGlobal.getDEModel(OrgSectorDEModel.class);
    }

    @Override
    public String getServiceId() {
        return "com.sa.unip.srv.subsys.service.OrgSectorService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        super.prepareDEDataSets();
        //注册  UX_ORGSECTORXJBM
        IDEDataSet uX_ORGSECTORXJBMDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgSectorUX_ORGSECTORXJBMDSModel");
        uX_ORGSECTORXJBMDSModel.init(this);
        this.registerDEDataSet(uX_ORGSECTORXJBMDSModel);
        //注册  UX_ORGSECTORSPEC
        IDEDataSet uX_ORGSECTORSPECDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgSectorUX_ORGSECTORSPECDSModel");
        uX_ORGSECTORSPECDSModel.init(this);
        this.registerDEDataSet(uX_ORGSECTORSPECDSModel);
        //注册  DQCBBM
        IDEDataSet dQCBBMDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgSectorDQCBBMDSModel");
        dQCBBMDSModel.init(this);
        this.registerDEDataSet(dQCBBMDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        super.prepareDEDataQueries();
        //注册  UX_ORGSECTORSPEC
        IDEDataQuery uX_ORGSECTORSPECDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgSectorUX_ORGSECTORSPECDQModel");
        uX_ORGSECTORSPECDQModel.init(this);
        this.registerDEDataQuery(uX_ORGSECTORSPECDQModel);
        //注册  DQCBBM
        IDEDataQuery dQCBBMDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgSectorDQCBBMDQModel");
        dQCBBMDQModel.init(this);
        this.registerDEDataQuery(dQCBBMDQModel);
        //注册  UX_ORGSECTORXJBM
        IDEDataQuery uX_ORGSECTORXJBMDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgSectorUX_ORGSECTORXJBMDQModel");
        uX_ORGSECTORXJBMDQModel.init(this);
        this.registerDEDataQuery(uX_ORGSECTORXJBMDQModel);
    }

}