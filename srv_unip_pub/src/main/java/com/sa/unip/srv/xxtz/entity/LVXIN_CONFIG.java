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
 * 实体[LVXIN_CONFIG] 数据对象
 */
public class LVXIN_CONFIG extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_CONFIG.class);
    /**
     *   实体属性标识[系统配置标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[配置参数key]
     */
    public final static String FIELD_IKEY = "IKEY";
    /**
     *   实体属性标识[参数值]
     */
    public final static String FIELD_VALUE = "VALUE";
    /**
     *   实体属性标识[参数所属的域]
     */
    public final static String FIELD_DOMIAN = "DOMIAN";
    /**
     *   实体属性标识[参数说明]
     */
    public final static String FIELD_DESCRIPTION = "DESCRIPTION";

    private final static int INDEX_GID = 0;
    private final static int INDEX_IKEY = 1;
    private final static int INDEX_VALUE = 2;
    private final static int INDEX_DOMIAN = 3;
    private final static int INDEX_DESCRIPTION = 4;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_IKEY, INDEX_IKEY);
        fieldIndexMap.put( FIELD_VALUE, INDEX_VALUE);
        fieldIndexMap.put( FIELD_DOMIAN, INDEX_DOMIAN);
        fieldIndexMap.put( FIELD_DESCRIPTION, INDEX_DESCRIPTION);
    }

    private LVXIN_CONFIG proxyLVXIN_CONFIG = null;

    public LVXIN_CONFIG() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean ikeyDirtyFlag = false;
    private boolean valueDirtyFlag = false;
    private boolean domianDirtyFlag = false;
    private boolean descriptionDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="ikey")
    private String ikey;
    @Column(name="value")
    private String value;
    @Column(name="domian")
    private String domian;
    @Column(name="description")
    private String description;


    /**
     *  设置属性值[系统配置标识]
     *  @param gid
     */
    public void setGID(String gid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGID(gid);
            return;
        }
        if(gid!=null) {
            gid = StringHelper.trimRight(gid);
            if(gid.length()==0) {
                gid = null;
            }
        }
        this.gid =  gid;
        this.gidDirtyFlag  = true;
    }

    /**
     *  获取属性值[系统配置标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[系统配置标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[系统配置标识]
     */
    public void resetGID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGID();
            return;
        }

        this.gidDirtyFlag = false;
        this.gid = null;
    }
    /**
     *  设置属性值[配置参数key]
     *  @param ikey
     */
    public void setIkey(String ikey) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIkey(ikey);
            return;
        }
        if(ikey!=null) {
            ikey = StringHelper.trimRight(ikey);
            if(ikey.length()==0) {
                ikey = null;
            }
        }
        this.ikey =  ikey;
        this.ikeyDirtyFlag  = true;
    }

    /**
     *  获取属性值[配置参数key]
     */
    public String getIkey() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIkey();
        }
        return this.ikey;
    }

    /**
     *  获取属性值[配置参数key]是否修改
     */
    public boolean isIkeyDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIkeyDirty();
        }
        return this.ikeyDirtyFlag;
    }

    /**
     *  重置属性值[配置参数key]
     */
    public void resetIkey() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIkey();
            return;
        }

        this.ikeyDirtyFlag = false;
        this.ikey = null;
    }
    /**
     *  设置属性值[参数值]
     *  @param value
     */
    public void setValue(String value) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setValue(value);
            return;
        }
        if(value!=null) {
            value = StringHelper.trimRight(value);
            if(value.length()==0) {
                value = null;
            }
        }
        this.value =  value;
        this.valueDirtyFlag  = true;
    }

    /**
     *  获取属性值[参数值]
     */
    public String getValue() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getValue();
        }
        return this.value;
    }

    /**
     *  获取属性值[参数值]是否修改
     */
    public boolean isValueDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isValueDirty();
        }
        return this.valueDirtyFlag;
    }

    /**
     *  重置属性值[参数值]
     */
    public void resetValue() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetValue();
            return;
        }

        this.valueDirtyFlag = false;
        this.value = null;
    }
    /**
     *  设置属性值[参数所属的域]
     *  @param domian
     */
    public void setDomian(String domian) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDomian(domian);
            return;
        }
        if(domian!=null) {
            domian = StringHelper.trimRight(domian);
            if(domian.length()==0) {
                domian = null;
            }
        }
        this.domian =  domian;
        this.domianDirtyFlag  = true;
    }

    /**
     *  获取属性值[参数所属的域]
     */
    public String getDomian() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDomian();
        }
        return this.domian;
    }

    /**
     *  获取属性值[参数所属的域]是否修改
     */
    public boolean isDomianDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDomianDirty();
        }
        return this.domianDirtyFlag;
    }

    /**
     *  重置属性值[参数所属的域]
     */
    public void resetDomian() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDomian();
            return;
        }

        this.domianDirtyFlag = false;
        this.domian = null;
    }
    /**
     *  设置属性值[参数说明]
     *  @param description
     */
    public void setDescription(String description) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDescription(description);
            return;
        }
        if(description!=null) {
            description = StringHelper.trimRight(description);
            if(description.length()==0) {
                description = null;
            }
        }
        this.description =  description;
        this.descriptionDirtyFlag  = true;
    }

    /**
     *  获取属性值[参数说明]
     */
    public String getDescription() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDescription();
        }
        return this.description;
    }

    /**
     *  获取属性值[参数说明]是否修改
     */
    public boolean isDescriptionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDescriptionDirty();
        }
        return this.descriptionDirtyFlag;
    }

    /**
     *  重置属性值[参数说明]
     */
    public void resetDescription() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDescription();
            return;
        }

        this.descriptionDirtyFlag = false;
        this.description = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_CONFIG.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_CONFIG et) {
        et.resetGID();
        et.resetIkey();
        et.resetValue();
        et.resetDomian();
        et.resetDescription();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isGIDDirty()) {
            params.put(FIELD_GID,getGID());
        }
        if(!bDirtyOnly || isIkeyDirty()) {
            params.put(FIELD_IKEY,getIkey());
        }
        if(!bDirtyOnly || isValueDirty()) {
            params.put(FIELD_VALUE,getValue());
        }
        if(!bDirtyOnly || isDomianDirty()) {
            params.put(FIELD_DOMIAN,getDomian());
        }
        if(!bDirtyOnly || isDescriptionDirty()) {
            params.put(FIELD_DESCRIPTION,getDescription());
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

        return  LVXIN_CONFIG.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_CONFIG et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_IKEY:
            return et.getIkey();
        case INDEX_VALUE:
            return et.getValue();
        case INDEX_DOMIAN:
            return et.getDomian();
        case INDEX_DESCRIPTION:
            return et.getDescription();
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

        LVXIN_CONFIG.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_CONFIG et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_IKEY:
            et.setIkey(DataObject.getStringValue(obj));
            return ;
        case INDEX_VALUE:
            et.setValue(DataObject.getStringValue(obj));
            return ;
        case INDEX_DOMIAN:
            et.setDomian(DataObject.getStringValue(obj));
            return ;
        case INDEX_DESCRIPTION:
            et.setDescription(DataObject.getStringValue(obj));
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

        return  LVXIN_CONFIG.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_CONFIG et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_IKEY:
            return et.getIkey()==null;
        case INDEX_VALUE:
            return et.getValue()==null;
        case INDEX_DOMIAN:
            return et.getDomian()==null;
        case INDEX_DESCRIPTION:
            return et.getDescription()==null;
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

        return  LVXIN_CONFIG.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_CONFIG et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_IKEY:
            return et.isIkeyDirty();
        case INDEX_VALUE:
            return et.isValueDirty();
        case INDEX_DOMIAN:
            return et.isDomianDirty();
        case INDEX_DESCRIPTION:
            return et.isDescriptionDirty();
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
    private static  void fillJSONObject(LVXIN_CONFIG et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getIkey()!=null) {
            JSONObjectHelper.put(json,"ikey",getJSONValue(et.getIkey()),false);
        }
        if(bIncEmpty||et.getValue()!=null) {
            JSONObjectHelper.put(json,"value",getJSONValue(et.getValue()),false);
        }
        if(bIncEmpty||et.getDomian()!=null) {
            JSONObjectHelper.put(json,"domian",getJSONValue(et.getDomian()),false);
        }
        if(bIncEmpty||et.getDescription()!=null) {
            JSONObjectHelper.put(json,"description",getJSONValue(et.getDescription()),false);
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
    private static void fillXmlNode(LVXIN_CONFIG et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getIkey()!=null) {
            Object obj = et.getIkey();
            node.setAttribute("IKEY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getValue()!=null) {
            Object obj = et.getValue();
            node.setAttribute("VALUE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDomian()!=null) {
            Object obj = et.getDomian();
            node.setAttribute("DOMIAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDescription()!=null) {
            Object obj = et.getDescription();
            node.setAttribute("DESCRIPTION",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_CONFIG.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_CONFIG et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isIkeyDirty() && (bIncEmpty||et.getIkey()!=null)) {
            dst.set(FIELD_IKEY,et.getIkey());
        }
        if(et.isValueDirty() && (bIncEmpty||et.getValue()!=null)) {
            dst.set(FIELD_VALUE,et.getValue());
        }
        if(et.isDomianDirty() && (bIncEmpty||et.getDomian()!=null)) {
            dst.set(FIELD_DOMIAN,et.getDomian());
        }
        if(et.isDescriptionDirty() && (bIncEmpty||et.getDescription()!=null)) {
            dst.set(FIELD_DESCRIPTION,et.getDescription());
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
        return  LVXIN_CONFIG.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_CONFIG et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_IKEY:
            et.resetIkey();
            return true;
        case INDEX_VALUE:
            et.resetValue();
            return true;
        case INDEX_DOMIAN:
            et.resetDomian();
            return true;
        case INDEX_DESCRIPTION:
            et.resetDescription();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_CONFIG getProxyEntity() {
        return this.proxyLVXIN_CONFIG;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_CONFIG = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_CONFIG) {
            this.proxyLVXIN_CONFIG = (LVXIN_CONFIG)proxyDataObject;
        }

    }

}