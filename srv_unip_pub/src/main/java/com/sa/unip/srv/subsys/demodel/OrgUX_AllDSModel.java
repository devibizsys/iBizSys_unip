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

@DEDataSet(id="64FBA41D-030D-4763-AEF6-C759E2EAFE6B",name="UX_All",queries= {
    @DEDataSetQuery(queryid="FC873C60-95D3-4C95-AB7A-A8C65B3C3F5C",queryname="UX_All")
})

public class OrgUX_AllDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_AllDSModel() {
        super();
        this.initAnnotation(OrgUX_AllDSModel.class);
    }




}