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

@DEDataSet(id="0608E3B3-A5DD-43E8-88CD-4CD59FA0AA50",name="YCH2",queries= {
    @DEDataSetQuery(queryid="0608E3B3-A5DD-43E8-88CD-4CD59FA0AA50",queryname="YCH2")
})

/**
 *  实体[OA_CHRY]数据集合[已参会人数统计（包括已迟到）]模型基类
 */
public class OA_CHRYYCH2DSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_CHRYYCH2DSModel() {
        super();
        this.initAnnotation(OA_CHRYYCH2DSModel.class);
    }




}