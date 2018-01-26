/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.ywsp.ctrlhandler;


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

public class OA_CPMJSQMainEditFormOa_clnameHandler extends net.ibizsys.paas.ctrlhandler.PickupTextFormItemHandlerBase {

    public OA_CPMJSQMainEditFormOa_clnameHandler()  {
        super();
    }



    /* (non-Javadoc)
    * @see net.ibizsys.paas.ctrlhandler.PickupTextFormItemHandlerBase#getPickupDEService()
     */
    @Override
    protected IService getPickupDEService() throws Exception {
        return (IService)ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_CLService",this.getViewController().getSessionFactory());
    }

    /**
    * 获取拾取的实体数据集合名称
     * @return
     */
    @Override
    protected String getPickupDEDataSetName() {
        return "DEFAULT";
    }

    /**
    * 获取拾取的实体自填模式名称
     * @return
     */
    protected String getPickupDEACModeName() {
        //"DEFAULT";
        return "3d6b755c3692debb8fd539de77b21099";
    }


}