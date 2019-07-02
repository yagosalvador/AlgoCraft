public abstract class Pico extends Herramienta{
	@Override
	public void vs(Material rival){
		rival.vs(this);
	}
   	@Override
	public void vs(Madera rival){ this.desgastar(); }
    @Override
	public void vs(Piedra rival){ this.desgastar(); }
    @Override
	public void vs(Metal rival){ this.desgastar(); }
    @Override
	public void vs(Diamante rival){ this.desgastar(); }
}