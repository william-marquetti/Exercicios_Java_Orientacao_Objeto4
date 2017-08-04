package exercicio5;

public class Hora {

	private byte hor;
	private byte min;
	private byte seg;

	Hora(byte hor, byte min, byte seg){
		setHor(hor);
		setMin(min);
		setSeg(seg);
	}
	
	public byte getHor() {
		return hor;
	}

	public void setHor(byte hor) {
		
		if ( ( hor < 0 ) || ( hor > 23) ){
			
			throw new IllegalArgumentException("Hora inválida!");
		}else {
			this.hor = hor;
		}	
		
	}

	public byte getMin() {
		return min;
	}

	public void setMin(byte min) {
		
		if ( ( min < 0 ) || ( min > 59) ){
			
			throw new IllegalArgumentException("Minuto inválido!");
		} else {
			this.min = min;
		}
		
	}

	public byte getSeg() {
		return seg;
	}

	public void setSeg(byte seg) {
		
		if ( ( min < 0 ) || ( min > 59) ){
					
			throw new IllegalArgumentException("Segundo inválido!");
		} else {
			this.seg = seg;
		}
	}
	
	@Override
	public String toString() {
		return "\nHora: " + getHor() + ":" + getMin() + ":" + getSeg();
	}

}
