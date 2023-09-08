public class Cliente {
    String nome;
    long cpf;
    float preço_total = 0;
    

    float calculaTotalCompra(){
        return preço_total;
    }
}
