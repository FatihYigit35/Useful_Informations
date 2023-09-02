<h1>My Output</h1>

----------------------------

localDateTimeNow

2023-09-02T17:22:00.199765800
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

2023-09-02T10:52:00.203755-03:30
----------------------------

offsetDateTimeWithZoneOffSetOf + ZoneOffset.of("+03:00")

2023-09-02T17:22:00.203755+03:00
----------------------------

offsetDateTimeWithZoneOffSetOf.format(isoFormatter)

2023-09-02T17:22:00.203755+03:00
----------------------------

offsetDateTimeWithZoneOffSetOf.format(myFormatter)

2023-09-02T17:22:00+03:00
----------------------------

OffsetDateTimeParse

2023-02-08T02:30:30+03:00
----------------------------
