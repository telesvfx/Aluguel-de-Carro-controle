import java.util.Scanner;

public class ThiagoTelesSilva_AG4_DSI {
        public static void main(String[] args) {

            
            Scanner leitor = new Scanner(System.in);
            String modelo;
            double diaria1;
            int locacao;
            double kms;
            double diaria2;
            double vlkm;
            double resultadoapagar;
            double precofixo = 0.20; 
    
            
            System.out.print("escreva o modelo do carro alugado: ");
            modelo = leitor.nextLine();

            System.out.print("ecreva o valor da diária para locação: R$ ");
            diaria1 = leitor.nextDouble();
    
            System.out.print("escreva a quantidade de dias de locação: ");
            locacao = leitor.nextInt();
    
            System.out.print("escreva a quantidade de Km percorridos: ");
            kms = leitor.nextDouble();
    
    
            diaria2 = diaria1 * locacao;
            vlkm = kms * precofixo;
            resultadoapagar = diaria2 + vlkm;

            System.out.println("\nmodelo do carro alugado: " + modelo);
            System.out.printf("valor total para pagar: R$ %.2f\n", resultadoapagar);
    
          
            leitor.close();
    
            
            }    
        }
        