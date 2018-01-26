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

@DEDataSet(id="FA871FD3-7804-448E-AB35-C74999CFAA94",name="UX_All_CDOELIST",queries= {
    @DEDataSetQuery(queryid="44B39E1D-6F50-4A42-89A2-A0DB55C400E9",queryname="UX_All_CDOELIST")
})

public class OrgUX_All_CDOELISTDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_All_CDOELISTDSModel() {
        super();
        this.initAnnotation(OrgUX_All_CDOELISTDSModel.class);
    }




}