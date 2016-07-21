package com.easytoolsoft.easyreport.metadata.dao;

import com.easytoolsoft.easyreport.data.dao.ICrudDao;
import com.easytoolsoft.easyreport.metadata.po.Conf;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 报表配置项(ezrpt_meta_conf表)数据访问类
 *
 * @author Tom Deng
 */
@Repository("EzrptMetaIConfDao")
public interface IConfDao extends ICrudDao<Conf> {
    List<Conf> selectByParentKey(@Param(value = "key") String key);
}
