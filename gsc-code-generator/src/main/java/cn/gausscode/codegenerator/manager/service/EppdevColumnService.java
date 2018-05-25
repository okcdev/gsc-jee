/*
 * FileName: EppdevColumnService.java
 * Author: fan.hao fan.hao@eppdev.cn
 * Date: 2017-10-10
 */

package cn.gausscode.codegenerator.manager.service;

import cn.gausscode.codegenerator.manager.entity.EppdevColumn;
import cn.gausscode.codegenerator.utils.conf.TypesMapperUtils;
import cn.gausscode.codegenerator.utils.name.NameUtils;
import cn.gausscode.commons.service.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: fan.hao
 */
@Service
@Transactional(readOnly = true)
public class EppdevColumnService extends BasicService<EppdevColumn> {

    static Logger logger = LoggerFactory.getLogger(EppdevColumnService.class);

    private String[] natureKeys = {"tableId", "columnName"};

    @Override
    public String[] getNatureKeys() {
        return natureKeys;
    }

    @Override
    public void customeInit(EppdevColumn entity) {
        logger.debug("entity: {}", entity);
        entity.setPropertyName(NameUtils.buildPropertyName(entity.getColumnName()));
        entity.setJavaType(TypesMapperUtils.getJavaType(entity.getColumnType()));
        if(null == entity.getSortIndex()){
            entity.setSortIndex(100);
        }
    }

    /**
     * 创建ID字段
     * @param tableId 表ID
     * @return 要插入的ID字段对象
     */
    public static EppdevColumn buildId(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("id");
        column.setColumnComment("UUID");
        column.setColumnType("char");
        column.setColumnLength(32);
        column.setJavaType("String");
        column.setPropertyName("id");
        column.setPrimaryKey(true);
        column.setSortIndex(1);
        return column;
    }


    /**
     * 创建create_date字段
     * @param tableId 表id
     * @return 要创建的create_date字段对应额java对象
     */
    public static EppdevColumn buildCreateDate(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("create_date");
        column.setColumnComment("生成时间");
        column.setColumnType("datetime");
        column.setJavaType("java.util.Date");
        column.setPropertyName("createTime");
        column.setPrimaryKey(false);
        column.setSortIndex(100000);
        return column;
    }

    /**
     * 创建create_by字段
     * @param tableId 表id
     * @return 要创建的create_by字段对应额java对象
     */
    public static EppdevColumn buildCreateBy(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("create_by");
        column.setColumnComment("创建人ID");
        column.setColumnType("char");
        column.setColumnLength(32);
        column.setJavaType("String");
        column.setPropertyName("createBy");
        column.setPrimaryKey(false);
        column.setSortIndex(100001);
        return column;
    }

    /**
     * 创建update_date字段
     * @param tableId 表id
     * @return 要创建的update_date字段对应额java对象
     */
    public static EppdevColumn buildUpdateDate(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("update_date");
        column.setColumnComment("修改时间");
        column.setColumnType("datetime");
        column.setJavaType("java.util.Date");
        column.setPropertyName("updateTime");
        column.setPrimaryKey(false);
        column.setSortIndex(100002);
        return column;
    }

    /**
     * 创建update_by字段
     * @param tableId 表id
     * @return 要创建的update_by字段对应额java对象
     */
    public static EppdevColumn buildUpdateBy(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("update_by");
        column.setColumnComment("修改人ID");
        column.setColumnType("char");
        column.setColumnLength(32);
        column.setJavaType("String");
        column.setPropertyName("createBy");
        column.setPrimaryKey(false);
        column.setSortIndex(100003);
        return column;
    }

    /**
     * 创建del_flag字段
     * @param tableId 表id
     * @return 要创建的del_flag字段对应额java对象
     */
    public static EppdevColumn buildDelFlag(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("del_flag");
        column.setColumnComment("删除标识");
        column.setColumnType("int");
        column.setJavaType("Integer");
        column.setPropertyName("delFlag");
        column.setPrimaryKey(false);
        column.setSortIndex(100004);
        return column;
    }


    /**
     * 创建remark字段
     * @param tableId 表id
     * @return 要创建的remarks字段对应额java对象
     */
    public static EppdevColumn buildRemarks(String tableId){
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        column.setColumnName("remarks");
        column.setColumnComment("备注");
        column.setColumnType("varchar");
        column.setColumnLength(255);
        column.setJavaType("String");
        column.setPropertyName("remarks");
        column.setPrimaryKey(false);
        column.setSortIndex(100005);
        return column;
    }

}
