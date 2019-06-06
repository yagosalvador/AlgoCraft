public interface Enfrentable{
	public void vs(Enfrentable rival);
	public void vs(Material material);
	public void vs(Madera madera);
	public void vs(Piedra piedra);
	public void vs(Metal metal);
	public void vs(Diamante diamante);
	public void vs(Herramienta herramienta);
	public void vs(Hacha hacha);
	public void vs(Pico pico);
	public void vs(PicoFino pico);
	public void vs(PicoDeMetal unPico);
    public void vs(PicoDePiedra unPico);
    public void vs(PicoDeMadera unPico);
}
