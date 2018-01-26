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
 * 实体[OA_BGYPSQ] 数据对象
 */
public class OA_BGYPSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_BGYPSQ.class);
    /**
     *   实体属性标识[办公用品是否审核通过]
     */
    public final static String FIELD_BGYPSFSHTG = "BGYPSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[办公用品申请名称]
     */
    public final static String FIELD_OA_BGYPSQNAME = "OA_BGYPSQNAME";
    /**
     *   实体属性标识[办公用品申请标识]
     */
    public final static String FIELD_OA_BGYPSQID = "OA_BGYPSQID";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[房间号]
     */
    public final static String FIELD_FJH = "FJH";
    /**
     *   实体属性标识[日期]
     */
    public final static String FIELD_RQ = "RQ";
    /**
     *   实体属性标识[数量]
     */
    public final static String FIELD_SL = "SL";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[电话]
     */
    public final static String FIELD_DH = "DH";
    /**
     *   实体属性标识[办公用品申请步骤]
     */
    public final static String FIELD_BGYPSQBZ = "BGYPSQBZ";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[办公用品申请状态]
     */
    public final static String FIELD_BGYPSQZT = "BGYPSQZT";
    /**
     *   实体属性标识[申请人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[申请人]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[申请部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[部门名称]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[办公用品名称]
     */
    public final static String FIELD_BGYPMC = "BGYPMC";

    private final static int INDEX_BGYPSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_OA_BGYPSQNAME = 3;
    private final static int INDEX_OA_BGYPSQID = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_CREATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_FJH = 8;
    private final static int INDEX_RQ = 9;
    private final static int INDEX_SL = 10;
    private final static int INDEX_WFINSTANCEID = 11;
    private final static int INDEX_DH = 12;
    private final static int INDEX_BGYPSQBZ = 13;
    private final static int INDEX_WFSTATE = 14;
    private final static int INDEX_MEMO = 15;
    private final static int INDEX_BGYPSQZT = 16;
    private final static int INDEX_ORGUSERID = 17;
    private final static int INDEX_ORGUSERNAME = 18;
    private final static int INDEX_ORGSECTORID = 19;
    private final static int INDEX_ORGSECTORNAME = 20;
    private final static int INDEX_BGYPMC = 21;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_BGYPSFSHTG, INDEX_BGYPSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_BGYPSQNAME, INDEX_OA_BGYPSQNAME);
        fieldIndexMap.put( FIELD_OA_BGYPSQID, INDEX_OA_BGYPSQID);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_FJH, INDEX_FJH);
        fieldIndexMap.put( FIELD_RQ, INDEX_RQ);
        fieldIndexMap.put( FIELD_SL, INDEX_SL);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_DH, INDEX_DH);
        fieldIndexMap.put( FIELD_BGYPSQBZ, INDEX_BGYPSQBZ);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_BGYPSQZT, INDEX_BGYPSQZT);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_BGYPMC, INDEX_BGYPMC);
    }

    private OA_BGYPSQ proxyOA_BGYPSQ = null;

    public OA_BGYPSQ() {
        super();
    }
    private boolean bgypsfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_bgypsqnameDirtyFlag = false;
    private boolean oa_bgypsqidDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean fjhDirtyFlag = false;
    private boolean rqDirtyFlag = false;
    private boolean slDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean dhDirtyFlag = false;
    private boolean bgypsqbzDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean bgypsqztDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean bgypmcDirtyFlag = false;

    @Column(name="bgypsfshtg")
    private String bgypsfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_bgypsqname")
    private String oa_bgypsqname;
    @Column(name="oa_bgypsqid")
    private String oa_bgypsqid;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="fjh")
    private String fjh;
    @Column(name="rq")
    private Timestamp rq;
    @Column(name="sl")
    private Integer sl;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="dh")
    private String dh;
    @Column(name="bgypsqbz")
    private String bgypsqbz;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="memo")
    private String memo;
    @Column(name="bgypsqzt")
    private String bgypsqzt;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="bgypmc")
    private String bgypmc;


    /**
     *  设置属性值[办公用品是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param bgypsfshtg
     */
    public void setBgypsfshtg(String bgypsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBgypsfshtg(bgypsfshtg);
            return;
        }
        if(bgypsfshtg!=null) {
            bgypsfshtg = StringHelper.trimRight(bgypsfshtg);
            if(bgypsfshtg.length()==0) {
                bgypsfshtg = null;
            }
        }
        this.bgypsfshtg =  bgypsfshtg;
        this.bgypsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[办公用品是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getBgypsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBgypsfshtg();
        }
        return this.bgypsfshtg;
    }

    /**
     *  获取属性值[办公用品是否审核通过]是否修改
     */
    public boolean isBgypsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBgypsfshtgDirty();
        }
        return this.bgypsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[办公用品是否审核通过]
     */
    public void resetBgypsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBgypsfshtg();
            return;
        }

        this.bgypsfshtgDirtyFlag = false;
        this.bgypsfshtg = null;
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
     *  设置属性值[办公用品申请名称]
     *  @param oa_bgypsqname
     */
    public void setOA_BGYPSQName(String oa_bgypsqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_BGYPSQName(oa_bgypsqname);
            return;
        }
        if(oa_bgypsqname!=null) {
            oa_bgypsqname = StringHelper.trimRight(oa_bgypsqname);
            if(oa_bgypsqname.length()==0) {
                oa_bgypsqname = null;
            }
        }
        this.oa_bgypsqname =  oa_bgypsqname;
        this.oa_bgypsqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[办公用品申请名称]
     */
    public String getOA_BGYPSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_BGYPSQName();
        }
        return this.oa_bgypsqname;
    }

    /**
     *  获取属性值[办公用品申请名称]是否修改
     */
    public boolean isOA_BGYPSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_BGYPSQNameDirty();
        }
        return this.oa_bgypsqnameDirtyFlag;
    }

    /**
     *  重置属性值[办公用品申请名称]
     */
    public void resetOA_BGYPSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_BGYPSQName();
            return;
        }

        this.oa_bgypsqnameDirtyFlag = false;
        this.oa_bgypsqname = null;
    }
    /**
     *  设置属性值[办公用品申请标识]
     *  @param oa_bgypsqid
     */
    public void setOA_BGYPSQId(String oa_bgypsqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_BGYPSQId(oa_bgypsqid);
            return;
        }
        if(oa_bgypsqid!=null) {
            oa_bgypsqid = StringHelper.trimRight(oa_bgypsqid);
            if(oa_bgypsqid.length()==0) {
                oa_bgypsqid = null;
            }
        }
        this.oa_bgypsqid =  oa_bgypsqid;
        this.oa_bgypsqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[办公用品申请标识]
     */
    public String getOA_BGYPSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_BGYPSQId();
        }
        return this.oa_bgypsqid;
    }

    /**
     *  获取属性值[办公用品申请标识]是否修改
     */
    public boolean isOA_BGYPSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_BGYPSQIdDirty();
        }
        return this.oa_bgypsqidDirtyFlag;
    }

    /**
     *  重置属性值[办公用品申请标识]
     */
    public void resetOA_BGYPSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_BGYPSQId();
            return;
        }

        this.oa_bgypsqidDirtyFlag = false;
        this.oa_bgypsqid = null;
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
     *  设置属性值[房间号]
     *  @param fjh
     */
    public void setFjh(String fjh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFjh(fjh);
            return;
        }
        if(fjh!=null) {
            fjh = StringHelper.trimRight(fjh);
            if(fjh.length()==0) {
                fjh = null;
            }
        }
        this.fjh =  fjh;
        this.fjhDirtyFlag  = true;
    }

    /**
     *  获取属性值[房间号]
     */
    public String getFjh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFjh();
        }
        return this.fjh;
    }

    /**
     *  获取属性值[房间号]是否修改
     */
    public boolean isFjhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFjhDirty();
        }
        return this.fjhDirtyFlag;
    }

    /**
     *  重置属性值[房间号]
     */
    public void resetFjh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFjh();
            return;
        }

        this.fjhDirtyFlag = false;
        this.fjh = null;
    }
    /**
     *  设置属性值[日期]
     *  @param rq
     */
    public void setRQ(Timestamp rq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRQ(rq);
            return;
        }
        this.rq =  rq;
        this.rqDirtyFlag  = true;
    }

    /**
     *  获取属性值[日期]
     */
    public Timestamp getRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRQ();
        }
        return this.rq;
    }

    /**
     *  获取属性值[日期]是否修改
     */
    public boolean isRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRQDirty();
        }
        return this.rqDirtyFlag;
    }

    /**
     *  重置属性值[日期]
     */
    public void resetRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRQ();
            return;
        }

        this.rqDirtyFlag = false;
        this.rq = null;
    }
    /**
     *  设置属性值[数量]
     *  @param sl
     */
    public void setSl(Integer sl) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSl(sl);
            return;
        }
        this.sl =  sl;
        this.slDirtyFlag  = true;
    }

    /**
     *  获取属性值[数量]
     */
    public Integer getSl() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSl();
        }
        return this.sl;
    }

    /**
     *  获取属性值[数量]是否修改
     */
    public boolean isSlDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSlDirty();
        }
        return this.slDirtyFlag;
    }

    /**
     *  重置属性值[数量]
     */
    public void resetSl() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSl();
            return;
        }

        this.slDirtyFlag = false;
        this.sl = null;
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
     *  设置属性值[电话]
     *  @param dh
     */
    public void setDh(String dh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDh(dh);
            return;
        }
        if(dh!=null) {
            dh = StringHelper.trimRight(dh);
            if(dh.length()==0) {
                dh = null;
            }
        }
        this.dh =  dh;
        this.dhDirtyFlag  = true;
    }

    /**
     *  获取属性值[电话]
     */
    public String getDh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDh();
        }
        return this.dh;
    }

    /**
     *  获取属性值[电话]是否修改
     */
    public boolean isDhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDhDirty();
        }
        return this.dhDirtyFlag;
    }

    /**
     *  重置属性值[电话]
     */
    public void resetDh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDh();
            return;
        }

        this.dhDirtyFlag = false;
        this.dh = null;
    }
    /**
     *  设置属性值[办公用品申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param bgypsqbz
     */
    public void setBGYPSQBZ(String bgypsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBGYPSQBZ(bgypsqbz);
            return;
        }
        if(bgypsqbz!=null) {
            bgypsqbz = StringHelper.trimRight(bgypsqbz);
            if(bgypsqbz.length()==0) {
                bgypsqbz = null;
            }
        }
        this.bgypsqbz =  bgypsqbz;
        this.bgypsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[办公用品申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getBGYPSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBGYPSQBZ();
        }
        return this.bgypsqbz;
    }

    /**
     *  获取属性值[办公用品申请步骤]是否修改
     */
    public boolean isBGYPSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBGYPSQBZDirty();
        }
        return this.bgypsqbzDirtyFlag;
    }

    /**
     *  重置属性值[办公用品申请步骤]
     */
    public void resetBGYPSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBGYPSQBZ();
            return;
        }

        this.bgypsqbzDirtyFlag = false;
        this.bgypsqbz = null;
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
     *  设置属性值[办公用品申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param bgypsqzt
     */
    public void setBGYPSQZT(String bgypsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBGYPSQZT(bgypsqzt);
            return;
        }
        if(bgypsqzt!=null) {
            bgypsqzt = StringHelper.trimRight(bgypsqzt);
            if(bgypsqzt.length()==0) {
                bgypsqzt = null;
            }
        }
        this.bgypsqzt =  bgypsqzt;
        this.bgypsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[办公用品申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getBGYPSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBGYPSQZT();
        }
        return this.bgypsqzt;
    }

    /**
     *  获取属性值[办公用品申请状态]是否修改
     */
    public boolean isBGYPSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBGYPSQZTDirty();
        }
        return this.bgypsqztDirtyFlag;
    }

    /**
     *  重置属性值[办公用品申请状态]
     */
    public void resetBGYPSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBGYPSQZT();
            return;
        }

        this.bgypsqztDirtyFlag = false;
        this.bgypsqzt = null;
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
     *  设置属性值[申请部门标识]
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
     *  获取属性值[申请部门标识]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[申请部门标识]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[申请部门标识]
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
     *  设置属性值[办公用品名称]
     *  @param bgypmc
     */
    public void setBGYPMC(String bgypmc) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBGYPMC(bgypmc);
            return;
        }
        if(bgypmc!=null) {
            bgypmc = StringHelper.trimRight(bgypmc);
            if(bgypmc.length()==0) {
                bgypmc = null;
            }
        }
        this.bgypmc =  bgypmc;
        this.bgypmcDirtyFlag  = true;
    }

    /**
     *  获取属性值[办公用品名称]
     */
    public String getBGYPMC() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBGYPMC();
        }
        return this.bgypmc;
    }

    /**
     *  获取属性值[办公用品名称]是否修改
     */
    public boolean isBGYPMCDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBGYPMCDirty();
        }
        return this.bgypmcDirtyFlag;
    }

    /**
     *  重置属性值[办公用品名称]
     */
    public void resetBGYPMC() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBGYPMC();
            return;
        }

        this.bgypmcDirtyFlag = false;
        this.bgypmc = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_BGYPSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_BGYPSQ et) {
        et.resetBgypsfshtg();
        et.resetBz();
        et.resetCreateMan();
        et.resetOA_BGYPSQName();
        et.resetOA_BGYPSQId();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetUpdateMan();
        et.resetFjh();
        et.resetRQ();
        et.resetSl();
        et.resetWFINSTANCEID();
        et.resetDh();
        et.resetBGYPSQBZ();
        et.resetWFSTATE();
        et.resetMemo();
        et.resetBGYPSQZT();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetBGYPMC();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isBgypsfshtgDirty()) {
            params.put(FIELD_BGYPSFSHTG,getBgypsfshtg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_BGYPSQNameDirty()) {
            params.put(FIELD_OA_BGYPSQNAME,getOA_BGYPSQName());
        }
        if(!bDirtyOnly || isOA_BGYPSQIdDirty()) {
            params.put(FIELD_OA_BGYPSQID,getOA_BGYPSQId());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isFjhDirty()) {
            params.put(FIELD_FJH,getFjh());
        }
        if(!bDirtyOnly || isRQDirty()) {
            params.put(FIELD_RQ,getRQ());
        }
        if(!bDirtyOnly || isSlDirty()) {
            params.put(FIELD_SL,getSl());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isDhDirty()) {
            params.put(FIELD_DH,getDh());
        }
        if(!bDirtyOnly || isBGYPSQBZDirty()) {
            params.put(FIELD_BGYPSQBZ,getBGYPSQBZ());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isBGYPSQZTDirty()) {
            params.put(FIELD_BGYPSQZT,getBGYPSQZT());
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
        if(!bDirtyOnly || isBGYPMCDirty()) {
            params.put(FIELD_BGYPMC,getBGYPMC());
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

        return  OA_BGYPSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_BGYPSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_BGYPSFSHTG:
            return et.getBgypsfshtg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_BGYPSQNAME:
            return et.getOA_BGYPSQName();
        case INDEX_OA_BGYPSQID:
            return et.getOA_BGYPSQId();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_FJH:
            return et.getFjh();
        case INDEX_RQ:
            return et.getRQ();
        case INDEX_SL:
            return et.getSl();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_DH:
            return et.getDh();
        case INDEX_BGYPSQBZ:
            return et.getBGYPSQBZ();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_BGYPSQZT:
            return et.getBGYPSQZT();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_BGYPMC:
            return et.getBGYPMC();
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

        OA_BGYPSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_BGYPSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_BGYPSFSHTG:
            et.setBgypsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_BGYPSQNAME:
            et.setOA_BGYPSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_BGYPSQID:
            et.setOA_BGYPSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJH:
            et.setFjh(DataObject.getStringValue(obj));
            return ;
        case INDEX_RQ:
            et.setRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SL:
            et.setSl(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_DH:
            et.setDh(DataObject.getStringValue(obj));
            return ;
        case INDEX_BGYPSQBZ:
            et.setBGYPSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_BGYPSQZT:
            et.setBGYPSQZT(DataObject.getStringValue(obj));
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
        case INDEX_BGYPMC:
            et.setBGYPMC(DataObject.getStringValue(obj));
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

        return  OA_BGYPSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_BGYPSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_BGYPSFSHTG:
            return et.getBgypsfshtg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_BGYPSQNAME:
            return et.getOA_BGYPSQName()==null;
        case INDEX_OA_BGYPSQID:
            return et.getOA_BGYPSQId()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_FJH:
            return et.getFjh()==null;
        case INDEX_RQ:
            return et.getRQ()==null;
        case INDEX_SL:
            return et.getSl()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_DH:
            return et.getDh()==null;
        case INDEX_BGYPSQBZ:
            return et.getBGYPSQBZ()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_BGYPSQZT:
            return et.getBGYPSQZT()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_BGYPMC:
            return et.getBGYPMC()==null;
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

        return  OA_BGYPSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_BGYPSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_BGYPSFSHTG:
            return et.isBgypsfshtgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_BGYPSQNAME:
            return et.isOA_BGYPSQNameDirty();
        case INDEX_OA_BGYPSQID:
            return et.isOA_BGYPSQIdDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_FJH:
            return et.isFjhDirty();
        case INDEX_RQ:
            return et.isRQDirty();
        case INDEX_SL:
            return et.isSlDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_DH:
            return et.isDhDirty();
        case INDEX_BGYPSQBZ:
            return et.isBGYPSQBZDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_BGYPSQZT:
            return et.isBGYPSQZTDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_BGYPMC:
            return et.isBGYPMCDirty();
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
    private static  void fillJSONObject(OA_BGYPSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBgypsfshtg()!=null) {
            JSONObjectHelper.put(json,"bgypsfshtg",getJSONValue(et.getBgypsfshtg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_BGYPSQName()!=null) {
            JSONObjectHelper.put(json,"oa_bgypsqname",getJSONValue(et.getOA_BGYPSQName()),false);
        }
        if(bIncEmpty||et.getOA_BGYPSQId()!=null) {
            JSONObjectHelper.put(json,"oa_bgypsqid",getJSONValue(et.getOA_BGYPSQId()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getFjh()!=null) {
            JSONObjectHelper.put(json,"fjh",getJSONValue(et.getFjh()),false);
        }
        if(bIncEmpty||et.getRQ()!=null) {
            JSONObjectHelper.put(json,"rq",getJSONValue(et.getRQ()),false);
        }
        if(bIncEmpty||et.getSl()!=null) {
            JSONObjectHelper.put(json,"sl",getJSONValue(et.getSl()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getDh()!=null) {
            JSONObjectHelper.put(json,"dh",getJSONValue(et.getDh()),false);
        }
        if(bIncEmpty||et.getBGYPSQBZ()!=null) {
            JSONObjectHelper.put(json,"bgypsqbz",getJSONValue(et.getBGYPSQBZ()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getBGYPSQZT()!=null) {
            JSONObjectHelper.put(json,"bgypsqzt",getJSONValue(et.getBGYPSQZT()),false);
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
        if(bIncEmpty||et.getBGYPMC()!=null) {
            JSONObjectHelper.put(json,"bgypmc",getJSONValue(et.getBGYPMC()),false);
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
    private static void fillXmlNode(OA_BGYPSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBgypsfshtg()!=null) {
            Object obj = et.getBgypsfshtg();
            node.setAttribute("BGYPSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_BGYPSQName()!=null) {
            Object obj = et.getOA_BGYPSQName();
            node.setAttribute("OA_BGYPSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_BGYPSQId()!=null) {
            Object obj = et.getOA_BGYPSQId();
            node.setAttribute("OA_BGYPSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFjh()!=null) {
            Object obj = et.getFjh();
            node.setAttribute("FJH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRQ()!=null) {
            Object obj = et.getRQ();
            node.setAttribute("RQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getSl()!=null) {
            Object obj = et.getSl();
            node.setAttribute("SL",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDh()!=null) {
            Object obj = et.getDh();
            node.setAttribute("DH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBGYPSQBZ()!=null) {
            Object obj = et.getBGYPSQBZ();
            node.setAttribute("BGYPSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBGYPSQZT()!=null) {
            Object obj = et.getBGYPSQZT();
            node.setAttribute("BGYPSQZT",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getBGYPMC()!=null) {
            Object obj = et.getBGYPMC();
            node.setAttribute("BGYPMC",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_BGYPSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_BGYPSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isBgypsfshtgDirty() && (bIncEmpty||et.getBgypsfshtg()!=null)) {
            dst.set(FIELD_BGYPSFSHTG,et.getBgypsfshtg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_BGYPSQNameDirty() && (bIncEmpty||et.getOA_BGYPSQName()!=null)) {
            dst.set(FIELD_OA_BGYPSQNAME,et.getOA_BGYPSQName());
        }
        if(et.isOA_BGYPSQIdDirty() && (bIncEmpty||et.getOA_BGYPSQId()!=null)) {
            dst.set(FIELD_OA_BGYPSQID,et.getOA_BGYPSQId());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isFjhDirty() && (bIncEmpty||et.getFjh()!=null)) {
            dst.set(FIELD_FJH,et.getFjh());
        }
        if(et.isRQDirty() && (bIncEmpty||et.getRQ()!=null)) {
            dst.set(FIELD_RQ,et.getRQ());
        }
        if(et.isSlDirty() && (bIncEmpty||et.getSl()!=null)) {
            dst.set(FIELD_SL,et.getSl());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isDhDirty() && (bIncEmpty||et.getDh()!=null)) {
            dst.set(FIELD_DH,et.getDh());
        }
        if(et.isBGYPSQBZDirty() && (bIncEmpty||et.getBGYPSQBZ()!=null)) {
            dst.set(FIELD_BGYPSQBZ,et.getBGYPSQBZ());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isBGYPSQZTDirty() && (bIncEmpty||et.getBGYPSQZT()!=null)) {
            dst.set(FIELD_BGYPSQZT,et.getBGYPSQZT());
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
        if(et.isBGYPMCDirty() && (bIncEmpty||et.getBGYPMC()!=null)) {
            dst.set(FIELD_BGYPMC,et.getBGYPMC());
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
        return  OA_BGYPSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_BGYPSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_BGYPSFSHTG:
            et.resetBgypsfshtg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_BGYPSQNAME:
            et.resetOA_BGYPSQName();
            return true;
        case INDEX_OA_BGYPSQID:
            et.resetOA_BGYPSQId();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_FJH:
            et.resetFjh();
            return true;
        case INDEX_RQ:
            et.resetRQ();
            return true;
        case INDEX_SL:
            et.resetSl();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_DH:
            et.resetDh();
            return true;
        case INDEX_BGYPSQBZ:
            et.resetBGYPSQBZ();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_BGYPSQZT:
            et.resetBGYPSQZT();
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
        case INDEX_BGYPMC:
            et.resetBGYPMC();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objSQRLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser sqr = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getSQR() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSQR();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objSQRLock) {
            if(sqr==null) {
                sqr = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                sqr.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(sqr);
            }
            return sqr;
        }
    }

    private Object objSQBMLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector sqbm = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getSQBM() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSQBM();
        }

        if(this.getOrgSectorId()==null)
            return null;
        synchronized(objSQBMLock) {
            if(sqbm==null) {
                sqbm = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                sqbm.setOrgSectorId(this.getOrgSectorId());
                com.sa.unip.srv.subsys.service.OrgSectorService service = (com.sa.unip.srv.subsys.service.OrgSectorService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgSectorService.class,this.getSessionFactory());
                service.autoGet(sqbm);
            }
            return sqbm;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_BGYPSQ getProxyEntity() {
        return this.proxyOA_BGYPSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_BGYPSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_BGYPSQ) {
            this.proxyOA_BGYPSQ = (OA_BGYPSQ)proxyDataObject;
        }

    }

}