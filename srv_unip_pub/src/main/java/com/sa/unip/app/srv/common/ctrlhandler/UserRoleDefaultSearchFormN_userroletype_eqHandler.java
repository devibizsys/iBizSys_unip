/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;

public class UserRoleDefaultSearchFormN_userroletype_eqHandler extends net.ibizsys.paas.ctrlhandler.CodeListFormItemHandlerBase {

    public UserRoleDefaultSearchFormN_userroletype_eqHandler()  {
        super();
    }



    /* (non-Javadoc)
    * @see net.ibizsys.paas.ctrlhandler.CodeListFormItemHandlerBase#getCodeList()
     */
    @Override
    protected ICodeList getCodeList() throws Exception {

        return (ICodeList)CodeListGlobal.getCodeList("net.ibizsys.psrt.srv.codelist.UserRoleTypeCodeListModel");
    }
}