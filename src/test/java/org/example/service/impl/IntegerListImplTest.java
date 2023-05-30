package org.example.service.impl;

import org.example.service.IntegerList;
import org.junit.Assert;
import org.junit.Test;

public class IntegerListImplTest {
    private final IntegerList integerList = new IntegerListImpl(0);
    @Test
    public void shouldAddItem() {
        //given
        Integer[] integerList2 = {1, 2, 3};
        //when
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //then
        Assert.assertEquals(integerList2, integerList);
    }
@Test
public void shouldSortArrCorrectly() {
//given
Integer[] arr = {100, 99, 98, 77, 50, 60, 45, 30, 31, 0};
Integer[] arr2 = {0, 30, 31, 45, 50, 60, 77, 98, 99, 100};
//when
integerList.sort(arr);
//then
    Assert.assertEquals(arr2, arr);
}
}
