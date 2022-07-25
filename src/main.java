import br.com.dio.desafio.curso;
import br.com.dio.desafio.mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        curso curso1 = new curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso curso2 = new curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        mentoria mentoria = new mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

}

}
