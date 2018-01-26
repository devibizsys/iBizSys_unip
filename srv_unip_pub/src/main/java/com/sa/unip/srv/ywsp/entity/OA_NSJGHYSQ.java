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
 * 实体[OA_NSJGHYSQ] 数据对象
 */
public class OA_NSJGHYSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_NSJGHYSQ.class);
    /**
     *   实体属性标识[内设机构会议申请是否审核通过]
     */
    public final static String FIELD_NSJGSFSHTG = "NSJGSFSHTG";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[逻辑有效标志]
     */
    public final static String FIELD_ENABLE = "ENABLE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[内设机构会议申请标识]
     */
    public final static String FIELD_OA_NSJGHYSQID = "OA_NSJGHYSQID";
    /**
     *   实体属性标识[内设机构会议申请名称]
     */
    public final static String FIELD_OA_NSJGHYSQNAME = "OA_NSJGHYSQNAME";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[会议时间]
     */
    public final static String FIELD_HYSJ = "HYSJ";
    /**
     *   实体属性标识[会议地点]
     */
    public final static String FIELD_HYDD = "HYDD";
    /**
     *   实体属性标识[会议要求]
     */
    public final static String FIELD_HYYQ = "HYYQ";
    /**
     *   实体属性标识[参会领导]
     */
    public final static String FIELD_CHLD = "CHLD";
    /**
     *   实体属性标识[承办处室负责人意见]
     */
    public final static String FIELD_CBCSFZRYJ = "CBCSFZRYJ";
    /**
     *   实体属性标识[秘书处意见]
     */
    public final static String FIELD_MSCYJ = "MSCYJ";
    /**
     *   实体属性标识[院办负责人意见]
     */
    public final static String FIELD_YBFZRYJ = "YBFZRYJ";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[内设机构会议申请状态]
     */
    public final static String FIELD_NSJGHYSQZT = "NSJGHYSQZT";
    /**
     *   实体属性标识[内设机构会议申请步骤]
     */
    public final static String FIELD_NSJGHYSQBZ = "NSJGHYSQBZ";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[组织人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[组织人员名称]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[组织部门名称]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[会议室标识]
     */
    public final static String FIELD_HYSID = "HYSID";
    /**
     *   实体属性标识[会议室]
     */
    public final static String FIELD_HYSNAME = "HYSNAME";

    private final static int INDEX_NSJGSFSHTG = 0;
    private final static int INDEX_MEMO = 1;
    private final static int INDEX_ENABLE = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_OA_NSJGHYSQID = 4;
    private final static int INDEX_OA_NSJGHYSQNAME = 5;
    private final static int INDEX_UPDATEMAN = 6;
    private final static int INDEX_UPDATEDATE = 7;
    private final static int INDEX_CREATEDATE = 8;
    private final static int INDEX_HYSJ = 9;
    private final static int INDEX_HYDD = 10;
    private final static int INDEX_HYYQ = 11;
    private final static int INDEX_CHLD = 12;
    private final static int INDEX_CBCSFZRYJ = 13;
    private final static int INDEX_MSCYJ = 14;
    private final static int INDEX_YBFZRYJ = 15;
    private final static int INDEX_BZ = 16;
    private final static int INDEX_NSJGHYSQZT = 17;
    private final static int INDEX_NSJGHYSQBZ = 18;
    private final static int INDEX_WFINSTANCEID = 19;
    private final static int INDEX_WFSTATE = 20;
    private final static int INDEX_ORGUSERID = 21;
    private final static int INDEX_ORGSECTORID = 22;
    private final static int INDEX_ORGUSERNAME = 23;
    private final static int INDEX_ORGSECTORNAME = 24;
    private final static int INDEX_HYSID = 25;
    private final static int INDEX_HYSNAME = 26;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_NSJGSFSHTG, INDEX_NSJGSFSHTG);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ENABLE, INDEX_ENABLE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_NSJGHYSQID, INDEX_OA_NSJGHYSQID);
        fieldIndexMap.put( FIELD_OA_NSJGHYSQNAME, INDEX_OA_NSJGHYSQNAME);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_HYSJ, INDEX_HYSJ);
        fieldIndexMap.put( FIELD_HYDD, INDEX_HYDD);
        fieldIndexMap.put( FIELD_HYYQ, INDEX_HYYQ);
        fieldIndexMap.put( FIELD_CHLD, INDEX_CHLD);
        fieldIndexMap.put( FIELD_CBCSFZRYJ, INDEX_CBCSFZRYJ);
        fieldIndexMap.put( FIELD_MSCYJ, INDEX_MSCYJ);
        fieldIndexMap.put( FIELD_YBFZRYJ, INDEX_YBFZRYJ);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_NSJGHYSQZT, INDEX_NSJGHYSQZT);
        fieldIndexMap.put( FIELD_NSJGHYSQBZ, INDEX_NSJGHYSQBZ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_HYSID, INDEX_HYSID);
        fieldIndexMap.put( FIELD_HYSNAME, INDEX_HYSNAME);
    }

    private OA_NSJGHYSQ proxyOA_NSJGHYSQ = null;

    public OA_NSJGHYSQ() {
        super();
    }
    private boolean nsjgsfshtgDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean enableDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_nsjghysqidDirtyFlag = false;
    private boolean oa_nsjghysqnameDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean hysjDirtyFlag = false;
    private boolean hyddDirtyFlag = false;
    private boolean hyyqDirtyFlag = false;
    private boolean chldDirtyFlag = false;
    private boolean cbcsfzryjDirtyFlag = false;
    private boolean mscyjDirtyFlag = false;
    private boolean ybfzryjDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean nsjghysqztDirtyFlag = false;
    private boolean nsjghysqbzDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean hysidDirtyFlag = false;
    private boolean hysnameDirtyFlag = false;

    @Column(name="nsjgsfshtg")
    private String nsjgsfshtg;
    @Column(name="memo")
    private String memo;
    @Column(name="enable")
    private Integer enable;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_nsjghysqid")
    private String oa_nsjghysqid;
    @Column(name="oa_nsjghysqname")
    private String oa_nsjghysqname;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="hysj")
    private Timestamp hysj;
    @Column(name="hydd")
    private String hydd;
    @Column(name="hyyq")
    private String hyyq;
    @Column(name="chld")
    private String chld;
    @Column(name="cbcsfzryj")
    private String cbcsfzryj;
    @Column(name="mscyj")
    private String mscyj;
    @Column(name="ybfzryj")
    private String ybfzryj;
    @Column(name="bz")
    private String bz;
    @Column(name="nsjghysqzt")
    private String nsjghysqzt;
    @Column(name="nsjghysqbz")
    private String nsjghysqbz;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="hysid")
    private String hysid;
    @Column(name="hysname")
    private String hysname;


    /**
     *  设置属性值[内设机构会议申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param nsjgsfshtg
     */
    public void setNsjgsfshtg(String nsjgsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setNsjgsfshtg(nsjgsfshtg);
            return;
        }
        if(nsjgsfshtg!=null) {
            nsjgsfshtg = StringHelper.trimRight(nsjgsfshtg);
            if(nsjgsfshtg.length()==0) {
                nsjgsfshtg = null;
            }
        }
        this.nsjgsfshtg =  nsjgsfshtg;
        this.nsjgsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[内设机构会议申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getNsjgsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNsjgsfshtg();
        }
        return this.nsjgsfshtg;
    }

    /**
     *  获取属性值[内设机构会议申请是否审核通过]是否修改
     */
    public boolean isNsjgsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNsjgsfshtgDirty();
        }
        return this.nsjgsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[内设机构会议申请是否审核通过]
     */
    public void resetNsjgsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetNsjgsfshtg();
            return;
        }

        this.nsjgsfshtgDirtyFlag = false;
        this.nsjgsfshtg = null;
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
     *  设置属性值[内设机构会议申请标识]
     *  @param oa_nsjghysqid
     */
    public void setOA_NSJGHYSQId(String oa_nsjghysqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_NSJGHYSQId(oa_nsjghysqid);
            return;
        }
        if(oa_nsjghysqid!=null) {
            oa_nsjghysqid = StringHelper.trimRight(oa_nsjghysqid);
            if(oa_nsjghysqid.length()==0) {
                oa_nsjghysqid = null;
            }
        }
        this.oa_nsjghysqid =  oa_nsjghysqid;
        this.oa_nsjghysqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[内设机构会议申请标识]
     */
    public String getOA_NSJGHYSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_NSJGHYSQId();
        }
        return this.oa_nsjghysqid;
    }

    /**
     *  获取属性值[内设机构会议申请标识]是否修改
     */
    public boolean isOA_NSJGHYSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_NSJGHYSQIdDirty();
        }
        return this.oa_nsjghysqidDirtyFlag;
    }

    /**
     *  重置属性值[内设机构会议申请标识]
     */
    public void resetOA_NSJGHYSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_NSJGHYSQId();
            return;
        }

        this.oa_nsjghysqidDirtyFlag = false;
        this.oa_nsjghysqid = null;
    }
    /**
     *  设置属性值[内设机构会议申请名称]
     *  @param oa_nsjghysqname
     */
    public void setOA_NSJGHYSQName(String oa_nsjghysqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_NSJGHYSQName(oa_nsjghysqname);
            return;
        }
        if(oa_nsjghysqname!=null) {
            oa_nsjghysqname = StringHelper.trimRight(oa_nsjghysqname);
            if(oa_nsjghysqname.length()==0) {
                oa_nsjghysqname = null;
            }
        }
        this.oa_nsjghysqname =  oa_nsjghysqname;
        this.oa_nsjghysqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[内设机构会议申请名称]
     */
    public String getOA_NSJGHYSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_NSJGHYSQName();
        }
        return this.oa_nsjghysqname;
    }

    /**
     *  获取属性值[内设机构会议申请名称]是否修改
     */
    public boolean isOA_NSJGHYSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_NSJGHYSQNameDirty();
        }
        return this.oa_nsjghysqnameDirtyFlag;
    }

    /**
     *  重置属性值[内设机构会议申请名称]
     */
    public void resetOA_NSJGHYSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_NSJGHYSQName();
            return;
        }

        this.oa_nsjghysqnameDirtyFlag = false;
        this.oa_nsjghysqname = null;
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
     *  设置属性值[会议地点]
     *  @param hydd
     */
    public void setHYDD(String hydd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYDD(hydd);
            return;
        }
        if(hydd!=null) {
            hydd = StringHelper.trimRight(hydd);
            if(hydd.length()==0) {
                hydd = null;
            }
        }
        this.hydd =  hydd;
        this.hyddDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议地点]
     */
    public String getHYDD() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYDD();
        }
        return this.hydd;
    }

    /**
     *  获取属性值[会议地点]是否修改
     */
    public boolean isHYDDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYDDDirty();
        }
        return this.hyddDirtyFlag;
    }

    /**
     *  重置属性值[会议地点]
     */
    public void resetHYDD() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYDD();
            return;
        }

        this.hyddDirtyFlag = false;
        this.hydd = null;
    }
    /**
     *  设置属性值[会议要求]
     *  @param hyyq
     */
    public void setHYYQ(String hyyq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYYQ(hyyq);
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
    public String getHYYQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYYQ();
        }
        return this.hyyq;
    }

    /**
     *  获取属性值[会议要求]是否修改
     */
    public boolean isHYYQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYYQDirty();
        }
        return this.hyyqDirtyFlag;
    }

    /**
     *  重置属性值[会议要求]
     */
    public void resetHYYQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYYQ();
            return;
        }

        this.hyyqDirtyFlag = false;
        this.hyyq = null;
    }
    /**
     *  设置属性值[参会领导]
     *  @param chld
     */
    public void setCHLD(String chld) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCHLD(chld);
            return;
        }
        if(chld!=null) {
            chld = StringHelper.trimRight(chld);
            if(chld.length()==0) {
                chld = null;
            }
        }
        this.chld =  chld;
        this.chldDirtyFlag  = true;
    }

    /**
     *  获取属性值[参会领导]
     */
    public String getCHLD() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCHLD();
        }
        return this.chld;
    }

    /**
     *  获取属性值[参会领导]是否修改
     */
    public boolean isCHLDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCHLDDirty();
        }
        return this.chldDirtyFlag;
    }

    /**
     *  重置属性值[参会领导]
     */
    public void resetCHLD() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCHLD();
            return;
        }

        this.chldDirtyFlag = false;
        this.chld = null;
    }
    /**
     *  设置属性值[承办处室负责人意见]
     *  @param cbcsfzryj
     */
    public void setCBCSFZRYJ(String cbcsfzryj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCBCSFZRYJ(cbcsfzryj);
            return;
        }
        if(cbcsfzryj!=null) {
            cbcsfzryj = StringHelper.trimRight(cbcsfzryj);
            if(cbcsfzryj.length()==0) {
                cbcsfzryj = null;
            }
        }
        this.cbcsfzryj =  cbcsfzryj;
        this.cbcsfzryjDirtyFlag  = true;
    }

    /**
     *  获取属性值[承办处室负责人意见]
     */
    public String getCBCSFZRYJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCBCSFZRYJ();
        }
        return this.cbcsfzryj;
    }

    /**
     *  获取属性值[承办处室负责人意见]是否修改
     */
    public boolean isCBCSFZRYJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCBCSFZRYJDirty();
        }
        return this.cbcsfzryjDirtyFlag;
    }

    /**
     *  重置属性值[承办处室负责人意见]
     */
    public void resetCBCSFZRYJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCBCSFZRYJ();
            return;
        }

        this.cbcsfzryjDirtyFlag = false;
        this.cbcsfzryj = null;
    }
    /**
     *  设置属性值[秘书处意见]
     *  @param mscyj
     */
    public void setMSCYJ(String mscyj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMSCYJ(mscyj);
            return;
        }
        if(mscyj!=null) {
            mscyj = StringHelper.trimRight(mscyj);
            if(mscyj.length()==0) {
                mscyj = null;
            }
        }
        this.mscyj =  mscyj;
        this.mscyjDirtyFlag  = true;
    }

    /**
     *  获取属性值[秘书处意见]
     */
    public String getMSCYJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMSCYJ();
        }
        return this.mscyj;
    }

    /**
     *  获取属性值[秘书处意见]是否修改
     */
    public boolean isMSCYJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMSCYJDirty();
        }
        return this.mscyjDirtyFlag;
    }

    /**
     *  重置属性值[秘书处意见]
     */
    public void resetMSCYJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMSCYJ();
            return;
        }

        this.mscyjDirtyFlag = false;
        this.mscyj = null;
    }
    /**
     *  设置属性值[院办负责人意见]
     *  @param ybfzryj
     */
    public void setYBFZRYJ(String ybfzryj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYBFZRYJ(ybfzryj);
            return;
        }
        if(ybfzryj!=null) {
            ybfzryj = StringHelper.trimRight(ybfzryj);
            if(ybfzryj.length()==0) {
                ybfzryj = null;
            }
        }
        this.ybfzryj =  ybfzryj;
        this.ybfzryjDirtyFlag  = true;
    }

    /**
     *  获取属性值[院办负责人意见]
     */
    public String getYBFZRYJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYBFZRYJ();
        }
        return this.ybfzryj;
    }

    /**
     *  获取属性值[院办负责人意见]是否修改
     */
    public boolean isYBFZRYJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYBFZRYJDirty();
        }
        return this.ybfzryjDirtyFlag;
    }

    /**
     *  重置属性值[院办负责人意见]
     */
    public void resetYBFZRYJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYBFZRYJ();
            return;
        }

        this.ybfzryjDirtyFlag = false;
        this.ybfzryj = null;
    }
    /**
     *  设置属性值[备注]
     *  @param bz
     */
    public void setBZ(String bz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBZ(bz);
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
    public String getBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBZ();
        }
        return this.bz;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBZDirty();
        }
        return this.bzDirtyFlag;
    }

    /**
     *  重置属性值[备注]
     */
    public void resetBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBZ();
            return;
        }

        this.bzDirtyFlag = false;
        this.bz = null;
    }
    /**
     *  设置属性值[内设机构会议申请状态]代码表：com.sa.unip.srv.codelist.CL_NSJGHYSQZTCodeListModel
     *  @param nsjghysqzt
     */
    public void setNSJGHYSQZT(String nsjghysqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setNSJGHYSQZT(nsjghysqzt);
            return;
        }
        if(nsjghysqzt!=null) {
            nsjghysqzt = StringHelper.trimRight(nsjghysqzt);
            if(nsjghysqzt.length()==0) {
                nsjghysqzt = null;
            }
        }
        this.nsjghysqzt =  nsjghysqzt;
        this.nsjghysqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[内设机构会议申请状态]代码表：com.sa.unip.srv.codelist.CL_NSJGHYSQZTCodeListModel
     */
    public String getNSJGHYSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNSJGHYSQZT();
        }
        return this.nsjghysqzt;
    }

    /**
     *  获取属性值[内设机构会议申请状态]是否修改
     */
    public boolean isNSJGHYSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNSJGHYSQZTDirty();
        }
        return this.nsjghysqztDirtyFlag;
    }

    /**
     *  重置属性值[内设机构会议申请状态]
     */
    public void resetNSJGHYSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetNSJGHYSQZT();
            return;
        }

        this.nsjghysqztDirtyFlag = false;
        this.nsjghysqzt = null;
    }
    /**
     *  设置属性值[内设机构会议申请步骤]代码表：com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel
     *  @param nsjghysqbz
     */
    public void setNSJGHYSQBZ(String nsjghysqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setNSJGHYSQBZ(nsjghysqbz);
            return;
        }
        if(nsjghysqbz!=null) {
            nsjghysqbz = StringHelper.trimRight(nsjghysqbz);
            if(nsjghysqbz.length()==0) {
                nsjghysqbz = null;
            }
        }
        this.nsjghysqbz =  nsjghysqbz;
        this.nsjghysqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[内设机构会议申请步骤]代码表：com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel
     */
    public String getNSJGHYSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNSJGHYSQBZ();
        }
        return this.nsjghysqbz;
    }

    /**
     *  获取属性值[内设机构会议申请步骤]是否修改
     */
    public boolean isNSJGHYSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNSJGHYSQBZDirty();
        }
        return this.nsjghysqbzDirtyFlag;
    }

    /**
     *  重置属性值[内设机构会议申请步骤]
     */
    public void resetNSJGHYSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetNSJGHYSQBZ();
            return;
        }

        this.nsjghysqbzDirtyFlag = false;
        this.nsjghysqbz = null;
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
     *  设置属性值[组织人员标识]
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
     *  获取属性值[组织人员标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[组织人员标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[组织人员标识]
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
     *  设置属性值[组织人员名称]
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
     *  获取属性值[组织人员名称]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[组织人员名称]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[组织人员名称]
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
     *  设置属性值[组织部门名称]
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
     *  获取属性值[组织部门名称]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[组织部门名称]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[组织部门名称]
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
     *  设置属性值[会议室标识]
     *  @param hysid
     */
    public void setHysid(String hysid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHysid(hysid);
            return;
        }
        if(hysid!=null) {
            hysid = StringHelper.trimRight(hysid);
            if(hysid.length()==0) {
                hysid = null;
            }
        }
        this.hysid =  hysid;
        this.hysidDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室标识]
     */
    public String getHysid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHysid();
        }
        return this.hysid;
    }

    /**
     *  获取属性值[会议室标识]是否修改
     */
    public boolean isHysidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHysidDirty();
        }
        return this.hysidDirtyFlag;
    }

    /**
     *  重置属性值[会议室标识]
     */
    public void resetHysid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHysid();
            return;
        }

        this.hysidDirtyFlag = false;
        this.hysid = null;
    }
    /**
     *  设置属性值[会议室]
     *  @param hysname
     */
    public void setHYSNAME(String hysname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYSNAME(hysname);
            return;
        }
        if(hysname!=null) {
            hysname = StringHelper.trimRight(hysname);
            if(hysname.length()==0) {
                hysname = null;
            }
        }
        this.hysname =  hysname;
        this.hysnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室]
     */
    public String getHYSNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYSNAME();
        }
        return this.hysname;
    }

    /**
     *  获取属性值[会议室]是否修改
     */
    public boolean isHYSNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYSNAMEDirty();
        }
        return this.hysnameDirtyFlag;
    }

    /**
     *  重置属性值[会议室]
     */
    public void resetHYSNAME() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYSNAME();
            return;
        }

        this.hysnameDirtyFlag = false;
        this.hysname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_NSJGHYSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_NSJGHYSQ et) {
        et.resetNsjgsfshtg();
        et.resetMemo();
        et.resetEnable();
        et.resetCreateMan();
        et.resetOA_NSJGHYSQId();
        et.resetOA_NSJGHYSQName();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetHYSJ();
        et.resetHYDD();
        et.resetHYYQ();
        et.resetCHLD();
        et.resetCBCSFZRYJ();
        et.resetMSCYJ();
        et.resetYBFZRYJ();
        et.resetBZ();
        et.resetNSJGHYSQZT();
        et.resetNSJGHYSQBZ();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetOrgUserId();
        et.resetOrgSectorId();
        et.resetOrgUserName();
        et.resetOrgSectorName();
        et.resetHysid();
        et.resetHYSNAME();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isNsjgsfshtgDirty()) {
            params.put(FIELD_NSJGSFSHTG,getNsjgsfshtg());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isEnableDirty()) {
            params.put(FIELD_ENABLE,getEnable());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_NSJGHYSQIdDirty()) {
            params.put(FIELD_OA_NSJGHYSQID,getOA_NSJGHYSQId());
        }
        if(!bDirtyOnly || isOA_NSJGHYSQNameDirty()) {
            params.put(FIELD_OA_NSJGHYSQNAME,getOA_NSJGHYSQName());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isHYSJDirty()) {
            params.put(FIELD_HYSJ,getHYSJ());
        }
        if(!bDirtyOnly || isHYDDDirty()) {
            params.put(FIELD_HYDD,getHYDD());
        }
        if(!bDirtyOnly || isHYYQDirty()) {
            params.put(FIELD_HYYQ,getHYYQ());
        }
        if(!bDirtyOnly || isCHLDDirty()) {
            params.put(FIELD_CHLD,getCHLD());
        }
        if(!bDirtyOnly || isCBCSFZRYJDirty()) {
            params.put(FIELD_CBCSFZRYJ,getCBCSFZRYJ());
        }
        if(!bDirtyOnly || isMSCYJDirty()) {
            params.put(FIELD_MSCYJ,getMSCYJ());
        }
        if(!bDirtyOnly || isYBFZRYJDirty()) {
            params.put(FIELD_YBFZRYJ,getYBFZRYJ());
        }
        if(!bDirtyOnly || isBZDirty()) {
            params.put(FIELD_BZ,getBZ());
        }
        if(!bDirtyOnly || isNSJGHYSQZTDirty()) {
            params.put(FIELD_NSJGHYSQZT,getNSJGHYSQZT());
        }
        if(!bDirtyOnly || isNSJGHYSQBZDirty()) {
            params.put(FIELD_NSJGHYSQBZ,getNSJGHYSQBZ());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgSectorIdDirty()) {
            params.put(FIELD_ORGSECTORID,getOrgSectorId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isOrgSectorNameDirty()) {
            params.put(FIELD_ORGSECTORNAME,getOrgSectorName());
        }
        if(!bDirtyOnly || isHysidDirty()) {
            params.put(FIELD_HYSID,getHysid());
        }
        if(!bDirtyOnly || isHYSNAMEDirty()) {
            params.put(FIELD_HYSNAME,getHYSNAME());
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

        return  OA_NSJGHYSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_NSJGHYSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_NSJGSFSHTG:
            return et.getNsjgsfshtg();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ENABLE:
            return et.getEnable();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_NSJGHYSQID:
            return et.getOA_NSJGHYSQId();
        case INDEX_OA_NSJGHYSQNAME:
            return et.getOA_NSJGHYSQName();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_HYSJ:
            return et.getHYSJ();
        case INDEX_HYDD:
            return et.getHYDD();
        case INDEX_HYYQ:
            return et.getHYYQ();
        case INDEX_CHLD:
            return et.getCHLD();
        case INDEX_CBCSFZRYJ:
            return et.getCBCSFZRYJ();
        case INDEX_MSCYJ:
            return et.getMSCYJ();
        case INDEX_YBFZRYJ:
            return et.getYBFZRYJ();
        case INDEX_BZ:
            return et.getBZ();
        case INDEX_NSJGHYSQZT:
            return et.getNSJGHYSQZT();
        case INDEX_NSJGHYSQBZ:
            return et.getNSJGHYSQBZ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_HYSID:
            return et.getHysid();
        case INDEX_HYSNAME:
            return et.getHYSNAME();
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

        OA_NSJGHYSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_NSJGHYSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_NSJGSFSHTG:
            et.setNsjgsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENABLE:
            et.setEnable(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_NSJGHYSQID:
            et.setOA_NSJGHYSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_NSJGHYSQNAME:
            et.setOA_NSJGHYSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_HYSJ:
            et.setHYSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_HYDD:
            et.setHYDD(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYYQ:
            et.setHYYQ(DataObject.getStringValue(obj));
            return ;
        case INDEX_CHLD:
            et.setCHLD(DataObject.getStringValue(obj));
            return ;
        case INDEX_CBCSFZRYJ:
            et.setCBCSFZRYJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSCYJ:
            et.setMSCYJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_YBFZRYJ:
            et.setYBFZRYJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_NSJGHYSQZT:
            et.setNSJGHYSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_NSJGHYSQBZ:
            et.setNSJGHYSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORID:
            et.setOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORNAME:
            et.setOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYSID:
            et.setHysid(DataObject.getStringValue(obj));
            return ;
        case INDEX_HYSNAME:
            et.setHYSNAME(DataObject.getStringValue(obj));
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

        return  OA_NSJGHYSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_NSJGHYSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_NSJGSFSHTG:
            return et.getNsjgsfshtg()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ENABLE:
            return et.getEnable()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_NSJGHYSQID:
            return et.getOA_NSJGHYSQId()==null;
        case INDEX_OA_NSJGHYSQNAME:
            return et.getOA_NSJGHYSQName()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_HYSJ:
            return et.getHYSJ()==null;
        case INDEX_HYDD:
            return et.getHYDD()==null;
        case INDEX_HYYQ:
            return et.getHYYQ()==null;
        case INDEX_CHLD:
            return et.getCHLD()==null;
        case INDEX_CBCSFZRYJ:
            return et.getCBCSFZRYJ()==null;
        case INDEX_MSCYJ:
            return et.getMSCYJ()==null;
        case INDEX_YBFZRYJ:
            return et.getYBFZRYJ()==null;
        case INDEX_BZ:
            return et.getBZ()==null;
        case INDEX_NSJGHYSQZT:
            return et.getNSJGHYSQZT()==null;
        case INDEX_NSJGHYSQBZ:
            return et.getNSJGHYSQBZ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_HYSID:
            return et.getHysid()==null;
        case INDEX_HYSNAME:
            return et.getHYSNAME()==null;
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

        return  OA_NSJGHYSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_NSJGHYSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_NSJGSFSHTG:
            return et.isNsjgsfshtgDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ENABLE:
            return et.isEnableDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_NSJGHYSQID:
            return et.isOA_NSJGHYSQIdDirty();
        case INDEX_OA_NSJGHYSQNAME:
            return et.isOA_NSJGHYSQNameDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_HYSJ:
            return et.isHYSJDirty();
        case INDEX_HYDD:
            return et.isHYDDDirty();
        case INDEX_HYYQ:
            return et.isHYYQDirty();
        case INDEX_CHLD:
            return et.isCHLDDirty();
        case INDEX_CBCSFZRYJ:
            return et.isCBCSFZRYJDirty();
        case INDEX_MSCYJ:
            return et.isMSCYJDirty();
        case INDEX_YBFZRYJ:
            return et.isYBFZRYJDirty();
        case INDEX_BZ:
            return et.isBZDirty();
        case INDEX_NSJGHYSQZT:
            return et.isNSJGHYSQZTDirty();
        case INDEX_NSJGHYSQBZ:
            return et.isNSJGHYSQBZDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_HYSID:
            return et.isHysidDirty();
        case INDEX_HYSNAME:
            return et.isHYSNAMEDirty();
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
    private static  void fillJSONObject(OA_NSJGHYSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getNsjgsfshtg()!=null) {
            JSONObjectHelper.put(json,"nsjgsfshtg",getJSONValue(et.getNsjgsfshtg()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            JSONObjectHelper.put(json,"enable",getJSONValue(et.getEnable()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_NSJGHYSQId()!=null) {
            JSONObjectHelper.put(json,"oa_nsjghysqid",getJSONValue(et.getOA_NSJGHYSQId()),false);
        }
        if(bIncEmpty||et.getOA_NSJGHYSQName()!=null) {
            JSONObjectHelper.put(json,"oa_nsjghysqname",getJSONValue(et.getOA_NSJGHYSQName()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getHYSJ()!=null) {
            JSONObjectHelper.put(json,"hysj",getJSONValue(et.getHYSJ()),false);
        }
        if(bIncEmpty||et.getHYDD()!=null) {
            JSONObjectHelper.put(json,"hydd",getJSONValue(et.getHYDD()),false);
        }
        if(bIncEmpty||et.getHYYQ()!=null) {
            JSONObjectHelper.put(json,"hyyq",getJSONValue(et.getHYYQ()),false);
        }
        if(bIncEmpty||et.getCHLD()!=null) {
            JSONObjectHelper.put(json,"chld",getJSONValue(et.getCHLD()),false);
        }
        if(bIncEmpty||et.getCBCSFZRYJ()!=null) {
            JSONObjectHelper.put(json,"cbcsfzryj",getJSONValue(et.getCBCSFZRYJ()),false);
        }
        if(bIncEmpty||et.getMSCYJ()!=null) {
            JSONObjectHelper.put(json,"mscyj",getJSONValue(et.getMSCYJ()),false);
        }
        if(bIncEmpty||et.getYBFZRYJ()!=null) {
            JSONObjectHelper.put(json,"ybfzryj",getJSONValue(et.getYBFZRYJ()),false);
        }
        if(bIncEmpty||et.getBZ()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBZ()),false);
        }
        if(bIncEmpty||et.getNSJGHYSQZT()!=null) {
            JSONObjectHelper.put(json,"nsjghysqzt",getJSONValue(et.getNSJGHYSQZT()),false);
        }
        if(bIncEmpty||et.getNSJGHYSQBZ()!=null) {
            JSONObjectHelper.put(json,"nsjghysqbz",getJSONValue(et.getNSJGHYSQBZ()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            JSONObjectHelper.put(json,"orgsectorid",getJSONValue(et.getOrgSectorId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            JSONObjectHelper.put(json,"orgsectorname",getJSONValue(et.getOrgSectorName()),false);
        }
        if(bIncEmpty||et.getHysid()!=null) {
            JSONObjectHelper.put(json,"hysid",getJSONValue(et.getHysid()),false);
        }
        if(bIncEmpty||et.getHYSNAME()!=null) {
            JSONObjectHelper.put(json,"hysname",getJSONValue(et.getHYSNAME()),false);
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
    private static void fillXmlNode(OA_NSJGHYSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getNsjgsfshtg()!=null) {
            Object obj = et.getNsjgsfshtg();
            node.setAttribute("NSJGSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            Object obj = et.getEnable();
            node.setAttribute("ENABLE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_NSJGHYSQId()!=null) {
            Object obj = et.getOA_NSJGHYSQId();
            node.setAttribute("OA_NSJGHYSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_NSJGHYSQName()!=null) {
            Object obj = et.getOA_NSJGHYSQName();
            node.setAttribute("OA_NSJGHYSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getHYSJ()!=null) {
            Object obj = et.getHYSJ();
            node.setAttribute("HYSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getHYDD()!=null) {
            Object obj = et.getHYDD();
            node.setAttribute("HYDD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHYYQ()!=null) {
            Object obj = et.getHYYQ();
            node.setAttribute("HYYQ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCHLD()!=null) {
            Object obj = et.getCHLD();
            node.setAttribute("CHLD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCBCSFZRYJ()!=null) {
            Object obj = et.getCBCSFZRYJ();
            node.setAttribute("CBCSFZRYJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMSCYJ()!=null) {
            Object obj = et.getMSCYJ();
            node.setAttribute("MSCYJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYBFZRYJ()!=null) {
            Object obj = et.getYBFZRYJ();
            node.setAttribute("YBFZRYJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBZ()!=null) {
            Object obj = et.getBZ();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNSJGHYSQZT()!=null) {
            Object obj = et.getNSJGHYSQZT();
            node.setAttribute("NSJGHYSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNSJGHYSQBZ()!=null) {
            Object obj = et.getNSJGHYSQBZ();
            node.setAttribute("NSJGHYSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            Object obj = et.getOrgSectorId();
            node.setAttribute("ORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            Object obj = et.getOrgSectorName();
            node.setAttribute("ORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHysid()!=null) {
            Object obj = et.getHysid();
            node.setAttribute("HYSID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHYSNAME()!=null) {
            Object obj = et.getHYSNAME();
            node.setAttribute("HYSNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_NSJGHYSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_NSJGHYSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isNsjgsfshtgDirty() && (bIncEmpty||et.getNsjgsfshtg()!=null)) {
            dst.set(FIELD_NSJGSFSHTG,et.getNsjgsfshtg());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isEnableDirty() && (bIncEmpty||et.getEnable()!=null)) {
            dst.set(FIELD_ENABLE,et.getEnable());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_NSJGHYSQIdDirty() && (bIncEmpty||et.getOA_NSJGHYSQId()!=null)) {
            dst.set(FIELD_OA_NSJGHYSQID,et.getOA_NSJGHYSQId());
        }
        if(et.isOA_NSJGHYSQNameDirty() && (bIncEmpty||et.getOA_NSJGHYSQName()!=null)) {
            dst.set(FIELD_OA_NSJGHYSQNAME,et.getOA_NSJGHYSQName());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isHYSJDirty() && (bIncEmpty||et.getHYSJ()!=null)) {
            dst.set(FIELD_HYSJ,et.getHYSJ());
        }
        if(et.isHYDDDirty() && (bIncEmpty||et.getHYDD()!=null)) {
            dst.set(FIELD_HYDD,et.getHYDD());
        }
        if(et.isHYYQDirty() && (bIncEmpty||et.getHYYQ()!=null)) {
            dst.set(FIELD_HYYQ,et.getHYYQ());
        }
        if(et.isCHLDDirty() && (bIncEmpty||et.getCHLD()!=null)) {
            dst.set(FIELD_CHLD,et.getCHLD());
        }
        if(et.isCBCSFZRYJDirty() && (bIncEmpty||et.getCBCSFZRYJ()!=null)) {
            dst.set(FIELD_CBCSFZRYJ,et.getCBCSFZRYJ());
        }
        if(et.isMSCYJDirty() && (bIncEmpty||et.getMSCYJ()!=null)) {
            dst.set(FIELD_MSCYJ,et.getMSCYJ());
        }
        if(et.isYBFZRYJDirty() && (bIncEmpty||et.getYBFZRYJ()!=null)) {
            dst.set(FIELD_YBFZRYJ,et.getYBFZRYJ());
        }
        if(et.isBZDirty() && (bIncEmpty||et.getBZ()!=null)) {
            dst.set(FIELD_BZ,et.getBZ());
        }
        if(et.isNSJGHYSQZTDirty() && (bIncEmpty||et.getNSJGHYSQZT()!=null)) {
            dst.set(FIELD_NSJGHYSQZT,et.getNSJGHYSQZT());
        }
        if(et.isNSJGHYSQBZDirty() && (bIncEmpty||et.getNSJGHYSQBZ()!=null)) {
            dst.set(FIELD_NSJGHYSQBZ,et.getNSJGHYSQBZ());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgSectorIdDirty() && (bIncEmpty||et.getOrgSectorId()!=null)) {
            dst.set(FIELD_ORGSECTORID,et.getOrgSectorId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isOrgSectorNameDirty() && (bIncEmpty||et.getOrgSectorName()!=null)) {
            dst.set(FIELD_ORGSECTORNAME,et.getOrgSectorName());
        }
        if(et.isHysidDirty() && (bIncEmpty||et.getHysid()!=null)) {
            dst.set(FIELD_HYSID,et.getHysid());
        }
        if(et.isHYSNAMEDirty() && (bIncEmpty||et.getHYSNAME()!=null)) {
            dst.set(FIELD_HYSNAME,et.getHYSNAME());
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
        return  OA_NSJGHYSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_NSJGHYSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_NSJGSFSHTG:
            et.resetNsjgsfshtg();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ENABLE:
            et.resetEnable();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_NSJGHYSQID:
            et.resetOA_NSJGHYSQId();
            return true;
        case INDEX_OA_NSJGHYSQNAME:
            et.resetOA_NSJGHYSQName();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_HYSJ:
            et.resetHYSJ();
            return true;
        case INDEX_HYDD:
            et.resetHYDD();
            return true;
        case INDEX_HYYQ:
            et.resetHYYQ();
            return true;
        case INDEX_CHLD:
            et.resetCHLD();
            return true;
        case INDEX_CBCSFZRYJ:
            et.resetCBCSFZRYJ();
            return true;
        case INDEX_MSCYJ:
            et.resetMSCYJ();
            return true;
        case INDEX_YBFZRYJ:
            et.resetYBFZRYJ();
            return true;
        case INDEX_BZ:
            et.resetBZ();
            return true;
        case INDEX_NSJGHYSQZT:
            et.resetNSJGHYSQZT();
            return true;
        case INDEX_NSJGHYSQBZ:
            et.resetNSJGHYSQBZ();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGSECTORID:
            et.resetOrgSectorId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_ORGSECTORNAME:
            et.resetOrgSectorName();
            return true;
        case INDEX_HYSID:
            et.resetHysid();
            return true;
        case INDEX_HYSNAME:
            et.resetHYSNAME();
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

    private Object objHYSLock = new Object();
    private com.sa.unip.srv.jcsj.entity.OA_HYS hys = null;
    /**
    * 获取父数据 会议室
     * @throws Exception
    */
    public com.sa.unip.srv.jcsj.entity.OA_HYS getHYS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYS();
        }

        if(this.getHysid()==null)
            return null;
        synchronized(objHYSLock) {
            if(hys==null) {
                hys = new com.sa.unip.srv.jcsj.entity.OA_HYS();
                hys.setOA_HYSId(this.getHysid());
                com.sa.unip.srv.jcsj.service.OA_HYSService service = (com.sa.unip.srv.jcsj.service.OA_HYSService)ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_HYSService.class,this.getSessionFactory());
                service.autoGet(hys);
            }
            return hys;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_NSJGHYSQ getProxyEntity() {
        return this.proxyOA_NSJGHYSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_NSJGHYSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_NSJGHYSQ) {
            this.proxyOA_NSJGHYSQ = (OA_NSJGHYSQ)proxyDataObject;
        }

    }

}