package situacao2Decorator;

public class Assinatura implements Relatorio {

    Relatorio relatorio;

    public Assinatura(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String imprimir() {
        return this.relatorio.imprimir() + " com Assinatura";
    }
}
