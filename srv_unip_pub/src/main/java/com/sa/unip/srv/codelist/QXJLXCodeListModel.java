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


@CodeList(id="8BFCFE6A-D949-4B65-BE38-5D64D283B37C",name="请休假类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="事假",realtext="事假")
    ,@CodeItem(value="20",text="病假",realtext="病假")
    ,@CodeItem(value="30",text="年假",realtext="年假")
    ,@CodeItem(value="40",text="调休",realtext="调休")
    ,@CodeItem(value="50",text="婚假",realtext="婚假")
    ,@CodeItem(value="60",text="产假",realtext="产假")
    ,@CodeItem(value="70",text="陪产假",realtext="陪产假")
    ,@CodeItem(value="80",text="丧假",realtext="丧假")
})



/**
 * 静态代码表[请休假类型]模型类
 */
public class QXJLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  事假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  病假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  年假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  调休，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";
    /**
     *  婚假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_50 = "50";
    /**
     *  产假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_60 = "60";
    /**
     *  陪产假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_70 = "70";
    /**
     *  丧假，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_80 = "80";

    public QXJLXCodeListModel() {
        super();
        this.initAnnotation(QXJLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.QXJLXCodeListModel", this);
    }

}