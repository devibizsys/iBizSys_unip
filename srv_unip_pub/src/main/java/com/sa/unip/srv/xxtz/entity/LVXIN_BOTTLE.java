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
 * 实体[LVXIN_BOTTLE] 数据对象
 */
public class LVXIN_BOTTLE extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_BOTTLE.class);
    /**
     *   实体属性标识[漂流瓶标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[瓶子的抛出者]
     */
    public final static String FIELD_SENDER = "SENDER";
    /**
     *   实体属性标识[瓶子拾到者]
     */
    public final static String FIELD_RECEIVER = "RECEIVER";
    /**
     *   实体属性标识[瓶子内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[地区]
     */
    public final static String FIELD_REGION = "REGION";
    /**
     *   实体属性标识[语音长度（秒）]
     */
    public final static String FIELD_LENGTH = "LENGTH";
    /**
     *   实体属性标识[类型]
     */
    public final static String FIELD_TYPE = "TYPE";
    /**
     *   实体属性标识[状态]
     */
    public final static String FIELD_STATUS = "STATUS";
    /**
     *   实体属性标识[抛出时间]
     */
    public final static String FIELD_TIMESTAMP = "TIMESTAMP";

    private final static int INDEX_GID = 0;
    private final static int INDEX_SENDER = 1;
    private final static int INDEX_RECEIVER = 2;
    private final static int INDEX_CONTENT = 3;
    private final static int INDEX_REGION = 4;
    private final static int INDEX_LENGTH = 5;
    private final static int INDEX_TYPE = 6;
    private final static int INDEX_STATUS = 7;
    private final static int INDEX_TIMESTAMP = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_SENDER, INDEX_SENDER);
        fieldIndexMap.put( FIELD_RECEIVER, INDEX_RECEIVER);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_REGION, INDEX_REGION);
        fieldIndexMap.put( FIELD_LENGTH, INDEX_LENGTH);
        fieldIndexMap.put( FIELD_TYPE, INDEX_TYPE);
        fieldIndexMap.put( FIELD_STATUS, INDEX_STATUS);
        fieldIndexMap.put( FIELD_TIMESTAMP, INDEX_TIMESTAMP);
    }

    private LVXIN_BOTTLE proxyLVXIN_BOTTLE = null;

    public LVXIN_BOTTLE() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean senderDirtyFlag = false;
    private boolean receiverDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean regionDirtyFlag = false;
    private boolean lengthDirtyFlag = false;
    private boolean typeDirtyFlag = false;
    private boolean statusDirtyFlag = false;
    private boolean timestampDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="sender")
    private String sender;
    @Column(name="receiver")
    private String receiver;
    @Column(name="content")
    private String content;
    @Column(name="region")
    private String region;
    @Column(name="length")
    private String length;
    @Column(name="type")
    private String type;
    @Column(name="status")
    private String status;
    @Column(name="timestamp")
    private String timestamp;


    /**
     *  设置属性值[漂流瓶标识]
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
     *  获取属性值[漂流瓶标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[漂流瓶标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[漂流瓶标识]
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
     *  设置属性值[瓶子的抛出者]
     *  @param sender
     */
    public void setSender(String sender) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSender(sender);
            return;
        }
        if(sender!=null) {
            sender = StringHelper.trimRight(sender);
            if(sender.length()==0) {
                sender = null;
            }
        }
        this.sender =  sender;
        this.senderDirtyFlag  = true;
    }

    /**
     *  获取属性值[瓶子的抛出者]
     */
    public String getSender() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSender();
        }
        return this.sender;
    }

    /**
     *  获取属性值[瓶子的抛出者]是否修改
     */
    public boolean isSenderDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSenderDirty();
        }
        return this.senderDirtyFlag;
    }

    /**
     *  重置属性值[瓶子的抛出者]
     */
    public void resetSender() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSender();
            return;
        }

        this.senderDirtyFlag = false;
        this.sender = null;
    }
    /**
     *  设置属性值[瓶子拾到者]
     *  @param receiver
     */
    public void setReceiver(String receiver) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReceiver(receiver);
            return;
        }
        if(receiver!=null) {
            receiver = StringHelper.trimRight(receiver);
            if(receiver.length()==0) {
                receiver = null;
            }
        }
        this.receiver =  receiver;
        this.receiverDirtyFlag  = true;
    }

    /**
     *  获取属性值[瓶子拾到者]
     */
    public String getReceiver() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReceiver();
        }
        return this.receiver;
    }

    /**
     *  获取属性值[瓶子拾到者]是否修改
     */
    public boolean isReceiverDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReceiverDirty();
        }
        return this.receiverDirtyFlag;
    }

    /**
     *  重置属性值[瓶子拾到者]
     */
    public void resetReceiver() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReceiver();
            return;
        }

        this.receiverDirtyFlag = false;
        this.receiver = null;
    }
    /**
     *  设置属性值[瓶子内容]
     *  @param content
     */
    public void setCONTENT(String content) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCONTENT(content);
            return;
        }
        if(content!=null) {
            content = StringHelper.trimRight(content);
            if(content.length()==0) {
                content = null;
            }
        }
        this.content =  content;
        this.contentDirtyFlag  = true;
    }

    /**
     *  获取属性值[瓶子内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[瓶子内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[瓶子内容]
     */
    public void resetCONTENT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCONTENT();
            return;
        }

        this.contentDirtyFlag = false;
        this.content = null;
    }
    /**
     *  设置属性值[地区]
     *  @param region
     */
    public void setRegion(String region) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRegion(region);
            return;
        }
        if(region!=null) {
            region = StringHelper.trimRight(region);
            if(region.length()==0) {
                region = null;
            }
        }
        this.region =  region;
        this.regionDirtyFlag  = true;
    }

    /**
     *  获取属性值[地区]
     */
    public String getRegion() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRegion();
        }
        return this.region;
    }

    /**
     *  获取属性值[地区]是否修改
     */
    public boolean isRegionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRegionDirty();
        }
        return this.regionDirtyFlag;
    }

    /**
     *  重置属性值[地区]
     */
    public void resetRegion() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRegion();
            return;
        }

        this.regionDirtyFlag = false;
        this.region = null;
    }
    /**
     *  设置属性值[语音长度（秒）]
     *  @param length
     */
    public void setLength(String length) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLength(length);
            return;
        }
        if(length!=null) {
            length = StringHelper.trimRight(length);
            if(length.length()==0) {
                length = null;
            }
        }
        this.length =  length;
        this.lengthDirtyFlag  = true;
    }

    /**
     *  获取属性值[语音长度（秒）]
     */
    public String getLength() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLength();
        }
        return this.length;
    }

    /**
     *  获取属性值[语音长度（秒）]是否修改
     */
    public boolean isLengthDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLengthDirty();
        }
        return this.lengthDirtyFlag;
    }

    /**
     *  重置属性值[语音长度（秒）]
     */
    public void resetLength() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLength();
            return;
        }

        this.lengthDirtyFlag = false;
        this.length = null;
    }
    /**
     *  设置属性值[类型]代码表：com.sa.unip.srv.codelist.PLPLXCodeListModel
     *  @param type
     */
    public void setType(String type) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setType(type);
            return;
        }
        if(type!=null) {
            type = StringHelper.trimRight(type);
            if(type.length()==0) {
                type = null;
            }
        }
        this.type =  type;
        this.typeDirtyFlag  = true;
    }

    /**
     *  获取属性值[类型]代码表：com.sa.unip.srv.codelist.PLPLXCodeListModel
     */
    public String getType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getType();
        }
        return this.type;
    }

    /**
     *  获取属性值[类型]是否修改
     */
    public boolean isTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTypeDirty();
        }
        return this.typeDirtyFlag;
    }

    /**
     *  重置属性值[类型]
     */
    public void resetType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetType();
            return;
        }

        this.typeDirtyFlag = false;
        this.type = null;
    }
    /**
     *  设置属性值[状态]代码表：com.sa.unip.srv.codelist.PLPZTCodeListModel
     *  @param status
     */
    public void setStatus(String status) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setStatus(status);
            return;
        }
        if(status!=null) {
            status = StringHelper.trimRight(status);
            if(status.length()==0) {
                status = null;
            }
        }
        this.status =  status;
        this.statusDirtyFlag  = true;
    }

    /**
     *  获取属性值[状态]代码表：com.sa.unip.srv.codelist.PLPZTCodeListModel
     */
    public String getStatus() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getStatus();
        }
        return this.status;
    }

    /**
     *  获取属性值[状态]是否修改
     */
    public boolean isStatusDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isStatusDirty();
        }
        return this.statusDirtyFlag;
    }

    /**
     *  重置属性值[状态]
     */
    public void resetStatus() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetStatus();
            return;
        }

        this.statusDirtyFlag = false;
        this.status = null;
    }
    /**
     *  设置属性值[抛出时间]
     *  @param timestamp
     */
    public void setTimestamp(String timestamp) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTimestamp(timestamp);
            return;
        }
        if(timestamp!=null) {
            timestamp = StringHelper.trimRight(timestamp);
            if(timestamp.length()==0) {
                timestamp = null;
            }
        }
        this.timestamp =  timestamp;
        this.timestampDirtyFlag  = true;
    }

    /**
     *  获取属性值[抛出时间]
     */
    public String getTimestamp() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTimestamp();
        }
        return this.timestamp;
    }

    /**
     *  获取属性值[抛出时间]是否修改
     */
    public boolean isTimestampDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTimestampDirty();
        }
        return this.timestampDirtyFlag;
    }

    /**
     *  重置属性值[抛出时间]
     */
    public void resetTimestamp() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTimestamp();
            return;
        }

        this.timestampDirtyFlag = false;
        this.timestamp = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_BOTTLE.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_BOTTLE et) {
        et.resetGID();
        et.resetSender();
        et.resetReceiver();
        et.resetCONTENT();
        et.resetRegion();
        et.resetLength();
        et.resetType();
        et.resetStatus();
        et.resetTimestamp();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isGIDDirty()) {
            params.put(FIELD_GID,getGID());
        }
        if(!bDirtyOnly || isSenderDirty()) {
            params.put(FIELD_SENDER,getSender());
        }
        if(!bDirtyOnly || isReceiverDirty()) {
            params.put(FIELD_RECEIVER,getReceiver());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isRegionDirty()) {
            params.put(FIELD_REGION,getRegion());
        }
        if(!bDirtyOnly || isLengthDirty()) {
            params.put(FIELD_LENGTH,getLength());
        }
        if(!bDirtyOnly || isTypeDirty()) {
            params.put(FIELD_TYPE,getType());
        }
        if(!bDirtyOnly || isStatusDirty()) {
            params.put(FIELD_STATUS,getStatus());
        }
        if(!bDirtyOnly || isTimestampDirty()) {
            params.put(FIELD_TIMESTAMP,getTimestamp());
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

        return  LVXIN_BOTTLE.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_BOTTLE et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_SENDER:
            return et.getSender();
        case INDEX_RECEIVER:
            return et.getReceiver();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_REGION:
            return et.getRegion();
        case INDEX_LENGTH:
            return et.getLength();
        case INDEX_TYPE:
            return et.getType();
        case INDEX_STATUS:
            return et.getStatus();
        case INDEX_TIMESTAMP:
            return et.getTimestamp();
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

        LVXIN_BOTTLE.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_BOTTLE et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_SENDER:
            et.setSender(DataObject.getStringValue(obj));
            return ;
        case INDEX_RECEIVER:
            et.setReceiver(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_REGION:
            et.setRegion(DataObject.getStringValue(obj));
            return ;
        case INDEX_LENGTH:
            et.setLength(DataObject.getStringValue(obj));
            return ;
        case INDEX_TYPE:
            et.setType(DataObject.getStringValue(obj));
            return ;
        case INDEX_STATUS:
            et.setStatus(DataObject.getStringValue(obj));
            return ;
        case INDEX_TIMESTAMP:
            et.setTimestamp(DataObject.getStringValue(obj));
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

        return  LVXIN_BOTTLE.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_BOTTLE et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_SENDER:
            return et.getSender()==null;
        case INDEX_RECEIVER:
            return et.getReceiver()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_REGION:
            return et.getRegion()==null;
        case INDEX_LENGTH:
            return et.getLength()==null;
        case INDEX_TYPE:
            return et.getType()==null;
        case INDEX_STATUS:
            return et.getStatus()==null;
        case INDEX_TIMESTAMP:
            return et.getTimestamp()==null;
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

        return  LVXIN_BOTTLE.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_BOTTLE et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_SENDER:
            return et.isSenderDirty();
        case INDEX_RECEIVER:
            return et.isReceiverDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_REGION:
            return et.isRegionDirty();
        case INDEX_LENGTH:
            return et.isLengthDirty();
        case INDEX_TYPE:
            return et.isTypeDirty();
        case INDEX_STATUS:
            return et.isStatusDirty();
        case INDEX_TIMESTAMP:
            return et.isTimestampDirty();
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
    private static  void fillJSONObject(LVXIN_BOTTLE et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getSender()!=null) {
            JSONObjectHelper.put(json,"sender",getJSONValue(et.getSender()),false);
        }
        if(bIncEmpty||et.getReceiver()!=null) {
            JSONObjectHelper.put(json,"receiver",getJSONValue(et.getReceiver()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getRegion()!=null) {
            JSONObjectHelper.put(json,"region",getJSONValue(et.getRegion()),false);
        }
        if(bIncEmpty||et.getLength()!=null) {
            JSONObjectHelper.put(json,"length",getJSONValue(et.getLength()),false);
        }
        if(bIncEmpty||et.getType()!=null) {
            JSONObjectHelper.put(json,"type",getJSONValue(et.getType()),false);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            JSONObjectHelper.put(json,"status",getJSONValue(et.getStatus()),false);
        }
        if(bIncEmpty||et.getTimestamp()!=null) {
            JSONObjectHelper.put(json,"timestamp",getJSONValue(et.getTimestamp()),false);
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
    private static void fillXmlNode(LVXIN_BOTTLE et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSender()!=null) {
            Object obj = et.getSender();
            node.setAttribute("SENDER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReceiver()!=null) {
            Object obj = et.getReceiver();
            node.setAttribute("RECEIVER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRegion()!=null) {
            Object obj = et.getRegion();
            node.setAttribute("REGION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLength()!=null) {
            Object obj = et.getLength();
            node.setAttribute("LENGTH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getType()!=null) {
            Object obj = et.getType();
            node.setAttribute("TYPE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            Object obj = et.getStatus();
            node.setAttribute("STATUS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTimestamp()!=null) {
            Object obj = et.getTimestamp();
            node.setAttribute("TIMESTAMP",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_BOTTLE.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_BOTTLE et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isSenderDirty() && (bIncEmpty||et.getSender()!=null)) {
            dst.set(FIELD_SENDER,et.getSender());
        }
        if(et.isReceiverDirty() && (bIncEmpty||et.getReceiver()!=null)) {
            dst.set(FIELD_RECEIVER,et.getReceiver());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isRegionDirty() && (bIncEmpty||et.getRegion()!=null)) {
            dst.set(FIELD_REGION,et.getRegion());
        }
        if(et.isLengthDirty() && (bIncEmpty||et.getLength()!=null)) {
            dst.set(FIELD_LENGTH,et.getLength());
        }
        if(et.isTypeDirty() && (bIncEmpty||et.getType()!=null)) {
            dst.set(FIELD_TYPE,et.getType());
        }
        if(et.isStatusDirty() && (bIncEmpty||et.getStatus()!=null)) {
            dst.set(FIELD_STATUS,et.getStatus());
        }
        if(et.isTimestampDirty() && (bIncEmpty||et.getTimestamp()!=null)) {
            dst.set(FIELD_TIMESTAMP,et.getTimestamp());
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
        return  LVXIN_BOTTLE.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_BOTTLE et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_SENDER:
            et.resetSender();
            return true;
        case INDEX_RECEIVER:
            et.resetReceiver();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_REGION:
            et.resetRegion();
            return true;
        case INDEX_LENGTH:
            et.resetLength();
            return true;
        case INDEX_TYPE:
            et.resetType();
            return true;
        case INDEX_STATUS:
            et.resetStatus();
            return true;
        case INDEX_TIMESTAMP:
            et.resetTimestamp();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_BOTTLE getProxyEntity() {
        return this.proxyLVXIN_BOTTLE;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_BOTTLE = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_BOTTLE) {
            this.proxyLVXIN_BOTTLE = (LVXIN_BOTTLE)proxyDataObject;
        }

    }

}