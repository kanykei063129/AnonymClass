import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        Supplier<LocalTime>supplier=LocalTime::now;
//        System.out.println(supplier.get());

//        Supplier<Double>supplier1 = () -> (Math.random());
//        System.out.println(supplier1.get());

//        Function<String,Integer>function = (q) -> Integer.valueOf(q);
//        int a = function.apply("123");
//        System.out.println(a+3);

//        BiFunction<String,String,Integer> biPredicate=(a, b) -> a.length()+b.length();
//        System.out.println(biPredicate.apply("Datka","Kairat"));

//        Predicate<String>predicate = x -> x.length()<10;
//        System.out.println(predicate.test("Kairat"));

//        List<String>strings = new ArrayList<>();
//        strings.add("Java");
//        strings.add("Js");
//        Predicate<String>predicate = x -> x.length()<10;
//        for (String st:strings) {
//            System.out.println(predicate.test(st));

//        BiPredicate<String,String>biPredicate = (x,y) -> x.contains(y);
//        System.out.println(biPredicate.test("Datka","Datka"));

//        Consumer<String>consumer = System.out::println;
//        consumer.accept("Hello");

        System.out.println("----------SUPPLIER----------");
        List<String> strings = new ArrayList<>();
        strings.add("Kanykei");
        strings.add("Madina");
        Supplier<Double> supplier = () -> (Math.random());
        System.out.println(supplier.get());
        Supplier<LocalTime> supplier1 = LocalTime::now;
        System.out.println(supplier1.get());

        System.out.println("----------FUNCTION----------");
        Function<String, Integer> function = (q) -> Integer.valueOf(q);
        int a = function.apply("123");
        System.out.println(a);
        Function<String, Integer> function1 = (x) -> x.length();
        System.out.println(function1.apply("Adilet"));

        System.out.println("----------PREDICATE----------");
        Predicate<Integer> predicate = x -> x > 6;
            System.out.println(predicate.test(4));
            Predicate<String>predicate1 = (x) -> x.contains("a");
            System.out.println(predicate1.test(strings.get(0)));

        System.out.println("----------BIPREDICATE----------");
            BiPredicate<Integer,Integer> biPredicate=(c, b) -> c == (b);
            System.out.println(biPredicate.test(2,5));
            BiPredicate<String,String>biPredicate1 = (x,y) -> x.contains(y);
            System.out.println(biPredicate1.test("Ulan","Ulan"));

        System.out.println("----------BIFUNCTION----------");
            BiFunction<Integer,Integer,Integer>biFunction = (x,y) -> (x +y);
            System.out.println(biFunction.apply(10,10));
            BiFunction<Integer,Integer,Integer>biFunction1 = (s,t) -> (s - 32)*5/9;
            System.out.println(biFunction1.apply(29,29));
        }
    }

