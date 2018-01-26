/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.dao;

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

import com.sa.unip.srv.ggsj.demodel.GG_DBDEModel;
import com.sa.unip.srv.ggsj.entity.GG_DB;
/**
 * 实体[GG_DB] DAO对象
 */
@Repository
public class GG_DBDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<GG_DB> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public GG_DBDAO() {
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
        return "com.sa.unip.srv.ggsj.dao.GG_DBDAO";
    }

    private GG_DBDEModel gG_DBDEModel;

    /**
    * 获取实体[GG_DB]模型对象
    * @return
    */
    public  GG_DBDEModel getGG_DBDEModel() {
        if(this.gG_DBDEModel==null) {
            try {
                this.gG_DBDEModel = (GG_DBDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ggsj.demodel.GG_DBDEModel");
            } catch(Exception ex) {
            }
        }
        return this.gG_DBDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getGG_DBDEModel();
    }



}