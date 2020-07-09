import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class main {
	
static String dir = "C:/HOMEPATH/data/in";
static String dire = "C:/HOMEPATH/data/out";
static File file = new File(dir);
	
 public static void main (String[] args) throws Exception {
	
	    metodos.criarDiretorio();
	   for(String arq : file.list()){      
	        if(arq.endsWith(".txt")){
	           System.out.println("------>" + arq + "<------"); 
	             try{
	                  System.out.println(metodos.leitura(dir + "\\" +arq));
	                 
	            }catch(Exception ex){} }}}
 
      

}
