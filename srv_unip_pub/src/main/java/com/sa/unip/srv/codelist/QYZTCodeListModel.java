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


@CodeList(id="F1FD9885-02DC-4DBD-ADD1-91A55D0D7521",name="启用状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="0",text="启用",realtext="启用")
    ,@CodeItem(value="1",text="禁用",realtext="禁用")
})



/**
 * 静态代码表[启用状态]模型类
 */
public class QYZTCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  启用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_0 = "0";
    /**
     *  禁用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_1 = "1";

    public QYZTCodeListModel() {
        super();
        this.initAnnotation(QYZTCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.QYZTCodeListModel", this);
    }

}