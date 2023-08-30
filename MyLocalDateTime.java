import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLocalDateTime {
  public static void main(String[] args) {  
	  LocalDateTime date1 = LocalDateTime.now().plusMinutes(180);  
	  System.out.println("Before formatting - Date1: " + date1);  
	  
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	  String formattedDate = date1.format(formatter);  
	  System.out.println("After formatting - Date1: " + formattedDate); 
	  
	  System.out.println("--------------------------");  
	  
	  LocalDateTime date2 = LocalDateTime.now().plusMinutes(180); 
	  System.out.println("Date2: " + date2); 
	  
	  System.out.println("--------------------------");
	  
	  LocalDateTime date3 = LocalDateTime.now().minusMinutes(180);
	  System.out.println("Date3: " + date3);
	  
	  System.out.println("--------------------------"); 
	  
	  LocalDateTime date4 = LocalDateTime.parse("2023-08-30T23:43:16.970910"); 
	  System.out.println("Date4: " + date4);  
  } 
}
