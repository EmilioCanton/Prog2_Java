package principal;


public class Carta {
    private int valor;
    private String naipe;
    
    public Carta(){
        valor = 0;
        naipe = "";
    }
    
    public Carta(int valor, String naipe){
        this.valor= valor;
        this.naipe= naipe;
    }
    
    public int compararValor(Carta carta){
        if(this.valor > carta.getValor()){
            return 1;
        }
        if(this.valor == carta.getValor()){
            return 0;
        }else{
            return -1;     
        }
    }
    
    public int compararNaipe(Carta carta){
        if(this.naipe.equals(carta.getNaipe())){
            return 1;
        }
        else{
            return 0;
        }
    }

    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public String getNaipe(){
        return naipe;
    }
    
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
    
}   

