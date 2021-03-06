package com.zmannotes.spring.unit.test.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Stock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.code
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.name
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.count
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.main_business
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    private String mainBusiness;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.create_time
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.price
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.code
     *
     * @return the value of stock.code
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.code
     *
     * @param code the value for stock.code
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.name
     *
     * @return the value of stock.name
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.name
     *
     * @param name the value for stock.name
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.count
     *
     * @return the value of stock.count
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.count
     *
     * @param count the value for stock.count
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.main_business
     *
     * @return the value of stock.main_business
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public String getMainBusiness() {
        return mainBusiness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.main_business
     *
     * @param mainBusiness the value for stock.main_business
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness == null ? null : mainBusiness.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.create_time
     *
     * @return the value of stock.create_time
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.create_time
     *
     * @param createTime the value for stock.create_time
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.price
     *
     * @return the value of stock.price
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.price
     *
     * @param price the value for stock.price
     *
     * @mbggenerated Thu May 05 21:25:27 CST 2016
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}