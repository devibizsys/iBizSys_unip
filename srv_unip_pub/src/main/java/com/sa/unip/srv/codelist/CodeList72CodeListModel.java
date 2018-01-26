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


@CodeList(id="b2d07f091fbac36e499f4904f56d4b41",name="数据通知监控行为",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="新建",realtext="新建")
    ,@CodeItem(value="2",text="更新",realtext="更新")
    ,@CodeItem(value="3",text="新建或更新",realtext="新建或更新")
    ,@CodeItem(value="4",text="删除",realtext="删除")
})



/**
 * 静态代码表[数据通知监控行为]模型类
 */
public class CodeList72CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  新建，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_2 = "2";
    /**
     *  新建或更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_3 = "3";
    /**
     *  删除，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_4 = "4";

    public CodeList72CodeListModel() {
        super();
        this.initAnnotation(CodeList72CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList72CodeListModel", this);
    }

}