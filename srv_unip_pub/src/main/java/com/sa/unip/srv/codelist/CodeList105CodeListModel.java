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


@CodeList(id="0799d92cc31e56ef8cd479c62f30e1cc",name="数据库存储区域",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
})



/**
 * 静态代码表[数据库存储区域]模型类
 */
public class CodeList105CodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {


    public CodeList105CodeListModel() {
        super();
        this.initAnnotation(CodeList105CodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CodeList105CodeListModel", this);
    }

}