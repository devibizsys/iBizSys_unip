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

import com.sa.unip.srv.xxtz.demodel.LVXIN_SEQUENCEDEModel;
import com.sa.unip.srv.xxtz.entity.LVXIN_SEQUENCE;
/**
 * 实体[LVXIN_SEQUENCE] DAO对象
 */
@Repository
public class LVXIN_SEQUENCEDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<LVXIN_SEQUENCE> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";

    public LVXIN_SEQUENCEDAO() {
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
        return "com.sa.unip.srv.xxtz.dao.LVXIN_SEQUENCEDAO";
    }

    private LVXIN_SEQUENCEDEModel lVXIN_SEQUENCEDEModel;

    /**
    * 获取实体[LVXIN_SEQUENCE]模型对象
    * @return
    */
    public  LVXIN_SEQUENCEDEModel getLVXIN_SEQUENCEDEModel() {
        if(this.lVXIN_SEQUENCEDEModel==null) {
            try {
                this.lVXIN_SEQUENCEDEModel = (LVXIN_SEQUENCEDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.LVXIN_SEQUENCEDEModel");
            } catch(Exception ex) {
            }
        }
        return this.lVXIN_SEQUENCEDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getLVXIN_SEQUENCEDEModel();
    }



}