package exemplocomposite;

public class Arquivo implements Documento {

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.println("Arquivo: " + nome);
    }
}
