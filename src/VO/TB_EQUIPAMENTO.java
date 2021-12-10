package VO;

public class TB_EQUIPAMENTO extends TB_EQUI_SALA{
	
	private int CD_ID;	
	private String NM_NOME;
	private String DS_DESCRICAO;
	private String NM_MARCA;
	private char BL_ESTADO;
	private int TB_TIPOEQUIPAMENTO_CD_ID;
	
	public TB_EQUIPAMENTO(int CD_ID) {		
		super(CD_ID);
		this.NM_NOME = NM_NOME;
		this.DS_DESCRICAO = DS_DESCRICAO;
		this.NM_MARCA = NM_MARCA;
		this.BL_ESTADO = BL_ESTADO;
		this.TB_TIPOEQUIPAMENTO_CD_ID = TB_TIPOEQUIPAMENTO_CD_ID;
	}
	
	public String getNM_NOME() {
		return this.NM_NOME;
	}
	
	public void setNM_NOME(String NM_NOME) {
		this.NM_NOME=NM_NOME;
	}
	
	public String getDS_DESCRICAO() {
		return this.DS_DESCRICAO;
	}
	
	public void setDS_DESCRICAO(String DS_DESCRICAO) {
		this.DS_DESCRICAO=DS_DESCRICAO;
	}
	
	public String getNM_MARCA() {
		return this.NM_MARCA;
	}
	
	public void setNM_MARCA(String NM_MARCA) {
		this.NM_MARCA=NM_MARCA;
	}
	
	public char getBL_ESTADO() {
		return this.BL_ESTADO;
	}
	
	public void setBL_ESTADO(char BL_ESTADO) {
		this.BL_ESTADO=BL_ESTADO;
	}
	
	public int getTB_TIPOEQUIPAMENTO_CD_ID() {
		return this.TB_TIPOEQUIPAMENTO_CD_ID;
	}
	
	public void setTB_TIPOEQUIPAMENTO_CD_ID(int TB_TIPOEQUIPAMENTO_CD_ID) {
		this.TB_TIPOEQUIPAMENTO_CD_ID=TB_TIPOEQUIPAMENTO_CD_ID;
	}

    public void TB_EQUIPAMENTO_PK(int CD_ID) {
    	
    }

}
