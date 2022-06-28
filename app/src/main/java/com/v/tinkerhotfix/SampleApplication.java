package com.v.tinkerhotfix;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * ClassName: SampleApplication
 * Description:
 *
 * @author zhuming
 * @package_name com.v.tinkerhotfix
 * @date 2022/6/28 4:13 下午
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.v.tinkerhotfix.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
