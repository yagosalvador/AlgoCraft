public class MesaDeTrabajo{
    private Material [] espacioDeTrabajo = new Material [9];

    public MesaDeTrabajo(){
        for(int i=0;i<9;i++) {
            this.espacioDeTrabajo[i] = null;
        }
    }

    public void ubicarMaterial(int posicion, Material material){
        this.espacioDeTrabajo[posicion] = material;
    }

    public Herramienta compararConRecetario() {
        //supuestamente habria que preguntarle a cada tipo de herramienta como se construye y compararla con lo que hay en espacio de trabajo, devolver lo que coincida o bien null
        //pero esto implicaria 7 llamadas a herramientas distintas aca, lo cual no me resulta ni comodo ni escalable
        //y ademas termina siendo un puto switch o cadena de ifs, horrible
        return null;
    }

    /*
    public Herramienta construirHerramienta(){
        Herramienta herramientaAFabricar = this.compararConRecetario();
        if(getClass!=null)
            return herramientaAFabricar;
        else
            //excepcion
    }*/
}