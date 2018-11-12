package com.ph.stateless.ppnr.util;

public final class YearAndQuarter {

    private int year;
    private int quarter;

    private YearAndQuarter(int year, int quarter){
        this.year = year;
        this.quarter = quarter;
    }

    public static YearAndQuarter of(int year, int quarter) {
        return new YearAndQuarter(year, quarter);
    }

    public YearAndQuarter next() {

        if (quarter == 4) {
            quarter = 1;
            year++;
        } else {
            quarter++;
        }
        return new YearAndQuarter(year, quarter);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("year: ")
                .append(year)
                .append(" quarter: ")
                .append(quarter)
                .toString();
    }
}
