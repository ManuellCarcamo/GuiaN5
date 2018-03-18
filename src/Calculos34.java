
import javax.swing.JTextArea;


public class Calculos34 {
    
    // En esta clase se estan haciendo todos los calculos necesarios para el funcionamiento de la App 3
    
    private double pantalla, ram, precio, camaraPrincipal, camaraSecundaria;
    private int cpu, garantia, bateria, puntajeTotal;
    private String marca;
    int flash;
    String salida, salidaPuntaje, Accion;

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getSalidaPuntaje() {
        return salidaPuntaje;
    }

    public void setSalidaPuntaje(String salidaPuntaje) {
        this.salidaPuntaje = salidaPuntaje;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isTienePrincipal() {
        return tienePrincipal;
    }

    public void setTienePrincipal(boolean tienePrincipal) {
        this.tienePrincipal = tienePrincipal;
    }

    public boolean isTieneSecundaria() {
        return tieneSecundaria;
    }

    public void setTieneSecundaria(boolean tieneSecundaria) {
        this.tieneSecundaria = tieneSecundaria;
    }

    public boolean isTieneFlash() {
        return tieneFlash;
    }

    public void setTieneFlash(boolean tieneFlash) {
        this.tieneFlash = tieneFlash;
    }
    boolean tienePrincipal, tieneSecundaria, tieneFlash;

    public int getFlash() {
        return flash;
    }

    public void setFlash(int flash) {
        this.flash = flash;
    }
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    
    
    public double getTamañoPantalla() {
        return pantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.pantalla = tamañoPantalla;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCamaraPrincipal() {
        return camaraPrincipal;
    }

    public void setCamaraPrincipal(double camaraPrincipal) {
        this.camaraPrincipal = camaraPrincipal;
    }

    public double getCamaraSecundaria() {
        return camaraSecundaria;
    }

    public void setCamaraSecundaria(double camaraSecundaria) {
        this.camaraSecundaria = camaraSecundaria;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
   
    
    public void BateriaPantalla() {
    
        if (pantalla <=4){
           if (bateria<=1200){
           puntajeTotal = puntajeTotal+3;
           } else if (bateria>1200 && bateria<=2400){
           puntajeTotal = puntajeTotal+4;
           }else if (bateria>2400 && bateria<=3600){
           puntajeTotal = puntajeTotal+5;
           }else if (bateria>3600){
           puntajeTotal = puntajeTotal+6;
           }  
        }else if (pantalla>4 && pantalla<=5){
        
            if (bateria<=1200){
                puntajeTotal = puntajeTotal+1;
            }else if (bateria>1200 || bateria<=2400){
           puntajeTotal = puntajeTotal+2;
           }else if (bateria>2400 && bateria<=3100){
           puntajeTotal = puntajeTotal+3;
           }else if (bateria>3600){
           puntajeTotal = puntajeTotal+4;
           }
            
            
            
        }else if (pantalla>5){
        
            if (bateria<=1200){
                puntajeTotal = puntajeTotal+0;
            }else if (bateria>1200 && bateria<=2400){
           puntajeTotal = puntajeTotal+1;
           }else if (bateria>2400 && bateria<=3100){
           puntajeTotal = puntajeTotal+2;
           }else if (bateria>3600){
           puntajeTotal = puntajeTotal+3;
           }
            
        }
    
    }
    
    public void refMarca(){
    if (marca=="Nexus"|| marca=="Lenovo"|| marca=="Huawei"||marca=="Sony"|| marca=="Apple"){
                    puntajeTotal = puntajeTotal+4;
    }else if (marca=="Samsung"|| marca=="Alcatel"||marca=="LG"){
                        puntajeTotal = puntajeTotal+3;

    }else if (marca=="Otra"){
                            puntajeTotal = puntajeTotal+2;

    }
    }
    
    public void rangoPrecio(){
    if(precio<100){
                                puntajeTotal = puntajeTotal+2;
    }else if(precio>=100 && precio<=350){
                                puntajeTotal = puntajeTotal+3;
    } else if(precio>350){
                                puntajeTotal = puntajeTotal+4;
    }
    }
    
    public void pixelaje(){
    
    if (camaraPrincipal<=5){
    
        if (camaraSecundaria<2){
       puntajeTotal = puntajeTotal+1;
        } else if (camaraSecundaria>=2){
       puntajeTotal = puntajeTotal+2;
        }
        
    } if (camaraPrincipal>5 && camaraPrincipal<=8){
    
        if (camaraSecundaria<2){
       puntajeTotal = puntajeTotal+1;
        }else if (camaraSecundaria>=2 && camaraSecundaria<=3){
       puntajeTotal = puntajeTotal+2;
        }else if (camaraSecundaria>3 ){
       puntajeTotal = puntajeTotal+3;
        }
    } if (camaraPrincipal>8){
    
        if (camaraSecundaria<2){
       puntajeTotal = puntajeTotal+1;
        }else if (camaraSecundaria>=2 && camaraSecundaria<5){
       puntajeTotal = puntajeTotal+2;
        } else if (camaraSecundaria>=5){
       puntajeTotal = puntajeTotal+3;
        }
    
    }
    
    if(tieneFlash=false){
    puntajeTotal=puntajeTotal-1;
    }
    
    }
    
    public void garantia(){
    
        if(garantia<=3){
            puntajeTotal=puntajeTotal+1;
        }else if (garantia>3 && garantia<6){
            puntajeTotal=puntajeTotal+2;

        }else if (garantia>=6){
            puntajeTotal=puntajeTotal+4;

        }
    
    }
    
    public void Cpu(){
    
        if(cpu<=2){
        puntajeTotal=puntajeTotal+0;
        }else if (cpu>2 && cpu<=4){
                puntajeTotal=puntajeTotal+1;
        }else if (cpu>4 && cpu<=6){
                puntajeTotal=puntajeTotal+2;
        }else if (cpu>6 && cpu<=12){
                puntajeTotal=puntajeTotal+3;
        }
    
    
    } public void Ram(){
    
    if (ram<=1){
                    puntajeTotal=puntajeTotal+0;

    }else if (ram>1 && ram<2){
                    puntajeTotal=puntajeTotal+2;

    }else if (ram>=2 && ram<4){
                    puntajeTotal=puntajeTotal+4;

    }else if (ram>=4){
                    puntajeTotal=puntajeTotal+6;

    }
    
    
    
    }
    
   
    
     public String mostrar(){
    
    if (tienePrincipal == true && tieneSecundaria==true && tieneFlash==true){
    salida = "CPU: "+cpu+"\nTamaño Pantalla: "+pantalla+"\nRAM: "+ram+"\nBateria: "+bateria+"\nGarantia: "+garantia+"\nPrecio: $" + precio+"\nMarca: "+marca+"\nCámara Principal: "+camaraPrincipal+"\nCámara Secundaria: "+camaraSecundaria+"\nFlash: Sí";
    }else if (tienePrincipal == true && tieneSecundaria==true && tieneFlash==false) {
    salida = "CPU: "+cpu+"\nTamaño Pantalla: "+pantalla+"\nRAM: "+ram+"\nBateria: "+bateria+"\nGarantia: "+garantia+"\nPrecio: $" + precio+"\nMarca: "+marca+"\nCámara Principal: "+camaraPrincipal+"\nCámara Secundaria: "+camaraSecundaria+"\nFlash: No";
    }  if (tienePrincipal == true && tieneSecundaria==false && tieneFlash==true){
        salida = "CPU: "+cpu+"\nTamaño Pantalla: "+pantalla+"\nRAM: "+ram+"\nBateria: "+bateria+"\nGarantia: "+garantia+"\nPrecio: $" + precio+"\nMarca: "+marca+"\nCámara Principal: "+camaraPrincipal+"\nCámara Secundaria: No"+"\nFlash: Sí";

    }else if(tienePrincipal == true && tieneSecundaria==false && tieneFlash==false){
                salida = "CPU: "+cpu+"\nTamaño Pantalla: "+pantalla+"\nRAM: "+ram+"\nBateria: "+bateria+"\nGarantia: "+garantia+"\nPrecio: $" + precio+"\nMarca: "+marca+"\nCámara Principal: "+camaraPrincipal+"\nCámara Secundaria: No"+"\nFlash: No";

    }else if (tienePrincipal == false && tieneSecundaria==false && tieneFlash==false){
                    salida = "CPU: "+cpu+"\nTamaño Pantalla: "+pantalla+"\nRAM: "+ram+"\nBateria: "+bateria+"\nGarantia: "+garantia+"\nPrecio: $" + precio+"\nMarca: "+marca+"\nCámara Principal: No"+"\nCámara Secundaria: No"+"\nFlash: No";
                   
    }return (salida);
    
    
    }
    
     
    
    
     public String mostrarPuntaje(){
         
         
         
         salidaPuntaje= ""+puntajeTotal;
      return (salidaPuntaje);
    
    }
     
     public String Accion(){
     
     if (puntajeTotal<7){
     Accion ="No es buena inversión";
     }else if (puntajeTotal>=7 && puntajeTotal<15){
     Accion ="Es inversión de riesgo";
     }else if (puntajeTotal>=15 && puntajeTotal<22){
     Accion ="La inversión es viable";
     }else if (puntajeTotal>=22){
     Accion ="Es buena inversión";
     }
         
         return(Accion);
     }
     
    
    
}
