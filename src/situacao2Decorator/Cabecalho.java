package situacao2Decorator;

public class Cabecalho implements Relatorio{

    Relatorio relatorio;

    public Cabecalho(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String imprimir() {
        return this.relatorio.imprimir() + " com Cabecalho";
    }
}
