/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.xxtz.entity.OA_TZGG;
import com.sa.unip.srv.xxtz.service.OA_TZGGService;

/**
 * 实体[OA_TZGG]工作流[OA_TZGG]模型基类
 */
public class OA_TZGGTZGGSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_TZGGTZGGSQLCDEWFModel.class);

    public OA_TZGGTZGGSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("75B611EE-617F-4D0B-9BB3-DB4B6CF7D339");
        //设置工作流标识
        this.setWorkflowId("21C2D14F-CB19-468E-A8E2-B1219566CA04");
        //设置实体流程名称
        this.setName("TZGGSQLC");

        //设置流程步骤属性 通知公告申请步骤
        this.setWFStepField("TZGGSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 通知公告申请状态
        this.setUDStateField("TZGGSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}