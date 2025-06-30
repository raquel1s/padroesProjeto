package situacao1Adapter;

public class PagamentoAtual implements PagamentoInterfaceAtual{

    @Override
    public void pagarAtual(Double pagamento) {
        System.out.println("Pagamento atual realizado: " + pagamento);
    }
}
