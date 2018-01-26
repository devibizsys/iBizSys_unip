/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="c300dfcfd782397bae090b345b40d5f4",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_YYSSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_YYSSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_YYSSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_YYSSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_YYSSQDefaultACModel() {
        super();

        this.initAnnotation(OA_YYSSQDefaultACModel.class);
    }

}