package atividade;

import java.util.Enumeration;

public class HtmlStatement extends Statement {
	public String value(Customer aCustomer) {
		return new Template().valueHtml(this);

	}
}
