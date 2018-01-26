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

@DEDataSet(id="09372D0E-A337-4F7E-BC31-DFBC79FA8CDC",name="AHUX_All",queries= {
    @DEDataSetQuery(queryid="4DB7A146-4F3B-42B7-9E6E-2FCA2F37A940",queryname="AHUX_All")
})

public class OrgAHUX_AllDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgAHUX_AllDSModel() {
        super();
        this.initAnnotation(OrgAHUX_AllDSModel.class);
    }




}