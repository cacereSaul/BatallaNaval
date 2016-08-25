package saul;

public class Naves {
	
		private String coordenada1;
		private String coordenada2;
		
		public Naves(String coordenada1, String coordenada2){
			this.coordenada1 = coordenada1;
			this.coordenada2 = coordenada2;
		}
		
		public String getCoordenada1(){
			return coordenada1;
		}
		
		public void setCoordenada1(String coordenada1){
			this.coordenada1=coordenada1;
		}
		
		public String getCoordenada2(){
			return coordenada2;
		}
		
		public void setCoordenada2(String coordenada2){
			this.coordenada2=coordenada2;
		}
		
		public String toString(){
			return this.coordenada1+"  "+this.coordenada2;
		}
	}


