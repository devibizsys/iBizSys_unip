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


@CodeList(id="584bb11071e826f19ad4da4ed4e2222f",name="实体归属",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="SRFDA",text="系统",realtext="系统")
    ,@CodeItem(value="APPLICATION",text="应用",realtext="应用")
    ,@CodeItem(value="USER",text="用户",realtext="用户")
})



/**
 * 静态代码表[实体归属]模型类
 */
public class CodeList19CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  系统，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SRFDA = "SRFDA";
    /**
     *  应用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String APPLICATION = "APPLICATION";
    /**
     *  用户，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";

    public CodeList19CodeListModel() {
        super();
        this.initAnnotation(CodeList19CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList19CodeListModel", this);
    }

}