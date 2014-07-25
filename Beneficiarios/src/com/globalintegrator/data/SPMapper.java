package com.globalintegrator.data;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import com.globalintegrator.model.Beneficiario;

/**
 * Stored Procedure Mapper contains all the myBatis/iBatis annotations
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public interface SPMapper {

    /**
     *
     * @param beneficiario2 Llama a los objetos declarados en el archivo de parametros Beneficiario.java.
     * @return
     */
    Object callInsertaBeneficiario(Beneficiario beneficiario2);

	//--methos bellow are the same as above, but they are using annotations

    /**
     *
     * @param beneficiario2c
     * @return
     */
    @Select(value= "{ CALL BENEFICIARIO_FATCA.Inserta_Beneficiario( #{NumPoliza, mode=IN, jdbcType=INTEGER}, #{RutBeneficiario, mode=IN, jdbcType=VARCHAR}, #{NumSiniestro, mode=IN, jdbcType=INTEGER}, #{FkIdSistOrigen, mode=IN, jdbcType=INTEGER}, #{res, mode=OUT, jdbcType=VARCHAR} )}")
	@Options(statementType = StatementType.CALLABLE)
	Object callGetInsertaBeneficiarioAnnotations(Beneficiario beneficiario2);
        
        
}
