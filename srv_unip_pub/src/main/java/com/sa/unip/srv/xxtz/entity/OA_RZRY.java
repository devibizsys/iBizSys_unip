/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.entity;


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
 * 实体[OA_RZRY] 数据对象
 */
public class OA_RZRY extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_RZRY.class);
    /**
     *   实体属性标识[日志人员名称]
     */
    public final static String FIELD_OA_RZRYNAME = "OA_RZRYNAME";
    /**
     *   实体属性标识[日志人员标识]
     */
    public final static String FIELD_OA_RZRYID = "OA_RZRYID";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[工作日志标识]
     */
    public final static String FIELD_GZRZID = "GZRZID";
    /**
     *   实体属性标识[今日工作成效]
     */
    public final static String FIELD_JRGZCX = "JRGZCX";
    /**
     *   实体属性标识[需协调]
     */
    public final static String FIELD_XXT = "XXT";
    /**
     *   实体属性标识[日志类型]
     */
    public final static String FIELD_RZLX = "RZLX";
    /**
     *   实体属性标识[明日计划]
     */
    public final static String FIELD_MRJH = "MRJH";
    /**
     *   实体属性标识[存在问题]
     */
    public final static String FIELD_CZWT = "CZWT";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[是否已读]
     */
    public final static String FIELD_SFYD = "SFYD";
    /**
     *   实体属性标识[提交人标识]
     */
    public final static String FIELD_TJRID = "TJRID";
    /**
     *   实体属性标识[提交人]
     */
    public final static String FIELD_TJRNAME = "TJRNAME";
    /**
     *   实体属性标识[显示标题]
     */
    public final static String FIELD_XSBT = "XSBT";
    /**
     *   实体属性标识[工作日志名称]
     */
    public final static String FIELD_OA_GZRZNAME = "OA_GZRZNAME";

    private final static int INDEX_OA_RZRYNAME = 0;
    private final static int INDEX_OA_RZRYID = 1;
    private final static int INDEX_UPDATEMAN = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_UPDATEDATE = 4;
    private final static int INDEX_CREATEDATE = 5;
    private final static int INDEX_GZRZID = 6;
    private final static int INDEX_JRGZCX = 7;
    private final static int INDEX_XXT = 8;
    private final static int INDEX_RZLX = 9;
    private final static int INDEX_MRJH = 10;
    private final static int INDEX_CZWT = 11;
    private final static int INDEX_MEMO = 12;
    private final static int INDEX_ORGUSERID = 13;
    private final static int INDEX_SFYD = 14;
    private final static int INDEX_TJRID = 15;
    private final static int INDEX_TJRNAME = 16;
    private final static int INDEX_XSBT = 17;
    private final static int INDEX_OA_GZRZNAME = 18;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_RZRYNAME, INDEX_OA_RZRYNAME);
        fieldIndexMap.put( FIELD_OA_RZRYID, INDEX_OA_RZRYID);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_GZRZID, INDEX_GZRZID);
        fieldIndexMap.put( FIELD_JRGZCX, INDEX_JRGZCX);
        fieldIndexMap.put( FIELD_XXT, INDEX_XXT);
        fieldIndexMap.put( FIELD_RZLX, INDEX_RZLX);
        fieldIndexMap.put( FIELD_MRJH, INDEX_MRJH);
        fieldIndexMap.put( FIELD_CZWT, INDEX_CZWT);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_SFYD, INDEX_SFYD);
        fieldIndexMap.put( FIELD_TJRID, INDEX_TJRID);
        fieldIndexMap.put( FIELD_TJRNAME, INDEX_TJRNAME);
        fieldIndexMap.put( FIELD_XSBT, INDEX_XSBT);
        fieldIndexMap.put( FIELD_OA_GZRZNAME, INDEX_OA_GZRZNAME);
    }

    private OA_RZRY proxyOA_RZRY = null;

    public OA_RZRY() {
        super();
    }
    private boolean oa_rzrynameDirtyFlag = false;
    private boolean oa_rzryidDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean gzrzidDirtyFlag = false;
    private boolean jrgzcxDirtyFlag = false;
    private boolean xxtDirtyFlag = false;
    private boolean rzlxDirtyFlag = false;
    private boolean mrjhDirtyFlag = false;
    private boolean czwtDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean sfydDirtyFlag = false;
    private boolean tjridDirtyFlag = false;
    private boolean tjrnameDirtyFlag = false;
    private boolean xsbtDirtyFlag = false;
    private boolean oa_gzrznameDirtyFlag = false;

    @Column(name="oa_rzryname")
    private String oa_rzryname;
    @Column(name="oa_rzryid")
    private String oa_rzryid;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="gzrzid")
    private String gzrzid;
    @Column(name="jrgzcx")
    private String jrgzcx;
    @Column(name="xxt")
    private String xxt;
    @Column(name="rzlx")
    private String rzlx;
    @Column(name="mrjh")
    private String mrjh;
    @Column(name="czwt")
    private String czwt;
    @Column(name="memo")
    private String memo;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="sfyd")
    private String sfyd;
    @Column(name="tjrid")
    private String tjrid;
    @Column(name="tjrname")
    private String tjrname;
    @Column(name="xsbt")
    private String xsbt;
    @Column(name="oa_gzrzname")
    private String oa_gzrzname;


    /**
     *  设置属性值[日志人员名称]
     *  @param oa_rzryname
     */
    public void setOA_RZRYName(String oa_rzryname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_RZRYName(oa_rzryname);
            return;
        }
        if(oa_rzryname!=null) {
            oa_rzryname = StringHelper.trimRight(oa_rzryname);
            if(oa_rzryname.length()==0) {
                oa_rzryname = null;
            }
        }
        this.oa_rzryname =  oa_rzryname;
        this.oa_rzrynameDirtyFlag  = true;
    }

    /**
     *  获取属性值[日志人员名称]
     */
    public String getOA_RZRYName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_RZRYName();
        }
        return this.oa_rzryname;
    }

    /**
     *  获取属性值[日志人员名称]是否修改
     */
    public boolean isOA_RZRYNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_RZRYNameDirty();
        }
        return this.oa_rzrynameDirtyFlag;
    }

    /**
     *  重置属性值[日志人员名称]
     */
    public void resetOA_RZRYName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_RZRYName();
            return;
        }

        this.oa_rzrynameDirtyFlag = false;
        this.oa_rzryname = null;
    }
    /**
     *  设置属性值[日志人员标识]
     *  @param oa_rzryid
     */
    public void setOA_RZRYId(String oa_rzryid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_RZRYId(oa_rzryid);
            return;
        }
        if(oa_rzryid!=null) {
            oa_rzryid = StringHelper.trimRight(oa_rzryid);
            if(oa_rzryid.length()==0) {
                oa_rzryid = null;
            }
        }
        this.oa_rzryid =  oa_rzryid;
        this.oa_rzryidDirtyFlag  = true;
    }

    /**
     *  获取属性值[日志人员标识]
     */
    public String getOA_RZRYId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_RZRYId();
        }
        return this.oa_rzryid;
    }

    /**
     *  获取属性值[日志人员标识]是否修改
     */
    public boolean isOA_RZRYIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_RZRYIdDirty();
        }
        return this.oa_rzryidDirtyFlag;
    }

    /**
     *  重置属性值[日志人员标识]
     */
    public void resetOA_RZRYId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_RZRYId();
            return;
        }

        this.oa_rzryidDirtyFlag = false;
        this.oa_rzryid = null;
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
     *  设置属性值[工作日志标识]
     *  @param gzrzid
     */
    public void setGzrzid(String gzrzid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGzrzid(gzrzid);
            return;
        }
        if(gzrzid!=null) {
            gzrzid = StringHelper.trimRight(gzrzid);
            if(gzrzid.length()==0) {
                gzrzid = null;
            }
        }
        this.gzrzid =  gzrzid;
        this.gzrzidDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作日志标识]
     */
    public String getGzrzid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGzrzid();
        }
        return this.gzrzid;
    }

    /**
     *  获取属性值[工作日志标识]是否修改
     */
    public boolean isGzrzidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGzrzidDirty();
        }
        return this.gzrzidDirtyFlag;
    }

    /**
     *  重置属性值[工作日志标识]
     */
    public void resetGzrzid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGzrzid();
            return;
        }

        this.gzrzidDirtyFlag = false;
        this.gzrzid = null;
    }
    /**
     *  设置属性值[今日工作成效]
     *  @param jrgzcx
     */
    public void setJrgzcx(String jrgzcx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJrgzcx(jrgzcx);
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
    public String getJrgzcx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJrgzcx();
        }
        return this.jrgzcx;
    }

    /**
     *  获取属性值[今日工作成效]是否修改
     */
    public boolean isJrgzcxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJrgzcxDirty();
        }
        return this.jrgzcxDirtyFlag;
    }

    /**
     *  重置属性值[今日工作成效]
     */
    public void resetJrgzcx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJrgzcx();
            return;
        }

        this.jrgzcxDirtyFlag = false;
        this.jrgzcx = null;
    }
    /**
     *  设置属性值[需协调]
     *  @param xxt
     */
    public void setXxt(String xxt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXxt(xxt);
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
    public String getXxt() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXxt();
        }
        return this.xxt;
    }

    /**
     *  获取属性值[需协调]是否修改
     */
    public boolean isXxtDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXxtDirty();
        }
        return this.xxtDirtyFlag;
    }

    /**
     *  重置属性值[需协调]
     */
    public void resetXxt() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXxt();
            return;
        }

        this.xxtDirtyFlag = false;
        this.xxt = null;
    }
    /**
     *  设置属性值[日志类型]代码表：com.sa.unip.srv.codelist.CL_GZRZLXCodeListModel
     *  @param rzlx
     */
    public void setRzlx(String rzlx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRzlx(rzlx);
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
    public String getRzlx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRzlx();
        }
        return this.rzlx;
    }

    /**
     *  获取属性值[日志类型]是否修改
     */
    public boolean isRzlxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRzlxDirty();
        }
        return this.rzlxDirtyFlag;
    }

    /**
     *  重置属性值[日志类型]
     */
    public void resetRzlx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRzlx();
            return;
        }

        this.rzlxDirtyFlag = false;
        this.rzlx = null;
    }
    /**
     *  设置属性值[明日计划]
     *  @param mrjh
     */
    public void setMrjh(String mrjh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMrjh(mrjh);
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
    public String getMrjh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMrjh();
        }
        return this.mrjh;
    }

    /**
     *  获取属性值[明日计划]是否修改
     */
    public boolean isMrjhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMrjhDirty();
        }
        return this.mrjhDirtyFlag;
    }

    /**
     *  重置属性值[明日计划]
     */
    public void resetMrjh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMrjh();
            return;
        }

        this.mrjhDirtyFlag = false;
        this.mrjh = null;
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
     *  设置属性值[备注]
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
     *  获取属性值[备注]
     */
    public String getMemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMemo();
        }
        return this.memo;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isMemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMemoDirty();
        }
        return this.memoDirtyFlag;
    }

    /**
     *  重置属性值[备注]
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
     *  设置属性值[人员标识]
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
     *  获取属性值[人员标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[人员标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[人员标识]
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
     *  @param tjrid
     */
    public void setTjrid(String tjrid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTjrid(tjrid);
            return;
        }
        if(tjrid!=null) {
            tjrid = StringHelper.trimRight(tjrid);
            if(tjrid.length()==0) {
                tjrid = null;
            }
        }
        this.tjrid =  tjrid;
        this.tjridDirtyFlag  = true;
    }

    /**
     *  获取属性值[提交人标识]
     */
    public String getTjrid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTjrid();
        }
        return this.tjrid;
    }

    /**
     *  获取属性值[提交人标识]是否修改
     */
    public boolean isTjridDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTjridDirty();
        }
        return this.tjridDirtyFlag;
    }

    /**
     *  重置属性值[提交人标识]
     */
    public void resetTjrid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTjrid();
            return;
        }

        this.tjridDirtyFlag = false;
        this.tjrid = null;
    }
    /**
     *  设置属性值[提交人]
     *  @param tjrname
     */
    public void setTjrname(String tjrname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTjrname(tjrname);
            return;
        }
        if(tjrname!=null) {
            tjrname = StringHelper.trimRight(tjrname);
            if(tjrname.length()==0) {
                tjrname = null;
            }
        }
        this.tjrname =  tjrname;
        this.tjrnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[提交人]
     */
    public String getTjrname() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTjrname();
        }
        return this.tjrname;
    }

    /**
     *  获取属性值[提交人]是否修改
     */
    public boolean isTjrnameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTjrnameDirty();
        }
        return this.tjrnameDirtyFlag;
    }

    /**
     *  重置属性值[提交人]
     */
    public void resetTjrname() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTjrname();
            return;
        }

        this.tjrnameDirtyFlag = false;
        this.tjrname = null;
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

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_RZRY.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_RZRY et) {
        et.resetOA_RZRYName();
        et.resetOA_RZRYId();
        et.resetUpdateMan();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetGzrzid();
        et.resetJrgzcx();
        et.resetXxt();
        et.resetRzlx();
        et.resetMrjh();
        et.resetCZWT();
        et.resetMemo();
        et.resetOrgUserId();
        et.resetSFYD();
        et.resetTjrid();
        et.resetTjrname();
        et.resetXsbt();
        et.resetOA_GZRZName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_RZRYNameDirty()) {
            params.put(FIELD_OA_RZRYNAME,getOA_RZRYName());
        }
        if(!bDirtyOnly || isOA_RZRYIdDirty()) {
            params.put(FIELD_OA_RZRYID,getOA_RZRYId());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isGzrzidDirty()) {
            params.put(FIELD_GZRZID,getGzrzid());
        }
        if(!bDirtyOnly || isJrgzcxDirty()) {
            params.put(FIELD_JRGZCX,getJrgzcx());
        }
        if(!bDirtyOnly || isXxtDirty()) {
            params.put(FIELD_XXT,getXxt());
        }
        if(!bDirtyOnly || isRzlxDirty()) {
            params.put(FIELD_RZLX,getRzlx());
        }
        if(!bDirtyOnly || isMrjhDirty()) {
            params.put(FIELD_MRJH,getMrjh());
        }
        if(!bDirtyOnly || isCZWTDirty()) {
            params.put(FIELD_CZWT,getCZWT());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isSFYDDirty()) {
            params.put(FIELD_SFYD,getSFYD());
        }
        if(!bDirtyOnly || isTjridDirty()) {
            params.put(FIELD_TJRID,getTjrid());
        }
        if(!bDirtyOnly || isTjrnameDirty()) {
            params.put(FIELD_TJRNAME,getTjrname());
        }
        if(!bDirtyOnly || isXsbtDirty()) {
            params.put(FIELD_XSBT,getXsbt());
        }
        if(!bDirtyOnly || isOA_GZRZNameDirty()) {
            params.put(FIELD_OA_GZRZNAME,getOA_GZRZName());
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

        return  OA_RZRY.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_RZRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_RZRYNAME:
            return et.getOA_RZRYName();
        case INDEX_OA_RZRYID:
            return et.getOA_RZRYId();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_GZRZID:
            return et.getGzrzid();
        case INDEX_JRGZCX:
            return et.getJrgzcx();
        case INDEX_XXT:
            return et.getXxt();
        case INDEX_RZLX:
            return et.getRzlx();
        case INDEX_MRJH:
            return et.getMrjh();
        case INDEX_CZWT:
            return et.getCZWT();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_SFYD:
            return et.getSFYD();
        case INDEX_TJRID:
            return et.getTjrid();
        case INDEX_TJRNAME:
            return et.getTjrname();
        case INDEX_XSBT:
            return et.getXsbt();
        case INDEX_OA_GZRZNAME:
            return et.getOA_GZRZName();
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

        OA_RZRY.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_RZRY et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_RZRYNAME:
            et.setOA_RZRYName(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_RZRYID:
            et.setOA_RZRYId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_GZRZID:
            et.setGzrzid(DataObject.getStringValue(obj));
            return ;
        case INDEX_JRGZCX:
            et.setJrgzcx(DataObject.getStringValue(obj));
            return ;
        case INDEX_XXT:
            et.setXxt(DataObject.getStringValue(obj));
            return ;
        case INDEX_RZLX:
            et.setRzlx(DataObject.getStringValue(obj));
            return ;
        case INDEX_MRJH:
            et.setMrjh(DataObject.getStringValue(obj));
            return ;
        case INDEX_CZWT:
            et.setCZWT(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_SFYD:
            et.setSFYD(DataObject.getStringValue(obj));
            return ;
        case INDEX_TJRID:
            et.setTjrid(DataObject.getStringValue(obj));
            return ;
        case INDEX_TJRNAME:
            et.setTjrname(DataObject.getStringValue(obj));
            return ;
        case INDEX_XSBT:
            et.setXsbt(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_GZRZNAME:
            et.setOA_GZRZName(DataObject.getStringValue(obj));
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

        return  OA_RZRY.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_RZRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_RZRYNAME:
            return et.getOA_RZRYName()==null;
        case INDEX_OA_RZRYID:
            return et.getOA_RZRYId()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_GZRZID:
            return et.getGzrzid()==null;
        case INDEX_JRGZCX:
            return et.getJrgzcx()==null;
        case INDEX_XXT:
            return et.getXxt()==null;
        case INDEX_RZLX:
            return et.getRzlx()==null;
        case INDEX_MRJH:
            return et.getMrjh()==null;
        case INDEX_CZWT:
            return et.getCZWT()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_SFYD:
            return et.getSFYD()==null;
        case INDEX_TJRID:
            return et.getTjrid()==null;
        case INDEX_TJRNAME:
            return et.getTjrname()==null;
        case INDEX_XSBT:
            return et.getXsbt()==null;
        case INDEX_OA_GZRZNAME:
            return et.getOA_GZRZName()==null;
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

        return  OA_RZRY.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_RZRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_RZRYNAME:
            return et.isOA_RZRYNameDirty();
        case INDEX_OA_RZRYID:
            return et.isOA_RZRYIdDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_GZRZID:
            return et.isGzrzidDirty();
        case INDEX_JRGZCX:
            return et.isJrgzcxDirty();
        case INDEX_XXT:
            return et.isXxtDirty();
        case INDEX_RZLX:
            return et.isRzlxDirty();
        case INDEX_MRJH:
            return et.isMrjhDirty();
        case INDEX_CZWT:
            return et.isCZWTDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_SFYD:
            return et.isSFYDDirty();
        case INDEX_TJRID:
            return et.isTjridDirty();
        case INDEX_TJRNAME:
            return et.isTjrnameDirty();
        case INDEX_XSBT:
            return et.isXsbtDirty();
        case INDEX_OA_GZRZNAME:
            return et.isOA_GZRZNameDirty();
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
    private static  void fillJSONObject(OA_RZRY et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_RZRYName()!=null) {
            JSONObjectHelper.put(json,"oa_rzryname",getJSONValue(et.getOA_RZRYName()),false);
        }
        if(bIncEmpty||et.getOA_RZRYId()!=null) {
            JSONObjectHelper.put(json,"oa_rzryid",getJSONValue(et.getOA_RZRYId()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getGzrzid()!=null) {
            JSONObjectHelper.put(json,"gzrzid",getJSONValue(et.getGzrzid()),false);
        }
        if(bIncEmpty||et.getJrgzcx()!=null) {
            JSONObjectHelper.put(json,"jrgzcx",getJSONValue(et.getJrgzcx()),false);
        }
        if(bIncEmpty||et.getXxt()!=null) {
            JSONObjectHelper.put(json,"xxt",getJSONValue(et.getXxt()),false);
        }
        if(bIncEmpty||et.getRzlx()!=null) {
            JSONObjectHelper.put(json,"rzlx",getJSONValue(et.getRzlx()),false);
        }
        if(bIncEmpty||et.getMrjh()!=null) {
            JSONObjectHelper.put(json,"mrjh",getJSONValue(et.getMrjh()),false);
        }
        if(bIncEmpty||et.getCZWT()!=null) {
            JSONObjectHelper.put(json,"czwt",getJSONValue(et.getCZWT()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getSFYD()!=null) {
            JSONObjectHelper.put(json,"sfyd",getJSONValue(et.getSFYD()),false);
        }
        if(bIncEmpty||et.getTjrid()!=null) {
            JSONObjectHelper.put(json,"tjrid",getJSONValue(et.getTjrid()),false);
        }
        if(bIncEmpty||et.getTjrname()!=null) {
            JSONObjectHelper.put(json,"tjrname",getJSONValue(et.getTjrname()),false);
        }
        if(bIncEmpty||et.getXsbt()!=null) {
            JSONObjectHelper.put(json,"xsbt",getJSONValue(et.getXsbt()),false);
        }
        if(bIncEmpty||et.getOA_GZRZName()!=null) {
            JSONObjectHelper.put(json,"oa_gzrzname",getJSONValue(et.getOA_GZRZName()),false);
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
    private static void fillXmlNode(OA_RZRY et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_RZRYName()!=null) {
            Object obj = et.getOA_RZRYName();
            node.setAttribute("OA_RZRYNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_RZRYId()!=null) {
            Object obj = et.getOA_RZRYId();
            node.setAttribute("OA_RZRYID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getGzrzid()!=null) {
            Object obj = et.getGzrzid();
            node.setAttribute("GZRZID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJrgzcx()!=null) {
            Object obj = et.getJrgzcx();
            node.setAttribute("JRGZCX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXxt()!=null) {
            Object obj = et.getXxt();
            node.setAttribute("XXT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRzlx()!=null) {
            Object obj = et.getRzlx();
            node.setAttribute("RZLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMrjh()!=null) {
            Object obj = et.getMrjh();
            node.setAttribute("MRJH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCZWT()!=null) {
            Object obj = et.getCZWT();
            node.setAttribute("CZWT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSFYD()!=null) {
            Object obj = et.getSFYD();
            node.setAttribute("SFYD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTjrid()!=null) {
            Object obj = et.getTjrid();
            node.setAttribute("TJRID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTjrname()!=null) {
            Object obj = et.getTjrname();
            node.setAttribute("TJRNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXsbt()!=null) {
            Object obj = et.getXsbt();
            node.setAttribute("XSBT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_GZRZName()!=null) {
            Object obj = et.getOA_GZRZName();
            node.setAttribute("OA_GZRZNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_RZRY.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_RZRY et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_RZRYNameDirty() && (bIncEmpty||et.getOA_RZRYName()!=null)) {
            dst.set(FIELD_OA_RZRYNAME,et.getOA_RZRYName());
        }
        if(et.isOA_RZRYIdDirty() && (bIncEmpty||et.getOA_RZRYId()!=null)) {
            dst.set(FIELD_OA_RZRYID,et.getOA_RZRYId());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isGzrzidDirty() && (bIncEmpty||et.getGzrzid()!=null)) {
            dst.set(FIELD_GZRZID,et.getGzrzid());
        }
        if(et.isJrgzcxDirty() && (bIncEmpty||et.getJrgzcx()!=null)) {
            dst.set(FIELD_JRGZCX,et.getJrgzcx());
        }
        if(et.isXxtDirty() && (bIncEmpty||et.getXxt()!=null)) {
            dst.set(FIELD_XXT,et.getXxt());
        }
        if(et.isRzlxDirty() && (bIncEmpty||et.getRzlx()!=null)) {
            dst.set(FIELD_RZLX,et.getRzlx());
        }
        if(et.isMrjhDirty() && (bIncEmpty||et.getMrjh()!=null)) {
            dst.set(FIELD_MRJH,et.getMrjh());
        }
        if(et.isCZWTDirty() && (bIncEmpty||et.getCZWT()!=null)) {
            dst.set(FIELD_CZWT,et.getCZWT());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isSFYDDirty() && (bIncEmpty||et.getSFYD()!=null)) {
            dst.set(FIELD_SFYD,et.getSFYD());
        }
        if(et.isTjridDirty() && (bIncEmpty||et.getTjrid()!=null)) {
            dst.set(FIELD_TJRID,et.getTjrid());
        }
        if(et.isTjrnameDirty() && (bIncEmpty||et.getTjrname()!=null)) {
            dst.set(FIELD_TJRNAME,et.getTjrname());
        }
        if(et.isXsbtDirty() && (bIncEmpty||et.getXsbt()!=null)) {
            dst.set(FIELD_XSBT,et.getXsbt());
        }
        if(et.isOA_GZRZNameDirty() && (bIncEmpty||et.getOA_GZRZName()!=null)) {
            dst.set(FIELD_OA_GZRZNAME,et.getOA_GZRZName());
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
        return  OA_RZRY.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_RZRY et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_RZRYNAME:
            et.resetOA_RZRYName();
            return true;
        case INDEX_OA_RZRYID:
            et.resetOA_RZRYId();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_GZRZID:
            et.resetGzrzid();
            return true;
        case INDEX_JRGZCX:
            et.resetJrgzcx();
            return true;
        case INDEX_XXT:
            et.resetXxt();
            return true;
        case INDEX_RZLX:
            et.resetRzlx();
            return true;
        case INDEX_MRJH:
            et.resetMrjh();
            return true;
        case INDEX_CZWT:
            et.resetCZWT();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_SFYD:
            et.resetSFYD();
            return true;
        case INDEX_TJRID:
            et.resetTjrid();
            return true;
        case INDEX_TJRNAME:
            et.resetTjrname();
            return true;
        case INDEX_XSBT:
            et.resetXsbt();
            return true;
        case INDEX_OA_GZRZNAME:
            et.resetOA_GZRZName();
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

    private Object objGZRZLock = new Object();
    private com.sa.unip.srv.ywsp.entity.OA_GZRZ gzrz = null;
    /**
    * 获取父数据 工作日志
     * @throws Exception
    */
    public com.sa.unip.srv.ywsp.entity.OA_GZRZ getGZRZ() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGZRZ();
        }

        if(this.getGzrzid()==null)
            return null;
        synchronized(objGZRZLock) {
            if(gzrz==null) {
                gzrz = new com.sa.unip.srv.ywsp.entity.OA_GZRZ();
                gzrz.setOA_GZRZId(this.getGzrzid());
                com.sa.unip.srv.ywsp.service.OA_GZRZService service = (com.sa.unip.srv.ywsp.service.OA_GZRZService)ServiceGlobal.getService(com.sa.unip.srv.ywsp.service.OA_GZRZService.class,this.getSessionFactory());
                service.autoGet(gzrz);
            }
            return gzrz;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_RZRY getProxyEntity() {
        return this.proxyOA_RZRY;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_RZRY = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_RZRY) {
            this.proxyOA_RZRY = (OA_RZRY)proxyDataObject;
        }

    }

}