/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.entity;


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
 * 实体[OA_CL] 数据对象
 */
public class OA_CL extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_CL.class);
    /**
     *   实体属性标识[使用时间]
     */
    public final static String FIELD_SYSJ = "SYSJ";
    /**
     *   实体属性标识[车辆标识]
     */
    public final static String FIELD_OA_CLID = "OA_CLID";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[车辆名称]
     */
    public final static String FIELD_OA_CLNAME = "OA_CLNAME";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[车辆品牌]
     */
    public final static String FIELD_CLPP = "CLPP";
    /**
     *   实体属性标识[车牌号]
     */
    public final static String FIELD_CPH = "CPH";
    /**
     *   实体属性标识[发动机号]
     */
    public final static String FIELD_FDJH = "FDJH";
    /**
     *   实体属性标识[底盘号]
     */
    public final static String FIELD_DPH = "DPH";
    /**
     *   实体属性标识[颜色]
     */
    public final static String FIELD_COLOR = "COLOR";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
    /**
     *   实体属性标识[使用情况]
     */
    public final static String FIELD_SYQK = "SYQK";

    private final static int INDEX_SYSJ = 0;
    private final static int INDEX_OA_CLID = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_UPDATEMAN = 4;
    private final static int INDEX_OA_CLNAME = 5;
    private final static int INDEX_CREATEMAN = 6;
    private final static int INDEX_CLPP = 7;
    private final static int INDEX_CPH = 8;
    private final static int INDEX_FDJH = 9;
    private final static int INDEX_DPH = 10;
    private final static int INDEX_COLOR = 11;
    private final static int INDEX_FJ = 12;
    private final static int INDEX_SYQK = 13;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_SYSJ, INDEX_SYSJ);
        fieldIndexMap.put( FIELD_OA_CLID, INDEX_OA_CLID);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_OA_CLNAME, INDEX_OA_CLNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_CLPP, INDEX_CLPP);
        fieldIndexMap.put( FIELD_CPH, INDEX_CPH);
        fieldIndexMap.put( FIELD_FDJH, INDEX_FDJH);
        fieldIndexMap.put( FIELD_DPH, INDEX_DPH);
        fieldIndexMap.put( FIELD_COLOR, INDEX_COLOR);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_SYQK, INDEX_SYQK);
    }

    private OA_CL proxyOA_CL = null;

    public OA_CL() {
        super();
    }
    private boolean sysjDirtyFlag = false;
    private boolean oa_clidDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean oa_clnameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean clppDirtyFlag = false;
    private boolean cphDirtyFlag = false;
    private boolean fdjhDirtyFlag = false;
    private boolean dphDirtyFlag = false;
    private boolean colorDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean syqkDirtyFlag = false;

    @Column(name="sysj")
    private Timestamp sysj;
    @Column(name="oa_clid")
    private String oa_clid;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="oa_clname")
    private String oa_clname;
    @Column(name="createman")
    private String createman;
    @Column(name="clpp")
    private String clpp;
    @Column(name="cph")
    private String cph;
    @Column(name="fdjh")
    private String fdjh;
    @Column(name="dph")
    private String dph;
    @Column(name="color")
    private String color;
    @Column(name="fj")
    private String fj;
    @Column(name="syqk")
    private String syqk;


    /**
     *  设置属性值[使用时间]
     *  @param sysj
     */
    public void setSYSJ(Timestamp sysj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSYSJ(sysj);
            return;
        }
        this.sysj =  sysj;
        this.sysjDirtyFlag  = true;
    }

    /**
     *  获取属性值[使用时间]
     */
    public Timestamp getSYSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSYSJ();
        }
        return this.sysj;
    }

    /**
     *  获取属性值[使用时间]是否修改
     */
    public boolean isSYSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSYSJDirty();
        }
        return this.sysjDirtyFlag;
    }

    /**
     *  重置属性值[使用时间]
     */
    public void resetSYSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSYSJ();
            return;
        }

        this.sysjDirtyFlag = false;
        this.sysj = null;
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
     *  设置属性值[发动机号]
     *  @param fdjh
     */
    public void setFdjh(String fdjh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFdjh(fdjh);
            return;
        }
        if(fdjh!=null) {
            fdjh = StringHelper.trimRight(fdjh);
            if(fdjh.length()==0) {
                fdjh = null;
            }
        }
        this.fdjh =  fdjh;
        this.fdjhDirtyFlag  = true;
    }

    /**
     *  获取属性值[发动机号]
     */
    public String getFdjh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFdjh();
        }
        return this.fdjh;
    }

    /**
     *  获取属性值[发动机号]是否修改
     */
    public boolean isFdjhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFdjhDirty();
        }
        return this.fdjhDirtyFlag;
    }

    /**
     *  重置属性值[发动机号]
     */
    public void resetFdjh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFdjh();
            return;
        }

        this.fdjhDirtyFlag = false;
        this.fdjh = null;
    }
    /**
     *  设置属性值[底盘号]
     *  @param dph
     */
    public void setDph(String dph) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDph(dph);
            return;
        }
        if(dph!=null) {
            dph = StringHelper.trimRight(dph);
            if(dph.length()==0) {
                dph = null;
            }
        }
        this.dph =  dph;
        this.dphDirtyFlag  = true;
    }

    /**
     *  获取属性值[底盘号]
     */
    public String getDph() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDph();
        }
        return this.dph;
    }

    /**
     *  获取属性值[底盘号]是否修改
     */
    public boolean isDphDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDphDirty();
        }
        return this.dphDirtyFlag;
    }

    /**
     *  重置属性值[底盘号]
     */
    public void resetDph() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDph();
            return;
        }

        this.dphDirtyFlag = false;
        this.dph = null;
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
     *  设置属性值[使用情况]代码表：com.sa.unip.srv.codelist.CLSYQKCodeListModel
     *  @param syqk
     */
    public void setSYQK(String syqk) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSYQK(syqk);
            return;
        }
        if(syqk!=null) {
            syqk = StringHelper.trimRight(syqk);
            if(syqk.length()==0) {
                syqk = null;
            }
        }
        this.syqk =  syqk;
        this.syqkDirtyFlag  = true;
    }

    /**
     *  获取属性值[使用情况]代码表：com.sa.unip.srv.codelist.CLSYQKCodeListModel
     */
    public String getSYQK() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSYQK();
        }
        return this.syqk;
    }

    /**
     *  获取属性值[使用情况]是否修改
     */
    public boolean isSYQKDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSYQKDirty();
        }
        return this.syqkDirtyFlag;
    }

    /**
     *  重置属性值[使用情况]
     */
    public void resetSYQK() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSYQK();
            return;
        }

        this.syqkDirtyFlag = false;
        this.syqk = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_CL.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_CL et) {
        et.resetSYSJ();
        et.resetOA_CLId();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetOA_CLName();
        et.resetCreateMan();
        et.resetClpp();
        et.resetCph();
        et.resetFdjh();
        et.resetDph();
        et.resetColor();
        et.resetFJ();
        et.resetSYQK();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isSYSJDirty()) {
            params.put(FIELD_SYSJ,getSYSJ());
        }
        if(!bDirtyOnly || isOA_CLIdDirty()) {
            params.put(FIELD_OA_CLID,getOA_CLId());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isOA_CLNameDirty()) {
            params.put(FIELD_OA_CLNAME,getOA_CLName());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isClppDirty()) {
            params.put(FIELD_CLPP,getClpp());
        }
        if(!bDirtyOnly || isCphDirty()) {
            params.put(FIELD_CPH,getCph());
        }
        if(!bDirtyOnly || isFdjhDirty()) {
            params.put(FIELD_FDJH,getFdjh());
        }
        if(!bDirtyOnly || isDphDirty()) {
            params.put(FIELD_DPH,getDph());
        }
        if(!bDirtyOnly || isColorDirty()) {
            params.put(FIELD_COLOR,getColor());
        }
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
        }
        if(!bDirtyOnly || isSYQKDirty()) {
            params.put(FIELD_SYQK,getSYQK());
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

        return  OA_CL.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_CL et,int index) throws Exception {

        switch(index) {
        case INDEX_SYSJ:
            return et.getSYSJ();
        case INDEX_OA_CLID:
            return et.getOA_CLId();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_OA_CLNAME:
            return et.getOA_CLName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_CLPP:
            return et.getClpp();
        case INDEX_CPH:
            return et.getCph();
        case INDEX_FDJH:
            return et.getFdjh();
        case INDEX_DPH:
            return et.getDph();
        case INDEX_COLOR:
            return et.getColor();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_SYQK:
            return et.getSYQK();
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

        OA_CL.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_CL et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_SYSJ:
            et.setSYSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_CLID:
            et.setOA_CLId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CLNAME:
            et.setOA_CLName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CLPP:
            et.setClpp(DataObject.getStringValue(obj));
            return ;
        case INDEX_CPH:
            et.setCph(DataObject.getStringValue(obj));
            return ;
        case INDEX_FDJH:
            et.setFdjh(DataObject.getStringValue(obj));
            return ;
        case INDEX_DPH:
            et.setDph(DataObject.getStringValue(obj));
            return ;
        case INDEX_COLOR:
            et.setColor(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_SYQK:
            et.setSYQK(DataObject.getStringValue(obj));
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

        return  OA_CL.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_CL et,int index) throws Exception {

        switch(index) {
        case INDEX_SYSJ:
            return et.getSYSJ()==null;
        case INDEX_OA_CLID:
            return et.getOA_CLId()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_OA_CLNAME:
            return et.getOA_CLName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_CLPP:
            return et.getClpp()==null;
        case INDEX_CPH:
            return et.getCph()==null;
        case INDEX_FDJH:
            return et.getFdjh()==null;
        case INDEX_DPH:
            return et.getDph()==null;
        case INDEX_COLOR:
            return et.getColor()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_SYQK:
            return et.getSYQK()==null;
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

        return  OA_CL.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_CL et,int index) throws Exception {

        switch(index) {
        case INDEX_SYSJ:
            return et.isSYSJDirty();
        case INDEX_OA_CLID:
            return et.isOA_CLIdDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_OA_CLNAME:
            return et.isOA_CLNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_CLPP:
            return et.isClppDirty();
        case INDEX_CPH:
            return et.isCphDirty();
        case INDEX_FDJH:
            return et.isFdjhDirty();
        case INDEX_DPH:
            return et.isDphDirty();
        case INDEX_COLOR:
            return et.isColorDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_SYQK:
            return et.isSYQKDirty();
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
    private static  void fillJSONObject(OA_CL et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getSYSJ()!=null) {
            JSONObjectHelper.put(json,"sysj",getJSONValue(et.getSYSJ()),false);
        }
        if(bIncEmpty||et.getOA_CLId()!=null) {
            JSONObjectHelper.put(json,"oa_clid",getJSONValue(et.getOA_CLId()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getOA_CLName()!=null) {
            JSONObjectHelper.put(json,"oa_clname",getJSONValue(et.getOA_CLName()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getClpp()!=null) {
            JSONObjectHelper.put(json,"clpp",getJSONValue(et.getClpp()),false);
        }
        if(bIncEmpty||et.getCph()!=null) {
            JSONObjectHelper.put(json,"cph",getJSONValue(et.getCph()),false);
        }
        if(bIncEmpty||et.getFdjh()!=null) {
            JSONObjectHelper.put(json,"fdjh",getJSONValue(et.getFdjh()),false);
        }
        if(bIncEmpty||et.getDph()!=null) {
            JSONObjectHelper.put(json,"dph",getJSONValue(et.getDph()),false);
        }
        if(bIncEmpty||et.getColor()!=null) {
            JSONObjectHelper.put(json,"color",getJSONValue(et.getColor()),false);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
        }
        if(bIncEmpty||et.getSYQK()!=null) {
            JSONObjectHelper.put(json,"syqk",getJSONValue(et.getSYQK()),false);
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
    private static void fillXmlNode(OA_CL et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getSYSJ()!=null) {
            Object obj = et.getSYSJ();
            node.setAttribute("SYSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_CLId()!=null) {
            Object obj = et.getOA_CLId();
            node.setAttribute("OA_CLID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CLName()!=null) {
            Object obj = et.getOA_CLName();
            node.setAttribute("OA_CLNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getClpp()!=null) {
            Object obj = et.getClpp();
            node.setAttribute("CLPP",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCph()!=null) {
            Object obj = et.getCph();
            node.setAttribute("CPH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFdjh()!=null) {
            Object obj = et.getFdjh();
            node.setAttribute("FDJH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDph()!=null) {
            Object obj = et.getDph();
            node.setAttribute("DPH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getColor()!=null) {
            Object obj = et.getColor();
            node.setAttribute("COLOR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSYQK()!=null) {
            Object obj = et.getSYQK();
            node.setAttribute("SYQK",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_CL.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_CL et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isSYSJDirty() && (bIncEmpty||et.getSYSJ()!=null)) {
            dst.set(FIELD_SYSJ,et.getSYSJ());
        }
        if(et.isOA_CLIdDirty() && (bIncEmpty||et.getOA_CLId()!=null)) {
            dst.set(FIELD_OA_CLID,et.getOA_CLId());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isOA_CLNameDirty() && (bIncEmpty||et.getOA_CLName()!=null)) {
            dst.set(FIELD_OA_CLNAME,et.getOA_CLName());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isClppDirty() && (bIncEmpty||et.getClpp()!=null)) {
            dst.set(FIELD_CLPP,et.getClpp());
        }
        if(et.isCphDirty() && (bIncEmpty||et.getCph()!=null)) {
            dst.set(FIELD_CPH,et.getCph());
        }
        if(et.isFdjhDirty() && (bIncEmpty||et.getFdjh()!=null)) {
            dst.set(FIELD_FDJH,et.getFdjh());
        }
        if(et.isDphDirty() && (bIncEmpty||et.getDph()!=null)) {
            dst.set(FIELD_DPH,et.getDph());
        }
        if(et.isColorDirty() && (bIncEmpty||et.getColor()!=null)) {
            dst.set(FIELD_COLOR,et.getColor());
        }
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
        }
        if(et.isSYQKDirty() && (bIncEmpty||et.getSYQK()!=null)) {
            dst.set(FIELD_SYQK,et.getSYQK());
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
        return  OA_CL.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_CL et,int index) throws Exception {
        switch(index) {
        case INDEX_SYSJ:
            et.resetSYSJ();
            return true;
        case INDEX_OA_CLID:
            et.resetOA_CLId();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_OA_CLNAME:
            et.resetOA_CLName();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_CLPP:
            et.resetClpp();
            return true;
        case INDEX_CPH:
            et.resetCph();
            return true;
        case INDEX_FDJH:
            et.resetFdjh();
            return true;
        case INDEX_DPH:
            et.resetDph();
            return true;
        case INDEX_COLOR:
            et.resetColor();
            return true;
        case INDEX_FJ:
            et.resetFJ();
            return true;
        case INDEX_SYQK:
            et.resetSYQK();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private OA_CL getProxyEntity() {
        return this.proxyOA_CL;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_CL = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_CL) {
            this.proxyOA_CL = (OA_CL)proxyDataObject;
        }

    }

}