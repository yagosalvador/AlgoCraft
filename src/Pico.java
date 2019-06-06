//Las herramientas tienen una ReglaDeDesgaste que es quien tiene
//el metodo para procesar el desgaste
public abstract class Pico extends Herramienta{
	@Override
	public void vs(Material rival){
        rival.vs(this);
        return;
    }
}