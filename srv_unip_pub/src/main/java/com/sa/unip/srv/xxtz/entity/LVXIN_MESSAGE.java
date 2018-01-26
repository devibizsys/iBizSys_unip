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
 * 实体[LVXIN_MESSAGE] 数据对象
 */
public class LVXIN_MESSAGE extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_MESSAGE.class);
    /**
     *   实体属性标识[消息记录标识]
     */
    public final static String FIELD_MID = "MID";
    /**
     *   实体属性标识[标题]
     */
    public final static String FIELD_TITLE = "TITLE";
    /**
     *   实体属性标识[消息发送者账号]
     */
    public final static String FIELD_SENDER = "SENDER";
    /**
     *   实体属性标识[消息接收者账号]
     */
    public final static String FIELD_RECEIVER = "RECEIVER";
    /**
     *   实体属性标识[内容格式]
     */
    public final static String FIELD_FOMART = "FOMART";
    /**
     *   实体属性标识[消息内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[消息类型]
     */
    public final static String FIELD_ACTION = "ACTION";
    /**
     *   实体属性标识[消息状态]
     */
    public final static String FIELD_STATUS = "STATUS";
    /**
     *   实体属性标识[消息产生时间，13位时间戳]
     */
    public final static String FIELD_TIMESTAMP = "TIMESTAMP";

    private final static int INDEX_MID = 0;
    private final static int INDEX_TITLE = 1;
    private final static int INDEX_SENDER = 2;
    private final static int INDEX_RECEIVER = 3;
    private final static int INDEX_FOMART = 4;
    private final static int INDEX_CONTENT = 5;
    private final static int INDEX_ACTION = 6;
    private final static int INDEX_STATUS = 7;
    private final static int INDEX_TIMESTAMP = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_MID, INDEX_MID);
        fieldIndexMap.put( FIELD_TITLE, INDEX_TITLE);
        fieldIndexMap.put( FIELD_SENDER, INDEX_SENDER);
        fieldIndexMap.put( FIELD_RECEIVER, INDEX_RECEIVER);
        fieldIndexMap.put( FIELD_FOMART, INDEX_FOMART);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_ACTION, INDEX_ACTION);
        fieldIndexMap.put( FIELD_STATUS, INDEX_STATUS);
        fieldIndexMap.put( FIELD_TIMESTAMP, INDEX_TIMESTAMP);
    }

    private LVXIN_MESSAGE proxyLVXIN_MESSAGE = null;

    public LVXIN_MESSAGE() {
        super();
    }
    private boolean midDirtyFlag = false;
    private boolean titleDirtyFlag = false;
    private boolean senderDirtyFlag = false;
    private boolean receiverDirtyFlag = false;
    private boolean fomartDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean actionDirtyFlag = false;
    private boolean statusDirtyFlag = false;
    private boolean timestampDirtyFlag = false;

    @Column(name="mid")
    private String mid;
    @Column(name="title")
    private String title;
    @Column(name="sender")
    private String sender;
    @Column(name="receiver")
    private String receiver;
    @Column(name="fomart")
    private String fomart;
    @Column(name="content")
    private String content;
    @Column(name="action")
    private String action;
    @Column(name="status")
    private String status;
    @Column(name="timestamp")
    private String timestamp;


    /**
     *  设置属性值[消息记录标识]
     *  @param mid
     */
    public void setMid(String mid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMid(mid);
            return;
        }
        if(mid!=null) {
            mid = StringHelper.trimRight(mid);
            if(mid.length()==0) {
                mid = null;
            }
        }
        this.mid =  mid;
        this.midDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息记录标识]
     */
    public String getMid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMid();
        }
        return this.mid;
    }

    /**
     *  获取属性值[消息记录标识]是否修改
     */
    public boolean isMidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMidDirty();
        }
        return this.midDirtyFlag;
    }

    /**
     *  重置属性值[消息记录标识]
     */
    public void resetMid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMid();
            return;
        }

        this.midDirtyFlag = false;
        this.mid = null;
    }
    /**
     *  设置属性值[标题]
     *  @param title
     */
    public void setTITLE(String title) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTITLE(title);
            return;
        }
        if(title!=null) {
            title = StringHelper.trimRight(title);
            if(title.length()==0) {
                title = null;
            }
        }
        this.title =  title;
        this.titleDirtyFlag  = true;
    }

    /**
     *  获取属性值[标题]
     */
    public String getTITLE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTITLE();
        }
        return this.title;
    }

    /**
     *  获取属性值[标题]是否修改
     */
    public boolean isTITLEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTITLEDirty();
        }
        return this.titleDirtyFlag;
    }

    /**
     *  重置属性值[标题]
     */
    public void resetTITLE() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTITLE();
            return;
        }

        this.titleDirtyFlag = false;
        this.title = null;
    }
    /**
     *  设置属性值[消息发送者账号]
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
     *  获取属性值[消息发送者账号]
     */
    public String getSender() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSender();
        }
        return this.sender;
    }

    /**
     *  获取属性值[消息发送者账号]是否修改
     */
    public boolean isSenderDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSenderDirty();
        }
        return this.senderDirtyFlag;
    }

    /**
     *  重置属性值[消息发送者账号]
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
     *  设置属性值[消息接收者账号]
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
     *  获取属性值[消息接收者账号]
     */
    public String getReceiver() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReceiver();
        }
        return this.receiver;
    }

    /**
     *  获取属性值[消息接收者账号]是否修改
     */
    public boolean isReceiverDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReceiverDirty();
        }
        return this.receiverDirtyFlag;
    }

    /**
     *  重置属性值[消息接收者账号]
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
     *  设置属性值[内容格式]
     *  @param fomart
     */
    public void setFomart(String fomart) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFomart(fomart);
            return;
        }
        if(fomart!=null) {
            fomart = StringHelper.trimRight(fomart);
            if(fomart.length()==0) {
                fomart = null;
            }
        }
        this.fomart =  fomart;
        this.fomartDirtyFlag  = true;
    }

    /**
     *  获取属性值[内容格式]
     */
    public String getFomart() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFomart();
        }
        return this.fomart;
    }

    /**
     *  获取属性值[内容格式]是否修改
     */
    public boolean isFomartDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFomartDirty();
        }
        return this.fomartDirtyFlag;
    }

    /**
     *  重置属性值[内容格式]
     */
    public void resetFomart() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFomart();
            return;
        }

        this.fomartDirtyFlag = false;
        this.fomart = null;
    }
    /**
     *  设置属性值[消息内容]
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
     *  获取属性值[消息内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[消息内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[消息内容]
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
     *  设置属性值[消息类型]
     *  @param action
     */
    public void setAction(String action) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setAction(action);
            return;
        }
        if(action!=null) {
            action = StringHelper.trimRight(action);
            if(action.length()==0) {
                action = null;
            }
        }
        this.action =  action;
        this.actionDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息类型]
     */
    public String getAction() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAction();
        }
        return this.action;
    }

    /**
     *  获取属性值[消息类型]是否修改
     */
    public boolean isActionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isActionDirty();
        }
        return this.actionDirtyFlag;
    }

    /**
     *  重置属性值[消息类型]
     */
    public void resetAction() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetAction();
            return;
        }

        this.actionDirtyFlag = false;
        this.action = null;
    }
    /**
     *  设置属性值[消息状态]代码表：com.sa.unip.srv.codelist.XXZTCodeListModel
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
     *  获取属性值[消息状态]代码表：com.sa.unip.srv.codelist.XXZTCodeListModel
     */
    public String getStatus() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getStatus();
        }
        return this.status;
    }

    /**
     *  获取属性值[消息状态]是否修改
     */
    public boolean isStatusDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isStatusDirty();
        }
        return this.statusDirtyFlag;
    }

    /**
     *  重置属性值[消息状态]
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
     *  设置属性值[消息产生时间，13位时间戳]
     *  @param timestamp
     */
    public void setTIMESTAMP(String timestamp) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTIMESTAMP(timestamp);
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
     *  获取属性值[消息产生时间，13位时间戳]
     */
    public String getTIMESTAMP() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTIMESTAMP();
        }
        return this.timestamp;
    }

    /**
     *  获取属性值[消息产生时间，13位时间戳]是否修改
     */
    public boolean isTIMESTAMPDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTIMESTAMPDirty();
        }
        return this.timestampDirtyFlag;
    }

    /**
     *  重置属性值[消息产生时间，13位时间戳]
     */
    public void resetTIMESTAMP() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTIMESTAMP();
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
        LVXIN_MESSAGE.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_MESSAGE et) {
        et.resetMid();
        et.resetTITLE();
        et.resetSender();
        et.resetReceiver();
        et.resetFomart();
        et.resetCONTENT();
        et.resetAction();
        et.resetStatus();
        et.resetTIMESTAMP();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isMidDirty()) {
            params.put(FIELD_MID,getMid());
        }
        if(!bDirtyOnly || isTITLEDirty()) {
            params.put(FIELD_TITLE,getTITLE());
        }
        if(!bDirtyOnly || isSenderDirty()) {
            params.put(FIELD_SENDER,getSender());
        }
        if(!bDirtyOnly || isReceiverDirty()) {
            params.put(FIELD_RECEIVER,getReceiver());
        }
        if(!bDirtyOnly || isFomartDirty()) {
            params.put(FIELD_FOMART,getFomart());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isActionDirty()) {
            params.put(FIELD_ACTION,getAction());
        }
        if(!bDirtyOnly || isStatusDirty()) {
            params.put(FIELD_STATUS,getStatus());
        }
        if(!bDirtyOnly || isTIMESTAMPDirty()) {
            params.put(FIELD_TIMESTAMP,getTIMESTAMP());
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

        return  LVXIN_MESSAGE.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_MESSAGE et,int index) throws Exception {

        switch(index) {
        case INDEX_MID:
            return et.getMid();
        case INDEX_TITLE:
            return et.getTITLE();
        case INDEX_SENDER:
            return et.getSender();
        case INDEX_RECEIVER:
            return et.getReceiver();
        case INDEX_FOMART:
            return et.getFomart();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_ACTION:
            return et.getAction();
        case INDEX_STATUS:
            return et.getStatus();
        case INDEX_TIMESTAMP:
            return et.getTIMESTAMP();
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

        LVXIN_MESSAGE.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_MESSAGE et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_MID:
            et.setMid(DataObject.getStringValue(obj));
            return ;
        case INDEX_TITLE:
            et.setTITLE(DataObject.getStringValue(obj));
            return ;
        case INDEX_SENDER:
            et.setSender(DataObject.getStringValue(obj));
            return ;
        case INDEX_RECEIVER:
            et.setReceiver(DataObject.getStringValue(obj));
            return ;
        case INDEX_FOMART:
            et.setFomart(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_ACTION:
            et.setAction(DataObject.getStringValue(obj));
            return ;
        case INDEX_STATUS:
            et.setStatus(DataObject.getStringValue(obj));
            return ;
        case INDEX_TIMESTAMP:
            et.setTIMESTAMP(DataObject.getStringValue(obj));
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

        return  LVXIN_MESSAGE.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_MESSAGE et,int index) throws Exception {

        switch(index) {
        case INDEX_MID:
            return et.getMid()==null;
        case INDEX_TITLE:
            return et.getTITLE()==null;
        case INDEX_SENDER:
            return et.getSender()==null;
        case INDEX_RECEIVER:
            return et.getReceiver()==null;
        case INDEX_FOMART:
            return et.getFomart()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_ACTION:
            return et.getAction()==null;
        case INDEX_STATUS:
            return et.getStatus()==null;
        case INDEX_TIMESTAMP:
            return et.getTIMESTAMP()==null;
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

        return  LVXIN_MESSAGE.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_MESSAGE et,int index) throws Exception {

        switch(index) {
        case INDEX_MID:
            return et.isMidDirty();
        case INDEX_TITLE:
            return et.isTITLEDirty();
        case INDEX_SENDER:
            return et.isSenderDirty();
        case INDEX_RECEIVER:
            return et.isReceiverDirty();
        case INDEX_FOMART:
            return et.isFomartDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_ACTION:
            return et.isActionDirty();
        case INDEX_STATUS:
            return et.isStatusDirty();
        case INDEX_TIMESTAMP:
            return et.isTIMESTAMPDirty();
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
    private static  void fillJSONObject(LVXIN_MESSAGE et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getMid()!=null) {
            JSONObjectHelper.put(json,"mid",getJSONValue(et.getMid()),false);
        }
        if(bIncEmpty||et.getTITLE()!=null) {
            JSONObjectHelper.put(json,"title",getJSONValue(et.getTITLE()),false);
        }
        if(bIncEmpty||et.getSender()!=null) {
            JSONObjectHelper.put(json,"sender",getJSONValue(et.getSender()),false);
        }
        if(bIncEmpty||et.getReceiver()!=null) {
            JSONObjectHelper.put(json,"receiver",getJSONValue(et.getReceiver()),false);
        }
        if(bIncEmpty||et.getFomart()!=null) {
            JSONObjectHelper.put(json,"fomart",getJSONValue(et.getFomart()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getAction()!=null) {
            JSONObjectHelper.put(json,"action",getJSONValue(et.getAction()),false);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            JSONObjectHelper.put(json,"status",getJSONValue(et.getStatus()),false);
        }
        if(bIncEmpty||et.getTIMESTAMP()!=null) {
            JSONObjectHelper.put(json,"timestamp",getJSONValue(et.getTIMESTAMP()),false);
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
    private static void fillXmlNode(LVXIN_MESSAGE et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getMid()!=null) {
            Object obj = et.getMid();
            node.setAttribute("MID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTITLE()!=null) {
            Object obj = et.getTITLE();
            node.setAttribute("TITLE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSender()!=null) {
            Object obj = et.getSender();
            node.setAttribute("SENDER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReceiver()!=null) {
            Object obj = et.getReceiver();
            node.setAttribute("RECEIVER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFomart()!=null) {
            Object obj = et.getFomart();
            node.setAttribute("FOMART",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAction()!=null) {
            Object obj = et.getAction();
            node.setAttribute("ACTION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            Object obj = et.getStatus();
            node.setAttribute("STATUS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTIMESTAMP()!=null) {
            Object obj = et.getTIMESTAMP();
            node.setAttribute("TIMESTAMP",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_MESSAGE.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_MESSAGE et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isMidDirty() && (bIncEmpty||et.getMid()!=null)) {
            dst.set(FIELD_MID,et.getMid());
        }
        if(et.isTITLEDirty() && (bIncEmpty||et.getTITLE()!=null)) {
            dst.set(FIELD_TITLE,et.getTITLE());
        }
        if(et.isSenderDirty() && (bIncEmpty||et.getSender()!=null)) {
            dst.set(FIELD_SENDER,et.getSender());
        }
        if(et.isReceiverDirty() && (bIncEmpty||et.getReceiver()!=null)) {
            dst.set(FIELD_RECEIVER,et.getReceiver());
        }
        if(et.isFomartDirty() && (bIncEmpty||et.getFomart()!=null)) {
            dst.set(FIELD_FOMART,et.getFomart());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isActionDirty() && (bIncEmpty||et.getAction()!=null)) {
            dst.set(FIELD_ACTION,et.getAction());
        }
        if(et.isStatusDirty() && (bIncEmpty||et.getStatus()!=null)) {
            dst.set(FIELD_STATUS,et.getStatus());
        }
        if(et.isTIMESTAMPDirty() && (bIncEmpty||et.getTIMESTAMP()!=null)) {
            dst.set(FIELD_TIMESTAMP,et.getTIMESTAMP());
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
        return  LVXIN_MESSAGE.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_MESSAGE et,int index) throws Exception {
        switch(index) {
        case INDEX_MID:
            et.resetMid();
            return true;
        case INDEX_TITLE:
            et.resetTITLE();
            return true;
        case INDEX_SENDER:
            et.resetSender();
            return true;
        case INDEX_RECEIVER:
            et.resetReceiver();
            return true;
        case INDEX_FOMART:
            et.resetFomart();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_ACTION:
            et.resetAction();
            return true;
        case INDEX_STATUS:
            et.resetStatus();
            return true;
        case INDEX_TIMESTAMP:
            et.resetTIMESTAMP();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_MESSAGE getProxyEntity() {
        return this.proxyLVXIN_MESSAGE;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_MESSAGE = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_MESSAGE) {
            this.proxyLVXIN_MESSAGE = (LVXIN_MESSAGE)proxyDataObject;
        }

    }

}