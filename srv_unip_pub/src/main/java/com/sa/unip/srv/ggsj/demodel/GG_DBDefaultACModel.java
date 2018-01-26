/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="8de2c483d6469793d11fbb3b0ed056a5",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="GG_DBID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="GG_DBNAME",format="")
    })
}
         )

/**
 *  实体[GG_DB]自动填充 [DEFAULT]对象模型
 */
public class GG_DBDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public GG_DBDefaultACModel() {
        super();

        this.initAnnotation(GG_DBDefaultACModel.class);
    }

}