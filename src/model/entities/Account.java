package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
	
	// Attributes =======================================================================
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	// Constructors =====================================================================
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}


	// Getters & Setters ================================================================
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	
	// Methods
	
	public void deposit (double amount) {
		
	}
	
	public void withdraw (double amount) throws DomainExceptions{
		if(amount > withdrawLimit) {
			throw new DomainExceptions("Valor excede limite de saque!!!");
		}
		if(amount > balance) {
			throw new DomainExceptions("Saldo insuficiente!!!");
		}
		balance -= amount;
	}
	
	// ==================================================================================
	
}