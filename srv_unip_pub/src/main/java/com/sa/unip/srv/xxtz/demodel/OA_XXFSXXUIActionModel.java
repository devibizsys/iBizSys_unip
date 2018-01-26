/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;


import java.util.List;
import java.util.HashMap;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.service.IService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.xxtz.entity.OA_XX;
import com.sa.unip.srv.xxtz.service.OA_XXService;


public class OA_XXFSXXUIActionModel extends net.ibizsys.paas.demodel.DEUIActionModelBase<OA_XX> {

    private static final Log log = LogFactory.getLog(OA_XXFSXXUIActionModel.class);

    public OA_XXFSXXUIActionModel() {
        super();

        this.setId("3835122B-0810-44CA-8171-CE8CDD6B2B7D");
        this.setName("FSXX");
        this.setActionTarget("SINGLEKEY");
        this.setDEActionName("FSXX");
        this.setCloseEditView(true);
    }

}