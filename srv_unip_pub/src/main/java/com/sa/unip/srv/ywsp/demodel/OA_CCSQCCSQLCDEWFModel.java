/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_CCSQ;
import com.sa.unip.srv.ywsp.service.OA_CCSQService;

/**
 * 实体[OA_CCSQ]工作流[OA_CCSQ]模型基类
 */
public class OA_CCSQCCSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_CCSQCCSQLCDEWFModel.class);

    public OA_CCSQCCSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("A9392098-5077-434E-A00E-4A4E1771CEA2");
        //设置工作流标识
        this.setWorkflowId("8E3B9638-79A4-4ED1-AFBD-1D87D5EFCC5F");
        //设置实体流程名称
        this.setName("CCSQLC");

        //设置流程步骤属性 出差申请步骤
        this.setWFStepField("CCSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 出差申请状态
        this.setUDStateField("CCSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}