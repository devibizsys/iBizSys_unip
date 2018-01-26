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
 * 实体[OA_JPYD] 数据对象
 */
public class OA_JPYD extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_JPYD.class);
    /**
     *   实体属性标识[机票预定是否审核通过]
     */
    public final static String FIELD_JPYDSFSHTG = "JPYDSFSHTG";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[机票预订标识]
     */
    public final static String FIELD_OA_JPYDID = "OA_JPYDID";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[机票预订名称]
     */
    public final static String FIELD_OA_JPYDNAME = "OA_JPYDNAME";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[职务]
     */
    public final static String FIELD_ZW = "ZW";
    /**
     *   实体属性标识[身份证号码]
     */
    public final static String FIELD_SFZHM = "SFZHM";
    /**
     *   实体属性标识[目的地]
     */
    public final static String FIELD_MDD = "MDD";
    /**
     *   实体属性标识[出发时间]
     */
    public final static String FIELD_CFSJ = "CFSJ";
    /**
     *   实体属性标识[返程时间]
     */
    public final static String FIELD_FCSJ = "FCSJ";
    /**
     *   实体属性标识[金额]
     */
    public final static String FIELD_JE = "JE";
    /**
     *   实体属性标识[申请事由]
     */
    public final static String FIELD_SQSY = "SQSY";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[机票预订状态]
     */
    public final static String FIELD_JPYDZT = "JPYDZT";
    /**
     *   实体属性标识[机票预订步骤]
     */
    public final static String FIELD_JPYDBZ = "JPYDBZ";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[人员姓名]
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
     *   实体属性标识[经办人]
     */
    public final static String FIELD_JBRID = "JBRID";
    /**
     *   实体属性标识[经办人名称]
     */
    public final static String FIELD_JBRNAME = "JBRNAME";

    private final static int INDEX_JPYDSFSHTG = 0;
    private final static int INDEX_MEMO = 1;
    private final static int INDEX_OA_JPYDID = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_OA_JPYDNAME = 4;
    private final static int INDEX_CREATEDATE = 5;
    private final static int INDEX_UPDATEMAN = 6;
    private final static int INDEX_UPDATEDATE = 7;
    private final static int INDEX_ZW = 8;
    private final static int INDEX_SFZHM = 9;
    private final static int INDEX_MDD = 10;
    private final static int INDEX_CFSJ = 11;
    private final static int INDEX_FCSJ = 12;
    private final static int INDEX_JE = 13;
    private final static int INDEX_SQSY = 14;
    private final static int INDEX_FJ = 15;
    private final static int INDEX_WFSTATE = 16;
    private final static int INDEX_JPYDZT = 17;
    private final static int INDEX_JPYDBZ = 18;
    private final static int INDEX_WFINSTANCEID = 19;
    private final static int INDEX_ORGUSERID = 20;
    private final static int INDEX_ORGUSERNAME = 21;
    private final static int INDEX_ORGSECTORID = 22;
    private final static int INDEX_ORGSECTORNAME = 23;
    private final static int INDEX_JBRID = 24;
    private final static int INDEX_JBRNAME = 25;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_JPYDSFSHTG, INDEX_JPYDSFSHTG);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_OA_JPYDID, INDEX_OA_JPYDID);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_JPYDNAME, INDEX_OA_JPYDNAME);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_ZW, INDEX_ZW);
        fieldIndexMap.put( FIELD_SFZHM, INDEX_SFZHM);
        fieldIndexMap.put( FIELD_MDD, INDEX_MDD);
        fieldIndexMap.put( FIELD_CFSJ, INDEX_CFSJ);
        fieldIndexMap.put( FIELD_FCSJ, INDEX_FCSJ);
        fieldIndexMap.put( FIELD_JE, INDEX_JE);
        fieldIndexMap.put( FIELD_SQSY, INDEX_SQSY);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_JPYDZT, INDEX_JPYDZT);
        fieldIndexMap.put( FIELD_JPYDBZ, INDEX_JPYDBZ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_JBRID, INDEX_JBRID);
        fieldIndexMap.put( FIELD_JBRNAME, INDEX_JBRNAME);
    }

    private OA_JPYD proxyOA_JPYD = null;

    public OA_JPYD() {
        super();
    }
    private boolean jpydsfshtgDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean oa_jpydidDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_jpydnameDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean zwDirtyFlag = false;
    private boolean sfzhmDirtyFlag = false;
    private boolean mddDirtyFlag = false;
    private boolean cfsjDirtyFlag = false;
    private boolean fcsjDirtyFlag = false;
    private boolean jeDirtyFlag = false;
    private boolean sqsyDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean jpydztDirtyFlag = false;
    private boolean jpydbzDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean jbridDirtyFlag = false;
    private boolean jbrnameDirtyFlag = false;

    @Column(name="jpydsfshtg")
    private String jpydsfshtg;
    @Column(name="memo")
    private String memo;
    @Column(name="oa_jpydid")
    private String oa_jpydid;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_jpydname")
    private String oa_jpydname;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="zw")
    private String zw;
    @Column(name="sfzhm")
    private String sfzhm;
    @Column(name="mdd")
    private String mdd;
    @Column(name="cfsj")
    private Timestamp cfsj;
    @Column(name="fcsj")
    private Timestamp fcsj;
    @Column(name="je")
    private Double je;
    @Column(name="sqsy")
    private String sqsy;
    @Column(name="fj")
    private String fj;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="jpydzt")
    private String jpydzt;
    @Column(name="jpydbz")
    private String jpydbz;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="jbrid")
    private String jbrid;
    @Column(name="jbrname")
    private String jbrname;


    /**
     *  设置属性值[机票预定是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param jpydsfshtg
     */
    public void setJpydsfshtg(String jpydsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJpydsfshtg(jpydsfshtg);
            return;
        }
        if(jpydsfshtg!=null) {
            jpydsfshtg = StringHelper.trimRight(jpydsfshtg);
            if(jpydsfshtg.length()==0) {
                jpydsfshtg = null;
            }
        }
        this.jpydsfshtg =  jpydsfshtg;
        this.jpydsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[机票预定是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getJpydsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJpydsfshtg();
        }
        return this.jpydsfshtg;
    }

    /**
     *  获取属性值[机票预定是否审核通过]是否修改
     */
    public boolean isJpydsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJpydsfshtgDirty();
        }
        return this.jpydsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[机票预定是否审核通过]
     */
    public void resetJpydsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJpydsfshtg();
            return;
        }

        this.jpydsfshtgDirtyFlag = false;
        this.jpydsfshtg = null;
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
     *  设置属性值[机票预订标识]
     *  @param oa_jpydid
     */
    public void setOA_JPYDId(String oa_jpydid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_JPYDId(oa_jpydid);
            return;
        }
        if(oa_jpydid!=null) {
            oa_jpydid = StringHelper.trimRight(oa_jpydid);
            if(oa_jpydid.length()==0) {
                oa_jpydid = null;
            }
        }
        this.oa_jpydid =  oa_jpydid;
        this.oa_jpydidDirtyFlag  = true;
    }

    /**
     *  获取属性值[机票预订标识]
     */
    public String getOA_JPYDId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_JPYDId();
        }
        return this.oa_jpydid;
    }

    /**
     *  获取属性值[机票预订标识]是否修改
     */
    public boolean isOA_JPYDIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_JPYDIdDirty();
        }
        return this.oa_jpydidDirtyFlag;
    }

    /**
     *  重置属性值[机票预订标识]
     */
    public void resetOA_JPYDId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_JPYDId();
            return;
        }

        this.oa_jpydidDirtyFlag = false;
        this.oa_jpydid = null;
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
     *  设置属性值[机票预订名称]
     *  @param oa_jpydname
     */
    public void setOA_JPYDName(String oa_jpydname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_JPYDName(oa_jpydname);
            return;
        }
        if(oa_jpydname!=null) {
            oa_jpydname = StringHelper.trimRight(oa_jpydname);
            if(oa_jpydname.length()==0) {
                oa_jpydname = null;
            }
        }
        this.oa_jpydname =  oa_jpydname;
        this.oa_jpydnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[机票预订名称]
     */
    public String getOA_JPYDName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_JPYDName();
        }
        return this.oa_jpydname;
    }

    /**
     *  获取属性值[机票预订名称]是否修改
     */
    public boolean isOA_JPYDNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_JPYDNameDirty();
        }
        return this.oa_jpydnameDirtyFlag;
    }

    /**
     *  重置属性值[机票预订名称]
     */
    public void resetOA_JPYDName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_JPYDName();
            return;
        }

        this.oa_jpydnameDirtyFlag = false;
        this.oa_jpydname = null;
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
     *  设置属性值[身份证号码]
     *  @param sfzhm
     */
    public void setSFZHM(String sfzhm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSFZHM(sfzhm);
            return;
        }
        if(sfzhm!=null) {
            sfzhm = StringHelper.trimRight(sfzhm);
            if(sfzhm.length()==0) {
                sfzhm = null;
            }
        }
        this.sfzhm =  sfzhm;
        this.sfzhmDirtyFlag  = true;
    }

    /**
     *  获取属性值[身份证号码]
     */
    public String getSFZHM() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSFZHM();
        }
        return this.sfzhm;
    }

    /**
     *  获取属性值[身份证号码]是否修改
     */
    public boolean isSFZHMDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSFZHMDirty();
        }
        return this.sfzhmDirtyFlag;
    }

    /**
     *  重置属性值[身份证号码]
     */
    public void resetSFZHM() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSFZHM();
            return;
        }

        this.sfzhmDirtyFlag = false;
        this.sfzhm = null;
    }
    /**
     *  设置属性值[目的地]
     *  @param mdd
     */
    public void setMdd(String mdd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMdd(mdd);
            return;
        }
        if(mdd!=null) {
            mdd = StringHelper.trimRight(mdd);
            if(mdd.length()==0) {
                mdd = null;
            }
        }
        this.mdd =  mdd;
        this.mddDirtyFlag  = true;
    }

    /**
     *  获取属性值[目的地]
     */
    public String getMdd() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMdd();
        }
        return this.mdd;
    }

    /**
     *  获取属性值[目的地]是否修改
     */
    public boolean isMddDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMddDirty();
        }
        return this.mddDirtyFlag;
    }

    /**
     *  重置属性值[目的地]
     */
    public void resetMdd() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMdd();
            return;
        }

        this.mddDirtyFlag = false;
        this.mdd = null;
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
     *  设置属性值[返程时间]
     *  @param fcsj
     */
    public void setFCSJ(Timestamp fcsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFCSJ(fcsj);
            return;
        }
        this.fcsj =  fcsj;
        this.fcsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[返程时间]
     */
    public Timestamp getFCSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFCSJ();
        }
        return this.fcsj;
    }

    /**
     *  获取属性值[返程时间]是否修改
     */
    public boolean isFCSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFCSJDirty();
        }
        return this.fcsjDirtyFlag;
    }

    /**
     *  重置属性值[返程时间]
     */
    public void resetFCSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFCSJ();
            return;
        }

        this.fcsjDirtyFlag = false;
        this.fcsj = null;
    }
    /**
     *  设置属性值[金额]
     *  @param je
     */
    public void setJe(Double je) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJe(je);
            return;
        }
        this.je =  je;
        this.jeDirtyFlag  = true;
    }

    /**
     *  获取属性值[金额]
     */
    public Double getJe() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJe();
        }
        return this.je;
    }

    /**
     *  获取属性值[金额]是否修改
     */
    public boolean isJeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJeDirty();
        }
        return this.jeDirtyFlag;
    }

    /**
     *  重置属性值[金额]
     */
    public void resetJe() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJe();
            return;
        }

        this.jeDirtyFlag = false;
        this.je = null;
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
     *  设置属性值[机票预订状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param jpydzt
     */
    public void setJPYDZT(String jpydzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJPYDZT(jpydzt);
            return;
        }
        if(jpydzt!=null) {
            jpydzt = StringHelper.trimRight(jpydzt);
            if(jpydzt.length()==0) {
                jpydzt = null;
            }
        }
        this.jpydzt =  jpydzt;
        this.jpydztDirtyFlag  = true;
    }

    /**
     *  获取属性值[机票预订状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getJPYDZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJPYDZT();
        }
        return this.jpydzt;
    }

    /**
     *  获取属性值[机票预订状态]是否修改
     */
    public boolean isJPYDZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJPYDZTDirty();
        }
        return this.jpydztDirtyFlag;
    }

    /**
     *  重置属性值[机票预订状态]
     */
    public void resetJPYDZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJPYDZT();
            return;
        }

        this.jpydztDirtyFlag = false;
        this.jpydzt = null;
    }
    /**
     *  设置属性值[机票预订步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param jpydbz
     */
    public void setJPYDBZ(String jpydbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJPYDBZ(jpydbz);
            return;
        }
        if(jpydbz!=null) {
            jpydbz = StringHelper.trimRight(jpydbz);
            if(jpydbz.length()==0) {
                jpydbz = null;
            }
        }
        this.jpydbz =  jpydbz;
        this.jpydbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[机票预订步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getJPYDBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJPYDBZ();
        }
        return this.jpydbz;
    }

    /**
     *  获取属性值[机票预订步骤]是否修改
     */
    public boolean isJPYDBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJPYDBZDirty();
        }
        return this.jpydbzDirtyFlag;
    }

    /**
     *  重置属性值[机票预订步骤]
     */
    public void resetJPYDBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJPYDBZ();
            return;
        }

        this.jpydbzDirtyFlag = false;
        this.jpydbz = null;
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
     *  设置属性值[人员姓名]
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
     *  获取属性值[人员姓名]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[人员姓名]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[人员姓名]
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
     *  设置属性值[经办人]
     *  @param jbrid
     */
    public void setJBRID(String jbrid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJBRID(jbrid);
            return;
        }
        if(jbrid!=null) {
            jbrid = StringHelper.trimRight(jbrid);
            if(jbrid.length()==0) {
                jbrid = null;
            }
        }
        this.jbrid =  jbrid;
        this.jbridDirtyFlag  = true;
    }

    /**
     *  获取属性值[经办人]
     */
    public String getJBRID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJBRID();
        }
        return this.jbrid;
    }

    /**
     *  获取属性值[经办人]是否修改
     */
    public boolean isJBRIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJBRIDDirty();
        }
        return this.jbridDirtyFlag;
    }

    /**
     *  重置属性值[经办人]
     */
    public void resetJBRID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJBRID();
            return;
        }

        this.jbridDirtyFlag = false;
        this.jbrid = null;
    }
    /**
     *  设置属性值[经办人名称]
     *  @param jbrname
     */
    public void setJBRNAME(String jbrname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJBRNAME(jbrname);
            return;
        }
        if(jbrname!=null) {
            jbrname = StringHelper.trimRight(jbrname);
            if(jbrname.length()==0) {
                jbrname = null;
            }
        }
        this.jbrname =  jbrname;
        this.jbrnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[经办人名称]
     */
    public String getJBRNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJBRNAME();
        }
        return this.jbrname;
    }

    /**
     *  获取属性值[经办人名称]是否修改
     */
    public boolean isJBRNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJBRNAMEDirty();
        }
        return this.jbrnameDirtyFlag;
    }

    /**
     *  重置属性值[经办人名称]
     */
    public void resetJBRNAME() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJBRNAME();
            return;
        }

        this.jbrnameDirtyFlag = false;
        this.jbrname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_JPYD.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_JPYD et) {
        et.resetJpydsfshtg();
        et.resetMemo();
        et.resetOA_JPYDId();
        et.resetCreateMan();
        et.resetOA_JPYDName();
        et.resetCreateDate();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetZW();
        et.resetSFZHM();
        et.resetMdd();
        et.resetCFSJ();
        et.resetFCSJ();
        et.resetJe();
        et.resetSqsy();
        et.resetFJ();
        et.resetWFSTATE();
        et.resetJPYDZT();
        et.resetJPYDBZ();
        et.resetWFINSTANCEID();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetJBRID();
        et.resetJBRNAME();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isJpydsfshtgDirty()) {
            params.put(FIELD_JPYDSFSHTG,getJpydsfshtg());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOA_JPYDIdDirty()) {
            params.put(FIELD_OA_JPYDID,getOA_JPYDId());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_JPYDNameDirty()) {
            params.put(FIELD_OA_JPYDNAME,getOA_JPYDName());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isZWDirty()) {
            params.put(FIELD_ZW,getZW());
        }
        if(!bDirtyOnly || isSFZHMDirty()) {
            params.put(FIELD_SFZHM,getSFZHM());
        }
        if(!bDirtyOnly || isMddDirty()) {
            params.put(FIELD_MDD,getMdd());
        }
        if(!bDirtyOnly || isCFSJDirty()) {
            params.put(FIELD_CFSJ,getCFSJ());
        }
        if(!bDirtyOnly || isFCSJDirty()) {
            params.put(FIELD_FCSJ,getFCSJ());
        }
        if(!bDirtyOnly || isJeDirty()) {
            params.put(FIELD_JE,getJe());
        }
        if(!bDirtyOnly || isSqsyDirty()) {
            params.put(FIELD_SQSY,getSqsy());
        }
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isJPYDZTDirty()) {
            params.put(FIELD_JPYDZT,getJPYDZT());
        }
        if(!bDirtyOnly || isJPYDBZDirty()) {
            params.put(FIELD_JPYDBZ,getJPYDBZ());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
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
        if(!bDirtyOnly || isJBRIDDirty()) {
            params.put(FIELD_JBRID,getJBRID());
        }
        if(!bDirtyOnly || isJBRNAMEDirty()) {
            params.put(FIELD_JBRNAME,getJBRNAME());
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

        return  OA_JPYD.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_JPYD et,int index) throws Exception {

        switch(index) {
        case INDEX_JPYDSFSHTG:
            return et.getJpydsfshtg();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_OA_JPYDID:
            return et.getOA_JPYDId();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_JPYDNAME:
            return et.getOA_JPYDName();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_ZW:
            return et.getZW();
        case INDEX_SFZHM:
            return et.getSFZHM();
        case INDEX_MDD:
            return et.getMdd();
        case INDEX_CFSJ:
            return et.getCFSJ();
        case INDEX_FCSJ:
            return et.getFCSJ();
        case INDEX_JE:
            return et.getJe();
        case INDEX_SQSY:
            return et.getSqsy();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_JPYDZT:
            return et.getJPYDZT();
        case INDEX_JPYDBZ:
            return et.getJPYDBZ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_JBRID:
            return et.getJBRID();
        case INDEX_JBRNAME:
            return et.getJBRNAME();
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

        OA_JPYD.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_JPYD et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_JPYDSFSHTG:
            et.setJpydsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_JPYDID:
            et.setOA_JPYDId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_JPYDNAME:
            et.setOA_JPYDName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_ZW:
            et.setZW(DataObject.getStringValue(obj));
            return ;
        case INDEX_SFZHM:
            et.setSFZHM(DataObject.getStringValue(obj));
            return ;
        case INDEX_MDD:
            et.setMdd(DataObject.getStringValue(obj));
            return ;
        case INDEX_CFSJ:
            et.setCFSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_FCSJ:
            et.setFCSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_JE:
            et.setJe(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_SQSY:
            et.setSqsy(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_JPYDZT:
            et.setJPYDZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_JPYDBZ:
            et.setJPYDBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
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
        case INDEX_JBRID:
            et.setJBRID(DataObject.getStringValue(obj));
            return ;
        case INDEX_JBRNAME:
            et.setJBRNAME(DataObject.getStringValue(obj));
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

        return  OA_JPYD.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_JPYD et,int index) throws Exception {

        switch(index) {
        case INDEX_JPYDSFSHTG:
            return et.getJpydsfshtg()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_OA_JPYDID:
            return et.getOA_JPYDId()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_JPYDNAME:
            return et.getOA_JPYDName()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_ZW:
            return et.getZW()==null;
        case INDEX_SFZHM:
            return et.getSFZHM()==null;
        case INDEX_MDD:
            return et.getMdd()==null;
        case INDEX_CFSJ:
            return et.getCFSJ()==null;
        case INDEX_FCSJ:
            return et.getFCSJ()==null;
        case INDEX_JE:
            return et.getJe()==null;
        case INDEX_SQSY:
            return et.getSqsy()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_JPYDZT:
            return et.getJPYDZT()==null;
        case INDEX_JPYDBZ:
            return et.getJPYDBZ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_JBRID:
            return et.getJBRID()==null;
        case INDEX_JBRNAME:
            return et.getJBRNAME()==null;
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

        return  OA_JPYD.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_JPYD et,int index) throws Exception {

        switch(index) {
        case INDEX_JPYDSFSHTG:
            return et.isJpydsfshtgDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_OA_JPYDID:
            return et.isOA_JPYDIdDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_JPYDNAME:
            return et.isOA_JPYDNameDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_ZW:
            return et.isZWDirty();
        case INDEX_SFZHM:
            return et.isSFZHMDirty();
        case INDEX_MDD:
            return et.isMddDirty();
        case INDEX_CFSJ:
            return et.isCFSJDirty();
        case INDEX_FCSJ:
            return et.isFCSJDirty();
        case INDEX_JE:
            return et.isJeDirty();
        case INDEX_SQSY:
            return et.isSqsyDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_JPYDZT:
            return et.isJPYDZTDirty();
        case INDEX_JPYDBZ:
            return et.isJPYDBZDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_JBRID:
            return et.isJBRIDDirty();
        case INDEX_JBRNAME:
            return et.isJBRNAMEDirty();
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
    private static  void fillJSONObject(OA_JPYD et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getJpydsfshtg()!=null) {
            JSONObjectHelper.put(json,"jpydsfshtg",getJSONValue(et.getJpydsfshtg()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getOA_JPYDId()!=null) {
            JSONObjectHelper.put(json,"oa_jpydid",getJSONValue(et.getOA_JPYDId()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_JPYDName()!=null) {
            JSONObjectHelper.put(json,"oa_jpydname",getJSONValue(et.getOA_JPYDName()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getZW()!=null) {
            JSONObjectHelper.put(json,"zw",getJSONValue(et.getZW()),false);
        }
        if(bIncEmpty||et.getSFZHM()!=null) {
            JSONObjectHelper.put(json,"sfzhm",getJSONValue(et.getSFZHM()),false);
        }
        if(bIncEmpty||et.getMdd()!=null) {
            JSONObjectHelper.put(json,"mdd",getJSONValue(et.getMdd()),false);
        }
        if(bIncEmpty||et.getCFSJ()!=null) {
            JSONObjectHelper.put(json,"cfsj",getJSONValue(et.getCFSJ()),false);
        }
        if(bIncEmpty||et.getFCSJ()!=null) {
            JSONObjectHelper.put(json,"fcsj",getJSONValue(et.getFCSJ()),false);
        }
        if(bIncEmpty||et.getJe()!=null) {
            JSONObjectHelper.put(json,"je",getJSONValue(et.getJe()),false);
        }
        if(bIncEmpty||et.getSqsy()!=null) {
            JSONObjectHelper.put(json,"sqsy",getJSONValue(et.getSqsy()),false);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getJPYDZT()!=null) {
            JSONObjectHelper.put(json,"jpydzt",getJSONValue(et.getJPYDZT()),false);
        }
        if(bIncEmpty||et.getJPYDBZ()!=null) {
            JSONObjectHelper.put(json,"jpydbz",getJSONValue(et.getJPYDBZ()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
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
        if(bIncEmpty||et.getJBRID()!=null) {
            JSONObjectHelper.put(json,"jbrid",getJSONValue(et.getJBRID()),false);
        }
        if(bIncEmpty||et.getJBRNAME()!=null) {
            JSONObjectHelper.put(json,"jbrname",getJSONValue(et.getJBRNAME()),false);
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
    private static void fillXmlNode(OA_JPYD et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getJpydsfshtg()!=null) {
            Object obj = et.getJpydsfshtg();
            node.setAttribute("JPYDSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_JPYDId()!=null) {
            Object obj = et.getOA_JPYDId();
            node.setAttribute("OA_JPYDID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_JPYDName()!=null) {
            Object obj = et.getOA_JPYDName();
            node.setAttribute("OA_JPYDNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getZW()!=null) {
            Object obj = et.getZW();
            node.setAttribute("ZW",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSFZHM()!=null) {
            Object obj = et.getSFZHM();
            node.setAttribute("SFZHM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMdd()!=null) {
            Object obj = et.getMdd();
            node.setAttribute("MDD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCFSJ()!=null) {
            Object obj = et.getCFSJ();
            node.setAttribute("CFSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getFCSJ()!=null) {
            Object obj = et.getFCSJ();
            node.setAttribute("FCSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getJe()!=null) {
            Object obj = et.getJe();
            node.setAttribute("JE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSqsy()!=null) {
            Object obj = et.getSqsy();
            node.setAttribute("SQSY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getJPYDZT()!=null) {
            Object obj = et.getJPYDZT();
            node.setAttribute("JPYDZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJPYDBZ()!=null) {
            Object obj = et.getJPYDBZ();
            node.setAttribute("JPYDBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getJBRID()!=null) {
            Object obj = et.getJBRID();
            node.setAttribute("JBRID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJBRNAME()!=null) {
            Object obj = et.getJBRNAME();
            node.setAttribute("JBRNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_JPYD.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_JPYD et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isJpydsfshtgDirty() && (bIncEmpty||et.getJpydsfshtg()!=null)) {
            dst.set(FIELD_JPYDSFSHTG,et.getJpydsfshtg());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isOA_JPYDIdDirty() && (bIncEmpty||et.getOA_JPYDId()!=null)) {
            dst.set(FIELD_OA_JPYDID,et.getOA_JPYDId());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_JPYDNameDirty() && (bIncEmpty||et.getOA_JPYDName()!=null)) {
            dst.set(FIELD_OA_JPYDNAME,et.getOA_JPYDName());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isZWDirty() && (bIncEmpty||et.getZW()!=null)) {
            dst.set(FIELD_ZW,et.getZW());
        }
        if(et.isSFZHMDirty() && (bIncEmpty||et.getSFZHM()!=null)) {
            dst.set(FIELD_SFZHM,et.getSFZHM());
        }
        if(et.isMddDirty() && (bIncEmpty||et.getMdd()!=null)) {
            dst.set(FIELD_MDD,et.getMdd());
        }
        if(et.isCFSJDirty() && (bIncEmpty||et.getCFSJ()!=null)) {
            dst.set(FIELD_CFSJ,et.getCFSJ());
        }
        if(et.isFCSJDirty() && (bIncEmpty||et.getFCSJ()!=null)) {
            dst.set(FIELD_FCSJ,et.getFCSJ());
        }
        if(et.isJeDirty() && (bIncEmpty||et.getJe()!=null)) {
            dst.set(FIELD_JE,et.getJe());
        }
        if(et.isSqsyDirty() && (bIncEmpty||et.getSqsy()!=null)) {
            dst.set(FIELD_SQSY,et.getSqsy());
        }
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isJPYDZTDirty() && (bIncEmpty||et.getJPYDZT()!=null)) {
            dst.set(FIELD_JPYDZT,et.getJPYDZT());
        }
        if(et.isJPYDBZDirty() && (bIncEmpty||et.getJPYDBZ()!=null)) {
            dst.set(FIELD_JPYDBZ,et.getJPYDBZ());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
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
        if(et.isJBRIDDirty() && (bIncEmpty||et.getJBRID()!=null)) {
            dst.set(FIELD_JBRID,et.getJBRID());
        }
        if(et.isJBRNAMEDirty() && (bIncEmpty||et.getJBRNAME()!=null)) {
            dst.set(FIELD_JBRNAME,et.getJBRNAME());
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
        return  OA_JPYD.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_JPYD et,int index) throws Exception {
        switch(index) {
        case INDEX_JPYDSFSHTG:
            et.resetJpydsfshtg();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_OA_JPYDID:
            et.resetOA_JPYDId();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_JPYDNAME:
            et.resetOA_JPYDName();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_ZW:
            et.resetZW();
            return true;
        case INDEX_SFZHM:
            et.resetSFZHM();
            return true;
        case INDEX_MDD:
            et.resetMdd();
            return true;
        case INDEX_CFSJ:
            et.resetCFSJ();
            return true;
        case INDEX_FCSJ:
            et.resetFCSJ();
            return true;
        case INDEX_JE:
            et.resetJe();
            return true;
        case INDEX_SQSY:
            et.resetSqsy();
            return true;
        case INDEX_FJ:
            et.resetFJ();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_JPYDZT:
            et.resetJPYDZT();
            return true;
        case INDEX_JPYDBZ:
            et.resetJPYDBZ();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
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
        case INDEX_JBRID:
            et.resetJBRID();
            return true;
        case INDEX_JBRNAME:
            et.resetJBRNAME();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objJBRLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser jbr = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getJBR() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJBR();
        }

        if(this.getJBRID()==null)
            return null;
        synchronized(objJBRLock) {
            if(jbr==null) {
                jbr = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                jbr.setOrgUserId(this.getJBRID());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(jbr);
            }
            return jbr;
        }
    }

    private Object objRYBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser rybs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getRYBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRYBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objRYBSLock) {
            if(rybs==null) {
                rybs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                rybs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(rybs);
            }
            return rybs;
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
    private OA_JPYD getProxyEntity() {
        return this.proxyOA_JPYD;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_JPYD = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_JPYD) {
            this.proxyOA_JPYD = (OA_JPYD)proxyDataObject;
        }

    }

}