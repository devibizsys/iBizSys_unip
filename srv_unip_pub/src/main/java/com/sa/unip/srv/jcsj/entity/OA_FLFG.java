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
 * 实体[OA_FLFG] 数据对象
 */
public class OA_FLFG extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_FLFG.class);
    /**
     *   实体属性标识[法律法规标识]
     */
    public final static String FIELD_OA_FLFGID = "OA_FLFGID";
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
     *   实体属性标识[标题]
     */
    public final static String FIELD_OA_FLFGNAME = "OA_FLFGNAME";
    /**
     *   实体属性标识[摘要]
     */
    public final static String FIELD_ZY = "ZY";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";

    private final static int INDEX_OA_FLFGID = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_UPDATEMAN = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_CREATEDATE = 4;
    private final static int INDEX_OA_FLFGNAME = 5;
    private final static int INDEX_ZY = 6;
    private final static int INDEX_MEMO = 7;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_FLFGID, INDEX_OA_FLFGID);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_OA_FLFGNAME, INDEX_OA_FLFGNAME);
        fieldIndexMap.put( FIELD_ZY, INDEX_ZY);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
    }

    private OA_FLFG proxyOA_FLFG = null;

    public OA_FLFG() {
        super();
    }
    private boolean oa_flfgidDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean oa_flfgnameDirtyFlag = false;
    private boolean zyDirtyFlag = false;
    private boolean memoDirtyFlag = false;

    @Column(name="oa_flfgid")
    private String oa_flfgid;
    @Column(name="createman")
    private String createman;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="oa_flfgname")
    private String oa_flfgname;
    @Column(name="zy")
    private String zy;
    @Column(name="memo")
    private String memo;


    /**
     *  设置属性值[法律法规标识]
     *  @param oa_flfgid
     */
    public void setOA_FLFGId(String oa_flfgid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_FLFGId(oa_flfgid);
            return;
        }
        if(oa_flfgid!=null) {
            oa_flfgid = StringHelper.trimRight(oa_flfgid);
            if(oa_flfgid.length()==0) {
                oa_flfgid = null;
            }
        }
        this.oa_flfgid =  oa_flfgid;
        this.oa_flfgidDirtyFlag  = true;
    }

    /**
     *  获取属性值[法律法规标识]
     */
    public String getOA_FLFGId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_FLFGId();
        }
        return this.oa_flfgid;
    }

    /**
     *  获取属性值[法律法规标识]是否修改
     */
    public boolean isOA_FLFGIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_FLFGIdDirty();
        }
        return this.oa_flfgidDirtyFlag;
    }

    /**
     *  重置属性值[法律法规标识]
     */
    public void resetOA_FLFGId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_FLFGId();
            return;
        }

        this.oa_flfgidDirtyFlag = false;
        this.oa_flfgid = null;
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
     *  设置属性值[标题]
     *  @param oa_flfgname
     */
    public void setOA_FLFGName(String oa_flfgname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_FLFGName(oa_flfgname);
            return;
        }
        if(oa_flfgname!=null) {
            oa_flfgname = StringHelper.trimRight(oa_flfgname);
            if(oa_flfgname.length()==0) {
                oa_flfgname = null;
            }
        }
        this.oa_flfgname =  oa_flfgname;
        this.oa_flfgnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[标题]
     */
    public String getOA_FLFGName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_FLFGName();
        }
        return this.oa_flfgname;
    }

    /**
     *  获取属性值[标题]是否修改
     */
    public boolean isOA_FLFGNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_FLFGNameDirty();
        }
        return this.oa_flfgnameDirtyFlag;
    }

    /**
     *  重置属性值[标题]
     */
    public void resetOA_FLFGName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_FLFGName();
            return;
        }

        this.oa_flfgnameDirtyFlag = false;
        this.oa_flfgname = null;
    }
    /**
     *  设置属性值[摘要]
     *  @param zy
     */
    public void setZy(String zy) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZy(zy);
            return;
        }
        if(zy!=null) {
            zy = StringHelper.trimRight(zy);
            if(zy.length()==0) {
                zy = null;
            }
        }
        this.zy =  zy;
        this.zyDirtyFlag  = true;
    }

    /**
     *  获取属性值[摘要]
     */
    public String getZy() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZy();
        }
        return this.zy;
    }

    /**
     *  获取属性值[摘要]是否修改
     */
    public boolean isZyDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZyDirty();
        }
        return this.zyDirtyFlag;
    }

    /**
     *  重置属性值[摘要]
     */
    public void resetZy() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZy();
            return;
        }

        this.zyDirtyFlag = false;
        this.zy = null;
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

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_FLFG.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_FLFG et) {
        et.resetOA_FLFGId();
        et.resetCreateMan();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetOA_FLFGName();
        et.resetZy();
        et.resetMemo();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_FLFGIdDirty()) {
            params.put(FIELD_OA_FLFGID,getOA_FLFGId());
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
        if(!bDirtyOnly || isOA_FLFGNameDirty()) {
            params.put(FIELD_OA_FLFGNAME,getOA_FLFGName());
        }
        if(!bDirtyOnly || isZyDirty()) {
            params.put(FIELD_ZY,getZy());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
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

        return  OA_FLFG.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_FLFG et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_FLFGID:
            return et.getOA_FLFGId();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_OA_FLFGNAME:
            return et.getOA_FLFGName();
        case INDEX_ZY:
            return et.getZy();
        case INDEX_MEMO:
            return et.getMemo();
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

        OA_FLFG.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_FLFG et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_FLFGID:
            et.setOA_FLFGId(DataObject.getStringValue(obj));
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
        case INDEX_OA_FLFGNAME:
            et.setOA_FLFGName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZY:
            et.setZy(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
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

        return  OA_FLFG.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_FLFG et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_FLFGID:
            return et.getOA_FLFGId()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_OA_FLFGNAME:
            return et.getOA_FLFGName()==null;
        case INDEX_ZY:
            return et.getZy()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
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

        return  OA_FLFG.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_FLFG et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_FLFGID:
            return et.isOA_FLFGIdDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_OA_FLFGNAME:
            return et.isOA_FLFGNameDirty();
        case INDEX_ZY:
            return et.isZyDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
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
    private static  void fillJSONObject(OA_FLFG et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_FLFGId()!=null) {
            JSONObjectHelper.put(json,"oa_flfgid",getJSONValue(et.getOA_FLFGId()),false);
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
        if(bIncEmpty||et.getOA_FLFGName()!=null) {
            JSONObjectHelper.put(json,"oa_flfgname",getJSONValue(et.getOA_FLFGName()),false);
        }
        if(bIncEmpty||et.getZy()!=null) {
            JSONObjectHelper.put(json,"zy",getJSONValue(et.getZy()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
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
    private static void fillXmlNode(OA_FLFG et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_FLFGId()!=null) {
            Object obj = et.getOA_FLFGId();
            node.setAttribute("OA_FLFGID",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getOA_FLFGName()!=null) {
            Object obj = et.getOA_FLFGName();
            node.setAttribute("OA_FLFGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZy()!=null) {
            Object obj = et.getZy();
            node.setAttribute("ZY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_FLFG.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_FLFG et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_FLFGIdDirty() && (bIncEmpty||et.getOA_FLFGId()!=null)) {
            dst.set(FIELD_OA_FLFGID,et.getOA_FLFGId());
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
        if(et.isOA_FLFGNameDirty() && (bIncEmpty||et.getOA_FLFGName()!=null)) {
            dst.set(FIELD_OA_FLFGNAME,et.getOA_FLFGName());
        }
        if(et.isZyDirty() && (bIncEmpty||et.getZy()!=null)) {
            dst.set(FIELD_ZY,et.getZy());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
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
        return  OA_FLFG.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_FLFG et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_FLFGID:
            et.resetOA_FLFGId();
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
        case INDEX_OA_FLFGNAME:
            et.resetOA_FLFGName();
            return true;
        case INDEX_ZY:
            et.resetZy();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private OA_FLFG getProxyEntity() {
        return this.proxyOA_FLFG;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_FLFG = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_FLFG) {
            this.proxyOA_FLFG = (OA_FLFG)proxyDataObject;
        }

    }

}