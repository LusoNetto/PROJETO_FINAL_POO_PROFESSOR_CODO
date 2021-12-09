package VO;

public class TB_EQUI_SALA extends TB_AGENDAMENTO{
	
	private int CD_ID;	
	private int TB_EQUIPAMENTO_CD_ID;
	private int TB_SALA_CD_id_Sala;
	
	public TB_EQUI_SALA(int CD_ID) {		
		super(CD_ID);
		this.TB_EQUIPAMENTO_CD_ID = TB_EQUIPAMENTO_CD_ID;
		this.TB_SALA_CD_id_Sala = TB_SALA_CD_id_Sala;
	}
	
	public int getTB_EQUIPAMENTO_CD_ID() {
		return this.TB_EQUIPAMENTO_CD_ID;
	}
	
	public void setTB_EQUIPAMENTO_CD_ID(int TB_EQUIPAMENTO_CD_ID) {
		this.TB_EQUIPAMENTO_CD_ID=TB_EQUIPAMENTO_CD_ID;
	}
	
	public int getTB_SALA_CD_id_Sala() {
		return this.TB_SALA_CD_id_Sala;
	}
	
	public void setTB_SALA_CD_id_Sala(int TB_SALA_CD_id_Sala) {
		this.TB_SALA_CD_id_Sala=TB_SALA_CD_id_Sala;
	}

    public void TB_EQUI_SALA_PK(int CD_ID) {
    	
    }

}
