/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_CPMJSQ;
import com.sa.unip.srv.ywsp.service.OA_CPMJSQService;

/**
 * 实体[OA_CPMJSQ]工作流[OA_CPMJSQ]模型基类
 */
public class OA_CPMJSQCPMJSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_CPMJSQCPMJSQLCDEWFModel.class);

    public OA_CPMJSQCPMJSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("6320402B-4AFB-44C4-AA4C-2FF53B1338F4");
        //设置工作流标识
        this.setWorkflowId("BCE28AB4-6801-4E94-B40C-1B4DEA610230");
        //设置实体流程名称
        this.setName("CPMJSQLC");

        //设置流程步骤属性 车牌门禁申请步骤
        this.setWFStepField("CPMJSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 车牌门禁申请状态
        this.setUDStateField("CPMJSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}