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

import com.sa.unip.srv.ggsj.demodel.APIXTFJLJDEModel;
import com.sa.unip.srv.ggsj.entity.APIXTFJLJ;
/**
 * 实体[APIXTFJLJ] DAO对象
 */
@Repository
public class APIXTFJLJDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<APIXTFJLJ> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public APIXTFJLJDAO() {
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
        return "com.sa.unip.srv.ggsj.dao.APIXTFJLJDAO";
    }

    private APIXTFJLJDEModel aPIXTFJLJDEModel;

    /**
    * 获取实体[APIXTFJLJ]模型对象
    * @return
    */
    public  APIXTFJLJDEModel getAPIXTFJLJDEModel() {
        if(this.aPIXTFJLJDEModel==null) {
            try {
                this.aPIXTFJLJDEModel = (APIXTFJLJDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ggsj.demodel.APIXTFJLJDEModel");
            } catch(Exception ex) {
            }
        }
        return this.aPIXTFJLJDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getAPIXTFJLJDEModel();
    }



}