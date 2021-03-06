
package udemy;

public class Colaborador {
    private int id;
    private String nome; 
    private double salario;

    public Colaborador(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public double salarioPorcentagem (double porcentagem){
        salario += salario * porcentagem / 100.0;
        return porcentagem;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
    
    
}
