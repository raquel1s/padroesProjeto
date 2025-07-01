package situacao2Decorator;

public class Main {

    public static void main(String[] args) {

//        Situação 2: Customização de relatórios (Decorator)
//        Usuários do sistema podem escolher gerar relatórios com ou sem cabeçalho, rodapé ou
//        assinatura. Como permitir essa flexibilidade sem criar várias classes diferentes para
//        cada combinação?
//        Eu usei o padrão Decorator pra ir adicionando partes no relatório (como cabeçalho, rodapé
//        e assinatura) sem precisar criar uma classe pra cada combinação. Assim fica flexível e
//        fácil de montar o relatório do jeito que quiser.

        Relatorio relatorio = new RelatorioSimples();

        relatorio = new Cabecalho(relatorio);
        relatorio = new Assinatura(relatorio);
        relatorio = new Rodape(relatorio);

        System.out.println(relatorio.imprimir());
    }

}
