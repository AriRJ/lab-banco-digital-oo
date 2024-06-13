@Override
public void transferir(double valor, IConta contaDestino) {
    super.transferir(valor, contaDestino);
    saldo -= TAXA_OPERACAO;
    historicoTransacoes.add(new Transacao("Taxa de Transferência", -TAXA_OPERACAO));
}

@Override
public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirInfosComuns();
    super.imprimirHistoricoTransacoes();
}
