/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="04e19d4de092a71460a31ae1e90ba06f",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CPMJSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CPMJSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_CPMJSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_CPMJSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CPMJSQDefaultACModel() {
        super();

        this.initAnnotation(OA_CPMJSQDefaultACModel.class);
    }

}