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

@DEDataSet(id="BBEDE1E6-9096-4E62-84EC-42751504E6E9",name="CurSbwx",queries= {
    @DEDataSetQuery(queryid="BBEDE1E6-9096-4E62-84EC-42751504E6E9",queryname="CurSbwx")
})

/**
 *  实体[OA_SBWX]数据集合[我的设备维修申请记录]模型基类
 */
public class OA_SBWXCurSbwxDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_SBWXCurSbwxDSModel() {
        super();
        this.initAnnotation(OA_SBWXCurSbwxDSModel.class);
    }




}