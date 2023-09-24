package com.saladjava.salad.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiAdvanced {
    public static void main(String[] args){
        int[] array = new int[] {5,2,6,4,3};
        String[] arrayStr = new String[]{"lion", "mouse", "cat", "dog", "fox", "bear" };

        // reduce
        int arraySum = Arrays.stream(array).reduce((a, b) -> {
            System.out.println(a);
            return a + b;
        }).getAsInt();
        System.out.printf("合計：%s%n", arraySum);

        // Streamオブジェクト作成
        Stream stream = Stream.empty();
        // Stream.ofはIntStreamを返さない https://qiita.com/rebi/items/ca2a0c92db71dfc953f1
        Object[] array2 = Stream.of(array).distinct().toArray();
        // Stream concat Streamオブジェクトをjoin
        Stream.concat(Stream.of(array), Stream.of(array));

        // forEach, forEachOrdered(forEachは順序が変わるかもしれないので順序を保証する場合はこれを使う), Peek
        Arrays.stream(array).forEach(System.out::println);

        //クラスを扱うStream
        Robot robot = new Robot("A", "青", 1);
        Robot robot2 = new Robot("B", "赤", 2);
        List<Robot> robots = new ArrayList<>();
        robots.add(robot);
        robots.add(robot2);

        // robots.stream()は、robotsリストからStream<Robot>を生成するメソッド。これにより、Stream<Robot>型のストリームが作成され、それをStream<Robot>型の変数に代入する
        // メソッド参照の方法で記述している.
        List<String> names = robots.stream().map(Robot::getName).toList();

        // Collectors
        Map<String, String> robotMap = robots.stream().collect(Collectors.toMap(
                Robot::getName,
                Robot::getColor
        ));
        // collectメソッドのグループ化. 色によりRobotをグループ化できる
        Map<String, List<Robot>> groupColor = robots.stream().collect(Collectors.groupingBy(Robot::getColor));
        // partition
        Map<Boolean, List<Robot>> partitionColor = robots.stream().collect(Collectors.partitioningBy(r -> r.getColor().equals("青")));

        // クラスソート
        Comparator<Robot> comparator = Comparator.comparing(Robot::getSeries).thenComparing(Robot::getColor);
        List<Robot> robotSorted = robots.stream().sorted(comparator).toList();
        // reversed(1つめでシリーズを降順に。2つめのreversedで昇順に変更される)
        Comparator<Robot> comparatorReversed = Comparator.comparing(Robot::getSeries).reversed().thenComparing(Robot::getColor).reversed();
        List<Robot> robotsReversed = robots.stream().sorted(comparatorReversed).toList();

        // takeWhile(条件に合わないものをそれ以上取得しない) filterと同じ
        Arrays.stream(array).takeWhile(n -> n < 4).toArray();

    }

    static class Robot
    {
        private String name = "", color = "";
        private int series = 0;
        public Robot(String name, String color, int series)
        {
            this.name = name;
            this.color = color;
            this.series = series;
        }

        public String getName()
        {
            return name;
        }

        public String getColor()
        {
            return color;
        }

        public int getSeries()
        {
            return series;
        }
    }

}
