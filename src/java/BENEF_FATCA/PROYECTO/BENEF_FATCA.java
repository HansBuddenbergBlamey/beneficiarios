/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BENEF_FATCA.PROYECTO;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.globalintegrator.dao.StoreProcedureDAO;

/**
 *
 * @author user
 */
@WebService(serviceName = "BENEF_FATCA")
public class BENEF_FATCA {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Inserta_Beneficiario")
    public String Inserta_Beneficiario(@WebParam(name = "NUM_POLIZA") int NUM_POLIZA, @WebParam(name = "RUT_BENEFICIARIO") String RUT_BENEFICIARIO, @WebParam(name = "NUM_SINIESTRO") int NUM_SINIESTRO) {
        StoreProcedureDAO DAO = new StoreProcedureDAO();
        String testInsertar = DAO.insertaBeneficiarioAnnotations(NUM_POLIZA,RUT_BENEFICIARIO,NUM_SINIESTRO,1);
        return testInsertar;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualiza_Beneficiario")
    public String Actualiza_Beneficiario(@WebParam(name = "NUM_POLIZA") int NUM_POLIZA, @WebParam(name = "RUT_BENEFICIARIO") String RUT_BENEFICIARIO, @WebParam(name = "NUM_SINIESTRO") int NUM_SINIESTRO, @WebParam(name = "NUM_PROPUESTA") int NUM_PROPUESTA, @WebParam(name = "NOM1") String NOM1, @WebParam(name = "NOM2") String NOM2, @WebParam(name = "APELLIDO1") String APELLIDO1, @WebParam(name = "APELLIDO2") String APELLIDO2, @WebParam(name = "NACIONALIDAD1") String NACIONALIDAD1, @WebParam(name = "NACIONALIDAD2") String NACIONALIDAD2, @WebParam(name = "NACIONALIDAD3") String NACIONALIDAD3, @WebParam(name = "FECHA_NACIMIENTO") int FECHA_NACIMIENTO, @WebParam(name = "PAIS_NACIMIENTO") String PAIS_NACIMIENTO, @WebParam(name = "CIUDADANIA_USA") int CIUDADANIA_USA, @WebParam(name = "TIN") String TIN, @WebParam(name = "RESIDENCIA_USA") int RESIDENCIA_USA, @WebParam(name = "DIR_USA") String DIR_USA, @WebParam(name = "CIUDAD_USA") String CIUDAD_USA, @WebParam(name = "ESTADO_USA") String ESTADO_USA, @WebParam(name = "COD_POSTAL_USA") String COD_POSTAL_USA, @WebParam(name = "FONO_USA") String FONO_USA, @WebParam(name = "ENVIO_ORDER") int ENVIO_ORDER, @WebParam(name = "PODER_NOTARIAL") int PODER_NOTARIAL, @WebParam(name = "CASILLA_POSTAL_USA") int CASILLA_POSTAL_USA, @WebParam(name = "DIR_CP") String DIR_CP, @WebParam(name = "CIUDAD_CP") String CIUDAD_CP, @WebParam(name = "ESTADO_CP") String ESTADO_CP, @WebParam(name = "COD_POSTAL_CP") String COD_POSTAL_CP, @WebParam(name = "FECHA_FORM") int FECHA_FORM, @WebParam(name = "MONTO_POLIZA") int MONTO_POLIZA) {
        StoreProcedureDAO DAO = new StoreProcedureDAO();
        String testActualizar = DAO.actualizaBeneficiarioAnnotations(NUM_POLIZA,RUT_BENEFICIARIO,NUM_SINIESTRO,NUM_PROPUESTA,NOM1,NOM2,APELLIDO1,APELLIDO2,NACIONALIDAD1,NACIONALIDAD2,NACIONALIDAD3,FECHA_NACIMIENTO,PAIS_NACIMIENTO,CIUDADANIA_USA,TIN,RESIDENCIA_USA,DIR_USA,CIUDAD_USA,ESTADO_USA,COD_POSTAL_USA,FONO_USA,ENVIO_ORDER,PODER_NOTARIAL,CASILLA_POSTAL_USA,DIR_CP,CIUDAD_CP,ESTADO_CP,COD_POSTAL_CP,FECHA_FORM,MONTO_POLIZA);
        return testActualizar;
    }
}
