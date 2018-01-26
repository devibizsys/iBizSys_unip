/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xtgl.entity;


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
 * 实体[OA_CZRZ] 数据对象
 */
public class OA_CZRZ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_CZRZ.class);
    /**
     *   实体属性标识[操作日志标识]
     */
    public final static String FIELD_OA_CZRZID = "OA_CZRZID";
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
     *   实体属性标识[操作日志名称]
     */
    public final static String FIELD_OA_CZRZNAME = "OA_CZRZNAME";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[IP]
     */
    public final static String FIELD_IP = "IP";
    /**
     *   实体属性标识[操作类型]
     */
    public final static String FIELD_CZLX = "CZLX";
    /**
     *   实体属性标识[操作对象]
     */
    public final static String FIELD_CZDX = "CZDX";
    /**
     *   实体属性标识[操作人标识]
     */
    public final static String FIELD_CZRID = "CZRID";

    private final static int INDEX_OA_CZRZID = 0;
    private final static int INDEX_UPDATEMAN = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_CREATEDATE = 4;
    private final static int INDEX_OA_CZRZNAME = 5;
    private final static int INDEX_MEMO = 6;
    private final static int INDEX_IP = 7;
    private final static int INDEX_CZLX = 8;
    private final static int INDEX_CZDX = 9;
    private final static int INDEX_CZRID = 10;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_CZRZID, INDEX_OA_CZRZID);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_OA_CZRZNAME, INDEX_OA_CZRZNAME);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_IP, INDEX_IP);
        fieldIndexMap.put( FIELD_CZLX, INDEX_CZLX);
        fieldIndexMap.put( FIELD_CZDX, INDEX_CZDX);
        fieldIndexMap.put( FIELD_CZRID, INDEX_CZRID);
    }

    private OA_CZRZ proxyOA_CZRZ = null;

    public OA_CZRZ() {
        super();
    }
    private boolean oa_czrzidDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean oa_czrznameDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean ipDirtyFlag = false;
    private boolean czlxDirtyFlag = false;
    private boolean czdxDirtyFlag = false;
    private boolean czridDirtyFlag = false;

    @Column(name="oa_czrzid")
    private String oa_czrzid;
    @Column(name="updateman")
    private String updateman;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="oa_czrzname")
    private String oa_czrzname;
    @Column(name="memo")
    private String memo;
    @Column(name="ip")
    private String ip;
    @Column(name="czlx")
    private String czlx;
    @Column(name="czdx")
    private String czdx;
    @Column(name="czrid")
    private String czrid;


    /**
     *  设置属性值[操作日志标识]
     *  @param oa_czrzid
     */
    public void setOA_CZRZId(String oa_czrzid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CZRZId(oa_czrzid);
            return;
        }
        if(oa_czrzid!=null) {
            oa_czrzid = StringHelper.trimRight(oa_czrzid);
            if(oa_czrzid.length()==0) {
                oa_czrzid = null;
            }
        }
        this.oa_czrzid =  oa_czrzid;
        this.oa_czrzidDirtyFlag  = true;
    }

    /**
     *  获取属性值[操作日志标识]
     */
    public String getOA_CZRZId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CZRZId();
        }
        return this.oa_czrzid;
    }

    /**
     *  获取属性值[操作日志标识]是否修改
     */
    public boolean isOA_CZRZIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CZRZIdDirty();
        }
        return this.oa_czrzidDirtyFlag;
    }

    /**
     *  重置属性值[操作日志标识]
     */
    public void resetOA_CZRZId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CZRZId();
            return;
        }

        this.oa_czrzidDirtyFlag = false;
        this.oa_czrzid = null;
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
     *  设置属性值[操作日志名称]
     *  @param oa_czrzname
     */
    public void setOA_CZRZName(String oa_czrzname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CZRZName(oa_czrzname);
            return;
        }
        if(oa_czrzname!=null) {
            oa_czrzname = StringHelper.trimRight(oa_czrzname);
            if(oa_czrzname.length()==0) {
                oa_czrzname = null;
            }
        }
        this.oa_czrzname =  oa_czrzname;
        this.oa_czrznameDirtyFlag  = true;
    }

    /**
     *  获取属性值[操作日志名称]
     */
    public String getOA_CZRZName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CZRZName();
        }
        return this.oa_czrzname;
    }

    /**
     *  获取属性值[操作日志名称]是否修改
     */
    public boolean isOA_CZRZNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CZRZNameDirty();
        }
        return this.oa_czrznameDirtyFlag;
    }

    /**
     *  重置属性值[操作日志名称]
     */
    public void resetOA_CZRZName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CZRZName();
            return;
        }

        this.oa_czrznameDirtyFlag = false;
        this.oa_czrzname = null;
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
     *  设置属性值[IP]
     *  @param ip
     */
    public void setIP(String ip) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIP(ip);
            return;
        }
        if(ip!=null) {
            ip = StringHelper.trimRight(ip);
            if(ip.length()==0) {
                ip = null;
            }
        }
        this.ip =  ip;
        this.ipDirtyFlag  = true;
    }

    /**
     *  获取属性值[IP]
     */
    public String getIP() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIP();
        }
        return this.ip;
    }

    /**
     *  获取属性值[IP]是否修改
     */
    public boolean isIPDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIPDirty();
        }
        return this.ipDirtyFlag;
    }

    /**
     *  重置属性值[IP]
     */
    public void resetIP() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIP();
            return;
        }

        this.ipDirtyFlag = false;
        this.ip = null;
    }
    /**
     *  设置属性值[操作类型]
     *  @param czlx
     */
    public void setCzlx(String czlx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCzlx(czlx);
            return;
        }
        if(czlx!=null) {
            czlx = StringHelper.trimRight(czlx);
            if(czlx.length()==0) {
                czlx = null;
            }
        }
        this.czlx =  czlx;
        this.czlxDirtyFlag  = true;
    }

    /**
     *  获取属性值[操作类型]
     */
    public String getCzlx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCzlx();
        }
        return this.czlx;
    }

    /**
     *  获取属性值[操作类型]是否修改
     */
    public boolean isCzlxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCzlxDirty();
        }
        return this.czlxDirtyFlag;
    }

    /**
     *  重置属性值[操作类型]
     */
    public void resetCzlx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCzlx();
            return;
        }

        this.czlxDirtyFlag = false;
        this.czlx = null;
    }
    /**
     *  设置属性值[操作对象]
     *  @param czdx
     */
    public void setCzdx(String czdx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCzdx(czdx);
            return;
        }
        if(czdx!=null) {
            czdx = StringHelper.trimRight(czdx);
            if(czdx.length()==0) {
                czdx = null;
            }
        }
        this.czdx =  czdx;
        this.czdxDirtyFlag  = true;
    }

    /**
     *  获取属性值[操作对象]
     */
    public String getCzdx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCzdx();
        }
        return this.czdx;
    }

    /**
     *  获取属性值[操作对象]是否修改
     */
    public boolean isCzdxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCzdxDirty();
        }
        return this.czdxDirtyFlag;
    }

    /**
     *  重置属性值[操作对象]
     */
    public void resetCzdx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCzdx();
            return;
        }

        this.czdxDirtyFlag = false;
        this.czdx = null;
    }
    /**
     *  设置属性值[操作人标识]
     *  @param czrid
     */
    public void setCzrid(String czrid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCzrid(czrid);
            return;
        }
        if(czrid!=null) {
            czrid = StringHelper.trimRight(czrid);
            if(czrid.length()==0) {
                czrid = null;
            }
        }
        this.czrid =  czrid;
        this.czridDirtyFlag  = true;
    }

    /**
     *  获取属性值[操作人标识]
     */
    public String getCzrid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCzrid();
        }
        return this.czrid;
    }

    /**
     *  获取属性值[操作人标识]是否修改
     */
    public boolean isCzridDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCzridDirty();
        }
        return this.czridDirtyFlag;
    }

    /**
     *  重置属性值[操作人标识]
     */
    public void resetCzrid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCzrid();
            return;
        }

        this.czridDirtyFlag = false;
        this.czrid = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_CZRZ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_CZRZ et) {
        et.resetOA_CZRZId();
        et.resetUpdateMan();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetOA_CZRZName();
        et.resetMemo();
        et.resetIP();
        et.resetCzlx();
        et.resetCzdx();
        et.resetCzrid();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_CZRZIdDirty()) {
            params.put(FIELD_OA_CZRZID,getOA_CZRZId());
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
        if(!bDirtyOnly || isOA_CZRZNameDirty()) {
            params.put(FIELD_OA_CZRZNAME,getOA_CZRZName());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isIPDirty()) {
            params.put(FIELD_IP,getIP());
        }
        if(!bDirtyOnly || isCzlxDirty()) {
            params.put(FIELD_CZLX,getCzlx());
        }
        if(!bDirtyOnly || isCzdxDirty()) {
            params.put(FIELD_CZDX,getCzdx());
        }
        if(!bDirtyOnly || isCzridDirty()) {
            params.put(FIELD_CZRID,getCzrid());
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

        return  OA_CZRZ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_CZRZ et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_CZRZID:
            return et.getOA_CZRZId();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_OA_CZRZNAME:
            return et.getOA_CZRZName();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_IP:
            return et.getIP();
        case INDEX_CZLX:
            return et.getCzlx();
        case INDEX_CZDX:
            return et.getCzdx();
        case INDEX_CZRID:
            return et.getCzrid();
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

        OA_CZRZ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_CZRZ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_CZRZID:
            et.setOA_CZRZId(DataObject.getStringValue(obj));
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
        case INDEX_OA_CZRZNAME:
            et.setOA_CZRZName(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_IP:
            et.setIP(DataObject.getStringValue(obj));
            return ;
        case INDEX_CZLX:
            et.setCzlx(DataObject.getStringValue(obj));
            return ;
        case INDEX_CZDX:
            et.setCzdx(DataObject.getStringValue(obj));
            return ;
        case INDEX_CZRID:
            et.setCzrid(DataObject.getStringValue(obj));
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

        return  OA_CZRZ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_CZRZ et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_CZRZID:
            return et.getOA_CZRZId()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_OA_CZRZNAME:
            return et.getOA_CZRZName()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_IP:
            return et.getIP()==null;
        case INDEX_CZLX:
            return et.getCzlx()==null;
        case INDEX_CZDX:
            return et.getCzdx()==null;
        case INDEX_CZRID:
            return et.getCzrid()==null;
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

        return  OA_CZRZ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_CZRZ et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_CZRZID:
            return et.isOA_CZRZIdDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_OA_CZRZNAME:
            return et.isOA_CZRZNameDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_IP:
            return et.isIPDirty();
        case INDEX_CZLX:
            return et.isCzlxDirty();
        case INDEX_CZDX:
            return et.isCzdxDirty();
        case INDEX_CZRID:
            return et.isCzridDirty();
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
    private static  void fillJSONObject(OA_CZRZ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_CZRZId()!=null) {
            JSONObjectHelper.put(json,"oa_czrzid",getJSONValue(et.getOA_CZRZId()),false);
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
        if(bIncEmpty||et.getOA_CZRZName()!=null) {
            JSONObjectHelper.put(json,"oa_czrzname",getJSONValue(et.getOA_CZRZName()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getIP()!=null) {
            JSONObjectHelper.put(json,"ip",getJSONValue(et.getIP()),false);
        }
        if(bIncEmpty||et.getCzlx()!=null) {
            JSONObjectHelper.put(json,"czlx",getJSONValue(et.getCzlx()),false);
        }
        if(bIncEmpty||et.getCzdx()!=null) {
            JSONObjectHelper.put(json,"czdx",getJSONValue(et.getCzdx()),false);
        }
        if(bIncEmpty||et.getCzrid()!=null) {
            JSONObjectHelper.put(json,"czrid",getJSONValue(et.getCzrid()),false);
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
    private static void fillXmlNode(OA_CZRZ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_CZRZId()!=null) {
            Object obj = et.getOA_CZRZId();
            node.setAttribute("OA_CZRZID",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getOA_CZRZName()!=null) {
            Object obj = et.getOA_CZRZName();
            node.setAttribute("OA_CZRZNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getIP()!=null) {
            Object obj = et.getIP();
            node.setAttribute("IP",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCzlx()!=null) {
            Object obj = et.getCzlx();
            node.setAttribute("CZLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCzdx()!=null) {
            Object obj = et.getCzdx();
            node.setAttribute("CZDX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCzrid()!=null) {
            Object obj = et.getCzrid();
            node.setAttribute("CZRID",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_CZRZ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_CZRZ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_CZRZIdDirty() && (bIncEmpty||et.getOA_CZRZId()!=null)) {
            dst.set(FIELD_OA_CZRZID,et.getOA_CZRZId());
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
        if(et.isOA_CZRZNameDirty() && (bIncEmpty||et.getOA_CZRZName()!=null)) {
            dst.set(FIELD_OA_CZRZNAME,et.getOA_CZRZName());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isIPDirty() && (bIncEmpty||et.getIP()!=null)) {
            dst.set(FIELD_IP,et.getIP());
        }
        if(et.isCzlxDirty() && (bIncEmpty||et.getCzlx()!=null)) {
            dst.set(FIELD_CZLX,et.getCzlx());
        }
        if(et.isCzdxDirty() && (bIncEmpty||et.getCzdx()!=null)) {
            dst.set(FIELD_CZDX,et.getCzdx());
        }
        if(et.isCzridDirty() && (bIncEmpty||et.getCzrid()!=null)) {
            dst.set(FIELD_CZRID,et.getCzrid());
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
        return  OA_CZRZ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_CZRZ et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_CZRZID:
            et.resetOA_CZRZId();
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
        case INDEX_OA_CZRZNAME:
            et.resetOA_CZRZName();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_IP:
            et.resetIP();
            return true;
        case INDEX_CZLX:
            et.resetCzlx();
            return true;
        case INDEX_CZDX:
            et.resetCzdx();
            return true;
        case INDEX_CZRID:
            et.resetCzrid();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private OA_CZRZ getProxyEntity() {
        return this.proxyOA_CZRZ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_CZRZ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_CZRZ) {
            this.proxyOA_CZRZ = (OA_CZRZ)proxyDataObject;
        }

    }

}