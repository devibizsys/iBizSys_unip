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

import com.sa.unip.srv.xxtz.demodel.LVXIN_COMMENTDEModel;
import com.sa.unip.srv.xxtz.entity.LVXIN_COMMENT;
/**
 * 实体[LVXIN_COMMENT] DAO对象
 */
@Repository
public class LVXIN_COMMENTDAO extends com.sa.unip.srv.UniPSampleSysDAOBase<LVXIN_COMMENT> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public LVXIN_COMMENTDAO() {
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
        return "com.sa.unip.srv.xxtz.dao.LVXIN_COMMENTDAO";
    }

    private LVXIN_COMMENTDEModel lVXIN_COMMENTDEModel;

    /**
    * 获取实体[LVXIN_COMMENT]模型对象
    * @return
    */
    public  LVXIN_COMMENTDEModel getLVXIN_COMMENTDEModel() {
        if(this.lVXIN_COMMENTDEModel==null) {
            try {
                this.lVXIN_COMMENTDEModel = (LVXIN_COMMENTDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.LVXIN_COMMENTDEModel");
            } catch(Exception ex) {
            }
        }
        return this.lVXIN_COMMENTDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getLVXIN_COMMENTDEModel();
    }



}