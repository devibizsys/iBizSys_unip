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

@DEDataSet(id="DDFBA6E7-489D-438E-A046-AC504FE46F1D",name="UX_CITY",queries= {
    @DEDataSetQuery(queryid="EBDB781D-6A7D-442E-BF1B-CB84A6F19050",queryname="UX_CITY")
})

public class OrgUX_CITYDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_CITYDSModel() {
        super();
        this.initAnnotation(OrgUX_CITYDSModel.class);
    }




}