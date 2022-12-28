import dev.alexandre.dio.dominio.Curso;
import dev.alexandre.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso java = new Curso();
        Curso php = new Curso();
        Curso javaScript = new Curso();

        Mentoria mentorJava = new Mentoria();
        Mentoria mentorPHP = new Mentoria();
        Mentoria mentorJavaScript = new Mentoria();

        System.out.println(java);
        System.out.println(php);
        System.out.println(javaScript);

        System.out.println(mentorJava);
        System.out.println(mentorJavaScript);
        System.out.println(mentorPHP);

    }
}