package com.globalintegrator.model;

/**
 * Param POJO
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */

public class Beneficiario {

	private int NumPoliza;
        private String RutBeneficiario;
        private int NumSiniestro;
        private int FkIdSistOrigen;
        private String Res;

    /**
     * @return the NumPoliza
     */
    public int getNumPoliza() {
        return NumPoliza;
    }

    /**
     * @param NumPoliza the NumPoliza to set
     */
    public void setNumPoliza(int NumPoliza) {
        this.NumPoliza = NumPoliza;
    }

    /**
     * @return the RutBeneficiario
     */
    public String getRutBeneficiario() {
        return RutBeneficiario;
    }

    /**
     * @param RutBeneficiario the RutBeneficiario to set
     */
    public void setRutBeneficiario(String RutBeneficiario) {
        this.RutBeneficiario = RutBeneficiario;
    }

    /**
     * @return the NumSiniestro
     */
    public int getNumSiniestro() {
        return NumSiniestro;
    }

    /**
     * @param NumSiniestro the NumSiniestro to set
     */
    public void setNumSiniestro(int NumSiniestro) {
        this.NumSiniestro = NumSiniestro;
    }

    /**
     * @return the FkIdSistOrigen
     */
    public int getFkIdSistOrigen() {
        return FkIdSistOrigen;
    }

    /**
     * @param FkIdSistOrigen the FkIdSistOrigen to set
     */
    public void setFkIdSistOrigen(int FkIdSistOrigen) {
        this.FkIdSistOrigen = FkIdSistOrigen;
    }

    /**
     * @return the Res
     */
    public String getRes() {
        return Res;
    }

    /**
     * @param Res the Res to set
     */
    public void setRes(String Res) {
        this.Res = Res;
    }
        

}
