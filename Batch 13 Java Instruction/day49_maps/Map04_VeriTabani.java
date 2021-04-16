package day49_maps;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Map04_VeriTabani {
    public static void main(String[] args) {
        
        String dosyaYolu= "C:\\Users\\W4nderlust17\\OneDrive\\Desktop\\veriTabani.csv";
        
        Map<String,String> veriMap = veriTabaniAl(dosyaYolu);
        System.out.println(veriMap);
        
    }
    public static Map<String, String> veriTabaniAl(String dosyaYolu)  {
        
        Map<String,String> eklenecekMap =new HashMap<>();  //sonucu dondurebilmek icin bu Map'i olusturduk.
        List<String> tempList=new ArrayList<>();
    
        
        
            try {
                BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));
                String satir=br.readLine();
                
                
                while(satir != null) {
                    
                    tempList.add(satir);
                    satir=br.readLine();
                }
                
                
                
            } catch ( IOException e) {
                
                e.printStackTrace(); // detayli hata raporu verir
            }
        
            System.out.println(tempList);
            
            
        return eklenecekMap;
    }
}

