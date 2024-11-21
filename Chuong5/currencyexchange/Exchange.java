package currencyexchange;

import java.util.ArrayList;

public class Exchange {
	private ArrayList<Rate> rates;

	public Exchange() {
		rates = new ArrayList<>();
		rates.add(new Rate("USD", "VND", 17000));
		rates.add(new Rate("EUR", "USD", 1.2));
		rates.add(new Rate("USD", "IDN", 15789));
		rates.add(new Rate("USD", "EUR", 0.83));
		rates.add(new Rate("CAD", "IDN", 16869));
	}

	public double convert(String code1, String code2, double amount) {
		for (Rate rate : rates) {
			if (rate.getCode1().equals(code1) && rate.getCode2().equals(code2)) {
				return amount * rate.getRate();
			}
		}
		return -1;
	}
}
