package com.pgy.ups.biz.facade.model.renewalDetail;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LsdRenewalDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.is_delete
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Long isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.gmt_create
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.gmt_modified
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.borrow_id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Long borrowId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.status
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.remark
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.gmt_plan_repayment
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Date gmtPlanRepayment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.renewal_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal renewalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.prior_interest
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal priorInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.prior_overdue
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal priorOverdue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.capital
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal capital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.current_poundage
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal currentPoundage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.rebate_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal rebateAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.actual_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal actualAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.user_id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.card_name
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private String cardName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.card_number
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private String cardNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.pay_trade_no
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private String payTradeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.trade_no
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private String tradeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.renewal_day
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private Byte renewalDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.poundage_rate
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal poundageRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.base_bank_rate
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private BigDecimal baseBankRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lsd_renewal_detail.fail_reason
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private String failReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lsd_renewal_detail
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.id
     *
     * @return the value of lsd_renewal_detail.id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.id
     *
     * @param id the value for lsd_renewal_detail.id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.is_delete
     *
     * @return the value of lsd_renewal_detail.is_delete
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Long getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.is_delete
     *
     * @param isDelete the value for lsd_renewal_detail.is_delete
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.gmt_create
     *
     * @return the value of lsd_renewal_detail.gmt_create
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.gmt_create
     *
     * @param gmtCreate the value for lsd_renewal_detail.gmt_create
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.gmt_modified
     *
     * @return the value of lsd_renewal_detail.gmt_modified
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.gmt_modified
     *
     * @param gmtModified the value for lsd_renewal_detail.gmt_modified
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.borrow_id
     *
     * @return the value of lsd_renewal_detail.borrow_id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.borrow_id
     *
     * @param borrowId the value for lsd_renewal_detail.borrow_id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.status
     *
     * @return the value of lsd_renewal_detail.status
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.status
     *
     * @param status the value for lsd_renewal_detail.status
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.remark
     *
     * @return the value of lsd_renewal_detail.remark
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.remark
     *
     * @param remark the value for lsd_renewal_detail.remark
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.gmt_plan_repayment
     *
     * @return the value of lsd_renewal_detail.gmt_plan_repayment
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Date getGmtPlanRepayment() {
        return gmtPlanRepayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.gmt_plan_repayment
     *
     * @param gmtPlanRepayment the value for lsd_renewal_detail.gmt_plan_repayment
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setGmtPlanRepayment(Date gmtPlanRepayment) {
        this.gmtPlanRepayment = gmtPlanRepayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.renewal_amount
     *
     * @return the value of lsd_renewal_detail.renewal_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getRenewalAmount() {
        return renewalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.renewal_amount
     *
     * @param renewalAmount the value for lsd_renewal_detail.renewal_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setRenewalAmount(BigDecimal renewalAmount) {
        this.renewalAmount = renewalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.prior_interest
     *
     * @return the value of lsd_renewal_detail.prior_interest
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getPriorInterest() {
        return priorInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.prior_interest
     *
     * @param priorInterest the value for lsd_renewal_detail.prior_interest
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setPriorInterest(BigDecimal priorInterest) {
        this.priorInterest = priorInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.prior_overdue
     *
     * @return the value of lsd_renewal_detail.prior_overdue
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getPriorOverdue() {
        return priorOverdue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.prior_overdue
     *
     * @param priorOverdue the value for lsd_renewal_detail.prior_overdue
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setPriorOverdue(BigDecimal priorOverdue) {
        this.priorOverdue = priorOverdue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.capital
     *
     * @return the value of lsd_renewal_detail.capital
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.capital
     *
     * @param capital the value for lsd_renewal_detail.capital
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.current_poundage
     *
     * @return the value of lsd_renewal_detail.current_poundage
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getCurrentPoundage() {
        return currentPoundage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.current_poundage
     *
     * @param currentPoundage the value for lsd_renewal_detail.current_poundage
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setCurrentPoundage(BigDecimal currentPoundage) {
        this.currentPoundage = currentPoundage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.rebate_amount
     *
     * @return the value of lsd_renewal_detail.rebate_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.rebate_amount
     *
     * @param rebateAmount the value for lsd_renewal_detail.rebate_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setRebateAmount(BigDecimal rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.actual_amount
     *
     * @return the value of lsd_renewal_detail.actual_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.actual_amount
     *
     * @param actualAmount the value for lsd_renewal_detail.actual_amount
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.user_id
     *
     * @return the value of lsd_renewal_detail.user_id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.user_id
     *
     * @param userId the value for lsd_renewal_detail.user_id
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.card_name
     *
     * @return the value of lsd_renewal_detail.card_name
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.card_name
     *
     * @param cardName the value for lsd_renewal_detail.card_name
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.card_number
     *
     * @return the value of lsd_renewal_detail.card_number
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.card_number
     *
     * @param cardNumber the value for lsd_renewal_detail.card_number
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.pay_trade_no
     *
     * @return the value of lsd_renewal_detail.pay_trade_no
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public String getPayTradeNo() {
        return payTradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.pay_trade_no
     *
     * @param payTradeNo the value for lsd_renewal_detail.pay_trade_no
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo == null ? null : payTradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.trade_no
     *
     * @return the value of lsd_renewal_detail.trade_no
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.trade_no
     *
     * @param tradeNo the value for lsd_renewal_detail.trade_no
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.renewal_day
     *
     * @return the value of lsd_renewal_detail.renewal_day
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public Byte getRenewalDay() {
        return renewalDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.renewal_day
     *
     * @param renewalDay the value for lsd_renewal_detail.renewal_day
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setRenewalDay(Byte renewalDay) {
        this.renewalDay = renewalDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.poundage_rate
     *
     * @return the value of lsd_renewal_detail.poundage_rate
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getPoundageRate() {
        return poundageRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.poundage_rate
     *
     * @param poundageRate the value for lsd_renewal_detail.poundage_rate
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setPoundageRate(BigDecimal poundageRate) {
        this.poundageRate = poundageRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.base_bank_rate
     *
     * @return the value of lsd_renewal_detail.base_bank_rate
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public BigDecimal getBaseBankRate() {
        return baseBankRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.base_bank_rate
     *
     * @param baseBankRate the value for lsd_renewal_detail.base_bank_rate
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setBaseBankRate(BigDecimal baseBankRate) {
        this.baseBankRate = baseBankRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lsd_renewal_detail.fail_reason
     *
     * @return the value of lsd_renewal_detail.fail_reason
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lsd_renewal_detail.fail_reason
     *
     * @param failReason the value for lsd_renewal_detail.fail_reason
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public String getBorrowNo() {
        return borrowNo;
    }

    public void setBorrowNo(String borrowNo) {
        this.borrowNo = borrowNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_renewal_detail
     *
     * @mbggenerated Fri Oct 19 16:23:46 CST 2018
     */

    private  String borrowNo;

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
        sb.append(", borrowId=").append(borrowId);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", gmtPlanRepayment=").append(gmtPlanRepayment);
        sb.append(", renewalAmount=").append(renewalAmount);
        sb.append(", priorInterest=").append(priorInterest);
        sb.append(", priorOverdue=").append(priorOverdue);
        sb.append(", capital=").append(capital);
        sb.append(", currentPoundage=").append(currentPoundage);
        sb.append(", rebateAmount=").append(rebateAmount);
        sb.append(", actualAmount=").append(actualAmount);
        sb.append(", userId=").append(userId);
        sb.append(", cardName=").append(cardName);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", payTradeNo=").append(payTradeNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", renewalDay=").append(renewalDay);
        sb.append(", poundageRate=").append(poundageRate);
        sb.append(", baseBankRate=").append(baseBankRate);
        sb.append(", failReason=").append(failReason);
        sb.append("]");
        return sb.toString();
    }
}