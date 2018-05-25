/*
 * FileName: EppdevColumn.java
 * Author: fan.hao fan.hao@eppdev.cn
 * Date: 2017-10-13
 */

package cn.gausscode.codegenerator.manager.entity;

import cn.gausscode.codegenerator.manager.entity.auto._EppdevColumn;
import cn.gausscode.utils.json.JSONUtils;

/**
 * @author fan.hao
 */
public class EppdevColumn extends _EppdevColumn {
    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
