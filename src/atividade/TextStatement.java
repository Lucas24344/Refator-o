package atividade;
import java.util.Enumeration;

public class TextStatement extends Statement {
	public String value(Customer aCustomer) {
			return new Template().valueText(this);

		}
	
}


