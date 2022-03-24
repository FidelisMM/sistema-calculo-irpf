
package simulador.imposto.de.renda;


public class SimuladorImpostoDeRenda {
    
    public static void main(String[] args) {
        Contribuinte c1 = new Contribuinte("João", "123.456.789-11", 1300);
        Contribuinte c2 = new Contribuinte("Paulo", "123.456.789-12", 2150);
        Contribuinte c3 = new Contribuinte("Beatriz", "123.456.789-13", 3500);
        Contribuinte c4 = new Contribuinte("Ana", "123.456.789-14", 4200);
        Contribuinte c5 = new Contribuinte("José", "123.456.789-15", 5600);
        
        c1.calcularIRPF();
        c2.calcularIRPF();
        c3.calcularIRPF();
        c4.calcularIRPF();
        c5.calcularIRPF();
        
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c4.imprimir();
        c5.imprimir();
    }
}
