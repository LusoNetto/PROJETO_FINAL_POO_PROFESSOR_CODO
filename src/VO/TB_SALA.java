package VO;

public class TB_SALA extends TB_EQUI_SALA{
	
	private String NM_NUMERO;
	private char Bl_OCUPADA;
	private int TB_TIPOSALA_CD_ID;
	
	public TB_SALA(int CD_ID) {		
		super(CD_ID);
		this.NM_NUMERO = NM_NUMERO;
		this.Bl_OCUPADA = Bl_OCUPADA;
		this.TB_TIPOSALA_CD_ID = TB_TIPOSALA_CD_ID;
	}
	
	public String getNM_NUMERO() {
		return this.NM_NUMERO;
	}
	
	public void setNM_NUMERO(String NM_NUMERO) {
		this.NM_NUMERO=NM_NUMERO;
	}
	
	public char getBl_OCUPADA() {
		return this.Bl_OCUPADA;
	}
	
	public void setBl_OCUPADA(char Bl_OCUPADA) {
		this.Bl_OCUPADA=Bl_OCUPADA;
	}
	
	public int getTB_TIPOSALA_CD_ID() {
		return this.TB_TIPOSALA_CD_ID;
	}
	
	public void setTB_TIPOSALA_CD_ID(int TB_TIPOSALA_CD_ID) {
		this.TB_TIPOSALA_CD_ID=TB_TIPOSALA_CD_ID;
	}

    public void TB_SALA_PK(int CD_ID) {
    	
    }


}
