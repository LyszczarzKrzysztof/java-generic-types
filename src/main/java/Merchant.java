import java.util.List;

public class Merchant extends Mariner {

    public Merchant(String name, String surname) {
        super(name, surname);
    }

    public Double tradeSummary(List<? extends Number> doubles) {
        Double sum = Double.valueOf(0);
        for (Number s : doubles) {
            sum+=s.doubleValue();
        }

        return sum;
    }
}
