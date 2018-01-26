/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.workflow;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.annotation.Annotation;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.DynamicCodeListModelBase;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.sysmodel.ISystemModel;
import com.sa.unip.srv.UniPSampleSysModel;


/**
 * 消息用户组 流程角色模型基类
 */
public class XXYHZWFRoleModel extends net.ibizsys.pswf.core.WFUserGroupRoleModelBase  {

    public XXYHZWFRoleModel() throws Exception {

        super();
        this.setId("28155180-21CF-4620-B528-3944BE8C5537");
        this.setName("消息用户组");
        this.setWFRoleSN("");
        this.setUserData("");
        this.setUserData2("");

        //注册流程角色
        getUniPSampleSysModel().registerWFRoleModel(this);
    }

    private UniPSampleSysModel uniPSampleSysModel;
    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }



    @Override
    public  ISystemModel getSystemModel() {
        return this.getUniPSampleSysModel();
    }



}