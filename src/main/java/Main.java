import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ship<Pirate> pirateShip = new Ship<>();
        pirateShip.add(new Pirate("Jan", "Nowak"));
        Pirate pirate = pirateShip.findBySurname("Nowak");
        System.out.println(pirate.cannonShot());

        Ship<Merchant> merchantShip = new Ship<>();
        merchantShip.add(new Merchant("Karol", "Wiśniewski"));
        Merchant merchant = merchantShip.findBySurname("Wiśniewski");
        System.out.println(merchant.tradeSummary(Arrays.asList(1D, 2D, 3D, 4D, 40D)));


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
