enum Carros_vendidos {
    GOL("volkswagen", 100),
    FOX("volkswagen", 200),
    FUSCA("volkswagen", 500); 

    private String marca; 
    private int quantidades_vendidos; 

    private Carros_vendidos(String marca, int quantidades_vendidos) {
        this.marca = marca;
        this.quantidades_vendidos = quantidades_vendidos; 
        
    }

    public String getmarca(){
        return marca;
    }

    public int getquantidades_vendidos(){
        return quantidades_vendidos;
    }

    

}
