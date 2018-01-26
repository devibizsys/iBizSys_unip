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

import com.sa.unip.srv.ywsp.entity.OA_CHRY;
import com.sa.unip.srv.ywsp.service.OA_CHRYService;


public class OA_CHRYCHUIActionModel extends net.ibizsys.paas.demodel.DEUIActionModelBase<OA_CHRY> {

    private static final Log log = LogFactory.getLog(OA_CHRYCHUIActionModel.class);

    public OA_CHRYCHUIActionModel() {
        super();

        this.setId("0BE457DD-6931-49F1-A4E2-3BFA9022E68B");
        this.setName("CH");
        this.setActionTarget("SINGLEKEY");
        this.setDEActionName("CJHY");
        this.setReloadData(true);
        this.setSuccessMsg("参会成功！");
    }

}