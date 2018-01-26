/**
 *  iBizSys 5.0 用户自定义代码
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv;

import net.ibizsys.paas.entity.IEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 系统[UniPSample] DAO对象基类
 *
 * @param <ET>
 */
public abstract class UniPSampleSysDAOBase<ET extends IEntity> extends net.ibizsys.paas.dao.DAOBase<ET> {
    private static final Log log = LogFactory.getLog(UniPSampleSysDAOBase.class);
    public UniPSampleSysDAOBase() {
        super();

    }


}