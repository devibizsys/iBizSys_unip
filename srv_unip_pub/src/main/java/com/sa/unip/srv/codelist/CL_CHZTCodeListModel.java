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


@CodeList(id="16B19126-0961-4814-9BF0-0039B4DDE1FA",name="参会状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="未参加",realtext="未参加")
    ,@CodeItem(value="20",text="已请假",realtext="已请假")
    ,@CodeItem(value="30",text="已参加",realtext="已参加")
    ,@CodeItem(value="40",text="已迟到",realtext="已迟到")
})



/**
 * 静态代码表[参会状态]模型类
 */
public class CL_CHZTCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  未参加，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  已请假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  已参加，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  已迟到，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";

    public CL_CHZTCodeListModel() {
        super();
        this.initAnnotation(CL_CHZTCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_CHZTCodeListModel", this);
    }

}