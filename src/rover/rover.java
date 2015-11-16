package rover;

public class rover {

	private String comandos;
	
	private coordenadas objCoordenadas = new coordenadas();
	

	public String getComandos() {
		return comandos;
	}

	public void setComandos(String comandos) {
		this.comandos = comandos;
	}



	
	public void iniciar() {
		if (objCoordenadas!=null){
			for(char comando : comandos.toCharArray()){
					movimentar(comando);	
			}	
		}
		
			
	}

	private void movimentar(char comando) {

		if(objCoordenadas.getPontoCardeal()=='N'){ // North -- Norte
			if(comando=='M'){
				objCoordenadas.incrementaY();
			}else if(comando=='L'){
				objCoordenadas.setPontoCardeal('W');
			}else if(comando=='R'){
				objCoordenadas.setPontoCardeal('E');
				
			}
		} else if(objCoordenadas.getPontoCardeal()=='S'){ // South -- Sul
			if(comando=='M'){
				objCoordenadas.descrementaY();
			}else if(comando=='L'){
				objCoordenadas.setPontoCardeal('E');
			}else if(comando=='R'){
				objCoordenadas.setPontoCardeal('W');
			}
		}  else if(objCoordenadas.getPontoCardeal()=='E'){ // East -- leste
			if(comando=='M'){
				objCoordenadas.incrementaX();
			}else if(comando=='L'){
				objCoordenadas.setPontoCardeal('N');
			}else if(comando=='R'){
				objCoordenadas.setPontoCardeal('S');
			}
		}else if(objCoordenadas.getPontoCardeal() == 'W'){ // West -- Norte
			if(comando=='M'){
				objCoordenadas.descrementaX();
			}else if(comando=='L'){
				objCoordenadas.setPontoCardeal('S');	
			}else if(comando=='R'){
				objCoordenadas.setPontoCardeal('N');
			}
		}
			
	}

	@Override
	public String toString() {
		return objCoordenadas.toString();
	}

	public rover(coordenadas objCoordenadas) {
		
		this.objCoordenadas = objCoordenadas;
	}

	public rover() {
		
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

