public abstract class Material implements Enfrentable{
    int durabilidad;

    public int durabilidad(){
        return durabilidad;
    }

    public boolean esMismoMaterialQue(Material material){
        boolean mismoTipo = true;
        if(this.getClass()!=material.getClass())
            mismoTipo = false;
        return mismoTipo;
    }

    @Override
    public void vs(Enfrentable rival){
        rival.vs(this);
        return;
    }
    @Override
    public void vs(Herramienta rival){
        rival.vs(this);
    	return;
    }
    @Override
    public void vs(Material rival){	return; }
    @Override
    public void vs(Madera rival){ return; }
    @Override
    public void vs(Piedra rival){ return; }
    @Override
    public void vs(Metal rival){ return; }
    @Override
    public void vs(Diamante rival){ return; }
    @Override
    public void vs(Hacha unHacha){
        unHacha.vs(this);
        return;
    }
    @Override
    public void vs(Pico unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDeMadera unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDeMetal unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDePiedra unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoFino pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
        pico.vs(this);
        return;
    }   
}