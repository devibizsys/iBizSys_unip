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


@CodeList(id="04d9f3b1fba109da46d2381b8c8c86a0",name="统一资源类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="PAGE",text="内置页面",realtext="内置页面")
    ,@CodeItem(value="REPORT",text="报表",realtext="报表")
    ,@CodeItem(value="CUSTOM",text="自定义",realtext="自定义")
})



/**
 * 静态代码表[统一资源类型]模型类
 */
public class CodeList16CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  内置页面，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PAGE = "PAGE";
    /**
     *  报表，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String REPORT = "REPORT";
    /**
     *  自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CUSTOM = "CUSTOM";

    public CodeList16CodeListModel() {
        super();
        this.initAnnotation(CodeList16CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList16CodeListModel", this);
    }

}