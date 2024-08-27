package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {

        //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
                .collect(Collectors.toSet()) // Coleta os elementos em um Set
                .size() == numeros.size(); // Compara o tamanho do Set com o tamanho da lista original

        System.out.println("Todos os números são distintos? " + todosDistintos);
    }
}
