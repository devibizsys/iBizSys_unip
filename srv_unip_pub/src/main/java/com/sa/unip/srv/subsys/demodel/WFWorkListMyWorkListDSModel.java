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

@DEDataSet(id="55DFC0D2-61BE-4A53-A96B-B549D90CD945",name="MyWorkList",queries= {
    @DEDataSetQuery(queryid="55DFC0D2-61BE-4A53-A96B-B549D90CD945",queryname="MyWorkList")
})

public class WFWorkListMyWorkListDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public WFWorkListMyWorkListDSModel() {
        super();
        this.initAnnotation(WFWorkListMyWorkListDSModel.class);
    }




}