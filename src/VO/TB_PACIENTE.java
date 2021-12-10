package VO;

public class TB_PACIENTE {

	private int CD_ID;
    private int TB_PLANOSAUDE_CD_ID;
    private int TB_PESSOA_CD_ID;

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
	
	public int getTB_PLANOSAUDE_CD_ID() {
		return this.TB_PLANOSAUDE_CD_ID;
	}
	
	public void setTB_PLANOSAUDE_CD_ID(int TB_PLANOSAUDE_CD_ID) {
		this.TB_PLANOSAUDE_CD_ID=TB_PLANOSAUDE_CD_ID;
	}
	
	public int getTB_PESSOA_CD_ID() {
		return this.TB_PESSOA_CD_ID;
	}
	
	public void setTB_PESSOA_CD_ID(int TB_PESSOA_CD_ID) {
		this.TB_PESSOA_CD_ID=TB_PESSOA_CD_ID;
	}

    public void TB_AGENDAMENTO_PK(int CD_ID) {
    	
    }	
}
