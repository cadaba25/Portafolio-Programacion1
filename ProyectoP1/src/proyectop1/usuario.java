
package proyectop1;

public class usuario {


    String nombre, contra;
    String Partidas[] ;
    private int PartidasJugadas;
    
    public usuario(String nombre, String contra){
        this.nombre = nombre;
        this.contra = contra;
        Partidas = new String[100];
        PartidasJugadas = 0;
    }
    
    void RegistrarPartida(String PartidaActual){
        Partidas[PartidasJugadas] = PartidaActual;
        PartidasJugadas++;
    }   
    
    String VerPartidas(){
        String TodasLasPartidas = "";
        
        for (int i = 0; i < PartidasJugadas; i++) {
            TodasLasPartidas += Partidas[i]+"\n";
        }
        
        return TodasLasPartidas;
    }
    
    
    
    
}
