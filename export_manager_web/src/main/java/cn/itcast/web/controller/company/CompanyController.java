package cn.itcast.web.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 20:43
 * @Version JDK 8.0_251
 */
@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/findAll")
    public String findAll(){
        List<Company> list = companyService.findAll();
        request.setAttribute("list",list);
        for (Company company : list) {
            System.out.println(company);
        }
        return "company/company-list";
    }
}
