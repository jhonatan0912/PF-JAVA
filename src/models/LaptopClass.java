package models;

public class LaptopClass {
    public String marca;
    public String modelo;
    
    public double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String purchaseSuccess(){
        return "La venta se realizo correctamente"+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Precio: "+this.precio;
    }
}
