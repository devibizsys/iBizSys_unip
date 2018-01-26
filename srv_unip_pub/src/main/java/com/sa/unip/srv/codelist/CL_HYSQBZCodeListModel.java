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


@CodeList(id="D7356ACC-240D-45FC-B801-61146A975EAF",name="会议申请步骤",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="10",text="各单位反馈参会名单",realtext="各单位反馈参会名单")
    ,@CodeItem(value="20",text="会议室申请",realtext="会议室申请")
    ,@CodeItem(value="30",text="编制座位图",realtext="编制座位图")
    ,@CodeItem(value="40",text="参会人员对号入座",realtext="参会人员对号入座")
    ,@CodeItem(value="50",text="会情况通报",realtext="会情况通报")
})



/**
 * 静态代码表[会议申请步骤]模型类
 */
public class CL_HYSQBZCodeListModel extends com.sa.unip.srv.codelist.UniPSampleStaticCodeListModelBase  {

    /**
     *  各单位反馈参会名单，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_10 = "10";
    /**
     *  会议室申请，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_20 = "20";
    /**
     *  编制座位图，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_30 = "30";
    /**
     *  参会人员对号入座，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_40 = "40";
    /**
     *  会情况通报，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ITEM_50 = "50";

    public CL_HYSQBZCodeListModel() {
        super();
        this.initAnnotation(CL_HYSQBZCodeListModel.class);
        CodeListGlobal.registerCodeList("com.sa.unip.srv.codelist.CL_HYSQBZCodeListModel", this);
    }

}