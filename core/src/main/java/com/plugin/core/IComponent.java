package com.plugin.core;

import android.app.Application;

/**
 * 基础组件实现接口
 * Email yummyl.lau@gmail.com
 * Created by yummylau on 2018/01/25.
 */
public interface IComponent {

    void attachComponent(Application application);

    void detachComponent();
}
