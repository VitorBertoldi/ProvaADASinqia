package ProvaADA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaSinqia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de temperaturas a serem transformadas: ");
        int qtdeTemp = sc.nextInt();

        double[] arrayTemp = new double[qtdeTemp];
        double soma = 0;
        double somaConversao = 0;



        for (int i=0; i < qtdeTemp; i++) {



            try {
                System.out.println("Escolha a unidade a ser convertida");
                System.out.println("Digite 1 para --> C");
                System.out.println("Digite 2 para --> F");
                System.out.println("Digite 3 para --> K ");

            }catch (InputMismatchException e) {
                System.out.println("Valor invalido..");
            }
                int saida = sc.nextInt();
            try {
                System.out.println("Converter a unidade para: ");
                System.out.println("Digite 1 para --> C");
                System.out.println("Digite 2 para --> F");
                System.out.println("Digite 3 para --> K ");

            }catch (InputMismatchException e) {
                System.out.println("Valor invalido..");
            }
                int chegada = sc.nextInt();


            System.out.println("Digite a temperatura: ");
            double temp = sc.nextDouble();

            arrayTemp[i] = temp;
            soma += arrayTemp[i];




            if (saida == 1 && chegada == 2) {
                System.out.printf("\nA temperatura passada foi: %f Celsius", temp);
                System.out.println("\nA unidade escolhida foi Fahrenheit");
                System.out.printf("A temperatura resultante foi: %f Fahrenheit \n", convCF(temp));
                somaConversao += convCF(temp);
            } else if (saida == 1 && chegada == 3) {
                System.out.printf("\nA temperatura passada foi: %f Celsius", temp);
                System.out.println("\nA unidade escolhida foi Kelvin");
                System.out.printf("A temperatura resultante foi: %f Kelvin\n", convCK(temp));
                somaConversao += convCK(temp);
            } else if (saida == 2 && chegada == 1) {
                System.out.printf("\nA temperatura passada foi %f Fahrenheit ", temp);
                System.out.println("\nA unidade escolhida foi: Celsius ");
                System.out.printf("A temperatura resultante foi %f Celsius\n", convFC(temp));
                somaConversao += convFC(temp);
            } else if (saida == 2 && chegada == 3) {
                System.out.printf("\nA temperatura passada foi %f Fahrenheit", temp);
                System.out.println("\nA unidade escolhida foi Kelvin");
                System.out.printf("A temperatura resultante foi %f Kelvin\n", convFK(temp));
                somaConversao += convFK(temp);
            } else if (saida == 3 && chegada == 1) {
                System.out.printf("\nA temperatura passada foi %f Kelvin ", temp);
                System.out.println("\nA unidade escolhida foi Celsius");
                System.out.printf("A temperatura resultante foi %f Celsius\n", convKC(temp));
                somaConversao += convKC(temp);
            } else if (saida == 3 && chegada == 2) {
                System.out.printf("\nA temperatura passada foi %f Kelvin" + temp);
                System.out.println("\nA unidade escolhida foi Fahrenheit ");
                System.out.printf("A temperatura resultante foi %f Fahrenheit\n", convKF(temp));
                somaConversao += convKF(temp);
            }



        }
        System.out.println("O valor medio das temperaturas é: " + (soma / qtdeTemp));
        System.out.println("O valor medio das temperaturas convertidas é: " + (somaConversao / qtdeTemp));



    }

    public static double convCK(double temp) {
        return temp + 273.15;
    }
    public static double convCF(double temp) {
        return temp * 1.8 + 32;

    }
    public static double convFC(double temp) {
        return (temp - 32) * 5/9;

    }
    public static double convFK(double temp) {
        return  (temp - 32) * 5/9 + 273.15;

    }
    public static double convKC(double temp) {
        return temp - 273.15;

    }
    public static double convKF(double temp) {
        return  (temp - 273.15) * 9/5 + 32;

    }



}
