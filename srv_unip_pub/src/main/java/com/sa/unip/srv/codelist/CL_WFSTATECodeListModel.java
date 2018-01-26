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


@CodeList(id="417E4DD5-E593-4FC6-97CD-8144BA7A8E05",name="工作流状态（通用）",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="未提交",realtext="未提交")
    ,@CodeItem(value="20",text="流程中",realtext="流程中")
    ,@CodeItem(value="30",text="已完成",realtext="已完成")
    ,@CodeItem(value="40",text="已拒绝",realtext="已拒绝")
})



/**
 * 静态代码表[工作流状态（通用）]模型类
 */
public class CL_WFSTATECodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

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
     *  已拒绝，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";

    public CL_WFSTATECodeListModel() {
        super();
        this.initAnnotation(CL_WFSTATECodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel", this);
    }

}