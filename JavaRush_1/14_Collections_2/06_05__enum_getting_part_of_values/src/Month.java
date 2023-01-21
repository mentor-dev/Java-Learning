public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,  
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return getMonths(11);
    }

    public static Month[] getSpringMonths() {
        return getMonths(2);
    }
    
    public static Month[] getSummerMonths() {
        return getMonths(5);
    }

    public static Month[] getAutumnMonths() {
        return getMonths(8);
    }

    public static Month[] getMonths(int start) {
        Month[] arrayMonths = new Month[3];
        for (int i = 0, index; i < 3; i++) {
            index = start + i;
            index = index <= 11 ? index : index - 12;
            arrayMonths[i] = Month.values()[index];
        }
        return arrayMonths;
    }
}