package valdes.com.company.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static valdes.com.company.BubbleSort.sort;

class BubbleSortTest {
    TestCase testCase = new TestCase();
    TestResult testResult = new TestResult();
    int[] actualOrderResult;
    String[] actualItemsResult;

    @Test
    void test1() {
        String[] expectedItems = testCase.testData1;
        int[] expectedOrder = testCase.testOrder1;
        actualItemsResult = testResult.items1;
        actualOrderResult = testResult.order1;
        sort(expectedItems, expectedOrder);
        Assertions.assertArrayEquals(actualOrderResult, expectedOrder);
        Assertions.assertArrayEquals(actualItemsResult, expectedItems);
    }

    @Test
    void test2() {
        String[] expectedItems = testCase.testData2;
        int[] expectedOrder = testCase.testOrder2;
        actualItemsResult = testResult.items2;
        actualOrderResult = testResult.order2;
        sort(expectedItems, expectedOrder);
        Assertions.assertArrayEquals(actualOrderResult, expectedOrder);
        Assertions.assertArrayEquals(actualItemsResult, expectedItems);

    }

    @Test
    void test3() {
        String[] expectedItems = testCase.testData3;
        int[] expectedOrder = testCase.testOrder3;
        actualItemsResult = testResult.items3;
        actualOrderResult = testResult.order3;
        sort(expectedItems, expectedOrder);
        Assertions.assertArrayEquals(actualOrderResult, expectedOrder);
        Assertions.assertArrayEquals(actualItemsResult, expectedItems);
    }

}