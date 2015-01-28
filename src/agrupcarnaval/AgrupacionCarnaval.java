
package agrupcarnaval;

public class AgrupacionCarnaval {
    String nombre;
    int categoria;
    String autorLetra;
    String autorMusica;
    int NumComponentes;
    int puntuacion;
    final int CHIRIGOTA = 1;
    final int COMPARSA = 2;
    final int CORO = 3;
    final int CUARTETO = 4;
    
    AgrupacionCarnaval(String nombre,int categoria,String autorLetra,String autorMusica,int componentes){
        this.nombre = nombre;
        this.categoria = categoria;
        this.autorLetra = autorLetra;
        this.autorMusica = autorMusica;
        this.NumComponentes = componentes;
    }
    
    AgrupacionCarnaval(String nombre,int categoria,String autorLetraYMusica,int componentes){
        this.nombre = nombre;
        this.categoria = categoria;
        this.NumComponentes = componentes;
        this.autorLetra = autorLetraYMusica;
        this.autorMusica = autorLetraYMusica;
    }
    
    boolean isCorrecto(){
        if(nombre.length()==0){
            return false;
        }
        if(categoria>4 && categoria<1){
            return false;
        }
        switch(categoria){
            case CHIRIGOTA: 
                if(NumComponentes>=7 && NumComponentes<=12){
                    return true;
                }else{
                    return false;
                }
            case COMPARSA:
                if(NumComponentes>=10 && NumComponentes<=15){
                    return true;
                }else{
                    return false;
                }
            case CORO:
                if(NumComponentes>=16 && NumComponentes<=45){
                    return true;
                }else{
                    return false;
                }
            case CUARTETO:
                if(NumComponentes>=3 && NumComponentes<=5){
                    return true;
                }else{
                    return false;
                }         
        }
        return true;
    }

    boolean puntuar(int puntuacion){
        if(puntuacion<=100){
            this.puntuacion=puntuacion;
            return true;
        }else{
            return false;
        }
    }
    
    boolean puntuar(int presentacion,int pasodoble,int cuples,int popurri){
        if(presentacion>10){
            return false;
        }
        if(pasodoble>40){
            return false;
        }
        if(cuples>30){
            return false;
        }
        if(popurri>40){
            return false;
        }
        this.puntuacion+=presentacion+pasodoble+cuples+popurri;
        return true;
    }
    
    
    int getPuntuacion() {
        return this.puntuacion;
    }
    
    String toResultado(){
        System.out.println("");
        System.out.println("Nombre: "+nombre);
        switch(categoria){
            case 1: System.out.println("Categoria: CHIRIGOTA");
                   break;
            case 2: System.out.println("Categoria: COMPARSA");
                    break;
            case 3: System.out.println("Categoria: CORO");
                    break;
            case 4: System.out.println("Categoria: CUARTETO");
                    break;
        }
        System.out.println("Puntacion "+ getPuntuacion());
        return null;
    }
    
}
    