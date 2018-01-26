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


@CodeList(id="4A0E40A2-12C9-4323-9190-C288F476B2C0",name="是否审核通过",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="通过",realtext="通过")
    ,@CodeItem(value="0",text="不通过",realtext="不通过")
})



/**
 * 静态代码表[是否审核通过]模型类
 */
public class CL_SFSHTGCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  通过，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  不通过，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";

    public CL_SFSHTGCodeListModel() {
        super();
        this.initAnnotation(CL_SFSHTGCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel", this);
    }

}