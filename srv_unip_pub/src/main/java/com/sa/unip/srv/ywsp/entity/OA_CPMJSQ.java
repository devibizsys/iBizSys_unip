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
 * 实体[OA_CPMJSQ] 数据对象
 */
public class OA_CPMJSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_CPMJSQ.class);
    /**
     *   实体属性标识[车牌门禁申请是否通过]
     */
    public final static String FIELD_CPMJSFSHTG = "CPMJSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[车牌门禁申请标识]
     */
    public final static String FIELD_OA_CPMJSQID = "OA_CPMJSQID";
    /**
     *   实体属性标识[车牌门禁申请名称]
     */
    public final static String FIELD_OA_CPMJSQNAME = "OA_CPMJSQNAME";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
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
     *   实体属性标识[职务]
     */
    public final static String FIELD_ZW = "ZW";
    /**
     *   实体属性标识[联系方式]
     */
    public final static String FIELD_LXFS = "LXFS";
    /**
     *   实体属性标识[车辆品牌]
     */
    public final static String FIELD_CLPP = "CLPP";
    /**
     *   实体属性标识[车牌号]
     */
    public final static String FIELD_CPH = "CPH";
    /**
     *   实体属性标识[颜色]
     */
    public final static String FIELD_COLOR = "COLOR";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[车牌门禁申请步骤]
     */
    public final static String FIELD_CPMJSQBZ = "CPMJSQBZ";
    /**
     *   实体属性标识[车牌门禁申请状态]
     */
    public final static String FIELD_CPMJSQZT = "CPMJSQZT";
    /**
     *   实体属性标识[车辆标识]
     */
    public final static String FIELD_OA_CLID = "OA_CLID";
    /**
     *   实体属性标识[车辆名称]
     */
    public final static String FIELD_OA_CLNAME = "OA_CLNAME";

    private final static int INDEX_CPMJSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_OA_CPMJSQID = 3;
    private final static int INDEX_OA_CPMJSQNAME = 4;
    private final static int INDEX_CREATEMAN = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_ORGSECTORID = 10;
    private final static int INDEX_ORGSECTORNAME = 11;
    private final static int INDEX_ZW = 12;
    private final static int INDEX_LXFS = 13;
    private final static int INDEX_CLPP = 14;
    private final static int INDEX_CPH = 15;
    private final static int INDEX_COLOR = 16;
    private final static int INDEX_MEMO = 17;
    private final static int INDEX_FJ = 18;
    private final static int INDEX_WFINSTANCEID = 19;
    private final static int INDEX_WFSTATE = 20;
    private final static int INDEX_CPMJSQBZ = 21;
    private final static int INDEX_CPMJSQZT = 22;
    private final static int INDEX_OA_CLID = 23;
    private final static int INDEX_OA_CLNAME = 24;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CPMJSFSHTG, INDEX_CPMJSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_OA_CPMJSQID, INDEX_OA_CPMJSQID);
        fieldIndexMap.put( FIELD_OA_CPMJSQNAME, INDEX_OA_CPMJSQNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_ZW, INDEX_ZW);
        fieldIndexMap.put( FIELD_LXFS, INDEX_LXFS);
        fieldIndexMap.put( FIELD_CLPP, INDEX_CLPP);
        fieldIndexMap.put( FIELD_CPH, INDEX_CPH);
        fieldIndexMap.put( FIELD_COLOR, INDEX_COLOR);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_CPMJSQBZ, INDEX_CPMJSQBZ);
        fieldIndexMap.put( FIELD_CPMJSQZT, INDEX_CPMJSQZT);
        fieldIndexMap.put( FIELD_OA_CLID, INDEX_OA_CLID);
        fieldIndexMap.put( FIELD_OA_CLNAME, INDEX_OA_CLNAME);
    }

    private OA_CPMJSQ proxyOA_CPMJSQ = null;

    public OA_CPMJSQ() {
        super();
    }
    private boolean cpmjsfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean oa_cpmjsqidDirtyFlag = false;
    private boolean oa_cpmjsqnameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean zwDirtyFlag = false;
    private boolean lxfsDirtyFlag = false;
    private boolean clppDirtyFlag = false;
    private boolean cphDirtyFlag = false;
    private boolean colorDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean cpmjsqbzDirtyFlag = false;
    private boolean cpmjsqztDirtyFlag = false;
    private boolean oa_clidDirtyFlag = false;
    private boolean oa_clnameDirtyFlag = false;

    @Column(name="cpmjsfshtg")
    private String cpmjsfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="oa_cpmjsqid")
    private String oa_cpmjsqid;
    @Column(name="oa_cpmjsqname")
    private String oa_cpmjsqname;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
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
    @Column(name="zw")
    private String zw;
    @Column(name="lxfs")
    private String lxfs;
    @Column(name="clpp")
    private String clpp;
    @Column(name="cph")
    private String cph;
    @Column(name="color")
    private String color;
    @Column(name="memo")
    private String memo;
    @Column(name="fj")
    private String fj;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="cpmjsqbz")
    private String cpmjsqbz;
    @Column(name="cpmjsqzt")
    private String cpmjsqzt;
    @Column(name="oa_clid")
    private String oa_clid;
    @Column(name="oa_clname")
    private String oa_clname;


    /**
     *  设置属性值[车牌门禁申请是否通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param cpmjsfshtg
     */
    public void setCPMJSFSHTG(String cpmjsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCPMJSFSHTG(cpmjsfshtg);
            return;
        }
        if(cpmjsfshtg!=null) {
            cpmjsfshtg = StringHelper.trimRight(cpmjsfshtg);
            if(cpmjsfshtg.length()==0) {
                cpmjsfshtg = null;
            }
        }
        this.cpmjsfshtg =  cpmjsfshtg;
        this.cpmjsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌门禁申请是否通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getCPMJSFSHTG() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCPMJSFSHTG();
        }
        return this.cpmjsfshtg;
    }

    /**
     *  获取属性值[车牌门禁申请是否通过]是否修改
     */
    public boolean isCPMJSFSHTGDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCPMJSFSHTGDirty();
        }
        return this.cpmjsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[车牌门禁申请是否通过]
     */
    public void resetCPMJSFSHTG() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCPMJSFSHTG();
            return;
        }

        this.cpmjsfshtgDirtyFlag = false;
        this.cpmjsfshtg = null;
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
     *  设置属性值[车牌门禁申请标识]
     *  @param oa_cpmjsqid
     */
    public void setOA_CPMJSQId(String oa_cpmjsqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CPMJSQId(oa_cpmjsqid);
            return;
        }
        if(oa_cpmjsqid!=null) {
            oa_cpmjsqid = StringHelper.trimRight(oa_cpmjsqid);
            if(oa_cpmjsqid.length()==0) {
                oa_cpmjsqid = null;
            }
        }
        this.oa_cpmjsqid =  oa_cpmjsqid;
        this.oa_cpmjsqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌门禁申请标识]
     */
    public String getOA_CPMJSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CPMJSQId();
        }
        return this.oa_cpmjsqid;
    }

    /**
     *  获取属性值[车牌门禁申请标识]是否修改
     */
    public boolean isOA_CPMJSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CPMJSQIdDirty();
        }
        return this.oa_cpmjsqidDirtyFlag;
    }

    /**
     *  重置属性值[车牌门禁申请标识]
     */
    public void resetOA_CPMJSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CPMJSQId();
            return;
        }

        this.oa_cpmjsqidDirtyFlag = false;
        this.oa_cpmjsqid = null;
    }
    /**
     *  设置属性值[车牌门禁申请名称]
     *  @param oa_cpmjsqname
     */
    public void setOA_CPMJSQName(String oa_cpmjsqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CPMJSQName(oa_cpmjsqname);
            return;
        }
        if(oa_cpmjsqname!=null) {
            oa_cpmjsqname = StringHelper.trimRight(oa_cpmjsqname);
            if(oa_cpmjsqname.length()==0) {
                oa_cpmjsqname = null;
            }
        }
        this.oa_cpmjsqname =  oa_cpmjsqname;
        this.oa_cpmjsqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌门禁申请名称]
     */
    public String getOA_CPMJSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CPMJSQName();
        }
        return this.oa_cpmjsqname;
    }

    /**
     *  获取属性值[车牌门禁申请名称]是否修改
     */
    public boolean isOA_CPMJSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CPMJSQNameDirty();
        }
        return this.oa_cpmjsqnameDirtyFlag;
    }

    /**
     *  重置属性值[车牌门禁申请名称]
     */
    public void resetOA_CPMJSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CPMJSQName();
            return;
        }

        this.oa_cpmjsqnameDirtyFlag = false;
        this.oa_cpmjsqname = null;
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
     *  设置属性值[职务]
     *  @param zw
     */
    public void setZW(String zw) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZW(zw);
            return;
        }
        if(zw!=null) {
            zw = StringHelper.trimRight(zw);
            if(zw.length()==0) {
                zw = null;
            }
        }
        this.zw =  zw;
        this.zwDirtyFlag  = true;
    }

    /**
     *  获取属性值[职务]
     */
    public String getZW() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZW();
        }
        return this.zw;
    }

    /**
     *  获取属性值[职务]是否修改
     */
    public boolean isZWDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZWDirty();
        }
        return this.zwDirtyFlag;
    }

    /**
     *  重置属性值[职务]
     */
    public void resetZW() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZW();
            return;
        }

        this.zwDirtyFlag = false;
        this.zw = null;
    }
    /**
     *  设置属性值[联系方式]
     *  @param lxfs
     */
    public void setLxfs(String lxfs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLxfs(lxfs);
            return;
        }
        if(lxfs!=null) {
            lxfs = StringHelper.trimRight(lxfs);
            if(lxfs.length()==0) {
                lxfs = null;
            }
        }
        this.lxfs =  lxfs;
        this.lxfsDirtyFlag  = true;
    }

    /**
     *  获取属性值[联系方式]
     */
    public String getLxfs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLxfs();
        }
        return this.lxfs;
    }

    /**
     *  获取属性值[联系方式]是否修改
     */
    public boolean isLxfsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLxfsDirty();
        }
        return this.lxfsDirtyFlag;
    }

    /**
     *  重置属性值[联系方式]
     */
    public void resetLxfs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLxfs();
            return;
        }

        this.lxfsDirtyFlag = false;
        this.lxfs = null;
    }
    /**
     *  设置属性值[车辆品牌]
     *  @param clpp
     */
    public void setClpp(String clpp) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setClpp(clpp);
            return;
        }
        if(clpp!=null) {
            clpp = StringHelper.trimRight(clpp);
            if(clpp.length()==0) {
                clpp = null;
            }
        }
        this.clpp =  clpp;
        this.clppDirtyFlag  = true;
    }

    /**
     *  获取属性值[车辆品牌]
     */
    public String getClpp() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getClpp();
        }
        return this.clpp;
    }

    /**
     *  获取属性值[车辆品牌]是否修改
     */
    public boolean isClppDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isClppDirty();
        }
        return this.clppDirtyFlag;
    }

    /**
     *  重置属性值[车辆品牌]
     */
    public void resetClpp() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetClpp();
            return;
        }

        this.clppDirtyFlag = false;
        this.clpp = null;
    }
    /**
     *  设置属性值[车牌号]
     *  @param cph
     */
    public void setCph(String cph) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCph(cph);
            return;
        }
        if(cph!=null) {
            cph = StringHelper.trimRight(cph);
            if(cph.length()==0) {
                cph = null;
            }
        }
        this.cph =  cph;
        this.cphDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌号]
     */
    public String getCph() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCph();
        }
        return this.cph;
    }

    /**
     *  获取属性值[车牌号]是否修改
     */
    public boolean isCphDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCphDirty();
        }
        return this.cphDirtyFlag;
    }

    /**
     *  重置属性值[车牌号]
     */
    public void resetCph() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCph();
            return;
        }

        this.cphDirtyFlag = false;
        this.cph = null;
    }
    /**
     *  设置属性值[颜色]
     *  @param color
     */
    public void setColor(String color) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setColor(color);
            return;
        }
        if(color!=null) {
            color = StringHelper.trimRight(color);
            if(color.length()==0) {
                color = null;
            }
        }
        this.color =  color;
        this.colorDirtyFlag  = true;
    }

    /**
     *  获取属性值[颜色]
     */
    public String getColor() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getColor();
        }
        return this.color;
    }

    /**
     *  获取属性值[颜色]是否修改
     */
    public boolean isColorDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isColorDirty();
        }
        return this.colorDirtyFlag;
    }

    /**
     *  重置属性值[颜色]
     */
    public void resetColor() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetColor();
            return;
        }

        this.colorDirtyFlag = false;
        this.color = null;
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
     *  设置属性值[车牌门禁申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param cpmjsqbz
     */
    public void setCPMJSQBZ(String cpmjsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCPMJSQBZ(cpmjsqbz);
            return;
        }
        if(cpmjsqbz!=null) {
            cpmjsqbz = StringHelper.trimRight(cpmjsqbz);
            if(cpmjsqbz.length()==0) {
                cpmjsqbz = null;
            }
        }
        this.cpmjsqbz =  cpmjsqbz;
        this.cpmjsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌门禁申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getCPMJSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCPMJSQBZ();
        }
        return this.cpmjsqbz;
    }

    /**
     *  获取属性值[车牌门禁申请步骤]是否修改
     */
    public boolean isCPMJSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCPMJSQBZDirty();
        }
        return this.cpmjsqbzDirtyFlag;
    }

    /**
     *  重置属性值[车牌门禁申请步骤]
     */
    public void resetCPMJSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCPMJSQBZ();
            return;
        }

        this.cpmjsqbzDirtyFlag = false;
        this.cpmjsqbz = null;
    }
    /**
     *  设置属性值[车牌门禁申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param cpmjsqzt
     */
    public void setCPMJSQZT(String cpmjsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCPMJSQZT(cpmjsqzt);
            return;
        }
        if(cpmjsqzt!=null) {
            cpmjsqzt = StringHelper.trimRight(cpmjsqzt);
            if(cpmjsqzt.length()==0) {
                cpmjsqzt = null;
            }
        }
        this.cpmjsqzt =  cpmjsqzt;
        this.cpmjsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌门禁申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getCPMJSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCPMJSQZT();
        }
        return this.cpmjsqzt;
    }

    /**
     *  获取属性值[车牌门禁申请状态]是否修改
     */
    public boolean isCPMJSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCPMJSQZTDirty();
        }
        return this.cpmjsqztDirtyFlag;
    }

    /**
     *  重置属性值[车牌门禁申请状态]
     */
    public void resetCPMJSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCPMJSQZT();
            return;
        }

        this.cpmjsqztDirtyFlag = false;
        this.cpmjsqzt = null;
    }
    /**
     *  设置属性值[车辆标识]
     *  @param oa_clid
     */
    public void setOA_CLId(String oa_clid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CLId(oa_clid);
            return;
        }
        if(oa_clid!=null) {
            oa_clid = StringHelper.trimRight(oa_clid);
            if(oa_clid.length()==0) {
                oa_clid = null;
            }
        }
        this.oa_clid =  oa_clid;
        this.oa_clidDirtyFlag  = true;
    }

    /**
     *  获取属性值[车辆标识]
     */
    public String getOA_CLId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CLId();
        }
        return this.oa_clid;
    }

    /**
     *  获取属性值[车辆标识]是否修改
     */
    public boolean isOA_CLIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CLIdDirty();
        }
        return this.oa_clidDirtyFlag;
    }

    /**
     *  重置属性值[车辆标识]
     */
    public void resetOA_CLId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CLId();
            return;
        }

        this.oa_clidDirtyFlag = false;
        this.oa_clid = null;
    }
    /**
     *  设置属性值[车辆名称]
     *  @param oa_clname
     */
    public void setOA_CLName(String oa_clname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CLName(oa_clname);
            return;
        }
        if(oa_clname!=null) {
            oa_clname = StringHelper.trimRight(oa_clname);
            if(oa_clname.length()==0) {
                oa_clname = null;
            }
        }
        this.oa_clname =  oa_clname;
        this.oa_clnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[车辆名称]
     */
    public String getOA_CLName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CLName();
        }
        return this.oa_clname;
    }

    /**
     *  获取属性值[车辆名称]是否修改
     */
    public boolean isOA_CLNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CLNameDirty();
        }
        return this.oa_clnameDirtyFlag;
    }

    /**
     *  重置属性值[车辆名称]
     */
    public void resetOA_CLName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CLName();
            return;
        }

        this.oa_clnameDirtyFlag = false;
        this.oa_clname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_CPMJSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_CPMJSQ et) {
        et.resetCPMJSFSHTG();
        et.resetBz();
        et.resetCreateDate();
        et.resetOA_CPMJSQId();
        et.resetOA_CPMJSQName();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetZW();
        et.resetLxfs();
        et.resetClpp();
        et.resetCph();
        et.resetColor();
        et.resetMemo();
        et.resetFJ();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetCPMJSQBZ();
        et.resetCPMJSQZT();
        et.resetOA_CLId();
        et.resetOA_CLName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isCPMJSFSHTGDirty()) {
            params.put(FIELD_CPMJSFSHTG,getCPMJSFSHTG());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isOA_CPMJSQIdDirty()) {
            params.put(FIELD_OA_CPMJSQID,getOA_CPMJSQId());
        }
        if(!bDirtyOnly || isOA_CPMJSQNameDirty()) {
            params.put(FIELD_OA_CPMJSQNAME,getOA_CPMJSQName());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
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
        if(!bDirtyOnly || isZWDirty()) {
            params.put(FIELD_ZW,getZW());
        }
        if(!bDirtyOnly || isLxfsDirty()) {
            params.put(FIELD_LXFS,getLxfs());
        }
        if(!bDirtyOnly || isClppDirty()) {
            params.put(FIELD_CLPP,getClpp());
        }
        if(!bDirtyOnly || isCphDirty()) {
            params.put(FIELD_CPH,getCph());
        }
        if(!bDirtyOnly || isColorDirty()) {
            params.put(FIELD_COLOR,getColor());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isCPMJSQBZDirty()) {
            params.put(FIELD_CPMJSQBZ,getCPMJSQBZ());
        }
        if(!bDirtyOnly || isCPMJSQZTDirty()) {
            params.put(FIELD_CPMJSQZT,getCPMJSQZT());
        }
        if(!bDirtyOnly || isOA_CLIdDirty()) {
            params.put(FIELD_OA_CLID,getOA_CLId());
        }
        if(!bDirtyOnly || isOA_CLNameDirty()) {
            params.put(FIELD_OA_CLNAME,getOA_CLName());
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

        return  OA_CPMJSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_CPMJSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CPMJSFSHTG:
            return et.getCPMJSFSHTG();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_OA_CPMJSQID:
            return et.getOA_CPMJSQId();
        case INDEX_OA_CPMJSQNAME:
            return et.getOA_CPMJSQName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
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
        case INDEX_ZW:
            return et.getZW();
        case INDEX_LXFS:
            return et.getLxfs();
        case INDEX_CLPP:
            return et.getClpp();
        case INDEX_CPH:
            return et.getCph();
        case INDEX_COLOR:
            return et.getColor();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_CPMJSQBZ:
            return et.getCPMJSQBZ();
        case INDEX_CPMJSQZT:
            return et.getCPMJSQZT();
        case INDEX_OA_CLID:
            return et.getOA_CLId();
        case INDEX_OA_CLNAME:
            return et.getOA_CLName();
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

        OA_CPMJSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_CPMJSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CPMJSFSHTG:
            et.setCPMJSFSHTG(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_CPMJSQID:
            et.setOA_CPMJSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CPMJSQNAME:
            et.setOA_CPMJSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
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
        case INDEX_ZW:
            et.setZW(DataObject.getStringValue(obj));
            return ;
        case INDEX_LXFS:
            et.setLxfs(DataObject.getStringValue(obj));
            return ;
        case INDEX_CLPP:
            et.setClpp(DataObject.getStringValue(obj));
            return ;
        case INDEX_CPH:
            et.setCph(DataObject.getStringValue(obj));
            return ;
        case INDEX_COLOR:
            et.setColor(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_CPMJSQBZ:
            et.setCPMJSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_CPMJSQZT:
            et.setCPMJSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CLID:
            et.setOA_CLId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CLNAME:
            et.setOA_CLName(DataObject.getStringValue(obj));
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

        return  OA_CPMJSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_CPMJSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CPMJSFSHTG:
            return et.getCPMJSFSHTG()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_OA_CPMJSQID:
            return et.getOA_CPMJSQId()==null;
        case INDEX_OA_CPMJSQNAME:
            return et.getOA_CPMJSQName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
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
        case INDEX_ZW:
            return et.getZW()==null;
        case INDEX_LXFS:
            return et.getLxfs()==null;
        case INDEX_CLPP:
            return et.getClpp()==null;
        case INDEX_CPH:
            return et.getCph()==null;
        case INDEX_COLOR:
            return et.getColor()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_CPMJSQBZ:
            return et.getCPMJSQBZ()==null;
        case INDEX_CPMJSQZT:
            return et.getCPMJSQZT()==null;
        case INDEX_OA_CLID:
            return et.getOA_CLId()==null;
        case INDEX_OA_CLNAME:
            return et.getOA_CLName()==null;
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

        return  OA_CPMJSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_CPMJSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CPMJSFSHTG:
            return et.isCPMJSFSHTGDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_OA_CPMJSQID:
            return et.isOA_CPMJSQIdDirty();
        case INDEX_OA_CPMJSQNAME:
            return et.isOA_CPMJSQNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
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
        case INDEX_ZW:
            return et.isZWDirty();
        case INDEX_LXFS:
            return et.isLxfsDirty();
        case INDEX_CLPP:
            return et.isClppDirty();
        case INDEX_CPH:
            return et.isCphDirty();
        case INDEX_COLOR:
            return et.isColorDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_CPMJSQBZ:
            return et.isCPMJSQBZDirty();
        case INDEX_CPMJSQZT:
            return et.isCPMJSQZTDirty();
        case INDEX_OA_CLID:
            return et.isOA_CLIdDirty();
        case INDEX_OA_CLNAME:
            return et.isOA_CLNameDirty();
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
    private static  void fillJSONObject(OA_CPMJSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCPMJSFSHTG()!=null) {
            JSONObjectHelper.put(json,"cpmjsfshtg",getJSONValue(et.getCPMJSFSHTG()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getOA_CPMJSQId()!=null) {
            JSONObjectHelper.put(json,"oa_cpmjsqid",getJSONValue(et.getOA_CPMJSQId()),false);
        }
        if(bIncEmpty||et.getOA_CPMJSQName()!=null) {
            JSONObjectHelper.put(json,"oa_cpmjsqname",getJSONValue(et.getOA_CPMJSQName()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
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
        if(bIncEmpty||et.getZW()!=null) {
            JSONObjectHelper.put(json,"zw",getJSONValue(et.getZW()),false);
        }
        if(bIncEmpty||et.getLxfs()!=null) {
            JSONObjectHelper.put(json,"lxfs",getJSONValue(et.getLxfs()),false);
        }
        if(bIncEmpty||et.getClpp()!=null) {
            JSONObjectHelper.put(json,"clpp",getJSONValue(et.getClpp()),false);
        }
        if(bIncEmpty||et.getCph()!=null) {
            JSONObjectHelper.put(json,"cph",getJSONValue(et.getCph()),false);
        }
        if(bIncEmpty||et.getColor()!=null) {
            JSONObjectHelper.put(json,"color",getJSONValue(et.getColor()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getCPMJSQBZ()!=null) {
            JSONObjectHelper.put(json,"cpmjsqbz",getJSONValue(et.getCPMJSQBZ()),false);
        }
        if(bIncEmpty||et.getCPMJSQZT()!=null) {
            JSONObjectHelper.put(json,"cpmjsqzt",getJSONValue(et.getCPMJSQZT()),false);
        }
        if(bIncEmpty||et.getOA_CLId()!=null) {
            JSONObjectHelper.put(json,"oa_clid",getJSONValue(et.getOA_CLId()),false);
        }
        if(bIncEmpty||et.getOA_CLName()!=null) {
            JSONObjectHelper.put(json,"oa_clname",getJSONValue(et.getOA_CLName()),false);
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
    private static void fillXmlNode(OA_CPMJSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCPMJSFSHTG()!=null) {
            Object obj = et.getCPMJSFSHTG();
            node.setAttribute("CPMJSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_CPMJSQId()!=null) {
            Object obj = et.getOA_CPMJSQId();
            node.setAttribute("OA_CPMJSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CPMJSQName()!=null) {
            Object obj = et.getOA_CPMJSQName();
            node.setAttribute("OA_CPMJSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
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
        if(bIncEmpty||et.getZW()!=null) {
            Object obj = et.getZW();
            node.setAttribute("ZW",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLxfs()!=null) {
            Object obj = et.getLxfs();
            node.setAttribute("LXFS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getClpp()!=null) {
            Object obj = et.getClpp();
            node.setAttribute("CLPP",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCph()!=null) {
            Object obj = et.getCph();
            node.setAttribute("CPH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getColor()!=null) {
            Object obj = et.getColor();
            node.setAttribute("COLOR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCPMJSQBZ()!=null) {
            Object obj = et.getCPMJSQBZ();
            node.setAttribute("CPMJSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCPMJSQZT()!=null) {
            Object obj = et.getCPMJSQZT();
            node.setAttribute("CPMJSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CLId()!=null) {
            Object obj = et.getOA_CLId();
            node.setAttribute("OA_CLID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CLName()!=null) {
            Object obj = et.getOA_CLName();
            node.setAttribute("OA_CLNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_CPMJSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_CPMJSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isCPMJSFSHTGDirty() && (bIncEmpty||et.getCPMJSFSHTG()!=null)) {
            dst.set(FIELD_CPMJSFSHTG,et.getCPMJSFSHTG());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isOA_CPMJSQIdDirty() && (bIncEmpty||et.getOA_CPMJSQId()!=null)) {
            dst.set(FIELD_OA_CPMJSQID,et.getOA_CPMJSQId());
        }
        if(et.isOA_CPMJSQNameDirty() && (bIncEmpty||et.getOA_CPMJSQName()!=null)) {
            dst.set(FIELD_OA_CPMJSQNAME,et.getOA_CPMJSQName());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
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
        if(et.isZWDirty() && (bIncEmpty||et.getZW()!=null)) {
            dst.set(FIELD_ZW,et.getZW());
        }
        if(et.isLxfsDirty() && (bIncEmpty||et.getLxfs()!=null)) {
            dst.set(FIELD_LXFS,et.getLxfs());
        }
        if(et.isClppDirty() && (bIncEmpty||et.getClpp()!=null)) {
            dst.set(FIELD_CLPP,et.getClpp());
        }
        if(et.isCphDirty() && (bIncEmpty||et.getCph()!=null)) {
            dst.set(FIELD_CPH,et.getCph());
        }
        if(et.isColorDirty() && (bIncEmpty||et.getColor()!=null)) {
            dst.set(FIELD_COLOR,et.getColor());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isCPMJSQBZDirty() && (bIncEmpty||et.getCPMJSQBZ()!=null)) {
            dst.set(FIELD_CPMJSQBZ,et.getCPMJSQBZ());
        }
        if(et.isCPMJSQZTDirty() && (bIncEmpty||et.getCPMJSQZT()!=null)) {
            dst.set(FIELD_CPMJSQZT,et.getCPMJSQZT());
        }
        if(et.isOA_CLIdDirty() && (bIncEmpty||et.getOA_CLId()!=null)) {
            dst.set(FIELD_OA_CLID,et.getOA_CLId());
        }
        if(et.isOA_CLNameDirty() && (bIncEmpty||et.getOA_CLName()!=null)) {
            dst.set(FIELD_OA_CLNAME,et.getOA_CLName());
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
        return  OA_CPMJSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_CPMJSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_CPMJSFSHTG:
            et.resetCPMJSFSHTG();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_OA_CPMJSQID:
            et.resetOA_CPMJSQId();
            return true;
        case INDEX_OA_CPMJSQNAME:
            et.resetOA_CPMJSQName();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
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
        case INDEX_ZW:
            et.resetZW();
            return true;
        case INDEX_LXFS:
            et.resetLxfs();
            return true;
        case INDEX_CLPP:
            et.resetClpp();
            return true;
        case INDEX_CPH:
            et.resetCph();
            return true;
        case INDEX_COLOR:
            et.resetColor();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_FJ:
            et.resetFJ();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_CPMJSQBZ:
            et.resetCPMJSQBZ();
            return true;
        case INDEX_CPMJSQZT:
            et.resetCPMJSQZT();
            return true;
        case INDEX_OA_CLID:
            et.resetOA_CLId();
            return true;
        case INDEX_OA_CLNAME:
            et.resetOA_CLName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objCLBSLock = new Object();
    private com.sa.unip.srv.jcsj.entity.OA_CL clbs = null;
    /**
    * 获取父数据 车辆
     * @throws Exception
    */
    public com.sa.unip.srv.jcsj.entity.OA_CL getCLBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCLBS();
        }

        if(this.getOA_CLId()==null)
            return null;
        synchronized(objCLBSLock) {
            if(clbs==null) {
                clbs = new com.sa.unip.srv.jcsj.entity.OA_CL();
                clbs.setOA_CLId(this.getOA_CLId());
                com.sa.unip.srv.jcsj.service.OA_CLService service = (com.sa.unip.srv.jcsj.service.OA_CLService)ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_CLService.class,this.getSessionFactory());
                service.autoGet(clbs);
            }
            return clbs;
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





    /**
     *  获取代理的数据对象
     */
    private OA_CPMJSQ getProxyEntity() {
        return this.proxyOA_CPMJSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_CPMJSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_CPMJSQ) {
            this.proxyOA_CPMJSQ = (OA_CPMJSQ)proxyDataObject;
        }

    }

}