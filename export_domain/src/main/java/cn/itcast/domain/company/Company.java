package cn.itcast.domain.company;

import lombok.Data;

import java.util.Date;

/**
 * @Author ZhiWen
 * @Date 2020/9/22 17:32
 * @Version JDK 8.0_251
 */
@Data
public class Company {
    private String id;
    private String name;
    private Date expirationDate;
    private String address;
    private String licenseId;
    private String representative;
    private String phone;
    private String companySize;
    private String industry;
    private String remarks;
    private Integer state;
    private Double balance;
    private String city;
}
