/*
 * FileName: EppdevIndex.java
 * Author: jinlong.hao jinlong.hao@gausscode.cn
 * Date: 2017-10-13
 */

package cn.gausscode.codegenerator.manager.entity.auto;

import cn.gausscode.commons.entity.BasicEntity;

/**
 * @author jinlong.hao
 */
public class _EppdevIndex extends BasicEntity {
    private String tableId;
    private String indexName;
    private String columnNames;

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String columnNames) {
        this.columnNames = columnNames;
    }
}
