package application;

import model.entities.Pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        //Predicate
        System.out.println("====PREDICATE====");
        Predicate<Pessoa> maiorDeIdade = p -> p.getAge() > 18;
        Pessoa p = new Pessoa("Eric", 15);
        System.out.println(maiorDeIdade.test(p));
        /*Filtros
        ✔ Validações
        ✔ Regras de negócio simples
        ✔ Streams e coleções
        ✔ Programação funcional (lambdas)*/

        //Consumer
        System.out.println("====CONSUMER====");
        List<String> nomes = Arrays.asList("Eric", "Juan", "Maria");
        nomes.forEach(System.out::println);
        /*Quando usar Consumer?

        ✔ Exibir dados
        ✔ Alterar objetos
        ✔ Executar ações
        ✔ forEach em listas e streams */

        //Function
        System.out.println("====FUNCTION====");
        List<Integer> tamanhos = nomes.stream().map(s -> s.length()).toList();

        System.out.println(tamanhos);
        /*Quando usar Function?

        ✔ Transformar dados
        ✔ map() em Streams
        ✔ Conversões
        ✔ Regras de transformação
        ✔ Programação funcional*/

    }
}
