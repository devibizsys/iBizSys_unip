/**
 *  iBizSys 5.0 用户自定义代码
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv;

import net.ibizsys.paas.entity.IEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 系统 UniPSample 工作流自定义角色对象基类
 *
 * @param <ET>
 */
public abstract class UniPSampleSysWFCustomRoleModelBase extends net.ibizsys.pswf.core.WFCustomRoleModelBase {
    private static final Log log = LogFactory.getLog(UniPSampleSysWFCustomRoleModelBase.class);
    public UniPSampleSysWFCustomRoleModelBase() {
        super();

    }


}