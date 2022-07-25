import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcampa JaVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAngela = new Dev();
        devAngela.setNome("Angela");
        devAngela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Angela" + devAngela.getConteudosInscritos());
        devAngela.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Angela" + devAngela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Angela" + devAngela.getConteudosConcluidos());
        System.out.println("XP" + devAngela.calcularTotalXp());
        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joa" + devAngela.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joa" + devAngela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joa" + devAngela.getConteudosConcluidos());
        System.out.println("XP" + devAngela.calcularTotalXp());
}

}
