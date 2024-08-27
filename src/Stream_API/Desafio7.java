package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        //Desafio 7 - Encontrar o segundo número maior da lista:
        //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaiorNumero = numeros.stream()
                .distinct() // Remove duplicatas
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .skip(1) // Pula o maior número
                .findFirst(); // Pega o próximo número (segundo maior)

        System.out.println("O segundo maior número é: " + segundoMaiorNumero);
    }
}
