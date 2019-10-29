
package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Arianna Lizbeth
 */
@Named(value = "ctrlPerimetro")
@RequestScoped
public class CtrlPerimetro {
    private String nombre;
    private double radio;
    private double perimetro;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getRadio() {
        return radio;
    }
 
    public void setRadio(double radio) {
        this.radio = radio;
    }
 
    public double getPerimetro (){
        return perimetro;
    }
    
    public void setPerimetro (double perimetro){
        this.perimetro=perimetro;
    }
    
  
  public void calcularPerimetro() {
      
      
      setPerimetro((double)(2 * 3.1416)*( getRadio() ));
      
    final String perimetro = "Hola " + getNombre()+ " el Perimetro del Circulo es: " + getPerimetro() + ".";
    FacesContext.getCurrentInstance()
        .addMessage(null, new FacesMessage(perimetro));
  }

}
