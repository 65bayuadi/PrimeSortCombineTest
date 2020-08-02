package com.pandaways.kitabisa.usecase;

import com.pandaways.kitabisa.UseCase;

import java.util.*;

public class SortCombineUseCase implements UseCase {
    private List<Integer> mParamNumber;
    private List<String> mParamString;

    public void setmParamNumber(List<Integer> paramNumber) {
        this.mParamNumber = paramNumber;
    }

    public void setmParamString(List<String> paramString) {
        this.mParamString = paramString;
    }

    public List<Map<Integer, String>> sortAndCombine() {
        List<Map<Integer, String>> result = new ArrayList<>();

        Collections.sort(mParamNumber);
        Collections.sort(mParamString);

        int maxLength = Math.max(mParamNumber.size(), mParamString.size());

        Integer numHelper;
        String strHelper;
        Map<Integer, String> resHelper;
        for (int i = 0; i < maxLength; i++) {
            resHelper = new HashMap<>();
            try {
                numHelper = mParamNumber.get(i);
            } catch (Exception e) {
                numHelper = null;
            }

            try {
                strHelper = mParamString.get(i);
            } catch (Exception e) {
                strHelper = null;
            }

            resHelper.put(numHelper, strHelper);
            result.add(resHelper);
        }

        return result;
    }

    public String execute() {
        return sortAndCombine().toString();
    }
}
