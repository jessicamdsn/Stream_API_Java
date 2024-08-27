package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {

        //Desafio 8 - Somar os dígitos de todos os números da lista:
        //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .flatMapToInt(num -> num.toString().chars()) // Converte cada número para String e depois para stream de caracteres
                .map(Character::getNumericValue) // Converte cada caractere para seu valor numérico
                .sum(); // Soma todos os valores

        System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos);
    }
}
