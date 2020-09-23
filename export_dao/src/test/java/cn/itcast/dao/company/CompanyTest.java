package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 17:48
 * @Version JDK 8.0_251
 */

public class CompanyTest {
    public static void main(String[] args) throws IOException {
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(resource);
        SqlSession sqlSession = sessionFactory.openSession();
        CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
        List<Company> list = companyDao.findAll();
        for (Company company : list) {
            System.out.println(company);
        }
        sqlSession.close();
    }
}
