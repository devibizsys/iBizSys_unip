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


@CodeList(id="9FE9F074-86DE-43B7-962D-E9267A3D2448",name="采购审批申请步骤",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="部门申报",realtext="部门申报")
    ,@CodeItem(value="20",text="部门负责人审核",realtext="部门负责人审核")
    ,@CodeItem(value="30",text="固定资产相关人员审核",realtext="固定资产相关人员审核")
    ,@CodeItem(value="40",text="计财负责人审核",realtext="计财负责人审核")
    ,@CodeItem(value="50",text="分管院领导审核",realtext="分管院领导审核")
})



/**
 * 静态代码表[采购审批申请步骤]模型类
 */
public class CL_CGSPSQBZCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  部门申报，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  部门负责人审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  固定资产相关人员审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  计财负责人审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";
    /**
     *  分管院领导审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_50 = "50";

    public CL_CGSPSQBZCodeListModel() {
        super();
        this.initAnnotation(CL_CGSPSQBZCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_CGSPSQBZCodeListModel", this);
    }

}