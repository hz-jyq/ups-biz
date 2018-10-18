package com.pay.ups.account.facade.model.proofread;

import com.pay.ups.account.facade.model.Model;

/**
 * 校验账单结果实体
 */
public class ProofreadResult extends Model{

	private static final long serialVersionUID = 2421214951235198688L;
	
	private Long proofreadResultId;
	
	//对账系统 参考 FromSystem
	private String system;
	
	//对账类型  1借款对账  2还款对账
	private String proofreadType;
	
	//执行是否成功 true 成功 false 失败
	private Boolean success;
	
	//失败原因
	private String failReason;
	
	//失败次数
	private Integer failCount;
	
	//执行失败时间
	private String failTime;

	public Long getProofreadResultId() {
		return proofreadResultId;
	}

	public void setProofreadResultId(Long proofreadResultId) {
		this.proofreadResultId = proofreadResultId;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getProofreadType() {
		return proofreadType;
	}

	public void setProofreadType(String proofreadType) {
		this.proofreadType = proofreadType;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public String getFailTime() {
		return failTime;
	}

	public void setFailTime(String failTime) {
		this.failTime = failTime;
	}
      
}
