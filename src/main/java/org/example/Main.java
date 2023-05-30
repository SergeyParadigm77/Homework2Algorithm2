package org.example;
import org.example.service.IntegerList;
import org.example.service.impl.IntegerListImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.random() * 100;
            //System.out.println(arr[i] + " " + i);
        }
        Integer[] arr2 = Arrays.copyOf(arr, 100000);
        Integer[] arr3 = Arrays.copyOf(arr, 100000);

        long start = System.currentTimeMillis();
        sortBubble(arr);
        System.out.println(System.currentTimeMillis() - start);
        long start2 = System.currentTimeMillis();
        sortSelection(arr2);
        System.out.println(System.currentTimeMillis() - start2);
        long start3 = System.currentTimeMillis();
        sortInsertion(arr3);
        System.out.println(System.currentTimeMillis() - start3);

    }
    //метод перемены элементов массива местами
    private static void swapElements(Integer[] arr, int indexA, int indexB) {
        Integer tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }
    //метод сортировки пузырьком
    public static void sortBubble(Integer[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swapElements(arr, j, j + 1);
                    }
                }
            }
        }
        //сортировка выбором
    public static void sortSelection(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }
    //сортировка вставкой
    public static void sortInsertion(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Integer temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    }