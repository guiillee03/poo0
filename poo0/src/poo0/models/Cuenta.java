
package poo0.models;




public class Cuenta {
    private String nombre, numeroCuenta;
    private double tipoInteres, saldo;

    public Cuenta() {
        
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public boolean ingresar(double cantidadIngresar){
        if(cantidadIngresar < 0){
            return false;
        }else{
            saldo = saldo + cantidadIngresar;
            return true;
        }
        
    }
    
    public boolean retirar(double cantidadRetirar){
      if(cantidadRetirar > 0){
          if(saldo < cantidadRetirar){
            System.out.println("No se a poddido retirar el dinero, el saldo es inferior");
            return false;
      }else{
          saldo -= cantidadRetirar;
          return true;
      }
      }else{
          return false;
      }
    }
    
    public boolean transferencia(Cuenta c, double cantidadTransferir){
        if(cantidadTransferir < 0){
            System.out.println("No se a podido realizar la transferencia no hay saldo suf");
            return false;
        }else if(saldo >= cantidadTransferir){
            retirar(cantidadTransferir);
            c.ingresar(cantidadTransferir);            
        }else{
            return false;
        }
        return true;
    }
    
}
