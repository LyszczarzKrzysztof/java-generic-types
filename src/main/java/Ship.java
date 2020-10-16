import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Mariner> marinerList;
    public Ship(){this.marinerList = new ArrayList<>();}

    public void add(Mariner mariner){
        marinerList.add(mariner);
    }


    public Mariner findBySurname(String surname) {
        return marinerList.stream().filter(e -> e.getSurname().equals(surname)).findFirst().get();
    }
}

