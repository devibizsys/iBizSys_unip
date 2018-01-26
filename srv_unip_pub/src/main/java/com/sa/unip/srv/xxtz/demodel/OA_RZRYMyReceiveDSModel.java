/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;


import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="77761559-B61D-4995-BA11-B7730CDF2A67",name="MyReceive",queries= {
    @DEDataSetQuery(queryid="77761559-B61D-4995-BA11-B7730CDF2A67",queryname="MyReceive")
})

/**
 *  实体[OA_RZRY]数据集合[我收到的]模型基类
 */
public class OA_RZRYMyReceiveDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_RZRYMyReceiveDSModel() {
        super();
        this.initAnnotation(OA_RZRYMyReceiveDSModel.class);
    }




}