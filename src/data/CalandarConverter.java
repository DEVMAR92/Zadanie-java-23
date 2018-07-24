package data;

public class CalandarConverter {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        if (dayNumber <= 7 || dayNumber >= 1) {
            String dayString = null;

            switch (dayNumber) {
                case MONDAY:
                    dayString = MONDAY + " dzień tygodnia to Poniedziałek";
                    break;
                case TUESDAY:
                    dayString = TUESDAY + " dzień tygodnia to Wtorek";
                    break;
                case WEDNESDAY:
                    dayString = WEDNESDAY + " dzień tygodnia to Sroda";
                    break;
                case THURSAY:
                    dayString = THURSAY + " dzień tygodnia to Czwartek";
                    break;
                case FRIDAY:
                    dayString = FRIDAY + " dzień tygodnia to Piątek";
                    break;
                case SATURDAY:
                    dayString = SATURDAY + " dzień tygodnia to Sobota";
                    break;
                case SUNDAY:
                    dayString = SUNDAY + " dzień tygodnia to Niedziela";
                    break;

            }
            return dayString;

        } else
            return null;
    }

}
