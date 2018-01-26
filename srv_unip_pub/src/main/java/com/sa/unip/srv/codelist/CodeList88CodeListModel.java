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


@CodeList(id="0fc12871fdb34f9175e0b596e64d3d65",name="实体属性访问控制",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="NONE",text="无",realtext="无")
    ,@CodeItem(value="READ",text="读取",realtext="读取")
    ,@CodeItem(value="UPDATE",text="更新",realtext="更新")
})



/**
 * 静态代码表[实体属性访问控制]模型类
 */
public class CodeList88CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  无，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONE = "NONE";
    /**
     *  读取，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String READ = "READ";
    /**
     *  更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String UPDATE = "UPDATE";

    public CodeList88CodeListModel() {
        super();
        this.initAnnotation(CodeList88CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList88CodeListModel", this);
    }

}