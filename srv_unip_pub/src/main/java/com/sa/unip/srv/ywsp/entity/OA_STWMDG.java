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
 * 实体[OA_STWMDG] 数据对象
 */
public class OA_STWMDG extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_STWMDG.class);
    /**
     *   实体属性标识[食堂外卖是否审核通过]
     */
    public final static String FIELD_STWMSFSHTG = "STWMSFSHTG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[食堂外卖订购名称]
     */
    public final static String FIELD_OA_STWMDGNAME = "OA_STWMDGNAME";
    /**
     *   实体属性标识[食堂外卖订购标识]
     */
    public final static String FIELD_OA_STWMDGID = "OA_STWMDGID";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[订餐人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[订餐人姓名]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[用餐地点]
     */
    public final static String FIELD_YCDD = "YCDD";
    /**
     *   实体属性标识[送餐时间]
     */
    public final static String FIELD_SCSJ = "SCSJ";
    /**
     *   实体属性标识[用餐人数]
     */
    public final static String FIELD_YCRS = "YCRS";
    /**
     *   实体属性标识[事由]
     */
    public final static String FIELD_SY = "SY";
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
     *   实体属性标识[食堂外卖订购步骤]
     */
    public final static String FIELD_STWMDGBZ = "STWMDGBZ";
    /**
     *   实体属性标识[食堂外卖订购状态]
     */
    public final static String FIELD_STWMDGZT = "STWMDGZT";

    private final static int INDEX_STWMSFSHTG = 0;
    private final static int INDEX_BZ = 1;
    private final static int INDEX_OA_STWMDGNAME = 2;
    private final static int INDEX_OA_STWMDGID = 3;
    private final static int INDEX_UPDATEDATE = 4;
    private final static int INDEX_UPDATEMAN = 5;
    private final static int INDEX_CREATEDATE = 6;
    private final static int INDEX_CREATEMAN = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_YCDD = 10;
    private final static int INDEX_SCSJ = 11;
    private final static int INDEX_YCRS = 12;
    private final static int INDEX_SY = 13;
    private final static int INDEX_MEMO = 14;
    private final static int INDEX_FJ = 15;
    private final static int INDEX_WFINSTANCEID = 16;
    private final static int INDEX_WFSTATE = 17;
    private final static int INDEX_STWMDGBZ = 18;
    private final static int INDEX_STWMDGZT = 19;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_STWMSFSHTG, INDEX_STWMSFSHTG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_OA_STWMDGNAME, INDEX_OA_STWMDGNAME);
        fieldIndexMap.put( FIELD_OA_STWMDGID, INDEX_OA_STWMDGID);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_YCDD, INDEX_YCDD);
        fieldIndexMap.put( FIELD_SCSJ, INDEX_SCSJ);
        fieldIndexMap.put( FIELD_YCRS, INDEX_YCRS);
        fieldIndexMap.put( FIELD_SY, INDEX_SY);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_STWMDGBZ, INDEX_STWMDGBZ);
        fieldIndexMap.put( FIELD_STWMDGZT, INDEX_STWMDGZT);
    }

    private OA_STWMDG proxyOA_STWMDG = null;

    public OA_STWMDG() {
        super();
    }
    private boolean stwmsfshtgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean oa_stwmdgnameDirtyFlag = false;
    private boolean oa_stwmdgidDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean ycddDirtyFlag = false;
    private boolean scsjDirtyFlag = false;
    private boolean ycrsDirtyFlag = false;
    private boolean syDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean stwmdgbzDirtyFlag = false;
    private boolean stwmdgztDirtyFlag = false;

    @Column(name="stwmsfshtg")
    private String stwmsfshtg;
    @Column(name="bz")
    private String bz;
    @Column(name="oa_stwmdgname")
    private String oa_stwmdgname;
    @Column(name="oa_stwmdgid")
    private String oa_stwmdgid;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="ycdd")
    private String ycdd;
    @Column(name="scsj")
    private Timestamp scsj;
    @Column(name="ycrs")
    private Integer ycrs;
    @Column(name="sy")
    private String sy;
    @Column(name="memo")
    private String memo;
    @Column(name="fj")
    private String fj;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="stwmdgbz")
    private String stwmdgbz;
    @Column(name="stwmdgzt")
    private String stwmdgzt;


    /**
     *  设置属性值[食堂外卖是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param stwmsfshtg
     */
    public void setStwmsfshtg(String stwmsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setStwmsfshtg(stwmsfshtg);
            return;
        }
        if(stwmsfshtg!=null) {
            stwmsfshtg = StringHelper.trimRight(stwmsfshtg);
            if(stwmsfshtg.length()==0) {
                stwmsfshtg = null;
            }
        }
        this.stwmsfshtg =  stwmsfshtg;
        this.stwmsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[食堂外卖是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getStwmsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getStwmsfshtg();
        }
        return this.stwmsfshtg;
    }

    /**
     *  获取属性值[食堂外卖是否审核通过]是否修改
     */
    public boolean isStwmsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isStwmsfshtgDirty();
        }
        return this.stwmsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[食堂外卖是否审核通过]
     */
    public void resetStwmsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetStwmsfshtg();
            return;
        }

        this.stwmsfshtgDirtyFlag = false;
        this.stwmsfshtg = null;
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
     *  设置属性值[食堂外卖订购名称]
     *  @param oa_stwmdgname
     */
    public void setOA_STWMDGName(String oa_stwmdgname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_STWMDGName(oa_stwmdgname);
            return;
        }
        if(oa_stwmdgname!=null) {
            oa_stwmdgname = StringHelper.trimRight(oa_stwmdgname);
            if(oa_stwmdgname.length()==0) {
                oa_stwmdgname = null;
            }
        }
        this.oa_stwmdgname =  oa_stwmdgname;
        this.oa_stwmdgnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[食堂外卖订购名称]
     */
    public String getOA_STWMDGName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_STWMDGName();
        }
        return this.oa_stwmdgname;
    }

    /**
     *  获取属性值[食堂外卖订购名称]是否修改
     */
    public boolean isOA_STWMDGNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_STWMDGNameDirty();
        }
        return this.oa_stwmdgnameDirtyFlag;
    }

    /**
     *  重置属性值[食堂外卖订购名称]
     */
    public void resetOA_STWMDGName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_STWMDGName();
            return;
        }

        this.oa_stwmdgnameDirtyFlag = false;
        this.oa_stwmdgname = null;
    }
    /**
     *  设置属性值[食堂外卖订购标识]
     *  @param oa_stwmdgid
     */
    public void setOA_STWMDGId(String oa_stwmdgid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_STWMDGId(oa_stwmdgid);
            return;
        }
        if(oa_stwmdgid!=null) {
            oa_stwmdgid = StringHelper.trimRight(oa_stwmdgid);
            if(oa_stwmdgid.length()==0) {
                oa_stwmdgid = null;
            }
        }
        this.oa_stwmdgid =  oa_stwmdgid;
        this.oa_stwmdgidDirtyFlag  = true;
    }

    /**
     *  获取属性值[食堂外卖订购标识]
     */
    public String getOA_STWMDGId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_STWMDGId();
        }
        return this.oa_stwmdgid;
    }

    /**
     *  获取属性值[食堂外卖订购标识]是否修改
     */
    public boolean isOA_STWMDGIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_STWMDGIdDirty();
        }
        return this.oa_stwmdgidDirtyFlag;
    }

    /**
     *  重置属性值[食堂外卖订购标识]
     */
    public void resetOA_STWMDGId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_STWMDGId();
            return;
        }

        this.oa_stwmdgidDirtyFlag = false;
        this.oa_stwmdgid = null;
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
     *  设置属性值[订餐人标识]
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
     *  获取属性值[订餐人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[订餐人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[订餐人标识]
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
     *  设置属性值[订餐人姓名]
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
     *  获取属性值[订餐人姓名]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[订餐人姓名]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[订餐人姓名]
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
     *  设置属性值[送餐时间]
     *  @param scsj
     */
    public void setSCSJ(Timestamp scsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSCSJ(scsj);
            return;
        }
        this.scsj =  scsj;
        this.scsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[送餐时间]
     */
    public Timestamp getSCSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSCSJ();
        }
        return this.scsj;
    }

    /**
     *  获取属性值[送餐时间]是否修改
     */
    public boolean isSCSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSCSJDirty();
        }
        return this.scsjDirtyFlag;
    }

    /**
     *  重置属性值[送餐时间]
     */
    public void resetSCSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSCSJ();
            return;
        }

        this.scsjDirtyFlag = false;
        this.scsj = null;
    }
    /**
     *  设置属性值[用餐人数]
     *  @param ycrs
     */
    public void setYcrs(Integer ycrs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYcrs(ycrs);
            return;
        }
        this.ycrs =  ycrs;
        this.ycrsDirtyFlag  = true;
    }

    /**
     *  获取属性值[用餐人数]
     */
    public Integer getYcrs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYcrs();
        }
        return this.ycrs;
    }

    /**
     *  获取属性值[用餐人数]是否修改
     */
    public boolean isYcrsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYcrsDirty();
        }
        return this.ycrsDirtyFlag;
    }

    /**
     *  重置属性值[用餐人数]
     */
    public void resetYcrs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYcrs();
            return;
        }

        this.ycrsDirtyFlag = false;
        this.ycrs = null;
    }
    /**
     *  设置属性值[事由]
     *  @param sy
     */
    public void setSy(String sy) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSy(sy);
            return;
        }
        if(sy!=null) {
            sy = StringHelper.trimRight(sy);
            if(sy.length()==0) {
                sy = null;
            }
        }
        this.sy =  sy;
        this.syDirtyFlag  = true;
    }

    /**
     *  获取属性值[事由]
     */
    public String getSy() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSy();
        }
        return this.sy;
    }

    /**
     *  获取属性值[事由]是否修改
     */
    public boolean isSyDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSyDirty();
        }
        return this.syDirtyFlag;
    }

    /**
     *  重置属性值[事由]
     */
    public void resetSy() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSy();
            return;
        }

        this.syDirtyFlag = false;
        this.sy = null;
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
     *  设置属性值[食堂外卖订购步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param stwmdgbz
     */
    public void setSTWMDGBZ(String stwmdgbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSTWMDGBZ(stwmdgbz);
            return;
        }
        if(stwmdgbz!=null) {
            stwmdgbz = StringHelper.trimRight(stwmdgbz);
            if(stwmdgbz.length()==0) {
                stwmdgbz = null;
            }
        }
        this.stwmdgbz =  stwmdgbz;
        this.stwmdgbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[食堂外卖订购步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getSTWMDGBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSTWMDGBZ();
        }
        return this.stwmdgbz;
    }

    /**
     *  获取属性值[食堂外卖订购步骤]是否修改
     */
    public boolean isSTWMDGBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSTWMDGBZDirty();
        }
        return this.stwmdgbzDirtyFlag;
    }

    /**
     *  重置属性值[食堂外卖订购步骤]
     */
    public void resetSTWMDGBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSTWMDGBZ();
            return;
        }

        this.stwmdgbzDirtyFlag = false;
        this.stwmdgbz = null;
    }
    /**
     *  设置属性值[食堂外卖订购状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param stwmdgzt
     */
    public void setSTWMDGZT(String stwmdgzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSTWMDGZT(stwmdgzt);
            return;
        }
        if(stwmdgzt!=null) {
            stwmdgzt = StringHelper.trimRight(stwmdgzt);
            if(stwmdgzt.length()==0) {
                stwmdgzt = null;
            }
        }
        this.stwmdgzt =  stwmdgzt;
        this.stwmdgztDirtyFlag  = true;
    }

    /**
     *  获取属性值[食堂外卖订购状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getSTWMDGZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSTWMDGZT();
        }
        return this.stwmdgzt;
    }

    /**
     *  获取属性值[食堂外卖订购状态]是否修改
     */
    public boolean isSTWMDGZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSTWMDGZTDirty();
        }
        return this.stwmdgztDirtyFlag;
    }

    /**
     *  重置属性值[食堂外卖订购状态]
     */
    public void resetSTWMDGZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSTWMDGZT();
            return;
        }

        this.stwmdgztDirtyFlag = false;
        this.stwmdgzt = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_STWMDG.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_STWMDG et) {
        et.resetStwmsfshtg();
        et.resetBz();
        et.resetOA_STWMDGName();
        et.resetOA_STWMDGId();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetYcdd();
        et.resetSCSJ();
        et.resetYcrs();
        et.resetSy();
        et.resetMemo();
        et.resetFJ();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetSTWMDGBZ();
        et.resetSTWMDGZT();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isStwmsfshtgDirty()) {
            params.put(FIELD_STWMSFSHTG,getStwmsfshtg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isOA_STWMDGNameDirty()) {
            params.put(FIELD_OA_STWMDGNAME,getOA_STWMDGName());
        }
        if(!bDirtyOnly || isOA_STWMDGIdDirty()) {
            params.put(FIELD_OA_STWMDGID,getOA_STWMDGId());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
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
        if(!bDirtyOnly || isSCSJDirty()) {
            params.put(FIELD_SCSJ,getSCSJ());
        }
        if(!bDirtyOnly || isYcrsDirty()) {
            params.put(FIELD_YCRS,getYcrs());
        }
        if(!bDirtyOnly || isSyDirty()) {
            params.put(FIELD_SY,getSy());
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
        if(!bDirtyOnly || isSTWMDGBZDirty()) {
            params.put(FIELD_STWMDGBZ,getSTWMDGBZ());
        }
        if(!bDirtyOnly || isSTWMDGZTDirty()) {
            params.put(FIELD_STWMDGZT,getSTWMDGZT());
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

        return  OA_STWMDG.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_STWMDG et,int index) throws Exception {

        switch(index) {
        case INDEX_STWMSFSHTG:
            return et.getStwmsfshtg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_OA_STWMDGNAME:
            return et.getOA_STWMDGName();
        case INDEX_OA_STWMDGID:
            return et.getOA_STWMDGId();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_YCDD:
            return et.getYcdd();
        case INDEX_SCSJ:
            return et.getSCSJ();
        case INDEX_YCRS:
            return et.getYcrs();
        case INDEX_SY:
            return et.getSy();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_STWMDGBZ:
            return et.getSTWMDGBZ();
        case INDEX_STWMDGZT:
            return et.getSTWMDGZT();
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

        OA_STWMDG.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_STWMDG et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_STWMSFSHTG:
            et.setStwmsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_STWMDGNAME:
            et.setOA_STWMDGName(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_STWMDGID:
            et.setOA_STWMDGId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
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
        case INDEX_SCSJ:
            et.setSCSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_YCRS:
            et.setYcrs(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SY:
            et.setSy(DataObject.getStringValue(obj));
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
        case INDEX_STWMDGBZ:
            et.setSTWMDGBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_STWMDGZT:
            et.setSTWMDGZT(DataObject.getStringValue(obj));
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

        return  OA_STWMDG.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_STWMDG et,int index) throws Exception {

        switch(index) {
        case INDEX_STWMSFSHTG:
            return et.getStwmsfshtg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_OA_STWMDGNAME:
            return et.getOA_STWMDGName()==null;
        case INDEX_OA_STWMDGID:
            return et.getOA_STWMDGId()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_YCDD:
            return et.getYcdd()==null;
        case INDEX_SCSJ:
            return et.getSCSJ()==null;
        case INDEX_YCRS:
            return et.getYcrs()==null;
        case INDEX_SY:
            return et.getSy()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_STWMDGBZ:
            return et.getSTWMDGBZ()==null;
        case INDEX_STWMDGZT:
            return et.getSTWMDGZT()==null;
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

        return  OA_STWMDG.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_STWMDG et,int index) throws Exception {

        switch(index) {
        case INDEX_STWMSFSHTG:
            return et.isStwmsfshtgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_OA_STWMDGNAME:
            return et.isOA_STWMDGNameDirty();
        case INDEX_OA_STWMDGID:
            return et.isOA_STWMDGIdDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_YCDD:
            return et.isYcddDirty();
        case INDEX_SCSJ:
            return et.isSCSJDirty();
        case INDEX_YCRS:
            return et.isYcrsDirty();
        case INDEX_SY:
            return et.isSyDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_STWMDGBZ:
            return et.isSTWMDGBZDirty();
        case INDEX_STWMDGZT:
            return et.isSTWMDGZTDirty();
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
    private static  void fillJSONObject(OA_STWMDG et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getStwmsfshtg()!=null) {
            JSONObjectHelper.put(json,"stwmsfshtg",getJSONValue(et.getStwmsfshtg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getOA_STWMDGName()!=null) {
            JSONObjectHelper.put(json,"oa_stwmdgname",getJSONValue(et.getOA_STWMDGName()),false);
        }
        if(bIncEmpty||et.getOA_STWMDGId()!=null) {
            JSONObjectHelper.put(json,"oa_stwmdgid",getJSONValue(et.getOA_STWMDGId()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
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
        if(bIncEmpty||et.getSCSJ()!=null) {
            JSONObjectHelper.put(json,"scsj",getJSONValue(et.getSCSJ()),false);
        }
        if(bIncEmpty||et.getYcrs()!=null) {
            JSONObjectHelper.put(json,"ycrs",getJSONValue(et.getYcrs()),false);
        }
        if(bIncEmpty||et.getSy()!=null) {
            JSONObjectHelper.put(json,"sy",getJSONValue(et.getSy()),false);
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
        if(bIncEmpty||et.getSTWMDGBZ()!=null) {
            JSONObjectHelper.put(json,"stwmdgbz",getJSONValue(et.getSTWMDGBZ()),false);
        }
        if(bIncEmpty||et.getSTWMDGZT()!=null) {
            JSONObjectHelper.put(json,"stwmdgzt",getJSONValue(et.getSTWMDGZT()),false);
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
    private static void fillXmlNode(OA_STWMDG et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getStwmsfshtg()!=null) {
            Object obj = et.getStwmsfshtg();
            node.setAttribute("STWMSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_STWMDGName()!=null) {
            Object obj = et.getOA_STWMDGName();
            node.setAttribute("OA_STWMDGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_STWMDGId()!=null) {
            Object obj = et.getOA_STWMDGId();
            node.setAttribute("OA_STWMDGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getSCSJ()!=null) {
            Object obj = et.getSCSJ();
            node.setAttribute("SCSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getYcrs()!=null) {
            Object obj = et.getYcrs();
            node.setAttribute("YCRS",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSy()!=null) {
            Object obj = et.getSy();
            node.setAttribute("SY",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getSTWMDGBZ()!=null) {
            Object obj = et.getSTWMDGBZ();
            node.setAttribute("STWMDGBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSTWMDGZT()!=null) {
            Object obj = et.getSTWMDGZT();
            node.setAttribute("STWMDGZT",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_STWMDG.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_STWMDG et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isStwmsfshtgDirty() && (bIncEmpty||et.getStwmsfshtg()!=null)) {
            dst.set(FIELD_STWMSFSHTG,et.getStwmsfshtg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isOA_STWMDGNameDirty() && (bIncEmpty||et.getOA_STWMDGName()!=null)) {
            dst.set(FIELD_OA_STWMDGNAME,et.getOA_STWMDGName());
        }
        if(et.isOA_STWMDGIdDirty() && (bIncEmpty||et.getOA_STWMDGId()!=null)) {
            dst.set(FIELD_OA_STWMDGID,et.getOA_STWMDGId());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
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
        if(et.isSCSJDirty() && (bIncEmpty||et.getSCSJ()!=null)) {
            dst.set(FIELD_SCSJ,et.getSCSJ());
        }
        if(et.isYcrsDirty() && (bIncEmpty||et.getYcrs()!=null)) {
            dst.set(FIELD_YCRS,et.getYcrs());
        }
        if(et.isSyDirty() && (bIncEmpty||et.getSy()!=null)) {
            dst.set(FIELD_SY,et.getSy());
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
        if(et.isSTWMDGBZDirty() && (bIncEmpty||et.getSTWMDGBZ()!=null)) {
            dst.set(FIELD_STWMDGBZ,et.getSTWMDGBZ());
        }
        if(et.isSTWMDGZTDirty() && (bIncEmpty||et.getSTWMDGZT()!=null)) {
            dst.set(FIELD_STWMDGZT,et.getSTWMDGZT());
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
        return  OA_STWMDG.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_STWMDG et,int index) throws Exception {
        switch(index) {
        case INDEX_STWMSFSHTG:
            et.resetStwmsfshtg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_OA_STWMDGNAME:
            et.resetOA_STWMDGName();
            return true;
        case INDEX_OA_STWMDGID:
            et.resetOA_STWMDGId();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
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
        case INDEX_SCSJ:
            et.resetSCSJ();
            return true;
        case INDEX_YCRS:
            et.resetYcrs();
            return true;
        case INDEX_SY:
            et.resetSy();
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
        case INDEX_STWMDGBZ:
            et.resetSTWMDGBZ();
            return true;
        case INDEX_STWMDGZT:
            et.resetSTWMDGZT();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objDCRBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser dcrbs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getDCRBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDCRBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objDCRBSLock) {
            if(dcrbs==null) {
                dcrbs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                dcrbs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(dcrbs);
            }
            return dcrbs;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_STWMDG getProxyEntity() {
        return this.proxyOA_STWMDG;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_STWMDG = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_STWMDG) {
            this.proxyOA_STWMDG = (OA_STWMDG)proxyDataObject;
        }

    }

}