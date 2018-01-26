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


@CodeList(id="569252F9-17EF-4D7C-9675-E918DBDEE6A9",name="支付方式",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="网银",realtext="网银")
    ,@CodeItem(value="20",text="微信",realtext="微信")
    ,@CodeItem(value="30",text="支付宝",realtext="支付宝")
    ,@CodeItem(value="40",text="现金",realtext="现金")
})



/**
 * 静态代码表[支付方式]模型类
 */
public class ZFFSCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  网银，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  微信，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  支付宝，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  现金，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";

    public ZFFSCodeListModel() {
        super();
        this.initAnnotation(ZFFSCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.ZFFSCodeListModel", this);
    }

}