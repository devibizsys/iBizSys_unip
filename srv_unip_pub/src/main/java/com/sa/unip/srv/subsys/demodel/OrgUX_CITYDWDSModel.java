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

@DEDataSet(id="9402F33D-6F16-4E01-A43C-1053DD15EB3F",name="UX_CITYDW",queries= {
    @DEDataSetQuery(queryid="74FBDBBE-9220-4609-88BE-18ED559235FF",queryname="UX_CITYDW")
})

public class OrgUX_CITYDWDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_CITYDWDSModel() {
        super();
        this.initAnnotation(OrgUX_CITYDWDSModel.class);
    }




}