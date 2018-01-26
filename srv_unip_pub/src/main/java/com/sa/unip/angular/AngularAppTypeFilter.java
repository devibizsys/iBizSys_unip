/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular;

import org.springframework.stereotype.Component;
import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.appmodel.AppViewModel;
import net.ibizsys.paas.appmodel.AppDEViewModel;
import com.sa.unip.srv.UniPSampleSysModel;

/**
 * 应用程序[网页Angular]重写类型过滤器
 */
public class AngularAppTypeFilter extends net.ibizsys.paas.util.spring.OverrideTypeFilterBase {

    @Override
    protected String getPackagePath() {
        return "com.sa.unip.angular";
    }

}