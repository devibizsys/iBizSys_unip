/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.entity;


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
 * 实体[OA_TZGG] 数据对象
 */
public class OA_TZGG extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_TZGG.class);
    /**
     *   实体属性标识[公告是否审核通过]
     */
    public final static String FIELD_GGSFSHTG = "GGSFSHTG";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[通知公告标识]
     */
    public final static String FIELD_OA_TZGGID = "OA_TZGGID";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[通知公告标题]
     */
    public final static String FIELD_OA_TZGGNAME = "OA_TZGGNAME";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[通知公告内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[发送时间]
     */
    public final static String FIELD_FSSJ = "FSSJ";
    /**
     *   实体属性标识[通知公告类型]
     */
    public final static String FIELD_TZGGLX = "TZGGLX";
    /**
     *   实体属性标识[发送人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[接收人员]
     */
    public final static String FIELD_JSR = "JSR";
    /**
     *   实体属性标识[发送人名称]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[是否已发送]
     */
    public final static String FIELD_SFYFS = "SFYFS";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[通知公告申请步骤]
     */
    public final static String FIELD_TZGGSQBZ = "TZGGSQBZ";
    /**
     *   实体属性标识[通知公告申请状态]
     */
    public final static String FIELD_TZGGSQZT = "TZGGSQZT";

    private final static int INDEX_GGSFSHTG = 0;
    private final static int INDEX_MEMO = 1;
    private final static int INDEX_OA_TZGGID = 2;
    private final static int INDEX_UPDATEMAN = 3;
    private final static int INDEX_OA_TZGGNAME = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_CREATEDATE = 6;
    private final static int INDEX_CREATEMAN = 7;
    private final static int INDEX_CONTENT = 8;
    private final static int INDEX_FSSJ = 9;
    private final static int INDEX_TZGGLX = 10;
    private final static int INDEX_ORGUSERID = 11;
    private final static int INDEX_JSR = 12;
    private final static int INDEX_ORGUSERNAME = 13;
    private final static int INDEX_SFYFS = 14;
    private final static int INDEX_WFINSTANCEID = 15;
    private final static int INDEX_WFSTATE = 16;
    private final static int INDEX_TZGGSQBZ = 17;
    private final static int INDEX_TZGGSQZT = 18;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GGSFSHTG, INDEX_GGSFSHTG);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_OA_TZGGID, INDEX_OA_TZGGID);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_OA_TZGGNAME, INDEX_OA_TZGGNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_FSSJ, INDEX_FSSJ);
        fieldIndexMap.put( FIELD_TZGGLX, INDEX_TZGGLX);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_JSR, INDEX_JSR);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_SFYFS, INDEX_SFYFS);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_TZGGSQBZ, INDEX_TZGGSQBZ);
        fieldIndexMap.put( FIELD_TZGGSQZT, INDEX_TZGGSQZT);
    }

    private OA_TZGG proxyOA_TZGG = null;

    public OA_TZGG() {
        super();
    }
    private boolean ggsfshtgDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean oa_tzggidDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean oa_tzggnameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean fssjDirtyFlag = false;
    private boolean tzgglxDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean jsrDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean sfyfsDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean tzggsqbzDirtyFlag = false;
    private boolean tzggsqztDirtyFlag = false;

    @Column(name="ggsfshtg")
    private String ggsfshtg;
    @Column(name="memo")
    private String memo;
    @Column(name="oa_tzggid")
    private String oa_tzggid;
    @Column(name="updateman")
    private String updateman;
    @Column(name="oa_tzggname")
    private String oa_tzggname;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="content")
    private String content;
    @Column(name="fssj")
    private Timestamp fssj;
    @Column(name="tzgglx")
    private String tzgglx;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="jsr")
    private String jsr;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="sfyfs")
    private String sfyfs;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="tzggsqbz")
    private String tzggsqbz;
    @Column(name="tzggsqzt")
    private String tzggsqzt;


    /**
     *  设置属性值[公告是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param ggsfshtg
     */
    public void setGgsfshtg(String ggsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGgsfshtg(ggsfshtg);
            return;
        }
        if(ggsfshtg!=null) {
            ggsfshtg = StringHelper.trimRight(ggsfshtg);
            if(ggsfshtg.length()==0) {
                ggsfshtg = null;
            }
        }
        this.ggsfshtg =  ggsfshtg;
        this.ggsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[公告是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getGgsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGgsfshtg();
        }
        return this.ggsfshtg;
    }

    /**
     *  获取属性值[公告是否审核通过]是否修改
     */
    public boolean isGgsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGgsfshtgDirty();
        }
        return this.ggsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[公告是否审核通过]
     */
    public void resetGgsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGgsfshtg();
            return;
        }

        this.ggsfshtgDirtyFlag = false;
        this.ggsfshtg = null;
    }
    /**
     *  设置属性值[审核意见]
     *  @param memo
     */
    public void setMemo(String memo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMemo(memo);
            return;
        }
        if(memo!=null) {
            memo = StringHelper.trimRight(memo);
            if(memo.length()==0) {
                memo = null;
            }
        }
        this.memo =  memo;
        this.memoDirtyFlag  = true;
    }

    /**
     *  获取属性值[审核意见]
     */
    public String getMemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMemo();
        }
        return this.memo;
    }

    /**
     *  获取属性值[审核意见]是否修改
     */
    public boolean isMemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMemoDirty();
        }
        return this.memoDirtyFlag;
    }

    /**
     *  重置属性值[审核意见]
     */
    public void resetMemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMemo();
            return;
        }

        this.memoDirtyFlag = false;
        this.memo = null;
    }
    /**
     *  设置属性值[通知公告标识]
     *  @param oa_tzggid
     */
    public void setOA_TZGGId(String oa_tzggid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_TZGGId(oa_tzggid);
            return;
        }
        if(oa_tzggid!=null) {
            oa_tzggid = StringHelper.trimRight(oa_tzggid);
            if(oa_tzggid.length()==0) {
                oa_tzggid = null;
            }
        }
        this.oa_tzggid =  oa_tzggid;
        this.oa_tzggidDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告标识]
     */
    public String getOA_TZGGId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_TZGGId();
        }
        return this.oa_tzggid;
    }

    /**
     *  获取属性值[通知公告标识]是否修改
     */
    public boolean isOA_TZGGIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_TZGGIdDirty();
        }
        return this.oa_tzggidDirtyFlag;
    }

    /**
     *  重置属性值[通知公告标识]
     */
    public void resetOA_TZGGId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_TZGGId();
            return;
        }

        this.oa_tzggidDirtyFlag = false;
        this.oa_tzggid = null;
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
     *  设置属性值[通知公告标题]
     *  @param oa_tzggname
     */
    public void setOA_TZGGName(String oa_tzggname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_TZGGName(oa_tzggname);
            return;
        }
        if(oa_tzggname!=null) {
            oa_tzggname = StringHelper.trimRight(oa_tzggname);
            if(oa_tzggname.length()==0) {
                oa_tzggname = null;
            }
        }
        this.oa_tzggname =  oa_tzggname;
        this.oa_tzggnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告标题]
     */
    public String getOA_TZGGName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_TZGGName();
        }
        return this.oa_tzggname;
    }

    /**
     *  获取属性值[通知公告标题]是否修改
     */
    public boolean isOA_TZGGNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_TZGGNameDirty();
        }
        return this.oa_tzggnameDirtyFlag;
    }

    /**
     *  重置属性值[通知公告标题]
     */
    public void resetOA_TZGGName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_TZGGName();
            return;
        }

        this.oa_tzggnameDirtyFlag = false;
        this.oa_tzggname = null;
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
     *  设置属性值[通知公告内容]
     *  @param content
     */
    public void setCONTENT(String content) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCONTENT(content);
            return;
        }
        if(content!=null) {
            content = StringHelper.trimRight(content);
            if(content.length()==0) {
                content = null;
            }
        }
        this.content =  content;
        this.contentDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[通知公告内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[通知公告内容]
     */
    public void resetCONTENT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCONTENT();
            return;
        }

        this.contentDirtyFlag = false;
        this.content = null;
    }
    /**
     *  设置属性值[发送时间]
     *  @param fssj
     */
    public void setFSSJ(Timestamp fssj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFSSJ(fssj);
            return;
        }
        this.fssj =  fssj;
        this.fssjDirtyFlag  = true;
    }

    /**
     *  获取属性值[发送时间]
     */
    public Timestamp getFSSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFSSJ();
        }
        return this.fssj;
    }

    /**
     *  获取属性值[发送时间]是否修改
     */
    public boolean isFSSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFSSJDirty();
        }
        return this.fssjDirtyFlag;
    }

    /**
     *  重置属性值[发送时间]
     */
    public void resetFSSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFSSJ();
            return;
        }

        this.fssjDirtyFlag = false;
        this.fssj = null;
    }
    /**
     *  设置属性值[通知公告类型]代码表：com.sa.unip.srv.codelist.TZGGLXCodeListModel
     *  @param tzgglx
     */
    public void setTZGGLX(String tzgglx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTZGGLX(tzgglx);
            return;
        }
        if(tzgglx!=null) {
            tzgglx = StringHelper.trimRight(tzgglx);
            if(tzgglx.length()==0) {
                tzgglx = null;
            }
        }
        this.tzgglx =  tzgglx;
        this.tzgglxDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告类型]代码表：com.sa.unip.srv.codelist.TZGGLXCodeListModel
     */
    public String getTZGGLX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTZGGLX();
        }
        return this.tzgglx;
    }

    /**
     *  获取属性值[通知公告类型]是否修改
     */
    public boolean isTZGGLXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTZGGLXDirty();
        }
        return this.tzgglxDirtyFlag;
    }

    /**
     *  重置属性值[通知公告类型]
     */
    public void resetTZGGLX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTZGGLX();
            return;
        }

        this.tzgglxDirtyFlag = false;
        this.tzgglx = null;
    }
    /**
     *  设置属性值[发送人标识]
     *  @param orguserid
     */
    public void setOrgUserId(String orguserid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserId(orguserid);
            return;
        }
        if(orguserid!=null) {
            orguserid = StringHelper.trimRight(orguserid);
            if(orguserid.length()==0) {
                orguserid = null;
            }
        }
        this.orguserid =  orguserid;
        this.orguseridDirtyFlag  = true;
    }

    /**
     *  获取属性值[发送人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[发送人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[发送人标识]
     */
    public void resetOrgUserId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserId();
            return;
        }

        this.orguseridDirtyFlag = false;
        this.orguserid = null;
    }
    /**
     *  设置属性值[接收人员]
     *  @param jsr
     */
    public void setJSR(String jsr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJSR(jsr);
            return;
        }
        if(jsr!=null) {
            jsr = StringHelper.trimRight(jsr);
            if(jsr.length()==0) {
                jsr = null;
            }
        }
        this.jsr =  jsr;
        this.jsrDirtyFlag  = true;
    }

    /**
     *  获取属性值[接收人员]
     */
    public String getJSR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJSR();
        }
        return this.jsr;
    }

    /**
     *  获取属性值[接收人员]是否修改
     */
    public boolean isJSRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJSRDirty();
        }
        return this.jsrDirtyFlag;
    }

    /**
     *  重置属性值[接收人员]
     */
    public void resetJSR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJSR();
            return;
        }

        this.jsrDirtyFlag = false;
        this.jsr = null;
    }
    /**
     *  设置属性值[发送人名称]
     *  @param orgusername
     */
    public void setOrgUserName(String orgusername) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserName(orgusername);
            return;
        }
        if(orgusername!=null) {
            orgusername = StringHelper.trimRight(orgusername);
            if(orgusername.length()==0) {
                orgusername = null;
            }
        }
        this.orgusername =  orgusername;
        this.orgusernameDirtyFlag  = true;
    }

    /**
     *  获取属性值[发送人名称]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[发送人名称]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[发送人名称]
     */
    public void resetOrgUserName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserName();
            return;
        }

        this.orgusernameDirtyFlag = false;
        this.orgusername = null;
    }
    /**
     *  设置属性值[是否已发送]代码表：com.sa.unip.srv.codelist.SFYFSCodeListModel
     *  @param sfyfs
     */
    public void setSFYFS(String sfyfs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSFYFS(sfyfs);
            return;
        }
        if(sfyfs!=null) {
            sfyfs = StringHelper.trimRight(sfyfs);
            if(sfyfs.length()==0) {
                sfyfs = null;
            }
        }
        this.sfyfs =  sfyfs;
        this.sfyfsDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否已发送]代码表：com.sa.unip.srv.codelist.SFYFSCodeListModel
     */
    public String getSFYFS() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSFYFS();
        }
        return this.sfyfs;
    }

    /**
     *  获取属性值[是否已发送]是否修改
     */
    public boolean isSFYFSDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSFYFSDirty();
        }
        return this.sfyfsDirtyFlag;
    }

    /**
     *  重置属性值[是否已发送]
     */
    public void resetSFYFS() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSFYFS();
            return;
        }

        this.sfyfsDirtyFlag = false;
        this.sfyfs = null;
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
    /**
     *  设置属性值[通知公告申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param tzggsqbz
     */
    public void setTZGGSQBZ(String tzggsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTZGGSQBZ(tzggsqbz);
            return;
        }
        if(tzggsqbz!=null) {
            tzggsqbz = StringHelper.trimRight(tzggsqbz);
            if(tzggsqbz.length()==0) {
                tzggsqbz = null;
            }
        }
        this.tzggsqbz =  tzggsqbz;
        this.tzggsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getTZGGSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTZGGSQBZ();
        }
        return this.tzggsqbz;
    }

    /**
     *  获取属性值[通知公告申请步骤]是否修改
     */
    public boolean isTZGGSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTZGGSQBZDirty();
        }
        return this.tzggsqbzDirtyFlag;
    }

    /**
     *  重置属性值[通知公告申请步骤]
     */
    public void resetTZGGSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTZGGSQBZ();
            return;
        }

        this.tzggsqbzDirtyFlag = false;
        this.tzggsqbz = null;
    }
    /**
     *  设置属性值[通知公告申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param tzggsqzt
     */
    public void setTZGGSQZT(String tzggsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTZGGSQZT(tzggsqzt);
            return;
        }
        if(tzggsqzt!=null) {
            tzggsqzt = StringHelper.trimRight(tzggsqzt);
            if(tzggsqzt.length()==0) {
                tzggsqzt = null;
            }
        }
        this.tzggsqzt =  tzggsqzt;
        this.tzggsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getTZGGSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTZGGSQZT();
        }
        return this.tzggsqzt;
    }

    /**
     *  获取属性值[通知公告申请状态]是否修改
     */
    public boolean isTZGGSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTZGGSQZTDirty();
        }
        return this.tzggsqztDirtyFlag;
    }

    /**
     *  重置属性值[通知公告申请状态]
     */
    public void resetTZGGSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTZGGSQZT();
            return;
        }

        this.tzggsqztDirtyFlag = false;
        this.tzggsqzt = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_TZGG.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_TZGG et) {
        et.resetGgsfshtg();
        et.resetMemo();
        et.resetOA_TZGGId();
        et.resetUpdateMan();
        et.resetOA_TZGGName();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetCONTENT();
        et.resetFSSJ();
        et.resetTZGGLX();
        et.resetOrgUserId();
        et.resetJSR();
        et.resetOrgUserName();
        et.resetSFYFS();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetTZGGSQBZ();
        et.resetTZGGSQZT();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isGgsfshtgDirty()) {
            params.put(FIELD_GGSFSHTG,getGgsfshtg());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOA_TZGGIdDirty()) {
            params.put(FIELD_OA_TZGGID,getOA_TZGGId());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isOA_TZGGNameDirty()) {
            params.put(FIELD_OA_TZGGNAME,getOA_TZGGName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isFSSJDirty()) {
            params.put(FIELD_FSSJ,getFSSJ());
        }
        if(!bDirtyOnly || isTZGGLXDirty()) {
            params.put(FIELD_TZGGLX,getTZGGLX());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isJSRDirty()) {
            params.put(FIELD_JSR,getJSR());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isSFYFSDirty()) {
            params.put(FIELD_SFYFS,getSFYFS());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isTZGGSQBZDirty()) {
            params.put(FIELD_TZGGSQBZ,getTZGGSQBZ());
        }
        if(!bDirtyOnly || isTZGGSQZTDirty()) {
            params.put(FIELD_TZGGSQZT,getTZGGSQZT());
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

        return  OA_TZGG.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_TZGG et,int index) throws Exception {

        switch(index) {
        case INDEX_GGSFSHTG:
            return et.getGgsfshtg();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_OA_TZGGID:
            return et.getOA_TZGGId();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_OA_TZGGNAME:
            return et.getOA_TZGGName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_FSSJ:
            return et.getFSSJ();
        case INDEX_TZGGLX:
            return et.getTZGGLX();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_JSR:
            return et.getJSR();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_SFYFS:
            return et.getSFYFS();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_TZGGSQBZ:
            return et.getTZGGSQBZ();
        case INDEX_TZGGSQZT:
            return et.getTZGGSQZT();
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

        OA_TZGG.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_TZGG et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GGSFSHTG:
            et.setGgsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_TZGGID:
            et.setOA_TZGGId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_TZGGNAME:
            et.setOA_TZGGName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_FSSJ:
            et.setFSSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_TZGGLX:
            et.setTZGGLX(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_JSR:
            et.setJSR(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_SFYFS:
            et.setSFYFS(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_TZGGSQBZ:
            et.setTZGGSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_TZGGSQZT:
            et.setTZGGSQZT(DataObject.getStringValue(obj));
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

        return  OA_TZGG.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_TZGG et,int index) throws Exception {

        switch(index) {
        case INDEX_GGSFSHTG:
            return et.getGgsfshtg()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_OA_TZGGID:
            return et.getOA_TZGGId()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_OA_TZGGNAME:
            return et.getOA_TZGGName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_FSSJ:
            return et.getFSSJ()==null;
        case INDEX_TZGGLX:
            return et.getTZGGLX()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_JSR:
            return et.getJSR()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_SFYFS:
            return et.getSFYFS()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_TZGGSQBZ:
            return et.getTZGGSQBZ()==null;
        case INDEX_TZGGSQZT:
            return et.getTZGGSQZT()==null;
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

        return  OA_TZGG.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_TZGG et,int index) throws Exception {

        switch(index) {
        case INDEX_GGSFSHTG:
            return et.isGgsfshtgDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_OA_TZGGID:
            return et.isOA_TZGGIdDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_OA_TZGGNAME:
            return et.isOA_TZGGNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_FSSJ:
            return et.isFSSJDirty();
        case INDEX_TZGGLX:
            return et.isTZGGLXDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_JSR:
            return et.isJSRDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_SFYFS:
            return et.isSFYFSDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_TZGGSQBZ:
            return et.isTZGGSQBZDirty();
        case INDEX_TZGGSQZT:
            return et.isTZGGSQZTDirty();
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
    private static  void fillJSONObject(OA_TZGG et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGgsfshtg()!=null) {
            JSONObjectHelper.put(json,"ggsfshtg",getJSONValue(et.getGgsfshtg()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getOA_TZGGId()!=null) {
            JSONObjectHelper.put(json,"oa_tzggid",getJSONValue(et.getOA_TZGGId()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getOA_TZGGName()!=null) {
            JSONObjectHelper.put(json,"oa_tzggname",getJSONValue(et.getOA_TZGGName()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getFSSJ()!=null) {
            JSONObjectHelper.put(json,"fssj",getJSONValue(et.getFSSJ()),false);
        }
        if(bIncEmpty||et.getTZGGLX()!=null) {
            JSONObjectHelper.put(json,"tzgglx",getJSONValue(et.getTZGGLX()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getJSR()!=null) {
            JSONObjectHelper.put(json,"jsr",getJSONValue(et.getJSR()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getSFYFS()!=null) {
            JSONObjectHelper.put(json,"sfyfs",getJSONValue(et.getSFYFS()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getTZGGSQBZ()!=null) {
            JSONObjectHelper.put(json,"tzggsqbz",getJSONValue(et.getTZGGSQBZ()),false);
        }
        if(bIncEmpty||et.getTZGGSQZT()!=null) {
            JSONObjectHelper.put(json,"tzggsqzt",getJSONValue(et.getTZGGSQZT()),false);
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
    private static void fillXmlNode(OA_TZGG et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGgsfshtg()!=null) {
            Object obj = et.getGgsfshtg();
            node.setAttribute("GGSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_TZGGId()!=null) {
            Object obj = et.getOA_TZGGId();
            node.setAttribute("OA_TZGGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_TZGGName()!=null) {
            Object obj = et.getOA_TZGGName();
            node.setAttribute("OA_TZGGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFSSJ()!=null) {
            Object obj = et.getFSSJ();
            node.setAttribute("FSSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getTZGGLX()!=null) {
            Object obj = et.getTZGGLX();
            node.setAttribute("TZGGLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJSR()!=null) {
            Object obj = et.getJSR();
            node.setAttribute("JSR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSFYFS()!=null) {
            Object obj = et.getSFYFS();
            node.setAttribute("SFYFS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getTZGGSQBZ()!=null) {
            Object obj = et.getTZGGSQBZ();
            node.setAttribute("TZGGSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTZGGSQZT()!=null) {
            Object obj = et.getTZGGSQZT();
            node.setAttribute("TZGGSQZT",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_TZGG.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_TZGG et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGgsfshtgDirty() && (bIncEmpty||et.getGgsfshtg()!=null)) {
            dst.set(FIELD_GGSFSHTG,et.getGgsfshtg());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isOA_TZGGIdDirty() && (bIncEmpty||et.getOA_TZGGId()!=null)) {
            dst.set(FIELD_OA_TZGGID,et.getOA_TZGGId());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isOA_TZGGNameDirty() && (bIncEmpty||et.getOA_TZGGName()!=null)) {
            dst.set(FIELD_OA_TZGGNAME,et.getOA_TZGGName());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isFSSJDirty() && (bIncEmpty||et.getFSSJ()!=null)) {
            dst.set(FIELD_FSSJ,et.getFSSJ());
        }
        if(et.isTZGGLXDirty() && (bIncEmpty||et.getTZGGLX()!=null)) {
            dst.set(FIELD_TZGGLX,et.getTZGGLX());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isJSRDirty() && (bIncEmpty||et.getJSR()!=null)) {
            dst.set(FIELD_JSR,et.getJSR());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isSFYFSDirty() && (bIncEmpty||et.getSFYFS()!=null)) {
            dst.set(FIELD_SFYFS,et.getSFYFS());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isTZGGSQBZDirty() && (bIncEmpty||et.getTZGGSQBZ()!=null)) {
            dst.set(FIELD_TZGGSQBZ,et.getTZGGSQBZ());
        }
        if(et.isTZGGSQZTDirty() && (bIncEmpty||et.getTZGGSQZT()!=null)) {
            dst.set(FIELD_TZGGSQZT,et.getTZGGSQZT());
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
        return  OA_TZGG.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_TZGG et,int index) throws Exception {
        switch(index) {
        case INDEX_GGSFSHTG:
            et.resetGgsfshtg();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_OA_TZGGID:
            et.resetOA_TZGGId();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_OA_TZGGNAME:
            et.resetOA_TZGGName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_FSSJ:
            et.resetFSSJ();
            return true;
        case INDEX_TZGGLX:
            et.resetTZGGLX();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_JSR:
            et.resetJSR();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_SFYFS:
            et.resetSFYFS();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_TZGGSQBZ:
            et.resetTZGGSQBZ();
            return true;
        case INDEX_TZGGSQZT:
            et.resetTZGGSQZT();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objFSRLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser fsr = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getFSR() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFSR();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objFSRLock) {
            if(fsr==null) {
                fsr = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                fsr.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(fsr);
            }
            return fsr;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_TZGG getProxyEntity() {
        return this.proxyOA_TZGG;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_TZGG = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_TZGG) {
            this.proxyOA_TZGG = (OA_TZGG)proxyDataObject;
        }

    }

}