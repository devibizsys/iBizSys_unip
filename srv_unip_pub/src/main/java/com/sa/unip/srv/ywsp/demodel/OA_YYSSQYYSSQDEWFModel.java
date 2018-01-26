/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_YYSSQ;
import com.sa.unip.srv.ywsp.service.OA_YYSSQService;

/**
 * 实体[OA_YYSSQ]工作流[OA_YYSSQ]模型基类
 */
public class OA_YYSSQYYSSQDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_YYSSQYYSSQDEWFModel.class);

    public OA_YYSSQYYSSQDEWFModel() {
        super();

        //设置标识
        this.setId("3EF85F31-448A-4767-B99D-9D333E459CD5");
        //设置工作流标识
        this.setWorkflowId("A070B5AC-8168-43BE-93AA-07D345BF9444");
        //设置实体流程名称
        this.setName("YYSSQ");

        //设置流程步骤属性 引用水申请步骤
        this.setWFStepField("YYSSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 引用水申请状态
        this.setUDStateField("YYSSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}