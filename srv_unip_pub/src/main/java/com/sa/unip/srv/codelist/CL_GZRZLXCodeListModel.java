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


@CodeList(id="BBE9816D-6E00-4D36-830F-4DBFDE6493E2",name="工作日志类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="日报",realtext="日报")
    ,@CodeItem(value="20",text="周报",realtext="周报")
    ,@CodeItem(value="30",text="月报",realtext="月报")
})



/**
 * 静态代码表[工作日志类型]模型类
 */
public class CL_GZRZLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  日报，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  周报，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  月报，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";

    public CL_GZRZLXCodeListModel() {
        super();
        this.initAnnotation(CL_GZRZLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_GZRZLXCodeListModel", this);
    }

}