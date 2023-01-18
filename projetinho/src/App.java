import java.util.Scanner;

/*Crie um projeto em Java AdivinhaNumero
- Gere um número aleatório de 0 até 100
- Solicite um número de entrada pelo usuário
"Digite um número no intervalo de 0 a 100"
- Se o número de entrada for menor do que 0 ou maior do que 100 o programa deve imprimir
"Valor de entrada fora do intervalo"
- Se o número de entrada for menor do que o número aleatório o programa deve imprimir
"O número de entrada é menor do que o número secreto"
- Se o número de entrada for maior do que o número aleatório o programa deve imprimir
"O número de entrada é maior do que o número secreto"
- Se o número de entrada for igual ao número aleatório o programa deve imprimir
"Parabéns você acertou o número secreto. Você acertou após X tentativas"
Armazene a quantidade de tentativas utilizadas antes de acertar o número secreto.
Imprima este valor no texto após acertar o valor secreto.*/

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double numeroAleatorio = Math.random() *100;
        int numeroSorteado = (int)numeroAleatorio;
        int tentativas = 0;
        int numeroEntrada = 0;
         int opcao=0;

        
    
        while (numeroAleatorio != numeroEntrada) {
            System.out.println("Digite um número de 0 a 100 ");
            numeroEntrada=entrada.nextInt();

            if (numeroEntrada < 0  || numeroEntrada > 100 ) {
                System.out.println("Valor de entrada fora do intervalo");
                tentativas++;
            } else if (numeroEntrada < numeroSorteado) {
                System.out.println("O número de entrada é menor que o número seceto ");
                tentativas++;
            }
            else if (numeroEntrada > numeroSorteado) {
                System.out.println("o número de entrada é maior que o número secreto ");
                tentativas++;    
            }
            System.out.println("Tentativas " +tentativas);
            if (numeroEntrada == numeroSorteado) {
                System.out.println("Parabéns você acertou o número secreto. Você acertou após" + tentativas + "tentativas");       
                break;

                    
            }
                
        }

    }        
                        
        
            

        

      
    
}
