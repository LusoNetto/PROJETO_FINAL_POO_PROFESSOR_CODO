package VO;

public class TB_TIPOSALA extends TB_SALA{

	private int CD_ID;	
	private String NM_TIPOSALA;
	
	public TB_TIPOSALA(int CD_ID) {		
		super(CD_ID);
		this.NM_TIPOSALA = NM_TIPOSALA;
	}
	
	public String getNM_TIPOSALA() {
		return this.NM_TIPOSALA;
	}
	
	public void setNM_TIPOSALA(String NM_TIPOSALA) {
		this.NM_TIPOSALA=NM_TIPOSALA;
	}

    public void TB_TIPOSALA_PK(int CD_ID) {
    	
    }
	
}
