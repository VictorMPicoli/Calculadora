import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        try (Scanner meuScanner = new Scanner(System.in)) {

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Selecione uma operação:" + "\n" + "\n" + "1 - Adição" + "\n" + "\n" + "2 - Subtração"
                    + "\n" + "\n" + "3 - Multiplicação" + "\n" + "\n" + "4 - Divisão" + "\n" + "\n"
                    + "5 - Tabuada Completa" + "\n" + "\n" + "Digite o número correspondente desejado:"); // Exibe texto
                                                                                                          // para

            int menu = meuScanner.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            boolean operacaoCorreta = true;

            do {

                operacaoCorreta = true;

                switch (menu) {

                    case 1:

                        System.out.println("Você selecionou: Adição" + "\n" + "\n" + "Primeiro Número:"); // Pede
                                                                                                          // primeiro
                                                                                                          // input

                        Double numero1 = meuScanner.nextDouble(); // Define variável numero1 do tipo Double, e aplica o
                                                                  // scanner
                                                                  // na proxima linha de código
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Você selecionou: Adição" + "\n" + "\n" + "Segundo Número:"); // Pede segundo
                                                                                                         // input
                        Double numero2 = meuScanner.nextDouble();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Sua soma é: " + (numero1 + numero2));
                        break;

                    case 2:

                        System.out.println("Você selecionou: Subtração" + "\n" + "\n" + "Primeiro Número:"); // Pede
                                                                                                             // primeiro
                                                                                                             // input
                        Double numero3 = meuScanner.nextDouble(); // Define variável numero1 do tipo Double, e
                                                                  // aplica o
                                                                  // scanner
                                                                  // na proxima linha de código
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Você selecionou: Subtração" + "\n" + "\n" + "Segundo Número:"); // Pede
                                                                                                            // segundo
                                                                                                            // input

                        Double numero4 = meuScanner.nextDouble();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Sua subtração é: " + (numero3 - numero4));
                        break;

                    case 3:

                        System.out.println("Você selecionou: Multiplicação" + "\n" + "\n" + "Primeiro Número:"); // Pede
                                                                                                                 // primeiro
                                                                                                                 // input

                        Double numero5 = meuScanner.nextDouble(); // Define variável numero1 do tipo double, e
                                                                  // aplica o
                                                                  // scanner
                                                                  // na proxima linha de código
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Você selecionou: Multiplicação" + "\n" + "\n" + "Segundo Número:"); // Pede
                                                                                                                // segundo
                                                                                                                // input

                        Double numero6 = meuScanner.nextDouble();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Sua multiplicação é: " + (numero5 * numero6));
                        break;

                    case 4:
                        System.out.println("Você selecionou: Divisão" + "\n" + "\n" + "Primeiro Número:"); // Pede
                                                                                                           // primeiro
                                                                                                           // input
                        Double numero7 = meuScanner.nextDouble(); // Define variável numero1 do tipo Double, e
                                                                  // aplica o
                                                                  // scanner
                                                                  // na proxima linha de código
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Você selecionou: Divisão" + "\n" + "\n" + "Segundo Número:"); // Pede
                                                                                                          // segundo
                                                                                                          // input
                        Double numero8 = meuScanner.nextDouble();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Sua divisão é: " + (numero7 / numero8));
                        break;
                    case 5:
                        System.out.println("Insira o número à ser tabulado:"); // Pede primeiro input
                        int numero = meuScanner.nextInt(); // Define variável numero1 do tipo double, e aplica o
                                                           // scanner na
                                                           // proxima linha de código
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        for (int i = 0; i <= 10; i++) {
                            System.out.println((numero) + " X " + (i) + " = " + (numero * i));
                        }
                        break;

                    default:
                        System.out.println("VALOR INVÁLIDO" + "\n" + "\n" + "Por favor, insira um valor válido:" + "\n"
                                + "\n" + "1 - Adição" + "\n" + "\n" + "2 - Subtração"
                                + "\n" + "\n" + "3 - Multiplicação" + "\n" + "\n" + "4 - Divisão" + "\n" + "\n"
                                + "5 - Tabuada Completa" + "\n" + "\n" + "Digite o número correspondente desejado:");
                        operacaoCorreta = false;
                        menu = meuScanner.nextInt();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                }
            } while (!operacaoCorreta);

        }

    }

}
