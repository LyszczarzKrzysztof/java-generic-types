

public class Main {
    public static void main(String[] args) {
        Ship marinerShip = new Ship();
        marinerShip.add(new Merchant("Jan","Nowak"));
        Mariner mariner = marinerShip.findBySurname("Nowak");
        System.out.println(((Pirate)mariner).cannonShot());




//        UWAGA! jesli dodamy marinera jako merchanta : to rzutowanie na Pirate wywoła błąd!!!!
//        marinerShip.add(new Merchant("Jan","Nowak"));
//        rzutowanie marinera na pirata
//        System.out.println(((Pirate)mariner).cannonShot());

//        List<String> stringList = new ArrayList<>();
//        List<Integer> integerList = new ArrayList<>();
//
//        // java do 1.5 lista nie miala parametru
//        List list = new ArrayList();
//        list.add("Krzysiek");
//        list.add(1);
//
//        list.get(0);
//        list.get(1);
    }
}
