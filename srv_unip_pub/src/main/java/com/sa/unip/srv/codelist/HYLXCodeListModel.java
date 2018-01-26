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


@CodeList(id="0C18FE6F-DFB6-436A-A15C-F11D3CDFFDF9",name="会议类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="院办会议",realtext="院办会议")
    ,@CodeItem(value="20",text="内设机构会议",realtext="内设机构会议")
})



/**
 * 静态代码表[会议类型]模型类
 */
public class HYLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  院办会议，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  内设机构会议，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";

    public HYLXCodeListModel() {
        super();
        this.initAnnotation(HYLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.HYLXCodeListModel", this);
    }

}