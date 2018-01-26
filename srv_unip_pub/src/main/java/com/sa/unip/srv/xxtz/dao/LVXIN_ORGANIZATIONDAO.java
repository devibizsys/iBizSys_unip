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

import com.sa.unip.srv.xxtz.demodel.LVXIN_ORGANIZATIONDEModel;
import com.sa.unip.srv.xxtz.entity.LVXIN_ORGANIZATION;
/**
 * 实体[LVXIN_ORGANIZATION] DAO对象
 */
@Repository
public class LVXIN_ORGANIZATIONDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<LVXIN_ORGANIZATION> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";

    public LVXIN_ORGANIZATIONDAO() {
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
        return "com.sa.unip.srv.xxtz.dao.LVXIN_ORGANIZATIONDAO";
    }

    private LVXIN_ORGANIZATIONDEModel lVXIN_ORGANIZATIONDEModel;

    /**
    * 获取实体[LVXIN_ORGANIZATION]模型对象
    * @return
    */
    public  LVXIN_ORGANIZATIONDEModel getLVXIN_ORGANIZATIONDEModel() {
        if(this.lVXIN_ORGANIZATIONDEModel==null) {
            try {
                this.lVXIN_ORGANIZATIONDEModel = (LVXIN_ORGANIZATIONDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.LVXIN_ORGANIZATIONDEModel");
            } catch(Exception ex) {
            }
        }
        return this.lVXIN_ORGANIZATIONDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getLVXIN_ORGANIZATIONDEModel();
    }



}