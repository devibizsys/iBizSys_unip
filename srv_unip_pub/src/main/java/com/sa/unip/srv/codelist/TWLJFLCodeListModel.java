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


@CodeList(id="CE95DC0F-F161-416A-8F1E-0D4A8C8F2513",name="图文链接分类",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="图文",realtext="图文")
    ,@CodeItem(value="1",text="链接",realtext="链接")
})



/**
 * 静态代码表[图文链接分类]模型类
 */
public class TWLJFLCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  图文，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  链接，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";

    public TWLJFLCodeListModel() {
        super();
        this.initAnnotation(TWLJFLCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.TWLJFLCodeListModel", this);
    }

}