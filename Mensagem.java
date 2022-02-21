import java.util.Scanner;
public class Mensagem
{   
    
     public static void main(String[] args) 
    {
        int idade = 23;
        char sangue ='O';
        double media = 7.55;

        System.out.println("Fatec Pompeia");
        System.out.println("Lucas tem "+idade +" anos e sangue -"+sangue);
        
        System.out.printf("A media de notas = %.2f\n",media);

        int num;
        System.out.println("Digite sua idade:");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();


    }

}
