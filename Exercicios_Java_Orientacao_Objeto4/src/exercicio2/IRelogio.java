package exercicio2;

public interface IRelogio {
	
	public void setHorario(long horario);
	public long getHorario();
	
	public void setHorarioAlarme(long horarioAlarme);
	public long getHorarioAlarme();
	
	public void ligarAlarme();
	public void desligarAlarme();
	
	public void setVolumeRelogio(int volumeRelogio);
	public int getVolumeRelogio();

}
