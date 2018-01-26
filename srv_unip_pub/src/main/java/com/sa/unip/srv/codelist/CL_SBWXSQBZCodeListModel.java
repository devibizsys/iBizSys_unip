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


@CodeList(id="F638B199-D953-4C07-AA6F-F92BE16931BE",name="设备维修申请步骤",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="部门领导审核",realtext="部门领导审核")
    ,@CodeItem(value="20",text="资产管理处审核",realtext="资产管理处审核")
})



/**
 * 静态代码表[设备维修申请步骤]模型类
 */
public class CL_SBWXSQBZCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  部门领导审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  资产管理处审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";

    public CL_SBWXSQBZCodeListModel() {
        super();
        this.initAnnotation(CL_SBWXSQBZCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_SBWXSQBZCodeListModel", this);
    }

}