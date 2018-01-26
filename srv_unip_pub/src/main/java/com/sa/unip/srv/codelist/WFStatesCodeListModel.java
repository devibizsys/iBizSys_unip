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


@CodeList(id="3ac6db3b9ce065e05ac98656c8363cb5",name="平台内置流程状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="未启动",realtext="未启动")
    ,@CodeItem(value="1",text="流程中",realtext="流程中")
    ,@CodeItem(value="2",text="已完成",realtext="已完成")
    ,@CodeItem(value="3",text="已取消",realtext="已取消")
    ,@CodeItem(value="31",text="已取消(人工)",realtext="已取消(人工)")
    ,@CodeItem(value="32",text="已取消(超时)",realtext="已取消(超时)")
    ,@CodeItem(value="4",text="处理故障",realtext="处理故障")
})



/**
 * 静态代码表[平台内置流程状态]模型类
 */
public class WFStatesCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  未启动，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  流程中，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  已完成，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_2 = "2";
    /**
     *  已取消，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_3 = "3";
    /**
     *  已取消(人工)，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_31 = "31";
    /**
     *  已取消(超时)，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_32 = "32";
    /**
     *  处理故障，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_4 = "4";

    public WFStatesCodeListModel() {
        super();
        this.initAnnotation(WFStatesCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.WFStatesCodeListModel", this);
    }

}