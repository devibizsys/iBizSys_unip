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

@DEDataSet(id="F9E18858-F064-4B5C-89F1-BB721BED9C23",name="MySender",queries= {
    @DEDataSetQuery(queryid="F9E18858-F064-4B5C-89F1-BB721BED9C23",queryname="MySender")
})

/**
 *  实体[OA_GZRZ]数据集合[当前登录人的日志]模型基类
 */
public class OA_GZRZMySenderDSModel extends com.sa.unip.srv.UniPSampleSysDSModelBase {
    public OA_GZRZMySenderDSModel() {
        super();
        this.initAnnotation(OA_GZRZMySenderDSModel.class);
    }




}