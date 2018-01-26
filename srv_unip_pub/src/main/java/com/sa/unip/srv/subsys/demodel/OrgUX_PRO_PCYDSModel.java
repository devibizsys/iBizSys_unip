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

@DEDataSet(id="53185964-5FED-4F17-BB83-2D1CC717D0B0",name="UX_PRO_PCY",queries= {
    @DEDataSetQuery(queryid="E1A91434-0AE8-46B7-BDA4-8EC75C4E4878",queryname="UX_PRO_PCY")
})

public class OrgUX_PRO_PCYDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_PRO_PCYDSModel() {
        super();
        this.initAnnotation(OrgUX_PRO_PCYDSModel.class);
    }




}