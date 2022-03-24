
package simulador.imposto.de.renda;


public class Contribuinte {
    private String nome;
    private String cpf;
    private double salario;
    private double desc_irpf;
    
    public Contribuinte(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void calcularIRPF(){
        if (salario <= 1903.98){
            desc_irpf = 0;
        } else {
            if (salario > 1903.98 && salario <= 2826.65){
                desc_irpf = salario * 0.075;
            } else {
                if (salario > 2826.65 && salario <= 3751.05){
                    desc_irpf = salario * 0.15;
                } else {
                    if (salario > 3751.05 && salario <= 4664.68){
                        desc_irpf = salario * 0.225;
                    } else {
                        if (salario > 4664.68){
                            desc_irpf = salario * 0.275;
                        }
                    }
                }
            }
        }
    }
    
    public double calcularSalarioLiq(){
        return salario - desc_irpf;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome + " / CPF: " + cpf + " / Salário: R$ " + salario + " / Salário Líquido: R$ " + calcularSalarioLiq() + " / Porcentagem IRPF: " + ((calcularSalarioLiq()-getSalario())/getSalario())*100 + "%");
    }
}
