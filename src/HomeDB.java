import java.util.ArrayList;

public class HomeDB {
    private ArrayList<Apartment> apartment =new ArrayList<>();
    private ArrayList<Villa> villa=new ArrayList<>();
    private ArrayList<SummerHouse> summerHouse =new ArrayList<>();
    public HomeDB() {
        apartment.add(new Apartment(120000,3,1,120));
        apartment.add(new Apartment(520000,5,1,170));
        apartment.add(new Apartment(1000000,5,2,230));
        villa.add(new Villa(5120000,10,3,500));
        villa.add(new Villa(1000000,14,6,900));
        villa.add(new Villa(9000000,40,11,1600));
        summerHouse.add(new SummerHouse(500000,2,1,90));
        summerHouse.add(new SummerHouse(1500000,5,2,190));
        summerHouse.add(new SummerHouse(5500000,7,4,300));

    }

    public ArrayList<Villa> getVilla() {
        return villa;
    }

    public ArrayList<SummerHouse> getSummerHouse() {
        return summerHouse;
    }

    public ArrayList<Apartment> getApartment() {
        return apartment;
    }
}
