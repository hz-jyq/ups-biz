package com.pgy.ups.biz.facade.model.upsCheckAccountsRecord;

import java.io.Serializable;
import java.util.Date;

public class UpsCheckAccountsRecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.id
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.is_delete
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.gmt_create
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.gmt_modified
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.fail_reason
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private String failReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.proofread_type
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private String proofreadType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.return_code
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Boolean returnCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.ymd
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private String ymd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.creator
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Long creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.modifier
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Long modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.from_system
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private String fromSystem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.fail_count
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Integer failCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ups_check accounts_record.proofread_result_id
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private Long proofreadResultId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.id
     *
     * @return the value of ups_check accounts_record.id
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.id
     *
     * @param id the value for ups_check accounts_record.id
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.is_delete
     *
     * @return the value of ups_check accounts_record.is_delete
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.is_delete
     *
     * @param isDelete the value for ups_check accounts_record.is_delete
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.gmt_create
     *
     * @return the value of ups_check accounts_record.gmt_create
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.gmt_create
     *
     * @param gmtCreate the value for ups_check accounts_record.gmt_create
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.gmt_modified
     *
     * @return the value of ups_check accounts_record.gmt_modified
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.gmt_modified
     *
     * @param gmtModified the value for ups_check accounts_record.gmt_modified
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.fail_reason
     *
     * @return the value of ups_check accounts_record.fail_reason
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.fail_reason
     *
     * @param failReason the value for ups_check accounts_record.fail_reason
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.proofread_type
     *
     * @return the value of ups_check accounts_record.proofread_type
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public String getProofreadType() {
        return proofreadType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.proofread_type
     *
     * @param proofreadType the value for ups_check accounts_record.proofread_type
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setProofreadType(String proofreadType) {
        this.proofreadType = proofreadType == null ? null : proofreadType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.return_code
     *
     * @return the value of ups_check accounts_record.return_code
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */

    public Boolean getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Boolean returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.ymd
     *
     * @return the value of ups_check accounts_record.ymd
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public String getYmd() {
        return ymd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.ymd
     *
     * @param ymd the value for ups_check accounts_record.ymd
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setYmd(String ymd) {
        this.ymd = ymd == null ? null : ymd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.creator
     *
     * @return the value of ups_check accounts_record.creator
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.creator
     *
     * @param creator the value for ups_check accounts_record.creator
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.modifier
     *
     * @return the value of ups_check accounts_record.modifier
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Long getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.modifier
     *
     * @param modifier the value for ups_check accounts_record.modifier
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.from_system
     *
     * @return the value of ups_check accounts_record.from_system
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public String getFromSystem() {
        return fromSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.from_system
     *
     * @param fromSystem the value for ups_check accounts_record.from_system
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setFromSystem(String fromSystem) {
        this.fromSystem = fromSystem == null ? null : fromSystem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.fail_count
     *
     * @return the value of ups_check accounts_record.fail_count
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Integer getFailCount() {
        return failCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.fail_count
     *
     * @param failCount the value for ups_check accounts_record.fail_count
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ups_check accounts_record.proofread_result_id
     *
     * @return the value of ups_check accounts_record.proofread_result_id
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public Long getProofreadResultId() {
        return proofreadResultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ups_check accounts_record.proofread_result_id
     *
     * @param proofreadResultId the value for ups_check accounts_record.proofread_result_id
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    public void setProofreadResultId(Long proofreadResultId) {
        this.proofreadResultId = proofreadResultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", failReason=").append(failReason);
        sb.append(", proofreadType=").append(proofreadType);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", ymd=").append(ymd);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", fromSystem=").append(fromSystem);
        sb.append(", failCount=").append(failCount);
        sb.append(", proofreadResultId=").append(proofreadResultId);
        sb.append("]");
        return sb.toString();
    }
}