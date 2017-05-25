package paldal_111;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Professor extends People{
   
    int[] answer;

   public int[] store_ans(String fileName){
      answer=new int[1000];
      
      try{
      FileInputStream f=new FileInputStream(fileName);
      int i=f.read();
      
      //"1"=49
   
      int n;
      for(n=0;i!=-1;n++){
         answer[n]=i-48;
         i=f.read();      
      }
      }
      catch(FileNotFoundException er){
         System.out.println("file ERROR");
         }
      catch(IOException e){
         System.out.println("ERROR");
         }
   return answer;
      
   }
   
   @Override
   public String give(String fileName){
      String s="";
         try{
         FileInputStream f=new FileInputStream(fileName);
         int i=f.read();
         while(i!=-1){
             i=f.read();
      //   int n=Integer.parseInt(i)
            s=s+(char)i+"";
             
            }System.out.println(s);
            return s;
            
         }
         catch(FileNotFoundException er){
            System.out.println("file ERROR");return "";
            }
         catch(IOException e){
            System.out.println("ERROR");return "";
            }
         
   }
   public static void main(String[] args) {
      Professor p= new Professor();
      
      int[] a=new int[1000];
      a[0]=p.store_ans("p2.txt")[0];
      System.out.println(a[0]);
      
   }
   
}
