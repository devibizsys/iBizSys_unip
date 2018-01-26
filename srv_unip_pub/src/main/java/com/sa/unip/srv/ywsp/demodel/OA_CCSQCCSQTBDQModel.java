/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="84AB1E5F-2FB2-425B-BA58-CA081465E4B0",name="CCSQTB")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="select sum(sc) daycount,t2.ORGUSERNAME name from t_oa_ccsq t1 LEFT JOIN t_srforguser t2 on t1.ORGUSERID = t2.ORGUSERID  GROUP BY   t1.ORGUSERID ORDER BY dayCount desc LIMIT 0,8",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={},
    conds={})
})
/**
 *  实体数据查询 [出差申请图表]模型基类
 */
public class OA_CCSQCCSQTBDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CCSQCCSQTBDQModel() {
        super();

        this.initAnnotation(OA_CCSQCCSQTBDQModel.class);
    }

}