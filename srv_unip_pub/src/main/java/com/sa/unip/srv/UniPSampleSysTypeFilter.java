/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv;


/**
 * 系统[UniP]继承类型过滤器
 */
public class UniPSampleSysTypeFilter extends net.ibizsys.paas.util.spring.OverrideTypeFilterBase {

    @Override
    protected String getPackagePath() {
        return "com.sa.unip.srv";
    }

}