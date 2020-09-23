package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;

import java.util.List;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 17:38
 * @Version JDK 8.0_251
 */
public interface CompanyDao {
    List<Company> findAll();
}
