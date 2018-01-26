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


@CodeList(id="3D6B162C-4B6D-4F09-859D-BA4B15329DD0",name="在线状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="在线",realtext="在线")
    ,@CodeItem(value="0",text="离线",realtext="离线")
})



/**
 * 静态代码表[在线状态]模型类
 */
public class ZXZTCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  在线，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  离线，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";

    public ZXZTCodeListModel() {
        super();
        this.initAnnotation(ZXZTCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.ZXZTCodeListModel", this);
    }

}