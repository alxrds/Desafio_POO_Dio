import dev.alexandre.dio.dominio.Aluno;
import dev.alexandre.dio.dominio.Bootcamp;
import dev.alexandre.dio.dominio.Curso;
import dev.alexandre.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso java = new Curso();
        java.setTitulo("Aprendendo Java 11");
        java.setDescricao("Descrição de  Aprendendo Java");
        java.setCargaHoraria(40);

        Curso php = new Curso();
        php.setTitulo("Aprendendo PHP 8");
        php.setDescricao("Descrição de  Aprendendo PHP");
        php.setCargaHoraria(40);

        Curso javaScript = new Curso();
        javaScript.setTitulo("Aprendendo JavaScript 6");
        javaScript.setDescricao("Descrição de Aprendendo JavaScript");
        javaScript.setCargaHoraria(40);

        Mentoria mentorBackend = new Mentoria();
        mentorBackend.setTitulo("Mentor especialista em backend");
        mentorBackend.setDescricao("Descrição detalhada da mentoria");
        mentorBackend.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Programador Backend");
        bootcamp.setDescricao("Descrição Bootcamp Programador Backend");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(php);
        bootcamp.getConteudos().add(javaScript);
        bootcamp.getConteudos().add(mentorBackend);

        Aluno aluno01 = new Aluno();
        aluno01.setNome("Alexandre Rodrigues");
        aluno01.insreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+aluno01.getConteudoInscritos());
        aluno01.progredir();
        System.out.println("Conteúdos Inscritos "+aluno01.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos "+aluno01.getConteudosConcluidos());
        System.out.println("XP " + aluno01.calcularTotalXp());

    }
}