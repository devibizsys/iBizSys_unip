/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.dao;

import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.core.IDEDBCallContext;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.entity.IEntity;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import com.sa.unip.srv.xxtz.demodel.LVXIN_GROUPDEModel;
import com.sa.unip.srv.xxtz.entity.LVXIN_GROUP;
/**
 * 实体[LVXIN_GROUP] DAO对象
 */
@Repository
public class LVXIN_GROUPDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<LVXIN_GROUP> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public LVXIN_GROUPDAO() {
        super();

    }

    @PostConstruct
    public void postConstruct() throws Exception {
        DAOGlobal.registerDAO(getDAOId(), this);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDAOId()
     */
    @Override
    protected String getDAOId() {
        return "com.sa.unip.srv.xxtz.dao.LVXIN_GROUPDAO";
    }

    private LVXIN_GROUPDEModel lVXIN_GROUPDEModel;

    /**
    * 获取实体[LVXIN_GROUP]模型对象
    * @return
    */
    public  LVXIN_GROUPDEModel getLVXIN_GROUPDEModel() {
        if(this.lVXIN_GROUPDEModel==null) {
            try {
                this.lVXIN_GROUPDEModel = (LVXIN_GROUPDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.LVXIN_GROUPDEModel");
            } catch(Exception ex) {
            }
        }
        return this.lVXIN_GROUPDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getLVXIN_GROUPDEModel();
    }



}