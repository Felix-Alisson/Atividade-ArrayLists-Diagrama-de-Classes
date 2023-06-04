import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Double> notas;

    public Aluno(String nome, String cpf, String email, Curso curso, ArrayList<Double> notas) {
        super(nome, cpf, email);
        this.curso = curso;
        this.notas = notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println("- " + nota);
        }
    }
}
