
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();


        System.out.printf("id= ");
        int id = sc.nextInt();
        System.out.printf("texto :");
        String texto = sc.next();

        blocoDeNotas.addAnotacao(id, texto);
        blocoDeNotas.editarAnotacao(id, texto);
        blocoDeNotas.deletarAnotacao(id);
        blocoDeNotas.buscarTexto(texto);
        System.out.println(blocoDeNotas.listaAnotacoes());



    }
}
