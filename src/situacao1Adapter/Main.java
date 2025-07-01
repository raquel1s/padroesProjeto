package situacao1Adapter;

public class Main {

    public static void main(String[] args) {

//        Situação 1: Integração de sistemas legados (Adapter)
//        Você precisa integrar um sistema de pagamento antigo com uma nova API moderna.
//        As interfaces são diferentes. Como você faria para reaproveitar o código antigo
//        sem alterar sua estrutura?
//        Para reaproveitar o sistema antigo sem mudar ele, eu criei um adaptador
//        (PagamentoAdaptador) que faz a ponte entre o código novo e o antigo.
//        Assim, mesmo com interfaces diferentes, consigo usar o sistema antigo
//        integrando com o novo, sem precisar mexer na estrutura.

        PagamentoAdaptador pagamento = new PagamentoAdaptador();

        pagamento.pagar(3094.90);
    }
}
