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

import com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel;
import com.sa.unip.srv.ywsp.entity.OA_CHRY;
/**
 * 实体[OA_CHRY] DAO对象
 */
@Repository
public class OA_CHRYDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<OA_CHRY> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_YCH2 = "YCH2";
    public static final String DATAQUERY_WCH = "WCH";
    public static final String DATAQUERY_YCDJ = "YCDJ";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_YCH = "YCH";
    public static final String DATAQUERY_YQJ = "YQJ";

    public OA_CHRYDAO() {
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
        return "com.sa.unip.srv.ywsp.dao.OA_CHRYDAO";
    }

    private OA_CHRYDEModel oA_CHRYDEModel;

    /**
    * 获取实体[OA_CHRY]模型对象
    * @return
    */
    public  OA_CHRYDEModel getOA_CHRYDEModel() {
        if(this.oA_CHRYDEModel==null) {
            try {
                this.oA_CHRYDEModel = (OA_CHRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CHRYDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOA_CHRYDEModel();
    }



}