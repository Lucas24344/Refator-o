package atividade;
import java.util.Enumeration;

public class Template extends Statement{
	
	public Customer  aCustomer;
	
	public String valueHtml(HtmlStatement aHtmlStatement) {
		Enumeration rentals = aCustomer.getRentals();
		String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
			"</EM></H1><P>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
		    result += each.getMovie().getTitle()+ ": " +
		    String.valueOf(each.getCharge()) + "<BR>\n";
		}
		result += "<P>You owe <EM>" +
		String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + 
		String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
		"</EM> frequent renter points<P>";
		return result;
	}
	
	 public String valueText(TextStatement aTextStatement) {
		 Enumeration rentals = aCustomer.getRentals();
	     String result = "Rental Record for " + aCustomer.getName() +
	     "\n";
	     while (rentals.hasMoreElements()) {
	        Rental each = (Rental) rentals.nextElement();
	        result += "\t" + each.getMovie().getTitle()+ "\t" +
	        String.valueOf(each.getCharge()) + "\n";
	     }
	     result += "Amount owed is " +
	     String.valueOf(aCustomer.getTotalCharge()) + "\n";
	     result += "You earned " +
	     String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
	     " frequent renter points";
	     return result;
	  }



	
	

}
