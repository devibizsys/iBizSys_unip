/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_PCSQ;
import com.sa.unip.srv.ywsp.service.OA_PCSQService;

/**
 * 实体[OA_PCSQ]工作流[OA_PCSQ]模型基类
 */
public class OA_PCSQPCSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_PCSQPCSQLCDEWFModel.class);

    public OA_PCSQPCSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("72C85E0B-B7DB-4D24-A23E-7E2FFE6D300C");
        //设置工作流标识
        this.setWorkflowId("AAD2F165-1BC4-477E-8C47-35E7AF46BBDD");
        //设置实体流程名称
        this.setName("PCSQLC");

        //设置流程步骤属性 派车申请步骤
        this.setWFStepField("PCSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 派车申请状态
        this.setUDStateField("PCSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}