import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

class MediaValidacao { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0; 

        for (int i = 0; i < 4; i++){
            boolean validInput = false;
            while (!validInput){
                try{
                    System.out.print("Digite a nota nº " + (i + 1) + ": ");
                    notas[i] = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input invalido, por favor digite um valor válido");
                    scanner.nextLine();
                }
            }
        }

        media = Arrays.stream(notas).sum() / 4;

        if (media >= 7) {
            System.out.println("Sua média foi " + media + " aluno aprovado");
        } else if (media >=5 ) {
            System.out.println("Sua média foi " + media + " aluno de recuperação");
        } else { 
            System.out.println("Sua média foi " + media + " aluno reprovado");
        }

        scanner.close(); 
    }
    }
