public class Tarea {
    public String nombre_tarea;
    public String descripcion;
    public int duracion;
    public String persona_encargada;
    public String estado;

    public Tarea(String nombre_tarea_param, String descripcion, int duracion_param, String persona_encargada_param,
            String estado_param) {
        this.nombre_tarea = nombre_tarea_param;
        this.duracion = duracion_param;
        this.persona_encargada = persona_encargada_param;
        this.estado = estado_param;
        this.descripcion = descripcion;
    }

    public Tarea() {
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPersona_encargada() {
        return persona_encargada;
    }

    public void setPersona_encargada(String persona_encargada) {
        this.persona_encargada = persona_encargada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}