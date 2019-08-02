package com.plugin.module.extension.module

class AloneConfiguration {

    String name;

    /**
     * 是否自动注册组件，true则会使用字节码插入的方式自动注册代码
     * false的话，需要手动使用反射的方式来注册
     */
    boolean isRegisterComponentAuto

    /**
     * 当前组件的applicationName，用于字节码插入。
     * 当isRegisterComponentAuto==true的时候是必须的
     */
    String applicationName

    boolean runAlone

    AloneConfiguration(final String name) {
        this.name = name
    }

    void isRegisterComponentAuto(boolean auto) {
        this.isRegisterComponentAuto = auto
    }

    void applicationName(String applicationName) {
        this.applicationName = applicationName
    }

    void runAlone(boolean runAlone) {
        this.runAlone = runAlone
    }

}