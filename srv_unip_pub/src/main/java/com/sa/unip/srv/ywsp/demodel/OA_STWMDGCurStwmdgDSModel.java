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

@DEDataSet(id="1212ED0D-1CE9-478A-AD54-C5AF308D84DA",name="CurStwmdg",queries= {
    @DEDataSetQuery(queryid="1212ED0D-1CE9-478A-AD54-C5AF308D84DA",queryname="CurStwmdg")
})

/**
 *  实体[OA_STWMDG]数据集合[我的外卖订购记录]模型基类
 */
public class OA_STWMDGCurStwmdgDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_STWMDGCurStwmdgDSModel() {
        super();
        this.initAnnotation(OA_STWMDGCurStwmdgDSModel.class);
    }




}