public class Moto extends Automovel {

    private String potencia; 

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }  

    public Moto(String potencia, String placa, String marca, String modelo, String cor, int valor){
    super(placa, marca, modelo, cor, valor);
    this.potencia = potencia;
       
    }

    public Moto(){
        
    }
    
}
