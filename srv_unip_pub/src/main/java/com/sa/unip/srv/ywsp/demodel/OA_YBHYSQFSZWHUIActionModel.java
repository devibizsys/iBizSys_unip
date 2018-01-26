/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


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

import com.sa.unip.srv.ywsp.entity.OA_YBHYSQ;
import com.sa.unip.srv.ywsp.service.OA_YBHYSQService;


public class OA_YBHYSQFSZWHUIActionModel extends net.ibizsys.paas.demodel.DEUIActionModelBase<OA_YBHYSQ> {

    private static final Log log = LogFactory.getLog(OA_YBHYSQFSZWHUIActionModel.class);

    public OA_YBHYSQFSZWHUIActionModel() {
        super();

        this.setId("C9E8198C-41B5-4D27-94C4-FB57386A1FD4");
        this.setName("FSZWH");
        this.setActionTarget("SINGLEKEY");
        this.setDEActionName("FSZWHTZ");
    }

}