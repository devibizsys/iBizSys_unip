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


@CodeList(id="8543E2F4-4795-479B-8393-568102888864",name="权限类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="不看对方发的内容",realtext="不看对方发的内容")
    ,@CodeItem(value="0",text="不让对方看到我发的内容",realtext="不让对方看到我发的内容")
})



/**
 * 静态代码表[权限类型]模型类
 */
public class QXLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  不看对方发的内容，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  不让对方看到我发的内容，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";

    public QXLXCodeListModel() {
        super();
        this.initAnnotation(QXLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.QXLXCodeListModel", this);
    }

}