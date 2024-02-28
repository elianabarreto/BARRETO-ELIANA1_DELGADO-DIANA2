package daos.implementaciones;

import daos.IDAO;
        import entidades.Odontologo;
        import org.apache.log4j.Logger;

        import java.util.ArrayList;
        import java.util.List;

public class OdontologoDAOEnMemoria implements IDAO<Odontologo> {

    private static int cuenta = 1;
    private static List<Odontologo> odontologos = new ArrayList<>();
    private static final Logger LOGGER = Logger.getLogger(OdontologoDAOEnMemoria.class);

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologo.setId(cuenta);
        odontologos.add(odontologo);
        cuenta=cuenta+1;
        LOGGER.info("Se guardo el siguiente odontologo: " + odontologo);;
        return odontologo;

    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Esta es la lista de odontologos en memoria: " + odontologos);;
        return odontologos;
    }
}
