public class Carro extends Automovel {

    private String combustivel; 

    

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    } 

    public Carro(String combustivel, String placa, String marca, String modelo, String cor, int valor){
        super(placa, marca, modelo, cor, valor);
        this.combustivel = combustivel;
       
    }

    public Carro(){
        
    }

    

    
    
}
