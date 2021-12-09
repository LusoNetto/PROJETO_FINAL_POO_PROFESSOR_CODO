package VO;

public class TB_CARGO{
	
	private int CD_ID;
    private String DT_DATA;
    private String DT_HORA;
	private int TB_TIPOAGENDAMENTO_CD_ID;
	private int TB_FUNCIONARIO_CD_ID;
	private int TB_EQUI_SALA_CD_ID;
	private int TB_PACIENTE_CD_ID;
	private int TB_ENTRADASAIDA_CD_ID;

    public void TB_AGENDAMENTO_PK(int CD_ID) {
    	
    }
	
	public int getCD_ID() {
		return this.CD_ID;
	}
	
	public void setCD_ID(int CD_ID) {
		this.CD_ID=CD_ID;
	}
	
	public String getDT_DATA() {
		return this.DT_DATA;
	}
	
	public void setDT_DATA(String DT_DATA) {
		this.DT_DATA=DT_DATA;
	}
	
	public String getDT_HORA() {
		return this.DT_HORA;
	}
	
	public void setDT_HORA(String DT_HORA) {
		this.DT_HORA=DT_HORA;
	}
	
	public int getTB_TIPOAGENDAMENTO_CD_ID() {
		return this.TB_TIPOAGENDAMENTO_CD_ID;
	}
	
	public void setTB_TIPOAGENDAMENTO_CD_ID(int TB_TIPOAGENDAMENTO_CD_ID) {
		this.TB_TIPOAGENDAMENTO_CD_ID=TB_TIPOAGENDAMENTO_CD_ID;
	}
	
	public int getTB_FUNCIONARIO_CD_ID() {
		return this.TB_FUNCIONARIO_CD_ID;
	}
	
	public void setTB_FUNCIONARIO_CD_ID(int TB_FUNCIONARIO_CD_ID) {
		this.TB_FUNCIONARIO_CD_ID=TB_FUNCIONARIO_CD_ID;
	}
	
	public int getTB_EQUI_SALA_CD_ID() {
		return this.TB_EQUI_SALA_CD_ID;
	}
	
	public void setTB_EQUI_SALA_CD_ID(int TB_EQUI_SALA_CD_ID) {
		this.TB_EQUI_SALA_CD_ID=TB_EQUI_SALA_CD_ID;
	}
	
	public int getTB_PACIENTE_CD_ID() {
		return this.TB_PACIENTE_CD_ID;
	}
	
	public void setTB_PACIENTE_CD_ID(int TB_PACIENTE_CD_ID) {
		this.TB_PACIENTE_CD_ID=TB_PACIENTE_CD_ID;
	}
	
	public int getTB_ENTRADASAIDA_CD_ID() {
		return this.TB_ENTRADASAIDA_CD_ID;
	}
	
	public void setTB_ENTRADASAIDA_CD_ID(int TB_ENTRADASAIDA_CD_ID) {
		this.TB_ENTRADASAIDA_CD_ID=TB_ENTRADASAIDA_CD_ID;
	}
	public TB_TIPOAGENDAMENTO (int CD_ID, date DT_DATA, char DT_HORA, int TB_TIPOAGENDAMENTO_CD_ID, int TB_FUNCIONARIO_CD_ID, int TB_EQUI_SALA_CD_ID, int TB_PACIENTE_CD_ID, int TB_ENTRADASAIDA_CD_ID) {
		this.CD_ID = CD_ID;
		this.DT_DATA = DT_DATA;
		this.DT_HORA = DT_HORA;
		this.TB_TIPOAGENDAMENTO_CD_ID = TB_TIPOAGENDAMENTO_CD_ID;
		this.TB_FUNCIONARIO_CD_ID = TB_FUNCIONARIO_CD_ID;
		this.TB_EQUI_SALA_CD_ID = TB_EQUI_SALA_CD_ID;
		this.TB_PACIENTE_CD_ID = TB_PACIENTE_CD_ID;
		this.TB_ENTRADASAIDA_CD_ID = TB_ENTRADASAIDA_CD_ID;		
	}

}
