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


@CodeList(id="4855258D-5F2B-4326-A234-CF17B31B435E",name="是否已读",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="未读",realtext="未读")
    ,@CodeItem(value="20",text="已读",realtext="已读")
})



/**
 * 静态代码表[是否已读]模型类
 */
public class CL_SFYDCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  未读，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  已读，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";

    public CL_SFYDCodeListModel() {
        super();
        this.initAnnotation(CL_SFYDCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_SFYDCodeListModel", this);
    }

}