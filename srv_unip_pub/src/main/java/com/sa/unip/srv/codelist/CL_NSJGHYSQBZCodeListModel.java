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


@CodeList(id="10DBFA09-94A6-4477-B952-5E613EEB7C79",name="内设机构会议申请步骤",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="参会领导审核",realtext="参会领导审核")
    ,@CodeItem(value="20",text="承办处室负责人审核",realtext="承办处室负责人审核")
    ,@CodeItem(value="30",text="秘书处审核",realtext="秘书处审核")
    ,@CodeItem(value="40",text="院办负责人审核",realtext="院办负责人审核")
})



/**
 * 静态代码表[内设机构会议申请步骤]模型类
 */
public class CL_NSJGHYSQBZCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  参会领导审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  承办处室负责人审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  秘书处审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  院办负责人审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";

    public CL_NSJGHYSQBZCodeListModel() {
        super();
        this.initAnnotation(CL_NSJGHYSQBZCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel", this);
    }

}