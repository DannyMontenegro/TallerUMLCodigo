
import java.util.ArrayList;

public class Paciente extends  Persona {

    protected String email;
    
    protected ArrayList<Receta> recetas;
    
    protected HistoriaClinica historiaClinica;
    
    protected Cita cita;
    
    public boolean solicitarCita() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
