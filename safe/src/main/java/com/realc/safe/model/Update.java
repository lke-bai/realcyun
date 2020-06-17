package com.realc.safe.model;

import java.io.Serializable;

public class Update implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_update.update_id
     *
     * @mbg.generated
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_update.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_update.update_content
     *
     * @mbg.generated
     */
    private String updateContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table realc_update
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_update.update_id
     *
     * @return the value of realc_update.update_id
     *
     * @mbg.generated
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_update.update_id
     *
     * @param updateId the value for realc_update.update_id
     *
     * @mbg.generated
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_update.create_time
     *
     * @return the value of realc_update.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_update.create_time
     *
     * @param createTime the value for realc_update.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_update.update_content
     *
     * @return the value of realc_update.update_content
     *
     * @mbg.generated
     */
    public String getUpdateContent() {
        return updateContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_update.update_content
     *
     * @param updateContent the value for realc_update.update_content
     *
     * @mbg.generated
     */
    public void setUpdateContent(String updateContent) {
        this.updateContent = updateContent == null ? null : updateContent.trim();
    }
}