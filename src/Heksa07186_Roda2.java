package heksa07186_cuci.mobil.dan.motor;

public class Heksa07186_Roda2 {
    
    String Merk,Warna,PlatNomor;
   public Heksa07186_Roda2(String PlatNomor, String Merk, String Warna) {
          this.PlatNomor=PlatNomor;
          this.Merk=Merk;
          this.Warna=Warna;
    }
   String getPlatNomor(){
       return this.PlatNomor;
   }
   String getMerk(){
       return this.Merk;
   }
   String getWarna(){
       return this.Warna;
   }
}

