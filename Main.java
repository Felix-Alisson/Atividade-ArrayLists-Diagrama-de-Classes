import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Telefone telefone1 = new Telefone("Casa", "123456789");
        Telefone telefone2 = new Telefone("Celular", "987654321");

        
        Endereco endereco = new Endereco("Rua A", "Cidade X", "Estado Y");

        
        Curso curso = new Curso("Ciência da Computação");

        
        Professor professor = new Professor("João", "123456789", "joao@email.com",
                "Doutorado", 5000.0);

        
        professor.getListaTelefones().add(telefone1);
        professor.getListaTelefones().add(telefone2);

        
        professor.setEndereco(endereco);

        
        System.out.println("Professor:");
        professor.imprimir();
        System.out.println();

        
        ArrayList<Double> notasAluno = new ArrayList<>();
        notasAluno.add(8.5);
        notasAluno.add(7.8);
        notasAluno.add(9.0);
        Aluno aluno = new Aluno("Maria", "987654321", "maria@email.com",
                curso, notasAluno);

        
        aluno.getListaTelefones().add(telefone1);

        
        aluno.setEndereco(endereco);

        
        System.out.println("Aluno:");
        aluno.imprimir();
    }
}