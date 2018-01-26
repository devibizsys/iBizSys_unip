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

import com.sa.unip.srv.xxtz.entity.OA_TZGG;
import com.sa.unip.srv.xxtz.service.OA_TZGGService;


public class OA_TZGGFSTZGGXXUIActionModel extends net.ibizsys.paas.demodel.DEUIActionModelBase<OA_TZGG> {

    private static final Log log = LogFactory.getLog(OA_TZGGFSTZGGXXUIActionModel.class);

    public OA_TZGGFSTZGGXXUIActionModel() {
        super();

        this.setId("5640CF46-D5DC-4AD1-A20F-F313F6A42A6D");
        this.setName("FSTZGGXX");
        this.setActionTarget("SINGLEKEY");
        this.setDEActionName("FSTZGG");
        this.setCloseEditView(true);
    }

}