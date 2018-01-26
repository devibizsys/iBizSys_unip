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

@DEDataSet(id="3FBBAFF0-C9FB-418B-8740-D99FDC9AF033",name="QLCBRXZGL",queries= {
    @DEDataSetQuery(queryid="AFF79AB3-5D7C-40A4-B305-D022F6A84C21",queryname="QLCBRXZGL")
})

public class OrgUserQLCBRXZGLDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUserQLCBRXZGLDSModel() {
        super();
        this.initAnnotation(OrgUserQLCBRXZGLDSModel.class);
    }




}