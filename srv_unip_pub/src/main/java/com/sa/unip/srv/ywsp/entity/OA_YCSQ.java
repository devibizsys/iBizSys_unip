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
 * 实体[OA_YCSQ] 数据对象
 */
public class OA_YCSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_YCSQ.class);
    /**
     *   实体属性标识[用餐申请是否审核通过]
     */
    public final static String FIELD_YCSFSHTG = "YCSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[用餐申请标识]
     */
    public final static String FIELD_OA_YCSQID = "OA_YCSQID";
    /**
     *   实体属性标识[用餐申请名称]
     */
    public final static String FIELD_OA_YCSQNAME = "OA_YCSQNAME";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[登记人]
     */
    public final static String FIELD_DJR = "DJR";
    /**
     *   实体属性标识[登记时间]
     */
    public final static String FIELD_DJSJ = "DJSJ";
    /**
     *   实体属性标识[接待负责人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[接待负责人姓名]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[用餐地点]
     */
    public final static String FIELD_YCDD = "YCDD";
    /**
     *   实体属性标识[用餐时间]
     */
    public final static String FIELD_YCSJ = "YCSJ";
    /**
     *   实体属性标识[来客单位]
     */
    public final static String FIELD_LKDW = "LKDW";
    /**
     *   实体属性标识[出发时间]
     */
    public final static String FIELD_CFSJ = "CFSJ";
    /**
     *   实体属性标识[返回时间]
     */
    public final static String FIELD_FHSJ = "FHSJ";
    /**
     *   实体属性标识[申请时间]
     */
    public final static String FIELD_SQSJ = "SQSJ";
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
     *   实体属性标识[用餐申请状态]
     */
    public final static String FIELD_YCSQZT = "YCSQZT";
    /**
     *   实体属性标识[用餐申请步骤]
     */
    public final static String FIELD_YCSQBZ = "YCSQBZ";

    private final static int INDEX_YCSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_UPDATEDATE = 2;
    private final static int INDEX_OA_YCSQID = 3;
    private final static int INDEX_OA_YCSQNAME = 4;
    private final static int INDEX_UPDATEMAN = 5;
    private final static int INDEX_CREATEMAN = 6;
    private final static int INDEX_CREATEDATE = 7;
    private final static int INDEX_DJR = 8;
    private final static int INDEX_DJSJ = 9;
    private final static int INDEX_ORGUSERID = 10;
    private final static int INDEX_ORGUSERNAME = 11;
    private final static int INDEX_YCDD = 12;
    private final static int INDEX_YCSJ = 13;
    private final static int INDEX_LKDW = 14;
    private final static int INDEX_CFSJ = 15;
    private final static int INDEX_FHSJ = 16;
    private final static int INDEX_SQSJ = 17;
    private final static int INDEX_MEMO = 18;
    private final static int INDEX_WFINSTANCEID = 19;
    private final static int INDEX_WFSTATE = 20;
    private final static int INDEX_YCSQZT = 21;
    private final static int INDEX_YCSQBZ = 22;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_YCSFSHTG, INDEX_YCSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_OA_YCSQID, INDEX_OA_YCSQID);
        fieldIndexMap.put( FIELD_OA_YCSQNAME, INDEX_OA_YCSQNAME);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_DJR, INDEX_DJR);
        fieldIndexMap.put( FIELD_DJSJ, INDEX_DJSJ);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_YCDD, INDEX_YCDD);
        fieldIndexMap.put( FIELD_YCSJ, INDEX_YCSJ);
        fieldIndexMap.put( FIELD_LKDW, INDEX_LKDW);
        fieldIndexMap.put( FIELD_CFSJ, INDEX_CFSJ);
        fieldIndexMap.put( FIELD_FHSJ, INDEX_FHSJ);
        fieldIndexMap.put( FIELD_SQSJ, INDEX_SQSJ);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_YCSQZT, INDEX_YCSQZT);
        fieldIndexMap.put( FIELD_YCSQBZ, INDEX_YCSQBZ);
    }

    private OA_YCSQ proxyOA_YCSQ = null;

    public OA_YCSQ() {
        super();
    }
    private boolean ycsfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean oa_ycsqidDirtyFlag = false;
    private boolean oa_ycsqnameDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean djrDirtyFlag = false;
    private boolean djsjDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean ycddDirtyFlag = false;
    private boolean ycsjDirtyFlag = false;
    private boolean lkdwDirtyFlag = false;
    private boolean cfsjDirtyFlag = false;
    private boolean fhsjDirtyFlag = false;
    private boolean sqsjDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean ycsqztDirtyFlag = false;
    private boolean ycsqbzDirtyFlag = false;

    @Column(name="ycsfshtg")
    private String ycsfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="oa_ycsqid")
    private String oa_ycsqid;
    @Column(name="oa_ycsqname")
    private String oa_ycsqname;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createman")
    private String createman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="djr")
    private String djr;
    @Column(name="djsj")
    private Timestamp djsj;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="ycdd")
    private String ycdd;
    @Column(name="ycsj")
    private Timestamp ycsj;
    @Column(name="lkdw")
    private String lkdw;
    @Column(name="cfsj")
    private Timestamp cfsj;
    @Column(name="fhsj")
    private Timestamp fhsj;
    @Column(name="sqsj")
    private Timestamp sqsj;
    @Column(name="memo")
    private String memo;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="ycsqzt")
    private String ycsqzt;
    @Column(name="ycsqbz")
    private String ycsqbz;


    /**
     *  设置属性值[用餐申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param ycsfshtg
     */
    public void setYcsfshtg(String ycsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYcsfshtg(ycsfshtg);
            return;
        }
        if(ycsfshtg!=null) {
            ycsfshtg = StringHelper.trimRight(ycsfshtg);
            if(ycsfshtg.length()==0) {
                ycsfshtg = null;
            }
        }
        this.ycsfshtg =  ycsfshtg;
        this.ycsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getYcsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYcsfshtg();
        }
        return this.ycsfshtg;
    }

    /**
     *  获取属性值[用餐申请是否审核通过]是否修改
     */
    public boolean isYcsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYcsfshtgDirty();
        }
        return this.ycsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[用餐申请是否审核通过]
     */
    public void resetYcsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYcsfshtg();
            return;
        }

        this.ycsfshtgDirtyFlag = false;
        this.ycsfshtg = null;
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
     *  设置属性值[用餐申请标识]
     *  @param oa_ycsqid
     */
    public void setOA_YCSQId(String oa_ycsqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_YCSQId(oa_ycsqid);
            return;
        }
        if(oa_ycsqid!=null) {
            oa_ycsqid = StringHelper.trimRight(oa_ycsqid);
            if(oa_ycsqid.length()==0) {
                oa_ycsqid = null;
            }
        }
        this.oa_ycsqid =  oa_ycsqid;
        this.oa_ycsqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐申请标识]
     */
    public String getOA_YCSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_YCSQId();
        }
        return this.oa_ycsqid;
    }

    /**
     *  获取属性值[用餐申请标识]是否修改
     */
    public boolean isOA_YCSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_YCSQIdDirty();
        }
        return this.oa_ycsqidDirtyFlag;
    }

    /**
     *  重置属性值[用餐申请标识]
     */
    public void resetOA_YCSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_YCSQId();
            return;
        }

        this.oa_ycsqidDirtyFlag = false;
        this.oa_ycsqid = null;
    }
    /**
     *  设置属性值[用餐申请名称]
     *  @param oa_ycsqname
     */
    public void setOA_YCSQName(String oa_ycsqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_YCSQName(oa_ycsqname);
            return;
        }
        if(oa_ycsqname!=null) {
            oa_ycsqname = StringHelper.trimRight(oa_ycsqname);
            if(oa_ycsqname.length()==0) {
                oa_ycsqname = null;
            }
        }
        this.oa_ycsqname =  oa_ycsqname;
        this.oa_ycsqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐申请名称]
     */
    public String getOA_YCSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_YCSQName();
        }
        return this.oa_ycsqname;
    }

    /**
     *  获取属性值[用餐申请名称]是否修改
     */
    public boolean isOA_YCSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_YCSQNameDirty();
        }
        return this.oa_ycsqnameDirtyFlag;
    }

    /**
     *  重置属性值[用餐申请名称]
     */
    public void resetOA_YCSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_YCSQName();
            return;
        }

        this.oa_ycsqnameDirtyFlag = false;
        this.oa_ycsqname = null;
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
     *  设置属性值[登记人]
     *  @param djr
     */
    public void setDjr(String djr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDjr(djr);
            return;
        }
        if(djr!=null) {
            djr = StringHelper.trimRight(djr);
            if(djr.length()==0) {
                djr = null;
            }
        }
        this.djr =  djr;
        this.djrDirtyFlag  = true;
    }

    /**
     *  获取属性值[登记人]
     */
    public String getDjr() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDjr();
        }
        return this.djr;
    }

    /**
     *  获取属性值[登记人]是否修改
     */
    public boolean isDjrDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDjrDirty();
        }
        return this.djrDirtyFlag;
    }

    /**
     *  重置属性值[登记人]
     */
    public void resetDjr() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDjr();
            return;
        }

        this.djrDirtyFlag = false;
        this.djr = null;
    }
    /**
     *  设置属性值[登记时间]
     *  @param djsj
     */
    public void setDJSJ(Timestamp djsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDJSJ(djsj);
            return;
        }
        this.djsj =  djsj;
        this.djsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[登记时间]
     */
    public Timestamp getDJSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDJSJ();
        }
        return this.djsj;
    }

    /**
     *  获取属性值[登记时间]是否修改
     */
    public boolean isDJSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDJSJDirty();
        }
        return this.djsjDirtyFlag;
    }

    /**
     *  重置属性值[登记时间]
     */
    public void resetDJSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDJSJ();
            return;
        }

        this.djsjDirtyFlag = false;
        this.djsj = null;
    }
    /**
     *  设置属性值[接待负责人标识]
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
     *  获取属性值[接待负责人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[接待负责人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[接待负责人标识]
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
     *  设置属性值[接待负责人姓名]
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
     *  获取属性值[接待负责人姓名]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[接待负责人姓名]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[接待负责人姓名]
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
     *  设置属性值[用餐地点]
     *  @param ycdd
     */
    public void setYcdd(String ycdd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYcdd(ycdd);
            return;
        }
        if(ycdd!=null) {
            ycdd = StringHelper.trimRight(ycdd);
            if(ycdd.length()==0) {
                ycdd = null;
            }
        }
        this.ycdd =  ycdd;
        this.ycddDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐地点]
     */
    public String getYcdd() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYcdd();
        }
        return this.ycdd;
    }

    /**
     *  获取属性值[用餐地点]是否修改
     */
    public boolean isYcddDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYcddDirty();
        }
        return this.ycddDirtyFlag;
    }

    /**
     *  重置属性值[用餐地点]
     */
    public void resetYcdd() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYcdd();
            return;
        }

        this.ycddDirtyFlag = false;
        this.ycdd = null;
    }
    /**
     *  设置属性值[用餐时间]
     *  @param ycsj
     */
    public void setYCSJ(Timestamp ycsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYCSJ(ycsj);
            return;
        }
        this.ycsj =  ycsj;
        this.ycsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐时间]
     */
    public Timestamp getYCSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYCSJ();
        }
        return this.ycsj;
    }

    /**
     *  获取属性值[用餐时间]是否修改
     */
    public boolean isYCSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYCSJDirty();
        }
        return this.ycsjDirtyFlag;
    }

    /**
     *  重置属性值[用餐时间]
     */
    public void resetYCSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYCSJ();
            return;
        }

        this.ycsjDirtyFlag = false;
        this.ycsj = null;
    }
    /**
     *  设置属性值[来客单位]
     *  @param lkdw
     */
    public void setLkdw(String lkdw) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLkdw(lkdw);
            return;
        }
        if(lkdw!=null) {
            lkdw = StringHelper.trimRight(lkdw);
            if(lkdw.length()==0) {
                lkdw = null;
            }
        }
        this.lkdw =  lkdw;
        this.lkdwDirtyFlag  = true;
    }

    /**
     *  获取属性值[来客单位]
     */
    public String getLkdw() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLkdw();
        }
        return this.lkdw;
    }

    /**
     *  获取属性值[来客单位]是否修改
     */
    public boolean isLkdwDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLkdwDirty();
        }
        return this.lkdwDirtyFlag;
    }

    /**
     *  重置属性值[来客单位]
     */
    public void resetLkdw() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLkdw();
            return;
        }

        this.lkdwDirtyFlag = false;
        this.lkdw = null;
    }
    /**
     *  设置属性值[出发时间]
     *  @param cfsj
     */
    public void setCFSJ(Timestamp cfsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCFSJ(cfsj);
            return;
        }
        this.cfsj =  cfsj;
        this.cfsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[出发时间]
     */
    public Timestamp getCFSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCFSJ();
        }
        return this.cfsj;
    }

    /**
     *  获取属性值[出发时间]是否修改
     */
    public boolean isCFSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCFSJDirty();
        }
        return this.cfsjDirtyFlag;
    }

    /**
     *  重置属性值[出发时间]
     */
    public void resetCFSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCFSJ();
            return;
        }

        this.cfsjDirtyFlag = false;
        this.cfsj = null;
    }
    /**
     *  设置属性值[返回时间]
     *  @param fhsj
     */
    public void setFHSJ(Timestamp fhsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFHSJ(fhsj);
            return;
        }
        this.fhsj =  fhsj;
        this.fhsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[返回时间]
     */
    public Timestamp getFHSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFHSJ();
        }
        return this.fhsj;
    }

    /**
     *  获取属性值[返回时间]是否修改
     */
    public boolean isFHSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFHSJDirty();
        }
        return this.fhsjDirtyFlag;
    }

    /**
     *  重置属性值[返回时间]
     */
    public void resetFHSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFHSJ();
            return;
        }

        this.fhsjDirtyFlag = false;
        this.fhsj = null;
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
     *  设置属性值[用餐申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param ycsqzt
     */
    public void setYCSQZT(String ycsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYCSQZT(ycsqzt);
            return;
        }
        if(ycsqzt!=null) {
            ycsqzt = StringHelper.trimRight(ycsqzt);
            if(ycsqzt.length()==0) {
                ycsqzt = null;
            }
        }
        this.ycsqzt =  ycsqzt;
        this.ycsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getYCSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYCSQZT();
        }
        return this.ycsqzt;
    }

    /**
     *  获取属性值[用餐申请状态]是否修改
     */
    public boolean isYCSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYCSQZTDirty();
        }
        return this.ycsqztDirtyFlag;
    }

    /**
     *  重置属性值[用餐申请状态]
     */
    public void resetYCSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYCSQZT();
            return;
        }

        this.ycsqztDirtyFlag = false;
        this.ycsqzt = null;
    }
    /**
     *  设置属性值[用餐申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param ycsqbz
     */
    public void setYCSQBZ(String ycsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYCSQBZ(ycsqbz);
            return;
        }
        if(ycsqbz!=null) {
            ycsqbz = StringHelper.trimRight(ycsqbz);
            if(ycsqbz.length()==0) {
                ycsqbz = null;
            }
        }
        this.ycsqbz =  ycsqbz;
        this.ycsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getYCSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYCSQBZ();
        }
        return this.ycsqbz;
    }

    /**
     *  获取属性值[用餐申请步骤]是否修改
     */
    public boolean isYCSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYCSQBZDirty();
        }
        return this.ycsqbzDirtyFlag;
    }

    /**
     *  重置属性值[用餐申请步骤]
     */
    public void resetYCSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYCSQBZ();
            return;
        }

        this.ycsqbzDirtyFlag = false;
        this.ycsqbz = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_YCSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_YCSQ et) {
        et.resetYcsfshtg();
        et.resetBz();
        et.resetUpdateDate();
        et.resetOA_YCSQId();
        et.resetOA_YCSQName();
        et.resetUpdateMan();
        et.resetCreateMan();
        et.resetCreateDate();
        et.resetDjr();
        et.resetDJSJ();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetYcdd();
        et.resetYCSJ();
        et.resetLkdw();
        et.resetCFSJ();
        et.resetFHSJ();
        et.resetSQSJ();
        et.resetMemo();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetYCSQZT();
        et.resetYCSQBZ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isYcsfshtgDirty()) {
            params.put(FIELD_YCSFSHTG,getYcsfshtg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isOA_YCSQIdDirty()) {
            params.put(FIELD_OA_YCSQID,getOA_YCSQId());
        }
        if(!bDirtyOnly || isOA_YCSQNameDirty()) {
            params.put(FIELD_OA_YCSQNAME,getOA_YCSQName());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isDjrDirty()) {
            params.put(FIELD_DJR,getDjr());
        }
        if(!bDirtyOnly || isDJSJDirty()) {
            params.put(FIELD_DJSJ,getDJSJ());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isYcddDirty()) {
            params.put(FIELD_YCDD,getYcdd());
        }
        if(!bDirtyOnly || isYCSJDirty()) {
            params.put(FIELD_YCSJ,getYCSJ());
        }
        if(!bDirtyOnly || isLkdwDirty()) {
            params.put(FIELD_LKDW,getLkdw());
        }
        if(!bDirtyOnly || isCFSJDirty()) {
            params.put(FIELD_CFSJ,getCFSJ());
        }
        if(!bDirtyOnly || isFHSJDirty()) {
            params.put(FIELD_FHSJ,getFHSJ());
        }
        if(!bDirtyOnly || isSQSJDirty()) {
            params.put(FIELD_SQSJ,getSQSJ());
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
        if(!bDirtyOnly || isYCSQZTDirty()) {
            params.put(FIELD_YCSQZT,getYCSQZT());
        }
        if(!bDirtyOnly || isYCSQBZDirty()) {
            params.put(FIELD_YCSQBZ,getYCSQBZ());
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

        return  OA_YCSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_YCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_YCSFSHTG:
            return et.getYcsfshtg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_OA_YCSQID:
            return et.getOA_YCSQId();
        case INDEX_OA_YCSQNAME:
            return et.getOA_YCSQName();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_DJR:
            return et.getDjr();
        case INDEX_DJSJ:
            return et.getDJSJ();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_YCDD:
            return et.getYcdd();
        case INDEX_YCSJ:
            return et.getYCSJ();
        case INDEX_LKDW:
            return et.getLkdw();
        case INDEX_CFSJ:
            return et.getCFSJ();
        case INDEX_FHSJ:
            return et.getFHSJ();
        case INDEX_SQSJ:
            return et.getSQSJ();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_YCSQZT:
            return et.getYCSQZT();
        case INDEX_YCSQBZ:
            return et.getYCSQBZ();
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

        OA_YCSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_YCSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_YCSFSHTG:
            et.setYcsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_YCSQID:
            et.setOA_YCSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_YCSQNAME:
            et.setOA_YCSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_DJR:
            et.setDjr(DataObject.getStringValue(obj));
            return ;
        case INDEX_DJSJ:
            et.setDJSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_YCDD:
            et.setYcdd(DataObject.getStringValue(obj));
            return ;
        case INDEX_YCSJ:
            et.setYCSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_LKDW:
            et.setLkdw(DataObject.getStringValue(obj));
            return ;
        case INDEX_CFSJ:
            et.setCFSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_FHSJ:
            et.setFHSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SQSJ:
            et.setSQSJ(DataObject.getTimestampValue(obj));
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
        case INDEX_YCSQZT:
            et.setYCSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_YCSQBZ:
            et.setYCSQBZ(DataObject.getStringValue(obj));
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

        return  OA_YCSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_YCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_YCSFSHTG:
            return et.getYcsfshtg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_OA_YCSQID:
            return et.getOA_YCSQId()==null;
        case INDEX_OA_YCSQNAME:
            return et.getOA_YCSQName()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_DJR:
            return et.getDjr()==null;
        case INDEX_DJSJ:
            return et.getDJSJ()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_YCDD:
            return et.getYcdd()==null;
        case INDEX_YCSJ:
            return et.getYCSJ()==null;
        case INDEX_LKDW:
            return et.getLkdw()==null;
        case INDEX_CFSJ:
            return et.getCFSJ()==null;
        case INDEX_FHSJ:
            return et.getFHSJ()==null;
        case INDEX_SQSJ:
            return et.getSQSJ()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_YCSQZT:
            return et.getYCSQZT()==null;
        case INDEX_YCSQBZ:
            return et.getYCSQBZ()==null;
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

        return  OA_YCSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_YCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_YCSFSHTG:
            return et.isYcsfshtgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_OA_YCSQID:
            return et.isOA_YCSQIdDirty();
        case INDEX_OA_YCSQNAME:
            return et.isOA_YCSQNameDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_DJR:
            return et.isDjrDirty();
        case INDEX_DJSJ:
            return et.isDJSJDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_YCDD:
            return et.isYcddDirty();
        case INDEX_YCSJ:
            return et.isYCSJDirty();
        case INDEX_LKDW:
            return et.isLkdwDirty();
        case INDEX_CFSJ:
            return et.isCFSJDirty();
        case INDEX_FHSJ:
            return et.isFHSJDirty();
        case INDEX_SQSJ:
            return et.isSQSJDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_YCSQZT:
            return et.isYCSQZTDirty();
        case INDEX_YCSQBZ:
            return et.isYCSQBZDirty();
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
    private static  void fillJSONObject(OA_YCSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getYcsfshtg()!=null) {
            JSONObjectHelper.put(json,"ycsfshtg",getJSONValue(et.getYcsfshtg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getOA_YCSQId()!=null) {
            JSONObjectHelper.put(json,"oa_ycsqid",getJSONValue(et.getOA_YCSQId()),false);
        }
        if(bIncEmpty||et.getOA_YCSQName()!=null) {
            JSONObjectHelper.put(json,"oa_ycsqname",getJSONValue(et.getOA_YCSQName()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getDjr()!=null) {
            JSONObjectHelper.put(json,"djr",getJSONValue(et.getDjr()),false);
        }
        if(bIncEmpty||et.getDJSJ()!=null) {
            JSONObjectHelper.put(json,"djsj",getJSONValue(et.getDJSJ()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getYcdd()!=null) {
            JSONObjectHelper.put(json,"ycdd",getJSONValue(et.getYcdd()),false);
        }
        if(bIncEmpty||et.getYCSJ()!=null) {
            JSONObjectHelper.put(json,"ycsj",getJSONValue(et.getYCSJ()),false);
        }
        if(bIncEmpty||et.getLkdw()!=null) {
            JSONObjectHelper.put(json,"lkdw",getJSONValue(et.getLkdw()),false);
        }
        if(bIncEmpty||et.getCFSJ()!=null) {
            JSONObjectHelper.put(json,"cfsj",getJSONValue(et.getCFSJ()),false);
        }
        if(bIncEmpty||et.getFHSJ()!=null) {
            JSONObjectHelper.put(json,"fhsj",getJSONValue(et.getFHSJ()),false);
        }
        if(bIncEmpty||et.getSQSJ()!=null) {
            JSONObjectHelper.put(json,"sqsj",getJSONValue(et.getSQSJ()),false);
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
        if(bIncEmpty||et.getYCSQZT()!=null) {
            JSONObjectHelper.put(json,"ycsqzt",getJSONValue(et.getYCSQZT()),false);
        }
        if(bIncEmpty||et.getYCSQBZ()!=null) {
            JSONObjectHelper.put(json,"ycsqbz",getJSONValue(et.getYCSQBZ()),false);
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
    private static void fillXmlNode(OA_YCSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getYcsfshtg()!=null) {
            Object obj = et.getYcsfshtg();
            node.setAttribute("YCSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_YCSQId()!=null) {
            Object obj = et.getOA_YCSQId();
            node.setAttribute("OA_YCSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_YCSQName()!=null) {
            Object obj = et.getOA_YCSQName();
            node.setAttribute("OA_YCSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getDjr()!=null) {
            Object obj = et.getDjr();
            node.setAttribute("DJR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDJSJ()!=null) {
            Object obj = et.getDJSJ();
            node.setAttribute("DJSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYcdd()!=null) {
            Object obj = et.getYcdd();
            node.setAttribute("YCDD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYCSJ()!=null) {
            Object obj = et.getYCSJ();
            node.setAttribute("YCSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getLkdw()!=null) {
            Object obj = et.getLkdw();
            node.setAttribute("LKDW",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCFSJ()!=null) {
            Object obj = et.getCFSJ();
            node.setAttribute("CFSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getFHSJ()!=null) {
            Object obj = et.getFHSJ();
            node.setAttribute("FHSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getSQSJ()!=null) {
            Object obj = et.getSQSJ();
            node.setAttribute("SQSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
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
        if(bIncEmpty||et.getYCSQZT()!=null) {
            Object obj = et.getYCSQZT();
            node.setAttribute("YCSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYCSQBZ()!=null) {
            Object obj = et.getYCSQBZ();
            node.setAttribute("YCSQBZ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_YCSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_YCSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isYcsfshtgDirty() && (bIncEmpty||et.getYcsfshtg()!=null)) {
            dst.set(FIELD_YCSFSHTG,et.getYcsfshtg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isOA_YCSQIdDirty() && (bIncEmpty||et.getOA_YCSQId()!=null)) {
            dst.set(FIELD_OA_YCSQID,et.getOA_YCSQId());
        }
        if(et.isOA_YCSQNameDirty() && (bIncEmpty||et.getOA_YCSQName()!=null)) {
            dst.set(FIELD_OA_YCSQNAME,et.getOA_YCSQName());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isDjrDirty() && (bIncEmpty||et.getDjr()!=null)) {
            dst.set(FIELD_DJR,et.getDjr());
        }
        if(et.isDJSJDirty() && (bIncEmpty||et.getDJSJ()!=null)) {
            dst.set(FIELD_DJSJ,et.getDJSJ());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isYcddDirty() && (bIncEmpty||et.getYcdd()!=null)) {
            dst.set(FIELD_YCDD,et.getYcdd());
        }
        if(et.isYCSJDirty() && (bIncEmpty||et.getYCSJ()!=null)) {
            dst.set(FIELD_YCSJ,et.getYCSJ());
        }
        if(et.isLkdwDirty() && (bIncEmpty||et.getLkdw()!=null)) {
            dst.set(FIELD_LKDW,et.getLkdw());
        }
        if(et.isCFSJDirty() && (bIncEmpty||et.getCFSJ()!=null)) {
            dst.set(FIELD_CFSJ,et.getCFSJ());
        }
        if(et.isFHSJDirty() && (bIncEmpty||et.getFHSJ()!=null)) {
            dst.set(FIELD_FHSJ,et.getFHSJ());
        }
        if(et.isSQSJDirty() && (bIncEmpty||et.getSQSJ()!=null)) {
            dst.set(FIELD_SQSJ,et.getSQSJ());
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
        if(et.isYCSQZTDirty() && (bIncEmpty||et.getYCSQZT()!=null)) {
            dst.set(FIELD_YCSQZT,et.getYCSQZT());
        }
        if(et.isYCSQBZDirty() && (bIncEmpty||et.getYCSQBZ()!=null)) {
            dst.set(FIELD_YCSQBZ,et.getYCSQBZ());
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
        return  OA_YCSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_YCSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_YCSFSHTG:
            et.resetYcsfshtg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_OA_YCSQID:
            et.resetOA_YCSQId();
            return true;
        case INDEX_OA_YCSQNAME:
            et.resetOA_YCSQName();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_DJR:
            et.resetDjr();
            return true;
        case INDEX_DJSJ:
            et.resetDJSJ();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_YCDD:
            et.resetYcdd();
            return true;
        case INDEX_YCSJ:
            et.resetYCSJ();
            return true;
        case INDEX_LKDW:
            et.resetLkdw();
            return true;
        case INDEX_CFSJ:
            et.resetCFSJ();
            return true;
        case INDEX_FHSJ:
            et.resetFHSJ();
            return true;
        case INDEX_SQSJ:
            et.resetSQSJ();
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
        case INDEX_YCSQZT:
            et.resetYCSQZT();
            return true;
        case INDEX_YCSQBZ:
            et.resetYCSQBZ();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objJDFZRBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser jdfzrbs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getJDFZRBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJDFZRBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objJDFZRBSLock) {
            if(jdfzrbs==null) {
                jdfzrbs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                jdfzrbs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(jdfzrbs);
            }
            return jdfzrbs;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_YCSQ getProxyEntity() {
        return this.proxyOA_YCSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_YCSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_YCSQ) {
            this.proxyOA_YCSQ = (OA_YCSQ)proxyDataObject;
        }

    }

}