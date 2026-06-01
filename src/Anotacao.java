import java.time.LocalDate;
import java.util.Objects;


public class Anotacao {
    //criando os atributos da classe anotações, ou seja, a fôrma que ela tem
    private int id;
    private String texto;
    private LocalDate data; //não precisa ser informado pelo usuário, vai ser automático
    private boolean isAtivo; //o programa vai conseguir definir automaticamente

    //criando o construtor para inicializar/criar o objeto "anotacao"
    public Anotacao(int id, String texto) {
        this.id = id;
        this.texto = texto;
        this.data = LocalDate.now(); // aqui o programa pega a data atual automaticamente, logo não faz sentido pedir isso no construtor
        this.isAtivo = true; //toda anotação começa ativa automaticamente
    }
        // get serve para acessar
        // o ID deve ser vistos, não alterado (tem get e não set)
        // o texto pode ser só visto e pode ser alterado (tem que ter get e set)
        // a data de criação pode ser vista, não alterada (logo, só get e não set)


    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    // set serve para ALTERAR alguma coisa, no nosso caso podemos alterar texto, mas

    public void setTexto(String novoTexto){
        this.texto = novoTexto;
    }
        //void pois não retorna nada
        //public void setAtivo(boolean ativo) {
        //    this.isAtivo = ativo;


    public void deleta(){
        this.isAtivo = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
            Anotacao anotacao = (Anotacao) o;
            return id == anotacao.id && isAtivo == anotacao.isAtivo && Objects.equals(texto, anotacao.texto) && Objects.equals(data, anotacao.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, texto, data, isAtivo);
    }

    @Override
    public String toString() {
        return "Anotação {" +
                "id de localização = " + id +
                ", texto ='" + texto + '\'' +
                ", data =" + data +
                ", Ativo =" + isAtivo + '}';
    }
}


