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


import com.sa.unip.srv.subsys.service.WFWorkListService;
import net.ibizsys.psrt.srv.wf.dao.WFWorkListDAO;
import net.ibizsys.psrt.srv.wf.entity.WFWorkList;


/**
 * 工作流工作列表 实体模型
 * 注意，此文件不能修改
 */
public class WFWorkListDEModel extends net.ibizsys.psrt.srv.wf.demodel.WFWorkListDEModel  {

    public WFWorkListDEModel() throws Exception {
        super();

        DEModelGlobal.registerDEModel("com.sa.unip.srv.subsys.demodel.WFWorkListDEModel",this);
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
     * 获取实体[WFWorkList]模型对象
     * @return
     * @throws Exception
     */
    public static WFWorkListDEModel getInstance() throws Exception {
        return (WFWorkListDEModel)DEModelGlobal.getDEModel(WFWorkListDEModel.class);
    }

    @Override
    public String getServiceId() {
        return "com.sa.unip.srv.subsys.service.WFWorkListService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        super.prepareDEDataSets();
        //注册  MyWorkList2
        IDEDataSet myWorkList2DSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.WFWorkListMyWorkList2DSModel");
        myWorkList2DSModel.init(this);
        this.registerDEDataSet(myWorkList2DSModel);
        //注册  MyWorkType
        IDEDataSet myWorkTypeDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.WFWorkListMyWorkTypeDSModel");
        myWorkTypeDSModel.init(this);
        this.registerDEDataSet(myWorkTypeDSModel);
        //注册  MyWorkList
        IDEDataSet myWorkListDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.WFWorkListMyWorkListDSModel");
        myWorkListDSModel.init(this);
        this.registerDEDataSet(myWorkListDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        super.prepareDEDataQueries();
        //注册  MyWorkList2
        IDEDataQuery myWorkList2DQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.WFWorkListMyWorkList2DQModel");
        myWorkList2DQModel.init(this);
        this.registerDEDataQuery(myWorkList2DQModel);
        //注册  MyWorkList
        IDEDataQuery myWorkListDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.WFWorkListMyWorkListDQModel");
        myWorkListDQModel.init(this);
        this.registerDEDataQuery(myWorkListDQModel);
    }

}