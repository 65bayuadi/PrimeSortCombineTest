package com.pandaways.kitabisa;

import com.pandaways.kitabisa.helper.MockBuilder;
import com.pandaways.kitabisa.usecase.PrimeUseCase;
import com.pandaways.kitabisa.usecase.SortCombineUseCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class UseCaseUnitTest {

    @Test
    public void testPrimeUseCase() {
        PrimeUseCase primeUseCase = new PrimeUseCase();
        primeUseCase.setParam(4);

        List<Integer> actual = primeUseCase.getPrimeNumbers();
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrimeUseCaseWhenInputNegative() {
        PrimeUseCase primeUseCase = new PrimeUseCase();
        primeUseCase.setParam(-4);

        List<Integer> actual = primeUseCase.getPrimeNumbers();
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCase() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(MockBuilder.realNumber());
        sortCombineUseCase.setmParamString(MockBuilder.upperCaseAlphabet());

        List<Map<Integer, String>> actual = sortCombineUseCase.sortAndCombine();
        List<Map<Integer, String>> expected = MockBuilder.mockSortCombine();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCaseWhenInputAllNull() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(Collections.emptyList());
        sortCombineUseCase.setmParamString(Collections.emptyList());

        List<Map<Integer, String>> actual = sortCombineUseCase.sortAndCombine();
        List<Map<Integer, String>> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCaseWhenIinputListNumberNull() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(Collections.emptyList());
        sortCombineUseCase.setmParamString(MockBuilder.upperCaseAlphabet());

        List<Map<Integer, String>> actual = sortCombineUseCase.sortAndCombine();
        List<Map<Integer, String>> expected = MockBuilder.mockSortCombineNullNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCaseWhenInputListStringNull() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(MockBuilder.realNumber());
        sortCombineUseCase.setmParamString(Collections.emptyList());

        List<Map<Integer, String>> actual = sortCombineUseCase.sortAndCombine();
        List<Map<Integer, String>> expected = MockBuilder.mockSortCombineNullString();


        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCaseWhenInputListNumberNegative() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(MockBuilder.negativeNumber());
        sortCombineUseCase.setmParamString(MockBuilder.upperCaseAlphabet());

        List<Map<Integer, String>> actual = sortCombineUseCase.sortAndCombine();
        List<Map<Integer, String>> expected = MockBuilder.mockSortCombineNegativeNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCaseWhenInputListStringEmpty() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(MockBuilder.realNumber());
        sortCombineUseCase.setmParamString(MockBuilder.containEmptyAlphabet());

        List<Map<Integer, String>> actual = sortCombineUseCase.sortAndCombine();
        List<Map<Integer, String>> expected = MockBuilder.mockSortCombineContainEmptyString();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrimeUseCaseExecute() {
        PrimeUseCase primeUseCase = new PrimeUseCase();
        primeUseCase.setParam(4);
        
        String actual = primeUseCase.execute();
        String expected = Arrays.asList(2, 3, 5, 7).toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortCombineUseCaseExecute() {
        SortCombineUseCase sortCombineUseCase = new SortCombineUseCase();
        sortCombineUseCase.setmParamNumber(MockBuilder.realNumber());
        sortCombineUseCase.setmParamString(MockBuilder.upperCaseAlphabet());

        String actual = sortCombineUseCase.execute();
        String expected = MockBuilder.mockSortCombine().toString();

        assertEquals(expected, actual);
    }
}
