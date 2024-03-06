package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/transactions")
	public String getTransactions(ModelMap model) {
		List<Transaction> allTransactions = transactionService.findAll();
		Transaction transaction = new Transaction();

		model.put("transaction", transaction);
		model.put("transactions", allTransactions);

		return "transactions";
	}

}
