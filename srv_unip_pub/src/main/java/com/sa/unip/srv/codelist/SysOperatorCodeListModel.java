/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.codelist;


import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;

import net.ibizsys.paas.sysmodel.DynamicCodeListModelBase;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;


@CodeList(id="14030ff9a11f791829108b42be032ab2",name="云系统操作者",type="DYNAMIC",userscope=false,emptytext="未定义")

@CodeItems({
})



/**
 * 动态代码表[云系统操作者]模型类
 */
public class SysOperatorCodeListModel extends net.ibizsys.paas.sysmodel.SysOperatorCodeListModelBase  {


    public SysOperatorCodeListModel() {
        super();
        this.initAnnotation(SysOperatorCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.SysOperatorCodeListModel", this);
    }

}