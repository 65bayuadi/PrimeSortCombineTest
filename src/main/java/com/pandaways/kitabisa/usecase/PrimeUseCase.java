package com.pandaways.kitabisa.usecase;

import com.pandaways.kitabisa.UseCase;

import java.util.ArrayList;
import java.util.List;

public class PrimeUseCase implements UseCase {
    private int mParam;

    public void setParam(int param) {
        this.mParam = param;
    }

    public List<Integer> getPrimeNumbers() {
        List<Integer> result = new ArrayList<Integer>();
        int counter, number = 0, i = 1, j;
        while (number < mParam) {
            j = 1;
            counter = 0;
            while (j <= i) {
                if (i % j == 0)
                    counter++;
                j++;
            }

            if (counter == 2) {
                result.add(i);
                number++;
            }

            i++;
        }
        return result;
    }

    public String execute() {
        return getPrimeNumbers().toString();
    }
}
