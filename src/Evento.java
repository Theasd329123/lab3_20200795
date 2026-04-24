public class Evento {
    private String clubOrganiza;
    private String nombreEvento;
    private String fechaEvento;
    private int    cantAsistentes;

    public String getClubOrganiza() {
        return clubOrganiza;
    }

    public void setClubOrganiza(String clubOrganiza) {
        this.clubOrganiza = clubOrganiza;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public int getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }
}
