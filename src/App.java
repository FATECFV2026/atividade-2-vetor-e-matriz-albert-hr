

import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO: Implementar menu interativo com as seguintes opcoes:
        // 1. Exercicio 01: Progressao Geometrica
        // 2. Exercicio 02: Sequencia Decrescente
        // 3. Exercicio 03: Vetor Dinamico
        // 4. Exercicio 04: Sequencia Crescente com Soma
        // 5. Exercicio 05: Matriz com Valores Incrementais
        // 6. Exercicio 06: Operacao entre Matrizes
        // 0. Sair
        
        // Utilize o método lerValor para validação de entrada
        // Exiba os resultados utilizando Arrays.toString() para vetores
        // Para matrizes, utilize o método exibirMatriz()
        int opcao;
        
        do {
            System.out.println("\n===== MENU INTERATIVO =====");
            System.out.println("1. Exercicio 01: Progressao Geometrica");
            System.out.println("2. Exercicio 02: Sequencia Decrescente");
            System.out.println("3. Exercicio 03: Vetor Dinamico");
            System.out.println("4. Exercicio 04: Sequencia Crescente com Soma");
            System.out.println("5. Exercicio 05: Matriz com Valores Incrementais");
            System.out.println("6. Exercicio 06: Operacao entre Matrizes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scanner.nextInt();
            System.out.println();
            
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + Arrays.toString(ex01()));
                    break;
                case 2:
                    System.out.println("Resultado: " + Arrays.toString(ex02()));
                    break;
                case 3:
                    System.out.println("Resultado: " + Arrays.toString(ex03()));
                    break;
                case 4:
                    int[] vetorEx4 = ex04();
                    System.out.println("Resultado: " + Arrays.toString(vetorEx4));
                    if (vetorEx4 != null) {
                        System.out.println("Soma total: " + calcularSoma(vetorEx4));
                    }
                    break;
                case 5:
                    System.out.println("Matriz Resultante:");
                    exibirMatriz(ex05());
                    break;
                case 6:
                    int[][][] matrizesEx6 = ex06();
                    if (matrizesEx6 != null) {
                        System.out.println("Matriz N:");
                        exibirMatriz(matrizesEx6[0]);
                        System.out.println("Matriz Z:");
                        exibirMatriz(matrizesEx6[1]);
                        System.out.println("Matriz Soma (N + Z):");
                        exibirMatriz(matrizesEx6[2]);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    
    /**
     * Metodo auxiliar para ler e validar entrada do usuario
     * @param scanner Scanner para leitura
     * @param mensagem Mensagem a ser exibida
     * @param min Valor minimo (exclusivo)
     * @param max Valor maximo (inclusivo)
     * @return Valor valido lido
     */
    private static int lerValor(Scanner scanner, String mensagem, int min, int max) {
        int valor;
        do {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            if (valor <= min || valor > max) {
                System.out.println("Entrada invalida! O valor deve ser maior que " + min + " e menor ou igual a " + max + ".");
            }
        } while (valor <= min || valor > max);
        return valor;
    }
    
    /**
     * Metodo auxiliar para exibir matriz formatada
     * @param matriz Matriz a ser exibida
     */
    private static void exibirMatriz(int[][] matriz) {
        if (matriz == null) return;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
     * Exercicio 01: Progressao Geometrica
     * @param valorInicial Valor inicial (deve ser <= 20)
     * @return Vetor de 10 elementos com progressao geometrica (dobro) ou null se invalido
     */
    public static int[] progressaoGeometrica(int valorInicial) {
        // TODO: Implementar progressao geometrica
        // Validar se valorInicial <= 20 (retornar null se invalido)
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] * 2

        if (valorInicial > 20) {
            return null;
        }

        int[] vetor = new int[10];
        vetor[0] = valorInicial;
        for (int i=1;i<10;i++) {
            vetor[i] = vetor[i-1]*2;
        }

        return vetor;
    }
    
    /**
     * Exercicio 02: Sequencia Decrescente
     * @param valorInicial Valor inicial (deve ser > 1)
     * @return Vetor de 10 elementos com sequencia decrescente ou null se invalido
     */
    public static int[] sequenciaDecrescente(int valorInicial) {
        // TODO: Implementar sequencia decrescente
        // Validar se valorInicial > 1 (retornar null se invalido)
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] - 1

        if (valorInicial <= 1) {
            return null;
        }
        int[] vetor = new int[10];
        vetor[0] = valorInicial;
        for (int i=1;i<10;i++) {
            vetor[i] = vetor[i-1]-1;
        }
        return vetor;
    }
    
    /**
     * Exercicio 03: Vetor Dinamico
     * @param tamanho Tamanho do vetor (deve ser <= 1000)
     * @return Vetor com sequencia de 1 ate tamanho ou null se invalido
     */
    public static int[] vetorDinamico(int tamanho) {
        // TODO: Implementar vetor dinamico
        // Validar se tamanho <= 1000 (retornar null se invalido)
        // Criar vetor com tamanho especifico
        // Para i=0 ate tamanho-1: vetor[i] = i + 1

        if (tamanho >= 1000) {
            return null;
        }
        int[] vetor = new int[tamanho];
        for (int i=0;i<tamanho;i++) {
            vetor[i] = i+1;
        }

        return vetor;
    }
    
    /**
     * Exercicio 04: Sequencia Crescente com Soma
     * @param valorInicial Valor inicial
     * @return Vetor de 10 elementos com sequencia crescente
     */
    public static int[] sequenciaCresenteComSoma(int valorInicial) {
        // TODO: Implementar sequencia crescente
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] + 1

        int[] vetor = new int[10];
        vetor[0] = valorInicial;
        for(int i=1;i<10;i++) {
            vetor[i] = vetor[i-1]+1;
        }

        return vetor;
    }
    
    /**
     * Calcula a soma de todos os elementos do vetor
     * @param vetor Vetor para calcular a soma
     * @return Soma de todos os elementos
     */
    public static int calcularSoma(int[] vetor) {
        // TODO: Implementar calculo da soma
        // Percorrer o vetor e somar todos os elementos
        if (vetor == null) {
            return 0;
        }
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }

        return soma;
    }
    
    /**
     * Exercicio 05: Matriz com Valores Incrementais
     * @param tamanho Tamanho da matriz quadrada
     * @return Matriz NxN com valores incrementais iniciando em tamanho+1
     */
    public static int[][] matrizIncrementais(int tamanho) {
        // TODO: Implementar matriz com valores incrementais
        // Criar matriz quadrada NxN
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]: matriz[i][j] = contador++

        int[][] matriz = new int[4][4];
        int contador = tamanho + 1;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = contador++;
            }
        }

        return matriz;
    }
    
    /**
     * Exercicio 06: Operacao entre Matrizes
     * @param tamanho Tamanho das matrizes quadradas
     * @return Array com 3 matrizes: [0]=N, [1]=Z, [2]=Soma
     */
    public static int[][][] operacaoEntreMatrizes(int tamanho) {
        // TODO: Implementar operacao entre matrizes
        // Criar 3 matrizes NxN: matrizN, matrizZ, matrizSoma
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]:
        //   matrizN[i][j] = contador
        //   matrizZ[i][j] = contador (valores iguais)
        //   matrizSoma[i][j] = matrizN[i][j] + matrizZ[i][j]
        //   contador++
        // Retornar array com as 3 matrizes
        if (tamanho <= 0) {
            return null;
        }

        int[][][] resultado = new int[3][tamanho][tamanho];
        int contador = tamanho + 1;
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultado[0][i][j] = contador;
                resultado[1][i][j] = contador;
                resultado[2][i][j] = resultado[0][i][j] + resultado[1][i][j];
                contador++;
            }
        }

        return resultado;
    }
    
    // ========================================
    // METODOS REQUERIDOS PELO AUTOGRADER
    // NAO REMOVER - Necessarios para avaliacao automatica
    // ========================================
    
    /**
     * Metodo ex01 para compatibilidade com autograder
     * @return resultado do exercicio 01
     */
    public static int[] ex01() {
        // TODO: Implementar leitura de entrada e chamar progressaoGeometrica()

        int valorInicial = lerValor(scanner, "Digite o valor inicial (<= 20): ", -999999, 20);
        return progressaoGeometrica(valorInicial);
    }
    
    /**
     * Metodo ex02 para compatibilidade com autograder
     * @return resultado do exercicio 02
     */
    public static int[] ex02() {
        // TODO: Implementar leitura de entrada e chamar sequenciaDecrescente()
        int valorInicial = lerValor(scanner, "Digite o valor inicial (> 1): ", 1, 999999);
        return sequenciaDecrescente(valorInicial);
    }
    
    /**
     * Metodo ex03 para compatibilidade com autograder
     * @return resultado do exercicio 03
     */
    public static int[] ex03() {
        // TODO: Implementar leitura de entrada e chamar vetorDinamico()
        int tamanho = lerValor(scanner, "Digite o tamanho do vetor (1 a 1000): ", 0, 1000);
        return vetorDinamico(tamanho);
    }
    
    /**
     * Metodo ex04 para compatibilidade com autograder
     * @return resultado do exercicio 04
     */
    public static int[] ex04() {
        // TODO: Implementar leitura de entrada e chamar sequenciaCresenteComSoma()
        System.out.print("Digite o valor inicial para a sequencia: ");
        int valorInicial = scanner.nextInt();
        return sequenciaCresenteComSoma(valorInicial);
    }
    
    /**
     * Metodo ex05 para compatibilidade com autograder
     * @return resultado do exercicio 05
     */
    public static int[][] ex05() {
        // TODO: Implementar leitura de entrada e chamar matrizIncrementais()
        int tamanho = lerValor(scanner, "Digite o tamanho da matriz quadrada: ", 0, 1000);
        return matrizIncrementais(tamanho);
    }
    
    /**
     * Metodo ex06 para compatibilidade com autograder
     * @return resultado do exercicio 06
     */
    public static int[][][] ex06() {
        // TODO: Implementar leitura de entrada e chamar operacaoEntreMatrizes()
        int tamanho = lerValor(scanner, "Digite o tamanho das matrizes quadradas: ", 0, 1000);
        return operacaoEntreMatrizes(tamanho);
    }
}
