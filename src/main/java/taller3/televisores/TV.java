package taller3.televisores;
public class TV{
  private Marca marca;
  private int canal=1;
  private int precio=500;
  private boolean estado;
  private int volumen=1;
  private Control control;
  private static int numTV;
  public TV(Marca marca,boolean estado){
    this.marca=marca;
    this.estado=estado;
  }
  public Marca getMarca(){
    return marca;
  }
  public Control getControl(){
    return control;
  }
  public int getPrecio(){
    return precio;
  }
  public int getVolumen(){
    return volumen;
  }
  public int getCanal(){
    return canal;
  }
  public void setMarca(Marca marca){
    this.marca=marca;
  }
  public void setControl(Control control){
    this.control=control;
  }
  public void setPrecio(int precio){
    this.precio=precio;
  }
  public void setVolumen(int volumen){
    if ((0<=canal && canal<=7) && this.getEstado()){
      this.volumen=volumen;
    }
  }
  public void setCanal(int canal){
    if ((1<=canal && canal<=120)&& this.getEstado()) {
      this.canal=canal;
    }
  }
  public void setNumTV(int numTV){
    this.numTV=numTV;
  }
  public void turnOn(){
    if (estado==true){
      return;
    }
    estado=true;
  }
  public void turnOff(){
    if (estado==false){
      return;
    }
    estado=false;
  }
  public boolean getEstado(){
    return estado;
  }
  public void canalUp(){
    if (this.getEstado() && canal!=120){
      canal += 1;
    }
  }
  public void canalDown(){
    if(this.getEstado() && canal!=0)
      canal -=1;
  }
  public void volumenUp(){
      if (this.getEstado() && volumen!=7){
      volumen+=1;
    }
  }
  public void volumenDown(){
    if(this.getEstado() && volumen!=0){
      volumen -=1;
    }
  }
  
}