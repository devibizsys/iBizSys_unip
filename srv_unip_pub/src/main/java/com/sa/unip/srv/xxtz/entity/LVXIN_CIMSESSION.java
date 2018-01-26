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
 * 实体[LVXIN_CIMSESSION] 数据对象
 */
public class LVXIN_CIMSESSION extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_CIMSESSION.class);
    /**
     *   实体属性标识[在线设备标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[用户账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[长连接在本台服务器上的IP]
     */
    public final static String FIELD_NID = "NID";
    /**
     *   实体属性标识[设备唯一号]
     */
    public final static String FIELD_DEVICEID = "DEVICEID";
    /**
     *   实体属性标识[session绑定的服务器IP]
     */
    public final static String FIELD_HOSTADDRESS = "HOSTADDRESS";
    /**
     *   实体属性标识[终端设备类型]
     */
    public final static String FIELD_CHANNEL = "CHANNEL";
    /**
     *   实体属性标识[终端设备型号]
     */
    public final static String FIELD_DEVICEMODEL = "DEVICEMODEL";
    /**
     *   实体属性标识[终端应用版本]
     */
    public final static String FIELD_CLIENTVERSION = "CLIENTVERSION";
    /**
     *   实体属性标识[终端系统版本]
     */
    public final static String FIELD_SYSTEMVERSION = "SYSTEMVERSION";
    /**
     *   实体属性标识[登录时间]
     */
    public final static String FIELD_BINDTIME = "BINDTIME";
    /**
     *   实体属性标识[心跳时间]
     */
    public final static String FIELD_HEARTBEAT = "HEARTBEAT";
    /**
     *   实体属性标识[经度]
     */
    public final static String FIELD_LONGITUDE = "LONGITUDE";
    /**
     *   实体属性标识[维度]
     */
    public final static String FIELD_LATIYUDE = "LATIYUDE";
    /**
     *   实体属性标识[位置]
     */
    public final static String FIELD_LOCATION = "LOCATION";
    /**
     *   实体属性标识[0关闭，1打开]
     */
    public final static String FIELD_APNSABLE = "APNSABLE";
    /**
     *   实体属性标识[0在线，1离线]
     */
    public final static String FIELD_STATUS = "STATUS";
    /**
     *   实体属性标识[应用包名]
     */
    public final static String FIELD_PACKAGENAME = "PACKAGENAME";

    private final static int INDEX_GID = 0;
    private final static int INDEX_ACCOUNT = 1;
    private final static int INDEX_NID = 2;
    private final static int INDEX_DEVICEID = 3;
    private final static int INDEX_HOSTADDRESS = 4;
    private final static int INDEX_CHANNEL = 5;
    private final static int INDEX_DEVICEMODEL = 6;
    private final static int INDEX_CLIENTVERSION = 7;
    private final static int INDEX_SYSTEMVERSION = 8;
    private final static int INDEX_BINDTIME = 9;
    private final static int INDEX_HEARTBEAT = 10;
    private final static int INDEX_LONGITUDE = 11;
    private final static int INDEX_LATIYUDE = 12;
    private final static int INDEX_LOCATION = 13;
    private final static int INDEX_APNSABLE = 14;
    private final static int INDEX_STATUS = 15;
    private final static int INDEX_PACKAGENAME = 16;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_NID, INDEX_NID);
        fieldIndexMap.put( FIELD_DEVICEID, INDEX_DEVICEID);
        fieldIndexMap.put( FIELD_HOSTADDRESS, INDEX_HOSTADDRESS);
        fieldIndexMap.put( FIELD_CHANNEL, INDEX_CHANNEL);
        fieldIndexMap.put( FIELD_DEVICEMODEL, INDEX_DEVICEMODEL);
        fieldIndexMap.put( FIELD_CLIENTVERSION, INDEX_CLIENTVERSION);
        fieldIndexMap.put( FIELD_SYSTEMVERSION, INDEX_SYSTEMVERSION);
        fieldIndexMap.put( FIELD_BINDTIME, INDEX_BINDTIME);
        fieldIndexMap.put( FIELD_HEARTBEAT, INDEX_HEARTBEAT);
        fieldIndexMap.put( FIELD_LONGITUDE, INDEX_LONGITUDE);
        fieldIndexMap.put( FIELD_LATIYUDE, INDEX_LATIYUDE);
        fieldIndexMap.put( FIELD_LOCATION, INDEX_LOCATION);
        fieldIndexMap.put( FIELD_APNSABLE, INDEX_APNSABLE);
        fieldIndexMap.put( FIELD_STATUS, INDEX_STATUS);
        fieldIndexMap.put( FIELD_PACKAGENAME, INDEX_PACKAGENAME);
    }

    private LVXIN_CIMSESSION proxyLVXIN_CIMSESSION = null;

    public LVXIN_CIMSESSION() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean accountDirtyFlag = false;
    private boolean nidDirtyFlag = false;
    private boolean deviceidDirtyFlag = false;
    private boolean hostaddressDirtyFlag = false;
    private boolean channelDirtyFlag = false;
    private boolean devicemodelDirtyFlag = false;
    private boolean clientversionDirtyFlag = false;
    private boolean systemversionDirtyFlag = false;
    private boolean bindtimeDirtyFlag = false;
    private boolean heartbeatDirtyFlag = false;
    private boolean longitudeDirtyFlag = false;
    private boolean latiyudeDirtyFlag = false;
    private boolean locationDirtyFlag = false;
    private boolean apnsableDirtyFlag = false;
    private boolean statusDirtyFlag = false;
    private boolean packagenameDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="account")
    private String account;
    @Column(name="nid")
    private Integer nid;
    @Column(name="deviceid")
    private String deviceid;
    @Column(name="hostaddress")
    private String hostaddress;
    @Column(name="channel")
    private String channel;
    @Column(name="devicemodel")
    private String devicemodel;
    @Column(name="clientversion")
    private String clientversion;
    @Column(name="systemversion")
    private String systemversion;
    @Column(name="bindtime")
    private Double bindtime;
    @Column(name="heartbeat")
    private Double heartbeat;
    @Column(name="longitude")
    private Double longitude;
    @Column(name="latiyude")
    private Double latiyude;
    @Column(name="location")
    private String location;
    @Column(name="apnsable")
    private String apnsable;
    @Column(name="status")
    private String status;
    @Column(name="packagename")
    private String packagename;


    /**
     *  设置属性值[在线设备标识]
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
     *  获取属性值[在线设备标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[在线设备标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[在线设备标识]
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
     *  设置属性值[用户账号]
     *  @param account
     */
    public void setAccount(String account) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setAccount(account);
            return;
        }
        if(account!=null) {
            account = StringHelper.trimRight(account);
            if(account.length()==0) {
                account = null;
            }
        }
        this.account =  account;
        this.accountDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户账号]
     */
    public String getAccount() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAccount();
        }
        return this.account;
    }

    /**
     *  获取属性值[用户账号]是否修改
     */
    public boolean isAccountDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAccountDirty();
        }
        return this.accountDirtyFlag;
    }

    /**
     *  重置属性值[用户账号]
     */
    public void resetAccount() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetAccount();
            return;
        }

        this.accountDirtyFlag = false;
        this.account = null;
    }
    /**
     *  设置属性值[长连接在本台服务器上的IP]
     *  @param nid
     */
    public void setNid(Integer nid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setNid(nid);
            return;
        }
        this.nid =  nid;
        this.nidDirtyFlag  = true;
    }

    /**
     *  获取属性值[长连接在本台服务器上的IP]
     */
    public Integer getNid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNid();
        }
        return this.nid;
    }

    /**
     *  获取属性值[长连接在本台服务器上的IP]是否修改
     */
    public boolean isNidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNidDirty();
        }
        return this.nidDirtyFlag;
    }

    /**
     *  重置属性值[长连接在本台服务器上的IP]
     */
    public void resetNid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetNid();
            return;
        }

        this.nidDirtyFlag = false;
        this.nid = null;
    }
    /**
     *  设置属性值[设备唯一号]
     *  @param deviceid
     */
    public void setDeviceid(String deviceid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDeviceid(deviceid);
            return;
        }
        if(deviceid!=null) {
            deviceid = StringHelper.trimRight(deviceid);
            if(deviceid.length()==0) {
                deviceid = null;
            }
        }
        this.deviceid =  deviceid;
        this.deviceidDirtyFlag  = true;
    }

    /**
     *  获取属性值[设备唯一号]
     */
    public String getDeviceid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDeviceid();
        }
        return this.deviceid;
    }

    /**
     *  获取属性值[设备唯一号]是否修改
     */
    public boolean isDeviceidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDeviceidDirty();
        }
        return this.deviceidDirtyFlag;
    }

    /**
     *  重置属性值[设备唯一号]
     */
    public void resetDeviceid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDeviceid();
            return;
        }

        this.deviceidDirtyFlag = false;
        this.deviceid = null;
    }
    /**
     *  设置属性值[session绑定的服务器IP]
     *  @param hostaddress
     */
    public void setHostaddress(String hostaddress) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHostaddress(hostaddress);
            return;
        }
        if(hostaddress!=null) {
            hostaddress = StringHelper.trimRight(hostaddress);
            if(hostaddress.length()==0) {
                hostaddress = null;
            }
        }
        this.hostaddress =  hostaddress;
        this.hostaddressDirtyFlag  = true;
    }

    /**
     *  获取属性值[session绑定的服务器IP]
     */
    public String getHostaddress() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHostaddress();
        }
        return this.hostaddress;
    }

    /**
     *  获取属性值[session绑定的服务器IP]是否修改
     */
    public boolean isHostaddressDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHostaddressDirty();
        }
        return this.hostaddressDirtyFlag;
    }

    /**
     *  重置属性值[session绑定的服务器IP]
     */
    public void resetHostaddress() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHostaddress();
            return;
        }

        this.hostaddressDirtyFlag = false;
        this.hostaddress = null;
    }
    /**
     *  设置属性值[终端设备类型]
     *  @param channel
     */
    public void setChannel(String channel) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setChannel(channel);
            return;
        }
        if(channel!=null) {
            channel = StringHelper.trimRight(channel);
            if(channel.length()==0) {
                channel = null;
            }
        }
        this.channel =  channel;
        this.channelDirtyFlag  = true;
    }

    /**
     *  获取属性值[终端设备类型]
     */
    public String getChannel() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getChannel();
        }
        return this.channel;
    }

    /**
     *  获取属性值[终端设备类型]是否修改
     */
    public boolean isChannelDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isChannelDirty();
        }
        return this.channelDirtyFlag;
    }

    /**
     *  重置属性值[终端设备类型]
     */
    public void resetChannel() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetChannel();
            return;
        }

        this.channelDirtyFlag = false;
        this.channel = null;
    }
    /**
     *  设置属性值[终端设备型号]
     *  @param devicemodel
     */
    public void setDevicemodel(String devicemodel) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDevicemodel(devicemodel);
            return;
        }
        if(devicemodel!=null) {
            devicemodel = StringHelper.trimRight(devicemodel);
            if(devicemodel.length()==0) {
                devicemodel = null;
            }
        }
        this.devicemodel =  devicemodel;
        this.devicemodelDirtyFlag  = true;
    }

    /**
     *  获取属性值[终端设备型号]
     */
    public String getDevicemodel() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDevicemodel();
        }
        return this.devicemodel;
    }

    /**
     *  获取属性值[终端设备型号]是否修改
     */
    public boolean isDevicemodelDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDevicemodelDirty();
        }
        return this.devicemodelDirtyFlag;
    }

    /**
     *  重置属性值[终端设备型号]
     */
    public void resetDevicemodel() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDevicemodel();
            return;
        }

        this.devicemodelDirtyFlag = false;
        this.devicemodel = null;
    }
    /**
     *  设置属性值[终端应用版本]
     *  @param clientversion
     */
    public void setClientversion(String clientversion) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setClientversion(clientversion);
            return;
        }
        if(clientversion!=null) {
            clientversion = StringHelper.trimRight(clientversion);
            if(clientversion.length()==0) {
                clientversion = null;
            }
        }
        this.clientversion =  clientversion;
        this.clientversionDirtyFlag  = true;
    }

    /**
     *  获取属性值[终端应用版本]
     */
    public String getClientversion() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getClientversion();
        }
        return this.clientversion;
    }

    /**
     *  获取属性值[终端应用版本]是否修改
     */
    public boolean isClientversionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isClientversionDirty();
        }
        return this.clientversionDirtyFlag;
    }

    /**
     *  重置属性值[终端应用版本]
     */
    public void resetClientversion() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetClientversion();
            return;
        }

        this.clientversionDirtyFlag = false;
        this.clientversion = null;
    }
    /**
     *  设置属性值[终端系统版本]
     *  @param systemversion
     */
    public void setSystemversion(String systemversion) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSystemversion(systemversion);
            return;
        }
        if(systemversion!=null) {
            systemversion = StringHelper.trimRight(systemversion);
            if(systemversion.length()==0) {
                systemversion = null;
            }
        }
        this.systemversion =  systemversion;
        this.systemversionDirtyFlag  = true;
    }

    /**
     *  获取属性值[终端系统版本]
     */
    public String getSystemversion() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSystemversion();
        }
        return this.systemversion;
    }

    /**
     *  获取属性值[终端系统版本]是否修改
     */
    public boolean isSystemversionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSystemversionDirty();
        }
        return this.systemversionDirtyFlag;
    }

    /**
     *  重置属性值[终端系统版本]
     */
    public void resetSystemversion() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSystemversion();
            return;
        }

        this.systemversionDirtyFlag = false;
        this.systemversion = null;
    }
    /**
     *  设置属性值[登录时间]
     *  @param bindtime
     */
    public void setBINDTIME(Double bindtime) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBINDTIME(bindtime);
            return;
        }
        this.bindtime =  bindtime;
        this.bindtimeDirtyFlag  = true;
    }

    /**
     *  获取属性值[登录时间]
     */
    public Double getBINDTIME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBINDTIME();
        }
        return this.bindtime;
    }

    /**
     *  获取属性值[登录时间]是否修改
     */
    public boolean isBINDTIMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBINDTIMEDirty();
        }
        return this.bindtimeDirtyFlag;
    }

    /**
     *  重置属性值[登录时间]
     */
    public void resetBINDTIME() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBINDTIME();
            return;
        }

        this.bindtimeDirtyFlag = false;
        this.bindtime = null;
    }
    /**
     *  设置属性值[心跳时间]
     *  @param heartbeat
     */
    public void setHEARTBEAT(Double heartbeat) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHEARTBEAT(heartbeat);
            return;
        }
        this.heartbeat =  heartbeat;
        this.heartbeatDirtyFlag  = true;
    }

    /**
     *  获取属性值[心跳时间]
     */
    public Double getHEARTBEAT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHEARTBEAT();
        }
        return this.heartbeat;
    }

    /**
     *  获取属性值[心跳时间]是否修改
     */
    public boolean isHEARTBEATDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHEARTBEATDirty();
        }
        return this.heartbeatDirtyFlag;
    }

    /**
     *  重置属性值[心跳时间]
     */
    public void resetHEARTBEAT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHEARTBEAT();
            return;
        }

        this.heartbeatDirtyFlag = false;
        this.heartbeat = null;
    }
    /**
     *  设置属性值[经度]
     *  @param longitude
     */
    public void setLongitude(Double longitude) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLongitude(longitude);
            return;
        }
        this.longitude =  longitude;
        this.longitudeDirtyFlag  = true;
    }

    /**
     *  获取属性值[经度]
     */
    public Double getLongitude() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLongitude();
        }
        return this.longitude;
    }

    /**
     *  获取属性值[经度]是否修改
     */
    public boolean isLongitudeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLongitudeDirty();
        }
        return this.longitudeDirtyFlag;
    }

    /**
     *  重置属性值[经度]
     */
    public void resetLongitude() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLongitude();
            return;
        }

        this.longitudeDirtyFlag = false;
        this.longitude = null;
    }
    /**
     *  设置属性值[维度]
     *  @param latiyude
     */
    public void setLatiyude(Double latiyude) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLatiyude(latiyude);
            return;
        }
        this.latiyude =  latiyude;
        this.latiyudeDirtyFlag  = true;
    }

    /**
     *  获取属性值[维度]
     */
    public Double getLatiyude() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLatiyude();
        }
        return this.latiyude;
    }

    /**
     *  获取属性值[维度]是否修改
     */
    public boolean isLatiyudeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLatiyudeDirty();
        }
        return this.latiyudeDirtyFlag;
    }

    /**
     *  重置属性值[维度]
     */
    public void resetLatiyude() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLatiyude();
            return;
        }

        this.latiyudeDirtyFlag = false;
        this.latiyude = null;
    }
    /**
     *  设置属性值[位置]
     *  @param location
     */
    public void setLocation(String location) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLocation(location);
            return;
        }
        if(location!=null) {
            location = StringHelper.trimRight(location);
            if(location.length()==0) {
                location = null;
            }
        }
        this.location =  location;
        this.locationDirtyFlag  = true;
    }

    /**
     *  获取属性值[位置]
     */
    public String getLocation() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLocation();
        }
        return this.location;
    }

    /**
     *  获取属性值[位置]是否修改
     */
    public boolean isLocationDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLocationDirty();
        }
        return this.locationDirtyFlag;
    }

    /**
     *  重置属性值[位置]
     */
    public void resetLocation() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLocation();
            return;
        }

        this.locationDirtyFlag = false;
        this.location = null;
    }
    /**
     *  设置属性值[0关闭，1打开]代码表：com.sa.unip.srv.codelist.ZXZTCodeListModel
     *  @param apnsable
     */
    public void setAPNSABLE(String apnsable) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setAPNSABLE(apnsable);
            return;
        }
        if(apnsable!=null) {
            apnsable = StringHelper.trimRight(apnsable);
            if(apnsable.length()==0) {
                apnsable = null;
            }
        }
        this.apnsable =  apnsable;
        this.apnsableDirtyFlag  = true;
    }

    /**
     *  获取属性值[0关闭，1打开]代码表：com.sa.unip.srv.codelist.ZXZTCodeListModel
     */
    public String getAPNSABLE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAPNSABLE();
        }
        return this.apnsable;
    }

    /**
     *  获取属性值[0关闭，1打开]是否修改
     */
    public boolean isAPNSABLEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAPNSABLEDirty();
        }
        return this.apnsableDirtyFlag;
    }

    /**
     *  重置属性值[0关闭，1打开]
     */
    public void resetAPNSABLE() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetAPNSABLE();
            return;
        }

        this.apnsableDirtyFlag = false;
        this.apnsable = null;
    }
    /**
     *  设置属性值[0在线，1离线]
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
     *  获取属性值[0在线，1离线]
     */
    public String getStatus() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getStatus();
        }
        return this.status;
    }

    /**
     *  获取属性值[0在线，1离线]是否修改
     */
    public boolean isStatusDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isStatusDirty();
        }
        return this.statusDirtyFlag;
    }

    /**
     *  重置属性值[0在线，1离线]
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
     *  设置属性值[应用包名]
     *  @param packagename
     */
    public void setPackagename(String packagename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPackagename(packagename);
            return;
        }
        if(packagename!=null) {
            packagename = StringHelper.trimRight(packagename);
            if(packagename.length()==0) {
                packagename = null;
            }
        }
        this.packagename =  packagename;
        this.packagenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[应用包名]
     */
    public String getPackagename() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPackagename();
        }
        return this.packagename;
    }

    /**
     *  获取属性值[应用包名]是否修改
     */
    public boolean isPackagenameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPackagenameDirty();
        }
        return this.packagenameDirtyFlag;
    }

    /**
     *  重置属性值[应用包名]
     */
    public void resetPackagename() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPackagename();
            return;
        }

        this.packagenameDirtyFlag = false;
        this.packagename = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_CIMSESSION.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_CIMSESSION et) {
        et.resetGID();
        et.resetAccount();
        et.resetNid();
        et.resetDeviceid();
        et.resetHostaddress();
        et.resetChannel();
        et.resetDevicemodel();
        et.resetClientversion();
        et.resetSystemversion();
        et.resetBINDTIME();
        et.resetHEARTBEAT();
        et.resetLongitude();
        et.resetLatiyude();
        et.resetLocation();
        et.resetAPNSABLE();
        et.resetStatus();
        et.resetPackagename();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isGIDDirty()) {
            params.put(FIELD_GID,getGID());
        }
        if(!bDirtyOnly || isAccountDirty()) {
            params.put(FIELD_ACCOUNT,getAccount());
        }
        if(!bDirtyOnly || isNidDirty()) {
            params.put(FIELD_NID,getNid());
        }
        if(!bDirtyOnly || isDeviceidDirty()) {
            params.put(FIELD_DEVICEID,getDeviceid());
        }
        if(!bDirtyOnly || isHostaddressDirty()) {
            params.put(FIELD_HOSTADDRESS,getHostaddress());
        }
        if(!bDirtyOnly || isChannelDirty()) {
            params.put(FIELD_CHANNEL,getChannel());
        }
        if(!bDirtyOnly || isDevicemodelDirty()) {
            params.put(FIELD_DEVICEMODEL,getDevicemodel());
        }
        if(!bDirtyOnly || isClientversionDirty()) {
            params.put(FIELD_CLIENTVERSION,getClientversion());
        }
        if(!bDirtyOnly || isSystemversionDirty()) {
            params.put(FIELD_SYSTEMVERSION,getSystemversion());
        }
        if(!bDirtyOnly || isBINDTIMEDirty()) {
            params.put(FIELD_BINDTIME,getBINDTIME());
        }
        if(!bDirtyOnly || isHEARTBEATDirty()) {
            params.put(FIELD_HEARTBEAT,getHEARTBEAT());
        }
        if(!bDirtyOnly || isLongitudeDirty()) {
            params.put(FIELD_LONGITUDE,getLongitude());
        }
        if(!bDirtyOnly || isLatiyudeDirty()) {
            params.put(FIELD_LATIYUDE,getLatiyude());
        }
        if(!bDirtyOnly || isLocationDirty()) {
            params.put(FIELD_LOCATION,getLocation());
        }
        if(!bDirtyOnly || isAPNSABLEDirty()) {
            params.put(FIELD_APNSABLE,getAPNSABLE());
        }
        if(!bDirtyOnly || isStatusDirty()) {
            params.put(FIELD_STATUS,getStatus());
        }
        if(!bDirtyOnly || isPackagenameDirty()) {
            params.put(FIELD_PACKAGENAME,getPackagename());
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

        return  LVXIN_CIMSESSION.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_CIMSESSION et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_NID:
            return et.getNid();
        case INDEX_DEVICEID:
            return et.getDeviceid();
        case INDEX_HOSTADDRESS:
            return et.getHostaddress();
        case INDEX_CHANNEL:
            return et.getChannel();
        case INDEX_DEVICEMODEL:
            return et.getDevicemodel();
        case INDEX_CLIENTVERSION:
            return et.getClientversion();
        case INDEX_SYSTEMVERSION:
            return et.getSystemversion();
        case INDEX_BINDTIME:
            return et.getBINDTIME();
        case INDEX_HEARTBEAT:
            return et.getHEARTBEAT();
        case INDEX_LONGITUDE:
            return et.getLongitude();
        case INDEX_LATIYUDE:
            return et.getLatiyude();
        case INDEX_LOCATION:
            return et.getLocation();
        case INDEX_APNSABLE:
            return et.getAPNSABLE();
        case INDEX_STATUS:
            return et.getStatus();
        case INDEX_PACKAGENAME:
            return et.getPackagename();
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

        LVXIN_CIMSESSION.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_CIMSESSION et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_NID:
            et.setNid(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_DEVICEID:
            et.setDeviceid(DataObject.getStringValue(obj));
            return ;
        case INDEX_HOSTADDRESS:
            et.setHostaddress(DataObject.getStringValue(obj));
            return ;
        case INDEX_CHANNEL:
            et.setChannel(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEVICEMODEL:
            et.setDevicemodel(DataObject.getStringValue(obj));
            return ;
        case INDEX_CLIENTVERSION:
            et.setClientversion(DataObject.getStringValue(obj));
            return ;
        case INDEX_SYSTEMVERSION:
            et.setSystemversion(DataObject.getStringValue(obj));
            return ;
        case INDEX_BINDTIME:
            et.setBINDTIME(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_HEARTBEAT:
            et.setHEARTBEAT(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_LONGITUDE:
            et.setLongitude(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_LATIYUDE:
            et.setLatiyude(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_LOCATION:
            et.setLocation(DataObject.getStringValue(obj));
            return ;
        case INDEX_APNSABLE:
            et.setAPNSABLE(DataObject.getStringValue(obj));
            return ;
        case INDEX_STATUS:
            et.setStatus(DataObject.getStringValue(obj));
            return ;
        case INDEX_PACKAGENAME:
            et.setPackagename(DataObject.getStringValue(obj));
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

        return  LVXIN_CIMSESSION.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_CIMSESSION et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_NID:
            return et.getNid()==null;
        case INDEX_DEVICEID:
            return et.getDeviceid()==null;
        case INDEX_HOSTADDRESS:
            return et.getHostaddress()==null;
        case INDEX_CHANNEL:
            return et.getChannel()==null;
        case INDEX_DEVICEMODEL:
            return et.getDevicemodel()==null;
        case INDEX_CLIENTVERSION:
            return et.getClientversion()==null;
        case INDEX_SYSTEMVERSION:
            return et.getSystemversion()==null;
        case INDEX_BINDTIME:
            return et.getBINDTIME()==null;
        case INDEX_HEARTBEAT:
            return et.getHEARTBEAT()==null;
        case INDEX_LONGITUDE:
            return et.getLongitude()==null;
        case INDEX_LATIYUDE:
            return et.getLatiyude()==null;
        case INDEX_LOCATION:
            return et.getLocation()==null;
        case INDEX_APNSABLE:
            return et.getAPNSABLE()==null;
        case INDEX_STATUS:
            return et.getStatus()==null;
        case INDEX_PACKAGENAME:
            return et.getPackagename()==null;
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

        return  LVXIN_CIMSESSION.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_CIMSESSION et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_NID:
            return et.isNidDirty();
        case INDEX_DEVICEID:
            return et.isDeviceidDirty();
        case INDEX_HOSTADDRESS:
            return et.isHostaddressDirty();
        case INDEX_CHANNEL:
            return et.isChannelDirty();
        case INDEX_DEVICEMODEL:
            return et.isDevicemodelDirty();
        case INDEX_CLIENTVERSION:
            return et.isClientversionDirty();
        case INDEX_SYSTEMVERSION:
            return et.isSystemversionDirty();
        case INDEX_BINDTIME:
            return et.isBINDTIMEDirty();
        case INDEX_HEARTBEAT:
            return et.isHEARTBEATDirty();
        case INDEX_LONGITUDE:
            return et.isLongitudeDirty();
        case INDEX_LATIYUDE:
            return et.isLatiyudeDirty();
        case INDEX_LOCATION:
            return et.isLocationDirty();
        case INDEX_APNSABLE:
            return et.isAPNSABLEDirty();
        case INDEX_STATUS:
            return et.isStatusDirty();
        case INDEX_PACKAGENAME:
            return et.isPackagenameDirty();
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
    private static  void fillJSONObject(LVXIN_CIMSESSION et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getNid()!=null) {
            JSONObjectHelper.put(json,"nid",getJSONValue(et.getNid()),false);
        }
        if(bIncEmpty||et.getDeviceid()!=null) {
            JSONObjectHelper.put(json,"deviceid",getJSONValue(et.getDeviceid()),false);
        }
        if(bIncEmpty||et.getHostaddress()!=null) {
            JSONObjectHelper.put(json,"hostaddress",getJSONValue(et.getHostaddress()),false);
        }
        if(bIncEmpty||et.getChannel()!=null) {
            JSONObjectHelper.put(json,"channel",getJSONValue(et.getChannel()),false);
        }
        if(bIncEmpty||et.getDevicemodel()!=null) {
            JSONObjectHelper.put(json,"devicemodel",getJSONValue(et.getDevicemodel()),false);
        }
        if(bIncEmpty||et.getClientversion()!=null) {
            JSONObjectHelper.put(json,"clientversion",getJSONValue(et.getClientversion()),false);
        }
        if(bIncEmpty||et.getSystemversion()!=null) {
            JSONObjectHelper.put(json,"systemversion",getJSONValue(et.getSystemversion()),false);
        }
        if(bIncEmpty||et.getBINDTIME()!=null) {
            JSONObjectHelper.put(json,"bindtime",getJSONValue(et.getBINDTIME()),false);
        }
        if(bIncEmpty||et.getHEARTBEAT()!=null) {
            JSONObjectHelper.put(json,"heartbeat",getJSONValue(et.getHEARTBEAT()),false);
        }
        if(bIncEmpty||et.getLongitude()!=null) {
            JSONObjectHelper.put(json,"longitude",getJSONValue(et.getLongitude()),false);
        }
        if(bIncEmpty||et.getLatiyude()!=null) {
            JSONObjectHelper.put(json,"latiyude",getJSONValue(et.getLatiyude()),false);
        }
        if(bIncEmpty||et.getLocation()!=null) {
            JSONObjectHelper.put(json,"location",getJSONValue(et.getLocation()),false);
        }
        if(bIncEmpty||et.getAPNSABLE()!=null) {
            JSONObjectHelper.put(json,"apnsable",getJSONValue(et.getAPNSABLE()),false);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            JSONObjectHelper.put(json,"status",getJSONValue(et.getStatus()),false);
        }
        if(bIncEmpty||et.getPackagename()!=null) {
            JSONObjectHelper.put(json,"packagename",getJSONValue(et.getPackagename()),false);
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
    private static void fillXmlNode(LVXIN_CIMSESSION et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNid()!=null) {
            Object obj = et.getNid();
            node.setAttribute("NID",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getDeviceid()!=null) {
            Object obj = et.getDeviceid();
            node.setAttribute("DEVICEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHostaddress()!=null) {
            Object obj = et.getHostaddress();
            node.setAttribute("HOSTADDRESS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getChannel()!=null) {
            Object obj = et.getChannel();
            node.setAttribute("CHANNEL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDevicemodel()!=null) {
            Object obj = et.getDevicemodel();
            node.setAttribute("DEVICEMODEL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getClientversion()!=null) {
            Object obj = et.getClientversion();
            node.setAttribute("CLIENTVERSION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSystemversion()!=null) {
            Object obj = et.getSystemversion();
            node.setAttribute("SYSTEMVERSION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBINDTIME()!=null) {
            Object obj = et.getBINDTIME();
            node.setAttribute("BINDTIME",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getHEARTBEAT()!=null) {
            Object obj = et.getHEARTBEAT();
            node.setAttribute("HEARTBEAT",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getLongitude()!=null) {
            Object obj = et.getLongitude();
            node.setAttribute("LONGITUDE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getLatiyude()!=null) {
            Object obj = et.getLatiyude();
            node.setAttribute("LATIYUDE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getLocation()!=null) {
            Object obj = et.getLocation();
            node.setAttribute("LOCATION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAPNSABLE()!=null) {
            Object obj = et.getAPNSABLE();
            node.setAttribute("APNSABLE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            Object obj = et.getStatus();
            node.setAttribute("STATUS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPackagename()!=null) {
            Object obj = et.getPackagename();
            node.setAttribute("PACKAGENAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_CIMSESSION.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_CIMSESSION et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isNidDirty() && (bIncEmpty||et.getNid()!=null)) {
            dst.set(FIELD_NID,et.getNid());
        }
        if(et.isDeviceidDirty() && (bIncEmpty||et.getDeviceid()!=null)) {
            dst.set(FIELD_DEVICEID,et.getDeviceid());
        }
        if(et.isHostaddressDirty() && (bIncEmpty||et.getHostaddress()!=null)) {
            dst.set(FIELD_HOSTADDRESS,et.getHostaddress());
        }
        if(et.isChannelDirty() && (bIncEmpty||et.getChannel()!=null)) {
            dst.set(FIELD_CHANNEL,et.getChannel());
        }
        if(et.isDevicemodelDirty() && (bIncEmpty||et.getDevicemodel()!=null)) {
            dst.set(FIELD_DEVICEMODEL,et.getDevicemodel());
        }
        if(et.isClientversionDirty() && (bIncEmpty||et.getClientversion()!=null)) {
            dst.set(FIELD_CLIENTVERSION,et.getClientversion());
        }
        if(et.isSystemversionDirty() && (bIncEmpty||et.getSystemversion()!=null)) {
            dst.set(FIELD_SYSTEMVERSION,et.getSystemversion());
        }
        if(et.isBINDTIMEDirty() && (bIncEmpty||et.getBINDTIME()!=null)) {
            dst.set(FIELD_BINDTIME,et.getBINDTIME());
        }
        if(et.isHEARTBEATDirty() && (bIncEmpty||et.getHEARTBEAT()!=null)) {
            dst.set(FIELD_HEARTBEAT,et.getHEARTBEAT());
        }
        if(et.isLongitudeDirty() && (bIncEmpty||et.getLongitude()!=null)) {
            dst.set(FIELD_LONGITUDE,et.getLongitude());
        }
        if(et.isLatiyudeDirty() && (bIncEmpty||et.getLatiyude()!=null)) {
            dst.set(FIELD_LATIYUDE,et.getLatiyude());
        }
        if(et.isLocationDirty() && (bIncEmpty||et.getLocation()!=null)) {
            dst.set(FIELD_LOCATION,et.getLocation());
        }
        if(et.isAPNSABLEDirty() && (bIncEmpty||et.getAPNSABLE()!=null)) {
            dst.set(FIELD_APNSABLE,et.getAPNSABLE());
        }
        if(et.isStatusDirty() && (bIncEmpty||et.getStatus()!=null)) {
            dst.set(FIELD_STATUS,et.getStatus());
        }
        if(et.isPackagenameDirty() && (bIncEmpty||et.getPackagename()!=null)) {
            dst.set(FIELD_PACKAGENAME,et.getPackagename());
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
        return  LVXIN_CIMSESSION.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_CIMSESSION et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_NID:
            et.resetNid();
            return true;
        case INDEX_DEVICEID:
            et.resetDeviceid();
            return true;
        case INDEX_HOSTADDRESS:
            et.resetHostaddress();
            return true;
        case INDEX_CHANNEL:
            et.resetChannel();
            return true;
        case INDEX_DEVICEMODEL:
            et.resetDevicemodel();
            return true;
        case INDEX_CLIENTVERSION:
            et.resetClientversion();
            return true;
        case INDEX_SYSTEMVERSION:
            et.resetSystemversion();
            return true;
        case INDEX_BINDTIME:
            et.resetBINDTIME();
            return true;
        case INDEX_HEARTBEAT:
            et.resetHEARTBEAT();
            return true;
        case INDEX_LONGITUDE:
            et.resetLongitude();
            return true;
        case INDEX_LATIYUDE:
            et.resetLatiyude();
            return true;
        case INDEX_LOCATION:
            et.resetLocation();
            return true;
        case INDEX_APNSABLE:
            et.resetAPNSABLE();
            return true;
        case INDEX_STATUS:
            et.resetStatus();
            return true;
        case INDEX_PACKAGENAME:
            et.resetPackagename();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_CIMSESSION getProxyEntity() {
        return this.proxyLVXIN_CIMSESSION;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_CIMSESSION = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_CIMSESSION) {
            this.proxyLVXIN_CIMSESSION = (LVXIN_CIMSESSION)proxyDataObject;
        }

    }

}