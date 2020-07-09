import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class metodos {
	
	public static String criarDiretorio() {
		
		File diretorio = new File("C:\\HOMEPATHE\\data\\in");
		File diretorio1 = new File("C:\\HOMEPATHE\\data\\out");
		diretorio.mkdirs();
		diretorio1.mkdirs();

		return "";}

 public static String leitura(String dir) throws Exception { 
			
  String linha="", nome= "", nome1="", vendas="", vendas1="", vendas2="", vendas3="", nomeVendedor="",id="",
		  vlVenda="" ,vlVenda1="", idValor="", vlVenda2="",vlTotalVenda="",vlTotalVenda1="",vlTotalVenda2="";
  
  int countVendedor = 0, countCliente = 0 , total=0, total1=0, total2=0,  aux=0;
  List <Integer> valorVendas = new ArrayList <Integer>();
  List<String> nomesVendas = new ArrayList<>();
	             
	BufferedReader br = new BufferedReader(new FileReader(new File(dir)));
	

	   while ((linha = br.readLine()) != null) {
		 String[] t = linha.split (Pattern.quote ("ç"));  
		 
		 String valida = linha.substring(0,3);		   
			if(valida.contentEquals("001")){
				countVendedor++;
			   for(String value: t) 
			     {
				   if(value.length()> 0) 
					 { 
					   nome = t[0];
				  }else 
				     { System.out.println("Linha em branco ");}}
			   
			   String vendedores = "Quantidade de Vendedores: "+ countVendedor;
			   System.out.println(vendedores);
			   
			   
	      }else if(valida.contentEquals("002")){
				  countCliente++;
				 for(String value: t)
				   {
					 if(value.length()> 0) 
					 {
					    nome = t[1];
					    
					    
						    	}
							   }
				 System.out.println("Quantidade de clientes: " + countCliente);
						      
			}else if(valida.contentEquals("003")) {
			       for(String value: t) 
			         { 
			           nome = t[2];
			           nome1 = nome.replaceAll("\\]", "").replaceAll("\\[","");
			           nomeVendedor= t[3];
			           
			           String[] p = nome1.split (Pattern.quote (","));
			           
			           for(String valor: p)
			             {
			        	   vendas  = p[0];
			        	   vendas1 = p[1];
			        	   vendas2 = p[2];
			        	   
			        	   String[] s = vendas.split (Pattern.quote ("-"));
			        	   for(String valor1: s) { 
			        		   
			        		  id= s[0];
			                  vlVenda = s[1];
			                  vlVenda1 = s[2];
			                  int numeroConvertido = Integer.parseInt(vlVenda);
			                  int numeroConvertido1 = Integer.parseInt(vlVenda1);
			                  total= (numeroConvertido * numeroConvertido1);
			                  vlTotalVenda = String.valueOf(total);
			                  //idValor = vlVenda.concat(id);
  
			             } String[] m = vendas1.split (Pattern.quote ("-"));
			        	   for(String valor1: m) { 
			        		   
				        		  id= m[0];
				                  vlVenda = m[1];
				                  vlVenda1 = m[2];
				                  int numeroConvertido = Integer.parseInt(vlVenda);
				                  int numeroConvertido1 = Integer.parseInt(vlVenda1);
				                  total1= (numeroConvertido * numeroConvertido1);
				                  vlTotalVenda1 = String.valueOf(total1);
				                  //idValor = vlVenda.concat(id);
			  
			             } String[] r = vendas2.split (Pattern.quote ("-"));
			        	   for(String valor1: r) { 
			        		   
				        		  id= r[0];
				                  vlVenda = r[1];
				                  vlVenda1 = r[2];
				                  int numeroConvertido = Integer.parseInt(vlVenda);
				                  int numeroConvertido1 = Integer.parseInt(vlVenda1);
				                  total2= (numeroConvertido * numeroConvertido1);
				                  vlTotalVenda2 = String.valueOf(total2);
				                  //idValor = vlVenda.concat(id);

			             }}
			          
			                  }
  
			                 valorVendas.add(total);
			                 valorVendas.add(total1);
			                 valorVendas.add(total2);
			                 nomesVendas.add(nome1);
			                
	}
} 

	                     for(int i=0;i < valorVendas.size();i++) {
	                    	 if(valorVendas.get(i)> aux) {
	                    		 aux=valorVendas.get(i);
	                    	 }
	                     } System.out.println("O valor da maior venda foi: " + aux);
   
return "";}		
 
 
 public static boolean gravar(String caminho, String texto){
	 
	try {
		FileWriter arquivo = new FileWriter(caminho);
		PrintWriter gravarArq = new PrintWriter(arquivo);
		gravarArq.println(texto);
		gravarArq.close();
		return true;
   }catch(IOException e) {
	  System.out.println(e.getMessage());
	  
  }
	return false;	 
 } 
}
