import java.util.ArrayList;


public class Main{
    ArrayList<String> eventos = new ArrayList<>();

    Presidente presidente1 = new Presidente();
    presidente1.setNombreClub("Literatura");
    presidente1.setNombrePresi("Juan");
    presidente1.setCodigoPresi(20201778);

    System.out.println("Nombre Presidente: " + presidente1.nombrePresi);
    System.out.println("Código Presidente: " + presidente1.codigoPresi);
    System.out.println("Club Presidente: " + presidente1.nombreClub);

    Club club1 = new Club();

    club1.setNombre("Club de Literatura");
    club1.setCantidadMiembros(10)
    club1.setPresidente(presidente1);





}
