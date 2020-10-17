import java.util.ArrayList;
import java.util.List;

public class Ship<T extends Mariner> {
    private List<T> marinerList;
    public Ship(){this.marinerList = new ArrayList<>();}

    public void add(T mariner){
        marinerList.add(mariner);
    }


    public T findBySurname(String surname) {
        return marinerList.stream().filter(e -> e.getSurname().equals(surname)).findFirst().get();
    }
}

