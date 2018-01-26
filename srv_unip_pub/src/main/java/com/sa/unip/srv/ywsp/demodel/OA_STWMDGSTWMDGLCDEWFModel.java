/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_STWMDG;
import com.sa.unip.srv.ywsp.service.OA_STWMDGService;

/**
 * 实体[OA_STWMDG]工作流[OA_STWMDG]模型基类
 */
public class OA_STWMDGSTWMDGLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_STWMDGSTWMDGLCDEWFModel.class);

    public OA_STWMDGSTWMDGLCDEWFModel() {
        super();

        //设置标识
        this.setId("E35ECF64-209C-4437-BF21-10E3E8374111");
        //设置工作流标识
        this.setWorkflowId("49A0F3C3-CC7E-4297-95D2-5A2A8D30C09A");
        //设置实体流程名称
        this.setName("STWMDGLC");

        //设置流程步骤属性 食堂外卖订购步骤
        this.setWFStepField("STWMDGBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 食堂外卖订购状态
        this.setUDStateField("STWMDGZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}