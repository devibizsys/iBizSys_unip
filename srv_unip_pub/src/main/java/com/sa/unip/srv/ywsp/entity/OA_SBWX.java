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
 * 实体[OA_SBWX] 数据对象
 */
public class OA_SBWX extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_SBWX.class);
    /**
     *   实体属性标识[设备维修是否审核通过]
     */
    public final static String FIELD_SBWXSFSHTG = "SBWXSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[设备维修标识]
     */
    public final static String FIELD_OA_SBWXID = "OA_SBWXID";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[设备维修名称]
     */
    public final static String FIELD_OA_SBWXNAME = "OA_SBWXNAME";
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
     *   实体属性标识[日期]
     */
    public final static String FIELD_RQ = "RQ";
    /**
     *   实体属性标识[故障现象]
     */
    public final static String FIELD_GZXX = "GZXX";
    /**
     *   实体属性标识[房间号]
     */
    public final static String FIELD_FJH = "FJH";
    /**
     *   实体属性标识[电话]
     */
    public final static String FIELD_DH = "DH";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[设备维修状态]
     */
    public final static String FIELD_SBWXZT = "SBWXZT";
    /**
     *   实体属性标识[设备维修步骤]
     */
    public final static String FIELD_SBWXBZ = "SBWXBZ";
    /**
     *   实体属性标识[设备]
     */
    public final static String FIELD_SB = "SB";

    private final static int INDEX_SBWXSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_UPDATEMAN = 2;
    private final static int INDEX_OA_SBWXID = 3;
    private final static int INDEX_UPDATEDATE = 4;
    private final static int INDEX_CREATEMAN = 5;
    private final static int INDEX_CREATEDATE = 6;
    private final static int INDEX_OA_SBWXNAME = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_ORGSECTORID = 10;
    private final static int INDEX_ORGSECTORNAME = 11;
    private final static int INDEX_RQ = 12;
    private final static int INDEX_GZXX = 13;
    private final static int INDEX_FJH = 14;
    private final static int INDEX_DH = 15;
    private final static int INDEX_MEMO = 16;
    private final static int INDEX_WFINSTANCEID = 17;
    private final static int INDEX_WFSTATE = 18;
    private final static int INDEX_SBWXZT = 19;
    private final static int INDEX_SBWXBZ = 20;
    private final static int INDEX_SB = 21;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_SBWXSFSHTG, INDEX_SBWXSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_OA_SBWXID, INDEX_OA_SBWXID);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_OA_SBWXNAME, INDEX_OA_SBWXNAME);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_RQ, INDEX_RQ);
        fieldIndexMap.put( FIELD_GZXX, INDEX_GZXX);
        fieldIndexMap.put( FIELD_FJH, INDEX_FJH);
        fieldIndexMap.put( FIELD_DH, INDEX_DH);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_SBWXZT, INDEX_SBWXZT);
        fieldIndexMap.put( FIELD_SBWXBZ, INDEX_SBWXBZ);
        fieldIndexMap.put( FIELD_SB, INDEX_SB);
    }

    private OA_SBWX proxyOA_SBWX = null;

    public OA_SBWX() {
        super();
    }
    private boolean sbwxsfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean oa_sbwxidDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean oa_sbwxnameDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean rqDirtyFlag = false;
    private boolean gzxxDirtyFlag = false;
    private boolean fjhDirtyFlag = false;
    private boolean dhDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean sbwxztDirtyFlag = false;
    private boolean sbwxbzDirtyFlag = false;
    private boolean sbDirtyFlag = false;

    @Column(name="sbwxsfshtg")
    private String sbwxsfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="updateman")
    private String updateman;
    @Column(name="oa_sbwxid")
    private String oa_sbwxid;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createman")
    private String createman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="oa_sbwxname")
    private String oa_sbwxname;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="rq")
    private Timestamp rq;
    @Column(name="gzxx")
    private String gzxx;
    @Column(name="fjh")
    private String fjh;
    @Column(name="dh")
    private String dh;
    @Column(name="memo")
    private String memo;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="sbwxzt")
    private String sbwxzt;
    @Column(name="sbwxbz")
    private String sbwxbz;
    @Column(name="sb")
    private String sb;


    /**
     *  设置属性值[设备维修是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param sbwxsfshtg
     */
    public void setSbwxsfshtg(String sbwxsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSbwxsfshtg(sbwxsfshtg);
            return;
        }
        if(sbwxsfshtg!=null) {
            sbwxsfshtg = StringHelper.trimRight(sbwxsfshtg);
            if(sbwxsfshtg.length()==0) {
                sbwxsfshtg = null;
            }
        }
        this.sbwxsfshtg =  sbwxsfshtg;
        this.sbwxsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备维修是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getSbwxsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSbwxsfshtg();
        }
        return this.sbwxsfshtg;
    }

    /**
     *  获取属性值[设备维修是否审核通过]是否修改
     */
    public boolean isSbwxsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSbwxsfshtgDirty();
        }
        return this.sbwxsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[设备维修是否审核通过]
     */
    public void resetSbwxsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSbwxsfshtg();
            return;
        }

        this.sbwxsfshtgDirtyFlag = false;
        this.sbwxsfshtg = null;
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
     *  设置属性值[设备维修标识]
     *  @param oa_sbwxid
     */
    public void setOA_SBWXId(String oa_sbwxid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_SBWXId(oa_sbwxid);
            return;
        }
        if(oa_sbwxid!=null) {
            oa_sbwxid = StringHelper.trimRight(oa_sbwxid);
            if(oa_sbwxid.length()==0) {
                oa_sbwxid = null;
            }
        }
        this.oa_sbwxid =  oa_sbwxid;
        this.oa_sbwxidDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备维修标识]
     */
    public String getOA_SBWXId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_SBWXId();
        }
        return this.oa_sbwxid;
    }

    /**
     *  获取属性值[设备维修标识]是否修改
     */
    public boolean isOA_SBWXIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_SBWXIdDirty();
        }
        return this.oa_sbwxidDirtyFlag;
    }

    /**
     *  重置属性值[设备维修标识]
     */
    public void resetOA_SBWXId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_SBWXId();
            return;
        }

        this.oa_sbwxidDirtyFlag = false;
        this.oa_sbwxid = null;
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
     *  设置属性值[设备维修名称]
     *  @param oa_sbwxname
     */
    public void setOA_SBWXName(String oa_sbwxname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_SBWXName(oa_sbwxname);
            return;
        }
        if(oa_sbwxname!=null) {
            oa_sbwxname = StringHelper.trimRight(oa_sbwxname);
            if(oa_sbwxname.length()==0) {
                oa_sbwxname = null;
            }
        }
        this.oa_sbwxname =  oa_sbwxname;
        this.oa_sbwxnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备维修名称]
     */
    public String getOA_SBWXName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_SBWXName();
        }
        return this.oa_sbwxname;
    }

    /**
     *  获取属性值[设备维修名称]是否修改
     */
    public boolean isOA_SBWXNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_SBWXNameDirty();
        }
        return this.oa_sbwxnameDirtyFlag;
    }

    /**
     *  重置属性值[设备维修名称]
     */
    public void resetOA_SBWXName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_SBWXName();
            return;
        }

        this.oa_sbwxnameDirtyFlag = false;
        this.oa_sbwxname = null;
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
     *  设置属性值[故障现象]
     *  @param gzxx
     */
    public void setGzxx(String gzxx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGzxx(gzxx);
            return;
        }
        if(gzxx!=null) {
            gzxx = StringHelper.trimRight(gzxx);
            if(gzxx.length()==0) {
                gzxx = null;
            }
        }
        this.gzxx =  gzxx;
        this.gzxxDirtyFlag  = true;
    }

    /**
     *  获取属性值[故障现象]
     */
    public String getGzxx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGzxx();
        }
        return this.gzxx;
    }

    /**
     *  获取属性值[故障现象]是否修改
     */
    public boolean isGzxxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGzxxDirty();
        }
        return this.gzxxDirtyFlag;
    }

    /**
     *  重置属性值[故障现象]
     */
    public void resetGzxx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGzxx();
            return;
        }

        this.gzxxDirtyFlag = false;
        this.gzxx = null;
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
     *  设置属性值[设备维修状态]代码表：com.sa.unip.srv.codelist.CL_SBWXSQZTCodeListModel
     *  @param sbwxzt
     */
    public void setSBWXZT(String sbwxzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSBWXZT(sbwxzt);
            return;
        }
        if(sbwxzt!=null) {
            sbwxzt = StringHelper.trimRight(sbwxzt);
            if(sbwxzt.length()==0) {
                sbwxzt = null;
            }
        }
        this.sbwxzt =  sbwxzt;
        this.sbwxztDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备维修状态]代码表：com.sa.unip.srv.codelist.CL_SBWXSQZTCodeListModel
     */
    public String getSBWXZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSBWXZT();
        }
        return this.sbwxzt;
    }

    /**
     *  获取属性值[设备维修状态]是否修改
     */
    public boolean isSBWXZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSBWXZTDirty();
        }
        return this.sbwxztDirtyFlag;
    }

    /**
     *  重置属性值[设备维修状态]
     */
    public void resetSBWXZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSBWXZT();
            return;
        }

        this.sbwxztDirtyFlag = false;
        this.sbwxzt = null;
    }
    /**
     *  设置属性值[设备维修步骤]代码表：com.sa.unip.srv.codelist.CL_SBWXSQBZCodeListModel
     *  @param sbwxbz
     */
    public void setSBWXBZ(String sbwxbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSBWXBZ(sbwxbz);
            return;
        }
        if(sbwxbz!=null) {
            sbwxbz = StringHelper.trimRight(sbwxbz);
            if(sbwxbz.length()==0) {
                sbwxbz = null;
            }
        }
        this.sbwxbz =  sbwxbz;
        this.sbwxbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备维修步骤]代码表：com.sa.unip.srv.codelist.CL_SBWXSQBZCodeListModel
     */
    public String getSBWXBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSBWXBZ();
        }
        return this.sbwxbz;
    }

    /**
     *  获取属性值[设备维修步骤]是否修改
     */
    public boolean isSBWXBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSBWXBZDirty();
        }
        return this.sbwxbzDirtyFlag;
    }

    /**
     *  重置属性值[设备维修步骤]
     */
    public void resetSBWXBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSBWXBZ();
            return;
        }

        this.sbwxbzDirtyFlag = false;
        this.sbwxbz = null;
    }
    /**
     *  设置属性值[设备]
     *  @param sb
     */
    public void setSB(String sb) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSB(sb);
            return;
        }
        if(sb!=null) {
            sb = StringHelper.trimRight(sb);
            if(sb.length()==0) {
                sb = null;
            }
        }
        this.sb =  sb;
        this.sbDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备]
     */
    public String getSB() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSB();
        }
        return this.sb;
    }

    /**
     *  获取属性值[设备]是否修改
     */
    public boolean isSBDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSBDirty();
        }
        return this.sbDirtyFlag;
    }

    /**
     *  重置属性值[设备]
     */
    public void resetSB() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSB();
            return;
        }

        this.sbDirtyFlag = false;
        this.sb = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_SBWX.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_SBWX et) {
        et.resetSbwxsfshtg();
        et.resetBz();
        et.resetUpdateMan();
        et.resetOA_SBWXId();
        et.resetUpdateDate();
        et.resetCreateMan();
        et.resetCreateDate();
        et.resetOA_SBWXName();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetRQ();
        et.resetGzxx();
        et.resetFjh();
        et.resetDh();
        et.resetMemo();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetSBWXZT();
        et.resetSBWXBZ();
        et.resetSB();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isSbwxsfshtgDirty()) {
            params.put(FIELD_SBWXSFSHTG,getSbwxsfshtg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isOA_SBWXIdDirty()) {
            params.put(FIELD_OA_SBWXID,getOA_SBWXId());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isOA_SBWXNameDirty()) {
            params.put(FIELD_OA_SBWXNAME,getOA_SBWXName());
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
        if(!bDirtyOnly || isRQDirty()) {
            params.put(FIELD_RQ,getRQ());
        }
        if(!bDirtyOnly || isGzxxDirty()) {
            params.put(FIELD_GZXX,getGzxx());
        }
        if(!bDirtyOnly || isFjhDirty()) {
            params.put(FIELD_FJH,getFjh());
        }
        if(!bDirtyOnly || isDhDirty()) {
            params.put(FIELD_DH,getDh());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isSBWXZTDirty()) {
            params.put(FIELD_SBWXZT,getSBWXZT());
        }
        if(!bDirtyOnly || isSBWXBZDirty()) {
            params.put(FIELD_SBWXBZ,getSBWXBZ());
        }
        if(!bDirtyOnly || isSBDirty()) {
            params.put(FIELD_SB,getSB());
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

        return  OA_SBWX.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_SBWX et,int index) throws Exception {

        switch(index) {
        case INDEX_SBWXSFSHTG:
            return et.getSbwxsfshtg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_OA_SBWXID:
            return et.getOA_SBWXId();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_OA_SBWXNAME:
            return et.getOA_SBWXName();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_RQ:
            return et.getRQ();
        case INDEX_GZXX:
            return et.getGzxx();
        case INDEX_FJH:
            return et.getFjh();
        case INDEX_DH:
            return et.getDh();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_SBWXZT:
            return et.getSBWXZT();
        case INDEX_SBWXBZ:
            return et.getSBWXBZ();
        case INDEX_SB:
            return et.getSB();
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

        OA_SBWX.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_SBWX et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_SBWXSFSHTG:
            et.setSbwxsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_SBWXID:
            et.setOA_SBWXId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_SBWXNAME:
            et.setOA_SBWXName(DataObject.getStringValue(obj));
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
        case INDEX_RQ:
            et.setRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_GZXX:
            et.setGzxx(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJH:
            et.setFjh(DataObject.getStringValue(obj));
            return ;
        case INDEX_DH:
            et.setDh(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SBWXZT:
            et.setSBWXZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_SBWXBZ:
            et.setSBWXBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_SB:
            et.setSB(DataObject.getStringValue(obj));
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

        return  OA_SBWX.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_SBWX et,int index) throws Exception {

        switch(index) {
        case INDEX_SBWXSFSHTG:
            return et.getSbwxsfshtg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_OA_SBWXID:
            return et.getOA_SBWXId()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_OA_SBWXNAME:
            return et.getOA_SBWXName()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_RQ:
            return et.getRQ()==null;
        case INDEX_GZXX:
            return et.getGzxx()==null;
        case INDEX_FJH:
            return et.getFjh()==null;
        case INDEX_DH:
            return et.getDh()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_SBWXZT:
            return et.getSBWXZT()==null;
        case INDEX_SBWXBZ:
            return et.getSBWXBZ()==null;
        case INDEX_SB:
            return et.getSB()==null;
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

        return  OA_SBWX.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_SBWX et,int index) throws Exception {

        switch(index) {
        case INDEX_SBWXSFSHTG:
            return et.isSbwxsfshtgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_OA_SBWXID:
            return et.isOA_SBWXIdDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_OA_SBWXNAME:
            return et.isOA_SBWXNameDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_RQ:
            return et.isRQDirty();
        case INDEX_GZXX:
            return et.isGzxxDirty();
        case INDEX_FJH:
            return et.isFjhDirty();
        case INDEX_DH:
            return et.isDhDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_SBWXZT:
            return et.isSBWXZTDirty();
        case INDEX_SBWXBZ:
            return et.isSBWXBZDirty();
        case INDEX_SB:
            return et.isSBDirty();
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
    private static  void fillJSONObject(OA_SBWX et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getSbwxsfshtg()!=null) {
            JSONObjectHelper.put(json,"sbwxsfshtg",getJSONValue(et.getSbwxsfshtg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getOA_SBWXId()!=null) {
            JSONObjectHelper.put(json,"oa_sbwxid",getJSONValue(et.getOA_SBWXId()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getOA_SBWXName()!=null) {
            JSONObjectHelper.put(json,"oa_sbwxname",getJSONValue(et.getOA_SBWXName()),false);
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
        if(bIncEmpty||et.getRQ()!=null) {
            JSONObjectHelper.put(json,"rq",getJSONValue(et.getRQ()),false);
        }
        if(bIncEmpty||et.getGzxx()!=null) {
            JSONObjectHelper.put(json,"gzxx",getJSONValue(et.getGzxx()),false);
        }
        if(bIncEmpty||et.getFjh()!=null) {
            JSONObjectHelper.put(json,"fjh",getJSONValue(et.getFjh()),false);
        }
        if(bIncEmpty||et.getDh()!=null) {
            JSONObjectHelper.put(json,"dh",getJSONValue(et.getDh()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getSBWXZT()!=null) {
            JSONObjectHelper.put(json,"sbwxzt",getJSONValue(et.getSBWXZT()),false);
        }
        if(bIncEmpty||et.getSBWXBZ()!=null) {
            JSONObjectHelper.put(json,"sbwxbz",getJSONValue(et.getSBWXBZ()),false);
        }
        if(bIncEmpty||et.getSB()!=null) {
            JSONObjectHelper.put(json,"sb",getJSONValue(et.getSB()),false);
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
    private static void fillXmlNode(OA_SBWX et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getSbwxsfshtg()!=null) {
            Object obj = et.getSbwxsfshtg();
            node.setAttribute("SBWXSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_SBWXId()!=null) {
            Object obj = et.getOA_SBWXId();
            node.setAttribute("OA_SBWXID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_SBWXName()!=null) {
            Object obj = et.getOA_SBWXName();
            node.setAttribute("OA_SBWXNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getRQ()!=null) {
            Object obj = et.getRQ();
            node.setAttribute("RQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getGzxx()!=null) {
            Object obj = et.getGzxx();
            node.setAttribute("GZXX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFjh()!=null) {
            Object obj = et.getFjh();
            node.setAttribute("FJH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDh()!=null) {
            Object obj = et.getDh();
            node.setAttribute("DH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSBWXZT()!=null) {
            Object obj = et.getSBWXZT();
            node.setAttribute("SBWXZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSBWXBZ()!=null) {
            Object obj = et.getSBWXBZ();
            node.setAttribute("SBWXBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSB()!=null) {
            Object obj = et.getSB();
            node.setAttribute("SB",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_SBWX.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_SBWX et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isSbwxsfshtgDirty() && (bIncEmpty||et.getSbwxsfshtg()!=null)) {
            dst.set(FIELD_SBWXSFSHTG,et.getSbwxsfshtg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isOA_SBWXIdDirty() && (bIncEmpty||et.getOA_SBWXId()!=null)) {
            dst.set(FIELD_OA_SBWXID,et.getOA_SBWXId());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isOA_SBWXNameDirty() && (bIncEmpty||et.getOA_SBWXName()!=null)) {
            dst.set(FIELD_OA_SBWXNAME,et.getOA_SBWXName());
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
        if(et.isRQDirty() && (bIncEmpty||et.getRQ()!=null)) {
            dst.set(FIELD_RQ,et.getRQ());
        }
        if(et.isGzxxDirty() && (bIncEmpty||et.getGzxx()!=null)) {
            dst.set(FIELD_GZXX,et.getGzxx());
        }
        if(et.isFjhDirty() && (bIncEmpty||et.getFjh()!=null)) {
            dst.set(FIELD_FJH,et.getFjh());
        }
        if(et.isDhDirty() && (bIncEmpty||et.getDh()!=null)) {
            dst.set(FIELD_DH,et.getDh());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isSBWXZTDirty() && (bIncEmpty||et.getSBWXZT()!=null)) {
            dst.set(FIELD_SBWXZT,et.getSBWXZT());
        }
        if(et.isSBWXBZDirty() && (bIncEmpty||et.getSBWXBZ()!=null)) {
            dst.set(FIELD_SBWXBZ,et.getSBWXBZ());
        }
        if(et.isSBDirty() && (bIncEmpty||et.getSB()!=null)) {
            dst.set(FIELD_SB,et.getSB());
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
        return  OA_SBWX.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_SBWX et,int index) throws Exception {
        switch(index) {
        case INDEX_SBWXSFSHTG:
            et.resetSbwxsfshtg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_OA_SBWXID:
            et.resetOA_SBWXId();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_OA_SBWXNAME:
            et.resetOA_SBWXName();
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
        case INDEX_RQ:
            et.resetRQ();
            return true;
        case INDEX_GZXX:
            et.resetGzxx();
            return true;
        case INDEX_FJH:
            et.resetFjh();
            return true;
        case INDEX_DH:
            et.resetDh();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_SBWXZT:
            et.resetSBWXZT();
            return true;
        case INDEX_SBWXBZ:
            et.resetSBWXBZ();
            return true;
        case INDEX_SB:
            et.resetSB();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objSQRBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser sqrbs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getSQRBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSQRBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objSQRBSLock) {
            if(sqrbs==null) {
                sqrbs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                sqrbs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(sqrbs);
            }
            return sqrbs;
        }
    }

    private Object objBMBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector bmbs = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getBMBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBMBS();
        }

        if(this.getOrgSectorId()==null)
            return null;
        synchronized(objBMBSLock) {
            if(bmbs==null) {
                bmbs = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                bmbs.setOrgSectorId(this.getOrgSectorId());
                com.sa.unip.srv.subsys.service.OrgSectorService service = (com.sa.unip.srv.subsys.service.OrgSectorService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgSectorService.class,this.getSessionFactory());
                service.autoGet(bmbs);
            }
            return bmbs;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_SBWX getProxyEntity() {
        return this.proxyOA_SBWX;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_SBWX = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_SBWX) {
            this.proxyOA_SBWX = (OA_SBWX)proxyDataObject;
        }

    }

}