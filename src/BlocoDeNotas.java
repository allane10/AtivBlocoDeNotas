import java.util.ArrayList;

public class BlocoDeNotas {
    private  ArrayList<Anotacao> anotacoes;

    public BlocoDeNotas(){
        this.anotacoes = new ArrayList<>();
    }


    public Anotacao addAnotacao(int id,String texto){
        Anotacao novaAnotacao = new Anotacao(id, texto);
        anotacoes.add(novaAnotacao);
        return  novaAnotacao;
    }

    public void editarAnotacao(int id, String texto){
        //percorrendo as anotações
        for(Anotacao a : anotacoes){
            if (a.getId() == id){
                a.setTexto(texto);
            }
        }
    }

    public String buscarTexto(String texto){
        for(Anotacao a : anotacoes){
            if (a.getTexto() == texto){
                return a.toString();
            }
        }
        return null;
    }
    public void deletarAnotacao(int id){
        for(Anotacao a : anotacoes){
            if (a.getId() == id){
                a.deleta();
            }
        }
    }

    public String listaAnotacoes(){
        String todasAnotacoes = "";
        //percorre o array anotacoes e procura a anotacao "a" do tipo Anotacao
        for (Anotacao a : anotacoes){
            todasAnotacoes += a.toString() + "\n";
        }
        return todasAnotacoes;
    }
}
