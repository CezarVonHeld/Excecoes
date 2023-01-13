package entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(double value) {
		balance +=value;
	}
	
	public void withDraw(double value) {
		if(value > withDrawLimit)
		{
			throw new IllegalArgumentException("Withdraw limit exceeded");
		}
		else if(value > balance)
		{
			throw new IllegalArgumentException("Balance insuficient");
		}		
		balance -=value;
	}

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

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	@Override
	public String toString() {
		return "New Balace :" + String.format("%.2f", balance);
	}
	
	
	
}
