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


@CodeList(id="66B91363-CCAF-46DC-9C4B-C5EADA90133F",name="会议申请状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="未提交",realtext="未提交")
    ,@CodeItem(value="20",text="流程中",realtext="流程中")
    ,@CodeItem(value="30",text="已完成",realtext="已完成")
    ,@CodeItem(value="40",text="已取消",realtext="已取消")
    ,@CodeItem(value="50",text="已拒绝",realtext="已拒绝")
})



/**
 * 静态代码表[会议申请状态]模型类
 */
public class CL_HYSQZTCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  未提交，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  流程中，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  已完成，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  已取消，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";
    /**
     *  已拒绝，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_50 = "50";

    public CL_HYSQZTCodeListModel() {
        super();
        this.initAnnotation(CL_HYSQZTCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_HYSQZTCodeListModel", this);
    }

}