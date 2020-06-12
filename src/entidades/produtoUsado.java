package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends produto{
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Date dataFabricacao;

    public produtoUsado() {
        super();
    }

    public produtoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public String etiquetaDePreco(){
        	return getNome()
				+ " (used) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data fabricacao: "
				+ sdf.format(dataFabricacao)
				+ ")";
    }
    
    
}
