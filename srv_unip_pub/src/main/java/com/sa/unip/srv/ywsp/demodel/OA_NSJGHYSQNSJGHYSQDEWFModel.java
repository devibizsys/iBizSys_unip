/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ;
import com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService;

/**
 * 实体[OA_NSJGHYSQ]工作流[OA_NSJGHYSQ]模型基类
 */
public class OA_NSJGHYSQNSJGHYSQDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_NSJGHYSQNSJGHYSQDEWFModel.class);

    public OA_NSJGHYSQNSJGHYSQDEWFModel() {
        super();

        //设置标识
        this.setId("F9D95EB0-D7C5-415A-AC29-68D859C9A0E3");
        //设置工作流标识
        this.setWorkflowId("0A378005-5F3C-4BEB-ADE2-6D3E1ABC441B");
        //设置实体流程名称
        this.setName("NSJGHYSQ");

        //设置流程步骤属性 内设机构会议申请步骤
        this.setWFStepField("NSJGHYSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 内设机构会议申请状态
        this.setUDStateField("NSJGHYSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}