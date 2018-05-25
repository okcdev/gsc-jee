/*
 * FileName: EppdevConf.java
 * Author: fan.hao fan.hao@eppdev.cn
 * Date: 2017-11-01
 */

package cn.gausscode.codegenerator.manager.entity;

import cn.gausscode.codegenerator.manager.entity.auto._EppdevConf;
import cn.gausscode.utils.json.JSONUtils;

/**
 * @author fan.hao
 */
public class EppdevConf extends _EppdevConf {

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
