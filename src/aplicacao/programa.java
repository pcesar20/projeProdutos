package aplicacao;

import entidades.produto;
import entidades.produtoImportado;
import entidades.produtoUsado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<produto> lista = new ArrayList<>();
        
        System.out.println("Entre com o número de produtos que serão cadastrados: ");
        int n = sc.nextInt();
        
        for (int i=1; i <= n; i++){
            System.out.println("Produto #" + i);
            System.out.print("Comum, importado ou usado (c/i/u)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço:");
            double preco = sc.nextDouble();
            
            if(tipo == 'c'){
                lista.add(new produto(nome, preco));
            }
            else if (tipo == 'i'){
                System.out.print("Insira taxa de importação: ");
                double precoImport = sc.nextDouble();
                lista.add(new produtoImportado(nome, preco, precoImport));
            } else{
                System.out.print("insira a data de fabricacao: ");
                Date data = sdf.parse(sc.next());
                lista.add(new produtoUsado(nome, preco, data));
            }
        }
        
        System.out.println("");
        System.out.println("Precos etiquetas");
        lista.forEach((prod) -> {
            System.out.println(prod.etiquetaDePreco());
        });
        
        sc.close();
        
    }
}
