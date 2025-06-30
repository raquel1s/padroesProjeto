package situacao1Adapter;

public class PagamentoAntigo implements PagamentoInterfaceAntiga{

    @Override
    public void pagarAntigo(Double pagamento) {
        System.out.println("Pagamento Efetuado: " + pagamento);
    }

}
