
package morse;

import java.util.Scanner;


public class Morse {
    
    public static void main(String[] args) 
    {
 
 
    String seleccion;
    
    Scanner selec = new Scanner (System.in); //Ingreso de info con Scanner
    System.out.print("Escriba que desea traducir frase/morse: ");
    seleccion=selec.nextLine();
    
    if (seleccion.equals("frase"))
    {    
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // a-i
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", // j-q
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".......", // r-" "
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", // A-G
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // H-P
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-y
            "-.--", "--.."}; // X-Z 
        
        String informacion;
        Scanner leer = new Scanner (System.in); //Ingreso de info con Scanner
        System.out.print("Ingresar texto (En Mayúscula): ");
        informacion=leer.nextLine(); //Ánalisis de la información que ingreso
        String[] vec = informacion.split("");
        
        for (int i=0;i<=informacion.length()-1;i++)
        {
            if (vec[i].equals("A"))
            {
                System.out.printf("%s ",morse[0]);
            }
            else if (vec[i].equals("B"))
            {
                System.out.printf("%s ",morse[1]);
            }
            else if (vec[i].equals("C"))
            {
                System.out.printf("%s ",morse[2]);
            }
            else if (vec[i].equals("D"))
            {
                System.out.printf("%s ",morse[3]);
            }
            else if (vec[i].equals("E"))
            {
                System.out.printf("%s ",morse[4]);
            }
            else if (vec[i].equals("F"))
            {
                System.out.printf("%s ",morse[5]);
            }
            else if (vec[i].equals("G"))
            {
                System.out.printf("%s ",morse[6]);
            }
            else if (vec[i].equals("H"))
            {
                System.out.printf("%s ",morse[7]);
            }
            else if (vec[i].equals("I"))
            {
                System.out.printf("%s ",morse[8]);
            }
            else if (vec[i].equals("J"))
            {
                System.out.printf("%s ",morse[9]);
            }
            else if (vec[i].equals("K"))
            {
                System.out.printf("%s ",morse[10]);
            }
            else if (vec[i].equals("L"))
            {
                System.out.printf("%s ",morse[11]);
            }
            else if (vec[i].equals("M"))
            {
                System.out.printf("%s ",morse[12]);
            }
            else if (vec[i].equals("N"))
            {
                System.out.printf("%s ",morse[13]);
            }
            else if (vec[i].equals("O"))
            {
                System.out.printf("%s ",morse[14]);
            }
            else if (vec[i].equals("P"))
            {
                System.out.printf("%s ",morse[15]);
            }
            else if (vec[i].equals("Q"))
            {
                System.out.printf("%s ",morse[16]);
            }
            else if (vec[i].equals("R"))
            {
                System.out.printf("%s ",morse[17]);
            }
            else if (vec[i].equals("S"))
            {
                System.out.printf("%s ",morse[18]);
            }
            else if (vec[i].equals("T"))
            {
                System.out.printf("%s ",morse[19]);
            }
            else if (vec[i].equals("U"))
            {
                System.out.printf("%s ",morse[20]);
            }
            else if (vec[i].equals("V"))
            {
                System.out.printf("%s ",morse[21]);
            }
            else if (vec[i].equals("W"))
            {
                System.out.printf("%s ",morse[22]);
            }
            else if (vec[i].equals("X"))
            {
                System.out.printf("%s ",morse[23]);
            }
            else if (vec[i].equals("Y"))
            {
                System.out.printf("%s ",morse[24]);
            }
            else if (vec[i].equals("Z"))
            {
                System.out.printf("%s ",morse[25]);
            }
            else if (vec[i].equals(" "))
            {
                System.out.printf("   ",morse[25]);
            }

           }//Final del For
           System.out.printf("\n");
    }//final pregunta Frase

    else if (seleccion.equals("morse"))
    {
        String letras[] = { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String informacion1;
        
        Scanner leer1 = new Scanner (System.in); //Ingreso de info con Scanner
        System.out.print("Ingresar código Morse: ");
        informacion1=leer1.nextLine(); //Ánalisis de la información que ingreso
        String[] vec1 = informacion1.split("\\ ");
        
        
        for (int e=0;e<=vec1.length-1;e++)
        {
            if (vec1[e].equals(".-"))
            {
                System.out.printf("%s",letras[0]);
            }
            else if(vec1[e].equals("-..."))
            {
                System.out.printf("%s",letras[1]);
            }
            else if(vec1[e].equals("-.-."))
            {
                System.out.printf("%s",letras[2]);
            }
            else if(vec1[e].equals("-.."))
            {
                System.out.printf("%s",letras[3]);
            }
            else if(vec1[e].equals("."))
            {
                System.out.printf("%s",letras[4]);
            }
            else if(vec1[e].equals("..-."))
            {
                System.out.printf("%s",letras[5]);
            }
            else if(vec1[e].equals("--."))
            {
                System.out.printf("%s",letras[6]);
            }
            else if(vec1[e].equals("...."))
            {
                System.out.printf("%s",letras[7]);
            }
            else if(vec1[e].equals(".."))
            {
                System.out.printf("%s",letras[8]);
            }
            else if(vec1[e].equals(".---"))
            {
                System.out.printf("%s",letras[9]);
            }
            else if(vec1[e].equals("-.-"))
            {
                System.out.printf("%s",letras[10]);
            }
            else if(vec1[e].equals(".-.."))
            {
                System.out.printf("%s",letras[11]);
            }
            else if(vec1[e].equals("--"))
            {
                System.out.printf("%s",letras[12]);
            }
            else if(vec1[e].equals("-."))
            {
                System.out.printf("%s",letras[13]);
            }
            else if(vec1[e].equals("---"))
            {
                System.out.printf("%s",letras[14]);
            }
            else if(vec1[e].equals(".--."))
            {
                System.out.printf("%s",letras[15]);
            }
            else if(vec1[e].equals("--.-"))
            {
                System.out.printf("%s",letras[16]);
            }
            else if(vec1[e].equals(".-."))
            {
                System.out.printf("%s",letras[17]);
            }
            else if(vec1[e].equals("..."))
            {
                System.out.printf("%s",letras[18]);
            }
            else if(vec1[e].equals("-"))
            {
                System.out.printf("%s",letras[19]);
            }
            else if(vec1[e].equals("..-"))
            {
                System.out.printf("%s",letras[20]);
            }
            else if(vec1[e].equals("...-"))
            {
                System.out.printf("%s",letras[21]);
            }
            else if(vec1[e].equals(".--"))
            {
                System.out.printf("%s",letras[22]);
            }
            else if(vec1[e].equals("-..-"))
            {
                System.out.printf("%s",letras[23]);
            }
            else if(vec1[e].equals("-.--"))
            {
                System.out.printf("%s",letras[24]);
            }
            else if(vec1[e].equals("--.."))
            {
                System.out.printf("%s",letras[25]);
            }
            else if(vec1[e].equals("   "))
            {
                System.out.printf(" ");
            }

            
        } //final bucle
        System.out.printf("\n");
  
    } //final else if seleccion
    }    
}
