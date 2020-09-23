package cn.itcast.service.company;

import cn.itcast.domain.company.Company;

import java.util.List;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 18:16
 * @Version JDK 8.0_251
 */
public interface CompanyService {
    List<Company> findAll();
}
