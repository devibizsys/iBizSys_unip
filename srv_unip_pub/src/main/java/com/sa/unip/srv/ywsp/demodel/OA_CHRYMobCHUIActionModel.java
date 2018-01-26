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


public class OA_CHRYMobCHUIActionModel extends net.ibizsys.paas.demodel.DEUIActionModelBase<OA_CHRY> {

    private static final Log log = LogFactory.getLog(OA_CHRYMobCHUIActionModel.class);

    public OA_CHRYMobCHUIActionModel() {
        super();

        this.setId("15252C7B-8878-437E-AA3D-4C694251908F");
        this.setName("MobCH");
        this.setActionTarget("SINGLEKEY");
        this.setDEActionName("CJHY");
        this.setReloadData(true);
        this.setCloseEditView(true);
        this.setSuccessMsg("参会成功！");
    }

}