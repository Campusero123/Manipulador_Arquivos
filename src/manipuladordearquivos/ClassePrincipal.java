/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manipuladordearquivos;
import java.io.IOException;
import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) throws IOException {
       String path = "C:\\Users\\augusto\\Desktop\\Covers\\new  1.txt";
       int numero;
       Scanner leitor = new Scanner(System.in);
		//ManipuladorArquivos.escritor(path);
       System.out.println("********MENU********");
       System.out.println("1: Gravar arquivo");
       System.out.println("2: Excluir arquivo");
       System.out.println("3: Listar arquivos do diretório unificado");
       System.out.println("");
       System.out.println("Digite a opção desejada!");
       
       numero = leitor.nextInt();
       switch(numero)
               {
           case 1:
               GravarArquivo.main(args);
               break;
       }
                  
                  
                  ManipuladorArquivos.leitor(path);
                  
    }
    
}



