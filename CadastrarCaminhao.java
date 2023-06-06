import java.util.Scanner;

public class CadastrarCaminhao {

    public void cadastrar(){
        Scanner sc = new  Scanner (System.in);

        Caminhao caminhao = new Caminhao();
        CaminhaoController caminhaoController = new CaminhaoController();

        System.out.println("\n -- CADASTRO DE MOTOS -- \n");

        System.out.println("Digite a placa da moto: ");
        String placa = sc.nextLine(); 
        caminhao.setplaca(placa);

        System.out.println("Digite a marca da moto: ");
        String marca = sc.nextLine(); 
        caminhao.setmarca(marca);


        System.out.println("Digite a modelo da moto: ");
        String modelo = sc.nextLine();
        caminhao.setmodelo(modelo);

        System.out.println("Digite a cor da moto: ");
        String cor = sc.nextLine();
        caminhao.setcor(cor);

        System.out.println("Digite o valor da moto: ");
        int valor = sc.nextInt();
        caminhao.setvalor(valor);

        caminhaoController.cadastrar(caminhao);

        System.out.println("---CAMINHÃO CADASTRADO----");

    }
    
}
