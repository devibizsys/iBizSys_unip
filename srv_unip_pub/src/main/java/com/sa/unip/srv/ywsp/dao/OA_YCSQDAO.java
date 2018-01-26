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

import com.sa.unip.srv.ywsp.demodel.OA_YCSQDEModel;
import com.sa.unip.srv.ywsp.entity.OA_YCSQ;
/**
 * 实体[OA_YCSQ] DAO对象
 */
@Repository
public class OA_YCSQDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<OA_YCSQ> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_CURYCSQ = "CurYcsq";

    public OA_YCSQDAO() {
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
        return "com.sa.unip.srv.ywsp.dao.OA_YCSQDAO";
    }

    private OA_YCSQDEModel oA_YCSQDEModel;

    /**
    * 获取实体[OA_YCSQ]模型对象
    * @return
    */
    public  OA_YCSQDEModel getOA_YCSQDEModel() {
        if(this.oA_YCSQDEModel==null) {
            try {
                this.oA_YCSQDEModel = (OA_YCSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_YCSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_YCSQDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_YCSQDEModel();
    }



}