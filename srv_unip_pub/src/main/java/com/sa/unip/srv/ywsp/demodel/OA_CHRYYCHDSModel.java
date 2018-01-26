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

@DEDataSet(id="D068A102-DFBA-486F-BA81-D44D77A0A057",name="YCH",queries= {
    @DEDataSetQuery(queryid="D068A102-DFBA-486F-BA81-D44D77A0A057",queryname="YCH")
})

/**
 *  实体[OA_CHRY]数据集合[已参会人数统计]模型基类
 */
public class OA_CHRYYCHDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_CHRYYCHDSModel() {
        super();
        this.initAnnotation(OA_CHRYYCHDSModel.class);
    }




}