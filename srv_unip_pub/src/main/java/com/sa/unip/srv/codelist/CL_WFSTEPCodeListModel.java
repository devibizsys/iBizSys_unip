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


@CodeList(id="B171DD69-DEA4-4028-BE1F-D358990AAAC0",name="工作流步骤（通用）",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="部门领导审核",realtext="部门领导审核")
    ,@CodeItem(value="20",text="承办处领导审核",realtext="承办处领导审核")
})



/**
 * 静态代码表[工作流步骤（通用）]模型类
 */
public class CL_WFSTEPCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  部门领导审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  承办处领导审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";

    public CL_WFSTEPCodeListModel() {
        super();
        this.initAnnotation(CL_WFSTEPCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel", this);
    }

}