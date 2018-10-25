package com.pgy.ups.biz.facade.service;

import com.pgy.ups.account.facade.model.proofread.ProofreadResult;
import com.pgy.ups.biz.facade.model.repaymentBorrowCash.LsdRepaymentBorrowCash;

import java.util.Date;
import java.util.List;

public interface RepaymentBorrowCashService {

   List<LsdRepaymentBorrowCash> getEverydayList(Date date);

   void accountCheck(Date date);


   public void saveResult(ProofreadResult result, String strDate,String type);
}
