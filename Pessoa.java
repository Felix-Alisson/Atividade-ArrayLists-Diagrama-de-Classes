import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Telefone> listaTelefones;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.listaTelefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Telefone> getListaTelefones() {
        return listaTelefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefones:");
        for (Telefone telefone : listaTelefones) {
            System.out.println("- Tipo: " + telefone.getTipo());
            System.out.println("  Número: " + telefone.getNumero());
        }
        endereco.imprimirEndereco();
    }
}
