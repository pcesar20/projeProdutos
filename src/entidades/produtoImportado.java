package entidades;

public class produtoImportado extends produto{
    private Double precoImportacao;

    public produtoImportado() {
    }

    public produtoImportado(String nome, Double preco, Double precoImportacao) {
        super(nome, preco);
        this.precoImportacao = precoImportacao;
    }

    public Double getPrecoImportacao() {
        return precoImportacao;
    }

    public void setPrecoImportacao(Double precoImportacao) {
        this.precoImportacao = precoImportacao;
    }
    
    @Override
    public String etiquetaDePreco(){
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (preco importação: $ "
                + String.format("%.2f", precoImportacao)
                + ")";
    }   
    
    public Double precoTotal(){
        return getPreco() + precoImportacao;
    }
    
    
}
