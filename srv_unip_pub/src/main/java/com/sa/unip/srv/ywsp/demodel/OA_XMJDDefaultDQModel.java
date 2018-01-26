/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="A1009C17-FC7F-46B9-8E5B-48E7B871E076",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BABSM`, t1.`BARQ`, t1.`BHCFDD`, t1.`BHFYJCFDD`, t1.`BZ`, t1.`CGFS`, t1.`CGGGRQ`, t1.`CGJGBGPFRQ`, t1.`CGJGPSSM`, t1.`CJZBGS`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DECFKJDPS`, t1.`DECFKJE`, t1.`DECZFPSRQ`, t1.`DECZFPSSM`, t1.`DLGS`, t1.`DLJGPSBGBH`, t1.`DSCFKJDPS`, t1.`DSCFKJE`, t1.`DSCZFPSRQ`, t1.`DSCZFPSSM`, t1.`DYCFKJDPS`, t1.`DYCFKJE`, t1.`DYCZFPSRQ`, t1.`DYCZFPSSM`, t1.`HTQDRQ`, t1.`HTSM`, t1.`HTZE`, t1.`JCRY`, t1.`JXPG`, t1.`KSXCZSBRQ`, t1.`LXBG`, t1.`OA_XMJDID`, t1.`OA_XMJDNAME`, t1.`PSDB`, t1.`PSRQ`, t1.`SDXMBHRQ`, t1.`SDZZHBH`, t1.`SYZJWH`, t1.`TBRQ`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFYK`, t1.`XMBH`, t1.`XMMC`, t1.`YDLXRQ`, t1.`YSBGSN`, t1.`YSJE`, t1.`YSRQ`, t1.`ZBBHJE`, t1.`ZBWJQRDSM`, t1.`ZBWJQRQZ`, t1.`ZBWJQRRQ`, t1.`ZTBWJCFD`, t1.`ZTBWJGDRQ` FROM `T_OA_XMJD` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BABSM",expression="t1.`BABSM`")
        ,@DEDataQueryCodeExp(name="BARQ",expression="t1.`BARQ`")
        ,@DEDataQueryCodeExp(name="BHCFDD",expression="t1.`BHCFDD`")
        ,@DEDataQueryCodeExp(name="BHFYJCFDD",expression="t1.`BHFYJCFDD`")
        ,@DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CGFS",expression="t1.`CGFS`")
        ,@DEDataQueryCodeExp(name="CGGGRQ",expression="t1.`CGGGRQ`")
        ,@DEDataQueryCodeExp(name="CGJGBGPFRQ",expression="t1.`CGJGBGPFRQ`")
        ,@DEDataQueryCodeExp(name="CGJGPSSM",expression="t1.`CGJGPSSM`")
        ,@DEDataQueryCodeExp(name="CJZBGS",expression="t1.`CJZBGS`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DECFKJDPS",expression="t1.`DECFKJDPS`")
        ,@DEDataQueryCodeExp(name="DECFKJE",expression="t1.`DECFKJE`")
        ,@DEDataQueryCodeExp(name="DECZFPSRQ",expression="t1.`DECZFPSRQ`")
        ,@DEDataQueryCodeExp(name="DECZFPSSM",expression="t1.`DECZFPSSM`")
        ,@DEDataQueryCodeExp(name="DLGS",expression="t1.`DLGS`")
        ,@DEDataQueryCodeExp(name="DLJGPSBGBH",expression="t1.`DLJGPSBGBH`")
        ,@DEDataQueryCodeExp(name="DSCFKJDPS",expression="t1.`DSCFKJDPS`")
        ,@DEDataQueryCodeExp(name="DSCFKJE",expression="t1.`DSCFKJE`")
        ,@DEDataQueryCodeExp(name="DSCZFPSRQ",expression="t1.`DSCZFPSRQ`")
        ,@DEDataQueryCodeExp(name="DSCZFPSSM",expression="t1.`DSCZFPSSM`")
        ,@DEDataQueryCodeExp(name="DYCFKJDPS",expression="t1.`DYCFKJDPS`")
        ,@DEDataQueryCodeExp(name="DYCFKJE",expression="t1.`DYCFKJE`")
        ,@DEDataQueryCodeExp(name="DYCZFPSRQ",expression="t1.`DYCZFPSRQ`")
        ,@DEDataQueryCodeExp(name="DYCZFPSSM",expression="t1.`DYCZFPSSM`")
        ,@DEDataQueryCodeExp(name="HTQDRQ",expression="t1.`HTQDRQ`")
        ,@DEDataQueryCodeExp(name="HTSM",expression="t1.`HTSM`")
        ,@DEDataQueryCodeExp(name="HTZE",expression="t1.`HTZE`")
        ,@DEDataQueryCodeExp(name="JCRY",expression="t1.`JCRY`")
        ,@DEDataQueryCodeExp(name="JXPG",expression="t1.`JXPG`")
        ,@DEDataQueryCodeExp(name="KSXCZSBRQ",expression="t1.`KSXCZSBRQ`")
        ,@DEDataQueryCodeExp(name="LXBG",expression="t1.`LXBG`")
        ,@DEDataQueryCodeExp(name="OA_XMJDID",expression="t1.`OA_XMJDID`")
        ,@DEDataQueryCodeExp(name="OA_XMJDNAME",expression="t1.`OA_XMJDNAME`")
        ,@DEDataQueryCodeExp(name="PSDB",expression="t1.`PSDB`")
        ,@DEDataQueryCodeExp(name="PSRQ",expression="t1.`PSRQ`")
        ,@DEDataQueryCodeExp(name="SDXMBHRQ",expression="t1.`SDXMBHRQ`")
        ,@DEDataQueryCodeExp(name="SDZZHBH",expression="t1.`SDZZHBH`")
        ,@DEDataQueryCodeExp(name="SYZJWH",expression="t1.`SYZJWH`")
        ,@DEDataQueryCodeExp(name="TBRQ",expression="t1.`TBRQ`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFYK",expression="t1.`WFYK`")
        ,@DEDataQueryCodeExp(name="XMBH",expression="t1.`XMBH`")
        ,@DEDataQueryCodeExp(name="XMMC",expression="t1.`XMMC`")
        ,@DEDataQueryCodeExp(name="YDLXRQ",expression="t1.`YDLXRQ`")
        ,@DEDataQueryCodeExp(name="YSBGSN",expression="t1.`YSBGSN`")
        ,@DEDataQueryCodeExp(name="YSJE",expression="t1.`YSJE`")
        ,@DEDataQueryCodeExp(name="YSRQ",expression="t1.`YSRQ`")
        ,@DEDataQueryCodeExp(name="ZBBHJE",expression="t1.`ZBBHJE`")
        ,@DEDataQueryCodeExp(name="ZBWJQRDSM",expression="t1.`ZBWJQRDSM`")
        ,@DEDataQueryCodeExp(name="ZBWJQRQZ",expression="t1.`ZBWJQRQZ`")
        ,@DEDataQueryCodeExp(name="ZBWJQRRQ",expression="t1.`ZBWJQRRQ`")
        ,@DEDataQueryCodeExp(name="ZTBWJCFD",expression="t1.`ZTBWJCFD`")
        ,@DEDataQueryCodeExp(name="ZTBWJGDRQ",expression="t1.`ZTBWJGDRQ`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_XMJDDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_XMJDDefaultDQModel() {
        super();

        this.initAnnotation(OA_XMJDDefaultDQModel.class);
    }

}