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


@CodeList(id="439db79fec36426cb354d983b6b2b117",name="字段排序方向",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="ASC",text="升序",realtext="升序")
    ,@CodeItem(value="DESC",text="降序",realtext="降序")
})



/**
 * 静态代码表[字段排序方向]模型类
 */
public class SortDirCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  升序，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ASC = "ASC";
    /**
     *  降序，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DESC = "DESC";

    public SortDirCodeListModel() {
        super();
        this.initAnnotation(SortDirCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.SortDirCodeListModel", this);
    }

}