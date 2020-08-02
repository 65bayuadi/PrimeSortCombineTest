package com.pandaways.kitabisa;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private List<UseCase> useCases = new ArrayList<UseCase>();

    public void placeUseCase(UseCase useCase) {
        this.useCases.add(useCase);
    }

    public void execute() {
        for (UseCase useCase : useCases) {
            System.out.println(useCase.execute());
            System.out.println();
        }

        useCases.clear();
    }
}
