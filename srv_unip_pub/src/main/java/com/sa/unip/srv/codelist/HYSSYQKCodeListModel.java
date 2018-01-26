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


@CodeList(id="759780AF-56E4-49E4-A29F-1FACA70FCFCA",name="会议室使用情况",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="20",text="使用中",realtext="使用中")
    ,@CodeItem(value="10",text="未使用",realtext="未使用")
})



/**
 * 静态代码表[会议室使用情况]模型类
 */
public class HYSSYQKCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  使用中，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  未使用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";

    public HYSSYQKCodeListModel() {
        super();
        this.initAnnotation(HYSSYQKCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.HYSSYQKCodeListModel", this);
    }

}