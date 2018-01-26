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
 * 实体[OA_GZRZ] 数据对象
 */
public class OA_GZRZ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_GZRZ.class);
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[工作日志标识]
     */
    public final static String FIELD_OA_GZRZID = "OA_GZRZID";
    /**
     *   实体属性标识[工作日志名称]
     */
    public final static String FIELD_OA_GZRZNAME = "OA_GZRZNAME";
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
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[今日工作成效]
     */
    public final static String FIELD_JRGZCX = "JRGZCX";
    /**
     *   实体属性标识[需协调]
     */
    public final static String FIELD_XXT = "XXT";
    /**
     *   实体属性标识[存在问题]
     */
    public final static String FIELD_CZWT = "CZWT";
    /**
     *   实体属性标识[明日计划]
     */
    public final static String FIELD_MRJH = "MRJH";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
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
     *   实体属性标识[日志提交状态]
     */
    public final static String FIELD_RZTJZT = "RZTJZT";
    /**
     *   实体属性标识[日志提交步骤]
     */
    public final static String FIELD_RZTJBZ = "RZTJBZ";
    /**
     *   实体属性标识[图片]
     */
    public final static String FIELD_PICTURE = "PICTURE";
    /**
     *   实体属性标识[审批人]
     */
    public final static String FIELD_SPR = "SPR";
    /**
     *   实体属性标识[抄送人]
     */
    public final static String FIELD_CSR = "CSR";
    /**
     *   实体属性标识[日志类型]
     */
    public final static String FIELD_RZLX = "RZLX";
    /**
     *   实体属性标识[显示标题]
     */
    public final static String FIELD_XSBT = "XSBT";
    /**
     *   实体属性标识[是否已读]
     */
    public final static String FIELD_SFYD = "SFYD";
    /**
     *   实体属性标识[提交人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[提交人]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[本周工作成效]
     */
    public final static String FIELD_BZGZCX = "BZGZCX";
    /**
     *   实体属性标识[本月工作成效]
     */
    public final static String FIELD_BYGZCX = "BYGZCX";
    /**
     *   实体属性标识[日志是否审核通过]
     */
    public final static String FIELD_RZSFSHTG = "RZSFSHTG";

    private final static int INDEX_BZ = 0;
    private final static int INDEX_OA_GZRZID = 1;
    private final static int INDEX_OA_GZRZNAME = 2;
    private final static int INDEX_UPDATEMAN = 3;
    private final static int INDEX_CREATEDATE = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_CREATEMAN = 6;
    private final static int INDEX_JRGZCX = 7;
    private final static int INDEX_XXT = 8;
    private final static int INDEX_CZWT = 9;
    private final static int INDEX_MRJH = 10;
    private final static int INDEX_FJ = 11;
    private final static int INDEX_MEMO = 12;
    private final static int INDEX_WFINSTANCEID = 13;
    private final static int INDEX_WFSTATE = 14;
    private final static int INDEX_RZTJZT = 15;
    private final static int INDEX_RZTJBZ = 16;
    private final static int INDEX_PICTURE = 17;
    private final static int INDEX_SPR = 18;
    private final static int INDEX_CSR = 19;
    private final static int INDEX_RZLX = 20;
    private final static int INDEX_XSBT = 21;
    private final static int INDEX_SFYD = 22;
    private final static int INDEX_ORGUSERID = 23;
    private final static int INDEX_ORGUSERNAME = 24;
    private final static int INDEX_BZGZCX = 25;
    private final static int INDEX_BYGZCX = 26;
    private final static int INDEX_RZSFSHTG = 27;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_OA_GZRZID, INDEX_OA_GZRZID);
        fieldIndexMap.put( FIELD_OA_GZRZNAME, INDEX_OA_GZRZNAME);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_JRGZCX, INDEX_JRGZCX);
        fieldIndexMap.put( FIELD_XXT, INDEX_XXT);
        fieldIndexMap.put( FIELD_CZWT, INDEX_CZWT);
        fieldIndexMap.put( FIELD_MRJH, INDEX_MRJH);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_RZTJZT, INDEX_RZTJZT);
        fieldIndexMap.put( FIELD_RZTJBZ, INDEX_RZTJBZ);
        fieldIndexMap.put( FIELD_PICTURE, INDEX_PICTURE);
        fieldIndexMap.put( FIELD_SPR, INDEX_SPR);
        fieldIndexMap.put( FIELD_CSR, INDEX_CSR);
        fieldIndexMap.put( FIELD_RZLX, INDEX_RZLX);
        fieldIndexMap.put( FIELD_XSBT, INDEX_XSBT);
        fieldIndexMap.put( FIELD_SFYD, INDEX_SFYD);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_BZGZCX, INDEX_BZGZCX);
        fieldIndexMap.put( FIELD_BYGZCX, INDEX_BYGZCX);
        fieldIndexMap.put( FIELD_RZSFSHTG, INDEX_RZSFSHTG);
    }

    private OA_GZRZ proxyOA_GZRZ = null;

    public OA_GZRZ() {
        super();
    }
    private boolean bzDirtyFlag = false;
    private boolean oa_gzrzidDirtyFlag = false;
    private boolean oa_gzrznameDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean jrgzcxDirtyFlag = false;
    private boolean xxtDirtyFlag = false;
    private boolean czwtDirtyFlag = false;
    private boolean mrjhDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean rztjztDirtyFlag = false;
    private boolean rztjbzDirtyFlag = false;
    private boolean pictureDirtyFlag = false;
    private boolean sprDirtyFlag = false;
    private boolean csrDirtyFlag = false;
    private boolean rzlxDirtyFlag = false;
    private boolean xsbtDirtyFlag = false;
    private boolean sfydDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean bzgzcxDirtyFlag = false;
    private boolean bygzcxDirtyFlag = false;
    private boolean rzsfshtgDirtyFlag = false;

    @Column(name="bz")
    private String bz;
    @Column(name="oa_gzrzid")
    private String oa_gzrzid;
    @Column(name="oa_gzrzname")
    private String oa_gzrzname;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createman")
    private String createman;
    @Column(name="jrgzcx")
    private String jrgzcx;
    @Column(name="xxt")
    private String xxt;
    @Column(name="czwt")
    private String czwt;
    @Column(name="mrjh")
    private String mrjh;
    @Column(name="fj")
    private String fj;
    @Column(name="memo")
    private String memo;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="rztjzt")
    private String rztjzt;
    @Column(name="rztjbz")
    private String rztjbz;
    @Column(name="picture")
    private String picture;
    @Column(name="spr")
    private String spr;
    @Column(name="csr")
    private String csr;
    @Column(name="rzlx")
    private String rzlx;
    @Column(name="xsbt")
    private String xsbt;
    @Column(name="sfyd")
    private String sfyd;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="bzgzcx")
    private String bzgzcx;
    @Column(name="bygzcx")
    private String bygzcx;
    @Column(name="rzsfshtg")
    private String rzsfshtg;


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
     *  设置属性值[工作日志标识]
     *  @param oa_gzrzid
     */
    public void setOA_GZRZId(String oa_gzrzid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_GZRZId(oa_gzrzid);
            return;
        }
        if(oa_gzrzid!=null) {
            oa_gzrzid = StringHelper.trimRight(oa_gzrzid);
            if(oa_gzrzid.length()==0) {
                oa_gzrzid = null;
            }
        }
        this.oa_gzrzid =  oa_gzrzid;
        this.oa_gzrzidDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作日志标识]
     */
    public String getOA_GZRZId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_GZRZId();
        }
        return this.oa_gzrzid;
    }

    /**
     *  获取属性值[工作日志标识]是否修改
     */
    public boolean isOA_GZRZIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_GZRZIdDirty();
        }
        return this.oa_gzrzidDirtyFlag;
    }

    /**
     *  重置属性值[工作日志标识]
     */
    public void resetOA_GZRZId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_GZRZId();
            return;
        }

        this.oa_gzrzidDirtyFlag = false;
        this.oa_gzrzid = null;
    }
    /**
     *  设置属性值[工作日志名称]
     *  @param oa_gzrzname
     */
    public void setOA_GZRZName(String oa_gzrzname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_GZRZName(oa_gzrzname);
            return;
        }
        if(oa_gzrzname!=null) {
            oa_gzrzname = StringHelper.trimRight(oa_gzrzname);
            if(oa_gzrzname.length()==0) {
                oa_gzrzname = null;
            }
        }
        this.oa_gzrzname =  oa_gzrzname;
        this.oa_gzrznameDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作日志名称]
     */
    public String getOA_GZRZName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_GZRZName();
        }
        return this.oa_gzrzname;
    }

    /**
     *  获取属性值[工作日志名称]是否修改
     */
    public boolean isOA_GZRZNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_GZRZNameDirty();
        }
        return this.oa_gzrznameDirtyFlag;
    }

    /**
     *  重置属性值[工作日志名称]
     */
    public void resetOA_GZRZName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_GZRZName();
            return;
        }

        this.oa_gzrznameDirtyFlag = false;
        this.oa_gzrzname = null;
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
     *  设置属性值[今日工作成效]
     *  @param jrgzcx
     */
    public void setJRGZCX(String jrgzcx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJRGZCX(jrgzcx);
            return;
        }
        if(jrgzcx!=null) {
            jrgzcx = StringHelper.trimRight(jrgzcx);
            if(jrgzcx.length()==0) {
                jrgzcx = null;
            }
        }
        this.jrgzcx =  jrgzcx;
        this.jrgzcxDirtyFlag  = true;
    }

    /**
     *  获取属性值[今日工作成效]
     */
    public String getJRGZCX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJRGZCX();
        }
        return this.jrgzcx;
    }

    /**
     *  获取属性值[今日工作成效]是否修改
     */
    public boolean isJRGZCXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJRGZCXDirty();
        }
        return this.jrgzcxDirtyFlag;
    }

    /**
     *  重置属性值[今日工作成效]
     */
    public void resetJRGZCX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJRGZCX();
            return;
        }

        this.jrgzcxDirtyFlag = false;
        this.jrgzcx = null;
    }
    /**
     *  设置属性值[需协调]
     *  @param xxt
     */
    public void setXXT(String xxt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXXT(xxt);
            return;
        }
        if(xxt!=null) {
            xxt = StringHelper.trimRight(xxt);
            if(xxt.length()==0) {
                xxt = null;
            }
        }
        this.xxt =  xxt;
        this.xxtDirtyFlag  = true;
    }

    /**
     *  获取属性值[需协调]
     */
    public String getXXT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXXT();
        }
        return this.xxt;
    }

    /**
     *  获取属性值[需协调]是否修改
     */
    public boolean isXXTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXXTDirty();
        }
        return this.xxtDirtyFlag;
    }

    /**
     *  重置属性值[需协调]
     */
    public void resetXXT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXXT();
            return;
        }

        this.xxtDirtyFlag = false;
        this.xxt = null;
    }
    /**
     *  设置属性值[存在问题]
     *  @param czwt
     */
    public void setCZWT(String czwt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCZWT(czwt);
            return;
        }
        if(czwt!=null) {
            czwt = StringHelper.trimRight(czwt);
            if(czwt.length()==0) {
                czwt = null;
            }
        }
        this.czwt =  czwt;
        this.czwtDirtyFlag  = true;
    }

    /**
     *  获取属性值[存在问题]
     */
    public String getCZWT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCZWT();
        }
        return this.czwt;
    }

    /**
     *  获取属性值[存在问题]是否修改
     */
    public boolean isCZWTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCZWTDirty();
        }
        return this.czwtDirtyFlag;
    }

    /**
     *  重置属性值[存在问题]
     */
    public void resetCZWT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCZWT();
            return;
        }

        this.czwtDirtyFlag = false;
        this.czwt = null;
    }
    /**
     *  设置属性值[明日计划]
     *  @param mrjh
     */
    public void setMRJH(String mrjh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMRJH(mrjh);
            return;
        }
        if(mrjh!=null) {
            mrjh = StringHelper.trimRight(mrjh);
            if(mrjh.length()==0) {
                mrjh = null;
            }
        }
        this.mrjh =  mrjh;
        this.mrjhDirtyFlag  = true;
    }

    /**
     *  获取属性值[明日计划]
     */
    public String getMRJH() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMRJH();
        }
        return this.mrjh;
    }

    /**
     *  获取属性值[明日计划]是否修改
     */
    public boolean isMRJHDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMRJHDirty();
        }
        return this.mrjhDirtyFlag;
    }

    /**
     *  重置属性值[明日计划]
     */
    public void resetMRJH() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMRJH();
            return;
        }

        this.mrjhDirtyFlag = false;
        this.mrjh = null;
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
     *  设置属性值[日志提交状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param rztjzt
     */
    public void setRZTJZT(String rztjzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRZTJZT(rztjzt);
            return;
        }
        if(rztjzt!=null) {
            rztjzt = StringHelper.trimRight(rztjzt);
            if(rztjzt.length()==0) {
                rztjzt = null;
            }
        }
        this.rztjzt =  rztjzt;
        this.rztjztDirtyFlag  = true;
    }

    /**
     *  获取属性值[日志提交状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getRZTJZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRZTJZT();
        }
        return this.rztjzt;
    }

    /**
     *  获取属性值[日志提交状态]是否修改
     */
    public boolean isRZTJZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRZTJZTDirty();
        }
        return this.rztjztDirtyFlag;
    }

    /**
     *  重置属性值[日志提交状态]
     */
    public void resetRZTJZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRZTJZT();
            return;
        }

        this.rztjztDirtyFlag = false;
        this.rztjzt = null;
    }
    /**
     *  设置属性值[日志提交步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param rztjbz
     */
    public void setRZTJBZ(String rztjbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRZTJBZ(rztjbz);
            return;
        }
        if(rztjbz!=null) {
            rztjbz = StringHelper.trimRight(rztjbz);
            if(rztjbz.length()==0) {
                rztjbz = null;
            }
        }
        this.rztjbz =  rztjbz;
        this.rztjbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[日志提交步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getRZTJBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRZTJBZ();
        }
        return this.rztjbz;
    }

    /**
     *  获取属性值[日志提交步骤]是否修改
     */
    public boolean isRZTJBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRZTJBZDirty();
        }
        return this.rztjbzDirtyFlag;
    }

    /**
     *  重置属性值[日志提交步骤]
     */
    public void resetRZTJBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRZTJBZ();
            return;
        }

        this.rztjbzDirtyFlag = false;
        this.rztjbz = null;
    }
    /**
     *  设置属性值[图片]
     *  @param picture
     */
    public void setPicture(String picture) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPicture(picture);
            return;
        }
        if(picture!=null) {
            picture = StringHelper.trimRight(picture);
            if(picture.length()==0) {
                picture = null;
            }
        }
        this.picture =  picture;
        this.pictureDirtyFlag  = true;
    }

    /**
     *  获取属性值[图片]
     */
    public String getPicture() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPicture();
        }
        return this.picture;
    }

    /**
     *  获取属性值[图片]是否修改
     */
    public boolean isPictureDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPictureDirty();
        }
        return this.pictureDirtyFlag;
    }

    /**
     *  重置属性值[图片]
     */
    public void resetPicture() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPicture();
            return;
        }

        this.pictureDirtyFlag = false;
        this.picture = null;
    }
    /**
     *  设置属性值[审批人]
     *  @param spr
     */
    public void setSpr(String spr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSpr(spr);
            return;
        }
        if(spr!=null) {
            spr = StringHelper.trimRight(spr);
            if(spr.length()==0) {
                spr = null;
            }
        }
        this.spr =  spr;
        this.sprDirtyFlag  = true;
    }

    /**
     *  获取属性值[审批人]
     */
    public String getSpr() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSpr();
        }
        return this.spr;
    }

    /**
     *  获取属性值[审批人]是否修改
     */
    public boolean isSprDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSprDirty();
        }
        return this.sprDirtyFlag;
    }

    /**
     *  重置属性值[审批人]
     */
    public void resetSpr() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSpr();
            return;
        }

        this.sprDirtyFlag = false;
        this.spr = null;
    }
    /**
     *  设置属性值[抄送人]
     *  @param csr
     */
    public void setCsr(String csr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCsr(csr);
            return;
        }
        if(csr!=null) {
            csr = StringHelper.trimRight(csr);
            if(csr.length()==0) {
                csr = null;
            }
        }
        this.csr =  csr;
        this.csrDirtyFlag  = true;
    }

    /**
     *  获取属性值[抄送人]
     */
    public String getCsr() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCsr();
        }
        return this.csr;
    }

    /**
     *  获取属性值[抄送人]是否修改
     */
    public boolean isCsrDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCsrDirty();
        }
        return this.csrDirtyFlag;
    }

    /**
     *  重置属性值[抄送人]
     */
    public void resetCsr() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCsr();
            return;
        }

        this.csrDirtyFlag = false;
        this.csr = null;
    }
    /**
     *  设置属性值[日志类型]代码表：com.sa.unip.srv.codelist.CL_GZRZLXCodeListModel
     *  @param rzlx
     */
    public void setRZLX(String rzlx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRZLX(rzlx);
            return;
        }
        if(rzlx!=null) {
            rzlx = StringHelper.trimRight(rzlx);
            if(rzlx.length()==0) {
                rzlx = null;
            }
        }
        this.rzlx =  rzlx;
        this.rzlxDirtyFlag  = true;
    }

    /**
     *  获取属性值[日志类型]代码表：com.sa.unip.srv.codelist.CL_GZRZLXCodeListModel
     */
    public String getRZLX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRZLX();
        }
        return this.rzlx;
    }

    /**
     *  获取属性值[日志类型]是否修改
     */
    public boolean isRZLXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRZLXDirty();
        }
        return this.rzlxDirtyFlag;
    }

    /**
     *  重置属性值[日志类型]
     */
    public void resetRZLX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRZLX();
            return;
        }

        this.rzlxDirtyFlag = false;
        this.rzlx = null;
    }
    /**
     *  设置属性值[显示标题]
     *  @param xsbt
     */
    public void setXsbt(String xsbt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXsbt(xsbt);
            return;
        }
        if(xsbt!=null) {
            xsbt = StringHelper.trimRight(xsbt);
            if(xsbt.length()==0) {
                xsbt = null;
            }
        }
        this.xsbt =  xsbt;
        this.xsbtDirtyFlag  = true;
    }

    /**
     *  获取属性值[显示标题]
     */
    public String getXsbt() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXsbt();
        }
        return this.xsbt;
    }

    /**
     *  获取属性值[显示标题]是否修改
     */
    public boolean isXsbtDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXsbtDirty();
        }
        return this.xsbtDirtyFlag;
    }

    /**
     *  重置属性值[显示标题]
     */
    public void resetXsbt() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXsbt();
            return;
        }

        this.xsbtDirtyFlag = false;
        this.xsbt = null;
    }
    /**
     *  设置属性值[是否已读]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     *  @param sfyd
     */
    public void setSFYD(String sfyd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSFYD(sfyd);
            return;
        }
        if(sfyd!=null) {
            sfyd = StringHelper.trimRight(sfyd);
            if(sfyd.length()==0) {
                sfyd = null;
            }
        }
        this.sfyd =  sfyd;
        this.sfydDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否已读]代码表：com.sa.unip.srv.codelist.CL_SFYDCodeListModel
     */
    public String getSFYD() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSFYD();
        }
        return this.sfyd;
    }

    /**
     *  获取属性值[是否已读]是否修改
     */
    public boolean isSFYDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSFYDDirty();
        }
        return this.sfydDirtyFlag;
    }

    /**
     *  重置属性值[是否已读]
     */
    public void resetSFYD() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSFYD();
            return;
        }

        this.sfydDirtyFlag = false;
        this.sfyd = null;
    }
    /**
     *  设置属性值[提交人标识]
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
     *  获取属性值[提交人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[提交人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[提交人标识]
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
     *  设置属性值[提交人]
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
     *  获取属性值[提交人]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[提交人]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[提交人]
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
     *  设置属性值[本周工作成效]
     *  @param bzgzcx
     */
    public void setBZGZCX(String bzgzcx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBZGZCX(bzgzcx);
            return;
        }
        if(bzgzcx!=null) {
            bzgzcx = StringHelper.trimRight(bzgzcx);
            if(bzgzcx.length()==0) {
                bzgzcx = null;
            }
        }
        this.bzgzcx =  bzgzcx;
        this.bzgzcxDirtyFlag  = true;
    }

    /**
     *  获取属性值[本周工作成效]
     */
    public String getBZGZCX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBZGZCX();
        }
        return this.bzgzcx;
    }

    /**
     *  获取属性值[本周工作成效]是否修改
     */
    public boolean isBZGZCXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBZGZCXDirty();
        }
        return this.bzgzcxDirtyFlag;
    }

    /**
     *  重置属性值[本周工作成效]
     */
    public void resetBZGZCX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBZGZCX();
            return;
        }

        this.bzgzcxDirtyFlag = false;
        this.bzgzcx = null;
    }
    /**
     *  设置属性值[本月工作成效]
     *  @param bygzcx
     */
    public void setBYGZCX(String bygzcx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBYGZCX(bygzcx);
            return;
        }
        if(bygzcx!=null) {
            bygzcx = StringHelper.trimRight(bygzcx);
            if(bygzcx.length()==0) {
                bygzcx = null;
            }
        }
        this.bygzcx =  bygzcx;
        this.bygzcxDirtyFlag  = true;
    }

    /**
     *  获取属性值[本月工作成效]
     */
    public String getBYGZCX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBYGZCX();
        }
        return this.bygzcx;
    }

    /**
     *  获取属性值[本月工作成效]是否修改
     */
    public boolean isBYGZCXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBYGZCXDirty();
        }
        return this.bygzcxDirtyFlag;
    }

    /**
     *  重置属性值[本月工作成效]
     */
    public void resetBYGZCX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBYGZCX();
            return;
        }

        this.bygzcxDirtyFlag = false;
        this.bygzcx = null;
    }
    /**
     *  设置属性值[日志是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param rzsfshtg
     */
    public void setRzsfshtg(String rzsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRzsfshtg(rzsfshtg);
            return;
        }
        if(rzsfshtg!=null) {
            rzsfshtg = StringHelper.trimRight(rzsfshtg);
            if(rzsfshtg.length()==0) {
                rzsfshtg = null;
            }
        }
        this.rzsfshtg =  rzsfshtg;
        this.rzsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[日志是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getRzsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRzsfshtg();
        }
        return this.rzsfshtg;
    }

    /**
     *  获取属性值[日志是否审核通过]是否修改
     */
    public boolean isRzsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRzsfshtgDirty();
        }
        return this.rzsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[日志是否审核通过]
     */
    public void resetRzsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRzsfshtg();
            return;
        }

        this.rzsfshtgDirtyFlag = false;
        this.rzsfshtg = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_GZRZ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_GZRZ et) {
        et.resetBz();
        et.resetOA_GZRZId();
        et.resetOA_GZRZName();
        et.resetUpdateMan();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetCreateMan();
        et.resetJRGZCX();
        et.resetXXT();
        et.resetCZWT();
        et.resetMRJH();
        et.resetFJ();
        et.resetMemo();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetRZTJZT();
        et.resetRZTJBZ();
        et.resetPicture();
        et.resetSpr();
        et.resetCsr();
        et.resetRZLX();
        et.resetXsbt();
        et.resetSFYD();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetBZGZCX();
        et.resetBYGZCX();
        et.resetRzsfshtg();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isOA_GZRZIdDirty()) {
            params.put(FIELD_OA_GZRZID,getOA_GZRZId());
        }
        if(!bDirtyOnly || isOA_GZRZNameDirty()) {
            params.put(FIELD_OA_GZRZNAME,getOA_GZRZName());
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
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isJRGZCXDirty()) {
            params.put(FIELD_JRGZCX,getJRGZCX());
        }
        if(!bDirtyOnly || isXXTDirty()) {
            params.put(FIELD_XXT,getXXT());
        }
        if(!bDirtyOnly || isCZWTDirty()) {
            params.put(FIELD_CZWT,getCZWT());
        }
        if(!bDirtyOnly || isMRJHDirty()) {
            params.put(FIELD_MRJH,getMRJH());
        }
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
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
        if(!bDirtyOnly || isRZTJZTDirty()) {
            params.put(FIELD_RZTJZT,getRZTJZT());
        }
        if(!bDirtyOnly || isRZTJBZDirty()) {
            params.put(FIELD_RZTJBZ,getRZTJBZ());
        }
        if(!bDirtyOnly || isPictureDirty()) {
            params.put(FIELD_PICTURE,getPicture());
        }
        if(!bDirtyOnly || isSprDirty()) {
            params.put(FIELD_SPR,getSpr());
        }
        if(!bDirtyOnly || isCsrDirty()) {
            params.put(FIELD_CSR,getCsr());
        }
        if(!bDirtyOnly || isRZLXDirty()) {
            params.put(FIELD_RZLX,getRZLX());
        }
        if(!bDirtyOnly || isXsbtDirty()) {
            params.put(FIELD_XSBT,getXsbt());
        }
        if(!bDirtyOnly || isSFYDDirty()) {
            params.put(FIELD_SFYD,getSFYD());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isBZGZCXDirty()) {
            params.put(FIELD_BZGZCX,getBZGZCX());
        }
        if(!bDirtyOnly || isBYGZCXDirty()) {
            params.put(FIELD_BYGZCX,getBYGZCX());
        }
        if(!bDirtyOnly || isRzsfshtgDirty()) {
            params.put(FIELD_RZSFSHTG,getRzsfshtg());
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

        return  OA_GZRZ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_GZRZ et,int index) throws Exception {

        switch(index) {
        case INDEX_BZ:
            return et.getBz();
        case INDEX_OA_GZRZID:
            return et.getOA_GZRZId();
        case INDEX_OA_GZRZNAME:
            return et.getOA_GZRZName();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_JRGZCX:
            return et.getJRGZCX();
        case INDEX_XXT:
            return et.getXXT();
        case INDEX_CZWT:
            return et.getCZWT();
        case INDEX_MRJH:
            return et.getMRJH();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_RZTJZT:
            return et.getRZTJZT();
        case INDEX_RZTJBZ:
            return et.getRZTJBZ();
        case INDEX_PICTURE:
            return et.getPicture();
        case INDEX_SPR:
            return et.getSpr();
        case INDEX_CSR:
            return et.getCsr();
        case INDEX_RZLX:
            return et.getRZLX();
        case INDEX_XSBT:
            return et.getXsbt();
        case INDEX_SFYD:
            return et.getSFYD();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_BZGZCX:
            return et.getBZGZCX();
        case INDEX_BYGZCX:
            return et.getBYGZCX();
        case INDEX_RZSFSHTG:
            return et.getRzsfshtg();
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

        OA_GZRZ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_GZRZ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_GZRZID:
            et.setOA_GZRZId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_GZRZNAME:
            et.setOA_GZRZName(DataObject.getStringValue(obj));
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
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_JRGZCX:
            et.setJRGZCX(DataObject.getStringValue(obj));
            return ;
        case INDEX_XXT:
            et.setXXT(DataObject.getStringValue(obj));
            return ;
        case INDEX_CZWT:
            et.setCZWT(DataObject.getStringValue(obj));
            return ;
        case INDEX_MRJH:
            et.setMRJH(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
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
        case INDEX_RZTJZT:
            et.setRZTJZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_RZTJBZ:
            et.setRZTJBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_PICTURE:
            et.setPicture(DataObject.getStringValue(obj));
            return ;
        case INDEX_SPR:
            et.setSpr(DataObject.getStringValue(obj));
            return ;
        case INDEX_CSR:
            et.setCsr(DataObject.getStringValue(obj));
            return ;
        case INDEX_RZLX:
            et.setRZLX(DataObject.getStringValue(obj));
            return ;
        case INDEX_XSBT:
            et.setXsbt(DataObject.getStringValue(obj));
            return ;
        case INDEX_SFYD:
            et.setSFYD(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZGZCX:
            et.setBZGZCX(DataObject.getStringValue(obj));
            return ;
        case INDEX_BYGZCX:
            et.setBYGZCX(DataObject.getStringValue(obj));
            return ;
        case INDEX_RZSFSHTG:
            et.setRzsfshtg(DataObject.getStringValue(obj));
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

        return  OA_GZRZ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_GZRZ et,int index) throws Exception {

        switch(index) {
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_OA_GZRZID:
            return et.getOA_GZRZId()==null;
        case INDEX_OA_GZRZNAME:
            return et.getOA_GZRZName()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_JRGZCX:
            return et.getJRGZCX()==null;
        case INDEX_XXT:
            return et.getXXT()==null;
        case INDEX_CZWT:
            return et.getCZWT()==null;
        case INDEX_MRJH:
            return et.getMRJH()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_RZTJZT:
            return et.getRZTJZT()==null;
        case INDEX_RZTJBZ:
            return et.getRZTJBZ()==null;
        case INDEX_PICTURE:
            return et.getPicture()==null;
        case INDEX_SPR:
            return et.getSpr()==null;
        case INDEX_CSR:
            return et.getCsr()==null;
        case INDEX_RZLX:
            return et.getRZLX()==null;
        case INDEX_XSBT:
            return et.getXsbt()==null;
        case INDEX_SFYD:
            return et.getSFYD()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_BZGZCX:
            return et.getBZGZCX()==null;
        case INDEX_BYGZCX:
            return et.getBYGZCX()==null;
        case INDEX_RZSFSHTG:
            return et.getRzsfshtg()==null;
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

        return  OA_GZRZ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_GZRZ et,int index) throws Exception {

        switch(index) {
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_OA_GZRZID:
            return et.isOA_GZRZIdDirty();
        case INDEX_OA_GZRZNAME:
            return et.isOA_GZRZNameDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_JRGZCX:
            return et.isJRGZCXDirty();
        case INDEX_XXT:
            return et.isXXTDirty();
        case INDEX_CZWT:
            return et.isCZWTDirty();
        case INDEX_MRJH:
            return et.isMRJHDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_RZTJZT:
            return et.isRZTJZTDirty();
        case INDEX_RZTJBZ:
            return et.isRZTJBZDirty();
        case INDEX_PICTURE:
            return et.isPictureDirty();
        case INDEX_SPR:
            return et.isSprDirty();
        case INDEX_CSR:
            return et.isCsrDirty();
        case INDEX_RZLX:
            return et.isRZLXDirty();
        case INDEX_XSBT:
            return et.isXsbtDirty();
        case INDEX_SFYD:
            return et.isSFYDDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_BZGZCX:
            return et.isBZGZCXDirty();
        case INDEX_BYGZCX:
            return et.isBYGZCXDirty();
        case INDEX_RZSFSHTG:
            return et.isRzsfshtgDirty();
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
    private static  void fillJSONObject(OA_GZRZ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getOA_GZRZId()!=null) {
            JSONObjectHelper.put(json,"oa_gzrzid",getJSONValue(et.getOA_GZRZId()),false);
        }
        if(bIncEmpty||et.getOA_GZRZName()!=null) {
            JSONObjectHelper.put(json,"oa_gzrzname",getJSONValue(et.getOA_GZRZName()),false);
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
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getJRGZCX()!=null) {
            JSONObjectHelper.put(json,"jrgzcx",getJSONValue(et.getJRGZCX()),false);
        }
        if(bIncEmpty||et.getXXT()!=null) {
            JSONObjectHelper.put(json,"xxt",getJSONValue(et.getXXT()),false);
        }
        if(bIncEmpty||et.getCZWT()!=null) {
            JSONObjectHelper.put(json,"czwt",getJSONValue(et.getCZWT()),false);
        }
        if(bIncEmpty||et.getMRJH()!=null) {
            JSONObjectHelper.put(json,"mrjh",getJSONValue(et.getMRJH()),false);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
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
        if(bIncEmpty||et.getRZTJZT()!=null) {
            JSONObjectHelper.put(json,"rztjzt",getJSONValue(et.getRZTJZT()),false);
        }
        if(bIncEmpty||et.getRZTJBZ()!=null) {
            JSONObjectHelper.put(json,"rztjbz",getJSONValue(et.getRZTJBZ()),false);
        }
        if(bIncEmpty||et.getPicture()!=null) {
            JSONObjectHelper.put(json,"picture",getJSONValue(et.getPicture()),false);
        }
        if(bIncEmpty||et.getSpr()!=null) {
            JSONObjectHelper.put(json,"spr",getJSONValue(et.getSpr()),false);
        }
        if(bIncEmpty||et.getCsr()!=null) {
            JSONObjectHelper.put(json,"csr",getJSONValue(et.getCsr()),false);
        }
        if(bIncEmpty||et.getRZLX()!=null) {
            JSONObjectHelper.put(json,"rzlx",getJSONValue(et.getRZLX()),false);
        }
        if(bIncEmpty||et.getXsbt()!=null) {
            JSONObjectHelper.put(json,"xsbt",getJSONValue(et.getXsbt()),false);
        }
        if(bIncEmpty||et.getSFYD()!=null) {
            JSONObjectHelper.put(json,"sfyd",getJSONValue(et.getSFYD()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getBZGZCX()!=null) {
            JSONObjectHelper.put(json,"bzgzcx",getJSONValue(et.getBZGZCX()),false);
        }
        if(bIncEmpty||et.getBYGZCX()!=null) {
            JSONObjectHelper.put(json,"bygzcx",getJSONValue(et.getBYGZCX()),false);
        }
        if(bIncEmpty||et.getRzsfshtg()!=null) {
            JSONObjectHelper.put(json,"rzsfshtg",getJSONValue(et.getRzsfshtg()),false);
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
    private static void fillXmlNode(OA_GZRZ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_GZRZId()!=null) {
            Object obj = et.getOA_GZRZId();
            node.setAttribute("OA_GZRZID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_GZRZName()!=null) {
            Object obj = et.getOA_GZRZName();
            node.setAttribute("OA_GZRZNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJRGZCX()!=null) {
            Object obj = et.getJRGZCX();
            node.setAttribute("JRGZCX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXXT()!=null) {
            Object obj = et.getXXT();
            node.setAttribute("XXT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCZWT()!=null) {
            Object obj = et.getCZWT();
            node.setAttribute("CZWT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMRJH()!=null) {
            Object obj = et.getMRJH();
            node.setAttribute("MRJH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getRZTJZT()!=null) {
            Object obj = et.getRZTJZT();
            node.setAttribute("RZTJZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRZTJBZ()!=null) {
            Object obj = et.getRZTJBZ();
            node.setAttribute("RZTJBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPicture()!=null) {
            Object obj = et.getPicture();
            node.setAttribute("PICTURE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSpr()!=null) {
            Object obj = et.getSpr();
            node.setAttribute("SPR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCsr()!=null) {
            Object obj = et.getCsr();
            node.setAttribute("CSR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRZLX()!=null) {
            Object obj = et.getRZLX();
            node.setAttribute("RZLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXsbt()!=null) {
            Object obj = et.getXsbt();
            node.setAttribute("XSBT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSFYD()!=null) {
            Object obj = et.getSFYD();
            node.setAttribute("SFYD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBZGZCX()!=null) {
            Object obj = et.getBZGZCX();
            node.setAttribute("BZGZCX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBYGZCX()!=null) {
            Object obj = et.getBYGZCX();
            node.setAttribute("BYGZCX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRzsfshtg()!=null) {
            Object obj = et.getRzsfshtg();
            node.setAttribute("RZSFSHTG",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_GZRZ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_GZRZ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isOA_GZRZIdDirty() && (bIncEmpty||et.getOA_GZRZId()!=null)) {
            dst.set(FIELD_OA_GZRZID,et.getOA_GZRZId());
        }
        if(et.isOA_GZRZNameDirty() && (bIncEmpty||et.getOA_GZRZName()!=null)) {
            dst.set(FIELD_OA_GZRZNAME,et.getOA_GZRZName());
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
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isJRGZCXDirty() && (bIncEmpty||et.getJRGZCX()!=null)) {
            dst.set(FIELD_JRGZCX,et.getJRGZCX());
        }
        if(et.isXXTDirty() && (bIncEmpty||et.getXXT()!=null)) {
            dst.set(FIELD_XXT,et.getXXT());
        }
        if(et.isCZWTDirty() && (bIncEmpty||et.getCZWT()!=null)) {
            dst.set(FIELD_CZWT,et.getCZWT());
        }
        if(et.isMRJHDirty() && (bIncEmpty||et.getMRJH()!=null)) {
            dst.set(FIELD_MRJH,et.getMRJH());
        }
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
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
        if(et.isRZTJZTDirty() && (bIncEmpty||et.getRZTJZT()!=null)) {
            dst.set(FIELD_RZTJZT,et.getRZTJZT());
        }
        if(et.isRZTJBZDirty() && (bIncEmpty||et.getRZTJBZ()!=null)) {
            dst.set(FIELD_RZTJBZ,et.getRZTJBZ());
        }
        if(et.isPictureDirty() && (bIncEmpty||et.getPicture()!=null)) {
            dst.set(FIELD_PICTURE,et.getPicture());
        }
        if(et.isSprDirty() && (bIncEmpty||et.getSpr()!=null)) {
            dst.set(FIELD_SPR,et.getSpr());
        }
        if(et.isCsrDirty() && (bIncEmpty||et.getCsr()!=null)) {
            dst.set(FIELD_CSR,et.getCsr());
        }
        if(et.isRZLXDirty() && (bIncEmpty||et.getRZLX()!=null)) {
            dst.set(FIELD_RZLX,et.getRZLX());
        }
        if(et.isXsbtDirty() && (bIncEmpty||et.getXsbt()!=null)) {
            dst.set(FIELD_XSBT,et.getXsbt());
        }
        if(et.isSFYDDirty() && (bIncEmpty||et.getSFYD()!=null)) {
            dst.set(FIELD_SFYD,et.getSFYD());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isBZGZCXDirty() && (bIncEmpty||et.getBZGZCX()!=null)) {
            dst.set(FIELD_BZGZCX,et.getBZGZCX());
        }
        if(et.isBYGZCXDirty() && (bIncEmpty||et.getBYGZCX()!=null)) {
            dst.set(FIELD_BYGZCX,et.getBYGZCX());
        }
        if(et.isRzsfshtgDirty() && (bIncEmpty||et.getRzsfshtg()!=null)) {
            dst.set(FIELD_RZSFSHTG,et.getRzsfshtg());
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
        return  OA_GZRZ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_GZRZ et,int index) throws Exception {
        switch(index) {
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_OA_GZRZID:
            et.resetOA_GZRZId();
            return true;
        case INDEX_OA_GZRZNAME:
            et.resetOA_GZRZName();
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
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_JRGZCX:
            et.resetJRGZCX();
            return true;
        case INDEX_XXT:
            et.resetXXT();
            return true;
        case INDEX_CZWT:
            et.resetCZWT();
            return true;
        case INDEX_MRJH:
            et.resetMRJH();
            return true;
        case INDEX_FJ:
            et.resetFJ();
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
        case INDEX_RZTJZT:
            et.resetRZTJZT();
            return true;
        case INDEX_RZTJBZ:
            et.resetRZTJBZ();
            return true;
        case INDEX_PICTURE:
            et.resetPicture();
            return true;
        case INDEX_SPR:
            et.resetSpr();
            return true;
        case INDEX_CSR:
            et.resetCsr();
            return true;
        case INDEX_RZLX:
            et.resetRZLX();
            return true;
        case INDEX_XSBT:
            et.resetXsbt();
            return true;
        case INDEX_SFYD:
            et.resetSFYD();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_BZGZCX:
            et.resetBZGZCX();
            return true;
        case INDEX_BYGZCX:
            et.resetBYGZCX();
            return true;
        case INDEX_RZSFSHTG:
            et.resetRzsfshtg();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objTJRLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser tjr = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getTJR() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTJR();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objTJRLock) {
            if(tjr==null) {
                tjr = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                tjr.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(tjr);
            }
            return tjr;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_GZRZ getProxyEntity() {
        return this.proxyOA_GZRZ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_GZRZ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_GZRZ) {
            this.proxyOA_GZRZ = (OA_GZRZ)proxyDataObject;
        }

    }

}