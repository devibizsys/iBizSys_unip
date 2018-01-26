/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.dao;

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

import com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel;
import com.sa.unip.srv.jcsj.entity.OA_ZSK;
/**
 * 实体[OA_ZSK] DAO对象
 */
@Repository
public class OA_ZSKDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<OA_ZSK> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public OA_ZSKDAO() {
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
        return "com.sa.unip.srv.jcsj.dao.OA_ZSKDAO";
    }

    private OA_ZSKDEModel oA_ZSKDEModel;

    /**
    * 获取实体[OA_ZSK]模型对象
    * @return
    */
    public  OA_ZSKDEModel getOA_ZSKDEModel() {
        if(this.oA_ZSKDEModel==null) {
            try {
                this.oA_ZSKDEModel = (OA_ZSKDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_ZSKDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_ZSKDEModel();
    }



}