package com.globalintegrator.dao;

import com.globalintegrator.data.SPMapper;
import com.globalintegrator.model.Beneficiario;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * StoreProcedure DAO - xml and annotation config
 *
 * @author Loiane Groner
 */
public class StoreProcedureDAO {

    /**
     *
     * @param NumPoliza
     * @param RutBeneficiario
     * @param NumSiniestro
     * @param SistemaOrigen
     * @return
     */
    public String insertaBeneficiarioAnnotations(int NumPoliza, String RutBeneficiario, int NumSiniestro, int SistemaOrigen) {

        /**
         * Llama a session de Base de datos obtenida en
         * MyBatisConnectionFactory.java.
         */
        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        /**
         * Llama a la clase SPMapper.java
         */
        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Beneficiario inserta = new Beneficiario();
            inserta.setNumPoliza(NumPoliza);
            inserta.setRutBeneficiario(RutBeneficiario);
            inserta.setNumSiniestro(NumSiniestro);
            inserta.setFkIdSistOrigen(SistemaOrigen);
            spMapper.callInsertaBeneficiario(inserta);
            return inserta.getRes();
        } finally {
            session.close();
        }
    }

    /* ****************************************************************************************************************** */
    /**
     *
     * @param In_Num_Poliza
     * @param In_Rut_Beneficiario
     * @param In_Num_Siniestro
     * @param In_Num_Propuesta
     * @param In_Nom1
     * @param In_Nom2
     * @param In_Apellido1
     * @param In_Estado_Usa
     * @param In_Nacionalidad1
     * @param In_Nacionalidad2
     * @param In_Apellido2
     * @param In_Fecha_Nacimiento
     * @param In_Ciudad_Usa
     * @param In_Ciudadania_Usa
     * @param In_Tin
     * @param In_Residencia_Usa
     * @param In_Dir_Usa
     * @param In_Nacionalidad3
     * @param In_Pais_Nacimiento
     * @param In_Cod_Postal_Usa
     * @param In_Fono_Usa
     * @param In_Envio_Order
     * @param In_Casilla_Postal_Usa
     * @param In_Dir_Cp
     * @param In_Poder_Notarial
     * @param In_Ciudad_Cp
     * @param In_Monto_Poliza
     * @param In_Cod_Postal_Cp
     * @param In_Fecha_Form
     * @param In_Estado_Cp
     * @return
     */
    public String actualizaBeneficiarioAnnotations(int In_Num_Poliza, String In_Rut_Beneficiario, int In_Num_Siniestro, int In_Num_Propuesta, String In_Nom1, String In_Nom2, String In_Apellido1, String In_Apellido2, String In_Nacionalidad1, String In_Nacionalidad2, String In_Nacionalidad3, int In_Fecha_Nacimiento, String In_Pais_Nacimiento, int In_Ciudadania_Usa, String In_Tin, int In_Residencia_Usa, String In_Dir_Usa, String In_Ciudad_Usa, String In_Estado_Usa, String In_Cod_Postal_Usa, String In_Fono_Usa, int In_Envio_Order, int In_Poder_Notarial, int In_Casilla_Postal_Usa, String In_Dir_Cp, String In_Ciudad_Cp, String In_Estado_Cp, String In_Cod_Postal_Cp, int In_Fecha_Form, int In_Monto_Poliza) {
        /**       
         * Llama a session de Base de datos obtenida en
         * MyBatisConnectionFactory.java.
         */
        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        /**
         * Llama a la clase SPMapper.java
         */
        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Beneficiario actualiza = new Beneficiario();
            actualiza.setIn_Num_Poliza(In_Num_Poliza);
            actualiza.setIn_Rut_Beneficiario(In_Rut_Beneficiario);
            actualiza.setIn_Num_Siniestro(In_Num_Siniestro);
            actualiza.setIn_Num_Propuesta(In_Num_Propuesta);
            actualiza.setIn_Nom1(In_Nom1);
            actualiza.setIn_Nom2(In_Nom2);
            actualiza.setIn_Apellido1(In_Apellido1);
            actualiza.setIn_Apellido2(In_Apellido2);
            actualiza.setIn_Nacionalidad1(In_Nacionalidad1);
            actualiza.setIn_Nacionalidad2(In_Nacionalidad2);
            actualiza.setIn_Nacionalidad3(In_Nacionalidad3);
            actualiza.setIn_Fecha_Nacimiento(In_Fecha_Nacimiento);
            actualiza.setIn_Pais_Nacimiento(In_Pais_Nacimiento);
            actualiza.setIn_Ciudadania_Usa(In_Ciudadania_Usa);
            actualiza.setIn_Tin(In_Tin);
            actualiza.setIn_Residencia_Usa(In_Residencia_Usa);
            actualiza.setIn_Dir_Usa(In_Dir_Usa);
            actualiza.setIn_Ciudad_Usa(In_Ciudad_Usa);
            actualiza.setIn_Estado_Usa(In_Estado_Usa);
            actualiza.setIn_Cod_Postal_Usa(In_Cod_Postal_Usa);
            actualiza.setIn_Fono_Usa(In_Fono_Usa);
            actualiza.setIn_Envio_Order(In_Envio_Order);
            actualiza.setIn_Poder_Notarial(In_Poder_Notarial);
            actualiza.setIn_Casilla_Postal_Usa(In_Casilla_Postal_Usa);
            actualiza.setIn_Dir_Cp(In_Dir_Cp);
            actualiza.setIn_Ciudad_Cp(In_Ciudad_Cp);
            actualiza.setIn_Estado_Cp(In_Estado_Cp);
            actualiza.setIn_Cod_Postal_Cp(In_Cod_Postal_Cp);
            actualiza.setIn_Fecha_Form(In_Fecha_Form);
            actualiza.setIn_Monto_Poliza(In_Monto_Poliza);
            spMapper.callActualizaBeneficiario(actualiza);
            return actualiza.getRes();
        } finally {
            session.close();
        }
    }

    /* ****************************************************************************************************************** */

/**
     *
     * @param NumPoliza
     * @param RutBeneficiario
     * @param NumSiniestro
     * @return
     */
    public String consultaEstadoBeneficiarioAnnotations(int NumPoliza, String RutBeneficiario, int NumSiniestro) {

        /**
         * Llama a session de Base de datos obtenida en
         * MyBatisConnectionFactory.java.
         */
        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        /**
         * Llama a la clase SPMapper.java
         */
        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Beneficiario consultaEstado = new Beneficiario();
            consultaEstado.setNumPoliza(NumPoliza);
            consultaEstado.setRutBeneficiario(RutBeneficiario);
            consultaEstado.setNumSiniestro(NumSiniestro);
            spMapper.callConsultaEstadoBeneficiario(consultaEstado);
            if ("Encontrado".equals(consultaEstado.getRes()))
                return consultaEstado.getEstado();
            else
                return consultaEstado.getRes();
        } finally {
            session.close();
        }
    }
    
     /**
     *
     * @param NumPoliza
     * @param RutBeneficiario
     * @param NumSiniestro
     * @param FkIdEstadoNew
     * @return
     */
    public String actualizaEstadoBeneficiarioAnnotations(int NumPoliza, String RutBeneficiario, int NumSiniestro, int FkIdEstadoNew) {

        /**
         * Llama a session de Base de datos obtenida en
         * MyBatisConnectionFactory.java.
         */
        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        /**
         * Llama a la clase SPMapper.java
         */
        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Beneficiario actualizaEstado = new Beneficiario();
            actualizaEstado.setNumPoliza(NumPoliza);
            actualizaEstado.setRutBeneficiario(RutBeneficiario);
            actualizaEstado.setNumSiniestro(NumSiniestro);
            actualizaEstado.setFkIdEstadoNew(FkIdEstadoNew);
            spMapper.callActualizaEstadoBeneficiario(actualizaEstado);
            return actualizaEstado.getRes();
        } finally {
            session.close();
        }
    }

}
