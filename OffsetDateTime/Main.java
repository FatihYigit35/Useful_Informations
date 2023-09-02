import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        System.out.println("----------------------------");

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("localDateTimeNow");
        System.out.println(localDateTimeNow);
        System.out.println("----------------------------");

        LocalDateTime localDateTimeParse = LocalDateTime.parse("2023-02-08T02:30:55");
        System.out.println("localDateTimeParse");
        System.out.println(localDateTimeParse);
        System.out.println("----------------------------");

        ZoneOffset zoneOffSetOfHoursM3 = ZoneOffset.ofHours(-3);
        OffsetDateTime offsetDateTimeFromLocalDateTimeParse = localDateTimeParse.atOffset(zoneOffSetOfHoursM3);
        System.out.println("offsetDateTimeFromLocalDateTimeParse + ZoneOffset.ofHours(-3)");
        System.out.println(offsetDateTimeFromLocalDateTimeParse);
        System.out.println("----------------------------");

        ZoneOffset zoneOffSetOfHoursP2 = ZoneOffset.ofHours(+2);
        OffsetDateTime offsetDateTimeFromWithOffsetSameInstant = offsetDateTimeFromLocalDateTimeParse.withOffsetSameInstant(zoneOffSetOfHoursP2);
        System.out.println("offsetDateTimeFromWithOffsetSameInstant + ZoneOffset.ofHours(+2)");
        System.out.println(offsetDateTimeFromWithOffsetSameInstant);
        System.out.println("----------------------------");

        ZoneOffset zoneOffSetOfHoursMinutes = ZoneOffset.ofHoursMinutes(-3, -30);
        OffsetDateTime offsetDateTimeNowWithZoneOffSetOfHoursMinutes = OffsetDateTime.now(zoneOffSetOfHoursMinutes);
        System.out.println("offsetDateTimeNowWithZoneOffSetOfHoursMinutes + ZoneOffset.ofHoursMinutes(-3, -30)");
        System.out.println(offsetDateTimeNowWithZoneOffSetOfHoursMinutes);
        System.out.println("----------------------------");

        ZoneOffset zoneOffSetOf = ZoneOffset.of("+03:00");
        OffsetDateTime offsetDateTimeWithZoneOffSetOf = OffsetDateTime.now(zoneOffSetOf);
        System.out.println("offsetDateTimeWithZoneOffSetOf + ZoneOffset.of(\"+03:00\")");
        System.out.println(offsetDateTimeWithZoneOffSetOf);
        System.out.println("----------------------------");

        System.out.println("offsetDateTimeWithZoneOffSetOf.format(isoFormatter)");
        System.out.println(offsetDateTimeWithZoneOffSetOf.format(isoFormatter));
        System.out.println("----------------------------");

        System.out.println("offsetDateTimeWithZoneOffSetOf.format(myFormatter)");
        System.out.println(offsetDateTimeWithZoneOffSetOf.format(myFormatter));
        System.out.println("----------------------------");

        OffsetDateTime OffsetDateTimeParse = OffsetDateTime.parse("2023-02-08T02:30:30+03:00");
        System.out.println("OffsetDateTimeParse");
        System.out.println(OffsetDateTimeParse);
        System.out.println("----------------------------");

        /*
            -> My Output:
            ----------------------------
            localDateTimeNow
            2023-09-02T17:27:46.897558200
            ----------------------------
            localDateTimeParse
            2023-02-08T02:30:55
            ----------------------------
            offsetDateTimeFromLocalDateTimeParse + ZoneOffset.ofHours(-3)
            2023-02-08T02:30:55-03:00
            ----------------------------
            offsetDateTimeFromWithOffsetSameInstant + ZoneOffset.ofHours(+2)
            2023-02-08T07:30:55+02:00
            ----------------------------
            offsetDateTimeNowWithZoneOffSetOfHoursMinutes + ZoneOffset.ofHoursMinutes(-3, -30)
            2023-09-02T10:57:46.903545-03:30
            ----------------------------
            offsetDateTimeWithZoneOffSetOf + ZoneOffset.of("+03:00")
            2023-09-02T17:27:46.903545+03:00
            ----------------------------
            offsetDateTimeWithZoneOffSetOf.format(isoFormatter)
            2023-09-02T17:27:46.903545+03:00
            ----------------------------
            offsetDateTimeWithZoneOffSetOf.format(myFormatter)
            2023-09-02T17:27:46+03:00
            ----------------------------
            OffsetDateTimeParse
            2023-02-08T02:30:30+03:00
            ----------------------------
        */
    }
}
