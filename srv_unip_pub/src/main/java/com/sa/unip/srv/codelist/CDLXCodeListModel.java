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


@CodeList(id="A818C186-8B24-4F71-8410-E817D4FA1E7E",name="菜单类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="一级菜单",realtext="一级菜单")
    ,@CodeItem(value="2",text="网页链接",realtext="网页链接")
    ,@CodeItem(value="1",text="调用接口",realtext="调用接口")
    ,@CodeItem(value="3",text="返回菜单",realtext="返回菜单")
})



/**
 * 静态代码表[菜单类型]模型类
 */
public class CDLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  一级菜单，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  网页链接，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_2 = "2";
    /**
     *  调用接口，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  返回菜单，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_3 = "3";

    public CDLXCodeListModel() {
        super();
        this.initAnnotation(CDLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CDLXCodeListModel", this);
    }

}