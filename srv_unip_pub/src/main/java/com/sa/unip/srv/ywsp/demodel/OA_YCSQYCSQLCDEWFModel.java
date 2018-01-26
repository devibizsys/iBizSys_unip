/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_YCSQ;
import com.sa.unip.srv.ywsp.service.OA_YCSQService;

/**
 * 实体[OA_YCSQ]工作流[OA_YCSQ]模型基类
 */
public class OA_YCSQYCSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_YCSQYCSQLCDEWFModel.class);

    public OA_YCSQYCSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("516F0D57-927D-47AC-B952-BC090459E616");
        //设置工作流标识
        this.setWorkflowId("ADE23A90-392B-4847-9284-052BCC1AD79C");
        //设置实体流程名称
        this.setName("YCSQLC");

        //设置流程步骤属性 用餐申请步骤
        this.setWFStepField("YCSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 用餐申请状态
        this.setUDStateField("YCSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}