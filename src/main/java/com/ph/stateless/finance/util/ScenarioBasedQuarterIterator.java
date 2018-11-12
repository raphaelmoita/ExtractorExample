package com.ph.stateless.finance.util;

import java.util.Iterator;

public class ScenarioBasedQuarterIterator implements Iterator<YearAndQuarter> {

    private YearAndQuarter processedQuarter;
    private int numberOfQuarters;

    private ScenarioBasedQuarterIterator(YearAndQuarter processedQuarter, String scenario) {
        this.processedQuarter = processedQuarter;
        this.numberOfQuarters = getNumberOfQuarters(scenario);
    }

    public static ScenarioBasedQuarterIterator create(YearAndQuarter processedQuarter, String scenario) {
        return new ScenarioBasedQuarterIterator(processedQuarter, scenario);
    }

    public boolean hasNext() {
        return numberOfQuarters > 0;
    }

    public YearAndQuarter next() {
        processedQuarter = processedQuarter.next();
        numberOfQuarters--;
        return processedQuarter;
    }

    private int getNumberOfQuarters(String scenario) {
        if ("Scenario1".equals(scenario)) {
            return 9;
        } else if ("Scenario2".equals(scenario)) {
            return 12;
        } else {
            return 14;
        }
    }

    public static void main(String[] args) {
        YearAndQuarter yearAndQuarter = YearAndQuarter.of(2015, 1);
        Iterator loop = ScenarioBasedQuarterIterator.create(yearAndQuarter, "Scenario1");
        while (loop.hasNext()) {
            System.out.println(loop.next());
        }
    }
}
