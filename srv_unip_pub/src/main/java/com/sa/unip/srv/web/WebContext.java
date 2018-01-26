/**
 *  iBizSys 5.0 用户自定义代码
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.web;


import net.ibizsys.paas.web.IWebContext;
import java.util.ArrayList;

/**
 * @author lionlau
 *
 */
public class WebContext extends net.ibizsys.paas.web.WebContext {
    @Override
    public void login(String strLoginName) throws Exception {

        super.login(strLoginName);

    }


    @Override
    public void logout(boolean bReleaseSession) {
        //设置用户标识
        //this.setSessionValue(IWebContext.PERSONID,null);
        //设置名称
        //this.setSessionValue(IWebContext.UESRNAME,null);
        //设置组织标识
        //this.setSessionValue(IWebContext.ORGID,null);
        //设置组织名称
        //this.setSessionValue(IWebContext.ORGNAME,null);

        super.logout(bReleaseSession);
    }
}