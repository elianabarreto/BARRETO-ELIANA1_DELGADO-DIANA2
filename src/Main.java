import daos.BD;
import entidades.Odontologo;
import servicios.OdontologoService;

public class Main {
    public static void main(String[] args) {

        OdontologoService odontologoService = new OdontologoService();
        BD.createTable();

        Odontologo odontologo1 = new Odontologo(1234, "Carlitos","Fernandez");
        odontologoService.guardar(odontologo1);

        Odontologo odontologo2 = new Odontologo(9876,"Pablo","Rodriguez");
        odontologoService.guardar(odontologo2);

        Odontologo odontologo3 = new Odontologo(4567,"Alberta","Solis");
        odontologoService.guardar(odontologo3);

        odontologoService.listarTodos();

    }
}