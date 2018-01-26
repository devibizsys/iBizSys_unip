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

@DEDataSet(id="BACB47DF-A776-4154-ADDB-84A350418A83",name="DQCBBM",queries= {
    @DEDataSetQuery(queryid="7AABE27C-74A1-4D60-963F-8DFE17BE446E",queryname="DQCBBM")
})

public class OrgSectorDQCBBMDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgSectorDQCBBMDSModel() {
        super();
        this.initAnnotation(OrgSectorDQCBBMDSModel.class);
    }




}