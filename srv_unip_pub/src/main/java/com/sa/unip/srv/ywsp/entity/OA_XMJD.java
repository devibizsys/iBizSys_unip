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
 * 实体[OA_XMJD] 数据对象
 */
public class OA_XMJD extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_XMJD.class);
    /**
     *   实体属性标识[项目进度标识]
     */
    public final static String FIELD_OA_XMJDID = "OA_XMJDID";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[项目进度名称]
     */
    public final static String FIELD_OA_XMJDNAME = "OA_XMJDNAME";
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
     *   实体属性标识[项目名称]
     */
    public final static String FIELD_XMMC = "XMMC";
    /**
     *   实体属性标识[立项报告]
     */
    public final static String FIELD_LXBG = "LXBG";
    /**
     *   实体属性标识[项目编号]
     */
    public final static String FIELD_XMBH = "XMBH";
    /**
     *   实体属性标识[收到项目编号日期]
     */
    public final static String FIELD_SDXMBHRQ = "SDXMBHRQ";
    /**
     *   实体属性标识[上党组织会编号]
     */
    public final static String FIELD_SDZZHBH = "SDZZHBH";
    /**
     *   实体属性标识[预算金额]
     */
    public final static String FIELD_YSJE = "YSJE";
    /**
     *   实体属性标识[开始向财政申报期日期]
     */
    public final static String FIELD_KSXCZSBRQ = "KSXCZSBRQ";
    /**
     *   实体属性标识[使用资金文号]
     */
    public final static String FIELD_SYZJWH = "SYZJWH";
    /**
     *   实体属性标识[代理公司]
     */
    public final static String FIELD_DLGS = "DLGS";
    /**
     *   实体属性标识[招标文件确认签字]
     */
    public final static String FIELD_ZBWJQRQZ = "ZBWJQRQZ";
    /**
     *   实体属性标识[招标文件确认日期]
     */
    public final static String FIELD_ZBWJQRRQ = "ZBWJQRRQ";
    /**
     *   实体属性标识[招标文件确认单扫描]
     */
    public final static String FIELD_ZBWJQRDSM = "ZBWJQRDSM";
    /**
     *   实体属性标识[采购方式]
     */
    public final static String FIELD_CGFS = "CGFS";
    /**
     *   实体属性标识[采购公告日期]
     */
    public final static String FIELD_CGGGRQ = "CGGGRQ";
    /**
     *   实体属性标识[评审日期]
     */
    public final static String FIELD_PSRQ = "PSRQ";
    /**
     *   实体属性标识[监察人员]
     */
    public final static String FIELD_JCRY = "JCRY";
    /**
     *   实体属性标识[评审代表]
     */
    public final static String FIELD_PSDB = "PSDB";
    /**
     *   实体属性标识[采购结果报告批复日期]
     */
    public final static String FIELD_CGJGBGPFRQ = "CGJGBGPFRQ";
    /**
     *   实体属性标识[代理机构评审报告编号]
     */
    public final static String FIELD_DLJGPSBGBH = "DLJGPSBGBH";
    /**
     *   实体属性标识[招投标文件归档日期]
     */
    public final static String FIELD_ZTBWJGDRQ = "ZTBWJGDRQ";
    /**
     *   实体属性标识[招投标文件存放地]
     */
    public final static String FIELD_ZTBWJCFD = "ZTBWJCFD";
    /**
     *   实体属性标识[成交中标公司]
     */
    public final static String FIELD_CJZBGS = "CJZBGS";
    /**
     *   实体属性标识[合同签订日期]
     */
    public final static String FIELD_HTQDRQ = "HTQDRQ";
    /**
     *   实体属性标识[合同总额]
     */
    public final static String FIELD_HTZE = "HTZE";
    /**
     *   实体属性标识[合同扫描]
     */
    public final static String FIELD_HTSM = "HTSM";
    /**
     *   实体属性标识[备案日期]
     */
    public final static String FIELD_BARQ = "BARQ";
    /**
     *   实体属性标识[备案表扫描]
     */
    public final static String FIELD_BABSM = "BABSM";
    /**
     *   实体属性标识[质保保函金额]
     */
    public final static String FIELD_ZBBHJE = "ZBBHJE";
    /**
     *   实体属性标识[保函存放地点]
     */
    public final static String FIELD_BHCFDD = "BHCFDD";
    /**
     *   实体属性标识[保函复印件存放地点]
     */
    public final static String FIELD_BHFYJCFDD = "BHFYJCFDD";
    /**
     *   实体属性标识[约定履行日期]
     */
    public final static String FIELD_YDLXRQ = "YDLXRQ";
    /**
     *   实体属性标识[第一次付款进度批示]
     */
    public final static String FIELD_DYCFKJDPS = "DYCFKJDPS";
    /**
     *   实体属性标识[第一次付款金额]
     */
    public final static String FIELD_DYCFKJE = "DYCFKJE";
    /**
     *   实体属性标识[第一次支付批示日期]
     */
    public final static String FIELD_DYCZFPSRQ = "DYCZFPSRQ";
    /**
     *   实体属性标识[第一次支付批示扫描]
     */
    public final static String FIELD_DYCZFPSSM = "DYCZFPSSM";
    /**
     *   实体属性标识[第二次支付批示扫描]
     */
    public final static String FIELD_DECZFPSSM = "DECZFPSSM";
    /**
     *   实体属性标识[第三次支付批示扫描]
     */
    public final static String FIELD_DSCZFPSSM = "DSCZFPSSM";
    /**
     *   实体属性标识[第二次付款金额]
     */
    public final static String FIELD_DECFKJE = "DECFKJE";
    /**
     *   实体属性标识[第三次付款金额]
     */
    public final static String FIELD_DSCFKJE = "DSCFKJE";
    /**
     *   实体属性标识[第二次付款进度批示]
     */
    public final static String FIELD_DECFKJDPS = "DECFKJDPS";
    /**
     *   实体属性标识[第三次付款进度批示]
     */
    public final static String FIELD_DSCFKJDPS = "DSCFKJDPS";
    /**
     *   实体属性标识[第二次支付批示日期]
     */
    public final static String FIELD_DECZFPSRQ = "DECZFPSRQ";
    /**
     *   实体属性标识[第三次支付批示日期]
     */
    public final static String FIELD_DSCZFPSRQ = "DSCZFPSRQ";
    /**
     *   实体属性标识[验收日期]
     */
    public final static String FIELD_YSRQ = "YSRQ";
    /**
     *   实体属性标识[要收报告扫描]
     */
    public final static String FIELD_YSBGSN = "YSBGSN";
    /**
     *   实体属性标识[退保日期]
     */
    public final static String FIELD_TBRQ = "TBRQ";
    /**
     *   实体属性标识[未付余款]
     */
    public final static String FIELD_WFYK = "WFYK";
    /**
     *   实体属性标识[绩效评估]
     */
    public final static String FIELD_JXPG = "JXPG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_BZ = "BZ";
    /**
     *   实体属性标识[采购结果批示扫描]
     */
    public final static String FIELD_CGJGPSSM = "CGJGPSSM";

    private final static int INDEX_OA_XMJDID = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_OA_XMJDNAME = 2;
    private final static int INDEX_CREATEDATE = 3;
    private final static int INDEX_UPDATEDATE = 4;
    private final static int INDEX_UPDATEMAN = 5;
    private final static int INDEX_XMMC = 6;
    private final static int INDEX_LXBG = 7;
    private final static int INDEX_XMBH = 8;
    private final static int INDEX_SDXMBHRQ = 9;
    private final static int INDEX_SDZZHBH = 10;
    private final static int INDEX_YSJE = 11;
    private final static int INDEX_KSXCZSBRQ = 12;
    private final static int INDEX_SYZJWH = 13;
    private final static int INDEX_DLGS = 14;
    private final static int INDEX_ZBWJQRQZ = 15;
    private final static int INDEX_ZBWJQRRQ = 16;
    private final static int INDEX_ZBWJQRDSM = 17;
    private final static int INDEX_CGFS = 18;
    private final static int INDEX_CGGGRQ = 19;
    private final static int INDEX_PSRQ = 20;
    private final static int INDEX_JCRY = 21;
    private final static int INDEX_PSDB = 22;
    private final static int INDEX_CGJGBGPFRQ = 23;
    private final static int INDEX_DLJGPSBGBH = 24;
    private final static int INDEX_ZTBWJGDRQ = 25;
    private final static int INDEX_ZTBWJCFD = 26;
    private final static int INDEX_CJZBGS = 27;
    private final static int INDEX_HTQDRQ = 28;
    private final static int INDEX_HTZE = 29;
    private final static int INDEX_HTSM = 30;
    private final static int INDEX_BARQ = 31;
    private final static int INDEX_BABSM = 32;
    private final static int INDEX_ZBBHJE = 33;
    private final static int INDEX_BHCFDD = 34;
    private final static int INDEX_BHFYJCFDD = 35;
    private final static int INDEX_YDLXRQ = 36;
    private final static int INDEX_DYCFKJDPS = 37;
    private final static int INDEX_DYCFKJE = 38;
    private final static int INDEX_DYCZFPSRQ = 39;
    private final static int INDEX_DYCZFPSSM = 40;
    private final static int INDEX_DECZFPSSM = 41;
    private final static int INDEX_DSCZFPSSM = 42;
    private final static int INDEX_DECFKJE = 43;
    private final static int INDEX_DSCFKJE = 44;
    private final static int INDEX_DECFKJDPS = 45;
    private final static int INDEX_DSCFKJDPS = 46;
    private final static int INDEX_DECZFPSRQ = 47;
    private final static int INDEX_DSCZFPSRQ = 48;
    private final static int INDEX_YSRQ = 49;
    private final static int INDEX_YSBGSN = 50;
    private final static int INDEX_TBRQ = 51;
    private final static int INDEX_WFYK = 52;
    private final static int INDEX_JXPG = 53;
    private final static int INDEX_BZ = 54;
    private final static int INDEX_CGJGPSSM = 55;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_XMJDID, INDEX_OA_XMJDID);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_XMJDNAME, INDEX_OA_XMJDNAME);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_XMMC, INDEX_XMMC);
        fieldIndexMap.put( FIELD_LXBG, INDEX_LXBG);
        fieldIndexMap.put( FIELD_XMBH, INDEX_XMBH);
        fieldIndexMap.put( FIELD_SDXMBHRQ, INDEX_SDXMBHRQ);
        fieldIndexMap.put( FIELD_SDZZHBH, INDEX_SDZZHBH);
        fieldIndexMap.put( FIELD_YSJE, INDEX_YSJE);
        fieldIndexMap.put( FIELD_KSXCZSBRQ, INDEX_KSXCZSBRQ);
        fieldIndexMap.put( FIELD_SYZJWH, INDEX_SYZJWH);
        fieldIndexMap.put( FIELD_DLGS, INDEX_DLGS);
        fieldIndexMap.put( FIELD_ZBWJQRQZ, INDEX_ZBWJQRQZ);
        fieldIndexMap.put( FIELD_ZBWJQRRQ, INDEX_ZBWJQRRQ);
        fieldIndexMap.put( FIELD_ZBWJQRDSM, INDEX_ZBWJQRDSM);
        fieldIndexMap.put( FIELD_CGFS, INDEX_CGFS);
        fieldIndexMap.put( FIELD_CGGGRQ, INDEX_CGGGRQ);
        fieldIndexMap.put( FIELD_PSRQ, INDEX_PSRQ);
        fieldIndexMap.put( FIELD_JCRY, INDEX_JCRY);
        fieldIndexMap.put( FIELD_PSDB, INDEX_PSDB);
        fieldIndexMap.put( FIELD_CGJGBGPFRQ, INDEX_CGJGBGPFRQ);
        fieldIndexMap.put( FIELD_DLJGPSBGBH, INDEX_DLJGPSBGBH);
        fieldIndexMap.put( FIELD_ZTBWJGDRQ, INDEX_ZTBWJGDRQ);
        fieldIndexMap.put( FIELD_ZTBWJCFD, INDEX_ZTBWJCFD);
        fieldIndexMap.put( FIELD_CJZBGS, INDEX_CJZBGS);
        fieldIndexMap.put( FIELD_HTQDRQ, INDEX_HTQDRQ);
        fieldIndexMap.put( FIELD_HTZE, INDEX_HTZE);
        fieldIndexMap.put( FIELD_HTSM, INDEX_HTSM);
        fieldIndexMap.put( FIELD_BARQ, INDEX_BARQ);
        fieldIndexMap.put( FIELD_BABSM, INDEX_BABSM);
        fieldIndexMap.put( FIELD_ZBBHJE, INDEX_ZBBHJE);
        fieldIndexMap.put( FIELD_BHCFDD, INDEX_BHCFDD);
        fieldIndexMap.put( FIELD_BHFYJCFDD, INDEX_BHFYJCFDD);
        fieldIndexMap.put( FIELD_YDLXRQ, INDEX_YDLXRQ);
        fieldIndexMap.put( FIELD_DYCFKJDPS, INDEX_DYCFKJDPS);
        fieldIndexMap.put( FIELD_DYCFKJE, INDEX_DYCFKJE);
        fieldIndexMap.put( FIELD_DYCZFPSRQ, INDEX_DYCZFPSRQ);
        fieldIndexMap.put( FIELD_DYCZFPSSM, INDEX_DYCZFPSSM);
        fieldIndexMap.put( FIELD_DECZFPSSM, INDEX_DECZFPSSM);
        fieldIndexMap.put( FIELD_DSCZFPSSM, INDEX_DSCZFPSSM);
        fieldIndexMap.put( FIELD_DECFKJE, INDEX_DECFKJE);
        fieldIndexMap.put( FIELD_DSCFKJE, INDEX_DSCFKJE);
        fieldIndexMap.put( FIELD_DECFKJDPS, INDEX_DECFKJDPS);
        fieldIndexMap.put( FIELD_DSCFKJDPS, INDEX_DSCFKJDPS);
        fieldIndexMap.put( FIELD_DECZFPSRQ, INDEX_DECZFPSRQ);
        fieldIndexMap.put( FIELD_DSCZFPSRQ, INDEX_DSCZFPSRQ);
        fieldIndexMap.put( FIELD_YSRQ, INDEX_YSRQ);
        fieldIndexMap.put( FIELD_YSBGSN, INDEX_YSBGSN);
        fieldIndexMap.put( FIELD_TBRQ, INDEX_TBRQ);
        fieldIndexMap.put( FIELD_WFYK, INDEX_WFYK);
        fieldIndexMap.put( FIELD_JXPG, INDEX_JXPG);
        fieldIndexMap.put( FIELD_BZ, INDEX_BZ);
        fieldIndexMap.put( FIELD_CGJGPSSM, INDEX_CGJGPSSM);
    }

    private OA_XMJD proxyOA_XMJD = null;

    public OA_XMJD() {
        super();
    }
    private boolean oa_xmjdidDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_xmjdnameDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean xmmcDirtyFlag = false;
    private boolean lxbgDirtyFlag = false;
    private boolean xmbhDirtyFlag = false;
    private boolean sdxmbhrqDirtyFlag = false;
    private boolean sdzzhbhDirtyFlag = false;
    private boolean ysjeDirtyFlag = false;
    private boolean ksxczsbrqDirtyFlag = false;
    private boolean syzjwhDirtyFlag = false;
    private boolean dlgsDirtyFlag = false;
    private boolean zbwjqrqzDirtyFlag = false;
    private boolean zbwjqrrqDirtyFlag = false;
    private boolean zbwjqrdsmDirtyFlag = false;
    private boolean cgfsDirtyFlag = false;
    private boolean cgggrqDirtyFlag = false;
    private boolean psrqDirtyFlag = false;
    private boolean jcryDirtyFlag = false;
    private boolean psdbDirtyFlag = false;
    private boolean cgjgbgpfrqDirtyFlag = false;
    private boolean dljgpsbgbhDirtyFlag = false;
    private boolean ztbwjgdrqDirtyFlag = false;
    private boolean ztbwjcfdDirtyFlag = false;
    private boolean cjzbgsDirtyFlag = false;
    private boolean htqdrqDirtyFlag = false;
    private boolean htzeDirtyFlag = false;
    private boolean htsmDirtyFlag = false;
    private boolean barqDirtyFlag = false;
    private boolean babsmDirtyFlag = false;
    private boolean zbbhjeDirtyFlag = false;
    private boolean bhcfddDirtyFlag = false;
    private boolean bhfyjcfddDirtyFlag = false;
    private boolean ydlxrqDirtyFlag = false;
    private boolean dycfkjdpsDirtyFlag = false;
    private boolean dycfkjeDirtyFlag = false;
    private boolean dyczfpsrqDirtyFlag = false;
    private boolean dyczfpssmDirtyFlag = false;
    private boolean deczfpssmDirtyFlag = false;
    private boolean dsczfpssmDirtyFlag = false;
    private boolean decfkjeDirtyFlag = false;
    private boolean dscfkjeDirtyFlag = false;
    private boolean decfkjdpsDirtyFlag = false;
    private boolean dscfkjdpsDirtyFlag = false;
    private boolean deczfpsrqDirtyFlag = false;
    private boolean dsczfpsrqDirtyFlag = false;
    private boolean ysrqDirtyFlag = false;
    private boolean ysbgsnDirtyFlag = false;
    private boolean tbrqDirtyFlag = false;
    private boolean wfykDirtyFlag = false;
    private boolean jxpgDirtyFlag = false;
    private boolean bzDirtyFlag = false;
    private boolean cgjgpssmDirtyFlag = false;

    @Column(name="oa_xmjdid")
    private String oa_xmjdid;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_xmjdname")
    private String oa_xmjdname;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="xmmc")
    private String xmmc;
    @Column(name="lxbg")
    private String lxbg;
    @Column(name="xmbh")
    private String xmbh;
    @Column(name="sdxmbhrq")
    private Timestamp sdxmbhrq;
    @Column(name="sdzzhbh")
    private String sdzzhbh;
    @Column(name="ysje")
    private Integer ysje;
    @Column(name="ksxczsbrq")
    private Timestamp ksxczsbrq;
    @Column(name="syzjwh")
    private String syzjwh;
    @Column(name="dlgs")
    private String dlgs;
    @Column(name="zbwjqrqz")
    private String zbwjqrqz;
    @Column(name="zbwjqrrq")
    private Timestamp zbwjqrrq;
    @Column(name="zbwjqrdsm")
    private String zbwjqrdsm;
    @Column(name="cgfs")
    private String cgfs;
    @Column(name="cgggrq")
    private Timestamp cgggrq;
    @Column(name="psrq")
    private Timestamp psrq;
    @Column(name="jcry")
    private String jcry;
    @Column(name="psdb")
    private String psdb;
    @Column(name="cgjgbgpfrq")
    private Timestamp cgjgbgpfrq;
    @Column(name="dljgpsbgbh")
    private String dljgpsbgbh;
    @Column(name="ztbwjgdrq")
    private Timestamp ztbwjgdrq;
    @Column(name="ztbwjcfd")
    private String ztbwjcfd;
    @Column(name="cjzbgs")
    private String cjzbgs;
    @Column(name="htqdrq")
    private Timestamp htqdrq;
    @Column(name="htze")
    private Integer htze;
    @Column(name="htsm")
    private String htsm;
    @Column(name="barq")
    private Timestamp barq;
    @Column(name="babsm")
    private String babsm;
    @Column(name="zbbhje")
    private Integer zbbhje;
    @Column(name="bhcfdd")
    private String bhcfdd;
    @Column(name="bhfyjcfdd")
    private String bhfyjcfdd;
    @Column(name="ydlxrq")
    private String ydlxrq;
    @Column(name="dycfkjdps")
    private String dycfkjdps;
    @Column(name="dycfkje")
    private Integer dycfkje;
    @Column(name="dyczfpsrq")
    private Timestamp dyczfpsrq;
    @Column(name="dyczfpssm")
    private String dyczfpssm;
    @Column(name="deczfpssm")
    private String deczfpssm;
    @Column(name="dsczfpssm")
    private String dsczfpssm;
    @Column(name="decfkje")
    private Integer decfkje;
    @Column(name="dscfkje")
    private Integer dscfkje;
    @Column(name="decfkjdps")
    private String decfkjdps;
    @Column(name="dscfkjdps")
    private String dscfkjdps;
    @Column(name="deczfpsrq")
    private Timestamp deczfpsrq;
    @Column(name="dsczfpsrq")
    private Timestamp dsczfpsrq;
    @Column(name="ysrq")
    private Timestamp ysrq;
    @Column(name="ysbgsn")
    private String ysbgsn;
    @Column(name="tbrq")
    private Timestamp tbrq;
    @Column(name="wfyk")
    private Integer wfyk;
    @Column(name="jxpg")
    private String jxpg;
    @Column(name="bz")
    private String bz;
    @Column(name="cgjgpssm")
    private String cgjgpssm;


    /**
     *  设置属性值[项目进度标识]
     *  @param oa_xmjdid
     */
    public void setOA_XMJDId(String oa_xmjdid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_XMJDId(oa_xmjdid);
            return;
        }
        if(oa_xmjdid!=null) {
            oa_xmjdid = StringHelper.trimRight(oa_xmjdid);
            if(oa_xmjdid.length()==0) {
                oa_xmjdid = null;
            }
        }
        this.oa_xmjdid =  oa_xmjdid;
        this.oa_xmjdidDirtyFlag  = true;
    }

    /**
     *  获取属性值[项目进度标识]
     */
    public String getOA_XMJDId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_XMJDId();
        }
        return this.oa_xmjdid;
    }

    /**
     *  获取属性值[项目进度标识]是否修改
     */
    public boolean isOA_XMJDIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_XMJDIdDirty();
        }
        return this.oa_xmjdidDirtyFlag;
    }

    /**
     *  重置属性值[项目进度标识]
     */
    public void resetOA_XMJDId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_XMJDId();
            return;
        }

        this.oa_xmjdidDirtyFlag = false;
        this.oa_xmjdid = null;
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
     *  设置属性值[项目进度名称]
     *  @param oa_xmjdname
     */
    public void setOA_XMJDName(String oa_xmjdname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_XMJDName(oa_xmjdname);
            return;
        }
        if(oa_xmjdname!=null) {
            oa_xmjdname = StringHelper.trimRight(oa_xmjdname);
            if(oa_xmjdname.length()==0) {
                oa_xmjdname = null;
            }
        }
        this.oa_xmjdname =  oa_xmjdname;
        this.oa_xmjdnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[项目进度名称]
     */
    public String getOA_XMJDName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_XMJDName();
        }
        return this.oa_xmjdname;
    }

    /**
     *  获取属性值[项目进度名称]是否修改
     */
    public boolean isOA_XMJDNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_XMJDNameDirty();
        }
        return this.oa_xmjdnameDirtyFlag;
    }

    /**
     *  重置属性值[项目进度名称]
     */
    public void resetOA_XMJDName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_XMJDName();
            return;
        }

        this.oa_xmjdnameDirtyFlag = false;
        this.oa_xmjdname = null;
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
     *  设置属性值[项目名称]
     *  @param xmmc
     */
    public void setXmmc(String xmmc) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXmmc(xmmc);
            return;
        }
        if(xmmc!=null) {
            xmmc = StringHelper.trimRight(xmmc);
            if(xmmc.length()==0) {
                xmmc = null;
            }
        }
        this.xmmc =  xmmc;
        this.xmmcDirtyFlag  = true;
    }

    /**
     *  获取属性值[项目名称]
     */
    public String getXmmc() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXmmc();
        }
        return this.xmmc;
    }

    /**
     *  获取属性值[项目名称]是否修改
     */
    public boolean isXmmcDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXmmcDirty();
        }
        return this.xmmcDirtyFlag;
    }

    /**
     *  重置属性值[项目名称]
     */
    public void resetXmmc() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXmmc();
            return;
        }

        this.xmmcDirtyFlag = false;
        this.xmmc = null;
    }
    /**
     *  设置属性值[立项报告]
     *  @param lxbg
     */
    public void setLxbg(String lxbg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLxbg(lxbg);
            return;
        }
        if(lxbg!=null) {
            lxbg = StringHelper.trimRight(lxbg);
            if(lxbg.length()==0) {
                lxbg = null;
            }
        }
        this.lxbg =  lxbg;
        this.lxbgDirtyFlag  = true;
    }

    /**
     *  获取属性值[立项报告]
     */
    public String getLxbg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLxbg();
        }
        return this.lxbg;
    }

    /**
     *  获取属性值[立项报告]是否修改
     */
    public boolean isLxbgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLxbgDirty();
        }
        return this.lxbgDirtyFlag;
    }

    /**
     *  重置属性值[立项报告]
     */
    public void resetLxbg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLxbg();
            return;
        }

        this.lxbgDirtyFlag = false;
        this.lxbg = null;
    }
    /**
     *  设置属性值[项目编号]
     *  @param xmbh
     */
    public void setXmbh(String xmbh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXmbh(xmbh);
            return;
        }
        if(xmbh!=null) {
            xmbh = StringHelper.trimRight(xmbh);
            if(xmbh.length()==0) {
                xmbh = null;
            }
        }
        this.xmbh =  xmbh;
        this.xmbhDirtyFlag  = true;
    }

    /**
     *  获取属性值[项目编号]
     */
    public String getXmbh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXmbh();
        }
        return this.xmbh;
    }

    /**
     *  获取属性值[项目编号]是否修改
     */
    public boolean isXmbhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXmbhDirty();
        }
        return this.xmbhDirtyFlag;
    }

    /**
     *  重置属性值[项目编号]
     */
    public void resetXmbh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXmbh();
            return;
        }

        this.xmbhDirtyFlag = false;
        this.xmbh = null;
    }
    /**
     *  设置属性值[收到项目编号日期]
     *  @param sdxmbhrq
     */
    public void setSDXMBHRQ(Timestamp sdxmbhrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSDXMBHRQ(sdxmbhrq);
            return;
        }
        this.sdxmbhrq =  sdxmbhrq;
        this.sdxmbhrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[收到项目编号日期]
     */
    public Timestamp getSDXMBHRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSDXMBHRQ();
        }
        return this.sdxmbhrq;
    }

    /**
     *  获取属性值[收到项目编号日期]是否修改
     */
    public boolean isSDXMBHRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSDXMBHRQDirty();
        }
        return this.sdxmbhrqDirtyFlag;
    }

    /**
     *  重置属性值[收到项目编号日期]
     */
    public void resetSDXMBHRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSDXMBHRQ();
            return;
        }

        this.sdxmbhrqDirtyFlag = false;
        this.sdxmbhrq = null;
    }
    /**
     *  设置属性值[上党组织会编号]
     *  @param sdzzhbh
     */
    public void setSdzzhbh(String sdzzhbh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSdzzhbh(sdzzhbh);
            return;
        }
        if(sdzzhbh!=null) {
            sdzzhbh = StringHelper.trimRight(sdzzhbh);
            if(sdzzhbh.length()==0) {
                sdzzhbh = null;
            }
        }
        this.sdzzhbh =  sdzzhbh;
        this.sdzzhbhDirtyFlag  = true;
    }

    /**
     *  获取属性值[上党组织会编号]
     */
    public String getSdzzhbh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSdzzhbh();
        }
        return this.sdzzhbh;
    }

    /**
     *  获取属性值[上党组织会编号]是否修改
     */
    public boolean isSdzzhbhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSdzzhbhDirty();
        }
        return this.sdzzhbhDirtyFlag;
    }

    /**
     *  重置属性值[上党组织会编号]
     */
    public void resetSdzzhbh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSdzzhbh();
            return;
        }

        this.sdzzhbhDirtyFlag = false;
        this.sdzzhbh = null;
    }
    /**
     *  设置属性值[预算金额]
     *  @param ysje
     */
    public void setYsje(Integer ysje) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYsje(ysje);
            return;
        }
        this.ysje =  ysje;
        this.ysjeDirtyFlag  = true;
    }

    /**
     *  获取属性值[预算金额]
     */
    public Integer getYsje() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYsje();
        }
        return this.ysje;
    }

    /**
     *  获取属性值[预算金额]是否修改
     */
    public boolean isYsjeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYsjeDirty();
        }
        return this.ysjeDirtyFlag;
    }

    /**
     *  重置属性值[预算金额]
     */
    public void resetYsje() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYsje();
            return;
        }

        this.ysjeDirtyFlag = false;
        this.ysje = null;
    }
    /**
     *  设置属性值[开始向财政申报期日期]
     *  @param ksxczsbrq
     */
    public void setKSXCZSBRQ(Timestamp ksxczsbrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setKSXCZSBRQ(ksxczsbrq);
            return;
        }
        this.ksxczsbrq =  ksxczsbrq;
        this.ksxczsbrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[开始向财政申报期日期]
     */
    public Timestamp getKSXCZSBRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getKSXCZSBRQ();
        }
        return this.ksxczsbrq;
    }

    /**
     *  获取属性值[开始向财政申报期日期]是否修改
     */
    public boolean isKSXCZSBRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isKSXCZSBRQDirty();
        }
        return this.ksxczsbrqDirtyFlag;
    }

    /**
     *  重置属性值[开始向财政申报期日期]
     */
    public void resetKSXCZSBRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetKSXCZSBRQ();
            return;
        }

        this.ksxczsbrqDirtyFlag = false;
        this.ksxczsbrq = null;
    }
    /**
     *  设置属性值[使用资金文号]
     *  @param syzjwh
     */
    public void setSyzjwh(String syzjwh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSyzjwh(syzjwh);
            return;
        }
        if(syzjwh!=null) {
            syzjwh = StringHelper.trimRight(syzjwh);
            if(syzjwh.length()==0) {
                syzjwh = null;
            }
        }
        this.syzjwh =  syzjwh;
        this.syzjwhDirtyFlag  = true;
    }

    /**
     *  获取属性值[使用资金文号]
     */
    public String getSyzjwh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSyzjwh();
        }
        return this.syzjwh;
    }

    /**
     *  获取属性值[使用资金文号]是否修改
     */
    public boolean isSyzjwhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSyzjwhDirty();
        }
        return this.syzjwhDirtyFlag;
    }

    /**
     *  重置属性值[使用资金文号]
     */
    public void resetSyzjwh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSyzjwh();
            return;
        }

        this.syzjwhDirtyFlag = false;
        this.syzjwh = null;
    }
    /**
     *  设置属性值[代理公司]
     *  @param dlgs
     */
    public void setDlgs(String dlgs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDlgs(dlgs);
            return;
        }
        if(dlgs!=null) {
            dlgs = StringHelper.trimRight(dlgs);
            if(dlgs.length()==0) {
                dlgs = null;
            }
        }
        this.dlgs =  dlgs;
        this.dlgsDirtyFlag  = true;
    }

    /**
     *  获取属性值[代理公司]
     */
    public String getDlgs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDlgs();
        }
        return this.dlgs;
    }

    /**
     *  获取属性值[代理公司]是否修改
     */
    public boolean isDlgsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDlgsDirty();
        }
        return this.dlgsDirtyFlag;
    }

    /**
     *  重置属性值[代理公司]
     */
    public void resetDlgs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDlgs();
            return;
        }

        this.dlgsDirtyFlag = false;
        this.dlgs = null;
    }
    /**
     *  设置属性值[招标文件确认签字]
     *  @param zbwjqrqz
     */
    public void setZbwjqrqz(String zbwjqrqz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZbwjqrqz(zbwjqrqz);
            return;
        }
        if(zbwjqrqz!=null) {
            zbwjqrqz = StringHelper.trimRight(zbwjqrqz);
            if(zbwjqrqz.length()==0) {
                zbwjqrqz = null;
            }
        }
        this.zbwjqrqz =  zbwjqrqz;
        this.zbwjqrqzDirtyFlag  = true;
    }

    /**
     *  获取属性值[招标文件确认签字]
     */
    public String getZbwjqrqz() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZbwjqrqz();
        }
        return this.zbwjqrqz;
    }

    /**
     *  获取属性值[招标文件确认签字]是否修改
     */
    public boolean isZbwjqrqzDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZbwjqrqzDirty();
        }
        return this.zbwjqrqzDirtyFlag;
    }

    /**
     *  重置属性值[招标文件确认签字]
     */
    public void resetZbwjqrqz() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZbwjqrqz();
            return;
        }

        this.zbwjqrqzDirtyFlag = false;
        this.zbwjqrqz = null;
    }
    /**
     *  设置属性值[招标文件确认日期]
     *  @param zbwjqrrq
     */
    public void setZBWJQRRQ(Timestamp zbwjqrrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZBWJQRRQ(zbwjqrrq);
            return;
        }
        this.zbwjqrrq =  zbwjqrrq;
        this.zbwjqrrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[招标文件确认日期]
     */
    public Timestamp getZBWJQRRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZBWJQRRQ();
        }
        return this.zbwjqrrq;
    }

    /**
     *  获取属性值[招标文件确认日期]是否修改
     */
    public boolean isZBWJQRRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZBWJQRRQDirty();
        }
        return this.zbwjqrrqDirtyFlag;
    }

    /**
     *  重置属性值[招标文件确认日期]
     */
    public void resetZBWJQRRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZBWJQRRQ();
            return;
        }

        this.zbwjqrrqDirtyFlag = false;
        this.zbwjqrrq = null;
    }
    /**
     *  设置属性值[招标文件确认单扫描]
     *  @param zbwjqrdsm
     */
    public void setZbwjqrdsm(String zbwjqrdsm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZbwjqrdsm(zbwjqrdsm);
            return;
        }
        if(zbwjqrdsm!=null) {
            zbwjqrdsm = StringHelper.trimRight(zbwjqrdsm);
            if(zbwjqrdsm.length()==0) {
                zbwjqrdsm = null;
            }
        }
        this.zbwjqrdsm =  zbwjqrdsm;
        this.zbwjqrdsmDirtyFlag  = true;
    }

    /**
     *  获取属性值[招标文件确认单扫描]
     */
    public String getZbwjqrdsm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZbwjqrdsm();
        }
        return this.zbwjqrdsm;
    }

    /**
     *  获取属性值[招标文件确认单扫描]是否修改
     */
    public boolean isZbwjqrdsmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZbwjqrdsmDirty();
        }
        return this.zbwjqrdsmDirtyFlag;
    }

    /**
     *  重置属性值[招标文件确认单扫描]
     */
    public void resetZbwjqrdsm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZbwjqrdsm();
            return;
        }

        this.zbwjqrdsmDirtyFlag = false;
        this.zbwjqrdsm = null;
    }
    /**
     *  设置属性值[采购方式]
     *  @param cgfs
     */
    public void setCgfs(String cgfs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCgfs(cgfs);
            return;
        }
        if(cgfs!=null) {
            cgfs = StringHelper.trimRight(cgfs);
            if(cgfs.length()==0) {
                cgfs = null;
            }
        }
        this.cgfs =  cgfs;
        this.cgfsDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购方式]
     */
    public String getCgfs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCgfs();
        }
        return this.cgfs;
    }

    /**
     *  获取属性值[采购方式]是否修改
     */
    public boolean isCgfsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCgfsDirty();
        }
        return this.cgfsDirtyFlag;
    }

    /**
     *  重置属性值[采购方式]
     */
    public void resetCgfs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCgfs();
            return;
        }

        this.cgfsDirtyFlag = false;
        this.cgfs = null;
    }
    /**
     *  设置属性值[采购公告日期]
     *  @param cgggrq
     */
    public void setCGGGRQ(Timestamp cgggrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCGGGRQ(cgggrq);
            return;
        }
        this.cgggrq =  cgggrq;
        this.cgggrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购公告日期]
     */
    public Timestamp getCGGGRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCGGGRQ();
        }
        return this.cgggrq;
    }

    /**
     *  获取属性值[采购公告日期]是否修改
     */
    public boolean isCGGGRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCGGGRQDirty();
        }
        return this.cgggrqDirtyFlag;
    }

    /**
     *  重置属性值[采购公告日期]
     */
    public void resetCGGGRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCGGGRQ();
            return;
        }

        this.cgggrqDirtyFlag = false;
        this.cgggrq = null;
    }
    /**
     *  设置属性值[评审日期]
     *  @param psrq
     */
    public void setPSRQ(Timestamp psrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPSRQ(psrq);
            return;
        }
        this.psrq =  psrq;
        this.psrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[评审日期]
     */
    public Timestamp getPSRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPSRQ();
        }
        return this.psrq;
    }

    /**
     *  获取属性值[评审日期]是否修改
     */
    public boolean isPSRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPSRQDirty();
        }
        return this.psrqDirtyFlag;
    }

    /**
     *  重置属性值[评审日期]
     */
    public void resetPSRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPSRQ();
            return;
        }

        this.psrqDirtyFlag = false;
        this.psrq = null;
    }
    /**
     *  设置属性值[监察人员]
     *  @param jcry
     */
    public void setJcry(String jcry) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJcry(jcry);
            return;
        }
        if(jcry!=null) {
            jcry = StringHelper.trimRight(jcry);
            if(jcry.length()==0) {
                jcry = null;
            }
        }
        this.jcry =  jcry;
        this.jcryDirtyFlag  = true;
    }

    /**
     *  获取属性值[监察人员]
     */
    public String getJcry() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJcry();
        }
        return this.jcry;
    }

    /**
     *  获取属性值[监察人员]是否修改
     */
    public boolean isJcryDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJcryDirty();
        }
        return this.jcryDirtyFlag;
    }

    /**
     *  重置属性值[监察人员]
     */
    public void resetJcry() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJcry();
            return;
        }

        this.jcryDirtyFlag = false;
        this.jcry = null;
    }
    /**
     *  设置属性值[评审代表]
     *  @param psdb
     */
    public void setPsdb(String psdb) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPsdb(psdb);
            return;
        }
        if(psdb!=null) {
            psdb = StringHelper.trimRight(psdb);
            if(psdb.length()==0) {
                psdb = null;
            }
        }
        this.psdb =  psdb;
        this.psdbDirtyFlag  = true;
    }

    /**
     *  获取属性值[评审代表]
     */
    public String getPsdb() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPsdb();
        }
        return this.psdb;
    }

    /**
     *  获取属性值[评审代表]是否修改
     */
    public boolean isPsdbDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPsdbDirty();
        }
        return this.psdbDirtyFlag;
    }

    /**
     *  重置属性值[评审代表]
     */
    public void resetPsdb() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPsdb();
            return;
        }

        this.psdbDirtyFlag = false;
        this.psdb = null;
    }
    /**
     *  设置属性值[采购结果报告批复日期]
     *  @param cgjgbgpfrq
     */
    public void setCGJGBGPFRQ(Timestamp cgjgbgpfrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCGJGBGPFRQ(cgjgbgpfrq);
            return;
        }
        this.cgjgbgpfrq =  cgjgbgpfrq;
        this.cgjgbgpfrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购结果报告批复日期]
     */
    public Timestamp getCGJGBGPFRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCGJGBGPFRQ();
        }
        return this.cgjgbgpfrq;
    }

    /**
     *  获取属性值[采购结果报告批复日期]是否修改
     */
    public boolean isCGJGBGPFRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCGJGBGPFRQDirty();
        }
        return this.cgjgbgpfrqDirtyFlag;
    }

    /**
     *  重置属性值[采购结果报告批复日期]
     */
    public void resetCGJGBGPFRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCGJGBGPFRQ();
            return;
        }

        this.cgjgbgpfrqDirtyFlag = false;
        this.cgjgbgpfrq = null;
    }
    /**
     *  设置属性值[代理机构评审报告编号]
     *  @param dljgpsbgbh
     */
    public void setDljgpsbgbh(String dljgpsbgbh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDljgpsbgbh(dljgpsbgbh);
            return;
        }
        if(dljgpsbgbh!=null) {
            dljgpsbgbh = StringHelper.trimRight(dljgpsbgbh);
            if(dljgpsbgbh.length()==0) {
                dljgpsbgbh = null;
            }
        }
        this.dljgpsbgbh =  dljgpsbgbh;
        this.dljgpsbgbhDirtyFlag  = true;
    }

    /**
     *  获取属性值[代理机构评审报告编号]
     */
    public String getDljgpsbgbh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDljgpsbgbh();
        }
        return this.dljgpsbgbh;
    }

    /**
     *  获取属性值[代理机构评审报告编号]是否修改
     */
    public boolean isDljgpsbgbhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDljgpsbgbhDirty();
        }
        return this.dljgpsbgbhDirtyFlag;
    }

    /**
     *  重置属性值[代理机构评审报告编号]
     */
    public void resetDljgpsbgbh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDljgpsbgbh();
            return;
        }

        this.dljgpsbgbhDirtyFlag = false;
        this.dljgpsbgbh = null;
    }
    /**
     *  设置属性值[招投标文件归档日期]
     *  @param ztbwjgdrq
     */
    public void setZTBWJGDRQ(Timestamp ztbwjgdrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZTBWJGDRQ(ztbwjgdrq);
            return;
        }
        this.ztbwjgdrq =  ztbwjgdrq;
        this.ztbwjgdrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[招投标文件归档日期]
     */
    public Timestamp getZTBWJGDRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZTBWJGDRQ();
        }
        return this.ztbwjgdrq;
    }

    /**
     *  获取属性值[招投标文件归档日期]是否修改
     */
    public boolean isZTBWJGDRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZTBWJGDRQDirty();
        }
        return this.ztbwjgdrqDirtyFlag;
    }

    /**
     *  重置属性值[招投标文件归档日期]
     */
    public void resetZTBWJGDRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZTBWJGDRQ();
            return;
        }

        this.ztbwjgdrqDirtyFlag = false;
        this.ztbwjgdrq = null;
    }
    /**
     *  设置属性值[招投标文件存放地]
     *  @param ztbwjcfd
     */
    public void setZtbwjcfd(String ztbwjcfd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZtbwjcfd(ztbwjcfd);
            return;
        }
        if(ztbwjcfd!=null) {
            ztbwjcfd = StringHelper.trimRight(ztbwjcfd);
            if(ztbwjcfd.length()==0) {
                ztbwjcfd = null;
            }
        }
        this.ztbwjcfd =  ztbwjcfd;
        this.ztbwjcfdDirtyFlag  = true;
    }

    /**
     *  获取属性值[招投标文件存放地]
     */
    public String getZtbwjcfd() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZtbwjcfd();
        }
        return this.ztbwjcfd;
    }

    /**
     *  获取属性值[招投标文件存放地]是否修改
     */
    public boolean isZtbwjcfdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZtbwjcfdDirty();
        }
        return this.ztbwjcfdDirtyFlag;
    }

    /**
     *  重置属性值[招投标文件存放地]
     */
    public void resetZtbwjcfd() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZtbwjcfd();
            return;
        }

        this.ztbwjcfdDirtyFlag = false;
        this.ztbwjcfd = null;
    }
    /**
     *  设置属性值[成交中标公司]
     *  @param cjzbgs
     */
    public void setCjzbgs(String cjzbgs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCjzbgs(cjzbgs);
            return;
        }
        if(cjzbgs!=null) {
            cjzbgs = StringHelper.trimRight(cjzbgs);
            if(cjzbgs.length()==0) {
                cjzbgs = null;
            }
        }
        this.cjzbgs =  cjzbgs;
        this.cjzbgsDirtyFlag  = true;
    }

    /**
     *  获取属性值[成交中标公司]
     */
    public String getCjzbgs() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCjzbgs();
        }
        return this.cjzbgs;
    }

    /**
     *  获取属性值[成交中标公司]是否修改
     */
    public boolean isCjzbgsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCjzbgsDirty();
        }
        return this.cjzbgsDirtyFlag;
    }

    /**
     *  重置属性值[成交中标公司]
     */
    public void resetCjzbgs() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCjzbgs();
            return;
        }

        this.cjzbgsDirtyFlag = false;
        this.cjzbgs = null;
    }
    /**
     *  设置属性值[合同签订日期]
     *  @param htqdrq
     */
    public void setHTQDRQ(Timestamp htqdrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHTQDRQ(htqdrq);
            return;
        }
        this.htqdrq =  htqdrq;
        this.htqdrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[合同签订日期]
     */
    public Timestamp getHTQDRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHTQDRQ();
        }
        return this.htqdrq;
    }

    /**
     *  获取属性值[合同签订日期]是否修改
     */
    public boolean isHTQDRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHTQDRQDirty();
        }
        return this.htqdrqDirtyFlag;
    }

    /**
     *  重置属性值[合同签订日期]
     */
    public void resetHTQDRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHTQDRQ();
            return;
        }

        this.htqdrqDirtyFlag = false;
        this.htqdrq = null;
    }
    /**
     *  设置属性值[合同总额]
     *  @param htze
     */
    public void setHtze(Integer htze) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHtze(htze);
            return;
        }
        this.htze =  htze;
        this.htzeDirtyFlag  = true;
    }

    /**
     *  获取属性值[合同总额]
     */
    public Integer getHtze() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHtze();
        }
        return this.htze;
    }

    /**
     *  获取属性值[合同总额]是否修改
     */
    public boolean isHtzeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHtzeDirty();
        }
        return this.htzeDirtyFlag;
    }

    /**
     *  重置属性值[合同总额]
     */
    public void resetHtze() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHtze();
            return;
        }

        this.htzeDirtyFlag = false;
        this.htze = null;
    }
    /**
     *  设置属性值[合同扫描]
     *  @param htsm
     */
    public void setHtsm(String htsm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setHtsm(htsm);
            return;
        }
        if(htsm!=null) {
            htsm = StringHelper.trimRight(htsm);
            if(htsm.length()==0) {
                htsm = null;
            }
        }
        this.htsm =  htsm;
        this.htsmDirtyFlag  = true;
    }

    /**
     *  获取属性值[合同扫描]
     */
    public String getHtsm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getHtsm();
        }
        return this.htsm;
    }

    /**
     *  获取属性值[合同扫描]是否修改
     */
    public boolean isHtsmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isHtsmDirty();
        }
        return this.htsmDirtyFlag;
    }

    /**
     *  重置属性值[合同扫描]
     */
    public void resetHtsm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetHtsm();
            return;
        }

        this.htsmDirtyFlag = false;
        this.htsm = null;
    }
    /**
     *  设置属性值[备案日期]
     *  @param barq
     */
    public void setBARQ(Timestamp barq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBARQ(barq);
            return;
        }
        this.barq =  barq;
        this.barqDirtyFlag  = true;
    }

    /**
     *  获取属性值[备案日期]
     */
    public Timestamp getBARQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBARQ();
        }
        return this.barq;
    }

    /**
     *  获取属性值[备案日期]是否修改
     */
    public boolean isBARQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBARQDirty();
        }
        return this.barqDirtyFlag;
    }

    /**
     *  重置属性值[备案日期]
     */
    public void resetBARQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBARQ();
            return;
        }

        this.barqDirtyFlag = false;
        this.barq = null;
    }
    /**
     *  设置属性值[备案表扫描]
     *  @param babsm
     */
    public void setBabsm(String babsm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBabsm(babsm);
            return;
        }
        if(babsm!=null) {
            babsm = StringHelper.trimRight(babsm);
            if(babsm.length()==0) {
                babsm = null;
            }
        }
        this.babsm =  babsm;
        this.babsmDirtyFlag  = true;
    }

    /**
     *  获取属性值[备案表扫描]
     */
    public String getBabsm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBabsm();
        }
        return this.babsm;
    }

    /**
     *  获取属性值[备案表扫描]是否修改
     */
    public boolean isBabsmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBabsmDirty();
        }
        return this.babsmDirtyFlag;
    }

    /**
     *  重置属性值[备案表扫描]
     */
    public void resetBabsm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBabsm();
            return;
        }

        this.babsmDirtyFlag = false;
        this.babsm = null;
    }
    /**
     *  设置属性值[质保保函金额]
     *  @param zbbhje
     */
    public void setZbbhje(Integer zbbhje) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZbbhje(zbbhje);
            return;
        }
        this.zbbhje =  zbbhje;
        this.zbbhjeDirtyFlag  = true;
    }

    /**
     *  获取属性值[质保保函金额]
     */
    public Integer getZbbhje() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZbbhje();
        }
        return this.zbbhje;
    }

    /**
     *  获取属性值[质保保函金额]是否修改
     */
    public boolean isZbbhjeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZbbhjeDirty();
        }
        return this.zbbhjeDirtyFlag;
    }

    /**
     *  重置属性值[质保保函金额]
     */
    public void resetZbbhje() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZbbhje();
            return;
        }

        this.zbbhjeDirtyFlag = false;
        this.zbbhje = null;
    }
    /**
     *  设置属性值[保函存放地点]
     *  @param bhcfdd
     */
    public void setBhcfdd(String bhcfdd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBhcfdd(bhcfdd);
            return;
        }
        if(bhcfdd!=null) {
            bhcfdd = StringHelper.trimRight(bhcfdd);
            if(bhcfdd.length()==0) {
                bhcfdd = null;
            }
        }
        this.bhcfdd =  bhcfdd;
        this.bhcfddDirtyFlag  = true;
    }

    /**
     *  获取属性值[保函存放地点]
     */
    public String getBhcfdd() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBhcfdd();
        }
        return this.bhcfdd;
    }

    /**
     *  获取属性值[保函存放地点]是否修改
     */
    public boolean isBhcfddDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBhcfddDirty();
        }
        return this.bhcfddDirtyFlag;
    }

    /**
     *  重置属性值[保函存放地点]
     */
    public void resetBhcfdd() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBhcfdd();
            return;
        }

        this.bhcfddDirtyFlag = false;
        this.bhcfdd = null;
    }
    /**
     *  设置属性值[保函复印件存放地点]
     *  @param bhfyjcfdd
     */
    public void setBhfyjcfdd(String bhfyjcfdd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBhfyjcfdd(bhfyjcfdd);
            return;
        }
        if(bhfyjcfdd!=null) {
            bhfyjcfdd = StringHelper.trimRight(bhfyjcfdd);
            if(bhfyjcfdd.length()==0) {
                bhfyjcfdd = null;
            }
        }
        this.bhfyjcfdd =  bhfyjcfdd;
        this.bhfyjcfddDirtyFlag  = true;
    }

    /**
     *  获取属性值[保函复印件存放地点]
     */
    public String getBhfyjcfdd() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBhfyjcfdd();
        }
        return this.bhfyjcfdd;
    }

    /**
     *  获取属性值[保函复印件存放地点]是否修改
     */
    public boolean isBhfyjcfddDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBhfyjcfddDirty();
        }
        return this.bhfyjcfddDirtyFlag;
    }

    /**
     *  重置属性值[保函复印件存放地点]
     */
    public void resetBhfyjcfdd() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBhfyjcfdd();
            return;
        }

        this.bhfyjcfddDirtyFlag = false;
        this.bhfyjcfdd = null;
    }
    /**
     *  设置属性值[约定履行日期]
     *  @param ydlxrq
     */
    public void setYdlxrq(String ydlxrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYdlxrq(ydlxrq);
            return;
        }
        if(ydlxrq!=null) {
            ydlxrq = StringHelper.trimRight(ydlxrq);
            if(ydlxrq.length()==0) {
                ydlxrq = null;
            }
        }
        this.ydlxrq =  ydlxrq;
        this.ydlxrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[约定履行日期]
     */
    public String getYdlxrq() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYdlxrq();
        }
        return this.ydlxrq;
    }

    /**
     *  获取属性值[约定履行日期]是否修改
     */
    public boolean isYdlxrqDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYdlxrqDirty();
        }
        return this.ydlxrqDirtyFlag;
    }

    /**
     *  重置属性值[约定履行日期]
     */
    public void resetYdlxrq() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYdlxrq();
            return;
        }

        this.ydlxrqDirtyFlag = false;
        this.ydlxrq = null;
    }
    /**
     *  设置属性值[第一次付款进度批示]
     *  @param dycfkjdps
     */
    public void setDycfkjdps(String dycfkjdps) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDycfkjdps(dycfkjdps);
            return;
        }
        if(dycfkjdps!=null) {
            dycfkjdps = StringHelper.trimRight(dycfkjdps);
            if(dycfkjdps.length()==0) {
                dycfkjdps = null;
            }
        }
        this.dycfkjdps =  dycfkjdps;
        this.dycfkjdpsDirtyFlag  = true;
    }

    /**
     *  获取属性值[第一次付款进度批示]
     */
    public String getDycfkjdps() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDycfkjdps();
        }
        return this.dycfkjdps;
    }

    /**
     *  获取属性值[第一次付款进度批示]是否修改
     */
    public boolean isDycfkjdpsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDycfkjdpsDirty();
        }
        return this.dycfkjdpsDirtyFlag;
    }

    /**
     *  重置属性值[第一次付款进度批示]
     */
    public void resetDycfkjdps() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDycfkjdps();
            return;
        }

        this.dycfkjdpsDirtyFlag = false;
        this.dycfkjdps = null;
    }
    /**
     *  设置属性值[第一次付款金额]
     *  @param dycfkje
     */
    public void setDycfkje(Integer dycfkje) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDycfkje(dycfkje);
            return;
        }
        this.dycfkje =  dycfkje;
        this.dycfkjeDirtyFlag  = true;
    }

    /**
     *  获取属性值[第一次付款金额]
     */
    public Integer getDycfkje() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDycfkje();
        }
        return this.dycfkje;
    }

    /**
     *  获取属性值[第一次付款金额]是否修改
     */
    public boolean isDycfkjeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDycfkjeDirty();
        }
        return this.dycfkjeDirtyFlag;
    }

    /**
     *  重置属性值[第一次付款金额]
     */
    public void resetDycfkje() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDycfkje();
            return;
        }

        this.dycfkjeDirtyFlag = false;
        this.dycfkje = null;
    }
    /**
     *  设置属性值[第一次支付批示日期]
     *  @param dyczfpsrq
     */
    public void setDYCZFPSRQ(Timestamp dyczfpsrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDYCZFPSRQ(dyczfpsrq);
            return;
        }
        this.dyczfpsrq =  dyczfpsrq;
        this.dyczfpsrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[第一次支付批示日期]
     */
    public Timestamp getDYCZFPSRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDYCZFPSRQ();
        }
        return this.dyczfpsrq;
    }

    /**
     *  获取属性值[第一次支付批示日期]是否修改
     */
    public boolean isDYCZFPSRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDYCZFPSRQDirty();
        }
        return this.dyczfpsrqDirtyFlag;
    }

    /**
     *  重置属性值[第一次支付批示日期]
     */
    public void resetDYCZFPSRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDYCZFPSRQ();
            return;
        }

        this.dyczfpsrqDirtyFlag = false;
        this.dyczfpsrq = null;
    }
    /**
     *  设置属性值[第一次支付批示扫描]
     *  @param dyczfpssm
     */
    public void setDyczfpssm(String dyczfpssm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDyczfpssm(dyczfpssm);
            return;
        }
        if(dyczfpssm!=null) {
            dyczfpssm = StringHelper.trimRight(dyczfpssm);
            if(dyczfpssm.length()==0) {
                dyczfpssm = null;
            }
        }
        this.dyczfpssm =  dyczfpssm;
        this.dyczfpssmDirtyFlag  = true;
    }

    /**
     *  获取属性值[第一次支付批示扫描]
     */
    public String getDyczfpssm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDyczfpssm();
        }
        return this.dyczfpssm;
    }

    /**
     *  获取属性值[第一次支付批示扫描]是否修改
     */
    public boolean isDyczfpssmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDyczfpssmDirty();
        }
        return this.dyczfpssmDirtyFlag;
    }

    /**
     *  重置属性值[第一次支付批示扫描]
     */
    public void resetDyczfpssm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDyczfpssm();
            return;
        }

        this.dyczfpssmDirtyFlag = false;
        this.dyczfpssm = null;
    }
    /**
     *  设置属性值[第二次支付批示扫描]
     *  @param deczfpssm
     */
    public void setDeczfpssm(String deczfpssm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDeczfpssm(deczfpssm);
            return;
        }
        if(deczfpssm!=null) {
            deczfpssm = StringHelper.trimRight(deczfpssm);
            if(deczfpssm.length()==0) {
                deczfpssm = null;
            }
        }
        this.deczfpssm =  deczfpssm;
        this.deczfpssmDirtyFlag  = true;
    }

    /**
     *  获取属性值[第二次支付批示扫描]
     */
    public String getDeczfpssm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDeczfpssm();
        }
        return this.deczfpssm;
    }

    /**
     *  获取属性值[第二次支付批示扫描]是否修改
     */
    public boolean isDeczfpssmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDeczfpssmDirty();
        }
        return this.deczfpssmDirtyFlag;
    }

    /**
     *  重置属性值[第二次支付批示扫描]
     */
    public void resetDeczfpssm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDeczfpssm();
            return;
        }

        this.deczfpssmDirtyFlag = false;
        this.deczfpssm = null;
    }
    /**
     *  设置属性值[第三次支付批示扫描]
     *  @param dsczfpssm
     */
    public void setDsczfpssm(String dsczfpssm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDsczfpssm(dsczfpssm);
            return;
        }
        if(dsczfpssm!=null) {
            dsczfpssm = StringHelper.trimRight(dsczfpssm);
            if(dsczfpssm.length()==0) {
                dsczfpssm = null;
            }
        }
        this.dsczfpssm =  dsczfpssm;
        this.dsczfpssmDirtyFlag  = true;
    }

    /**
     *  获取属性值[第三次支付批示扫描]
     */
    public String getDsczfpssm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDsczfpssm();
        }
        return this.dsczfpssm;
    }

    /**
     *  获取属性值[第三次支付批示扫描]是否修改
     */
    public boolean isDsczfpssmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDsczfpssmDirty();
        }
        return this.dsczfpssmDirtyFlag;
    }

    /**
     *  重置属性值[第三次支付批示扫描]
     */
    public void resetDsczfpssm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDsczfpssm();
            return;
        }

        this.dsczfpssmDirtyFlag = false;
        this.dsczfpssm = null;
    }
    /**
     *  设置属性值[第二次付款金额]
     *  @param decfkje
     */
    public void setDecfkje(Integer decfkje) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDecfkje(decfkje);
            return;
        }
        this.decfkje =  decfkje;
        this.decfkjeDirtyFlag  = true;
    }

    /**
     *  获取属性值[第二次付款金额]
     */
    public Integer getDecfkje() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDecfkje();
        }
        return this.decfkje;
    }

    /**
     *  获取属性值[第二次付款金额]是否修改
     */
    public boolean isDecfkjeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDecfkjeDirty();
        }
        return this.decfkjeDirtyFlag;
    }

    /**
     *  重置属性值[第二次付款金额]
     */
    public void resetDecfkje() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDecfkje();
            return;
        }

        this.decfkjeDirtyFlag = false;
        this.decfkje = null;
    }
    /**
     *  设置属性值[第三次付款金额]
     *  @param dscfkje
     */
    public void setDscfkje(Integer dscfkje) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDscfkje(dscfkje);
            return;
        }
        this.dscfkje =  dscfkje;
        this.dscfkjeDirtyFlag  = true;
    }

    /**
     *  获取属性值[第三次付款金额]
     */
    public Integer getDscfkje() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDscfkje();
        }
        return this.dscfkje;
    }

    /**
     *  获取属性值[第三次付款金额]是否修改
     */
    public boolean isDscfkjeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDscfkjeDirty();
        }
        return this.dscfkjeDirtyFlag;
    }

    /**
     *  重置属性值[第三次付款金额]
     */
    public void resetDscfkje() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDscfkje();
            return;
        }

        this.dscfkjeDirtyFlag = false;
        this.dscfkje = null;
    }
    /**
     *  设置属性值[第二次付款进度批示]
     *  @param decfkjdps
     */
    public void setDecfkjdps(String decfkjdps) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDecfkjdps(decfkjdps);
            return;
        }
        if(decfkjdps!=null) {
            decfkjdps = StringHelper.trimRight(decfkjdps);
            if(decfkjdps.length()==0) {
                decfkjdps = null;
            }
        }
        this.decfkjdps =  decfkjdps;
        this.decfkjdpsDirtyFlag  = true;
    }

    /**
     *  获取属性值[第二次付款进度批示]
     */
    public String getDecfkjdps() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDecfkjdps();
        }
        return this.decfkjdps;
    }

    /**
     *  获取属性值[第二次付款进度批示]是否修改
     */
    public boolean isDecfkjdpsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDecfkjdpsDirty();
        }
        return this.decfkjdpsDirtyFlag;
    }

    /**
     *  重置属性值[第二次付款进度批示]
     */
    public void resetDecfkjdps() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDecfkjdps();
            return;
        }

        this.decfkjdpsDirtyFlag = false;
        this.decfkjdps = null;
    }
    /**
     *  设置属性值[第三次付款进度批示]
     *  @param dscfkjdps
     */
    public void setDscfkjdps(String dscfkjdps) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDscfkjdps(dscfkjdps);
            return;
        }
        if(dscfkjdps!=null) {
            dscfkjdps = StringHelper.trimRight(dscfkjdps);
            if(dscfkjdps.length()==0) {
                dscfkjdps = null;
            }
        }
        this.dscfkjdps =  dscfkjdps;
        this.dscfkjdpsDirtyFlag  = true;
    }

    /**
     *  获取属性值[第三次付款进度批示]
     */
    public String getDscfkjdps() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDscfkjdps();
        }
        return this.dscfkjdps;
    }

    /**
     *  获取属性值[第三次付款进度批示]是否修改
     */
    public boolean isDscfkjdpsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDscfkjdpsDirty();
        }
        return this.dscfkjdpsDirtyFlag;
    }

    /**
     *  重置属性值[第三次付款进度批示]
     */
    public void resetDscfkjdps() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDscfkjdps();
            return;
        }

        this.dscfkjdpsDirtyFlag = false;
        this.dscfkjdps = null;
    }
    /**
     *  设置属性值[第二次支付批示日期]
     *  @param deczfpsrq
     */
    public void setDECZFPSRQ(Timestamp deczfpsrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDECZFPSRQ(deczfpsrq);
            return;
        }
        this.deczfpsrq =  deczfpsrq;
        this.deczfpsrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[第二次支付批示日期]
     */
    public Timestamp getDECZFPSRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDECZFPSRQ();
        }
        return this.deczfpsrq;
    }

    /**
     *  获取属性值[第二次支付批示日期]是否修改
     */
    public boolean isDECZFPSRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDECZFPSRQDirty();
        }
        return this.deczfpsrqDirtyFlag;
    }

    /**
     *  重置属性值[第二次支付批示日期]
     */
    public void resetDECZFPSRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDECZFPSRQ();
            return;
        }

        this.deczfpsrqDirtyFlag = false;
        this.deczfpsrq = null;
    }
    /**
     *  设置属性值[第三次支付批示日期]
     *  @param dsczfpsrq
     */
    public void setDSCZFPSRQ(Timestamp dsczfpsrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDSCZFPSRQ(dsczfpsrq);
            return;
        }
        this.dsczfpsrq =  dsczfpsrq;
        this.dsczfpsrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[第三次支付批示日期]
     */
    public Timestamp getDSCZFPSRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDSCZFPSRQ();
        }
        return this.dsczfpsrq;
    }

    /**
     *  获取属性值[第三次支付批示日期]是否修改
     */
    public boolean isDSCZFPSRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDSCZFPSRQDirty();
        }
        return this.dsczfpsrqDirtyFlag;
    }

    /**
     *  重置属性值[第三次支付批示日期]
     */
    public void resetDSCZFPSRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDSCZFPSRQ();
            return;
        }

        this.dsczfpsrqDirtyFlag = false;
        this.dsczfpsrq = null;
    }
    /**
     *  设置属性值[验收日期]
     *  @param ysrq
     */
    public void setYSRQ(Timestamp ysrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYSRQ(ysrq);
            return;
        }
        this.ysrq =  ysrq;
        this.ysrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[验收日期]
     */
    public Timestamp getYSRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYSRQ();
        }
        return this.ysrq;
    }

    /**
     *  获取属性值[验收日期]是否修改
     */
    public boolean isYSRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYSRQDirty();
        }
        return this.ysrqDirtyFlag;
    }

    /**
     *  重置属性值[验收日期]
     */
    public void resetYSRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYSRQ();
            return;
        }

        this.ysrqDirtyFlag = false;
        this.ysrq = null;
    }
    /**
     *  设置属性值[要收报告扫描]
     *  @param ysbgsn
     */
    public void setYsbgsn(String ysbgsn) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYsbgsn(ysbgsn);
            return;
        }
        if(ysbgsn!=null) {
            ysbgsn = StringHelper.trimRight(ysbgsn);
            if(ysbgsn.length()==0) {
                ysbgsn = null;
            }
        }
        this.ysbgsn =  ysbgsn;
        this.ysbgsnDirtyFlag  = true;
    }

    /**
     *  获取属性值[要收报告扫描]
     */
    public String getYsbgsn() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYsbgsn();
        }
        return this.ysbgsn;
    }

    /**
     *  获取属性值[要收报告扫描]是否修改
     */
    public boolean isYsbgsnDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYsbgsnDirty();
        }
        return this.ysbgsnDirtyFlag;
    }

    /**
     *  重置属性值[要收报告扫描]
     */
    public void resetYsbgsn() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYsbgsn();
            return;
        }

        this.ysbgsnDirtyFlag = false;
        this.ysbgsn = null;
    }
    /**
     *  设置属性值[退保日期]
     *  @param tbrq
     */
    public void setTBRQ(Timestamp tbrq) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTBRQ(tbrq);
            return;
        }
        this.tbrq =  tbrq;
        this.tbrqDirtyFlag  = true;
    }

    /**
     *  获取属性值[退保日期]
     */
    public Timestamp getTBRQ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTBRQ();
        }
        return this.tbrq;
    }

    /**
     *  获取属性值[退保日期]是否修改
     */
    public boolean isTBRQDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTBRQDirty();
        }
        return this.tbrqDirtyFlag;
    }

    /**
     *  重置属性值[退保日期]
     */
    public void resetTBRQ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTBRQ();
            return;
        }

        this.tbrqDirtyFlag = false;
        this.tbrq = null;
    }
    /**
     *  设置属性值[未付余款]
     *  @param wfyk
     */
    public void setWfyk(Integer wfyk) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWfyk(wfyk);
            return;
        }
        this.wfyk =  wfyk;
        this.wfykDirtyFlag  = true;
    }

    /**
     *  获取属性值[未付余款]
     */
    public Integer getWfyk() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWfyk();
        }
        return this.wfyk;
    }

    /**
     *  获取属性值[未付余款]是否修改
     */
    public boolean isWfykDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWfykDirty();
        }
        return this.wfykDirtyFlag;
    }

    /**
     *  重置属性值[未付余款]
     */
    public void resetWfyk() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWfyk();
            return;
        }

        this.wfykDirtyFlag = false;
        this.wfyk = null;
    }
    /**
     *  设置属性值[绩效评估]
     *  @param jxpg
     */
    public void setJxpg(String jxpg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJxpg(jxpg);
            return;
        }
        if(jxpg!=null) {
            jxpg = StringHelper.trimRight(jxpg);
            if(jxpg.length()==0) {
                jxpg = null;
            }
        }
        this.jxpg =  jxpg;
        this.jxpgDirtyFlag  = true;
    }

    /**
     *  获取属性值[绩效评估]
     */
    public String getJxpg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJxpg();
        }
        return this.jxpg;
    }

    /**
     *  获取属性值[绩效评估]是否修改
     */
    public boolean isJxpgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJxpgDirty();
        }
        return this.jxpgDirtyFlag;
    }

    /**
     *  重置属性值[绩效评估]
     */
    public void resetJxpg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJxpg();
            return;
        }

        this.jxpgDirtyFlag = false;
        this.jxpg = null;
    }
    /**
     *  设置属性值[备注]
     *  @param bz
     */
    public void setBz(String bz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBz(bz);
            return;
        }
        if(bz!=null) {
            bz = StringHelper.trimRight(bz);
            if(bz.length()==0) {
                bz = null;
            }
        }
        this.bz =  bz;
        this.bzDirtyFlag  = true;
    }

    /**
     *  获取属性值[备注]
     */
    public String getBz() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBz();
        }
        return this.bz;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isBzDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBzDirty();
        }
        return this.bzDirtyFlag;
    }

    /**
     *  重置属性值[备注]
     */
    public void resetBz() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBz();
            return;
        }

        this.bzDirtyFlag = false;
        this.bz = null;
    }
    /**
     *  设置属性值[采购结果批示扫描]
     *  @param cgjgpssm
     */
    public void setCgjgpssm(String cgjgpssm) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCgjgpssm(cgjgpssm);
            return;
        }
        if(cgjgpssm!=null) {
            cgjgpssm = StringHelper.trimRight(cgjgpssm);
            if(cgjgpssm.length()==0) {
                cgjgpssm = null;
            }
        }
        this.cgjgpssm =  cgjgpssm;
        this.cgjgpssmDirtyFlag  = true;
    }

    /**
     *  获取属性值[采购结果批示扫描]
     */
    public String getCgjgpssm() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCgjgpssm();
        }
        return this.cgjgpssm;
    }

    /**
     *  获取属性值[采购结果批示扫描]是否修改
     */
    public boolean isCgjgpssmDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCgjgpssmDirty();
        }
        return this.cgjgpssmDirtyFlag;
    }

    /**
     *  重置属性值[采购结果批示扫描]
     */
    public void resetCgjgpssm() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCgjgpssm();
            return;
        }

        this.cgjgpssmDirtyFlag = false;
        this.cgjgpssm = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_XMJD.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_XMJD et) {
        et.resetOA_XMJDId();
        et.resetCreateMan();
        et.resetOA_XMJDName();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetXmmc();
        et.resetLxbg();
        et.resetXmbh();
        et.resetSDXMBHRQ();
        et.resetSdzzhbh();
        et.resetYsje();
        et.resetKSXCZSBRQ();
        et.resetSyzjwh();
        et.resetDlgs();
        et.resetZbwjqrqz();
        et.resetZBWJQRRQ();
        et.resetZbwjqrdsm();
        et.resetCgfs();
        et.resetCGGGRQ();
        et.resetPSRQ();
        et.resetJcry();
        et.resetPsdb();
        et.resetCGJGBGPFRQ();
        et.resetDljgpsbgbh();
        et.resetZTBWJGDRQ();
        et.resetZtbwjcfd();
        et.resetCjzbgs();
        et.resetHTQDRQ();
        et.resetHtze();
        et.resetHtsm();
        et.resetBARQ();
        et.resetBabsm();
        et.resetZbbhje();
        et.resetBhcfdd();
        et.resetBhfyjcfdd();
        et.resetYdlxrq();
        et.resetDycfkjdps();
        et.resetDycfkje();
        et.resetDYCZFPSRQ();
        et.resetDyczfpssm();
        et.resetDeczfpssm();
        et.resetDsczfpssm();
        et.resetDecfkje();
        et.resetDscfkje();
        et.resetDecfkjdps();
        et.resetDscfkjdps();
        et.resetDECZFPSRQ();
        et.resetDSCZFPSRQ();
        et.resetYSRQ();
        et.resetYsbgsn();
        et.resetTBRQ();
        et.resetWfyk();
        et.resetJxpg();
        et.resetBz();
        et.resetCgjgpssm();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_XMJDIdDirty()) {
            params.put(FIELD_OA_XMJDID,getOA_XMJDId());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_XMJDNameDirty()) {
            params.put(FIELD_OA_XMJDNAME,getOA_XMJDName());
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
        if(!bDirtyOnly || isXmmcDirty()) {
            params.put(FIELD_XMMC,getXmmc());
        }
        if(!bDirtyOnly || isLxbgDirty()) {
            params.put(FIELD_LXBG,getLxbg());
        }
        if(!bDirtyOnly || isXmbhDirty()) {
            params.put(FIELD_XMBH,getXmbh());
        }
        if(!bDirtyOnly || isSDXMBHRQDirty()) {
            params.put(FIELD_SDXMBHRQ,getSDXMBHRQ());
        }
        if(!bDirtyOnly || isSdzzhbhDirty()) {
            params.put(FIELD_SDZZHBH,getSdzzhbh());
        }
        if(!bDirtyOnly || isYsjeDirty()) {
            params.put(FIELD_YSJE,getYsje());
        }
        if(!bDirtyOnly || isKSXCZSBRQDirty()) {
            params.put(FIELD_KSXCZSBRQ,getKSXCZSBRQ());
        }
        if(!bDirtyOnly || isSyzjwhDirty()) {
            params.put(FIELD_SYZJWH,getSyzjwh());
        }
        if(!bDirtyOnly || isDlgsDirty()) {
            params.put(FIELD_DLGS,getDlgs());
        }
        if(!bDirtyOnly || isZbwjqrqzDirty()) {
            params.put(FIELD_ZBWJQRQZ,getZbwjqrqz());
        }
        if(!bDirtyOnly || isZBWJQRRQDirty()) {
            params.put(FIELD_ZBWJQRRQ,getZBWJQRRQ());
        }
        if(!bDirtyOnly || isZbwjqrdsmDirty()) {
            params.put(FIELD_ZBWJQRDSM,getZbwjqrdsm());
        }
        if(!bDirtyOnly || isCgfsDirty()) {
            params.put(FIELD_CGFS,getCgfs());
        }
        if(!bDirtyOnly || isCGGGRQDirty()) {
            params.put(FIELD_CGGGRQ,getCGGGRQ());
        }
        if(!bDirtyOnly || isPSRQDirty()) {
            params.put(FIELD_PSRQ,getPSRQ());
        }
        if(!bDirtyOnly || isJcryDirty()) {
            params.put(FIELD_JCRY,getJcry());
        }
        if(!bDirtyOnly || isPsdbDirty()) {
            params.put(FIELD_PSDB,getPsdb());
        }
        if(!bDirtyOnly || isCGJGBGPFRQDirty()) {
            params.put(FIELD_CGJGBGPFRQ,getCGJGBGPFRQ());
        }
        if(!bDirtyOnly || isDljgpsbgbhDirty()) {
            params.put(FIELD_DLJGPSBGBH,getDljgpsbgbh());
        }
        if(!bDirtyOnly || isZTBWJGDRQDirty()) {
            params.put(FIELD_ZTBWJGDRQ,getZTBWJGDRQ());
        }
        if(!bDirtyOnly || isZtbwjcfdDirty()) {
            params.put(FIELD_ZTBWJCFD,getZtbwjcfd());
        }
        if(!bDirtyOnly || isCjzbgsDirty()) {
            params.put(FIELD_CJZBGS,getCjzbgs());
        }
        if(!bDirtyOnly || isHTQDRQDirty()) {
            params.put(FIELD_HTQDRQ,getHTQDRQ());
        }
        if(!bDirtyOnly || isHtzeDirty()) {
            params.put(FIELD_HTZE,getHtze());
        }
        if(!bDirtyOnly || isHtsmDirty()) {
            params.put(FIELD_HTSM,getHtsm());
        }
        if(!bDirtyOnly || isBARQDirty()) {
            params.put(FIELD_BARQ,getBARQ());
        }
        if(!bDirtyOnly || isBabsmDirty()) {
            params.put(FIELD_BABSM,getBabsm());
        }
        if(!bDirtyOnly || isZbbhjeDirty()) {
            params.put(FIELD_ZBBHJE,getZbbhje());
        }
        if(!bDirtyOnly || isBhcfddDirty()) {
            params.put(FIELD_BHCFDD,getBhcfdd());
        }
        if(!bDirtyOnly || isBhfyjcfddDirty()) {
            params.put(FIELD_BHFYJCFDD,getBhfyjcfdd());
        }
        if(!bDirtyOnly || isYdlxrqDirty()) {
            params.put(FIELD_YDLXRQ,getYdlxrq());
        }
        if(!bDirtyOnly || isDycfkjdpsDirty()) {
            params.put(FIELD_DYCFKJDPS,getDycfkjdps());
        }
        if(!bDirtyOnly || isDycfkjeDirty()) {
            params.put(FIELD_DYCFKJE,getDycfkje());
        }
        if(!bDirtyOnly || isDYCZFPSRQDirty()) {
            params.put(FIELD_DYCZFPSRQ,getDYCZFPSRQ());
        }
        if(!bDirtyOnly || isDyczfpssmDirty()) {
            params.put(FIELD_DYCZFPSSM,getDyczfpssm());
        }
        if(!bDirtyOnly || isDeczfpssmDirty()) {
            params.put(FIELD_DECZFPSSM,getDeczfpssm());
        }
        if(!bDirtyOnly || isDsczfpssmDirty()) {
            params.put(FIELD_DSCZFPSSM,getDsczfpssm());
        }
        if(!bDirtyOnly || isDecfkjeDirty()) {
            params.put(FIELD_DECFKJE,getDecfkje());
        }
        if(!bDirtyOnly || isDscfkjeDirty()) {
            params.put(FIELD_DSCFKJE,getDscfkje());
        }
        if(!bDirtyOnly || isDecfkjdpsDirty()) {
            params.put(FIELD_DECFKJDPS,getDecfkjdps());
        }
        if(!bDirtyOnly || isDscfkjdpsDirty()) {
            params.put(FIELD_DSCFKJDPS,getDscfkjdps());
        }
        if(!bDirtyOnly || isDECZFPSRQDirty()) {
            params.put(FIELD_DECZFPSRQ,getDECZFPSRQ());
        }
        if(!bDirtyOnly || isDSCZFPSRQDirty()) {
            params.put(FIELD_DSCZFPSRQ,getDSCZFPSRQ());
        }
        if(!bDirtyOnly || isYSRQDirty()) {
            params.put(FIELD_YSRQ,getYSRQ());
        }
        if(!bDirtyOnly || isYsbgsnDirty()) {
            params.put(FIELD_YSBGSN,getYsbgsn());
        }
        if(!bDirtyOnly || isTBRQDirty()) {
            params.put(FIELD_TBRQ,getTBRQ());
        }
        if(!bDirtyOnly || isWfykDirty()) {
            params.put(FIELD_WFYK,getWfyk());
        }
        if(!bDirtyOnly || isJxpgDirty()) {
            params.put(FIELD_JXPG,getJxpg());
        }
        if(!bDirtyOnly || isBzDirty()) {
            params.put(FIELD_BZ,getBz());
        }
        if(!bDirtyOnly || isCgjgpssmDirty()) {
            params.put(FIELD_CGJGPSSM,getCgjgpssm());
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

        return  OA_XMJD.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_XMJD et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XMJDID:
            return et.getOA_XMJDId();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_XMJDNAME:
            return et.getOA_XMJDName();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_XMMC:
            return et.getXmmc();
        case INDEX_LXBG:
            return et.getLxbg();
        case INDEX_XMBH:
            return et.getXmbh();
        case INDEX_SDXMBHRQ:
            return et.getSDXMBHRQ();
        case INDEX_SDZZHBH:
            return et.getSdzzhbh();
        case INDEX_YSJE:
            return et.getYsje();
        case INDEX_KSXCZSBRQ:
            return et.getKSXCZSBRQ();
        case INDEX_SYZJWH:
            return et.getSyzjwh();
        case INDEX_DLGS:
            return et.getDlgs();
        case INDEX_ZBWJQRQZ:
            return et.getZbwjqrqz();
        case INDEX_ZBWJQRRQ:
            return et.getZBWJQRRQ();
        case INDEX_ZBWJQRDSM:
            return et.getZbwjqrdsm();
        case INDEX_CGFS:
            return et.getCgfs();
        case INDEX_CGGGRQ:
            return et.getCGGGRQ();
        case INDEX_PSRQ:
            return et.getPSRQ();
        case INDEX_JCRY:
            return et.getJcry();
        case INDEX_PSDB:
            return et.getPsdb();
        case INDEX_CGJGBGPFRQ:
            return et.getCGJGBGPFRQ();
        case INDEX_DLJGPSBGBH:
            return et.getDljgpsbgbh();
        case INDEX_ZTBWJGDRQ:
            return et.getZTBWJGDRQ();
        case INDEX_ZTBWJCFD:
            return et.getZtbwjcfd();
        case INDEX_CJZBGS:
            return et.getCjzbgs();
        case INDEX_HTQDRQ:
            return et.getHTQDRQ();
        case INDEX_HTZE:
            return et.getHtze();
        case INDEX_HTSM:
            return et.getHtsm();
        case INDEX_BARQ:
            return et.getBARQ();
        case INDEX_BABSM:
            return et.getBabsm();
        case INDEX_ZBBHJE:
            return et.getZbbhje();
        case INDEX_BHCFDD:
            return et.getBhcfdd();
        case INDEX_BHFYJCFDD:
            return et.getBhfyjcfdd();
        case INDEX_YDLXRQ:
            return et.getYdlxrq();
        case INDEX_DYCFKJDPS:
            return et.getDycfkjdps();
        case INDEX_DYCFKJE:
            return et.getDycfkje();
        case INDEX_DYCZFPSRQ:
            return et.getDYCZFPSRQ();
        case INDEX_DYCZFPSSM:
            return et.getDyczfpssm();
        case INDEX_DECZFPSSM:
            return et.getDeczfpssm();
        case INDEX_DSCZFPSSM:
            return et.getDsczfpssm();
        case INDEX_DECFKJE:
            return et.getDecfkje();
        case INDEX_DSCFKJE:
            return et.getDscfkje();
        case INDEX_DECFKJDPS:
            return et.getDecfkjdps();
        case INDEX_DSCFKJDPS:
            return et.getDscfkjdps();
        case INDEX_DECZFPSRQ:
            return et.getDECZFPSRQ();
        case INDEX_DSCZFPSRQ:
            return et.getDSCZFPSRQ();
        case INDEX_YSRQ:
            return et.getYSRQ();
        case INDEX_YSBGSN:
            return et.getYsbgsn();
        case INDEX_TBRQ:
            return et.getTBRQ();
        case INDEX_WFYK:
            return et.getWfyk();
        case INDEX_JXPG:
            return et.getJxpg();
        case INDEX_BZ:
            return et.getBz();
        case INDEX_CGJGPSSM:
            return et.getCgjgpssm();
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

        OA_XMJD.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_XMJD et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_XMJDID:
            et.setOA_XMJDId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_XMJDNAME:
            et.setOA_XMJDName(DataObject.getStringValue(obj));
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
        case INDEX_XMMC:
            et.setXmmc(DataObject.getStringValue(obj));
            return ;
        case INDEX_LXBG:
            et.setLxbg(DataObject.getStringValue(obj));
            return ;
        case INDEX_XMBH:
            et.setXmbh(DataObject.getStringValue(obj));
            return ;
        case INDEX_SDXMBHRQ:
            et.setSDXMBHRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SDZZHBH:
            et.setSdzzhbh(DataObject.getStringValue(obj));
            return ;
        case INDEX_YSJE:
            et.setYsje(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_KSXCZSBRQ:
            et.setKSXCZSBRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SYZJWH:
            et.setSyzjwh(DataObject.getStringValue(obj));
            return ;
        case INDEX_DLGS:
            et.setDlgs(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZBWJQRQZ:
            et.setZbwjqrqz(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZBWJQRRQ:
            et.setZBWJQRRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_ZBWJQRDSM:
            et.setZbwjqrdsm(DataObject.getStringValue(obj));
            return ;
        case INDEX_CGFS:
            et.setCgfs(DataObject.getStringValue(obj));
            return ;
        case INDEX_CGGGRQ:
            et.setCGGGRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_PSRQ:
            et.setPSRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_JCRY:
            et.setJcry(DataObject.getStringValue(obj));
            return ;
        case INDEX_PSDB:
            et.setPsdb(DataObject.getStringValue(obj));
            return ;
        case INDEX_CGJGBGPFRQ:
            et.setCGJGBGPFRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_DLJGPSBGBH:
            et.setDljgpsbgbh(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZTBWJGDRQ:
            et.setZTBWJGDRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_ZTBWJCFD:
            et.setZtbwjcfd(DataObject.getStringValue(obj));
            return ;
        case INDEX_CJZBGS:
            et.setCjzbgs(DataObject.getStringValue(obj));
            return ;
        case INDEX_HTQDRQ:
            et.setHTQDRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_HTZE:
            et.setHtze(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_HTSM:
            et.setHtsm(DataObject.getStringValue(obj));
            return ;
        case INDEX_BARQ:
            et.setBARQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_BABSM:
            et.setBabsm(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZBBHJE:
            et.setZbbhje(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_BHCFDD:
            et.setBhcfdd(DataObject.getStringValue(obj));
            return ;
        case INDEX_BHFYJCFDD:
            et.setBhfyjcfdd(DataObject.getStringValue(obj));
            return ;
        case INDEX_YDLXRQ:
            et.setYdlxrq(DataObject.getStringValue(obj));
            return ;
        case INDEX_DYCFKJDPS:
            et.setDycfkjdps(DataObject.getStringValue(obj));
            return ;
        case INDEX_DYCFKJE:
            et.setDycfkje(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_DYCZFPSRQ:
            et.setDYCZFPSRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_DYCZFPSSM:
            et.setDyczfpssm(DataObject.getStringValue(obj));
            return ;
        case INDEX_DECZFPSSM:
            et.setDeczfpssm(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSCZFPSSM:
            et.setDsczfpssm(DataObject.getStringValue(obj));
            return ;
        case INDEX_DECFKJE:
            et.setDecfkje(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_DSCFKJE:
            et.setDscfkje(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_DECFKJDPS:
            et.setDecfkjdps(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSCFKJDPS:
            et.setDscfkjdps(DataObject.getStringValue(obj));
            return ;
        case INDEX_DECZFPSRQ:
            et.setDECZFPSRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_DSCZFPSRQ:
            et.setDSCZFPSRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_YSRQ:
            et.setYSRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_YSBGSN:
            et.setYsbgsn(DataObject.getStringValue(obj));
            return ;
        case INDEX_TBRQ:
            et.setTBRQ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_WFYK:
            et.setWfyk(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_JXPG:
            et.setJxpg(DataObject.getStringValue(obj));
            return ;
        case INDEX_BZ:
            et.setBz(DataObject.getStringValue(obj));
            return ;
        case INDEX_CGJGPSSM:
            et.setCgjgpssm(DataObject.getStringValue(obj));
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

        return  OA_XMJD.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_XMJD et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XMJDID:
            return et.getOA_XMJDId()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_XMJDNAME:
            return et.getOA_XMJDName()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_XMMC:
            return et.getXmmc()==null;
        case INDEX_LXBG:
            return et.getLxbg()==null;
        case INDEX_XMBH:
            return et.getXmbh()==null;
        case INDEX_SDXMBHRQ:
            return et.getSDXMBHRQ()==null;
        case INDEX_SDZZHBH:
            return et.getSdzzhbh()==null;
        case INDEX_YSJE:
            return et.getYsje()==null;
        case INDEX_KSXCZSBRQ:
            return et.getKSXCZSBRQ()==null;
        case INDEX_SYZJWH:
            return et.getSyzjwh()==null;
        case INDEX_DLGS:
            return et.getDlgs()==null;
        case INDEX_ZBWJQRQZ:
            return et.getZbwjqrqz()==null;
        case INDEX_ZBWJQRRQ:
            return et.getZBWJQRRQ()==null;
        case INDEX_ZBWJQRDSM:
            return et.getZbwjqrdsm()==null;
        case INDEX_CGFS:
            return et.getCgfs()==null;
        case INDEX_CGGGRQ:
            return et.getCGGGRQ()==null;
        case INDEX_PSRQ:
            return et.getPSRQ()==null;
        case INDEX_JCRY:
            return et.getJcry()==null;
        case INDEX_PSDB:
            return et.getPsdb()==null;
        case INDEX_CGJGBGPFRQ:
            return et.getCGJGBGPFRQ()==null;
        case INDEX_DLJGPSBGBH:
            return et.getDljgpsbgbh()==null;
        case INDEX_ZTBWJGDRQ:
            return et.getZTBWJGDRQ()==null;
        case INDEX_ZTBWJCFD:
            return et.getZtbwjcfd()==null;
        case INDEX_CJZBGS:
            return et.getCjzbgs()==null;
        case INDEX_HTQDRQ:
            return et.getHTQDRQ()==null;
        case INDEX_HTZE:
            return et.getHtze()==null;
        case INDEX_HTSM:
            return et.getHtsm()==null;
        case INDEX_BARQ:
            return et.getBARQ()==null;
        case INDEX_BABSM:
            return et.getBabsm()==null;
        case INDEX_ZBBHJE:
            return et.getZbbhje()==null;
        case INDEX_BHCFDD:
            return et.getBhcfdd()==null;
        case INDEX_BHFYJCFDD:
            return et.getBhfyjcfdd()==null;
        case INDEX_YDLXRQ:
            return et.getYdlxrq()==null;
        case INDEX_DYCFKJDPS:
            return et.getDycfkjdps()==null;
        case INDEX_DYCFKJE:
            return et.getDycfkje()==null;
        case INDEX_DYCZFPSRQ:
            return et.getDYCZFPSRQ()==null;
        case INDEX_DYCZFPSSM:
            return et.getDyczfpssm()==null;
        case INDEX_DECZFPSSM:
            return et.getDeczfpssm()==null;
        case INDEX_DSCZFPSSM:
            return et.getDsczfpssm()==null;
        case INDEX_DECFKJE:
            return et.getDecfkje()==null;
        case INDEX_DSCFKJE:
            return et.getDscfkje()==null;
        case INDEX_DECFKJDPS:
            return et.getDecfkjdps()==null;
        case INDEX_DSCFKJDPS:
            return et.getDscfkjdps()==null;
        case INDEX_DECZFPSRQ:
            return et.getDECZFPSRQ()==null;
        case INDEX_DSCZFPSRQ:
            return et.getDSCZFPSRQ()==null;
        case INDEX_YSRQ:
            return et.getYSRQ()==null;
        case INDEX_YSBGSN:
            return et.getYsbgsn()==null;
        case INDEX_TBRQ:
            return et.getTBRQ()==null;
        case INDEX_WFYK:
            return et.getWfyk()==null;
        case INDEX_JXPG:
            return et.getJxpg()==null;
        case INDEX_BZ:
            return et.getBz()==null;
        case INDEX_CGJGPSSM:
            return et.getCgjgpssm()==null;
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

        return  OA_XMJD.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_XMJD et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XMJDID:
            return et.isOA_XMJDIdDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_XMJDNAME:
            return et.isOA_XMJDNameDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_XMMC:
            return et.isXmmcDirty();
        case INDEX_LXBG:
            return et.isLxbgDirty();
        case INDEX_XMBH:
            return et.isXmbhDirty();
        case INDEX_SDXMBHRQ:
            return et.isSDXMBHRQDirty();
        case INDEX_SDZZHBH:
            return et.isSdzzhbhDirty();
        case INDEX_YSJE:
            return et.isYsjeDirty();
        case INDEX_KSXCZSBRQ:
            return et.isKSXCZSBRQDirty();
        case INDEX_SYZJWH:
            return et.isSyzjwhDirty();
        case INDEX_DLGS:
            return et.isDlgsDirty();
        case INDEX_ZBWJQRQZ:
            return et.isZbwjqrqzDirty();
        case INDEX_ZBWJQRRQ:
            return et.isZBWJQRRQDirty();
        case INDEX_ZBWJQRDSM:
            return et.isZbwjqrdsmDirty();
        case INDEX_CGFS:
            return et.isCgfsDirty();
        case INDEX_CGGGRQ:
            return et.isCGGGRQDirty();
        case INDEX_PSRQ:
            return et.isPSRQDirty();
        case INDEX_JCRY:
            return et.isJcryDirty();
        case INDEX_PSDB:
            return et.isPsdbDirty();
        case INDEX_CGJGBGPFRQ:
            return et.isCGJGBGPFRQDirty();
        case INDEX_DLJGPSBGBH:
            return et.isDljgpsbgbhDirty();
        case INDEX_ZTBWJGDRQ:
            return et.isZTBWJGDRQDirty();
        case INDEX_ZTBWJCFD:
            return et.isZtbwjcfdDirty();
        case INDEX_CJZBGS:
            return et.isCjzbgsDirty();
        case INDEX_HTQDRQ:
            return et.isHTQDRQDirty();
        case INDEX_HTZE:
            return et.isHtzeDirty();
        case INDEX_HTSM:
            return et.isHtsmDirty();
        case INDEX_BARQ:
            return et.isBARQDirty();
        case INDEX_BABSM:
            return et.isBabsmDirty();
        case INDEX_ZBBHJE:
            return et.isZbbhjeDirty();
        case INDEX_BHCFDD:
            return et.isBhcfddDirty();
        case INDEX_BHFYJCFDD:
            return et.isBhfyjcfddDirty();
        case INDEX_YDLXRQ:
            return et.isYdlxrqDirty();
        case INDEX_DYCFKJDPS:
            return et.isDycfkjdpsDirty();
        case INDEX_DYCFKJE:
            return et.isDycfkjeDirty();
        case INDEX_DYCZFPSRQ:
            return et.isDYCZFPSRQDirty();
        case INDEX_DYCZFPSSM:
            return et.isDyczfpssmDirty();
        case INDEX_DECZFPSSM:
            return et.isDeczfpssmDirty();
        case INDEX_DSCZFPSSM:
            return et.isDsczfpssmDirty();
        case INDEX_DECFKJE:
            return et.isDecfkjeDirty();
        case INDEX_DSCFKJE:
            return et.isDscfkjeDirty();
        case INDEX_DECFKJDPS:
            return et.isDecfkjdpsDirty();
        case INDEX_DSCFKJDPS:
            return et.isDscfkjdpsDirty();
        case INDEX_DECZFPSRQ:
            return et.isDECZFPSRQDirty();
        case INDEX_DSCZFPSRQ:
            return et.isDSCZFPSRQDirty();
        case INDEX_YSRQ:
            return et.isYSRQDirty();
        case INDEX_YSBGSN:
            return et.isYsbgsnDirty();
        case INDEX_TBRQ:
            return et.isTBRQDirty();
        case INDEX_WFYK:
            return et.isWfykDirty();
        case INDEX_JXPG:
            return et.isJxpgDirty();
        case INDEX_BZ:
            return et.isBzDirty();
        case INDEX_CGJGPSSM:
            return et.isCgjgpssmDirty();
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
    private static  void fillJSONObject(OA_XMJD et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_XMJDId()!=null) {
            JSONObjectHelper.put(json,"oa_xmjdid",getJSONValue(et.getOA_XMJDId()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_XMJDName()!=null) {
            JSONObjectHelper.put(json,"oa_xmjdname",getJSONValue(et.getOA_XMJDName()),false);
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
        if(bIncEmpty||et.getXmmc()!=null) {
            JSONObjectHelper.put(json,"xmmc",getJSONValue(et.getXmmc()),false);
        }
        if(bIncEmpty||et.getLxbg()!=null) {
            JSONObjectHelper.put(json,"lxbg",getJSONValue(et.getLxbg()),false);
        }
        if(bIncEmpty||et.getXmbh()!=null) {
            JSONObjectHelper.put(json,"xmbh",getJSONValue(et.getXmbh()),false);
        }
        if(bIncEmpty||et.getSDXMBHRQ()!=null) {
            JSONObjectHelper.put(json,"sdxmbhrq",getJSONValue(et.getSDXMBHRQ()),false);
        }
        if(bIncEmpty||et.getSdzzhbh()!=null) {
            JSONObjectHelper.put(json,"sdzzhbh",getJSONValue(et.getSdzzhbh()),false);
        }
        if(bIncEmpty||et.getYsje()!=null) {
            JSONObjectHelper.put(json,"ysje",getJSONValue(et.getYsje()),false);
        }
        if(bIncEmpty||et.getKSXCZSBRQ()!=null) {
            JSONObjectHelper.put(json,"ksxczsbrq",getJSONValue(et.getKSXCZSBRQ()),false);
        }
        if(bIncEmpty||et.getSyzjwh()!=null) {
            JSONObjectHelper.put(json,"syzjwh",getJSONValue(et.getSyzjwh()),false);
        }
        if(bIncEmpty||et.getDlgs()!=null) {
            JSONObjectHelper.put(json,"dlgs",getJSONValue(et.getDlgs()),false);
        }
        if(bIncEmpty||et.getZbwjqrqz()!=null) {
            JSONObjectHelper.put(json,"zbwjqrqz",getJSONValue(et.getZbwjqrqz()),false);
        }
        if(bIncEmpty||et.getZBWJQRRQ()!=null) {
            JSONObjectHelper.put(json,"zbwjqrrq",getJSONValue(et.getZBWJQRRQ()),false);
        }
        if(bIncEmpty||et.getZbwjqrdsm()!=null) {
            JSONObjectHelper.put(json,"zbwjqrdsm",getJSONValue(et.getZbwjqrdsm()),false);
        }
        if(bIncEmpty||et.getCgfs()!=null) {
            JSONObjectHelper.put(json,"cgfs",getJSONValue(et.getCgfs()),false);
        }
        if(bIncEmpty||et.getCGGGRQ()!=null) {
            JSONObjectHelper.put(json,"cgggrq",getJSONValue(et.getCGGGRQ()),false);
        }
        if(bIncEmpty||et.getPSRQ()!=null) {
            JSONObjectHelper.put(json,"psrq",getJSONValue(et.getPSRQ()),false);
        }
        if(bIncEmpty||et.getJcry()!=null) {
            JSONObjectHelper.put(json,"jcry",getJSONValue(et.getJcry()),false);
        }
        if(bIncEmpty||et.getPsdb()!=null) {
            JSONObjectHelper.put(json,"psdb",getJSONValue(et.getPsdb()),false);
        }
        if(bIncEmpty||et.getCGJGBGPFRQ()!=null) {
            JSONObjectHelper.put(json,"cgjgbgpfrq",getJSONValue(et.getCGJGBGPFRQ()),false);
        }
        if(bIncEmpty||et.getDljgpsbgbh()!=null) {
            JSONObjectHelper.put(json,"dljgpsbgbh",getJSONValue(et.getDljgpsbgbh()),false);
        }
        if(bIncEmpty||et.getZTBWJGDRQ()!=null) {
            JSONObjectHelper.put(json,"ztbwjgdrq",getJSONValue(et.getZTBWJGDRQ()),false);
        }
        if(bIncEmpty||et.getZtbwjcfd()!=null) {
            JSONObjectHelper.put(json,"ztbwjcfd",getJSONValue(et.getZtbwjcfd()),false);
        }
        if(bIncEmpty||et.getCjzbgs()!=null) {
            JSONObjectHelper.put(json,"cjzbgs",getJSONValue(et.getCjzbgs()),false);
        }
        if(bIncEmpty||et.getHTQDRQ()!=null) {
            JSONObjectHelper.put(json,"htqdrq",getJSONValue(et.getHTQDRQ()),false);
        }
        if(bIncEmpty||et.getHtze()!=null) {
            JSONObjectHelper.put(json,"htze",getJSONValue(et.getHtze()),false);
        }
        if(bIncEmpty||et.getHtsm()!=null) {
            JSONObjectHelper.put(json,"htsm",getJSONValue(et.getHtsm()),false);
        }
        if(bIncEmpty||et.getBARQ()!=null) {
            JSONObjectHelper.put(json,"barq",getJSONValue(et.getBARQ()),false);
        }
        if(bIncEmpty||et.getBabsm()!=null) {
            JSONObjectHelper.put(json,"babsm",getJSONValue(et.getBabsm()),false);
        }
        if(bIncEmpty||et.getZbbhje()!=null) {
            JSONObjectHelper.put(json,"zbbhje",getJSONValue(et.getZbbhje()),false);
        }
        if(bIncEmpty||et.getBhcfdd()!=null) {
            JSONObjectHelper.put(json,"bhcfdd",getJSONValue(et.getBhcfdd()),false);
        }
        if(bIncEmpty||et.getBhfyjcfdd()!=null) {
            JSONObjectHelper.put(json,"bhfyjcfdd",getJSONValue(et.getBhfyjcfdd()),false);
        }
        if(bIncEmpty||et.getYdlxrq()!=null) {
            JSONObjectHelper.put(json,"ydlxrq",getJSONValue(et.getYdlxrq()),false);
        }
        if(bIncEmpty||et.getDycfkjdps()!=null) {
            JSONObjectHelper.put(json,"dycfkjdps",getJSONValue(et.getDycfkjdps()),false);
        }
        if(bIncEmpty||et.getDycfkje()!=null) {
            JSONObjectHelper.put(json,"dycfkje",getJSONValue(et.getDycfkje()),false);
        }
        if(bIncEmpty||et.getDYCZFPSRQ()!=null) {
            JSONObjectHelper.put(json,"dyczfpsrq",getJSONValue(et.getDYCZFPSRQ()),false);
        }
        if(bIncEmpty||et.getDyczfpssm()!=null) {
            JSONObjectHelper.put(json,"dyczfpssm",getJSONValue(et.getDyczfpssm()),false);
        }
        if(bIncEmpty||et.getDeczfpssm()!=null) {
            JSONObjectHelper.put(json,"deczfpssm",getJSONValue(et.getDeczfpssm()),false);
        }
        if(bIncEmpty||et.getDsczfpssm()!=null) {
            JSONObjectHelper.put(json,"dsczfpssm",getJSONValue(et.getDsczfpssm()),false);
        }
        if(bIncEmpty||et.getDecfkje()!=null) {
            JSONObjectHelper.put(json,"decfkje",getJSONValue(et.getDecfkje()),false);
        }
        if(bIncEmpty||et.getDscfkje()!=null) {
            JSONObjectHelper.put(json,"dscfkje",getJSONValue(et.getDscfkje()),false);
        }
        if(bIncEmpty||et.getDecfkjdps()!=null) {
            JSONObjectHelper.put(json,"decfkjdps",getJSONValue(et.getDecfkjdps()),false);
        }
        if(bIncEmpty||et.getDscfkjdps()!=null) {
            JSONObjectHelper.put(json,"dscfkjdps",getJSONValue(et.getDscfkjdps()),false);
        }
        if(bIncEmpty||et.getDECZFPSRQ()!=null) {
            JSONObjectHelper.put(json,"deczfpsrq",getJSONValue(et.getDECZFPSRQ()),false);
        }
        if(bIncEmpty||et.getDSCZFPSRQ()!=null) {
            JSONObjectHelper.put(json,"dsczfpsrq",getJSONValue(et.getDSCZFPSRQ()),false);
        }
        if(bIncEmpty||et.getYSRQ()!=null) {
            JSONObjectHelper.put(json,"ysrq",getJSONValue(et.getYSRQ()),false);
        }
        if(bIncEmpty||et.getYsbgsn()!=null) {
            JSONObjectHelper.put(json,"ysbgsn",getJSONValue(et.getYsbgsn()),false);
        }
        if(bIncEmpty||et.getTBRQ()!=null) {
            JSONObjectHelper.put(json,"tbrq",getJSONValue(et.getTBRQ()),false);
        }
        if(bIncEmpty||et.getWfyk()!=null) {
            JSONObjectHelper.put(json,"wfyk",getJSONValue(et.getWfyk()),false);
        }
        if(bIncEmpty||et.getJxpg()!=null) {
            JSONObjectHelper.put(json,"jxpg",getJSONValue(et.getJxpg()),false);
        }
        if(bIncEmpty||et.getBz()!=null) {
            JSONObjectHelper.put(json,"bz",getJSONValue(et.getBz()),false);
        }
        if(bIncEmpty||et.getCgjgpssm()!=null) {
            JSONObjectHelper.put(json,"cgjgpssm",getJSONValue(et.getCgjgpssm()),false);
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
    private static void fillXmlNode(OA_XMJD et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_XMJDId()!=null) {
            Object obj = et.getOA_XMJDId();
            node.setAttribute("OA_XMJDID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_XMJDName()!=null) {
            Object obj = et.getOA_XMJDName();
            node.setAttribute("OA_XMJDNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getXmmc()!=null) {
            Object obj = et.getXmmc();
            node.setAttribute("XMMC",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLxbg()!=null) {
            Object obj = et.getLxbg();
            node.setAttribute("LXBG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getXmbh()!=null) {
            Object obj = et.getXmbh();
            node.setAttribute("XMBH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSDXMBHRQ()!=null) {
            Object obj = et.getSDXMBHRQ();
            node.setAttribute("SDXMBHRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getSdzzhbh()!=null) {
            Object obj = et.getSdzzhbh();
            node.setAttribute("SDZZHBH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYsje()!=null) {
            Object obj = et.getYsje();
            node.setAttribute("YSJE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getKSXCZSBRQ()!=null) {
            Object obj = et.getKSXCZSBRQ();
            node.setAttribute("KSXCZSBRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getSyzjwh()!=null) {
            Object obj = et.getSyzjwh();
            node.setAttribute("SYZJWH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDlgs()!=null) {
            Object obj = et.getDlgs();
            node.setAttribute("DLGS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZbwjqrqz()!=null) {
            Object obj = et.getZbwjqrqz();
            node.setAttribute("ZBWJQRQZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZBWJQRRQ()!=null) {
            Object obj = et.getZBWJQRRQ();
            node.setAttribute("ZBWJQRRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getZbwjqrdsm()!=null) {
            Object obj = et.getZbwjqrdsm();
            node.setAttribute("ZBWJQRDSM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCgfs()!=null) {
            Object obj = et.getCgfs();
            node.setAttribute("CGFS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCGGGRQ()!=null) {
            Object obj = et.getCGGGRQ();
            node.setAttribute("CGGGRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getPSRQ()!=null) {
            Object obj = et.getPSRQ();
            node.setAttribute("PSRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getJcry()!=null) {
            Object obj = et.getJcry();
            node.setAttribute("JCRY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPsdb()!=null) {
            Object obj = et.getPsdb();
            node.setAttribute("PSDB",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCGJGBGPFRQ()!=null) {
            Object obj = et.getCGJGBGPFRQ();
            node.setAttribute("CGJGBGPFRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getDljgpsbgbh()!=null) {
            Object obj = et.getDljgpsbgbh();
            node.setAttribute("DLJGPSBGBH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZTBWJGDRQ()!=null) {
            Object obj = et.getZTBWJGDRQ();
            node.setAttribute("ZTBWJGDRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getZtbwjcfd()!=null) {
            Object obj = et.getZtbwjcfd();
            node.setAttribute("ZTBWJCFD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCjzbgs()!=null) {
            Object obj = et.getCjzbgs();
            node.setAttribute("CJZBGS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getHTQDRQ()!=null) {
            Object obj = et.getHTQDRQ();
            node.setAttribute("HTQDRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getHtze()!=null) {
            Object obj = et.getHtze();
            node.setAttribute("HTZE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getHtsm()!=null) {
            Object obj = et.getHtsm();
            node.setAttribute("HTSM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBARQ()!=null) {
            Object obj = et.getBARQ();
            node.setAttribute("BARQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getBabsm()!=null) {
            Object obj = et.getBabsm();
            node.setAttribute("BABSM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZbbhje()!=null) {
            Object obj = et.getZbbhje();
            node.setAttribute("ZBBHJE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getBhcfdd()!=null) {
            Object obj = et.getBhcfdd();
            node.setAttribute("BHCFDD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBhfyjcfdd()!=null) {
            Object obj = et.getBhfyjcfdd();
            node.setAttribute("BHFYJCFDD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYdlxrq()!=null) {
            Object obj = et.getYdlxrq();
            node.setAttribute("YDLXRQ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDycfkjdps()!=null) {
            Object obj = et.getDycfkjdps();
            node.setAttribute("DYCFKJDPS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDycfkje()!=null) {
            Object obj = et.getDycfkje();
            node.setAttribute("DYCFKJE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getDYCZFPSRQ()!=null) {
            Object obj = et.getDYCZFPSRQ();
            node.setAttribute("DYCZFPSRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getDyczfpssm()!=null) {
            Object obj = et.getDyczfpssm();
            node.setAttribute("DYCZFPSSM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDeczfpssm()!=null) {
            Object obj = et.getDeczfpssm();
            node.setAttribute("DECZFPSSM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDsczfpssm()!=null) {
            Object obj = et.getDsczfpssm();
            node.setAttribute("DSCZFPSSM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDecfkje()!=null) {
            Object obj = et.getDecfkje();
            node.setAttribute("DECFKJE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getDscfkje()!=null) {
            Object obj = et.getDscfkje();
            node.setAttribute("DSCFKJE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getDecfkjdps()!=null) {
            Object obj = et.getDecfkjdps();
            node.setAttribute("DECFKJDPS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDscfkjdps()!=null) {
            Object obj = et.getDscfkjdps();
            node.setAttribute("DSCFKJDPS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDECZFPSRQ()!=null) {
            Object obj = et.getDECZFPSRQ();
            node.setAttribute("DECZFPSRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getDSCZFPSRQ()!=null) {
            Object obj = et.getDSCZFPSRQ();
            node.setAttribute("DSCZFPSRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getYSRQ()!=null) {
            Object obj = et.getYSRQ();
            node.setAttribute("YSRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getYsbgsn()!=null) {
            Object obj = et.getYsbgsn();
            node.setAttribute("YSBGSN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTBRQ()!=null) {
            Object obj = et.getTBRQ();
            node.setAttribute("TBRQ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td",obj));
        }
        if(bIncEmpty||et.getWfyk()!=null) {
            Object obj = et.getWfyk();
            node.setAttribute("WFYK",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getJxpg()!=null) {
            Object obj = et.getJxpg();
            node.setAttribute("JXPG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getBz()!=null) {
            Object obj = et.getBz();
            node.setAttribute("BZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCgjgpssm()!=null) {
            Object obj = et.getCgjgpssm();
            node.setAttribute("CGJGPSSM",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_XMJD.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_XMJD et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_XMJDIdDirty() && (bIncEmpty||et.getOA_XMJDId()!=null)) {
            dst.set(FIELD_OA_XMJDID,et.getOA_XMJDId());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_XMJDNameDirty() && (bIncEmpty||et.getOA_XMJDName()!=null)) {
            dst.set(FIELD_OA_XMJDNAME,et.getOA_XMJDName());
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
        if(et.isXmmcDirty() && (bIncEmpty||et.getXmmc()!=null)) {
            dst.set(FIELD_XMMC,et.getXmmc());
        }
        if(et.isLxbgDirty() && (bIncEmpty||et.getLxbg()!=null)) {
            dst.set(FIELD_LXBG,et.getLxbg());
        }
        if(et.isXmbhDirty() && (bIncEmpty||et.getXmbh()!=null)) {
            dst.set(FIELD_XMBH,et.getXmbh());
        }
        if(et.isSDXMBHRQDirty() && (bIncEmpty||et.getSDXMBHRQ()!=null)) {
            dst.set(FIELD_SDXMBHRQ,et.getSDXMBHRQ());
        }
        if(et.isSdzzhbhDirty() && (bIncEmpty||et.getSdzzhbh()!=null)) {
            dst.set(FIELD_SDZZHBH,et.getSdzzhbh());
        }
        if(et.isYsjeDirty() && (bIncEmpty||et.getYsje()!=null)) {
            dst.set(FIELD_YSJE,et.getYsje());
        }
        if(et.isKSXCZSBRQDirty() && (bIncEmpty||et.getKSXCZSBRQ()!=null)) {
            dst.set(FIELD_KSXCZSBRQ,et.getKSXCZSBRQ());
        }
        if(et.isSyzjwhDirty() && (bIncEmpty||et.getSyzjwh()!=null)) {
            dst.set(FIELD_SYZJWH,et.getSyzjwh());
        }
        if(et.isDlgsDirty() && (bIncEmpty||et.getDlgs()!=null)) {
            dst.set(FIELD_DLGS,et.getDlgs());
        }
        if(et.isZbwjqrqzDirty() && (bIncEmpty||et.getZbwjqrqz()!=null)) {
            dst.set(FIELD_ZBWJQRQZ,et.getZbwjqrqz());
        }
        if(et.isZBWJQRRQDirty() && (bIncEmpty||et.getZBWJQRRQ()!=null)) {
            dst.set(FIELD_ZBWJQRRQ,et.getZBWJQRRQ());
        }
        if(et.isZbwjqrdsmDirty() && (bIncEmpty||et.getZbwjqrdsm()!=null)) {
            dst.set(FIELD_ZBWJQRDSM,et.getZbwjqrdsm());
        }
        if(et.isCgfsDirty() && (bIncEmpty||et.getCgfs()!=null)) {
            dst.set(FIELD_CGFS,et.getCgfs());
        }
        if(et.isCGGGRQDirty() && (bIncEmpty||et.getCGGGRQ()!=null)) {
            dst.set(FIELD_CGGGRQ,et.getCGGGRQ());
        }
        if(et.isPSRQDirty() && (bIncEmpty||et.getPSRQ()!=null)) {
            dst.set(FIELD_PSRQ,et.getPSRQ());
        }
        if(et.isJcryDirty() && (bIncEmpty||et.getJcry()!=null)) {
            dst.set(FIELD_JCRY,et.getJcry());
        }
        if(et.isPsdbDirty() && (bIncEmpty||et.getPsdb()!=null)) {
            dst.set(FIELD_PSDB,et.getPsdb());
        }
        if(et.isCGJGBGPFRQDirty() && (bIncEmpty||et.getCGJGBGPFRQ()!=null)) {
            dst.set(FIELD_CGJGBGPFRQ,et.getCGJGBGPFRQ());
        }
        if(et.isDljgpsbgbhDirty() && (bIncEmpty||et.getDljgpsbgbh()!=null)) {
            dst.set(FIELD_DLJGPSBGBH,et.getDljgpsbgbh());
        }
        if(et.isZTBWJGDRQDirty() && (bIncEmpty||et.getZTBWJGDRQ()!=null)) {
            dst.set(FIELD_ZTBWJGDRQ,et.getZTBWJGDRQ());
        }
        if(et.isZtbwjcfdDirty() && (bIncEmpty||et.getZtbwjcfd()!=null)) {
            dst.set(FIELD_ZTBWJCFD,et.getZtbwjcfd());
        }
        if(et.isCjzbgsDirty() && (bIncEmpty||et.getCjzbgs()!=null)) {
            dst.set(FIELD_CJZBGS,et.getCjzbgs());
        }
        if(et.isHTQDRQDirty() && (bIncEmpty||et.getHTQDRQ()!=null)) {
            dst.set(FIELD_HTQDRQ,et.getHTQDRQ());
        }
        if(et.isHtzeDirty() && (bIncEmpty||et.getHtze()!=null)) {
            dst.set(FIELD_HTZE,et.getHtze());
        }
        if(et.isHtsmDirty() && (bIncEmpty||et.getHtsm()!=null)) {
            dst.set(FIELD_HTSM,et.getHtsm());
        }
        if(et.isBARQDirty() && (bIncEmpty||et.getBARQ()!=null)) {
            dst.set(FIELD_BARQ,et.getBARQ());
        }
        if(et.isBabsmDirty() && (bIncEmpty||et.getBabsm()!=null)) {
            dst.set(FIELD_BABSM,et.getBabsm());
        }
        if(et.isZbbhjeDirty() && (bIncEmpty||et.getZbbhje()!=null)) {
            dst.set(FIELD_ZBBHJE,et.getZbbhje());
        }
        if(et.isBhcfddDirty() && (bIncEmpty||et.getBhcfdd()!=null)) {
            dst.set(FIELD_BHCFDD,et.getBhcfdd());
        }
        if(et.isBhfyjcfddDirty() && (bIncEmpty||et.getBhfyjcfdd()!=null)) {
            dst.set(FIELD_BHFYJCFDD,et.getBhfyjcfdd());
        }
        if(et.isYdlxrqDirty() && (bIncEmpty||et.getYdlxrq()!=null)) {
            dst.set(FIELD_YDLXRQ,et.getYdlxrq());
        }
        if(et.isDycfkjdpsDirty() && (bIncEmpty||et.getDycfkjdps()!=null)) {
            dst.set(FIELD_DYCFKJDPS,et.getDycfkjdps());
        }
        if(et.isDycfkjeDirty() && (bIncEmpty||et.getDycfkje()!=null)) {
            dst.set(FIELD_DYCFKJE,et.getDycfkje());
        }
        if(et.isDYCZFPSRQDirty() && (bIncEmpty||et.getDYCZFPSRQ()!=null)) {
            dst.set(FIELD_DYCZFPSRQ,et.getDYCZFPSRQ());
        }
        if(et.isDyczfpssmDirty() && (bIncEmpty||et.getDyczfpssm()!=null)) {
            dst.set(FIELD_DYCZFPSSM,et.getDyczfpssm());
        }
        if(et.isDeczfpssmDirty() && (bIncEmpty||et.getDeczfpssm()!=null)) {
            dst.set(FIELD_DECZFPSSM,et.getDeczfpssm());
        }
        if(et.isDsczfpssmDirty() && (bIncEmpty||et.getDsczfpssm()!=null)) {
            dst.set(FIELD_DSCZFPSSM,et.getDsczfpssm());
        }
        if(et.isDecfkjeDirty() && (bIncEmpty||et.getDecfkje()!=null)) {
            dst.set(FIELD_DECFKJE,et.getDecfkje());
        }
        if(et.isDscfkjeDirty() && (bIncEmpty||et.getDscfkje()!=null)) {
            dst.set(FIELD_DSCFKJE,et.getDscfkje());
        }
        if(et.isDecfkjdpsDirty() && (bIncEmpty||et.getDecfkjdps()!=null)) {
            dst.set(FIELD_DECFKJDPS,et.getDecfkjdps());
        }
        if(et.isDscfkjdpsDirty() && (bIncEmpty||et.getDscfkjdps()!=null)) {
            dst.set(FIELD_DSCFKJDPS,et.getDscfkjdps());
        }
        if(et.isDECZFPSRQDirty() && (bIncEmpty||et.getDECZFPSRQ()!=null)) {
            dst.set(FIELD_DECZFPSRQ,et.getDECZFPSRQ());
        }
        if(et.isDSCZFPSRQDirty() && (bIncEmpty||et.getDSCZFPSRQ()!=null)) {
            dst.set(FIELD_DSCZFPSRQ,et.getDSCZFPSRQ());
        }
        if(et.isYSRQDirty() && (bIncEmpty||et.getYSRQ()!=null)) {
            dst.set(FIELD_YSRQ,et.getYSRQ());
        }
        if(et.isYsbgsnDirty() && (bIncEmpty||et.getYsbgsn()!=null)) {
            dst.set(FIELD_YSBGSN,et.getYsbgsn());
        }
        if(et.isTBRQDirty() && (bIncEmpty||et.getTBRQ()!=null)) {
            dst.set(FIELD_TBRQ,et.getTBRQ());
        }
        if(et.isWfykDirty() && (bIncEmpty||et.getWfyk()!=null)) {
            dst.set(FIELD_WFYK,et.getWfyk());
        }
        if(et.isJxpgDirty() && (bIncEmpty||et.getJxpg()!=null)) {
            dst.set(FIELD_JXPG,et.getJxpg());
        }
        if(et.isBzDirty() && (bIncEmpty||et.getBz()!=null)) {
            dst.set(FIELD_BZ,et.getBz());
        }
        if(et.isCgjgpssmDirty() && (bIncEmpty||et.getCgjgpssm()!=null)) {
            dst.set(FIELD_CGJGPSSM,et.getCgjgpssm());
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
        return  OA_XMJD.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_XMJD et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_XMJDID:
            et.resetOA_XMJDId();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_XMJDNAME:
            et.resetOA_XMJDName();
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
        case INDEX_XMMC:
            et.resetXmmc();
            return true;
        case INDEX_LXBG:
            et.resetLxbg();
            return true;
        case INDEX_XMBH:
            et.resetXmbh();
            return true;
        case INDEX_SDXMBHRQ:
            et.resetSDXMBHRQ();
            return true;
        case INDEX_SDZZHBH:
            et.resetSdzzhbh();
            return true;
        case INDEX_YSJE:
            et.resetYsje();
            return true;
        case INDEX_KSXCZSBRQ:
            et.resetKSXCZSBRQ();
            return true;
        case INDEX_SYZJWH:
            et.resetSyzjwh();
            return true;
        case INDEX_DLGS:
            et.resetDlgs();
            return true;
        case INDEX_ZBWJQRQZ:
            et.resetZbwjqrqz();
            return true;
        case INDEX_ZBWJQRRQ:
            et.resetZBWJQRRQ();
            return true;
        case INDEX_ZBWJQRDSM:
            et.resetZbwjqrdsm();
            return true;
        case INDEX_CGFS:
            et.resetCgfs();
            return true;
        case INDEX_CGGGRQ:
            et.resetCGGGRQ();
            return true;
        case INDEX_PSRQ:
            et.resetPSRQ();
            return true;
        case INDEX_JCRY:
            et.resetJcry();
            return true;
        case INDEX_PSDB:
            et.resetPsdb();
            return true;
        case INDEX_CGJGBGPFRQ:
            et.resetCGJGBGPFRQ();
            return true;
        case INDEX_DLJGPSBGBH:
            et.resetDljgpsbgbh();
            return true;
        case INDEX_ZTBWJGDRQ:
            et.resetZTBWJGDRQ();
            return true;
        case INDEX_ZTBWJCFD:
            et.resetZtbwjcfd();
            return true;
        case INDEX_CJZBGS:
            et.resetCjzbgs();
            return true;
        case INDEX_HTQDRQ:
            et.resetHTQDRQ();
            return true;
        case INDEX_HTZE:
            et.resetHtze();
            return true;
        case INDEX_HTSM:
            et.resetHtsm();
            return true;
        case INDEX_BARQ:
            et.resetBARQ();
            return true;
        case INDEX_BABSM:
            et.resetBabsm();
            return true;
        case INDEX_ZBBHJE:
            et.resetZbbhje();
            return true;
        case INDEX_BHCFDD:
            et.resetBhcfdd();
            return true;
        case INDEX_BHFYJCFDD:
            et.resetBhfyjcfdd();
            return true;
        case INDEX_YDLXRQ:
            et.resetYdlxrq();
            return true;
        case INDEX_DYCFKJDPS:
            et.resetDycfkjdps();
            return true;
        case INDEX_DYCFKJE:
            et.resetDycfkje();
            return true;
        case INDEX_DYCZFPSRQ:
            et.resetDYCZFPSRQ();
            return true;
        case INDEX_DYCZFPSSM:
            et.resetDyczfpssm();
            return true;
        case INDEX_DECZFPSSM:
            et.resetDeczfpssm();
            return true;
        case INDEX_DSCZFPSSM:
            et.resetDsczfpssm();
            return true;
        case INDEX_DECFKJE:
            et.resetDecfkje();
            return true;
        case INDEX_DSCFKJE:
            et.resetDscfkje();
            return true;
        case INDEX_DECFKJDPS:
            et.resetDecfkjdps();
            return true;
        case INDEX_DSCFKJDPS:
            et.resetDscfkjdps();
            return true;
        case INDEX_DECZFPSRQ:
            et.resetDECZFPSRQ();
            return true;
        case INDEX_DSCZFPSRQ:
            et.resetDSCZFPSRQ();
            return true;
        case INDEX_YSRQ:
            et.resetYSRQ();
            return true;
        case INDEX_YSBGSN:
            et.resetYsbgsn();
            return true;
        case INDEX_TBRQ:
            et.resetTBRQ();
            return true;
        case INDEX_WFYK:
            et.resetWfyk();
            return true;
        case INDEX_JXPG:
            et.resetJxpg();
            return true;
        case INDEX_BZ:
            et.resetBz();
            return true;
        case INDEX_CGJGPSSM:
            et.resetCgjgpssm();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private OA_XMJD getProxyEntity() {
        return this.proxyOA_XMJD;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_XMJD = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_XMJD) {
            this.proxyOA_XMJD = (OA_XMJD)proxyDataObject;
        }

    }

}