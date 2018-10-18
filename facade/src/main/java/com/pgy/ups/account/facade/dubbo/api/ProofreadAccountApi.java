package com.pgy.ups.account.facade.dubbo.api;

import com.pay.ups.account.facade.model.proofread.ProofreadResult;

public interface ProofreadAccountApi {
	
	
	ProofreadResult ProofreadInStart(); 
	
	ProofreadResult ProofreadOutStart();

}
