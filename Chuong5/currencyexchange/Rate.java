package currencyexchange;

public class Rate {
	private String code1;
	private String code2;
	private double rate;

	// Constructor
	public Rate(String code1, String code2, double rate) {
		this.code1 = code1;
		this.code2 = code2;
		this.rate = rate;
	}

	public String getCode1() {
		return code1;
	}

	public String getCode2() {
		return code2;
	}

	public double getRate() {
		return rate;
	}
}
