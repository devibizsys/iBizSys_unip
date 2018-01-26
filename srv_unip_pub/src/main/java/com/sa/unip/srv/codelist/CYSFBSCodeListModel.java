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


@CodeList(id="9F4D7F2F-04CA-40FC-925D-34AC21559687",name="成员身份标识",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="普通成员",realtext="普通成员")
    ,@CodeItem(value="1",text="群主",realtext="群主")
})



/**
 * 静态代码表[成员身份标识]模型类
 */
public class CYSFBSCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  普通成员，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  群主，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";

    public CYSFBSCodeListModel() {
        super();
        this.initAnnotation(CYSFBSCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CYSFBSCodeListModel", this);
    }

}