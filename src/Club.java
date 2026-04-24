public class Club {
    private String nombre;
    private int    cantidadMiembros;
    private String tipo;
    private int    cantidadEventos;

    private Presidente presidente;
    private Evento evento;



    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }



    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMiembros() {
        return cantidadMiembros;
    }

    public void setCantidadMiembros(int cantidadMiembros) {
        this.cantidadMiembros = cantidadMiembros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadEventos() {
        return cantidadEventos;
    }

    public void setCantidadEventos(int cantidadEventos) {
        this.cantidadEventos = cantidadEventos;
    }
}
