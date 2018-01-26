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


@CodeList(id="148B1FEC-7DFB-4471-A5BC-76D7C3C78848",name="漂流瓶状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="已拾取",realtext="已拾取")
    ,@CodeItem(value="0",text="未拾取",realtext="未拾取")
})



/**
 * 静态代码表[漂流瓶状态]模型类
 */
public class PLPZTCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  已拾取，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";
    /**
     *  未拾取，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";

    public PLPZTCodeListModel() {
        super();
        this.initAnnotation(PLPZTCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.PLPZTCodeListModel", this);
    }

}