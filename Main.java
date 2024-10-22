import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(1000, 2000, 500, 3000, 600, 1200, 800);

Integer thirdHighestSalary = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Less than 3 distinct salaries available"));

}
}
