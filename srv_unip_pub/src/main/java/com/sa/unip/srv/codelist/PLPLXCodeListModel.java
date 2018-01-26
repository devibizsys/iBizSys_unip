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


@CodeList(id="355F2937-0E6D-4A8A-8D68-7E7FC4FCBC51",name="漂流类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="文字",realtext="文字")
    ,@CodeItem(value="1",text="语音",realtext="语音")
})



/**
 * 静态代码表[漂流类型]模型类
 */
public class PLPLXCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  文字，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  语音，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";

    public PLPLXCodeListModel() {
        super();
        this.initAnnotation(PLPLXCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.PLPLXCodeListModel", this);
    }

}