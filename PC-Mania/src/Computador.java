public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistema_operacional;
    HardwareBasico hardware_basico[];
    MemoriaUSB memoria_Usb;
    boolean memoriausb = false;

    public Computador(){ //construtor
        sistema_operacional = new SistemaOperacional();
        hardware_basico = new HardwareBasico[10];
        HardwareBasico hb1 = new HardwareBasico();
        HardwareBasico hb2 = new HardwareBasico();
        HardwareBasico hb3 = new HardwareBasico();
        hardware_basico[0] = hb1;
        hardware_basico[1] = hb2;
        hardware_basico[2] = hb3;
    }

    void mostraPCConfigs(){ //mostra a configuração do pc escolhido
        System.out.println(marca);
        for(int i = 0; i < hardware_basico.length; i++){
            if(hardware_basico[i] != null){
            System.out.println(hardware_basico[i].nome + " (" + hardware_basico[i].capacidade + " Mhz)");
            }
        }
        System.out.println(sistema_operacional.nome + " " + sistema_operacional.tipo + "bits");
        if(memoriausb == false){ //checa se foi escolhido ter memoria usb ou nao
            System.out.println("Nao possui memoria USB");
        }
        else if(memoriausb == true){
            System.out.println(memoria_Usb.nome + " " + memoria_Usb.capacidade);
        }
        System.out.println("\n"); //pula uma linha
    }

    void addMemoriaUSB(MemoriaUSB musb){ //muda o estado booleano da variavel memoriausb para mostrar q agr tem memoria usb
        memoria_Usb.nome = musb.nome;
        memoria_Usb.capacidade = musb.capacidade;
        memoriausb = true;
    }
}
