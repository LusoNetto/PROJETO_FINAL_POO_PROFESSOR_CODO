package VO;

public class TB_TIPOEQUIPAMENTO extends TB_EQUIPAMENTO {
	
	private int CD_ID;	
	private String NM_NOMETIPO;
	
	
	public TB_TIPOEQUIPAMENTO(int CD_ID) {		
		super(CD_ID);
		this.NM_NOMETIPO = NM_NOMETIPO;
	}
	
	public String getNM_NOMETIPO() {
		return this.NM_NOMETIPO;
	}
	
	public void setNM_NOMETIPO(String NM_NOMETIPO) {
		this.NM_NOMETIPO=NM_NOMETIPO;
	}

    public void TB_TIPOEQUIPAMENTO_PK(int CD_ID) {
    	
    }

}