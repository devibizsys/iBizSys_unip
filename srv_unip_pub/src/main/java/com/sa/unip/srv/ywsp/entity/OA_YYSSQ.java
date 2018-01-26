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
 * 实体[OA_YYSSQ] 数据对象
 */
public class OA_YYSSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_YYSSQ.class);
    /**
     *   实体属性标识[饮用水申请是否审核通过]
     */
    public final static String FIELD_YYSSFSHTG = "YYSSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[饮用水申请标识]
     */
    public final static String FIELD_OA_YYSSQID = "OA_YYSSQID";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[饮用水申请名称]
     */
    public final static String FIELD_OA_YYSSQNAME = "OA_YYSSQNAME";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[申请人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[申请人姓名]
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
     *   实体属性标识[数量]
     */
    public final static String FIELD_SL = "SL";
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
     *   实体属性标识[引用水申请状态]
     */
    public final static String FIELD_YYSSQZT = "YYSSQZT";
    /**
     *   实体属性标识[引用水申请步骤]
     */
    public final static String FIELD_YYSSQBZ = "YYSSQBZ";

    private final static int INDEX_YYSSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_OA_YYSSQID = 2;
    private final static int INDEX_CREATEDATE = 3;
    private final static int INDEX_CREATEMAN = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_OA_YYSSQNAME = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_ORGSECTORID = 10;
    private final static int INDEX_ORGSECTORNAME = 11;
    private final static int INDEX_SL = 12;
    private final static int INDEX_FJH = 13;
    private final static int INDEX_DH = 14;
    private final static int INDEX_MEMO = 15;
    private final static int INDEX_WFINSTANCEID = 16;
    private final static int INDEX_WFSTATE = 17;
    private final static int INDEX_YYSSQZT = 18;
    private final static int INDEX_YYSSQBZ = 19;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_YYSSFSHTG, INDEX_YYSSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_OA_YYSSQID, INDEX_OA_YYSSQID);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_OA_YYSSQNAME, INDEX_OA_YYSSQNAME);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_SL, INDEX_SL);
        fieldIndexMap.put( FIELD_FJH, INDEX_FJH);
        fieldIndexMap.put( FIELD_DH, INDEX_DH);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_YYSSQZT, INDEX_YYSSQZT);
        fieldIndexMap.put( FIELD_YYSSQBZ, INDEX_YYSSQBZ);
    }

    private OA_YYSSQ proxyOA_YYSSQ = null;

    public OA_YYSSQ() {
        super();
    }
    private boolean yyssfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean oa_yyssqidDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean oa_yyssqnameDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean slDirtyFlag = false;
    private boolean fjhDirtyFlag = false;
    private boolean dhDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean yyssqztDirtyFlag = false;
    private boolean yyssqbzDirtyFlag = false;

    @Column(name="yyssfshtg")
    private String yyssfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="oa_yyssqid")
    private String oa_yyssqid;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="oa_yyssqname")
    private String oa_yyssqname;
    @Column(name="updateman")
    private String updateman;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="sl")
    private Integer sl;
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
    @Column(name="yyssqzt")
    private String yyssqzt;
    @Column(name="yyssqbz")
    private String yyssqbz;


    /**
     *  设置属性值[饮用水申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param yyssfshtg
     */
    public void setYyssfshtg(String yyssfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYyssfshtg(yyssfshtg);
            return;
        }
        if(yyssfshtg!=null) {
            yyssfshtg = StringHelper.trimRight(yyssfshtg);
            if(yyssfshtg.length()==0) {
                yyssfshtg = null;
            }
        }
        this.yyssfshtg =  yyssfshtg;
        this.yyssfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[饮用水申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getYyssfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYyssfshtg();
        }
        return this.yyssfshtg;
    }

    /**
     *  获取属性值[饮用水申请是否审核通过]是否修改
     */
    public boolean isYyssfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYyssfshtgDirty();
        }
        return this.yyssfshtgDirtyFlag;
    }

    /**
     *  重置属性值[饮用水申请是否审核通过]
     */
    public void resetYyssfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYyssfshtg();
            return;
        }

        this.yyssfshtgDirtyFlag = false;
        this.yyssfshtg = null;
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
     *  设置属性值[饮用水申请标识]
     *  @param oa_yyssqid
     */
    public void setOA_YYSSQId(String oa_yyssqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_YYSSQId(oa_yyssqid);
            return;
        }
        if(oa_yyssqid!=null) {
            oa_yyssqid = StringHelper.trimRight(oa_yyssqid);
            if(oa_yyssqid.length()==0) {
                oa_yyssqid = null;
            }
        }
        this.oa_yyssqid =  oa_yyssqid;
        this.oa_yyssqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[饮用水申请标识]
     */
    public String getOA_YYSSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_YYSSQId();
        }
        return this.oa_yyssqid;
    }

    /**
     *  获取属性值[饮用水申请标识]是否修改
     */
    public boolean isOA_YYSSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_YYSSQIdDirty();
        }
        return this.oa_yyssqidDirtyFlag;
    }

    /**
     *  重置属性值[饮用水申请标识]
     */
    public void resetOA_YYSSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_YYSSQId();
            return;
        }

        this.oa_yyssqidDirtyFlag = false;
        this.oa_yyssqid = null;
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
     *  设置属性值[饮用水申请名称]
     *  @param oa_yyssqname
     */
    public void setOA_YYSSQName(String oa_yyssqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_YYSSQName(oa_yyssqname);
            return;
        }
        if(oa_yyssqname!=null) {
            oa_yyssqname = StringHelper.trimRight(oa_yyssqname);
            if(oa_yyssqname.length()==0) {
                oa_yyssqname = null;
            }
        }
        this.oa_yyssqname =  oa_yyssqname;
        this.oa_yyssqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[饮用水申请名称]
     */
    public String getOA_YYSSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_YYSSQName();
        }
        return this.oa_yyssqname;
    }

    /**
     *  获取属性值[饮用水申请名称]是否修改
     */
    public boolean isOA_YYSSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_YYSSQNameDirty();
        }
        return this.oa_yyssqnameDirtyFlag;
    }

    /**
     *  重置属性值[饮用水申请名称]
     */
    public void resetOA_YYSSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_YYSSQName();
            return;
        }

        this.oa_yyssqnameDirtyFlag = false;
        this.oa_yyssqname = null;
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
     *  设置属性值[申请人姓名]
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
     *  获取属性值[申请人姓名]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[申请人姓名]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[申请人姓名]
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
     *  设置属性值[引用水申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param yyssqzt
     */
    public void setYYSSQZT(String yyssqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYYSSQZT(yyssqzt);
            return;
        }
        if(yyssqzt!=null) {
            yyssqzt = StringHelper.trimRight(yyssqzt);
            if(yyssqzt.length()==0) {
                yyssqzt = null;
            }
        }
        this.yyssqzt =  yyssqzt;
        this.yyssqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[引用水申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getYYSSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYYSSQZT();
        }
        return this.yyssqzt;
    }

    /**
     *  获取属性值[引用水申请状态]是否修改
     */
    public boolean isYYSSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYYSSQZTDirty();
        }
        return this.yyssqztDirtyFlag;
    }

    /**
     *  重置属性值[引用水申请状态]
     */
    public void resetYYSSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYYSSQZT();
            return;
        }

        this.yyssqztDirtyFlag = false;
        this.yyssqzt = null;
    }
    /**
     *  设置属性值[引用水申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param yyssqbz
     */
    public void setYYSSQBZ(String yyssqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYYSSQBZ(yyssqbz);
            return;
        }
        if(yyssqbz!=null) {
            yyssqbz = StringHelper.trimRight(yyssqbz);
            if(yyssqbz.length()==0) {
                yyssqbz = null;
            }
        }
        this.yyssqbz =  yyssqbz;
        this.yyssqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[引用水申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getYYSSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYYSSQBZ();
        }
        return this.yyssqbz;
    }

    /**
     *  获取属性值[引用水申请步骤]是否修改
     */
    public boolean isYYSSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYYSSQBZDirty();
        }
        return this.yyssqbzDirtyFlag;
    }

    /**
     *  重置属性值[引用水申请步骤]
     */
    public void resetYYSSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYYSSQBZ();
            return;
        }

        this.yyssqbzDirtyFlag = false;
        this.yyssqbz = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_YYSSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_YYSSQ et) {
        et.resetYyssfshtg();
        et.resetBz();
        et.resetOA_YYSSQId();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetOA_YYSSQName();
        et.resetUpdateMan();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetSl();
        et.resetFjh();
        et.resetDh();
        et.resetMemo();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetYYSSQZT();
        et.resetYYSSQBZ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isYyssfshtgDirty()) {
            params.put(FIELD_YYSSFSHTG,getYyssfshtg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isOA_YYSSQIdDirty()) {
            params.put(FIELD_OA_YYSSQID,getOA_YYSSQId());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isOA_YYSSQNameDirty()) {
            params.put(FIELD_OA_YYSSQNAME,getOA_YYSSQName());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
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
        if(!bDirtyOnly || isSlDirty()) {
            params.put(FIELD_SL,getSl());
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
        if(!bDirtyOnly || isYYSSQZTDirty()) {
            params.put(FIELD_YYSSQZT,getYYSSQZT());
        }
        if(!bDirtyOnly || isYYSSQBZDirty()) {
            params.put(FIELD_YYSSQBZ,getYYSSQBZ());
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

        return  OA_YYSSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_YYSSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_YYSSFSHTG:
            return et.getYyssfshtg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_OA_YYSSQID:
            return et.getOA_YYSSQId();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_OA_YYSSQNAME:
            return et.getOA_YYSSQName();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_SL:
            return et.getSl();
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
        case INDEX_YYSSQZT:
            return et.getYYSSQZT();
        case INDEX_YYSSQBZ:
            return et.getYYSSQBZ();
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

        OA_YYSSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_YYSSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_YYSSFSHTG:
            et.setYyssfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_YYSSQID:
            et.setOA_YYSSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_YYSSQNAME:
            et.setOA_YYSSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
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
        case INDEX_SL:
            et.setSl(DataObject.getIntegerValue(obj));
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
        case INDEX_YYSSQZT:
            et.setYYSSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_YYSSQBZ:
            et.setYYSSQBZ(DataObject.getStringValue(obj));
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

        return  OA_YYSSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_YYSSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_YYSSFSHTG:
            return et.getYyssfshtg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_OA_YYSSQID:
            return et.getOA_YYSSQId()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_OA_YYSSQNAME:
            return et.getOA_YYSSQName()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_SL:
            return et.getSl()==null;
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
        case INDEX_YYSSQZT:
            return et.getYYSSQZT()==null;
        case INDEX_YYSSQBZ:
            return et.getYYSSQBZ()==null;
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

        return  OA_YYSSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_YYSSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_YYSSFSHTG:
            return et.isYyssfshtgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_OA_YYSSQID:
            return et.isOA_YYSSQIdDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_OA_YYSSQNAME:
            return et.isOA_YYSSQNameDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_SL:
            return et.isSlDirty();
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
        case INDEX_YYSSQZT:
            return et.isYYSSQZTDirty();
        case INDEX_YYSSQBZ:
            return et.isYYSSQBZDirty();
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
    private static  void fillJSONObject(OA_YYSSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getYyssfshtg()!=null) {
            JSONObjectHelper.put(json,"yyssfshtg",getJSONValue(et.getYyssfshtg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getOA_YYSSQId()!=null) {
            JSONObjectHelper.put(json,"oa_yyssqid",getJSONValue(et.getOA_YYSSQId()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getOA_YYSSQName()!=null) {
            JSONObjectHelper.put(json,"oa_yyssqname",getJSONValue(et.getOA_YYSSQName()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
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
        if(bIncEmpty||et.getSl()!=null) {
            JSONObjectHelper.put(json,"sl",getJSONValue(et.getSl()),false);
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
        if(bIncEmpty||et.getYYSSQZT()!=null) {
            JSONObjectHelper.put(json,"yyssqzt",getJSONValue(et.getYYSSQZT()),false);
        }
        if(bIncEmpty||et.getYYSSQBZ()!=null) {
            JSONObjectHelper.put(json,"yyssqbz",getJSONValue(et.getYYSSQBZ()),false);
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
    private static void fillXmlNode(OA_YYSSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getYyssfshtg()!=null) {
            Object obj = et.getYyssfshtg();
            node.setAttribute("YYSSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_YYSSQId()!=null) {
            Object obj = et.getOA_YYSSQId();
            node.setAttribute("OA_YYSSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_YYSSQName()!=null) {
            Object obj = et.getOA_YYSSQName();
            node.setAttribute("OA_YYSSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getSl()!=null) {
            Object obj = et.getSl();
            node.setAttribute("SL",(obj==null)?"":StringHelper.format("%1$s",obj));
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
        if(bIncEmpty||et.getYYSSQZT()!=null) {
            Object obj = et.getYYSSQZT();
            node.setAttribute("YYSSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYYSSQBZ()!=null) {
            Object obj = et.getYYSSQBZ();
            node.setAttribute("YYSSQBZ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_YYSSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_YYSSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isYyssfshtgDirty() && (bIncEmpty||et.getYyssfshtg()!=null)) {
            dst.set(FIELD_YYSSFSHTG,et.getYyssfshtg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isOA_YYSSQIdDirty() && (bIncEmpty||et.getOA_YYSSQId()!=null)) {
            dst.set(FIELD_OA_YYSSQID,et.getOA_YYSSQId());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isOA_YYSSQNameDirty() && (bIncEmpty||et.getOA_YYSSQName()!=null)) {
            dst.set(FIELD_OA_YYSSQNAME,et.getOA_YYSSQName());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
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
        if(et.isSlDirty() && (bIncEmpty||et.getSl()!=null)) {
            dst.set(FIELD_SL,et.getSl());
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
        if(et.isYYSSQZTDirty() && (bIncEmpty||et.getYYSSQZT()!=null)) {
            dst.set(FIELD_YYSSQZT,et.getYYSSQZT());
        }
        if(et.isYYSSQBZDirty() && (bIncEmpty||et.getYYSSQBZ()!=null)) {
            dst.set(FIELD_YYSSQBZ,et.getYYSSQBZ());
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
        return  OA_YYSSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_YYSSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_YYSSFSHTG:
            et.resetYyssfshtg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_OA_YYSSQID:
            et.resetOA_YYSSQId();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_OA_YYSSQNAME:
            et.resetOA_YYSSQName();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
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
        case INDEX_SL:
            et.resetSl();
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
        case INDEX_YYSSQZT:
            et.resetYYSSQZT();
            return true;
        case INDEX_YYSSQBZ:
            et.resetYYSSQBZ();
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
    private OA_YYSSQ getProxyEntity() {
        return this.proxyOA_YYSSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_YYSSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_YYSSQ) {
            this.proxyOA_YYSSQ = (OA_YYSSQ)proxyDataObject;
        }

    }

}