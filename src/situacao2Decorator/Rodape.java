package situacao2Decorator;

public class Rodape implements Relatorio{

    Relatorio relatorio;

    public Rodape(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String imprimir() {
        return this.relatorio.imprimir() + " com Rodapé";
    }
}
