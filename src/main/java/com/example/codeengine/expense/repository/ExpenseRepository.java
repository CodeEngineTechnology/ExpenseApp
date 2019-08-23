package com.example.codeengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.codeengine.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
