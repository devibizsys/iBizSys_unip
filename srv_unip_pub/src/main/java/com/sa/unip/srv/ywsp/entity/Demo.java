/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.entity;


import java.io.Serializable;
import java.util.HashMap;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;

import java.sql.Timestamp;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;
import net.ibizsys.paas.util.JSONObjectHelper;
import net.ibizsys.paas.xml.XmlNode;
import net.ibizsys.paas.service.ServiceGlobal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 实体[Demo] 数据对象
 */
public class Demo extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(Demo.class);
    /**
     *   实体属性标识[演示名称]
     */
    public final static String FIELD_DEMONAME = "DEMONAME";
    /**
     *   实体属性标识[演示标识]
     */
    public final static String FIELD_DEMOID = "DEMOID";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[时间控件演示]
     */
    public final static String FIELD_SJDEMO = "SJDEMO";
    /**
     *   实体属性标识[文本框演示]
     */
    public final static String FIELD_WBKDEMO = "WBKDEMO";
    /**
     *   实体属性标识[多行文本框演示]
     */
    public final static String FIELD_DHWBKDEMO = "DHWBKDEMO";
    /**
     *   实体属性标识[图片上传演示]
     */
    public final static String FIELD_TPDEMO = "TPDEMO";
    /**
     *   实体属性标识[文件上传演示]
     */
    public final static String FIELD_WJDEMO = "WJDEMO";
    /**
     *   实体属性标识[图片列表上传演示]
     */
    public final static String FIELD_TPLBDEMO = "TPLBDEMO";
    /**
     *   实体属性标识[数据选择演示]
     */
    public final static String FIELD_SJXZDEMO = "SJXZDEMO";
    /**
     *   实体属性标识[多数据选择演示]
     */
    public final static String FIELD_DSJXZDEMO = "DSJXZDEMO";
    /**
     *   实体属性标识[单选列表演示]
     */
    public final static String FIELD_DXLBDEMO = "DXLBDEMO";
    /**
     *   实体属性标识[下拉列表演示]
     */
    public final static String FIELD_XLLBDEMO = "XLLBDEMO";
    /**
     *   实体属性标识[选项框演示]
     */
    public final static String FIELD_XXKLBDEMO = "XXKLBDEMO";
    /**
     *   实体属性标识[不可编辑演示]
     */
    public final static String FIELD_BKBJDEMO = "BKBJDEMO";
    /**
     *   实体属性标识[演示申请状态]
     */
    public final static String FIELD_DEMOSQZT = "DEMOSQZT";
    /**
     *   实体属性标识[演示申请步骤]
     */
    public final static String FIELD_DEMOSQBZ = "DEMOSQBZ";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";

    private final static int INDEX_DEMONAME = 0;
    private final static int INDEX_DEMOID = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_UPDATEMAN = 3;
    private final static int INDEX_CREATEDATE = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_SJDEMO = 6;
    private final static int INDEX_WBKDEMO = 7;
    private final static int INDEX_DHWBKDEMO = 8;
    private final static int INDEX_TPDEMO = 9;
    private final static int INDEX_WJDEMO = 10;
    private final static int INDEX_TPLBDEMO = 11;
    private final static int INDEX_SJXZDEMO = 12;
    private final static int INDEX_DSJXZDEMO = 13;
    private final static int INDEX_DXLBDEMO = 14;
    private final static int INDEX_XLLBDEMO = 15;
    private final static int INDEX_XXKLBDEMO = 16;
    private final static int INDEX_BKBJDEMO = 17;
    private final static int INDEX_DEMOSQZT = 18;
    private final static int INDEX_DEMOSQBZ = 19;
    private final static int INDEX_WFINSTANCEID = 20;
    private final static int INDEX_WFSTATE = 21;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_DEMONAME, INDEX_DEMONAME);
        fieldIndexMap.put( FIELD_DEMOID, INDEX_DEMOID);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_SJDEMO, INDEX_SJDEMO);
        fieldIndexMap.put( FIELD_WBKDEMO, INDEX_WBKDEMO);
        fieldIndexMap.put( FIELD_DHWBKDEMO, INDEX_DHWBKDEMO);
        fieldIndexMap.put( FIELD_TPDEMO, INDEX_TPDEMO);
        fieldIndexMap.put( FIELD_WJDEMO, INDEX_WJDEMO);
        fieldIndexMap.put( FIELD_TPLBDEMO, INDEX_TPLBDEMO);
        fieldIndexMap.put( FIELD_SJXZDEMO, INDEX_SJXZDEMO);
        fieldIndexMap.put( FIELD_DSJXZDEMO, INDEX_DSJXZDEMO);
        fieldIndexMap.put( FIELD_DXLBDEMO, INDEX_DXLBDEMO);
        fieldIndexMap.put( FIELD_XLLBDEMO, INDEX_XLLBDEMO);
        fieldIndexMap.put( FIELD_XXKLBDEMO, INDEX_XXKLBDEMO);
        fieldIndexMap.put( FIELD_BKBJDEMO, INDEX_BKBJDEMO);
        fieldIndexMap.put( FIELD_DEMOSQZT, INDEX_DEMOSQZT);
        fieldIndexMap.put( FIELD_DEMOSQBZ, INDEX_DEMOSQBZ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
    }

    private Demo proxyDemo = null;

    public Demo() {
        super();
    }
    private boolean demonameDirtyFlag = false;
    private boolean demoidDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean sjdemoDirtyFlag = false;
    private boolean wbkdemoDirtyFlag = false;
    private boolean dhwbkdemoDirtyFlag = false;
    private boolean tpdemoDirtyFlag = false;
    private boolean wjdemoDirtyFlag = false;
    private boolean tplbdemoDirtyFlag = false;
    private boolean sjxzdemoDirtyFlag = false;
    private boolean dsjxzdemoDirtyFlag = false;
    private boolean dxlbdemoDirtyFlag = false;
    private boolean xllbdemoDirtyFlag = false;
    private boolean xxklbdemoDirtyFlag = false;
    private boolean bkbjdemoDirtyFlag = false;
    private boolean demosqztDirtyFlag = false;
    private boolean demosqbzDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;

    @Column(name="demoname")
    private String demoname;
    @Column(name="demoid")
    private String demoid;
    @Column(name="createman")
    private String createman;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="sjdemo")
    private Timestamp sjdemo;
    @Column(name="wbkdemo")
    private String wbkdemo;
    @Column(name="dhwbkdemo")
    private String dhwbkdemo;
    @Column(name="tpdemo")
    private String tpdemo;
    @Column(name="wjdemo")
    private String wjdemo;
    @Column(name="tplbdemo")
    private String tplbdemo;
    @Column(name="sjxzdemo")
    private String sjxzdemo;
    @Column(name="dsjxzdemo")
    private String dsjxzdemo;
    @Column(name="dxlbdemo")
    private String dxlbdemo;
    @Column(name="xllbdemo")
    private String xllbdemo;
    @Column(name="xxklbdemo")
    private String xxklbdemo;
    @Column(name="bkbjdemo")
    private String bkbjdemo;
    @Column(name="demosqzt")
    private String demosqzt;
    @Column(name="demosqbz")
    private String demosqbz;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;


    /**
     *  设置属性值[演示名称]
     *  @param demoname
     */
    public void setDemoName(String demoname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDemoName(demoname);
            return;
        }
        if(demoname!=null) {
            demoname = StringHelper.trimRight(demoname);
            if(demoname.length()==0) {
                demoname = null;
            }
        }
        this.demoname =  demoname;
        this.demonameDirtyFlag  = true;
    }

    /**
     *  获取属性值[演示名称]
     */
    public String getDemoName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDemoName();
        }
        return this.demoname;
    }

    /**
     *  获取属性值[演示名称]是否修改
     */
    public boolean isDemoNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDemoNameDirty();
        }
        return this.demonameDirtyFlag;
    }

    /**
     *  重置属性值[演示名称]
     */
    public void resetDemoName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDemoName();
            return;
        }

        this.demonameDirtyFlag = false;
        this.demoname = null;
    }
    /**
     *  设置属性值[演示标识]
     *  @param demoid
     */
    public void setDemoId(String demoid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDemoId(demoid);
            return;
        }
        if(demoid!=null) {
            demoid = StringHelper.trimRight(demoid);
            if(demoid.length()==0) {
                demoid = null;
            }
        }
        this.demoid =  demoid;
        this.demoidDirtyFlag  = true;
    }

    /**
     *  获取属性值[演示标识]
     */
    public String getDemoId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDemoId();
        }
        return this.demoid;
    }

    /**
     *  获取属性值[演示标识]是否修改
     */
    public boolean isDemoIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDemoIdDirty();
        }
        return this.demoidDirtyFlag;
    }

    /**
     *  重置属性值[演示标识]
     */
    public void resetDemoId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDemoId();
            return;
        }

        this.demoidDirtyFlag = false;
        this.demoid = null;
    }
    /**
     *  设置属性值[建立人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     *  @param createman
     */
    public void setCreateMan(String createman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateMan(createman);
            return;
        }
        if(createman!=null) {
            createman = StringHelper.trimRight(createman);
            if(createman.length()==0) {
                createman = null;
            }
        }
        this.createman =  createman;
        this.createmanDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     */
    public String getCreateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateMan();
        }
        return this.createman;
    }

    /**
     *  获取属性值[建立人]是否修改
     */
    public boolean isCreateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateManDirty();
        }
        return this.createmanDirtyFlag;
    }

    /**
     *  重置属性值[建立人]
     */
    public void resetCreateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateMan();
            return;
        }

        this.createmanDirtyFlag = false;
        this.createman = null;
    }
    /**
     *  设置属性值[更新人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     *  @param updateman
     */
    public void setUpdateMan(String updateman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateMan(updateman);
            return;
        }
        if(updateman!=null) {
            updateman = StringHelper.trimRight(updateman);
            if(updateman.length()==0) {
                updateman = null;
            }
        }
        this.updateman =  updateman;
        this.updatemanDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     */
    public String getUpdateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateMan();
        }
        return this.updateman;
    }

    /**
     *  获取属性值[更新人]是否修改
     */
    public boolean isUpdateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateManDirty();
        }
        return this.updatemanDirtyFlag;
    }

    /**
     *  重置属性值[更新人]
     */
    public void resetUpdateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateMan();
            return;
        }

        this.updatemanDirtyFlag = false;
        this.updateman = null;
    }
    /**
     *  设置属性值[建立时间]
     *  @param createdate
     */
    public void setCreateDate(Timestamp createdate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateDate(createdate);
            return;
        }
        this.createdate =  createdate;
        this.createdateDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立时间]
     */
    public Timestamp getCreateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateDate();
        }
        return this.createdate;
    }

    /**
     *  获取属性值[建立时间]是否修改
     */
    public boolean isCreateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateDateDirty();
        }
        return this.createdateDirtyFlag;
    }

    /**
     *  重置属性值[建立时间]
     */
    public void resetCreateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateDate();
            return;
        }

        this.createdateDirtyFlag = false;
        this.createdate = null;
    }
    /**
     *  设置属性值[更新时间]
     *  @param updatedate
     */
    public void setUpdateDate(Timestamp updatedate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateDate(updatedate);
            return;
        }
        this.updatedate =  updatedate;
        this.updatedateDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新时间]
     */
    public Timestamp getUpdateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateDate();
        }
        return this.updatedate;
    }

    /**
     *  获取属性值[更新时间]是否修改
     */
    public boolean isUpdateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateDateDirty();
        }
        return this.updatedateDirtyFlag;
    }

    /**
     *  重置属性值[更新时间]
     */
    public void resetUpdateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateDate();
            return;
        }

        this.updatedateDirtyFlag = false;
        this.updatedate = null;
    }
    /**
     *  设置属性值[时间控件演示]
     *  @param sjdemo
     */
    public void setSjdemo(Timestamp sjdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSjdemo(sjdemo);
            return;
        }
        this.sjdemo =  sjdemo;
        this.sjdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[时间控件演示]
     */
    public Timestamp getSjdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSjdemo();
        }
        return this.sjdemo;
    }

    /**
     *  获取属性值[时间控件演示]是否修改
     */
    public boolean isSjdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSjdemoDirty();
        }
        return this.sjdemoDirtyFlag;
    }

    /**
     *  重置属性值[时间控件演示]
     */
    public void resetSjdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSjdemo();
            return;
        }

        this.sjdemoDirtyFlag = false;
        this.sjdemo = null;
    }
    /**
     *  设置属性值[文本框演示]
     *  @param wbkdemo
     */
    public void setWbkdemo(String wbkdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWbkdemo(wbkdemo);
            return;
        }
        if(wbkdemo!=null) {
            wbkdemo = StringHelper.trimRight(wbkdemo);
            if(wbkdemo.length()==0) {
                wbkdemo = null;
            }
        }
        this.wbkdemo =  wbkdemo;
        this.wbkdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[文本框演示]
     */
    public String getWbkdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWbkdemo();
        }
        return this.wbkdemo;
    }

    /**
     *  获取属性值[文本框演示]是否修改
     */
    public boolean isWbkdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWbkdemoDirty();
        }
        return this.wbkdemoDirtyFlag;
    }

    /**
     *  重置属性值[文本框演示]
     */
    public void resetWbkdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWbkdemo();
            return;
        }

        this.wbkdemoDirtyFlag = false;
        this.wbkdemo = null;
    }
    /**
     *  设置属性值[多行文本框演示]
     *  @param dhwbkdemo
     */
    public void setDHWBKDEMO(String dhwbkdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDHWBKDEMO(dhwbkdemo);
            return;
        }
        if(dhwbkdemo!=null) {
            dhwbkdemo = StringHelper.trimRight(dhwbkdemo);
            if(dhwbkdemo.length()==0) {
                dhwbkdemo = null;
            }
        }
        this.dhwbkdemo =  dhwbkdemo;
        this.dhwbkdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[多行文本框演示]
     */
    public String getDHWBKDEMO() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDHWBKDEMO();
        }
        return this.dhwbkdemo;
    }

    /**
     *  获取属性值[多行文本框演示]是否修改
     */
    public boolean isDHWBKDEMODirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDHWBKDEMODirty();
        }
        return this.dhwbkdemoDirtyFlag;
    }

    /**
     *  重置属性值[多行文本框演示]
     */
    public void resetDHWBKDEMO() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDHWBKDEMO();
            return;
        }

        this.dhwbkdemoDirtyFlag = false;
        this.dhwbkdemo = null;
    }
    /**
     *  设置属性值[图片上传演示]
     *  @param tpdemo
     */
    public void setTpdemo(String tpdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTpdemo(tpdemo);
            return;
        }
        if(tpdemo!=null) {
            tpdemo = StringHelper.trimRight(tpdemo);
            if(tpdemo.length()==0) {
                tpdemo = null;
            }
        }
        this.tpdemo =  tpdemo;
        this.tpdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[图片上传演示]
     */
    public String getTpdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTpdemo();
        }
        return this.tpdemo;
    }

    /**
     *  获取属性值[图片上传演示]是否修改
     */
    public boolean isTpdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTpdemoDirty();
        }
        return this.tpdemoDirtyFlag;
    }

    /**
     *  重置属性值[图片上传演示]
     */
    public void resetTpdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTpdemo();
            return;
        }

        this.tpdemoDirtyFlag = false;
        this.tpdemo = null;
    }
    /**
     *  设置属性值[文件上传演示]
     *  @param wjdemo
     */
    public void setWJDEMO(String wjdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWJDEMO(wjdemo);
            return;
        }
        if(wjdemo!=null) {
            wjdemo = StringHelper.trimRight(wjdemo);
            if(wjdemo.length()==0) {
                wjdemo = null;
            }
        }
        this.wjdemo =  wjdemo;
        this.wjdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[文件上传演示]
     */
    public String getWJDEMO() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWJDEMO();
        }
        return this.wjdemo;
    }

    /**
     *  获取属性值[文件上传演示]是否修改
     */
    public boolean isWJDEMODirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWJDEMODirty();
        }
        return this.wjdemoDirtyFlag;
    }

    /**
     *  重置属性值[文件上传演示]
     */
    public void resetWJDEMO() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWJDEMO();
            return;
        }

        this.wjdemoDirtyFlag = false;
        this.wjdemo = null;
    }
    /**
     *  设置属性值[图片列表上传演示]
     *  @param tplbdemo
     */
    public void setTplbdemo(String tplbdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTplbdemo(tplbdemo);
            return;
        }
        if(tplbdemo!=null) {
            tplbdemo = StringHelper.trimRight(tplbdemo);
            if(tplbdemo.length()==0) {
                tplbdemo = null;
            }
        }
        this.tplbdemo =  tplbdemo;
        this.tplbdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[图片列表上传演示]
     */
    public String getTplbdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTplbdemo();
        }
        return this.tplbdemo;
    }

    /**
     *  获取属性值[图片列表上传演示]是否修改
     */
    public boolean isTplbdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTplbdemoDirty();
        }
        return this.tplbdemoDirtyFlag;
    }

    /**
     *  重置属性值[图片列表上传演示]
     */
    public void resetTplbdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTplbdemo();
            return;
        }

        this.tplbdemoDirtyFlag = false;
        this.tplbdemo = null;
    }
    /**
     *  设置属性值[数据选择演示]
     *  @param sjxzdemo
     */
    public void setSjxzdemo(String sjxzdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSjxzdemo(sjxzdemo);
            return;
        }
        if(sjxzdemo!=null) {
            sjxzdemo = StringHelper.trimRight(sjxzdemo);
            if(sjxzdemo.length()==0) {
                sjxzdemo = null;
            }
        }
        this.sjxzdemo =  sjxzdemo;
        this.sjxzdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据选择演示]
     */
    public String getSjxzdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSjxzdemo();
        }
        return this.sjxzdemo;
    }

    /**
     *  获取属性值[数据选择演示]是否修改
     */
    public boolean isSjxzdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSjxzdemoDirty();
        }
        return this.sjxzdemoDirtyFlag;
    }

    /**
     *  重置属性值[数据选择演示]
     */
    public void resetSjxzdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSjxzdemo();
            return;
        }

        this.sjxzdemoDirtyFlag = false;
        this.sjxzdemo = null;
    }
    /**
     *  设置属性值[多数据选择演示]
     *  @param dsjxzdemo
     */
    public void setDsjxzdemo(String dsjxzdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDsjxzdemo(dsjxzdemo);
            return;
        }
        if(dsjxzdemo!=null) {
            dsjxzdemo = StringHelper.trimRight(dsjxzdemo);
            if(dsjxzdemo.length()==0) {
                dsjxzdemo = null;
            }
        }
        this.dsjxzdemo =  dsjxzdemo;
        this.dsjxzdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[多数据选择演示]
     */
    public String getDsjxzdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDsjxzdemo();
        }
        return this.dsjxzdemo;
    }

    /**
     *  获取属性值[多数据选择演示]是否修改
     */
    public boolean isDsjxzdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDsjxzdemoDirty();
        }
        return this.dsjxzdemoDirtyFlag;
    }

    /**
     *  重置属性值[多数据选择演示]
     */
    public void resetDsjxzdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDsjxzdemo();
            return;
        }

        this.dsjxzdemoDirtyFlag = false;
        this.dsjxzdemo = null;
    }
    /**
     *  设置属性值[单选列表演示]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     *  @param dxlbdemo
     */
    public void setDxlbdemo(String dxlbdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDxlbdemo(dxlbdemo);
            return;
        }
        if(dxlbdemo!=null) {
            dxlbdemo = StringHelper.trimRight(dxlbdemo);
            if(dxlbdemo.length()==0) {
                dxlbdemo = null;
            }
        }
        this.dxlbdemo =  dxlbdemo;
        this.dxlbdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[单选列表演示]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     */
    public String getDxlbdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDxlbdemo();
        }
        return this.dxlbdemo;
    }

    /**
     *  获取属性值[单选列表演示]是否修改
     */
    public boolean isDxlbdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDxlbdemoDirty();
        }
        return this.dxlbdemoDirtyFlag;
    }

    /**
     *  重置属性值[单选列表演示]
     */
    public void resetDxlbdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDxlbdemo();
            return;
        }

        this.dxlbdemoDirtyFlag = false;
        this.dxlbdemo = null;
    }
    /**
     *  设置属性值[下拉列表演示]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     *  @param xllbdemo
     */
    public void setXllbdemo(String xllbdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXllbdemo(xllbdemo);
            return;
        }
        if(xllbdemo!=null) {
            xllbdemo = StringHelper.trimRight(xllbdemo);
            if(xllbdemo.length()==0) {
                xllbdemo = null;
            }
        }
        this.xllbdemo =  xllbdemo;
        this.xllbdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[下拉列表演示]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     */
    public String getXllbdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXllbdemo();
        }
        return this.xllbdemo;
    }

    /**
     *  获取属性值[下拉列表演示]是否修改
     */
    public boolean isXllbdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXllbdemoDirty();
        }
        return this.xllbdemoDirtyFlag;
    }

    /**
     *  重置属性值[下拉列表演示]
     */
    public void resetXllbdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXllbdemo();
            return;
        }

        this.xllbdemoDirtyFlag = false;
        this.xllbdemo = null;
    }
    /**
     *  设置属性值[选项框演示]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     *  @param xxklbdemo
     */
    public void setXxklbdemo(String xxklbdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXxklbdemo(xxklbdemo);
            return;
        }
        if(xxklbdemo!=null) {
            xxklbdemo = StringHelper.trimRight(xxklbdemo);
            if(xxklbdemo.length()==0) {
                xxklbdemo = null;
            }
        }
        this.xxklbdemo =  xxklbdemo;
        this.xxklbdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[选项框演示]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     */
    public String getXxklbdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXxklbdemo();
        }
        return this.xxklbdemo;
    }

    /**
     *  获取属性值[选项框演示]是否修改
     */
    public boolean isXxklbdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXxklbdemoDirty();
        }
        return this.xxklbdemoDirtyFlag;
    }

    /**
     *  重置属性值[选项框演示]
     */
    public void resetXxklbdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXxklbdemo();
            return;
        }

        this.xxklbdemoDirtyFlag = false;
        this.xxklbdemo = null;
    }
    /**
     *  设置属性值[不可编辑演示]
     *  @param bkbjdemo
     */
    public void setBkbjdemo(String bkbjdemo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBkbjdemo(bkbjdemo);
            return;
        }
        if(bkbjdemo!=null) {
            bkbjdemo = StringHelper.trimRight(bkbjdemo);
            if(bkbjdemo.length()==0) {
                bkbjdemo = null;
            }
        }
        this.bkbjdemo =  bkbjdemo;
        this.bkbjdemoDirtyFlag  = true;
    }

    /**
     *  获取属性值[不可编辑演示]
     */
    public String getBkbjdemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBkbjdemo();
        }
        return this.bkbjdemo;
    }

    /**
     *  获取属性值[不可编辑演示]是否修改
     */
    public boolean isBkbjdemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBkbjdemoDirty();
        }
        return this.bkbjdemoDirtyFlag;
    }

    /**
     *  重置属性值[不可编辑演示]
     */
    public void resetBkbjdemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBkbjdemo();
            return;
        }

        this.bkbjdemoDirtyFlag = false;
        this.bkbjdemo = null;
    }
    /**
     *  设置属性值[演示申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param demosqzt
     */
    public void setDEMOSQZT(String demosqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEMOSQZT(demosqzt);
            return;
        }
        if(demosqzt!=null) {
            demosqzt = StringHelper.trimRight(demosqzt);
            if(demosqzt.length()==0) {
                demosqzt = null;
            }
        }
        this.demosqzt =  demosqzt;
        this.demosqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[演示申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getDEMOSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEMOSQZT();
        }
        return this.demosqzt;
    }

    /**
     *  获取属性值[演示申请状态]是否修改
     */
    public boolean isDEMOSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDEMOSQZTDirty();
        }
        return this.demosqztDirtyFlag;
    }

    /**
     *  重置属性值[演示申请状态]
     */
    public void resetDEMOSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEMOSQZT();
            return;
        }

        this.demosqztDirtyFlag = false;
        this.demosqzt = null;
    }
    /**
     *  设置属性值[演示申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param demosqbz
     */
    public void setDEMOSQBZ(String demosqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEMOSQBZ(demosqbz);
            return;
        }
        if(demosqbz!=null) {
            demosqbz = StringHelper.trimRight(demosqbz);
            if(demosqbz.length()==0) {
                demosqbz = null;
            }
        }
        this.demosqbz =  demosqbz;
        this.demosqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[演示申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getDEMOSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEMOSQBZ();
        }
        return this.demosqbz;
    }

    /**
     *  获取属性值[演示申请步骤]是否修改
     */
    public boolean isDEMOSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDEMOSQBZDirty();
        }
        return this.demosqbzDirtyFlag;
    }

    /**
     *  重置属性值[演示申请步骤]
     */
    public void resetDEMOSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEMOSQBZ();
            return;
        }

        this.demosqbzDirtyFlag = false;
        this.demosqbz = null;
    }
    /**
     *  设置属性值[工作流实例]
     *  @param wfinstanceid
     */
    public void setWFINSTANCEID(String wfinstanceid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFINSTANCEID(wfinstanceid);
            return;
        }
        if(wfinstanceid!=null) {
            wfinstanceid = StringHelper.trimRight(wfinstanceid);
            if(wfinstanceid.length()==0) {
                wfinstanceid = null;
            }
        }
        this.wfinstanceid =  wfinstanceid;
        this.wfinstanceidDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作流实例]
     */
    public String getWFINSTANCEID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFINSTANCEID();
        }
        return this.wfinstanceid;
    }

    /**
     *  获取属性值[工作流实例]是否修改
     */
    public boolean isWFINSTANCEIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFINSTANCEIDDirty();
        }
        return this.wfinstanceidDirtyFlag;
    }

    /**
     *  重置属性值[工作流实例]
     */
    public void resetWFINSTANCEID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFINSTANCEID();
            return;
        }

        this.wfinstanceidDirtyFlag = false;
        this.wfinstanceid = null;
    }
    /**
     *  设置属性值[工作流状态]代码表：com.sa.unip.srv.codelist.WFStatesCodeListModel
     *  @param wfstate
     */
    public void setWFSTATE(Integer wfstate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFSTATE(wfstate);
            return;
        }
        this.wfstate =  wfstate;
        this.wfstateDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作流状态]代码表：com.sa.unip.srv.codelist.WFStatesCodeListModel
     */
    public Integer getWFSTATE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFSTATE();
        }
        return this.wfstate;
    }

    /**
     *  获取属性值[工作流状态]是否修改
     */
    public boolean isWFSTATEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFSTATEDirty();
        }
        return this.wfstateDirtyFlag;
    }

    /**
     *  重置属性值[工作流状态]
     */
    public void resetWFSTATE() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFSTATE();
            return;
        }

        this.wfstateDirtyFlag = false;
        this.wfstate = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        Demo.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(Demo et) {
        et.resetDemoName();
        et.resetDemoId();
        et.resetCreateMan();
        et.resetUpdateMan();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetSjdemo();
        et.resetWbkdemo();
        et.resetDHWBKDEMO();
        et.resetTpdemo();
        et.resetWJDEMO();
        et.resetTplbdemo();
        et.resetSjxzdemo();
        et.resetDsjxzdemo();
        et.resetDxlbdemo();
        et.resetXllbdemo();
        et.resetXxklbdemo();
        et.resetBkbjdemo();
        et.resetDEMOSQZT();
        et.resetDEMOSQBZ();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isDemoNameDirty()) {
            params.put(FIELD_DEMONAME,getDemoName());
        }
        if(!bDirtyOnly || isDemoIdDirty()) {
            params.put(FIELD_DEMOID,getDemoId());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isSjdemoDirty()) {
            params.put(FIELD_SJDEMO,getSjdemo());
        }
        if(!bDirtyOnly || isWbkdemoDirty()) {
            params.put(FIELD_WBKDEMO,getWbkdemo());
        }
        if(!bDirtyOnly || isDHWBKDEMODirty()) {
            params.put(FIELD_DHWBKDEMO,getDHWBKDEMO());
        }
        if(!bDirtyOnly || isTpdemoDirty()) {
            params.put(FIELD_TPDEMO,getTpdemo());
        }
        if(!bDirtyOnly || isWJDEMODirty()) {
            params.put(FIELD_WJDEMO,getWJDEMO());
        }
        if(!bDirtyOnly || isTplbdemoDirty()) {
            params.put(FIELD_TPLBDEMO,getTplbdemo());
        }
        if(!bDirtyOnly || isSjxzdemoDirty()) {
            params.put(FIELD_SJXZDEMO,getSjxzdemo());
        }
        if(!bDirtyOnly || isDsjxzdemoDirty()) {
            params.put(FIELD_DSJXZDEMO,getDsjxzdemo());
        }
        if(!bDirtyOnly || isDxlbdemoDirty()) {
            params.put(FIELD_DXLBDEMO,getDxlbdemo());
        }
        if(!bDirtyOnly || isXllbdemoDirty()) {
            params.put(FIELD_XLLBDEMO,getXllbdemo());
        }
        if(!bDirtyOnly || isXxklbdemoDirty()) {
            params.put(FIELD_XXKLBDEMO,getXxklbdemo());
        }
        if(!bDirtyOnly || isBkbjdemoDirty()) {
            params.put(FIELD_BKBJDEMO,getBkbjdemo());
        }
        if(!bDirtyOnly || isDEMOSQZTDirty()) {
            params.put(FIELD_DEMOSQZT,getDEMOSQZT());
        }
        if(!bDirtyOnly || isDEMOSQBZDirty()) {
            params.put(FIELD_DEMOSQBZ,getDEMOSQBZ());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        super.onFillMap(params, bDirtyOnly);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#get(java.lang.String)
     */
    @Override
    public Object get(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().get(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.get(strParamName);

        return  Demo.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(Demo et,int index) throws Exception {

        switch(index) {
        case INDEX_DEMONAME:
            return et.getDemoName();
        case INDEX_DEMOID:
            return et.getDemoId();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_SJDEMO:
            return et.getSjdemo();
        case INDEX_WBKDEMO:
            return et.getWbkdemo();
        case INDEX_DHWBKDEMO:
            return et.getDHWBKDEMO();
        case INDEX_TPDEMO:
            return et.getTpdemo();
        case INDEX_WJDEMO:
            return et.getWJDEMO();
        case INDEX_TPLBDEMO:
            return et.getTplbdemo();
        case INDEX_SJXZDEMO:
            return et.getSjxzdemo();
        case INDEX_DSJXZDEMO:
            return et.getDsjxzdemo();
        case INDEX_DXLBDEMO:
            return et.getDxlbdemo();
        case INDEX_XLLBDEMO:
            return et.getXllbdemo();
        case INDEX_XXKLBDEMO:
            return et.getXxklbdemo();
        case INDEX_BKBJDEMO:
            return et.getBkbjdemo();
        case INDEX_DEMOSQZT:
            return et.getDEMOSQZT();
        case INDEX_DEMOSQBZ:
            return et.getDEMOSQBZ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#set(java.lang.String, java.lang.Object)
     */
    @Override
    public void set(String strParamName,Object objValue) throws Exception {
        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().set(strParamName,objValue);
            return;
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null) {
            super.set(strParamName,objValue);
            return;
        }

        Demo.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(Demo et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_DEMONAME:
            et.setDemoName(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEMOID:
            et.setDemoId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SJDEMO:
            et.setSjdemo(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_WBKDEMO:
            et.setWbkdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_DHWBKDEMO:
            et.setDHWBKDEMO(DataObject.getStringValue(obj));
            return ;
        case INDEX_TPDEMO:
            et.setTpdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_WJDEMO:
            et.setWJDEMO(DataObject.getStringValue(obj));
            return ;
        case INDEX_TPLBDEMO:
            et.setTplbdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_SJXZDEMO:
            et.setSjxzdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSJXZDEMO:
            et.setDsjxzdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_DXLBDEMO:
            et.setDxlbdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_XLLBDEMO:
            et.setXllbdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_XXKLBDEMO:
            et.setXxklbdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_BKBJDEMO:
            et.setBkbjdemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEMOSQZT:
            et.setDEMOSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEMOSQBZ:
            et.setDEMOSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#isNull(java.lang.String)
     */
    @Override
    public boolean isNull(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNull(strParamName);
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.isNull(strParamName);

        return  Demo.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(Demo et,int index) throws Exception {

        switch(index) {
        case INDEX_DEMONAME:
            return et.getDemoName()==null;
        case INDEX_DEMOID:
            return et.getDemoId()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_SJDEMO:
            return et.getSjdemo()==null;
        case INDEX_WBKDEMO:
            return et.getWbkdemo()==null;
        case INDEX_DHWBKDEMO:
            return et.getDHWBKDEMO()==null;
        case INDEX_TPDEMO:
            return et.getTpdemo()==null;
        case INDEX_WJDEMO:
            return et.getWJDEMO()==null;
        case INDEX_TPLBDEMO:
            return et.getTplbdemo()==null;
        case INDEX_SJXZDEMO:
            return et.getSjxzdemo()==null;
        case INDEX_DSJXZDEMO:
            return et.getDsjxzdemo()==null;
        case INDEX_DXLBDEMO:
            return et.getDxlbdemo()==null;
        case INDEX_XLLBDEMO:
            return et.getXllbdemo()==null;
        case INDEX_XXKLBDEMO:
            return et.getXxklbdemo()==null;
        case INDEX_BKBJDEMO:
            return et.getBkbjdemo()==null;
        case INDEX_DEMOSQZT:
            return et.getDEMOSQZT()==null;
        case INDEX_DEMOSQBZ:
            return et.getDEMOSQBZ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        default:
            throw new Exception("不明属性标识");
        }
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#contains(java.lang.String)
     */
    @Override
    public boolean contains(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().contains(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.contains(strParamName);

        return  Demo.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(Demo et,int index) throws Exception {

        switch(index) {
        case INDEX_DEMONAME:
            return et.isDemoNameDirty();
        case INDEX_DEMOID:
            return et.isDemoIdDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_SJDEMO:
            return et.isSjdemoDirty();
        case INDEX_WBKDEMO:
            return et.isWbkdemoDirty();
        case INDEX_DHWBKDEMO:
            return et.isDHWBKDEMODirty();
        case INDEX_TPDEMO:
            return et.isTpdemoDirty();
        case INDEX_WJDEMO:
            return et.isWJDEMODirty();
        case INDEX_TPLBDEMO:
            return et.isTplbdemoDirty();
        case INDEX_SJXZDEMO:
            return et.isSjxzdemoDirty();
        case INDEX_DSJXZDEMO:
            return et.isDsjxzdemoDirty();
        case INDEX_DXLBDEMO:
            return et.isDxlbdemoDirty();
        case INDEX_XLLBDEMO:
            return et.isXllbdemoDirty();
        case INDEX_XXKLBDEMO:
            return et.isXxklbdemoDirty();
        case INDEX_BKBJDEMO:
            return et.isBkbjdemoDirty();
        case INDEX_DEMOSQZT:
            return et.isDEMOSQZTDirty();
        case INDEX_DEMOSQBZ:
            return et.isDEMOSQBZDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillJSONObject(net.sf.json.JSONObject, boolean)
     */
    @Override
    protected void onFillJSONObject(JSONObject objJSON, boolean bIncludeEmpty) throws Exception {
        fillJSONObject(this,objJSON,bIncludeEmpty);
        super.onFillJSONObject(objJSON, bIncludeEmpty);
    }

    /**
     * 填充当前对象到JSON
     * @param et 当前数据对象
     * @param json JSON对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static  void fillJSONObject(Demo et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getDemoName()!=null) {
            JSONObjectHelper.put(json,"demoname",getJSONValue(et.getDemoName()),false);
        }
        if(bIncEmpty||et.getDemoId()!=null) {
            JSONObjectHelper.put(json,"demoid",getJSONValue(et.getDemoId()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getSjdemo()!=null) {
            JSONObjectHelper.put(json,"sjdemo",getJSONValue(et.getSjdemo()),false);
        }
        if(bIncEmpty||et.getWbkdemo()!=null) {
            JSONObjectHelper.put(json,"wbkdemo",getJSONValue(et.getWbkdemo()),false);
        }
        if(bIncEmpty||et.getDHWBKDEMO()!=null) {
            JSONObjectHelper.put(json,"dhwbkdemo",getJSONValue(et.getDHWBKDEMO()),false);
        }
        if(bIncEmpty||et.getTpdemo()!=null) {
            JSONObjectHelper.put(json,"tpdemo",getJSONValue(et.getTpdemo()),false);
        }
        if(bIncEmpty||et.getWJDEMO()!=null) {
            JSONObjectHelper.put(json,"wjdemo",getJSONValue(et.getWJDEMO()),false);
        }
        if(bIncEmpty||et.getTplbdemo()!=null) {
            JSONObjectHelper.put(json,"tplbdemo",getJSONValue(et.getTplbdemo()),false);
        }
        if(bIncEmpty||et.getSjxzdemo()!=null) {
            JSONObjectHelper.put(json,"sjxzdemo",getJSONValue(et.getSjxzdemo()),false);
        }
        if(bIncEmpty||et.getDsjxzdemo()!=null) {
            JSONObjectHelper.put(json,"dsjxzdemo",getJSONValue(et.getDsjxzdemo()),false);
        }
        if(bIncEmpty||et.getDxlbdemo()!=null) {
            JSONObjectHelper.put(json,"dxlbdemo",getJSONValue(et.getDxlbdemo()),false);
        }
        if(bIncEmpty||et.getXllbdemo()!=null) {
            JSONObjectHelper.put(json,"xllbdemo",getJSONValue(et.getXllbdemo()),false);
        }
        if(bIncEmpty||et.getXxklbdemo()!=null) {
            JSONObjectHelper.put(json,"xxklbdemo",getJSONValue(et.getXxklbdemo()),false);
        }
        if(bIncEmpty||et.getBkbjdemo()!=null) {
            JSONObjectHelper.put(json,"bkbjdemo",getJSONValue(et.getBkbjdemo()),false);
        }
        if(bIncEmpty||et.getDEMOSQZT()!=null) {
            JSONObjectHelper.put(json,"demosqzt",getJSONValue(et.getDEMOSQZT()),false);
        }
        if(bIncEmpty||et.getDEMOSQBZ()!=null) {
            JSONObjectHelper.put(json,"demosqbz",getJSONValue(et.getDEMOSQBZ()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillXmlNode(net.ibizsys.paas.xml.XmlNode, boolean)
     */
    @Override
    protected void onFillXmlNode(XmlNode xmlNode,boolean bIncludeEmpty) throws Exception {
        fillXmlNode(this,xmlNode,bIncludeEmpty);
        super.onFillXmlNode(xmlNode, bIncludeEmpty);
    }

    /**
     * 填充当前对象到Xml节点中
     * @param et 当前数据对象
     * @param node Xml节点
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void fillXmlNode(Demo et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getDemoName()!=null) {
            Object obj = et.getDemoName();
            node.setAttribute("DEMONAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDemoId()!=null) {
            Object obj = et.getDemoId();
            node.setAttribute("DEMOID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getSjdemo()!=null) {
            Object obj = et.getSjdemo();
            node.setAttribute("SJDEMO",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getWbkdemo()!=null) {
            Object obj = et.getWbkdemo();
            node.setAttribute("WBKDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDHWBKDEMO()!=null) {
            Object obj = et.getDHWBKDEMO();
            node.setAttribute("DHWBKDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTpdemo()!=null) {
            Object obj = et.getTpdemo();
            node.setAttribute("TPDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWJDEMO()!=null) {
            Object obj = et.getWJDEMO();
            node.setAttribute("WJDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTplbdemo()!=null) {
            Object obj = et.getTplbdemo();
            node.setAttribute("TPLBDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSjxzdemo()!=null) {
            Object obj = et.getSjxzdemo();
            node.setAttribute("SJXZDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDsjxzdemo()!=null) {
            Object obj = et.getDsjxzdemo();
            node.setAttribute("DSJXZDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDxlbdemo()!=null) {
            Object obj = et.getDxlbdemo();
            node.setAttribute("DXLBDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXllbdemo()!=null) {
            Object obj = et.getXllbdemo();
            node.setAttribute("XLLBDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXxklbdemo()!=null) {
            Object obj = et.getXxklbdemo();
            node.setAttribute("XXKLBDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBkbjdemo()!=null) {
            Object obj = et.getBkbjdemo();
            node.setAttribute("BKBJDEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEMOSQZT()!=null) {
            Object obj = et.getDEMOSQZT();
            node.setAttribute("DEMOSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEMOSQBZ()!=null) {
            Object obj = et.getDEMOSQBZ();
            node.setAttribute("DEMOSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        Demo.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(Demo et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isDemoNameDirty() && (bIncEmpty||et.getDemoName()!=null)) {
            dst.set(FIELD_DEMONAME,et.getDemoName());
        }
        if(et.isDemoIdDirty() && (bIncEmpty||et.getDemoId()!=null)) {
            dst.set(FIELD_DEMOID,et.getDemoId());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isSjdemoDirty() && (bIncEmpty||et.getSjdemo()!=null)) {
            dst.set(FIELD_SJDEMO,et.getSjdemo());
        }
        if(et.isWbkdemoDirty() && (bIncEmpty||et.getWbkdemo()!=null)) {
            dst.set(FIELD_WBKDEMO,et.getWbkdemo());
        }
        if(et.isDHWBKDEMODirty() && (bIncEmpty||et.getDHWBKDEMO()!=null)) {
            dst.set(FIELD_DHWBKDEMO,et.getDHWBKDEMO());
        }
        if(et.isTpdemoDirty() && (bIncEmpty||et.getTpdemo()!=null)) {
            dst.set(FIELD_TPDEMO,et.getTpdemo());
        }
        if(et.isWJDEMODirty() && (bIncEmpty||et.getWJDEMO()!=null)) {
            dst.set(FIELD_WJDEMO,et.getWJDEMO());
        }
        if(et.isTplbdemoDirty() && (bIncEmpty||et.getTplbdemo()!=null)) {
            dst.set(FIELD_TPLBDEMO,et.getTplbdemo());
        }
        if(et.isSjxzdemoDirty() && (bIncEmpty||et.getSjxzdemo()!=null)) {
            dst.set(FIELD_SJXZDEMO,et.getSjxzdemo());
        }
        if(et.isDsjxzdemoDirty() && (bIncEmpty||et.getDsjxzdemo()!=null)) {
            dst.set(FIELD_DSJXZDEMO,et.getDsjxzdemo());
        }
        if(et.isDxlbdemoDirty() && (bIncEmpty||et.getDxlbdemo()!=null)) {
            dst.set(FIELD_DXLBDEMO,et.getDxlbdemo());
        }
        if(et.isXllbdemoDirty() && (bIncEmpty||et.getXllbdemo()!=null)) {
            dst.set(FIELD_XLLBDEMO,et.getXllbdemo());
        }
        if(et.isXxklbdemoDirty() && (bIncEmpty||et.getXxklbdemo()!=null)) {
            dst.set(FIELD_XXKLBDEMO,et.getXxklbdemo());
        }
        if(et.isBkbjdemoDirty() && (bIncEmpty||et.getBkbjdemo()!=null)) {
            dst.set(FIELD_BKBJDEMO,et.getBkbjdemo());
        }
        if(et.isDEMOSQZTDirty() && (bIncEmpty||et.getDEMOSQZT()!=null)) {
            dst.set(FIELD_DEMOSQZT,et.getDEMOSQZT());
        }
        if(et.isDEMOSQBZDirty() && (bIncEmpty||et.getDEMOSQBZ()!=null)) {
            dst.set(FIELD_DEMOSQBZ,et.getDEMOSQBZ());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#remove(java.lang.String)
     */
    @Override
    public boolean remove(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().remove(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.remove(strParamName);
        return  Demo.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(Demo et,int index) throws Exception {
        switch(index) {
        case INDEX_DEMONAME:
            et.resetDemoName();
            return true;
        case INDEX_DEMOID:
            et.resetDemoId();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_SJDEMO:
            et.resetSjdemo();
            return true;
        case INDEX_WBKDEMO:
            et.resetWbkdemo();
            return true;
        case INDEX_DHWBKDEMO:
            et.resetDHWBKDEMO();
            return true;
        case INDEX_TPDEMO:
            et.resetTpdemo();
            return true;
        case INDEX_WJDEMO:
            et.resetWJDEMO();
            return true;
        case INDEX_TPLBDEMO:
            et.resetTplbdemo();
            return true;
        case INDEX_SJXZDEMO:
            et.resetSjxzdemo();
            return true;
        case INDEX_DSJXZDEMO:
            et.resetDsjxzdemo();
            return true;
        case INDEX_DXLBDEMO:
            et.resetDxlbdemo();
            return true;
        case INDEX_XLLBDEMO:
            et.resetXllbdemo();
            return true;
        case INDEX_XXKLBDEMO:
            et.resetXxklbdemo();
            return true;
        case INDEX_BKBJDEMO:
            et.resetBkbjdemo();
            return true;
        case INDEX_DEMOSQZT:
            et.resetDEMOSQZT();
            return true;
        case INDEX_DEMOSQBZ:
            et.resetDEMOSQBZ();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private Demo getProxyEntity() {
        return this.proxyDemo;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyDemo = null;
        if(proxyDataObject!=null && proxyDataObject instanceof Demo) {
            this.proxyDemo = (Demo)proxyDataObject;
        }

    }

}