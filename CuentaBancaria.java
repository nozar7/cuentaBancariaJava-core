public class CuentaBancaria{
 
     private double saldoCuentaCorriente;
     private double saldoDeAhorros;
     private static int cantidadCuentasCreadas=0;
     private static int montoTotalCuenta=0;

    public CuentaBancaria(double saldoCuentaCorriente, double saldoDeAhorros) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
        this.saldoDeAhorros = saldoDeAhorros;
	cantidadCuentasCreadas++;
	montoTotalCuenta=this.saldoCuentaCorriente+this.saldoDeAhorros;
    }
    public int getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public double getSaldoDeAhorros() {
        return saldoDeAhorros;
    }
     
    public void depositarDineroCorriente(double cantidad){
        saldoCuentaCorriente += cantidad;
	montoTotalCuenta+=cantidad;
    }
    
    public void depositarDineroAhorros(double cantidad){
        saldoDeAhorros += cantidad;
	montoTotalCuenta+=cantidad;
    }
    
    public void retirarDineroCorriente(double cantidad){
       if(saldoCuentaCorriente<=0){
	   System.out.println("Lo sentimos, no hay fondos suficientes");
	}
        saldoCuentaCorriente -= cantidad;
	montoTotalCuenta-=cantidad;
    }

    public void mostrarDineroCuentaCorriente(){
	System.out.println("Saldo Cuenta Corriente es: "+saldoCuentaCorriente);
    }
    
    public void mostrarDineroCuentaDeAhorros(){
	System.out.println("Saldo Cuenta De Ahorros es: "+saldoCuentaDeAhorros);
    }
}
