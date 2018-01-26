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


@CodeList(id="80244a99b3b9f03f7c919512d5dd70df",name="用户数据行为",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="无建立",realtext="无建立")
    ,@CodeItem(value="2",text="无更新",realtext="无更新")
    ,@CodeItem(value="4",text="无删除",realtext="无删除")
    ,@CodeItem(value="8",text="无查看",realtext="无查看")
})



/**
 * 静态代码表[用户数据行为]模型类
 */
public class CodeList71CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  无建立，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  无更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_2 = "2";
    /**
     *  无删除，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_4 = "4";
    /**
     *  无查看，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_8 = "8";

    public CodeList71CodeListModel() {
        super();
        this.initAnnotation(CodeList71CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList71CodeListModel", this);
    }

}