public class Caminhao extends Automovel {
     public String carroceria; 
     
     public String getcarroceria() {
        return carroceria;
    }
    
     public void setcarroceria(String carroceria) {
        this.carroceria = carroceria;
    } 

    public Caminhao(String carroceria, String placa, String marca, String modelo, String cor, int valor){
        super(placa, marca, modelo, cor, valor);
        this.carroceria = carroceria;
       
    }

    public Caminhao(){

    }

    }
    

