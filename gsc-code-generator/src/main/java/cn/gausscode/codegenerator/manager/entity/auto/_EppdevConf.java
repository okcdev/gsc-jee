/*
 * FileName: _EppdevConf.java
 * Author: jinlong.hao jinlong.hao@gausscode.cn
 * Date: 2017-11-01
 */

package cn.gausscode.codegenerator.manager.entity.auto;

import cn.gausscode.commons.entity.BasicEntity;

/**
 * @author jinlong.hao
 */
public class _EppdevConf extends BasicEntity{
    private String confName;
    private String confValue;

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getConfValue() {
        return confValue;
    }

    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }
}
