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

@DEDataSet(id="663636EC-123A-4716-862A-B5081B2CF075",name="CurPcsq",queries= {
    @DEDataSetQuery(queryid="663636EC-123A-4716-862A-B5081B2CF075",queryname="CurPcsq")
})

/**
 *  实体[OA_PCSQ]数据集合[我的派车申请记录]模型基类
 */
public class OA_PCSQCurPcsqDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_PCSQCurPcsqDSModel() {
        super();
        this.initAnnotation(OA_PCSQCurPcsqDSModel.class);
    }




}