public class Emprestimo {
    public static int getDuasParcelas() {
        //Visib/Modif/Retorno/Nome(parâmetro "no caso está sem parâmetro")
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {//Método principal
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());//Para mostrar que é possivel criar um método dentro de outro

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
            public class Main {
                // A classe Main é onde o programa vai ser executado
                public void main(String[] args) {
                    // Calculadora
                    System.out.println("Exercício calculadora");
                    Calculadora.soma(3, 6); //Para chamar o método (passar uma mensagem) a partir da classe nesse caso calculadora
                    //Classe.nome(parâmetro1, parâmetro2) - Precisamos passar esses parâmetros
                    Calculadora.subtracao(9, 1.8);
                    Calculadora.multiplicacao(7, 8);
                    Calculadora.divisao(5, 2.5);

                    // Mensagem
                    System.out.println("Exercício mensagem");
                    Mensagem.obterMensagem(9);
                    Mensagem.obterMensagem(14);
                    Mensagem.obterMensagem(1);

                    // Empréstimo
                    System.out.println("Exercício empréstimo");
                    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());// Foi criado para mostrar que é possível passar um parâmetros para outro método
                    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
                    Emprestimo.calcular(1000, 5);

                }
            }}
