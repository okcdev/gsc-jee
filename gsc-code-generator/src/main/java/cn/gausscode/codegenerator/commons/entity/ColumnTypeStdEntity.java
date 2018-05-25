/*
 * FileName: ColumnStdEntity.java
 * Author: jinlong.hao jinlong.hao@gausscode.cn
 * Date: 2017-10-15
 */

package cn.gausscode.codegenerator.commons.entity;

/**
 * @author jinlong.hao
 */
public class ColumnTypeStdEntity {
    private String typeName;
    private boolean needLength;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isNeedLength() {
        return needLength;
    }

    public void setNeedLength(boolean needLength) {
        this.needLength = needLength;
    }
}
