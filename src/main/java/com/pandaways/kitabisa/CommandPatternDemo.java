package com.pandaways.kitabisa;

import com.pandaways.kitabisa.usecase.PrimeUseCase;
import com.pandaways.kitabisa.usecase.SortCombineUseCase;

import java.util.Arrays;

public class CommandPatternDemo {

    public static void main(String[] args) {
        PrimeUseCase primeUseCase = new PrimeUseCase();
        primeUseCase.setParam(4);

        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(Arrays.asList(4, 3, 6, 5, 1, 2));
        sortCombineUseCase.setmParamString(Arrays.asList("F", "C", "D", "B", "A"));

        Executor executor = new Executor();
        executor.placeUseCase(primeUseCase);
        executor.placeUseCase(sortCombineUseCase);

        executor.execute();
    }

}
