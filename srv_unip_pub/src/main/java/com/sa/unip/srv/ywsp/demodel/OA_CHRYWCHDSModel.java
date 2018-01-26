/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="227252C4-6D71-484F-8D5C-046A15081B80",name="WCH",queries= {
    @DEDataSetQuery(queryid="227252C4-6D71-484F-8D5C-046A15081B80",queryname="WCH")
})

/**
 *  实体[OA_CHRY]数据集合[未参会人数统计]模型基类
 */
public class OA_CHRYWCHDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_CHRYWCHDSModel() {
        super();
        this.initAnnotation(OA_CHRYWCHDSModel.class);
    }




}