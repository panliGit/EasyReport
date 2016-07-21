package com.easytoolsoft.easyreport.data.dao;


import java.util.List;
import java.util.Map;

public interface IUpdateDao<T> {
    /**
     * 根据主键更新用户信息
     *
     * @param record
     * @return 影响的记录数
     */
    int updateById(T record);

    /**
     * 根据条件更新数据
     *
     * @param params
     * @return 影响的记录数
     */
    int update(Map<String, Object> params);

    /**
     * @param records
     * @return 影响的记录数
     */
    int batchUpdate(List<T> records);
}
