public class Quadrilatero {
    //Assinatura = Nome + Parâmetros
    public static void area(double lado) { // Sobrecarga: Pq se mantem o nome do método, mas muda a lista de parâmetros.
//O nome do método é sempre o mesmo, porém em todos os casos os parâmetros são diferentes.
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) { //Sobrecarga: Pq se mantem o nome do método, mas muda a lista de parâmetros.
// O nome do método é sempre o mesmo, porém em todos os casos os parâmetros são diferentes.
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) { //Sobrecarga: Pq se mantem o nome do método, mas muda a lista de parâmetros.
// O nome do método é sempre o mesmo, porém em todos os casos os parâmetros são diferentes.
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) { //Sobrecarga: Pq se mantem o nome do método, mas muda a lista de parâmetros.
//O nome do método é sempre o mesmo, porém em todos os casos os parâmetros são diferentes.
        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}


public class Main {

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);
        //Classe.nome(parâmetro) - Isso para chamar a classe ou melhor passar uma mensagem.

    }
}