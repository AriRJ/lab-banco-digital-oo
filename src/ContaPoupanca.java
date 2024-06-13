
public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO_ANUAL = 0.05;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        double rendimento = saldo * RENDIMENTO_ANUAL;
        saldo += rendimento;
        historicoTransacoes.add(new Transacao("Rendimento Anual", rendimento));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        super.imprimirHistoricoTransacoes();
    }
}
