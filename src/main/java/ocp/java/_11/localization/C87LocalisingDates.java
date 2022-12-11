package ocp.java._11.localization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class C87LocalisingDates {

    public static void main(String[] args) {

        Locale locUS = Locale.US;
        Locale locFrench = new Locale("fr", "FR");
        Locale locGerman = Locale.GERMANY;

        DateTimeFormatter dateShortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter dateMediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter dateLongFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter dateFullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        DateTimeFormatter timeShortFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter timeMediumFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter timeLongFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter timeFullFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);

        DateTimeFormatter dateTimeShortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter dateTimeMediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter dateTimeLongFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter dateTimeFullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        format(locUS,dateShortFormatter);
        format(locUS,dateMediumFormatter);
        format(locUS,dateLongFormatter);
        format(locUS,dateFullFormatter);

        format(locFrench,dateShortFormatter);
        format(locFrench,dateMediumFormatter);
        format(locFrench,dateLongFormatter);
        format(locFrench,dateFullFormatter);

        format(locGerman,dateShortFormatter);
        format(locGerman,dateMediumFormatter);
        format(locGerman,dateLongFormatter);
        format(locGerman,dateFullFormatter);


        format(locUS,timeShortFormatter);
        format(locUS,timeMediumFormatter);
        //format(locUS,timeLongFormatter);
        //format(locUS,timeFullFormatter);

        format(locFrench,timeShortFormatter);
        format(locFrench,timeMediumFormatter);
        //format(locFrench,timeLongFormatter);
        //format(locFrench,timeFullFormatter);

        format(locGerman,timeShortFormatter);
        format(locGerman,timeMediumFormatter);
        //format(locGerman,timeLongFormatter);
        //format(locGerman,timeFullFormatter);


        format(locUS,dateTimeShortFormatter);
        format(locUS,dateTimeMediumFormatter);
        //format(locUS,dateTimeLongFormatter);
        //format(locUS,dateTimeFullFormatter);

        format(locFrench,dateTimeShortFormatter);
        format(locFrench,dateTimeMediumFormatter);
        //format(locFrench,dateTimeLongFormatter);
        //format(locFrench,dateTimeFullFormatter);

        format(locGerman,dateTimeShortFormatter);
        format(locGerman,dateTimeMediumFormatter);
        //format(locGerman,dateTimeLongFormatter);
        //format(locGerman,dateTimeFullFormatter);



    }

    public static void format(Locale locale, DateTimeFormatter formatter){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(formatter.withLocale(locale).format(ldt));
    }
}
