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


@CodeList(id="B9AA5498-8877-4506-B53C-1E467FDCA21D",name="车辆使用情况",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="20",text="使用中",realtext="使用中")
    ,@CodeItem(value="10",text="未使用",realtext="未使用")
})



/**
 * 静态代码表[车辆使用情况]模型类
 */
public class CLSYQKCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  使用中，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  未使用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";

    public CLSYQKCodeListModel() {
        super();
        this.initAnnotation(CLSYQKCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CLSYQKCodeListModel", this);
    }

}