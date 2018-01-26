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
 * 实体[OA_YBHYSQ] 数据对象
 */
public class OA_YBHYSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_YBHYSQ.class);
    /**
     *   实体属性标识[是否审核通过]
     */
    public final static String FIELD_SFSHTG = "SFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[会议申请标识]
     */
    public final static String FIELD_OA_YBHYSQID = "OA_YBHYSQID";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[会议标题]
     */
    public final static String FIELD_OA_YBHYSQNAME = "OA_YBHYSQNAME";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[逻辑有效标志]
     */
    public final static String FIELD_ENABLE = "ENABLE";
    /**
     *   实体属性标识[申请人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[申请人]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[部门名称]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[会议时间]
     */
    public final static String FIELD_HYSJ = "HYSJ";
    /**
     *   实体属性标识[会议要求]
     */
    public final static String FIELD_HYYQ = "HYYQ";
    /**
     *   实体属性标识[会议类型]
     */
    public final static String FIELD_HYLX = "HYLX";
    /**
     *   实体属性标识[申请时间]
     */
    public final static String FIELD_SQSJ = "SQSJ";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[会议申请状态]
     */
    public final static String FIELD_HYSQZT = "HYSQZT";
    /**
     *   实体属性标识[通知总人数]
     */
    public final static String FIELD_TZZRS = "TZZRS";
    /**
     *   实体属性标识[已迟到人数]
     */
    public final static String FIELD_YCDRS = "YCDRS";
    /**
     *   实体属性标识[未参会人数]
     */
    public final static String FIELD_WCHRS = "WCHRS";
    /**
     *   实体属性标识[已参会人数]
     */
    public final static String FIELD_YCHRS = "YCHRS";
    /**
     *   实体属性标识[已请假人数]
     */
    public final static String FIELD_YQJRS = "YQJRS";
    /**
     *   实体属性标识[会议申请步骤]
     */
    public final static String FIELD_HYSQBZ = "HYSQBZ";
    /**
     *   实体属性标识[会议内容]
     */
    public final static String FIELD_HYNR = "HYNR";
    /**
     *   实体属性标识[参会人员座位数据]
     */
    public final static String FIELD_CHRYZWSJ = "CHRYZWSJ";
    /**
     *   实体属性标识[电话号码]
     */
    public final static String FIELD_DHHM = "DHHM";
    /**
     *   实体属性标识[会议室标识]
     */
    public final static String FIELD_OA_HYSID = "OA_HYSID";
    /**
     *   实体属性标识[会议室名称]
     */
    public final static String FIELD_OA_HYSNAME = "OA_HYSNAME";

    private final static int INDEX_SFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_OA_YBHYSQID = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_OA_YBHYSQNAME = 4;
    private final static int INDEX_CREATEDATE = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_ENABLE = 8;
    private final static int INDEX_ORGUSERID = 9;
    private final static int INDEX_ORGUSERNAME = 10;
    private final static int INDEX_ORGSECTORID = 11;
    private final static int INDEX_ORGSECTORNAME = 12;
    private final static int INDEX_HYSJ = 13;
    private final static int INDEX_HYYQ = 14;
    private final static int INDEX_HYLX = 15;
    private final static int INDEX_SQSJ = 16;
    private final static int INDEX_MEMO = 17;
    private final static int INDEX_FJ = 18;
    private final static int INDEX_WFSTATE = 19;
    private final static int INDEX_WFINSTANCEID = 20;
    private final static int INDEX_HYSQZT = 21;
    private final static int INDEX_TZZRS = 22;
    private final static int INDEX_YCDRS = 23;
    private final static int INDEX_WCHRS = 24;
    private final static int INDEX_YCHRS = 25;
    private final static int INDEX_YQJRS = 26;
    private final static int INDEX_HYSQBZ = 27;
    private final static int INDEX_HYNR = 28;
    private final static int INDEX_CHRYZWSJ = 29;
    private final static int INDEX_DHHM = 30;
    private final static int INDEX_OA_HYSID = 31;
    private final static int INDEX_OA_HYSNAME = 32;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_SFSHTG, INDEX_SFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_OA_YBHYSQID, INDEX_OA_YBHYSQID);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_YBHYSQNAME, INDEX_OA_YBHYSQNAME);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_ENABLE, INDEX_ENABLE);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_HYSJ, INDEX_HYSJ);
        fieldIndexMap.put( FIELD_HYYQ, INDEX_HYYQ);
        fieldIndexMap.put( FIELD_HYLX, INDEX_HYLX);
        fieldIndexMap.put( FIELD_SQSJ, INDEX_SQSJ);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_HYSQZT, INDEX_HYSQZT);
        fieldIndexMap.put( FIELD_TZZRS, INDEX_TZZRS);
        fieldIndexMap.put( FIELD_YCDRS, INDEX_YCDRS);
        fieldIndexMap.put( FIELD_WCHRS, INDEX_WCHRS);
        fieldIndexMap.put( FIELD_YCHRS, INDEX_YCHRS);
        fieldIndexMap.put( FIELD_YQJRS, INDEX_YQJRS);
        fieldIndexMap.put( FIELD_HYSQBZ, INDEX_HYSQBZ);
        fieldIndexMap.put( FIELD_HYNR, INDEX_HYNR);
        fieldIndexMap.put( FIELD_CHRYZWSJ, INDEX_CHRYZWSJ);
        fieldIndexMap.put( FIELD_DHHM, INDEX_DHHM);
        fieldIndexMap.put( FIELD_OA_HYSID, INDEX_OA_HYSID);
        fieldIndexMap.put( FIELD_OA_HYSNAME, INDEX_OA_HYSNAME);
    }

    private OA_YBHYSQ proxyOA_YBHYSQ = null;

    public OA_YBHYSQ() {
        super();
    }
    private boolean sfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean oa_ybhysqidDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_ybhysqnameDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean enableDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean hysjDirtyFlag = false;
    private boolean hyyqDirtyFlag = false;
    private boolean hylxDirtyFlag = false;
    private boolean sqsjDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean hysqztDirtyFlag = false;
    private boolean tzzrsDirtyFlag = false;
    private boolean ycdrsDirtyFlag = false;
    private boolean wchrsDirtyFlag = false;
    private boolean ychrsDirtyFlag = false;
    private boolean yqjrsDirtyFlag = false;
    private boolean hysqbzDirtyFlag = false;
    private boolean hynrDirtyFlag = false;
    private boolean chryzwsjDirtyFlag = false;
    private boolean dhhmDirtyFlag = false;
    private boolean oa_hysidDirtyFlag = false;
    private boolean oa_hysnameDirtyFlag = false;

    @Column(name="sfshtg")
    private Integer sfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="oa_ybhysqid")
    private String oa_ybhysqid;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_ybhysqname")
    private String oa_ybhysqname;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="enable")
    private Integer enable;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="hysj")
    private Timestamp hysj;
    @Column(name="hyyq")
    private String hyyq;
    @Column(name="hylx")
    private String hylx;
    @Column(name="sqsj")
    private Timestamp sqsj;
    @Column(name="memo")
    private String memo;
    @Column(name="fj")
    private String fj;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="hysqzt")
    private String hysqzt;
    @Column(name="tzzrs")
    private Integer tzzrs;
    @Column(name="ycdrs")
    private Integer ycdrs;
    @Column(name="wchrs")
    private Integer wchrs;
    @Column(name="ychrs")
    private Integer ychrs;
    @Column(name="yqjrs")
    private Integer yqjrs;
    @Column(name="hysqbz")
    private String hysqbz;
    @Column(name="hynr")
    private String hynr;
    @Column(name="chryzwsj")
    private String chryzwsj;
    @Column(name="dhhm")
    private String dhhm;
    @Column(name="oa_hysid")
    private String oa_hysid;
    @Column(name="oa_hysname")
    private String oa_hysname;


    /**
     *  设置属性值[是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param sfshtg
     */
    public void setSFSHTG(Integer sfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSFSHTG(sfshtg);
            return;
        }
        this.sfshtg =  sfshtg;
        this.sfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public Integer getSFSHTG() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSFSHTG();
        }
        return this.sfshtg;
    }

    /**
     *  获取属性值[是否审核通过]是否修改
     */
    public boolean isSFSHTGDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSFSHTGDirty();
        }
        return this.sfshtgDirtyFlag;
    }

    /**
     *  重置属性值[是否审核通过]
     */
    public void resetSFSHTG() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSFSHTG();
            return;
        }

        this.sfshtgDirtyFlag = false;
        this.sfshtg = null;
    }
    /**
     *  设置属性值[备注]
     *  @param bz
     */
    public void setBz(String bz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBz(bz);
            return;
        }
        if(bz!=null) {
            bz = StringHelper.trimRight(bz);
            if(bz.length()==0) {
                bz = null;
            }
        }
        this.bz =  bz;
        this.bzDirtyFlag  = true;
    }

    /**
     *  获取属性值[备注]
     */
    public String getBz() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBz();
        }
        return this.bz;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isBzDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBzDirty();
        }
        return this.bzDirtyFlag;
    }

    /**
     *  重置属性值[备注]
     */
    public void resetBz() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBz();
            return;
        }

        this.bzDirtyFlag = false;
        this.bz = null;
    }
    /**
     *  设置属性值[会议申请标识]
     *  @param oa_ybhysqid
     */
    public void setOA_YBHYSQId(String oa_ybhysqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_YBHYSQId(oa_ybhysqid);
            return;
        }
        if(oa_ybhysqid!=null) {
            oa_ybhysqid = StringHelper.trimRight(oa_ybhysqid);
            if(oa_ybhysqid.length()==0) {
                oa_ybhysqid = null;
            }
        }
        this.oa_ybhysqid =  oa_ybhysqid;
        this.oa_ybhysqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议申请标识]
     */
    public String getOA_YBHYSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_YBHYSQId();
        }
        return this.oa_ybhysqid;
    }

    /**
     *  获取属性值[会议申请标识]是否修改
     */
    public boolean isOA_YBHYSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_YBHYSQIdDirty();
        }
        return this.oa_ybhysqidDirtyFlag;
    }

    /**
     *  重置属性值[会议申请标识]
     */
    public void resetOA_YBHYSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_YBHYSQId();
            return;
        }

        this.oa_ybhysqidDirtyFlag = false;
        this.oa_ybhysqid = null;
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
     *  设置属性值[会议标题]
     *  @param oa_ybhysqname
     */
    public void setOA_YBHYSQName(String oa_ybhysqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_YBHYSQName(oa_ybhysqname);
            return;
        }
        if(oa_ybhysqname!=null) {
            oa_ybhysqname = StringHelper.trimRight(oa_ybhysqname);
            if(oa_ybhysqname.length()==0) {
                oa_ybhysqname = null;
            }
        }
        this.oa_ybhysqname =  oa_ybhysqname;
        this.oa_ybhysqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议标题]
     */
    public String getOA_YBHYSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_YBHYSQName();
        }
        return this.oa_ybhysqname;
    }

    /**
     *  获取属性值[会议标题]是否修改
     */
    public boolean isOA_YBHYSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_YBHYSQNameDirty();
        }
        return this.oa_ybhysqnameDirtyFlag;
    }

    /**
     *  重置属性值[会议标题]
     */
    public void resetOA_YBHYSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_YBHYSQName();
            return;
        }

        this.oa_ybhysqnameDirtyFlag = false;
        this.oa_ybhysqname = null;
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
     *  设置属性值[逻辑有效标志]
     *  @param enable
     */
    public void setEnable(Integer enable) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setEnable(enable);
            return;
        }
        this.enable =  enable;
        this.enableDirtyFlag  = true;
    }

    /**
     *  获取属性值[逻辑有效标志]
     */
    public Integer getEnable() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getEnable();
        }
        return this.enable;
    }

    /**
     *  获取属性值[逻辑有效标志]是否修改
     */
    public boolean isEnableDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isEnableDirty();
        }
        return this.enableDirtyFlag;
    }

    /**
     *  重置属性值[逻辑有效标志]
     */
    public void resetEnable() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetEnable();
            return;
        }

        this.enableDirtyFlag = false;
        this.enable = null;
    }
    /**
     *  设置属性值[申请人标识]
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
     *  获取属性值[申请人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[申请人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[申请人标识]
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
     *  设置属性值[申请人]
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
     *  获取属性值[申请人]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[申请人]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[申请人]
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
     *  设置属性值[部门标识]
     *  @param orgsectorid
     */
    public void setOrgSectorId(String orgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorId(orgsectorid);
            return;
        }
        if(orgsectorid!=null) {
            orgsectorid = StringHelper.trimRight(orgsectorid);
            if(orgsectorid.length()==0) {
                orgsectorid = null;
            }
        }
        this.orgsectorid =  orgsectorid;
        this.orgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门标识]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[部门标识]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[部门标识]
     */
    public void resetOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorId();
            return;
        }

        this.orgsectoridDirtyFlag = false;
        this.orgsectorid = null;
    }
    /**
     *  设置属性值[部门名称]
     *  @param orgsectorname
     */
    public void setOrgSectorName(String orgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorName(orgsectorname);
            return;
        }
        if(orgsectorname!=null) {
            orgsectorname = StringHelper.trimRight(orgsectorname);
            if(orgsectorname.length()==0) {
                orgsectorname = null;
            }
        }
        this.orgsectorname =  orgsectorname;
        this.orgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门名称]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[部门名称]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[部门名称]
     */
    public void resetOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorName();
            return;
        }

        this.orgsectornameDirtyFlag = false;
        this.orgsectorname = null;
    }
    /**
     *  设置属性值[会议时间]
     *  @param hysj
     */
    public void setHYSJ(Timestamp hysj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYSJ(hysj);
            return;
        }
        this.hysj =  hysj;
        this.hysjDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议时间]
     */
    public Timestamp getHYSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYSJ();
        }
        return this.hysj;
    }

    /**
     *  获取属性值[会议时间]是否修改
     */
    public boolean isHYSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYSJDirty();
        }
        return this.hysjDirtyFlag;
    }

    /**
     *  重置属性值[会议时间]
     */
    public void resetHYSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYSJ();
            return;
        }

        this.hysjDirtyFlag = false;
        this.hysj = null;
    }
    /**
     *  设置属性值[会议要求]
     *  @param hyyq
     */
    public void setHyyq(String hyyq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHyyq(hyyq);
            return;
        }
        if(hyyq!=null) {
            hyyq = StringHelper.trimRight(hyyq);
            if(hyyq.length()==0) {
                hyyq = null;
            }
        }
        this.hyyq =  hyyq;
        this.hyyqDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议要求]
     */
    public String getHyyq() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHyyq();
        }
        return this.hyyq;
    }

    /**
     *  获取属性值[会议要求]是否修改
     */
    public boolean isHyyqDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHyyqDirty();
        }
        return this.hyyqDirtyFlag;
    }

    /**
     *  重置属性值[会议要求]
     */
    public void resetHyyq() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHyyq();
            return;
        }

        this.hyyqDirtyFlag = false;
        this.hyyq = null;
    }
    /**
     *  设置属性值[会议类型]代码表：com.sa.unip.srv.codelist.HYLXCodeListModel
     *  @param hylx
     */
    public void setHYLX(String hylx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYLX(hylx);
            return;
        }
        if(hylx!=null) {
            hylx = StringHelper.trimRight(hylx);
            if(hylx.length()==0) {
                hylx = null;
            }
        }
        this.hylx =  hylx;
        this.hylxDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议类型]代码表：com.sa.unip.srv.codelist.HYLXCodeListModel
     */
    public String getHYLX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYLX();
        }
        return this.hylx;
    }

    /**
     *  获取属性值[会议类型]是否修改
     */
    public boolean isHYLXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYLXDirty();
        }
        return this.hylxDirtyFlag;
    }

    /**
     *  重置属性值[会议类型]
     */
    public void resetHYLX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYLX();
            return;
        }

        this.hylxDirtyFlag = false;
        this.hylx = null;
    }
    /**
     *  设置属性值[申请时间]
     *  @param sqsj
     */
    public void setSQSJ(Timestamp sqsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSQSJ(sqsj);
            return;
        }
        this.sqsj =  sqsj;
        this.sqsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[申请时间]
     */
    public Timestamp getSQSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSQSJ();
        }
        return this.sqsj;
    }

    /**
     *  获取属性值[申请时间]是否修改
     */
    public boolean isSQSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSQSJDirty();
        }
        return this.sqsjDirtyFlag;
    }

    /**
     *  重置属性值[申请时间]
     */
    public void resetSQSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSQSJ();
            return;
        }

        this.sqsjDirtyFlag = false;
        this.sqsj = null;
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
     *  设置属性值[附件]
     *  @param fj
     */
    public void setFJ(String fj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFJ(fj);
            return;
        }
        if(fj!=null) {
            fj = StringHelper.trimRight(fj);
            if(fj.length()==0) {
                fj = null;
            }
        }
        this.fj =  fj;
        this.fjDirtyFlag  = true;
    }

    /**
     *  获取属性值[附件]
     */
    public String getFJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFJ();
        }
        return this.fj;
    }

    /**
     *  获取属性值[附件]是否修改
     */
    public boolean isFJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFJDirty();
        }
        return this.fjDirtyFlag;
    }

    /**
     *  重置属性值[附件]
     */
    public void resetFJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFJ();
            return;
        }

        this.fjDirtyFlag = false;
        this.fj = null;
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
     *  设置属性值[会议申请状态]代码表：com.sa.unip.srv.codelist.CL_HYSQZTCodeListModel
     *  @param hysqzt
     */
    public void setHYSQZT(String hysqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYSQZT(hysqzt);
            return;
        }
        if(hysqzt!=null) {
            hysqzt = StringHelper.trimRight(hysqzt);
            if(hysqzt.length()==0) {
                hysqzt = null;
            }
        }
        this.hysqzt =  hysqzt;
        this.hysqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议申请状态]代码表：com.sa.unip.srv.codelist.CL_HYSQZTCodeListModel
     */
    public String getHYSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYSQZT();
        }
        return this.hysqzt;
    }

    /**
     *  获取属性值[会议申请状态]是否修改
     */
    public boolean isHYSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYSQZTDirty();
        }
        return this.hysqztDirtyFlag;
    }

    /**
     *  重置属性值[会议申请状态]
     */
    public void resetHYSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYSQZT();
            return;
        }

        this.hysqztDirtyFlag = false;
        this.hysqzt = null;
    }
    /**
     *  设置属性值[通知总人数]
     *  @param tzzrs
     */
    public void setTzzrs(Integer tzzrs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTzzrs(tzzrs);
            return;
        }
        this.tzzrs =  tzzrs;
        this.tzzrsDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知总人数]
     */
    public Integer getTzzrs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTzzrs();
        }
        return this.tzzrs;
    }

    /**
     *  获取属性值[通知总人数]是否修改
     */
    public boolean isTzzrsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTzzrsDirty();
        }
        return this.tzzrsDirtyFlag;
    }

    /**
     *  重置属性值[通知总人数]
     */
    public void resetTzzrs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTzzrs();
            return;
        }

        this.tzzrsDirtyFlag = false;
        this.tzzrs = null;
    }
    /**
     *  设置属性值[已迟到人数]
     *  @param ycdrs
     */
    public void setYcdrs(Integer ycdrs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYcdrs(ycdrs);
            return;
        }
        this.ycdrs =  ycdrs;
        this.ycdrsDirtyFlag  = true;
    }

    /**
     *  获取属性值[已迟到人数]
     */
    public Integer getYcdrs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYcdrs();
        }
        return this.ycdrs;
    }

    /**
     *  获取属性值[已迟到人数]是否修改
     */
    public boolean isYcdrsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYcdrsDirty();
        }
        return this.ycdrsDirtyFlag;
    }

    /**
     *  重置属性值[已迟到人数]
     */
    public void resetYcdrs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYcdrs();
            return;
        }

        this.ycdrsDirtyFlag = false;
        this.ycdrs = null;
    }
    /**
     *  设置属性值[未参会人数]
     *  @param wchrs
     */
    public void setWchrs(Integer wchrs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWchrs(wchrs);
            return;
        }
        this.wchrs =  wchrs;
        this.wchrsDirtyFlag  = true;
    }

    /**
     *  获取属性值[未参会人数]
     */
    public Integer getWchrs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWchrs();
        }
        return this.wchrs;
    }

    /**
     *  获取属性值[未参会人数]是否修改
     */
    public boolean isWchrsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWchrsDirty();
        }
        return this.wchrsDirtyFlag;
    }

    /**
     *  重置属性值[未参会人数]
     */
    public void resetWchrs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWchrs();
            return;
        }

        this.wchrsDirtyFlag = false;
        this.wchrs = null;
    }
    /**
     *  设置属性值[已参会人数]
     *  @param ychrs
     */
    public void setYchrs(Integer ychrs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYchrs(ychrs);
            return;
        }
        this.ychrs =  ychrs;
        this.ychrsDirtyFlag  = true;
    }

    /**
     *  获取属性值[已参会人数]
     */
    public Integer getYchrs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYchrs();
        }
        return this.ychrs;
    }

    /**
     *  获取属性值[已参会人数]是否修改
     */
    public boolean isYchrsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYchrsDirty();
        }
        return this.ychrsDirtyFlag;
    }

    /**
     *  重置属性值[已参会人数]
     */
    public void resetYchrs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYchrs();
            return;
        }

        this.ychrsDirtyFlag = false;
        this.ychrs = null;
    }
    /**
     *  设置属性值[已请假人数]
     *  @param yqjrs
     */
    public void setYqjrs(Integer yqjrs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYqjrs(yqjrs);
            return;
        }
        this.yqjrs =  yqjrs;
        this.yqjrsDirtyFlag  = true;
    }

    /**
     *  获取属性值[已请假人数]
     */
    public Integer getYqjrs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYqjrs();
        }
        return this.yqjrs;
    }

    /**
     *  获取属性值[已请假人数]是否修改
     */
    public boolean isYqjrsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYqjrsDirty();
        }
        return this.yqjrsDirtyFlag;
    }

    /**
     *  重置属性值[已请假人数]
     */
    public void resetYqjrs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYqjrs();
            return;
        }

        this.yqjrsDirtyFlag = false;
        this.yqjrs = null;
    }
    /**
     *  设置属性值[会议申请步骤]代码表：com.sa.unip.srv.codelist.CL_HYSQBZCodeListModel
     *  @param hysqbz
     */
    public void setHYSQBZ(String hysqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYSQBZ(hysqbz);
            return;
        }
        if(hysqbz!=null) {
            hysqbz = StringHelper.trimRight(hysqbz);
            if(hysqbz.length()==0) {
                hysqbz = null;
            }
        }
        this.hysqbz =  hysqbz;
        this.hysqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议申请步骤]代码表：com.sa.unip.srv.codelist.CL_HYSQBZCodeListModel
     */
    public String getHYSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYSQBZ();
        }
        return this.hysqbz;
    }

    /**
     *  获取属性值[会议申请步骤]是否修改
     */
    public boolean isHYSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYSQBZDirty();
        }
        return this.hysqbzDirtyFlag;
    }

    /**
     *  重置属性值[会议申请步骤]
     */
    public void resetHYSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYSQBZ();
            return;
        }

        this.hysqbzDirtyFlag = false;
        this.hysqbz = null;
    }
    /**
     *  设置属性值[会议内容]
     *  @param hynr
     */
    public void setHYNR(String hynr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYNR(hynr);
            return;
        }
        if(hynr!=null) {
            hynr = StringHelper.trimRight(hynr);
            if(hynr.length()==0) {
                hynr = null;
            }
        }
        this.hynr =  hynr;
        this.hynrDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议内容]
     */
    public String getHYNR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYNR();
        }
        return this.hynr;
    }

    /**
     *  获取属性值[会议内容]是否修改
     */
    public boolean isHYNRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYNRDirty();
        }
        return this.hynrDirtyFlag;
    }

    /**
     *  重置属性值[会议内容]
     */
    public void resetHYNR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYNR();
            return;
        }

        this.hynrDirtyFlag = false;
        this.hynr = null;
    }
    /**
     *  设置属性值[参会人员座位数据]
     *  @param chryzwsj
     */
    public void setChryzwsj(String chryzwsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setChryzwsj(chryzwsj);
            return;
        }
        if(chryzwsj!=null) {
            chryzwsj = StringHelper.trimRight(chryzwsj);
            if(chryzwsj.length()==0) {
                chryzwsj = null;
            }
        }
        this.chryzwsj =  chryzwsj;
        this.chryzwsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[参会人员座位数据]
     */
    public String getChryzwsj() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getChryzwsj();
        }
        return this.chryzwsj;
    }

    /**
     *  获取属性值[参会人员座位数据]是否修改
     */
    public boolean isChryzwsjDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isChryzwsjDirty();
        }
        return this.chryzwsjDirtyFlag;
    }

    /**
     *  重置属性值[参会人员座位数据]
     */
    public void resetChryzwsj() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetChryzwsj();
            return;
        }

        this.chryzwsjDirtyFlag = false;
        this.chryzwsj = null;
    }
    /**
     *  设置属性值[电话号码]
     *  @param dhhm
     */
    public void setDhhm(String dhhm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDhhm(dhhm);
            return;
        }
        if(dhhm!=null) {
            dhhm = StringHelper.trimRight(dhhm);
            if(dhhm.length()==0) {
                dhhm = null;
            }
        }
        this.dhhm =  dhhm;
        this.dhhmDirtyFlag  = true;
    }

    /**
     *  获取属性值[电话号码]
     */
    public String getDhhm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDhhm();
        }
        return this.dhhm;
    }

    /**
     *  获取属性值[电话号码]是否修改
     */
    public boolean isDhhmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDhhmDirty();
        }
        return this.dhhmDirtyFlag;
    }

    /**
     *  重置属性值[电话号码]
     */
    public void resetDhhm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDhhm();
            return;
        }

        this.dhhmDirtyFlag = false;
        this.dhhm = null;
    }
    /**
     *  设置属性值[会议室标识]
     *  @param oa_hysid
     */
    public void setOA_HYSId(String oa_hysid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_HYSId(oa_hysid);
            return;
        }
        if(oa_hysid!=null) {
            oa_hysid = StringHelper.trimRight(oa_hysid);
            if(oa_hysid.length()==0) {
                oa_hysid = null;
            }
        }
        this.oa_hysid =  oa_hysid;
        this.oa_hysidDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室标识]
     */
    public String getOA_HYSId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_HYSId();
        }
        return this.oa_hysid;
    }

    /**
     *  获取属性值[会议室标识]是否修改
     */
    public boolean isOA_HYSIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_HYSIdDirty();
        }
        return this.oa_hysidDirtyFlag;
    }

    /**
     *  重置属性值[会议室标识]
     */
    public void resetOA_HYSId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_HYSId();
            return;
        }

        this.oa_hysidDirtyFlag = false;
        this.oa_hysid = null;
    }
    /**
     *  设置属性值[会议室名称]
     *  @param oa_hysname
     */
    public void setOA_HYSName(String oa_hysname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_HYSName(oa_hysname);
            return;
        }
        if(oa_hysname!=null) {
            oa_hysname = StringHelper.trimRight(oa_hysname);
            if(oa_hysname.length()==0) {
                oa_hysname = null;
            }
        }
        this.oa_hysname =  oa_hysname;
        this.oa_hysnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室名称]
     */
    public String getOA_HYSName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_HYSName();
        }
        return this.oa_hysname;
    }

    /**
     *  获取属性值[会议室名称]是否修改
     */
    public boolean isOA_HYSNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_HYSNameDirty();
        }
        return this.oa_hysnameDirtyFlag;
    }

    /**
     *  重置属性值[会议室名称]
     */
    public void resetOA_HYSName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_HYSName();
            return;
        }

        this.oa_hysnameDirtyFlag = false;
        this.oa_hysname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_YBHYSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_YBHYSQ et) {
        et.resetSFSHTG();
        et.resetBz();
        et.resetOA_YBHYSQId();
        et.resetCreateMan();
        et.resetOA_YBHYSQName();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetEnable();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetHYSJ();
        et.resetHyyq();
        et.resetHYLX();
        et.resetSQSJ();
        et.resetMemo();
        et.resetFJ();
        et.resetWFSTATE();
        et.resetWFINSTANCEID();
        et.resetHYSQZT();
        et.resetTzzrs();
        et.resetYcdrs();
        et.resetWchrs();
        et.resetYchrs();
        et.resetYqjrs();
        et.resetHYSQBZ();
        et.resetHYNR();
        et.resetChryzwsj();
        et.resetDhhm();
        et.resetOA_HYSId();
        et.resetOA_HYSName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isSFSHTGDirty()) {
            params.put(FIELD_SFSHTG,getSFSHTG());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isOA_YBHYSQIdDirty()) {
            params.put(FIELD_OA_YBHYSQID,getOA_YBHYSQId());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_YBHYSQNameDirty()) {
            params.put(FIELD_OA_YBHYSQNAME,getOA_YBHYSQName());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isEnableDirty()) {
            params.put(FIELD_ENABLE,getEnable());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isOrgSectorIdDirty()) {
            params.put(FIELD_ORGSECTORID,getOrgSectorId());
        }
        if(!bDirtyOnly || isOrgSectorNameDirty()) {
            params.put(FIELD_ORGSECTORNAME,getOrgSectorName());
        }
        if(!bDirtyOnly || isHYSJDirty()) {
            params.put(FIELD_HYSJ,getHYSJ());
        }
        if(!bDirtyOnly || isHyyqDirty()) {
            params.put(FIELD_HYYQ,getHyyq());
        }
        if(!bDirtyOnly || isHYLXDirty()) {
            params.put(FIELD_HYLX,getHYLX());
        }
        if(!bDirtyOnly || isSQSJDirty()) {
            params.put(FIELD_SQSJ,getSQSJ());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isHYSQZTDirty()) {
            params.put(FIELD_HYSQZT,getHYSQZT());
        }
        if(!bDirtyOnly || isTzzrsDirty()) {
            params.put(FIELD_TZZRS,getTzzrs());
        }
        if(!bDirtyOnly || isYcdrsDirty()) {
            params.put(FIELD_YCDRS,getYcdrs());
        }
        if(!bDirtyOnly || isWchrsDirty()) {
            params.put(FIELD_WCHRS,getWchrs());
        }
        if(!bDirtyOnly || isYchrsDirty()) {
            params.put(FIELD_YCHRS,getYchrs());
        }
        if(!bDirtyOnly || isYqjrsDirty()) {
            params.put(FIELD_YQJRS,getYqjrs());
        }
        if(!bDirtyOnly || isHYSQBZDirty()) {
            params.put(FIELD_HYSQBZ,getHYSQBZ());
        }
        if(!bDirtyOnly || isHYNRDirty()) {
            params.put(FIELD_HYNR,getHYNR());
        }
        if(!bDirtyOnly || isChryzwsjDirty()) {
            params.put(FIELD_CHRYZWSJ,getChryzwsj());
        }
        if(!bDirtyOnly || isDhhmDirty()) {
            params.put(FIELD_DHHM,getDhhm());
        }
        if(!bDirtyOnly || isOA_HYSIdDirty()) {
            params.put(FIELD_OA_HYSID,getOA_HYSId());
        }
        if(!bDirtyOnly || isOA_HYSNameDirty()) {
            params.put(FIELD_OA_HYSNAME,getOA_HYSName());
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

        return  OA_YBHYSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_YBHYSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_SFSHTG:
            return et.getSFSHTG();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_OA_YBHYSQID:
            return et.getOA_YBHYSQId();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_YBHYSQNAME:
            return et.getOA_YBHYSQName();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_ENABLE:
            return et.getEnable();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_HYSJ:
            return et.getHYSJ();
        case INDEX_HYYQ:
            return et.getHyyq();
        case INDEX_HYLX:
            return et.getHYLX();
        case INDEX_SQSJ:
            return et.getSQSJ();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_HYSQZT:
            return et.getHYSQZT();
        case INDEX_TZZRS:
            return et.getTzzrs();
        case INDEX_YCDRS:
            return et.getYcdrs();
        case INDEX_WCHRS:
            return et.getWchrs();
        case INDEX_YCHRS:
            return et.getYchrs();
        case INDEX_YQJRS:
            return et.getYqjrs();
        case INDEX_HYSQBZ:
            return et.getHYSQBZ();
        case INDEX_HYNR:
            return et.getHYNR();
        case INDEX_CHRYZWSJ:
            return et.getChryzwsj();
        case INDEX_DHHM:
            return et.getDhhm();
        case INDEX_OA_HYSID:
            return et.getOA_HYSId();
        case INDEX_OA_HYSNAME:
            return et.getOA_HYSName();
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

        OA_YBHYSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_YBHYSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_SFSHTG:
            et.setSFSHTG(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_YBHYSQID:
            et.setOA_YBHYSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_YBHYSQNAME:
            et.setOA_YBHYSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENABLE:
            et.setEnable(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORID:
            et.setOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORNAME:
            et.setOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYSJ:
            et.setHYSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_HYYQ:
            et.setHyyq(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYLX:
            et.setHYLX(DataObject.getStringValue(obj));
            return ;
        case INDEX_SQSJ:
            et.setSQSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYSQZT:
            et.setHYSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_TZZRS:
            et.setTzzrs(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_YCDRS:
            et.setYcdrs(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_WCHRS:
            et.setWchrs(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_YCHRS:
            et.setYchrs(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_YQJRS:
            et.setYqjrs(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_HYSQBZ:
            et.setHYSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYNR:
            et.setHYNR(DataObject.getStringValue(obj));
            return ;
        case INDEX_CHRYZWSJ:
            et.setChryzwsj(DataObject.getStringValue(obj));
            return ;
        case INDEX_DHHM:
            et.setDhhm(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_HYSID:
            et.setOA_HYSId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_HYSNAME:
            et.setOA_HYSName(DataObject.getStringValue(obj));
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

        return  OA_YBHYSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_YBHYSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_SFSHTG:
            return et.getSFSHTG()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_OA_YBHYSQID:
            return et.getOA_YBHYSQId()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_YBHYSQNAME:
            return et.getOA_YBHYSQName()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_ENABLE:
            return et.getEnable()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_HYSJ:
            return et.getHYSJ()==null;
        case INDEX_HYYQ:
            return et.getHyyq()==null;
        case INDEX_HYLX:
            return et.getHYLX()==null;
        case INDEX_SQSJ:
            return et.getSQSJ()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_HYSQZT:
            return et.getHYSQZT()==null;
        case INDEX_TZZRS:
            return et.getTzzrs()==null;
        case INDEX_YCDRS:
            return et.getYcdrs()==null;
        case INDEX_WCHRS:
            return et.getWchrs()==null;
        case INDEX_YCHRS:
            return et.getYchrs()==null;
        case INDEX_YQJRS:
            return et.getYqjrs()==null;
        case INDEX_HYSQBZ:
            return et.getHYSQBZ()==null;
        case INDEX_HYNR:
            return et.getHYNR()==null;
        case INDEX_CHRYZWSJ:
            return et.getChryzwsj()==null;
        case INDEX_DHHM:
            return et.getDhhm()==null;
        case INDEX_OA_HYSID:
            return et.getOA_HYSId()==null;
        case INDEX_OA_HYSNAME:
            return et.getOA_HYSName()==null;
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

        return  OA_YBHYSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_YBHYSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_SFSHTG:
            return et.isSFSHTGDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_OA_YBHYSQID:
            return et.isOA_YBHYSQIdDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_YBHYSQNAME:
            return et.isOA_YBHYSQNameDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_ENABLE:
            return et.isEnableDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_HYSJ:
            return et.isHYSJDirty();
        case INDEX_HYYQ:
            return et.isHyyqDirty();
        case INDEX_HYLX:
            return et.isHYLXDirty();
        case INDEX_SQSJ:
            return et.isSQSJDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_HYSQZT:
            return et.isHYSQZTDirty();
        case INDEX_TZZRS:
            return et.isTzzrsDirty();
        case INDEX_YCDRS:
            return et.isYcdrsDirty();
        case INDEX_WCHRS:
            return et.isWchrsDirty();
        case INDEX_YCHRS:
            return et.isYchrsDirty();
        case INDEX_YQJRS:
            return et.isYqjrsDirty();
        case INDEX_HYSQBZ:
            return et.isHYSQBZDirty();
        case INDEX_HYNR:
            return et.isHYNRDirty();
        case INDEX_CHRYZWSJ:
            return et.isChryzwsjDirty();
        case INDEX_DHHM:
            return et.isDhhmDirty();
        case INDEX_OA_HYSID:
            return et.isOA_HYSIdDirty();
        case INDEX_OA_HYSNAME:
            return et.isOA_HYSNameDirty();
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
    private static  void fillJSONObject(OA_YBHYSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getSFSHTG()!=null) {
            JSONObjectHelper.put(json,"sfshtg",getJSONValue(et.getSFSHTG()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getOA_YBHYSQId()!=null) {
            JSONObjectHelper.put(json,"oa_ybhysqid",getJSONValue(et.getOA_YBHYSQId()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_YBHYSQName()!=null) {
            JSONObjectHelper.put(json,"oa_ybhysqname",getJSONValue(et.getOA_YBHYSQName()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            JSONObjectHelper.put(json,"enable",getJSONValue(et.getEnable()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            JSONObjectHelper.put(json,"orgsectorid",getJSONValue(et.getOrgSectorId()),false);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            JSONObjectHelper.put(json,"orgsectorname",getJSONValue(et.getOrgSectorName()),false);
        }
        if(bIncEmpty||et.getHYSJ()!=null) {
            JSONObjectHelper.put(json,"hysj",getJSONValue(et.getHYSJ()),false);
        }
        if(bIncEmpty||et.getHyyq()!=null) {
            JSONObjectHelper.put(json,"hyyq",getJSONValue(et.getHyyq()),false);
        }
        if(bIncEmpty||et.getHYLX()!=null) {
            JSONObjectHelper.put(json,"hylx",getJSONValue(et.getHYLX()),false);
        }
        if(bIncEmpty||et.getSQSJ()!=null) {
            JSONObjectHelper.put(json,"sqsj",getJSONValue(et.getSQSJ()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getHYSQZT()!=null) {
            JSONObjectHelper.put(json,"hysqzt",getJSONValue(et.getHYSQZT()),false);
        }
        if(bIncEmpty||et.getTzzrs()!=null) {
            JSONObjectHelper.put(json,"tzzrs",getJSONValue(et.getTzzrs()),false);
        }
        if(bIncEmpty||et.getYcdrs()!=null) {
            JSONObjectHelper.put(json,"ycdrs",getJSONValue(et.getYcdrs()),false);
        }
        if(bIncEmpty||et.getWchrs()!=null) {
            JSONObjectHelper.put(json,"wchrs",getJSONValue(et.getWchrs()),false);
        }
        if(bIncEmpty||et.getYchrs()!=null) {
            JSONObjectHelper.put(json,"ychrs",getJSONValue(et.getYchrs()),false);
        }
        if(bIncEmpty||et.getYqjrs()!=null) {
            JSONObjectHelper.put(json,"yqjrs",getJSONValue(et.getYqjrs()),false);
        }
        if(bIncEmpty||et.getHYSQBZ()!=null) {
            JSONObjectHelper.put(json,"hysqbz",getJSONValue(et.getHYSQBZ()),false);
        }
        if(bIncEmpty||et.getHYNR()!=null) {
            JSONObjectHelper.put(json,"hynr",getJSONValue(et.getHYNR()),false);
        }
        if(bIncEmpty||et.getChryzwsj()!=null) {
            JSONObjectHelper.put(json,"chryzwsj",getJSONValue(et.getChryzwsj()),false);
        }
        if(bIncEmpty||et.getDhhm()!=null) {
            JSONObjectHelper.put(json,"dhhm",getJSONValue(et.getDhhm()),false);
        }
        if(bIncEmpty||et.getOA_HYSId()!=null) {
            JSONObjectHelper.put(json,"oa_hysid",getJSONValue(et.getOA_HYSId()),false);
        }
        if(bIncEmpty||et.getOA_HYSName()!=null) {
            JSONObjectHelper.put(json,"oa_hysname",getJSONValue(et.getOA_HYSName()),false);
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
    private static void fillXmlNode(OA_YBHYSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getSFSHTG()!=null) {
            Object obj = et.getSFSHTG();
            node.setAttribute("SFSHTG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_YBHYSQId()!=null) {
            Object obj = et.getOA_YBHYSQId();
            node.setAttribute("OA_YBHYSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_YBHYSQName()!=null) {
            Object obj = et.getOA_YBHYSQName();
            node.setAttribute("OA_YBHYSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            Object obj = et.getEnable();
            node.setAttribute("ENABLE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            Object obj = et.getOrgSectorId();
            node.setAttribute("ORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            Object obj = et.getOrgSectorName();
            node.setAttribute("ORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHYSJ()!=null) {
            Object obj = et.getHYSJ();
            node.setAttribute("HYSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getHyyq()!=null) {
            Object obj = et.getHyyq();
            node.setAttribute("HYYQ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHYLX()!=null) {
            Object obj = et.getHYLX();
            node.setAttribute("HYLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSQSJ()!=null) {
            Object obj = et.getSQSJ();
            node.setAttribute("SQSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHYSQZT()!=null) {
            Object obj = et.getHYSQZT();
            node.setAttribute("HYSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTzzrs()!=null) {
            Object obj = et.getTzzrs();
            node.setAttribute("TZZRS",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getYcdrs()!=null) {
            Object obj = et.getYcdrs();
            node.setAttribute("YCDRS",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getWchrs()!=null) {
            Object obj = et.getWchrs();
            node.setAttribute("WCHRS",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getYchrs()!=null) {
            Object obj = et.getYchrs();
            node.setAttribute("YCHRS",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getYqjrs()!=null) {
            Object obj = et.getYqjrs();
            node.setAttribute("YQJRS",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getHYSQBZ()!=null) {
            Object obj = et.getHYSQBZ();
            node.setAttribute("HYSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHYNR()!=null) {
            Object obj = et.getHYNR();
            node.setAttribute("HYNR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getChryzwsj()!=null) {
            Object obj = et.getChryzwsj();
            node.setAttribute("CHRYZWSJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDhhm()!=null) {
            Object obj = et.getDhhm();
            node.setAttribute("DHHM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_HYSId()!=null) {
            Object obj = et.getOA_HYSId();
            node.setAttribute("OA_HYSID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_HYSName()!=null) {
            Object obj = et.getOA_HYSName();
            node.setAttribute("OA_HYSNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_YBHYSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_YBHYSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isSFSHTGDirty() && (bIncEmpty||et.getSFSHTG()!=null)) {
            dst.set(FIELD_SFSHTG,et.getSFSHTG());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isOA_YBHYSQIdDirty() && (bIncEmpty||et.getOA_YBHYSQId()!=null)) {
            dst.set(FIELD_OA_YBHYSQID,et.getOA_YBHYSQId());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_YBHYSQNameDirty() && (bIncEmpty||et.getOA_YBHYSQName()!=null)) {
            dst.set(FIELD_OA_YBHYSQNAME,et.getOA_YBHYSQName());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isEnableDirty() && (bIncEmpty||et.getEnable()!=null)) {
            dst.set(FIELD_ENABLE,et.getEnable());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isOrgSectorIdDirty() && (bIncEmpty||et.getOrgSectorId()!=null)) {
            dst.set(FIELD_ORGSECTORID,et.getOrgSectorId());
        }
        if(et.isOrgSectorNameDirty() && (bIncEmpty||et.getOrgSectorName()!=null)) {
            dst.set(FIELD_ORGSECTORNAME,et.getOrgSectorName());
        }
        if(et.isHYSJDirty() && (bIncEmpty||et.getHYSJ()!=null)) {
            dst.set(FIELD_HYSJ,et.getHYSJ());
        }
        if(et.isHyyqDirty() && (bIncEmpty||et.getHyyq()!=null)) {
            dst.set(FIELD_HYYQ,et.getHyyq());
        }
        if(et.isHYLXDirty() && (bIncEmpty||et.getHYLX()!=null)) {
            dst.set(FIELD_HYLX,et.getHYLX());
        }
        if(et.isSQSJDirty() && (bIncEmpty||et.getSQSJ()!=null)) {
            dst.set(FIELD_SQSJ,et.getSQSJ());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isHYSQZTDirty() && (bIncEmpty||et.getHYSQZT()!=null)) {
            dst.set(FIELD_HYSQZT,et.getHYSQZT());
        }
        if(et.isTzzrsDirty() && (bIncEmpty||et.getTzzrs()!=null)) {
            dst.set(FIELD_TZZRS,et.getTzzrs());
        }
        if(et.isYcdrsDirty() && (bIncEmpty||et.getYcdrs()!=null)) {
            dst.set(FIELD_YCDRS,et.getYcdrs());
        }
        if(et.isWchrsDirty() && (bIncEmpty||et.getWchrs()!=null)) {
            dst.set(FIELD_WCHRS,et.getWchrs());
        }
        if(et.isYchrsDirty() && (bIncEmpty||et.getYchrs()!=null)) {
            dst.set(FIELD_YCHRS,et.getYchrs());
        }
        if(et.isYqjrsDirty() && (bIncEmpty||et.getYqjrs()!=null)) {
            dst.set(FIELD_YQJRS,et.getYqjrs());
        }
        if(et.isHYSQBZDirty() && (bIncEmpty||et.getHYSQBZ()!=null)) {
            dst.set(FIELD_HYSQBZ,et.getHYSQBZ());
        }
        if(et.isHYNRDirty() && (bIncEmpty||et.getHYNR()!=null)) {
            dst.set(FIELD_HYNR,et.getHYNR());
        }
        if(et.isChryzwsjDirty() && (bIncEmpty||et.getChryzwsj()!=null)) {
            dst.set(FIELD_CHRYZWSJ,et.getChryzwsj());
        }
        if(et.isDhhmDirty() && (bIncEmpty||et.getDhhm()!=null)) {
            dst.set(FIELD_DHHM,et.getDhhm());
        }
        if(et.isOA_HYSIdDirty() && (bIncEmpty||et.getOA_HYSId()!=null)) {
            dst.set(FIELD_OA_HYSID,et.getOA_HYSId());
        }
        if(et.isOA_HYSNameDirty() && (bIncEmpty||et.getOA_HYSName()!=null)) {
            dst.set(FIELD_OA_HYSNAME,et.getOA_HYSName());
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
        return  OA_YBHYSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_YBHYSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_SFSHTG:
            et.resetSFSHTG();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_OA_YBHYSQID:
            et.resetOA_YBHYSQId();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_YBHYSQNAME:
            et.resetOA_YBHYSQName();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_ENABLE:
            et.resetEnable();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_ORGSECTORID:
            et.resetOrgSectorId();
            return true;
        case INDEX_ORGSECTORNAME:
            et.resetOrgSectorName();
            return true;
        case INDEX_HYSJ:
            et.resetHYSJ();
            return true;
        case INDEX_HYYQ:
            et.resetHyyq();
            return true;
        case INDEX_HYLX:
            et.resetHYLX();
            return true;
        case INDEX_SQSJ:
            et.resetSQSJ();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_FJ:
            et.resetFJ();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_HYSQZT:
            et.resetHYSQZT();
            return true;
        case INDEX_TZZRS:
            et.resetTzzrs();
            return true;
        case INDEX_YCDRS:
            et.resetYcdrs();
            return true;
        case INDEX_WCHRS:
            et.resetWchrs();
            return true;
        case INDEX_YCHRS:
            et.resetYchrs();
            return true;
        case INDEX_YQJRS:
            et.resetYqjrs();
            return true;
        case INDEX_HYSQBZ:
            et.resetHYSQBZ();
            return true;
        case INDEX_HYNR:
            et.resetHYNR();
            return true;
        case INDEX_CHRYZWSJ:
            et.resetChryzwsj();
            return true;
        case INDEX_DHHM:
            et.resetDhhm();
            return true;
        case INDEX_OA_HYSID:
            et.resetOA_HYSId();
            return true;
        case INDEX_OA_HYSNAME:
            et.resetOA_HYSName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objORGUSERLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser orguser = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getORGUSER() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getORGUSER();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objORGUSERLock) {
            if(orguser==null) {
                orguser = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                orguser.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(orguser);
            }
            return orguser;
        }
    }

    private Object objHYSIDLock = new Object();
    private com.sa.unip.srv.jcsj.entity.OA_HYS hysid = null;
    /**
    * 获取父数据 会议室
     * @throws Exception
    */
    public com.sa.unip.srv.jcsj.entity.OA_HYS getHYSID() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYSID();
        }

        if(this.getOA_HYSId()==null)
            return null;
        synchronized(objHYSIDLock) {
            if(hysid==null) {
                hysid = new com.sa.unip.srv.jcsj.entity.OA_HYS();
                hysid.setOA_HYSId(this.getOA_HYSId());
                com.sa.unip.srv.jcsj.service.OA_HYSService service = (com.sa.unip.srv.jcsj.service.OA_HYSService)ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_HYSService.class,this.getSessionFactory());
                service.autoGet(hysid);
            }
            return hysid;
        }
    }

    private Object objORGSECTORLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector orgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getORGSECTOR() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getORGSECTOR();
        }

        if(this.getOrgSectorId()==null)
            return null;
        synchronized(objORGSECTORLock) {
            if(orgsector==null) {
                orgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                orgsector.setOrgSectorId(this.getOrgSectorId());
                com.sa.unip.srv.subsys.service.OrgSectorService service = (com.sa.unip.srv.subsys.service.OrgSectorService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgSectorService.class,this.getSessionFactory());
                service.autoGet(orgsector);
            }
            return orgsector;
        }
    }



    private Object objCHRYLock = new Object();
    private ArrayList<com.sa.unip.srv.ywsp.entity.OA_CHRY> chry = null;

    /**
    * 获取子数据 参会人员
     * @throws Exception
    */
    public ArrayList<com.sa.unip.srv.ywsp.entity.OA_CHRY> getCHRY() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCHRY();
        }

        if(this.getOA_YBHYSQId()==null)
            return null;
        com.sa.unip.srv.ywsp.service.OA_CHRYService service = (com.sa.unip.srv.ywsp.service.OA_CHRYService)ServiceGlobal.getService(com.sa.unip.srv.ywsp.service.OA_CHRYService.class,this.getSessionFactory());
        synchronized(objCHRYLock) {
            if(chry==null) {
                chry =  service.selectByYBHYSQ(this);
            }
            return chry;
        }
    }



    /**
     *  获取代理的数据对象
     */
    private OA_YBHYSQ getProxyEntity() {
        return this.proxyOA_YBHYSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_YBHYSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_YBHYSQ) {
            this.proxyOA_YBHYSQ = (OA_YBHYSQ)proxyDataObject;
        }

    }

}