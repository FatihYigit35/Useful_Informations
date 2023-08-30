import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class MyOffsetDateTime {
   public static void main(String[] args) {
     LocalDateTime date = LocalDateTime.parse("2017-02-03T12:30:30");
     System.out.println(date);

     ZoneOffset zoneOffSet= ZoneOffset.ofHours(-2);
     OffsetDateTime date1 = date.atOffset(zoneOffSet);
     System.out.println(date1);  

     ZoneOffset zoneOffSet2= ZoneOffset.of("+03:00");
     OffsetDateTime date2 = OffsetDateTime.now(zoneOffSet2);
     System.out.println(date2); 
   }
}
