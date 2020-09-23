package cn.itcast.service.company.impl;

import cn.itcast.dao.company.CompanyDao;
import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 18:17
 * @Version JDK 8.0_251
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public List<Company> findAll() {
        List<Company> list = companyDao.findAll();
        return list;
    }
}
