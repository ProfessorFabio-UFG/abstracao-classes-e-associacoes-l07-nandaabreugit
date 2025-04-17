import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String nomeDept = sc.nextLine();
        System.out.print("Sigla do departamento: ");
        String siglaDept = sc.nextLine();
        Departamento dep = new Departamento(nomeDept, siglaDept);

        System.out.print("Nome do curso: ");
        String nomeCurso = sc.nextLine();
        System.out.print("Sigla do curso: ");
        String siglaCurso = sc.nextLine();
        Curso cur = new Curso(nomeCurso, siglaCurso, dep);

        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();
        System.out.print("Ano de ingresso: ");
        int ano = sc.nextInt();

        Aluno al = new Aluno(nomeAluno, matricula, ano, cur);
        System.out.println("\n" + al);
    }
}
