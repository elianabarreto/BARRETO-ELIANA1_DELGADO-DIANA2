package servicios;

import daos.IDAO;
import daos.implementaciones.OdontologoDAOEnMemoria;
import daos.implementaciones.OdontologoDAOH2;
import entidades.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDAO<Odontologo> odontologoIDAO;

    public OdontologoService() {
        //Implementación en BD H2
        this.odontologoIDAO = new OdontologoDAOH2();

        //Implementación en memoria
        //this.odontologoIDAO = new OdontologoDAOEnMemoria();
    }

    public IDAO<Odontologo> getOdontologoIDAO() {
        return odontologoIDAO;
    }

    public void setOdontologoIDAO(IDAO<Odontologo> odontologoIDAO) {
        this.odontologoIDAO = odontologoIDAO;
    }

    public Odontologo guardar(Odontologo odontologo){
        return odontologoIDAO.guardar(odontologo);
    }
    public List<Odontologo> listarTodos(){
        return odontologoIDAO.listarTodos();
    }
}
