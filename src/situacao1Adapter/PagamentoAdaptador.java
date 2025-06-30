package situacao1Adapter;

public class PagamentoAdaptador {

    PagamentoAtual efetuarPagamento = new PagamentoAtual();

    public void pagar(Double pagamento) {
        efetuarPagamento.pagarAtual(pagamento);
    }

}
