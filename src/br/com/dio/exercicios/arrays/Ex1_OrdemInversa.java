package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        //define os vetores que serão usados no código

        //System.out.println(vetor.length);
        //printa no console o que está em aspas
        System.out.print("Vetor: ");
        //define o valor de count com zero no inicio
        int count =0;
        //enquanto 'count' for menor que a quantidade de caracteres em vetor roda o código
        while(count < (vetor.length)) {
            //printa vetor e count e a soma de count++
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }
}
