/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xtgl.dao;

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

import com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel;
import com.sa.unip.srv.xtgl.entity.OA_CZRZ;
/**
 * 实体[OA_CZRZ] DAO对象
 */
@Repository
public class OA_CZRZDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<OA_CZRZ> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public OA_CZRZDAO() {
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
        return "com.sa.unip.srv.xtgl.dao.OA_CZRZDAO";
    }

    private OA_CZRZDEModel oA_CZRZDEModel;

    /**
    * 获取实体[OA_CZRZ]模型对象
    * @return
    */
    public  OA_CZRZDEModel getOA_CZRZDEModel() {
        if(this.oA_CZRZDEModel==null) {
            try {
                this.oA_CZRZDEModel = (OA_CZRZDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CZRZDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_CZRZDEModel();
    }



}