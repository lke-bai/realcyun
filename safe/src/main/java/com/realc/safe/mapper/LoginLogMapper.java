package com.realc.safe.mapper;

import com.realc.safe.model.LoginLog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginLogMapper {

    /**
     * 自定义条件查询
     */
    List<LoginLog> selectByCondition(String condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_login_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_login_log
     *
     * @mbg.generated
     */
    int insert(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_login_log
     *
     * @mbg.generated
     */
    int insertSelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_login_log
     *
     * @mbg.generated
     */
    LoginLog selectByPrimaryKey(String logId);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_login_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_login_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginLog record);
}