
public class Test {
    public static void main(String[] args) {


        Services s = new Services();
        System.out.println("Apartman Daireleri'nin toplam fiyatı: "+s.SumofApartmentPrices()+"TL");
        System.out.println("Yazlıklar'ın toplam fiyatı: "+s.SumofSummerHousesPrices()+"TL");
        System.out.println("Villalar'ın toplam fiyatı: "+s.SumofVillasPrices()+"TL\n");

        System.out.println("Apartman Daireleri'nin ortalama alanı: "+s.AverageApartmenSqrm()+"m2");
        System.out.println("Yazlıklar'ın ortalama alanı: "+s.AverageSummerHouseSqrm()+"m2");
        System.out.println("Villalar'ın ortalama alanı: "+s.AverageVillasSqrm()+"m2\n");


        s.getTotal();
        s.getAverageSqrm();


        s.getHousesWithFilter(5,2);




    }
}
