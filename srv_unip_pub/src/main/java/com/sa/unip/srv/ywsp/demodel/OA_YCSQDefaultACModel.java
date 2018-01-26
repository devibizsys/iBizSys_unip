/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="4494d39d58cba00b8eb277e80e350dad",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_YCSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_YCSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_YCSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_YCSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_YCSQDefaultACModel() {
        super();

        this.initAnnotation(OA_YCSQDefaultACModel.class);
    }

}