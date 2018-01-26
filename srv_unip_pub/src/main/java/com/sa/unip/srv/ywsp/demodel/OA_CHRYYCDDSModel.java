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

@DEDataSet(id="2869E093-3A95-4439-BE52-76F7E0E2194F",name="YCD",queries= {
    @DEDataSetQuery(queryid="2869E093-3A95-4439-BE52-76F7E0E2194F",queryname="YCDJ")
})

/**
 *  实体[OA_CHRY]数据集合[已迟到人数统计]模型基类
 */
public class OA_CHRYYCDDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_CHRYYCDDSModel() {
        super();
        this.initAnnotation(OA_CHRYYCDDSModel.class);
    }




}