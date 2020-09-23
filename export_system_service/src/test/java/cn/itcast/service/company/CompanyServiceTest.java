package cn.itcast.service.company;

import cn.itcast.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 18:32
 * @Version JDK 8.0_251
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext-service.xml")
public class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;
    @Test
    public void testFindAll(){
        List<Company> list = companyService.findAll();
        for (Company company : list) {
            System.out.println(company);
        }
    }
}

