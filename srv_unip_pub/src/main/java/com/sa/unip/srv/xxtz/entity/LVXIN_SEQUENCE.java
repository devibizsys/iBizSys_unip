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
 * 实体[LVXIN_SEQUENCE] 数据对象
 */
public class LVXIN_SEQUENCE extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_SEQUENCE.class);
    /**
     *   实体属性标识[名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[值]
     */
    public final static String FIELD_VALUE = "VALUE";

    private final static int INDEX_NAME = 0;
    private final static int INDEX_VALUE = 1;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_VALUE, INDEX_VALUE);
    }

    private LVXIN_SEQUENCE proxyLVXIN_SEQUENCE = null;

    public LVXIN_SEQUENCE() {
        super();
    }
    private boolean nameDirtyFlag = false;
    private boolean valueDirtyFlag = false;

    @Column(name="name")
    private String name;
    @Column(name="value")
    private String value;


    /**
     *  设置属性值[名称]
     *  @param name
     */
    public void setNAME(String name) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setNAME(name);
            return;
        }
        if(name!=null) {
            name = StringHelper.trimRight(name);
            if(name.length()==0) {
                name = null;
            }
        }
        this.name =  name;
        this.nameDirtyFlag  = true;
    }

    /**
     *  获取属性值[名称]
     */
    public String getNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNAME();
        }
        return this.name;
    }

    /**
     *  获取属性值[名称]是否修改
     */
    public boolean isNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNAMEDirty();
        }
        return this.nameDirtyFlag;
    }

    /**
     *  重置属性值[名称]
     */
    public void resetNAME() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetNAME();
            return;
        }

        this.nameDirtyFlag = false;
        this.name = null;
    }
    /**
     *  设置属性值[值]
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
     *  获取属性值[值]
     */
    public String getValue() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getValue();
        }
        return this.value;
    }

    /**
     *  获取属性值[值]是否修改
     */
    public boolean isValueDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isValueDirty();
        }
        return this.valueDirtyFlag;
    }

    /**
     *  重置属性值[值]
     */
    public void resetValue() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetValue();
            return;
        }

        this.valueDirtyFlag = false;
        this.value = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_SEQUENCE.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_SEQUENCE et) {
        et.resetNAME();
        et.resetValue();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isNAMEDirty()) {
            params.put(FIELD_NAME,getNAME());
        }
        if(!bDirtyOnly || isValueDirty()) {
            params.put(FIELD_VALUE,getValue());
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

        return  LVXIN_SEQUENCE.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_SEQUENCE et,int index) throws Exception {

        switch(index) {
        case INDEX_NAME:
            return et.getNAME();
        case INDEX_VALUE:
            return et.getValue();
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

        LVXIN_SEQUENCE.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_SEQUENCE et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_NAME:
            et.setNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_VALUE:
            et.setValue(DataObject.getStringValue(obj));
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

        return  LVXIN_SEQUENCE.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_SEQUENCE et,int index) throws Exception {

        switch(index) {
        case INDEX_NAME:
            return et.getNAME()==null;
        case INDEX_VALUE:
            return et.getValue()==null;
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

        return  LVXIN_SEQUENCE.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_SEQUENCE et,int index) throws Exception {

        switch(index) {
        case INDEX_NAME:
            return et.isNAMEDirty();
        case INDEX_VALUE:
            return et.isValueDirty();
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
    private static  void fillJSONObject(LVXIN_SEQUENCE et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getNAME()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getNAME()),false);
        }
        if(bIncEmpty||et.getValue()!=null) {
            JSONObjectHelper.put(json,"value",getJSONValue(et.getValue()),false);
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
    private static void fillXmlNode(LVXIN_SEQUENCE et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getNAME()!=null) {
            Object obj = et.getNAME();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getValue()!=null) {
            Object obj = et.getValue();
            node.setAttribute("VALUE",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_SEQUENCE.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_SEQUENCE et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isNAMEDirty() && (bIncEmpty||et.getNAME()!=null)) {
            dst.set(FIELD_NAME,et.getNAME());
        }
        if(et.isValueDirty() && (bIncEmpty||et.getValue()!=null)) {
            dst.set(FIELD_VALUE,et.getValue());
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
        return  LVXIN_SEQUENCE.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_SEQUENCE et,int index) throws Exception {
        switch(index) {
        case INDEX_NAME:
            et.resetNAME();
            return true;
        case INDEX_VALUE:
            et.resetValue();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_SEQUENCE getProxyEntity() {
        return this.proxyLVXIN_SEQUENCE;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_SEQUENCE = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_SEQUENCE) {
            this.proxyLVXIN_SEQUENCE = (LVXIN_SEQUENCE)proxyDataObject;
        }

    }

}