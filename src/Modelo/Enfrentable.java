package Modelo;

public interface Enfrentable{
	void vs(Enfrentable rival);
	void vs(Material material);
	void vs(Madera madera);
	void vs(Piedra piedra);
	void vs(Metal metal);
	void vs(Diamante diamante);
	void vs(Herramienta herramienta);
	void vs(Hacha hacha);
	void vs(Pico pico);
	void vs(PicoFino pico);
	void vs(PicoDeMetal unPico);
    void vs(PicoDePiedra unPico);
    void vs(PicoDeMadera unPico);
}
