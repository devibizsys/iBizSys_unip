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


@CodeList(id="D25A3B03-1A4C-4FBA-8793-2CEFC62F1FF4",name="消息是否已发送",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="已发送",realtext="已发送")
    ,@CodeItem(value="20",text="未发送",realtext="未发送")
})



/**
 * 静态代码表[消息是否已发送]模型类
 */
public class XXSFYFSCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  已发送，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  未发送，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";

    public XXSFYFSCodeListModel() {
        super();
        this.initAnnotation(XXSFYFSCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.XXSFYFSCodeListModel", this);
    }

}