public class Main {
    public static void main(String[] args) {
        Cliente felippe = new Cliente();
        felippe.setNome("Felippe");

        Conta cc = new ContaCorrente(felippe);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(felippe);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
