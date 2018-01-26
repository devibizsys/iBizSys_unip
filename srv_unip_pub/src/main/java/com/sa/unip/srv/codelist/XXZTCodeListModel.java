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


@CodeList(id="57CFD9D7-F13F-477E-8549-762F7E367389",name="消息状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="已接受",realtext="已接受")
    ,@CodeItem(value="2",text="已读",realtext="已读")
    ,@CodeItem(value="0",text="未接收",realtext="未接收")
})



/**
 * 静态代码表[消息状态]模型类
 */
public class XXZTCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  已接受，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  已读，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_2 = "2";
    /**
     *  未接收，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";

    public XXZTCodeListModel() {
        super();
        this.initAnnotation(XXZTCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.XXZTCodeListModel", this);
    }

}