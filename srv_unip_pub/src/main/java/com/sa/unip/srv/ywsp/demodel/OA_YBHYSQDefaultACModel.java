/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="c0433bdd5aa541e585e2b3b0e59951da",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_YBHYSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_YBHYSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_YBHYSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_YBHYSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_YBHYSQDefaultACModel() {
        super();

        this.initAnnotation(OA_YBHYSQDefaultACModel.class);
    }

}