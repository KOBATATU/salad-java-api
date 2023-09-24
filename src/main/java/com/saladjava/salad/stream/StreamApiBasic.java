package com.saladjava.salad.stream;

import java.util.*;

//・mapメソッド・filterメソッド・anyMatch、allMatchメソッド・max、min、average、sumメソッド・count、findFirstメソッド・limit、skipメソッド・distinct、sortedメソッド・boxed、mapToInt、mapToDoubleメソッド

public class StreamApiBasic {
    public static void main(String[] args){
        int[] array = new int[] {1,2,3,4,5};
        String[] arrayStr = new String[]{"lion", "mouse", "cat", "dog", "fox", "bear" };

        // map
        int[] array2 = Arrays.stream(array).map(n -> n + 2).toArray();
        for (int value: array2) {
            System.out.printf("足し算：%s%n", value);
        }

        // map filter
        int[] array3 = Arrays.stream(array).filter(n -> n % 2 == 0).toArray();
        for (int value: array3) {
            System.out.printf("偶数：%s%n", value);
        }

        // anyMatch
        if(Arrays.stream(array).anyMatch(n -> n==3)) {
            System.out.println("3が含まれている");
        }

        // max, min, average
        int arrayMax = Arrays.stream(array).max().getAsInt();
        int arrayMin = Arrays.stream(array).min().getAsInt();
        Arrays.stream(array).average().ifPresent((a) -> {
            System.out.printf("平均：%s%n", a);
        });

        // Integer streamはない(IntStream, DoubleStream型は存在する) 一度Intに変換する必要がある
        // Stream<Integer>, Stream<IntStream>. max,minなどが適用できるのはStream<IntStream or DoubleStream>ということ
        Integer[] arrayInteger = new Integer[] {1,2,3,4,5};
        int arrayIntegerMax = Arrays.stream(arrayInteger).mapToInt(n -> n).max().getAsInt();

        // count,findFirst
        long arrayCount = Arrays.stream(array).filter(n -> n % 2 == 0).count();
        String firstStr = Arrays.stream(arrayStr).filter(n -> n.length() == 3).findFirst().orElse("hoge");


        // distinct, sorted
        int[] arrayDistinct = Arrays.stream(array).distinct().toArray();
        int[] arraySorted = Arrays.stream(array).sorted().toArray();

        // sorted(降順) Comparator メソッドを使って行う. このメソッド自体はStreamIntを受け付けないのでIntegerに変換必要
        List<Integer> arraySortedDesc = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).toList();

    }
}
