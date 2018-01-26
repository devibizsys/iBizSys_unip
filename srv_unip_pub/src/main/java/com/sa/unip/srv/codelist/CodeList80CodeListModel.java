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


@CodeList(id="79e9fa593c9008f53d82dbc1b3776016",name="实体存储类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="STATIC",text="静态存储",realtext="静态存储")
    ,@CodeItem(value="DYNAMIC",text="动态存储",realtext="动态存储")
    ,@CodeItem(value="NONE",text="无存储",realtext="无存储")
})



/**
 * 静态代码表[实体存储类型]模型类
 */
public class CodeList80CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  静态存储，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String STATIC = "STATIC";
    /**
     *  动态存储，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DYNAMIC = "DYNAMIC";
    /**
     *  无存储，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONE = "NONE";

    public CodeList80CodeListModel() {
        super();
        this.initAnnotation(CodeList80CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList80CodeListModel", this);
    }

}