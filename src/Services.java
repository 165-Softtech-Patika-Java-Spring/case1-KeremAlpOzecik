public class Services {
    HomeDB db=new HomeDB();

    //Ev Fiyatları ile ilgili metotlar
    public int SumofApartmentPrices(){
        int sum=0;
        for (Apartment apartment :db.getApartment()
        ) {
           sum+= apartment.getPrice();
        }

        return sum;
    }

    public int SumofVillasPrices(){
        int sum=0;
        for (Villa villa:db.getVilla()
        ) {
            sum+=villa.getPrice();
        }

        return sum;
    }
    public int SumofSummerHousesPrices(){
        int sum=0;
        for (SummerHouse sh:db.getSummerHouse()
        ) {
            sum+=sh.getPrice();
        }

        return sum;
    }
    public void getTotal(){
        int sum= SumofApartmentPrices()+SumofVillasPrices()+SumofSummerHousesPrices();
        System.out.println("Tüm Evlerin Toplam Fiyatı: "+sum+"TL");
    }
//Ev Metrekaresi ile ilgili metotlar
public int AverageApartmenSqrm(){
    int sum=0;
    for (Apartment apartment :db.getApartment()
    ) {
        sum+= apartment.getSqrmtrs();
    }

    return sum/db.getApartment().size();
}

    public int AverageVillasSqrm(){
        int sum=0;
        for (Villa villa:db.getVilla()
        ) {
            sum+=villa.getSqrmtrs();
        }

        return sum/db.getSummerHouse().size();
    }
    public int AverageSummerHouseSqrm(){
        int sum=0;
        for (SummerHouse sh:db.getSummerHouse()
        ) {
            sum+=sh.getSqrmtrs();
        }

        return sum/db.getSummerHouse().size();
    }

    public void getAverageSqrm(){
        int sum = ((AverageApartmenSqrm()*db.getApartment().size())+
                (AverageVillasSqrm()*db.getVilla().size())+
                (AverageSummerHouseSqrm()*db.getSummerHouse().size()));
        int totalHouse=db.getApartment().size()+db.getVilla().size()+db.getSummerHouse().size();
        double average= (double)sum/totalHouse;
        System.out.println("Tüm evlerin ortalama alanı: "+average+"m2\n");
    }

    //Filtreleme sorusu

    public void getHousesWithFilter(int room,int living_room){
        System.out.println("Kriterlerinize Uygun "+room+"+"+living_room+" Evler");
        System.out.println("-".repeat(72));
        for (Apartment apt:db.getApartment()
             ) {
            if(apt.getRoom() ==room && apt.getLiving_room()==living_room)
                System.out.println(apt.toString());

        }
        for (Villa vll:db.getVilla()
        ) {
            if(vll.getRoom() ==room && vll.getLiving_room()==living_room)
                System.out.println(vll.toString());

        }
        for (SummerHouse sh:db.getSummerHouse()
        ) {
            if(sh.getRoom() ==room && sh.getLiving_room()==living_room)
                System.out.println(sh.toString());

        }


    }
}
