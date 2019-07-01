public abstract class Material implements Enfrentable, Almacenable{
    int durabilidad;
    EscuchadorEventosJuego escuchadorDeEventos;
    public int durabilidad(){
        return durabilidad;
    }

    public boolean esMismoMaterialQue(Material material){
        boolean mismoTipo = true;
        if(this.getClass()!=material.getClass())
            mismoTipo = false;
        return mismoTipo;
    }
    public void setEscuchador(EscuchadorEventosJuego escuchador){
        this.escuchadorDeEventos = escuchador;
    }
    @Override
    public void vs(Enfrentable rival){ rival.vs(this); }
    @Override
    public void vs(Herramienta rival){ rival.vs(this); }
    @Override
    public void vs(Material rival){ }
    @Override
    public void vs(Madera rival){ }
    @Override
    public void vs(Piedra rival){ }
    @Override
    public void vs(Metal rival){ }
    @Override
    public void vs(Diamante rival){ }
    @Override
    public void vs(Hacha unHacha){ unHacha.vs(this); }
    @Override
    public void vs(Pico unPico){ unPico.vs(this); }
    @Override
    public void vs(PicoDeMadera unPico){ unPico.vs(this); }
    @Override
    public void vs(PicoDeMetal unPico){ unPico.vs(this); }
    @Override
    public void vs(PicoDePiedra unPico){ unPico.vs(this); }
    @Override
    public void vs(PicoFino pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
        pico.vs(this);
    }

    public boolean roto(){
        if (durabilidad == 0) {
            if(escuchadorDeEventos!=null)
                escuchadorDeEventos.roto();
            return true;
        }
        return false;
    }
}