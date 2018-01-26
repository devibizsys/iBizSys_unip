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


@CodeList(id="5D7F6E99-66F0-4AA6-A94B-4B2C7019C272",name="采购类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="打印机",realtext="打印机")
    ,@CodeItem(value="20",text="扫描仪",realtext="扫描仪")
    ,@CodeItem(value="30",text="电脑",realtext="电脑")
    ,@CodeItem(value="40",text="其他",realtext="其他")
})



/**
 * 静态代码表[采购类型]模型类
 */
public class CGLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  打印机，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  扫描仪，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  电脑，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  其他，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";

    public CGLXCodeListModel() {
        super();
        this.initAnnotation(CGLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CGLXCodeListModel", this);
    }

}