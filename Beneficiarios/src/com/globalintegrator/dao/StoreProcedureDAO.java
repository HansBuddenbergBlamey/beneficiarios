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
    
    public String insertaBeneficioAnnotations(int NumPoliza, String RutBeneficiario, int NumSiniestro, int SistemaOrigen) {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Beneficiario beneficiario = new Beneficiario();
            beneficiario.setNumPoliza(NumPoliza);
            beneficiario.setRutBeneficiario(RutBeneficiario);
            beneficiario.setFkIdSistOrigen(SistemaOrigen);
            beneficiario.setNumSiniestro(NumSiniestro);
            spMapper.callInsertaBeneficiario(beneficiario);
            return beneficiario.getRes();
        } finally {
            session.close();
        }
    }
    
}
