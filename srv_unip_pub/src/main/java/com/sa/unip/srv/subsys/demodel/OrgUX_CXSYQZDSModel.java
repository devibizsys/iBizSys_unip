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

@DEDataSet(id="FD89C242-3F17-4088-A933-80818904FA5B",name="UX_CXSYQZ",queries= {
    @DEDataSetQuery(queryid="E4968979-49A5-4143-A468-8E651E5AA3EA",queryname="UX_CXSYQZ")
})

public class OrgUX_CXSYQZDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_CXSYQZDSModel() {
        super();
        this.initAnnotation(OrgUX_CXSYQZDSModel.class);
    }




}