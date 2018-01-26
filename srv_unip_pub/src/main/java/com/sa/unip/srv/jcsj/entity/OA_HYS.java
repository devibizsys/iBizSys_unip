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
 * 实体[OA_HYS] 数据对象
 */
public class OA_HYS extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_HYS.class);
    /**
     *   实体属性标识[会议室标识]
     */
    public final static String FIELD_OA_HYSID = "OA_HYSID";
    /**
     *   实体属性标识[会议室名称]
     */
    public final static String FIELD_OA_HYSNAME = "OA_HYSNAME";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[使用情况]
     */
    public final static String FIELD_SYQK = "SYQK";
    /**
     *   实体属性标识[使用时间]
     */
    public final static String FIELD_SYSJ = "SYSJ";
    /**
     *   实体属性标识[会议室地址]
     */
    public final static String FIELD_HYSDZ = "HYSDZ";

    private final static int INDEX_OA_HYSID = 0;
    private final static int INDEX_OA_HYSNAME = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_UPDATEMAN = 3;
    private final static int INDEX_UPDATEDATE = 4;
    private final static int INDEX_CREATEDATE = 5;
    private final static int INDEX_SYQK = 6;
    private final static int INDEX_SYSJ = 7;
    private final static int INDEX_HYSDZ = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_HYSID, INDEX_OA_HYSID);
        fieldIndexMap.put( FIELD_OA_HYSNAME, INDEX_OA_HYSNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_SYQK, INDEX_SYQK);
        fieldIndexMap.put( FIELD_SYSJ, INDEX_SYSJ);
        fieldIndexMap.put( FIELD_HYSDZ, INDEX_HYSDZ);
    }

    private OA_HYS proxyOA_HYS = null;

    public OA_HYS() {
        super();
    }
    private boolean oa_hysidDirtyFlag = false;
    private boolean oa_hysnameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean syqkDirtyFlag = false;
    private boolean sysjDirtyFlag = false;
    private boolean hysdzDirtyFlag = false;

    @Column(name="oa_hysid")
    private String oa_hysid;
    @Column(name="oa_hysname")
    private String oa_hysname;
    @Column(name="createman")
    private String createman;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="syqk")
    private String syqk;
    @Column(name="sysj")
    private Timestamp sysj;
    @Column(name="hysdz")
    private String hysdz;


    /**
     *  设置属性值[会议室标识]
     *  @param oa_hysid
     */
    public void setOA_HYSId(String oa_hysid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_HYSId(oa_hysid);
            return;
        }
        if(oa_hysid!=null) {
            oa_hysid = StringHelper.trimRight(oa_hysid);
            if(oa_hysid.length()==0) {
                oa_hysid = null;
            }
        }
        this.oa_hysid =  oa_hysid;
        this.oa_hysidDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室标识]
     */
    public String getOA_HYSId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_HYSId();
        }
        return this.oa_hysid;
    }

    /**
     *  获取属性值[会议室标识]是否修改
     */
    public boolean isOA_HYSIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_HYSIdDirty();
        }
        return this.oa_hysidDirtyFlag;
    }

    /**
     *  重置属性值[会议室标识]
     */
    public void resetOA_HYSId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_HYSId();
            return;
        }

        this.oa_hysidDirtyFlag = false;
        this.oa_hysid = null;
    }
    /**
     *  设置属性值[会议室名称]
     *  @param oa_hysname
     */
    public void setOA_HYSName(String oa_hysname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_HYSName(oa_hysname);
            return;
        }
        if(oa_hysname!=null) {
            oa_hysname = StringHelper.trimRight(oa_hysname);
            if(oa_hysname.length()==0) {
                oa_hysname = null;
            }
        }
        this.oa_hysname =  oa_hysname;
        this.oa_hysnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室名称]
     */
    public String getOA_HYSName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_HYSName();
        }
        return this.oa_hysname;
    }

    /**
     *  获取属性值[会议室名称]是否修改
     */
    public boolean isOA_HYSNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_HYSNameDirty();
        }
        return this.oa_hysnameDirtyFlag;
    }

    /**
     *  重置属性值[会议室名称]
     */
    public void resetOA_HYSName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_HYSName();
            return;
        }

        this.oa_hysnameDirtyFlag = false;
        this.oa_hysname = null;
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
     *  设置属性值[使用情况]代码表：com.sa.unip.srv.codelist.HYSSYQKCodeListModel
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
     *  获取属性值[使用情况]代码表：com.sa.unip.srv.codelist.HYSSYQKCodeListModel
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
     *  设置属性值[会议室地址]
     *  @param hysdz
     */
    public void setHYSDZ(String hysdz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHYSDZ(hysdz);
            return;
        }
        if(hysdz!=null) {
            hysdz = StringHelper.trimRight(hysdz);
            if(hysdz.length()==0) {
                hysdz = null;
            }
        }
        this.hysdz =  hysdz;
        this.hysdzDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议室地址]
     */
    public String getHYSDZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHYSDZ();
        }
        return this.hysdz;
    }

    /**
     *  获取属性值[会议室地址]是否修改
     */
    public boolean isHYSDZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHYSDZDirty();
        }
        return this.hysdzDirtyFlag;
    }

    /**
     *  重置属性值[会议室地址]
     */
    public void resetHYSDZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHYSDZ();
            return;
        }

        this.hysdzDirtyFlag = false;
        this.hysdz = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_HYS.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_HYS et) {
        et.resetOA_HYSId();
        et.resetOA_HYSName();
        et.resetCreateMan();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetSYQK();
        et.resetSYSJ();
        et.resetHYSDZ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_HYSIdDirty()) {
            params.put(FIELD_OA_HYSID,getOA_HYSId());
        }
        if(!bDirtyOnly || isOA_HYSNameDirty()) {
            params.put(FIELD_OA_HYSNAME,getOA_HYSName());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isSYQKDirty()) {
            params.put(FIELD_SYQK,getSYQK());
        }
        if(!bDirtyOnly || isSYSJDirty()) {
            params.put(FIELD_SYSJ,getSYSJ());
        }
        if(!bDirtyOnly || isHYSDZDirty()) {
            params.put(FIELD_HYSDZ,getHYSDZ());
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

        return  OA_HYS.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_HYS et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_HYSID:
            return et.getOA_HYSId();
        case INDEX_OA_HYSNAME:
            return et.getOA_HYSName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_SYQK:
            return et.getSYQK();
        case INDEX_SYSJ:
            return et.getSYSJ();
        case INDEX_HYSDZ:
            return et.getHYSDZ();
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

        OA_HYS.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_HYS et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_HYSID:
            et.setOA_HYSId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_HYSNAME:
            et.setOA_HYSName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SYQK:
            et.setSYQK(DataObject.getStringValue(obj));
            return ;
        case INDEX_SYSJ:
            et.setSYSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_HYSDZ:
            et.setHYSDZ(DataObject.getStringValue(obj));
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

        return  OA_HYS.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_HYS et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_HYSID:
            return et.getOA_HYSId()==null;
        case INDEX_OA_HYSNAME:
            return et.getOA_HYSName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_SYQK:
            return et.getSYQK()==null;
        case INDEX_SYSJ:
            return et.getSYSJ()==null;
        case INDEX_HYSDZ:
            return et.getHYSDZ()==null;
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

        return  OA_HYS.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_HYS et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_HYSID:
            return et.isOA_HYSIdDirty();
        case INDEX_OA_HYSNAME:
            return et.isOA_HYSNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_SYQK:
            return et.isSYQKDirty();
        case INDEX_SYSJ:
            return et.isSYSJDirty();
        case INDEX_HYSDZ:
            return et.isHYSDZDirty();
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
    private static  void fillJSONObject(OA_HYS et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_HYSId()!=null) {
            JSONObjectHelper.put(json,"oa_hysid",getJSONValue(et.getOA_HYSId()),false);
        }
        if(bIncEmpty||et.getOA_HYSName()!=null) {
            JSONObjectHelper.put(json,"oa_hysname",getJSONValue(et.getOA_HYSName()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getSYQK()!=null) {
            JSONObjectHelper.put(json,"syqk",getJSONValue(et.getSYQK()),false);
        }
        if(bIncEmpty||et.getSYSJ()!=null) {
            JSONObjectHelper.put(json,"sysj",getJSONValue(et.getSYSJ()),false);
        }
        if(bIncEmpty||et.getHYSDZ()!=null) {
            JSONObjectHelper.put(json,"hysdz",getJSONValue(et.getHYSDZ()),false);
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
    private static void fillXmlNode(OA_HYS et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_HYSId()!=null) {
            Object obj = et.getOA_HYSId();
            node.setAttribute("OA_HYSID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_HYSName()!=null) {
            Object obj = et.getOA_HYSName();
            node.setAttribute("OA_HYSNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getSYQK()!=null) {
            Object obj = et.getSYQK();
            node.setAttribute("SYQK",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSYSJ()!=null) {
            Object obj = et.getSYSJ();
            node.setAttribute("SYSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getHYSDZ()!=null) {
            Object obj = et.getHYSDZ();
            node.setAttribute("HYSDZ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_HYS.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_HYS et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_HYSIdDirty() && (bIncEmpty||et.getOA_HYSId()!=null)) {
            dst.set(FIELD_OA_HYSID,et.getOA_HYSId());
        }
        if(et.isOA_HYSNameDirty() && (bIncEmpty||et.getOA_HYSName()!=null)) {
            dst.set(FIELD_OA_HYSNAME,et.getOA_HYSName());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isSYQKDirty() && (bIncEmpty||et.getSYQK()!=null)) {
            dst.set(FIELD_SYQK,et.getSYQK());
        }
        if(et.isSYSJDirty() && (bIncEmpty||et.getSYSJ()!=null)) {
            dst.set(FIELD_SYSJ,et.getSYSJ());
        }
        if(et.isHYSDZDirty() && (bIncEmpty||et.getHYSDZ()!=null)) {
            dst.set(FIELD_HYSDZ,et.getHYSDZ());
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
        return  OA_HYS.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_HYS et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_HYSID:
            et.resetOA_HYSId();
            return true;
        case INDEX_OA_HYSNAME:
            et.resetOA_HYSName();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_SYQK:
            et.resetSYQK();
            return true;
        case INDEX_SYSJ:
            et.resetSYSJ();
            return true;
        case INDEX_HYSDZ:
            et.resetHYSDZ();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private OA_HYS getProxyEntity() {
        return this.proxyOA_HYS;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_HYS = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_HYS) {
            this.proxyOA_HYS = (OA_HYS)proxyDataObject;
        }

    }

}