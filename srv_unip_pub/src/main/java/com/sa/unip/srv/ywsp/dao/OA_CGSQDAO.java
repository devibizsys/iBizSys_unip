/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.dao;

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

import com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel;
import com.sa.unip.srv.ywsp.entity.OA_CGSQ;
/**
 * 实体[OA_CGSQ] DAO对象
 */
@Repository
public class OA_CGSQDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<OA_CGSQ> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_CURCGSQ = "CurCgsq";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public OA_CGSQDAO() {
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
        return "com.sa.unip.srv.ywsp.dao.OA_CGSQDAO";
    }

    private OA_CGSQDEModel oA_CGSQDEModel;

    /**
    * 获取实体[OA_CGSQ]模型对象
    * @return
    */
    public  OA_CGSQDEModel getOA_CGSQDEModel() {
        if(this.oA_CGSQDEModel==null) {
            try {
                this.oA_CGSQDEModel = (OA_CGSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CGSQDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_CGSQDEModel();
    }



}