package exemplocomposite;

import java.util.ArrayList;

public class Pasta implements Documento {

    private String nome;
    private ArrayList<Documento> documentos;

    public Pasta(String nome) {
        this.nome = nome;
        this.documentos = new ArrayList<>();
    }

    public void adicionar(Documento documento){
        documentos.add(documento);
    }

    @Override
    public void abrir() {
        System.out.println("Pasta: " + this.nome);
        for(Documento documento : documentos){
            documento.abrir();
        }
    }
}
