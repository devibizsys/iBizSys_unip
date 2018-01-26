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


@CodeList(id="39c2d4cae93ef3bb3b870eeda9a7e4cf",name="用户对象类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="USER",text="用户",realtext="用户")
    ,@CodeItem(value="USERGROUP",text="用户组",realtext="用户组")
})



/**
 * 静态代码表[用户对象类型]模型类
 */
public class CodeList5CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  用户，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";
    /**
     *  用户组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USERGROUP = "USERGROUP";

    public CodeList5CodeListModel() {
        super();
        this.initAnnotation(CodeList5CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList5CodeListModel", this);
    }

}