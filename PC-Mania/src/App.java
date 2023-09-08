import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Computador promocao_computador1 = new Computador();
        Computador promocao_computador2 = new Computador();
        Computador promocao_computador3 = new Computador();
        Cliente cliente = new Cliente();
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();
        int escolha;
        float pagamento;

        //MemoriasUSB
        memoriaUSB1.nome = "Pen-drive";
        memoriaUSB1.capacidade = 16; //gigas
        memoriaUSB2.nome = "Pen-drive";
        memoriaUSB2.capacidade = 32; //gigas
        memoriaUSB3.nome = "HD Externo";
        memoriaUSB3.capacidade = 1000; //gigas

        //Promoção 1
        promocao_computador1.marca = "Positivo";
        promocao_computador1.preco = 2300;
        promocao_computador1.hardware_basico[0].nome = "Pentium Core i3";
        promocao_computador1.hardware_basico[0].capacidade = 2000; //Mhz
        promocao_computador1.hardware_basico[1].nome = "Memoria RAM";
        promocao_computador1.hardware_basico[1].capacidade = 8; //gigas
        promocao_computador1.hardware_basico[2].nome = "HD";
        promocao_computador1.hardware_basico[2].capacidade = 500; //gigas
        promocao_computador1.sistema_operacional.nome = "Linux Ubuntu";
        promocao_computador1.sistema_operacional.tipo = 32; //bits
        

        //Promoção 2
        promocao_computador2.marca = "Acer";
        promocao_computador2.preco = 5800;
        promocao_computador2.hardware_basico[0].nome = "Pentium Core i5";
        promocao_computador2.hardware_basico[0].capacidade = 3370; //Mhz
        promocao_computador2.hardware_basico[1].nome = "Memoria RAM";
        promocao_computador2.hardware_basico[1].capacidade = 16; //gigas
        promocao_computador2.hardware_basico[2].nome = "HD";
        promocao_computador2.hardware_basico[2].capacidade = 1; //tera
        promocao_computador2.sistema_operacional.nome = "Windows 8";
        promocao_computador2.sistema_operacional.tipo = 64; //bits

        //Promoção 3
        promocao_computador3.marca = "Vaio";
        promocao_computador3.preco = 1800;
        promocao_computador3.hardware_basico[0].nome = "Pentium Core i7";
        promocao_computador3.hardware_basico[0].capacidade = 4700; //Mhz
        promocao_computador3.hardware_basico[1].nome = "Memoria RAM";
        promocao_computador3.hardware_basico[1].capacidade = 32; //gigas
        promocao_computador3.hardware_basico[2].nome = "HD";
        promocao_computador3.hardware_basico[2].capacidade = 2; //teras
        promocao_computador3.sistema_operacional.nome = "Windows 10";
        promocao_computador3.sistema_operacional.tipo = 64; //bits

        //Listar Computadores
        System.out.println("Lista de Promocoes: ");
        System.out.println("Computador 1");
        promocao_computador1.mostraPCConfigs();
        System.out.println("Computador 2");
        promocao_computador2.mostraPCConfigs();
        System.out.println("Computador 3");
        promocao_computador3.mostraPCConfigs();

        System.out.println("Para escolher o primeiro computador 1, para o segundo digite 2, para o terceiro digite 3 e para finalizar as escolhas digite 0: ");
        
        //fazer a entrada da opção de promoção
        escolha = scanner.nextInt();
        do{
            if(escolha == 1){
                cliente.preço_total += promocao_computador1.preco;
            }
            else if(escolha == 2){
                cliente.preço_total += promocao_computador2.preco;
            }
            else if(escolha == 3){
                cliente.preço_total += promocao_computador3.preco;
            }
            escolha = scanner.nextInt();
        }while(escolha != 0);

        pagamento = cliente.calculaTotalCompra();
        System.out.println("O preço a ser pago é: " + "R$" + pagamento);

    }
}
