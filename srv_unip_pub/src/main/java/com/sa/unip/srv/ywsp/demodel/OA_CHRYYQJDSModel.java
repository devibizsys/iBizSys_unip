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

@DEDataSet(id="F39E940A-0A98-490A-B61D-59D1A2101331",name="YQJ",queries= {
    @DEDataSetQuery(queryid="F39E940A-0A98-490A-B61D-59D1A2101331",queryname="YQJ")
})

/**
 *  实体[OA_CHRY]数据集合[已请假人数统计]模型基类
 */
public class OA_CHRYYQJDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_CHRYYQJDSModel() {
        super();
        this.initAnnotation(OA_CHRYYQJDSModel.class);
    }




}