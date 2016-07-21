package com.easytoolsoft.easyreport.metadata.dao;

import com.easytoolsoft.easyreport.data.dao.ICrudDao;
import com.easytoolsoft.easyreport.metadata.po.Report;
import org.springframework.stereotype.Repository;

/**
 * 报表(ezrpt_meta_report表)数据访问类
 *
 * @author Tom Deng
 */
@Repository("EzrptMetaIReportDao")
public interface IReportDao extends ICrudDao<Report> {
}
