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


@CodeList(id="2F94F87D-73CA-4C9B-8F69-F2C40ED43BA0",name="请休假申请步骤",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="处室领导审核",realtext="处室领导审核")
    ,@CodeItem(value="20",text="干部处备案审核",realtext="干部处备案审核")
    ,@CodeItem(value="30",text="院领导审批",realtext="院领导审批")
})



/**
 * 静态代码表[请休假申请步骤]模型类
 */
public class CL_QXJSQBZCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  处室领导审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  干部处备案审核，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  院领导审批，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";

    public CL_QXJSQBZCodeListModel() {
        super();
        this.initAnnotation(CL_QXJSQBZCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_QXJSQBZCodeListModel", this);
    }

}