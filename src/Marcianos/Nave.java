package Marcianos;

public class Nave extends efectivo {

    public Nave (String somos){
        this.somos = somos;
        for (int i = 0; i<10; i++){
            if (somos.equals("Terricolas")){
                tripulacion [i] = new Terricola(somos);
            }
            else{
                tripulacion [i] = new Marciano(somos);
                
            }
        }
        System.out.println("Creada nave de " + somos);
    }
    
    
    
}