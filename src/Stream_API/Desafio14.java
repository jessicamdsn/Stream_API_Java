package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {


    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        //Desafio 14 - Encontre o maior número primo da lista:
        //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorPrimo = numeros.stream()
                .filter(n-> isPrime(n))  // Filtra apenas os números primos
                .max(Integer::compare)   // Encontra o maior número
                .orElse(-1);             // Retorna -1 se não houver primos na lista

        System.out.println("O maior número primo da lista é: " + maiorPrimo);



    }
}
