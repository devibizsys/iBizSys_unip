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


@CodeList(id="fce0a2be420665e49abcb647a02f3460",name="数据同步方向",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="IN",text="输入",realtext="输入")
    ,@CodeItem(value="OUT",text="输出",realtext="输出")
})



/**
 * 静态代码表[数据同步方向]模型类
 */
public class CodeList97CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  输入，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String IN = "IN";
    /**
     *  输出，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String OUT = "OUT";

    public CodeList97CodeListModel() {
        super();
        this.initAnnotation(CodeList97CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList97CodeListModel", this);
    }

}