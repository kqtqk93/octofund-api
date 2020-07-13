package com.thomasariyanto.octofund.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thomasariyanto.octofund.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
	public List<Transaction> findAllByMemberId(int memberId);
	public Transaction findByTypeAndId(int type, int transactionId);
	public Page<Transaction> findAllByTransactionStatusIdAndMutualFundManagerId(int statusId, int managerId, Pageable pageable);
}
