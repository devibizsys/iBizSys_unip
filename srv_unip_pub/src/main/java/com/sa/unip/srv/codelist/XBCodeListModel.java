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


@CodeList(id="5DC2FAA8-957D-4226-B7FB-60B0F89C30BF",name="性别",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="女",realtext="女")
    ,@CodeItem(value="1",text="男",realtext="男")
})



/**
 * 静态代码表[性别]模型类
 */
public class XBCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  女，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  男，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";

    public XBCodeListModel() {
        super();
        this.initAnnotation(XBCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.XBCodeListModel", this);
    }

}