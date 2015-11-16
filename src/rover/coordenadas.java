package rover;

public class coordenadas {

	private char pontoCardeal;
	private int posicaoX, localizacaoY;
	public void setPontoCardeal(char pontoCardeal) {
		this.pontoCardeal = pontoCardeal;
	}
	public int getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	
	public int getLocalizacaoY() {
		return localizacaoY;
	}
	public void setLocalizacaoY(int localizacaoY) {
		this.localizacaoY = localizacaoY;
	}
	
	public void incrementaX(){
		if (posicaoX<Limite.x){
			posicaoX++;	
		}
		
	}
	
	public void descrementaX(){
		if (posicaoX>0){
		posicaoX--;
		}
	}
	
	
	public void incrementaY(){
		if(localizacaoY<Limite.y){
			localizacaoY++;
		}
		
	}
	
	public void descrementaY(){
		if(localizacaoY>0){
			localizacaoY--;
		}
	}
	
	public coordenadas() {
	
	}
	
	public coordenadas(int posicaoX, int localizacaoY, char pontoCardeal) {
		
		this.pontoCardeal = pontoCardeal;
		this.posicaoX = posicaoX;
		this.localizacaoY = localizacaoY;
	}
	@Override
	public String toString() {
		return posicaoX + " " + localizacaoY + " " + pontoCardeal;
	}
	public char getPontoCardeal() {
		return pontoCardeal;
	}
	
	
	
}
