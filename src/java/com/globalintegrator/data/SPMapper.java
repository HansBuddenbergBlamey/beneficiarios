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
     * @param beneficiario2
     * @return
     */
    @Select(value= "{ CALL BENEFICIARIO_FATCA.Inserta_Beneficiario( #{NumPoliza, mode=IN, jdbcType=INTEGER}, #{RutBeneficiario, mode=IN, jdbcType=VARCHAR}, #{NumSiniestro, mode=IN, jdbcType=INTEGER}, #{FkIdSistOrigen, mode=IN, jdbcType=INTEGER}, #{res, mode=OUT, jdbcType=VARCHAR} )}")
	@Options(statementType = StatementType.CALLABLE)
	Object callGetInsertaBeneficiarioAnnotations(Beneficiario beneficiario2);
    
/*******************************************************************************************************************************/

    /**
     *
     * @param beneficiario3 Llama a los objetos declarados en el archivo de parametros Beneficiario.java.
     * @return
     */
    Object callActualizaBeneficiario(Beneficiario beneficiario3);

    //--methos bellow are the same as above, but they are using annotations

    /**
     *
     * @param beneficiario3
     * @return
     */
    @Select(value= "{ CALL BENEFICIARIO_FATCA.Update_Beneficiario( #{In_Num_Poliza, mode=IN, jdbcType=NUMBER}, #{In_Rut_Beneficiario, mode=IN, jdbcType=VARCHAR2}, #{In_Num_Siniestro, mode=IN, jdbcType=NUMBER}, #{In_Num_Propuesta, mode=IN, jdbcType=VARCHAR2}, #{In_Nom1, mode=IN, jdbcType=VARCHAR2}, #{In_Nom2, mode=IN, jdbcType=VARCHAR2}, #{In_Apellido1, mode=IN, jdbcType=VARCHAR2}, #{In_Apellido2, mode=IN, jdbcType=VARCHAR2}, #{In_Nacionalidad1, mode=IN, jdbcType=VARCHAR2}, #{In_Nacionalidad2, mode=IN, jdbcType=VARCHAR2}, #{In_Nacionalidad3, mode=IN, jdbcType=VARCHAR2}, #{In_Fecha_Nacimiento, mode=IN, jdbcType=NUMBER}, #{In_Pais_Nacimiento, mode=IN, jdbcType=VARCHAR2}, #{In_Ciudadania_Usa, mode=IN, jdbcType=INTEGER}, #{In_Tin, mode=IN, jdbcType=VARCHAR2}, #{In_Residencia_Usa, mode=IN, jdbcType=INTEGER}, #{In_Dir_Usa, mode=IN, jdbcType=VARCHAR2}, #{In_Ciudad_Usa, mode=IN, jdbcType=VARCHAR2}, #{In_Estado_Usa, mode=IN, jdbcType=VARCHAR2}, #{In_Cod_Postal_Usa, mode=IN, jdbcType=VARCHAR2}, #{In_Fono_Usa, mode=IN, jdbcType=VARCHAR2}, #{In_Envio_Order, mode=IN, jdbcType=NUMBER}, #{In_Poder_Notarial, mode=IN, jdbcType=NUMBER}, #{In_Casilla_Postal_Usa, mode=IN, jdbcType=INTEGER}, #{In_Dir_Cp, mode=IN, jdbcType=VARCHAR2}, #{In_Ciudad_Cp, mode=IN, jdbcType=VARCHAR2}, #{In_Estado_Cp, mode=IN, jdbcType=VARCHAR2}, #{In_Cod_Postal_Cp, mode=IN, jdbcType=VARCHAR2}, #{In_Fecha_Form, mode=IN, jdbcType=NUMBER}, #{In_Monto_Poliza, mode=IN, jdbcType=VARCHAR2}, #{Res, mode=OUT, jdbcType=VARCHAR})}#{In_Num_Poliza, mode=IN, jdbcType=INTEGER}, #{In_Rut_Beneficiario, mode=IN, jdbcType=VARCHAR}, #{In_Num_Siniestro, mode=IN, jdbcType=INTEGER}, #{In_Num_Propuesta, mode=IN, jdbcType=VARCHAR}, #{In_Nom1, mode=IN, jdbcType=VARCHAR}, #{In_Nom2, mode=IN, jdbcType=VARCHAR}, #{In_Apellido1, mode=IN, jdbcType=VARCHAR}, #{In_Apellido2, mode=IN, jdbcType=VARCHAR}, #{In_Nacionalidad1, mode=IN, jdbcType=VARCHAR}, #{In_Nacionalidad2, mode=IN, jdbcType=VARCHAR}, #{In_Nacionalidad3, mode=IN, jdbcType=VARCHAR}, #{In_Fecha_Nacimiento, mode=IN, jdbcType=INTEGER}, #{In_Pais_Nacimiento, mode=IN, jdbcType=VARCHAR}, #{In_Tin, mode=IN, jdbcType=VARCHAR}, #{In_Dir_Usa, mode=IN, jdbcType=VARCHAR}, #{In_Ciudad_Usa, mode=IN, jdbcType=VARCHAR}, #{In_Estado_Usa, mode=IN, jdbcType=VARCHAR}, #{In_Cod_Postal_Usa, mode=IN, jdbcType=VARCHAR}, #{In_Fono_Usa, mode=IN, jdbcType=VARCHAR}, #{In_Envio_Order, mode=IN, jdbcType=INTEGER}, #{In_Poder_Notarial, mode=IN, jdbcType=INTEGER}, #{In_Dir_Cp, mode=IN, jdbcType=VARCHAR}, #{In_Ciudad_Cp, mode=IN, jdbcType=VARCHAR}, #{In_Estado_Cp, mode=IN, jdbcType=VARCHAR}, #{In_Cod_Postal_Cp, mode=IN, jdbcType=VARCHAR}, #{In_Fecha_Form, mode=IN, jdbcType=INTEGER}, #{In_Monto_Poliza, mode=IN, jdbcType=VARCHAR}, #{Res, mode=OUT, jdbcType=VARCHAR})}")
    @Options(statementType = StatementType.CALLABLE)
    Object callGetActualizaBeneficiarioAnnotations(Beneficiario beneficiario3);
        
/*******************************************************************************************************************************/

    /**
     *
     * @param beneficiario4 Llama a los objetos declarados en el archivo de parametros Beneficiario.java.
     * @return
     */
    Object callConsultaEstadoBeneficiario(Beneficiario beneficiario4);

    //--methos bellow are the same as above, but they are using annotations

    /**
     *
     * @param beneficiario4
     * @return
     */
    @Select(value= "{ CALL BENEFICIARIO_FATCA.Consulta_Estado_Beneficiario( #{NumPoliza, mode=IN, jdbcType=INTEGER}, #{RutBeneficiario, mode=IN, jdbcType=VARCHAR}, #{NumSiniestro, mode=IN, jdbcType=INTEGER}, #{Res, mode=OUT, jdbcType=VARCHAR}, #{Estado, mode=OUT, jdbcType=VARCHAR})}")
    @Options(statementType = StatementType.CALLABLE)
    Object callGetConsultaEstadoBeneficiarioAnnotations(Beneficiario beneficiario4);
        
    /*******************************************************************************************************************************/

    /**
     *
     * @param beneficiario5 Llama a los objetos declarados en el archivo de parametros Beneficiario.java.
     * @return
     */
    Object callActualizaEstadoBeneficiario(Beneficiario beneficiario5);

    //--methos bellow are the same as above, but they are using annotations

    /**
     *
     * @param beneficiario5
     * @return
     *
     */
    @Select(value= "{ CALL BENEFICIARIO_FATCA.Update_Estado_Beneficiario( #{NumPoliza, mode=IN, jdbcType=INTEGER}, #{RutBeneficiario, mode=IN, jdbcType=VARCHAR}, #{NumSiniestro, mode=IN, jdbcType=INTEGER}, #{FkIdEstadoNew, mode=IN, jdbcType=INTEGER}, #{res, mode=OUT, jdbcType=VARCHAR} )}")
    @Options(statementType = StatementType.CALLABLE)                      
    Object callGetActualizaEstadoBeneficiarioAnnotations(Beneficiario beneficiario5);
}
