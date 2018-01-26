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

@DEDataSet(id="6882a0ebeaba71c3557f87d860621328",name="DEFAULT",queries= {
    @DEDataSetQuery(queryid="8409EB49-0ED1-40BD-88DC-572C8C25419F",queryname="DEFAULT")
})

/**
 *  实体[DEMO]数据集合[DEFAULT]模型基类
 */
public class DemoDefaultDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public DemoDefaultDSModel() {
        super();
        this.initAnnotation(DemoDefaultDSModel.class);
    }




}