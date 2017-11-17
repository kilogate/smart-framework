package com.kilogate.framework;

import com.kilogate.framework.help.BeanHelper;
import com.kilogate.framework.help.ClassHelper;
import com.kilogate.framework.help.ControllerHelper;
import com.kilogate.framework.help.IocHelper;
import com.kilogate.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 *
 * @author fengquanwei
 * @create 2017/11/17 20:23
 **/
public class HelperLoader {
    public static void init() {
        Class<?>[] classes = {ClassHelper.class, BeanHelper.class, IocHelper.class, ControllerHelper.class};

        for (Class<?> clazz : classes) {
            ClassUtil.loadClass(clazz.getName(), false);
        }
    }
}
