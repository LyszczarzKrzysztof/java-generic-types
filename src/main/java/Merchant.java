import java.util.List;

public class Merchant extends Mariner {

    public Merchant(String name, String surname) {
        super(name, surname);
    }

    public Double tradeSummary(List<Double> doubles) {
        Double sum = Double.valueOf(0);
        for (Double s : doubles) {
            sum+=s;
        }

        return sum;
    }
}
