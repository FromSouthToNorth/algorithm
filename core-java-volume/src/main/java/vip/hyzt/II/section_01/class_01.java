package vip.hyzt.II.section_01;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class_01 {

    public static <T> void show(String title, Stream<T> stream) {
        final int size = 10;
        List<T> firstElement = stream
            .limit(size + 1)
            .collect(Collectors.toList());
        System.out.print(title + ": ");
        for (int i = 0; i < firstElement.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            if (i < size) {
                System.out.print(firstElement.get(i));
            }
            else {
                System.out.print("...");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            String path = "/Users/${path}/Documents/Java/algorithm/core-java-volume/src/main/resources/class_01.txt";
            String contents = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
            List<String> word = List.of(contents.split("\\PL+"));

            long count = 0;

            for (String s : word) {
                count += s.length() > 12 ? 1 : 0;
            }

            count = word.stream()
                .filter(p -> p.length() > 12)
                .count();

            count = word.parallelStream()
                .filter(p -> p.length() > 12).count();

            System.out.printf("count: %d\n", count);


            Stream<String> words = Stream.of(contents.split("\\PL+"));
            show("words", words);
            Stream<String> song = Stream.of("gently", "down", "then");
            show("song", song);
//            System.out.printf("%s\n", song.filter(e -> {return "down".equals(e);}));
            Stream<Object> empty = Stream.empty();
            show("empty", empty);
            Stream<String> echo = Stream.generate(() -> "Echo");
            show("echo", echo);
            Stream<Double> random = Stream.generate(Math::random);
            show("random", random);

            Stream<BigDecimal> iterate = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE));
            show("iterate", iterate);



            // L = 2π2.75 + 4(2.75-2);
//            double maxRadius = 5.5 / 2, minRadius = 4.0 / 2;
//            System.out.printf("%f, %f \n", maxRadius, minRadius);
//            double sqrt =  2 * Math.PI * Math.sqrt(((maxRadius * maxRadius) + (minRadius * minRadius) / 2));
//            System.out.printf("sqrt: %f\n", sqrt);
//            System.out.printf("%s\b", 2 * Math.PI * minRadius + ((maxRadius * maxRadius) - (minRadius * minRadius)));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
