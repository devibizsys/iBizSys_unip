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
 * 实体[OA_CGSQ] 数据对象
 */
public class OA_CGSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_CGSQ.class);
    /**
     *   实体属性标识[采购申请是否审核通过]
     */
    public final static String FIELD_CGSFSHTG = "CGSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[采购申请名称]
     */
    public final static String FIELD_OA_CGSQNAME = "OA_CGSQNAME";
    /**
     *   实体属性标识[采购申请标识]
     */
    public final static String FIELD_OA_CGSQID = "OA_CGSQID";
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
     *   实体属性标识[申请人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[采购人]
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
     *   实体属性标识[申请事由]
     */
    public final static String FIELD_SQSY = "SQSY";
    /**
     *   实体属性标识[采购类型]
     */
    public final static String FIELD_CGLX = "CGLX";
    /**
     *   实体属性标识[规格]
     */
    public final static String FIELD_GG = "GG";
    /**
     *   实体属性标识[数量]
     */
    public final static String FIELD_SL = "SL";
    /**
     *   实体属性标识[价格]
     */
    public final static String FIELD_JG = "JG";
    /**
     *   实体属性标识[支付方式]
     */
    public final static String FIELD_ZFFS = "ZFFS";
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
     *   实体属性标识[采购申请状态]
     */
    public final static String FIELD_CGSQZT = "CGSQZT";
    /**
     *   实体属性标识[采购申请步骤]
     */
    public final static String FIELD_CGSQBZ = "CGSQBZ";

    private final static int INDEX_CGSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_OA_CGSQNAME = 3;
    private final static int INDEX_OA_CGSQID = 4;
    private final static int INDEX_UPDATEMAN = 5;
    private final static int INDEX_CREATEDATE = 6;
    private final static int INDEX_UPDATEDATE = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_ORGSECTORID = 10;
    private final static int INDEX_ORGSECTORNAME = 11;
    private final static int INDEX_SQSY = 12;
    private final static int INDEX_CGLX = 13;
    private final static int INDEX_GG = 14;
    private final static int INDEX_SL = 15;
    private final static int INDEX_JG = 16;
    private final static int INDEX_ZFFS = 17;
    private final static int INDEX_MEMO = 18;
    private final static int INDEX_WFINSTANCEID = 19;
    private final static int INDEX_WFSTATE = 20;
    private final static int INDEX_CGSQZT = 21;
    private final static int INDEX_CGSQBZ = 22;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CGSFSHTG, INDEX_CGSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_CGSQNAME, INDEX_OA_CGSQNAME);
        fieldIndexMap.put( FIELD_OA_CGSQID, INDEX_OA_CGSQID);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_SQSY, INDEX_SQSY);
        fieldIndexMap.put( FIELD_CGLX, INDEX_CGLX);
        fieldIndexMap.put( FIELD_GG, INDEX_GG);
        fieldIndexMap.put( FIELD_SL, INDEX_SL);
        fieldIndexMap.put( FIELD_JG, INDEX_JG);
        fieldIndexMap.put( FIELD_ZFFS, INDEX_ZFFS);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_CGSQZT, INDEX_CGSQZT);
        fieldIndexMap.put( FIELD_CGSQBZ, INDEX_CGSQBZ);
    }

    private OA_CGSQ proxyOA_CGSQ = null;

    public OA_CGSQ() {
        super();
    }
    private boolean cgsfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_cgsqnameDirtyFlag = false;
    private boolean oa_cgsqidDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean sqsyDirtyFlag = false;
    private boolean cglxDirtyFlag = false;
    private boolean ggDirtyFlag = false;
    private boolean slDirtyFlag = false;
    private boolean jgDirtyFlag = false;
    private boolean zffsDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean cgsqztDirtyFlag = false;
    private boolean cgsqbzDirtyFlag = false;

    @Column(name="cgsfshtg")
    private String cgsfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_cgsqname")
    private String oa_cgsqname;
    @Column(name="oa_cgsqid")
    private String oa_cgsqid;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="sqsy")
    private String sqsy;
    @Column(name="cglx")
    private String cglx;
    @Column(name="gg")
    private String gg;
    @Column(name="sl")
    private Integer sl;
    @Column(name="jg")
    private Double jg;
    @Column(name="zffs")
    private String zffs;
    @Column(name="memo")
    private String memo;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="cgsqzt")
    private String cgsqzt;
    @Column(name="cgsqbz")
    private String cgsqbz;


    /**
     *  设置属性值[采购申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param cgsfshtg
     */
    public void setCgsfshtg(String cgsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCgsfshtg(cgsfshtg);
            return;
        }
        if(cgsfshtg!=null) {
            cgsfshtg = StringHelper.trimRight(cgsfshtg);
            if(cgsfshtg.length()==0) {
                cgsfshtg = null;
            }
        }
        this.cgsfshtg =  cgsfshtg;
        this.cgsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getCgsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCgsfshtg();
        }
        return this.cgsfshtg;
    }

    /**
     *  获取属性值[采购申请是否审核通过]是否修改
     */
    public boolean isCgsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCgsfshtgDirty();
        }
        return this.cgsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[采购申请是否审核通过]
     */
    public void resetCgsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCgsfshtg();
            return;
        }

        this.cgsfshtgDirtyFlag = false;
        this.cgsfshtg = null;
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
     *  设置属性值[采购申请名称]
     *  @param oa_cgsqname
     */
    public void setOA_CGSQName(String oa_cgsqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CGSQName(oa_cgsqname);
            return;
        }
        if(oa_cgsqname!=null) {
            oa_cgsqname = StringHelper.trimRight(oa_cgsqname);
            if(oa_cgsqname.length()==0) {
                oa_cgsqname = null;
            }
        }
        this.oa_cgsqname =  oa_cgsqname;
        this.oa_cgsqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购申请名称]
     */
    public String getOA_CGSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CGSQName();
        }
        return this.oa_cgsqname;
    }

    /**
     *  获取属性值[采购申请名称]是否修改
     */
    public boolean isOA_CGSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CGSQNameDirty();
        }
        return this.oa_cgsqnameDirtyFlag;
    }

    /**
     *  重置属性值[采购申请名称]
     */
    public void resetOA_CGSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CGSQName();
            return;
        }

        this.oa_cgsqnameDirtyFlag = false;
        this.oa_cgsqname = null;
    }
    /**
     *  设置属性值[采购申请标识]
     *  @param oa_cgsqid
     */
    public void setOA_CGSQId(String oa_cgsqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CGSQId(oa_cgsqid);
            return;
        }
        if(oa_cgsqid!=null) {
            oa_cgsqid = StringHelper.trimRight(oa_cgsqid);
            if(oa_cgsqid.length()==0) {
                oa_cgsqid = null;
            }
        }
        this.oa_cgsqid =  oa_cgsqid;
        this.oa_cgsqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购申请标识]
     */
    public String getOA_CGSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CGSQId();
        }
        return this.oa_cgsqid;
    }

    /**
     *  获取属性值[采购申请标识]是否修改
     */
    public boolean isOA_CGSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CGSQIdDirty();
        }
        return this.oa_cgsqidDirtyFlag;
    }

    /**
     *  重置属性值[采购申请标识]
     */
    public void resetOA_CGSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CGSQId();
            return;
        }

        this.oa_cgsqidDirtyFlag = false;
        this.oa_cgsqid = null;
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
     *  设置属性值[采购人]
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
     *  获取属性值[采购人]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[采购人]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[采购人]
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
     *  设置属性值[申请事由]
     *  @param sqsy
     */
    public void setSqsy(String sqsy) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSqsy(sqsy);
            return;
        }
        if(sqsy!=null) {
            sqsy = StringHelper.trimRight(sqsy);
            if(sqsy.length()==0) {
                sqsy = null;
            }
        }
        this.sqsy =  sqsy;
        this.sqsyDirtyFlag  = true;
    }

    /**
     *  获取属性值[申请事由]
     */
    public String getSqsy() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSqsy();
        }
        return this.sqsy;
    }

    /**
     *  获取属性值[申请事由]是否修改
     */
    public boolean isSqsyDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSqsyDirty();
        }
        return this.sqsyDirtyFlag;
    }

    /**
     *  重置属性值[申请事由]
     */
    public void resetSqsy() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSqsy();
            return;
        }

        this.sqsyDirtyFlag = false;
        this.sqsy = null;
    }
    /**
     *  设置属性值[采购类型]代码表：com.sa.unip.srv.codelist.CGLXCodeListModel
     *  @param cglx
     */
    public void setCGLX(String cglx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCGLX(cglx);
            return;
        }
        if(cglx!=null) {
            cglx = StringHelper.trimRight(cglx);
            if(cglx.length()==0) {
                cglx = null;
            }
        }
        this.cglx =  cglx;
        this.cglxDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购类型]代码表：com.sa.unip.srv.codelist.CGLXCodeListModel
     */
    public String getCGLX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCGLX();
        }
        return this.cglx;
    }

    /**
     *  获取属性值[采购类型]是否修改
     */
    public boolean isCGLXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCGLXDirty();
        }
        return this.cglxDirtyFlag;
    }

    /**
     *  重置属性值[采购类型]
     */
    public void resetCGLX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCGLX();
            return;
        }

        this.cglxDirtyFlag = false;
        this.cglx = null;
    }
    /**
     *  设置属性值[规格]
     *  @param gg
     */
    public void setGg(String gg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGg(gg);
            return;
        }
        if(gg!=null) {
            gg = StringHelper.trimRight(gg);
            if(gg.length()==0) {
                gg = null;
            }
        }
        this.gg =  gg;
        this.ggDirtyFlag  = true;
    }

    /**
     *  获取属性值[规格]
     */
    public String getGg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGg();
        }
        return this.gg;
    }

    /**
     *  获取属性值[规格]是否修改
     */
    public boolean isGgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGgDirty();
        }
        return this.ggDirtyFlag;
    }

    /**
     *  重置属性值[规格]
     */
    public void resetGg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGg();
            return;
        }

        this.ggDirtyFlag = false;
        this.gg = null;
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
     *  设置属性值[价格]
     *  @param jg
     */
    public void setJg(Double jg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJg(jg);
            return;
        }
        this.jg =  jg;
        this.jgDirtyFlag  = true;
    }

    /**
     *  获取属性值[价格]
     */
    public Double getJg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJg();
        }
        return this.jg;
    }

    /**
     *  获取属性值[价格]是否修改
     */
    public boolean isJgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJgDirty();
        }
        return this.jgDirtyFlag;
    }

    /**
     *  重置属性值[价格]
     */
    public void resetJg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJg();
            return;
        }

        this.jgDirtyFlag = false;
        this.jg = null;
    }
    /**
     *  设置属性值[支付方式]代码表：com.sa.unip.srv.codelist.ZFFSCodeListModel
     *  @param zffs
     */
    public void setZFFS(String zffs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZFFS(zffs);
            return;
        }
        if(zffs!=null) {
            zffs = StringHelper.trimRight(zffs);
            if(zffs.length()==0) {
                zffs = null;
            }
        }
        this.zffs =  zffs;
        this.zffsDirtyFlag  = true;
    }

    /**
     *  获取属性值[支付方式]代码表：com.sa.unip.srv.codelist.ZFFSCodeListModel
     */
    public String getZFFS() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZFFS();
        }
        return this.zffs;
    }

    /**
     *  获取属性值[支付方式]是否修改
     */
    public boolean isZFFSDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZFFSDirty();
        }
        return this.zffsDirtyFlag;
    }

    /**
     *  重置属性值[支付方式]
     */
    public void resetZFFS() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZFFS();
            return;
        }

        this.zffsDirtyFlag = false;
        this.zffs = null;
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
     *  设置属性值[采购申请状态]代码表：com.sa.unip.srv.codelist.CL_CGSQZTCodeListModel
     *  @param cgsqzt
     */
    public void setCGSQZT(String cgsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCGSQZT(cgsqzt);
            return;
        }
        if(cgsqzt!=null) {
            cgsqzt = StringHelper.trimRight(cgsqzt);
            if(cgsqzt.length()==0) {
                cgsqzt = null;
            }
        }
        this.cgsqzt =  cgsqzt;
        this.cgsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购申请状态]代码表：com.sa.unip.srv.codelist.CL_CGSQZTCodeListModel
     */
    public String getCGSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCGSQZT();
        }
        return this.cgsqzt;
    }

    /**
     *  获取属性值[采购申请状态]是否修改
     */
    public boolean isCGSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCGSQZTDirty();
        }
        return this.cgsqztDirtyFlag;
    }

    /**
     *  重置属性值[采购申请状态]
     */
    public void resetCGSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCGSQZT();
            return;
        }

        this.cgsqztDirtyFlag = false;
        this.cgsqzt = null;
    }
    /**
     *  设置属性值[采购申请步骤]代码表：com.sa.unip.srv.codelist.CL_CGSPSQBZCodeListModel
     *  @param cgsqbz
     */
    public void setCGSQBZ(String cgsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCGSQBZ(cgsqbz);
            return;
        }
        if(cgsqbz!=null) {
            cgsqbz = StringHelper.trimRight(cgsqbz);
            if(cgsqbz.length()==0) {
                cgsqbz = null;
            }
        }
        this.cgsqbz =  cgsqbz;
        this.cgsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购申请步骤]代码表：com.sa.unip.srv.codelist.CL_CGSPSQBZCodeListModel
     */
    public String getCGSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCGSQBZ();
        }
        return this.cgsqbz;
    }

    /**
     *  获取属性值[采购申请步骤]是否修改
     */
    public boolean isCGSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCGSQBZDirty();
        }
        return this.cgsqbzDirtyFlag;
    }

    /**
     *  重置属性值[采购申请步骤]
     */
    public void resetCGSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCGSQBZ();
            return;
        }

        this.cgsqbzDirtyFlag = false;
        this.cgsqbz = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_CGSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_CGSQ et) {
        et.resetCgsfshtg();
        et.resetBz();
        et.resetCreateMan();
        et.resetOA_CGSQName();
        et.resetOA_CGSQId();
        et.resetUpdateMan();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetSqsy();
        et.resetCGLX();
        et.resetGg();
        et.resetSl();
        et.resetJg();
        et.resetZFFS();
        et.resetMemo();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetCGSQZT();
        et.resetCGSQBZ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isCgsfshtgDirty()) {
            params.put(FIELD_CGSFSHTG,getCgsfshtg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_CGSQNameDirty()) {
            params.put(FIELD_OA_CGSQNAME,getOA_CGSQName());
        }
        if(!bDirtyOnly || isOA_CGSQIdDirty()) {
            params.put(FIELD_OA_CGSQID,getOA_CGSQId());
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
        if(!bDirtyOnly || isSqsyDirty()) {
            params.put(FIELD_SQSY,getSqsy());
        }
        if(!bDirtyOnly || isCGLXDirty()) {
            params.put(FIELD_CGLX,getCGLX());
        }
        if(!bDirtyOnly || isGgDirty()) {
            params.put(FIELD_GG,getGg());
        }
        if(!bDirtyOnly || isSlDirty()) {
            params.put(FIELD_SL,getSl());
        }
        if(!bDirtyOnly || isJgDirty()) {
            params.put(FIELD_JG,getJg());
        }
        if(!bDirtyOnly || isZFFSDirty()) {
            params.put(FIELD_ZFFS,getZFFS());
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
        if(!bDirtyOnly || isCGSQZTDirty()) {
            params.put(FIELD_CGSQZT,getCGSQZT());
        }
        if(!bDirtyOnly || isCGSQBZDirty()) {
            params.put(FIELD_CGSQBZ,getCGSQBZ());
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

        return  OA_CGSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_CGSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CGSFSHTG:
            return et.getCgsfshtg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_CGSQNAME:
            return et.getOA_CGSQName();
        case INDEX_OA_CGSQID:
            return et.getOA_CGSQId();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_SQSY:
            return et.getSqsy();
        case INDEX_CGLX:
            return et.getCGLX();
        case INDEX_GG:
            return et.getGg();
        case INDEX_SL:
            return et.getSl();
        case INDEX_JG:
            return et.getJg();
        case INDEX_ZFFS:
            return et.getZFFS();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_CGSQZT:
            return et.getCGSQZT();
        case INDEX_CGSQBZ:
            return et.getCGSQBZ();
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

        OA_CGSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_CGSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CGSFSHTG:
            et.setCgsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CGSQNAME:
            et.setOA_CGSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CGSQID:
            et.setOA_CGSQId(DataObject.getStringValue(obj));
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
        case INDEX_SQSY:
            et.setSqsy(DataObject.getStringValue(obj));
            return ;
        case INDEX_CGLX:
            et.setCGLX(DataObject.getStringValue(obj));
            return ;
        case INDEX_GG:
            et.setGg(DataObject.getStringValue(obj));
            return ;
        case INDEX_SL:
            et.setSl(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_JG:
            et.setJg(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_ZFFS:
            et.setZFFS(DataObject.getStringValue(obj));
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
        case INDEX_CGSQZT:
            et.setCGSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_CGSQBZ:
            et.setCGSQBZ(DataObject.getStringValue(obj));
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

        return  OA_CGSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_CGSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CGSFSHTG:
            return et.getCgsfshtg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_CGSQNAME:
            return et.getOA_CGSQName()==null;
        case INDEX_OA_CGSQID:
            return et.getOA_CGSQId()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_SQSY:
            return et.getSqsy()==null;
        case INDEX_CGLX:
            return et.getCGLX()==null;
        case INDEX_GG:
            return et.getGg()==null;
        case INDEX_SL:
            return et.getSl()==null;
        case INDEX_JG:
            return et.getJg()==null;
        case INDEX_ZFFS:
            return et.getZFFS()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_CGSQZT:
            return et.getCGSQZT()==null;
        case INDEX_CGSQBZ:
            return et.getCGSQBZ()==null;
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

        return  OA_CGSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_CGSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CGSFSHTG:
            return et.isCgsfshtgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_CGSQNAME:
            return et.isOA_CGSQNameDirty();
        case INDEX_OA_CGSQID:
            return et.isOA_CGSQIdDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_SQSY:
            return et.isSqsyDirty();
        case INDEX_CGLX:
            return et.isCGLXDirty();
        case INDEX_GG:
            return et.isGgDirty();
        case INDEX_SL:
            return et.isSlDirty();
        case INDEX_JG:
            return et.isJgDirty();
        case INDEX_ZFFS:
            return et.isZFFSDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_CGSQZT:
            return et.isCGSQZTDirty();
        case INDEX_CGSQBZ:
            return et.isCGSQBZDirty();
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
    private static  void fillJSONObject(OA_CGSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCgsfshtg()!=null) {
            JSONObjectHelper.put(json,"cgsfshtg",getJSONValue(et.getCgsfshtg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_CGSQName()!=null) {
            JSONObjectHelper.put(json,"oa_cgsqname",getJSONValue(et.getOA_CGSQName()),false);
        }
        if(bIncEmpty||et.getOA_CGSQId()!=null) {
            JSONObjectHelper.put(json,"oa_cgsqid",getJSONValue(et.getOA_CGSQId()),false);
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
        if(bIncEmpty||et.getSqsy()!=null) {
            JSONObjectHelper.put(json,"sqsy",getJSONValue(et.getSqsy()),false);
        }
        if(bIncEmpty||et.getCGLX()!=null) {
            JSONObjectHelper.put(json,"cglx",getJSONValue(et.getCGLX()),false);
        }
        if(bIncEmpty||et.getGg()!=null) {
            JSONObjectHelper.put(json,"gg",getJSONValue(et.getGg()),false);
        }
        if(bIncEmpty||et.getSl()!=null) {
            JSONObjectHelper.put(json,"sl",getJSONValue(et.getSl()),false);
        }
        if(bIncEmpty||et.getJg()!=null) {
            JSONObjectHelper.put(json,"jg",getJSONValue(et.getJg()),false);
        }
        if(bIncEmpty||et.getZFFS()!=null) {
            JSONObjectHelper.put(json,"zffs",getJSONValue(et.getZFFS()),false);
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
        if(bIncEmpty||et.getCGSQZT()!=null) {
            JSONObjectHelper.put(json,"cgsqzt",getJSONValue(et.getCGSQZT()),false);
        }
        if(bIncEmpty||et.getCGSQBZ()!=null) {
            JSONObjectHelper.put(json,"cgsqbz",getJSONValue(et.getCGSQBZ()),false);
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
    private static void fillXmlNode(OA_CGSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCgsfshtg()!=null) {
            Object obj = et.getCgsfshtg();
            node.setAttribute("CGSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CGSQName()!=null) {
            Object obj = et.getOA_CGSQName();
            node.setAttribute("OA_CGSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CGSQId()!=null) {
            Object obj = et.getOA_CGSQId();
            node.setAttribute("OA_CGSQID",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getSqsy()!=null) {
            Object obj = et.getSqsy();
            node.setAttribute("SQSY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCGLX()!=null) {
            Object obj = et.getCGLX();
            node.setAttribute("CGLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getGg()!=null) {
            Object obj = et.getGg();
            node.setAttribute("GG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSl()!=null) {
            Object obj = et.getSl();
            node.setAttribute("SL",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getJg()!=null) {
            Object obj = et.getJg();
            node.setAttribute("JG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getZFFS()!=null) {
            Object obj = et.getZFFS();
            node.setAttribute("ZFFS",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getCGSQZT()!=null) {
            Object obj = et.getCGSQZT();
            node.setAttribute("CGSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCGSQBZ()!=null) {
            Object obj = et.getCGSQBZ();
            node.setAttribute("CGSQBZ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_CGSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_CGSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isCgsfshtgDirty() && (bIncEmpty||et.getCgsfshtg()!=null)) {
            dst.set(FIELD_CGSFSHTG,et.getCgsfshtg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_CGSQNameDirty() && (bIncEmpty||et.getOA_CGSQName()!=null)) {
            dst.set(FIELD_OA_CGSQNAME,et.getOA_CGSQName());
        }
        if(et.isOA_CGSQIdDirty() && (bIncEmpty||et.getOA_CGSQId()!=null)) {
            dst.set(FIELD_OA_CGSQID,et.getOA_CGSQId());
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
        if(et.isSqsyDirty() && (bIncEmpty||et.getSqsy()!=null)) {
            dst.set(FIELD_SQSY,et.getSqsy());
        }
        if(et.isCGLXDirty() && (bIncEmpty||et.getCGLX()!=null)) {
            dst.set(FIELD_CGLX,et.getCGLX());
        }
        if(et.isGgDirty() && (bIncEmpty||et.getGg()!=null)) {
            dst.set(FIELD_GG,et.getGg());
        }
        if(et.isSlDirty() && (bIncEmpty||et.getSl()!=null)) {
            dst.set(FIELD_SL,et.getSl());
        }
        if(et.isJgDirty() && (bIncEmpty||et.getJg()!=null)) {
            dst.set(FIELD_JG,et.getJg());
        }
        if(et.isZFFSDirty() && (bIncEmpty||et.getZFFS()!=null)) {
            dst.set(FIELD_ZFFS,et.getZFFS());
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
        if(et.isCGSQZTDirty() && (bIncEmpty||et.getCGSQZT()!=null)) {
            dst.set(FIELD_CGSQZT,et.getCGSQZT());
        }
        if(et.isCGSQBZDirty() && (bIncEmpty||et.getCGSQBZ()!=null)) {
            dst.set(FIELD_CGSQBZ,et.getCGSQBZ());
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
        return  OA_CGSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_CGSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_CGSFSHTG:
            et.resetCgsfshtg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_CGSQNAME:
            et.resetOA_CGSQName();
            return true;
        case INDEX_OA_CGSQID:
            et.resetOA_CGSQId();
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
        case INDEX_SQSY:
            et.resetSqsy();
            return true;
        case INDEX_CGLX:
            et.resetCGLX();
            return true;
        case INDEX_GG:
            et.resetGg();
            return true;
        case INDEX_SL:
            et.resetSl();
            return true;
        case INDEX_JG:
            et.resetJg();
            return true;
        case INDEX_ZFFS:
            et.resetZFFS();
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
        case INDEX_CGSQZT:
            et.resetCGSQZT();
            return true;
        case INDEX_CGSQBZ:
            et.resetCGSQBZ();
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
    private OA_CGSQ getProxyEntity() {
        return this.proxyOA_CGSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_CGSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_CGSQ) {
            this.proxyOA_CGSQ = (OA_CGSQ)proxyDataObject;
        }

    }

}