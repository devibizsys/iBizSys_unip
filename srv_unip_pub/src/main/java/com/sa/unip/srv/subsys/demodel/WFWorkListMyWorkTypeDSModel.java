/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.demodel;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="4CE3C0E8-48A6-4473-8035-A72D107DD8FC",name="MyWorkType",queries= {
    @DEDataSetQuery(queryid="55DFC0D2-61BE-4A53-A96B-B549D90CD945",queryname="MyWorkList")
})

public class WFWorkListMyWorkTypeDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public WFWorkListMyWorkTypeDSModel() {
        super();
        this.setEnableGroup(true);
        this.initAnnotation(WFWorkListMyWorkTypeDSModel.class);
    }

    /**
      * 准备分组参数
      * @throws Exception
      */
    @Override
    protected void prepareDEDataSetGroupParams() throws Exception {

        //注册 WFWORKFLOWNAME
        DEDataSetGroupParamModel paramModel0 = new DEDataSetGroupParamModel();
        paramModel0.setName("WFWORKFLOWNAME");
        paramModel0.setEnableGroup(true);
        paramModel0.setGroupFields(new String[] { "WFWORKFLOWNAME" });
        paramModel0.init(this);
        this.registerDEDataSetGroupParam(paramModel0);
        //注册 WFWORKFLOWID
        DEDataSetGroupParamModel paramModel1 = new DEDataSetGroupParamModel();
        paramModel1.setName("WFWORKFLOWID");
        paramModel1.setEnableGroup(true);
        paramModel1.setGroupFields(new String[] { "WFWORKFLOWID" });
        paramModel1.init(this);
        this.registerDEDataSetGroupParam(paramModel1);
        super.prepareDEDataSetGroupParams();
    }



}