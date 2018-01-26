/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="43a554dc963230bc837ff475418429b2",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_QXJID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_QXJNAME",format="")
    })
}
         )

/**
 *  实体[OA_QXJ]自动填充 [DEFAULT]对象模型
 */
public class OA_QXJDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_QXJDefaultACModel() {
        super();

        this.initAnnotation(OA_QXJDefaultACModel.class);
    }

}