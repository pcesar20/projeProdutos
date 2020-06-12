package entidades;


public class produto {
    public String nome;
    public Double preco;

    public produto() {
    }

    public produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public String etiquetaDePreco(){
        return nome
                + " $ "
                + String.format("%.2f", preco);
    }
}
