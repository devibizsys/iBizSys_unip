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

import com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel;
import com.sa.unip.srv.ywsp.entity.OA_JPYD;
/**
 * 实体[OA_JPYD] DAO对象
 */
@Repository
public class OA_JPYDDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<OA_JPYD> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_CURJPYD = "CurJpyd";

    public OA_JPYDDAO() {
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
        return "com.sa.unip.srv.ywsp.dao.OA_JPYDDAO";
    }

    private OA_JPYDDEModel oA_JPYDDEModel;

    /**
    * 获取实体[OA_JPYD]模型对象
    * @return
    */
    public  OA_JPYDDEModel getOA_JPYDDEModel() {
        if(this.oA_JPYDDEModel==null) {
            try {
                this.oA_JPYDDEModel = (OA_JPYDDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_JPYDDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_JPYDDEModel();
    }



}