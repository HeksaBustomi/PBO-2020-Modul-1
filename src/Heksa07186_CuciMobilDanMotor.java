package heksa07186_cuci.mobil.dan.motor;
import java.util.ArrayList;
import java.util.Scanner;

public class Heksa07186_CuciMobilDanMotor {
    static ArrayList<Heksa07186_Roda2>dataRoda2 = new ArrayList();
    static ArrayList<Heksa07186_Roda4>dataRoda4= new ArrayList();
    static Scanner input = new Scanner(System.in);
    static boolean penunjuk = false;
   
    public static void main(String[] args) {
    
    int pilih;
  
    do{
        System.out.println("1. Daftar ");
        System.out.println("2. Update ");
        System.out.println("3. Hapus Data ");
        System.out.println("4. View Data ");
        System.out.println("5. keluar ");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                Daftar();
                penunjuk = true;
                break;
            case 2 :
                System.out.println("Masukkan Warna Lama :  ");
                String Heksa07186_update = (input.next());
                Update(Heksa07186_update);
                break;
            case 3:
                HapusData();
                break;
            case 4:
                view();
                break;
        }
    }while(pilih<5);
}
    
    static void Daftar(){
        System.out.println("1. Roda 2 ");
        System.out.println("2. Roda 4 ");
        System.out.print("Pilih : ");
        int jenis = input.nextInt();
        
        if (jenis==1) 
               {
                    System.out.print("Masukkan Nomor Plat     : ");
                    String PlatNomor = input.next();
                    System.out.print("Masukkan Merk Kendaraan : ");
                    String Merk = input.next();
                    System.out.print("Masukkan Warna          : ");
                    String Warna = input.next();
                    dataRoda2.add(new Heksa07186_Roda2 (PlatNomor,Merk,Warna));
                  
                }else if(jenis==2)
                {
                    System.out.print("Masukkan Nomor Plat     : ");
                    String PlatNomor = input.next();
                    System.out.print("Masukkan Merk Kendaraan : ");
                    String Merk = input.next();
                    System.out.print("Masukkan Warna          : ");
                    String Warna = input.next();
                    dataRoda4.add(new Heksa07186_Roda4 (PlatNomor,Merk,Warna));
                  
                }else{
                System.out.println("Pilihan Tidak Ada");
              }
            }
    
    static void Update(String Warna)
    {
      for(int i=0;i<dataRoda2.size();i++)
      {
        if(Warna.equals(dataRoda2.get(i).getWarna()))
        {
          System.out.println("Masukkan Warna Baru : ");
          String Heksa07186_update = (input.next());
          dataRoda2.get(i).Warna=Heksa07186_update;
          
        }
        }
      
      
      for(int i=0;i<dataRoda4.size();i++)
      {
        if(Warna.equals(dataRoda4.get(i).getWarna()))
        {
          System.out.println("Masukkan Warna Baru : ");
          String Heksa07186_update = (input.next());
          dataRoda4.get(i).Warna=Heksa07186_update;
          
        }
        }
      }
    
    
    static void HapusData(){
          System.out.println("1.Data Roda 2");
          System.out.println("2.Data Roda 4");
          System.out.println("Pilih : ");
          int pilih = input.nextInt();
          
          switch(pilih){
              case 1:
                  System.out.println("Masukkan Index : ");
                  int index = input.nextInt();
                  for(int i=0;i<dataRoda2.size();i++)
                  {
                   System.out.println("Data Terhapus");
                   dataRoda2.remove(i);
                  }
                  break;
              case 2:
                   System.out.println("Masukkan Index : ");
                   int index1 = input.nextInt();
                  for(int i=0;i<dataRoda4.size();i++)
                  {
                   System.out.println("Data Terhapus");
                   dataRoda4.remove(i);
                  }
                  break;
                 }
               }  
                          
          
static void view() {
       for (int a=0;a<dataRoda2.size();a++)
       {
          System.out.println("Nomor Plat : " + dataRoda2.get(a).getPlatNomor());
          System.out.println("Merk       : " + dataRoda2.get(a).getMerk());
          System.out.println("Warna      : " + dataRoda2.get(a).getWarna());
          System.out.println("===============");
         
       }
       
       for(int a=0;a<dataRoda4.size();a++)
       {
          System.out.println("Nomor Plat : " + dataRoda4.get(a).getPlatNomor());
          System.out.println("Merk       : " + dataRoda4.get(a).getMerk());
          System.out.println("Warna      : " + dataRoda4.get(a).getWarna());
       }
}
}