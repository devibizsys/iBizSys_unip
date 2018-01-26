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


@CodeList(id="0d947aa77b9ea53b3a069eb655d69dc5",name="DA日志操作类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="CREATE",text="新建",realtext="新建")
    ,@CodeItem(value="UPDATE",text="更新",realtext="更新")
    ,@CodeItem(value="DELETE",text="删除",realtext="删除")
})



/**
 * 静态代码表[DA日志操作类型]模型类
 */
public class CodeList24CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  新建，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CREATE = "CREATE";
    /**
     *  更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String UPDATE = "UPDATE";
    /**
     *  删除，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DELETE = "DELETE";

    public CodeList24CodeListModel() {
        super();
        this.initAnnotation(CodeList24CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList24CodeListModel", this);
    }

}