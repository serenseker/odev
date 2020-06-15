import java.util.*;


public class Personel{

     public static void main(String []args){
        employee personel = new employee("seren",21);
        System.out.println(personel.yazdir());
        boss personel = new boss();
     }
}

public class employee {

   



   public String adsoyad;
   private int maas;
   private String gorevi;
   public int yas;



   public employee() {

  }

  public employee(String ad, int yasa) {

   adsoyad=ad;
   yas=yasa;

  }


   
  
   public String getgorevi()
   {
   return gorevi;
   }
   public void setgorevi(String gorevi)
   {
   this.gorevi=gorevi;
   }
   public int getmaas()
   {
   return maas;
   }
   public void setmaas(int maas)
   {
   this.maas=maas;
   }

   @Override
   public String yazdir() {


       return "Personel{" +
               "adsoyad='" + adsoyad + '\'' +
               ", gorevi='" + gorevi + '\'' +

               '}';
   }

   private void yetkili(){
      Scanner input = new Scanner(System.in);
      System.out.println("Yetkili lütfen maaş giriniz :");
      setmaas(input.nextInt())
      System.out.println("Yetkili lütfen görevi giriniz :");
      setgorevi(input.nextLine())
   }

   public void giderhesapla(){
      System.out.println("Gider sigorta dahil  :" + getmaas()+1500);
   }

   }

   class boss extends employee {

     private String yonetimkurulu;
     private String departman;
     private String yetkisuresi;


     
   public String getyonetimkurulu()
   {
   return yonetimkurulu;
   }
   public void setyonetimkurulu(String yonetimkurulu)
   {
   this.yonetimkurulu=yonetimkurulu;
   }

   public String getdepartman()
   {
   return departman;
   }
   public void setdepartman(String departman)
   {
   this.departman=departman;
   }


   public String getyetkisuresi()
   {
   return yetkisuresi;
   }
   public void ysetetkisuresi(String yetkisuresi)
   {
   this.yetkisuresi=yetkisuresi;
   }



   
  }