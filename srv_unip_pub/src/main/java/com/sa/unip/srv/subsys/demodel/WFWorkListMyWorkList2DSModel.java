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

@DEDataSet(id="0BF3CE61-CEDA-4F92-A37F-D82FDFC2C0BD",name="MyWorkList2",queries= {
    @DEDataSetQuery(queryid="0BF3CE61-CEDA-4F92-A37F-D82FDFC2C0BD",queryname="MyWorkList2")
})

public class WFWorkListMyWorkList2DSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public WFWorkListMyWorkList2DSModel() {
        super();
        this.initAnnotation(WFWorkListMyWorkList2DSModel.class);
    }




}