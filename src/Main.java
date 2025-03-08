//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println(999999999);

        Empresa empresa = new Empresa();

        System.out.println(empresa.nomeEmpresa);
        System.out.println(empresa.enderecoEmpresa);
        System.out.println(empresa.CNPJ);
        System.out.println(empresa.tipoEmpresa);

        System.out.println("O nome do funcionario é: " + empresa.nomeFuncionario);
        System.out.println("O cargo do funcionario é: " + empresa.cargoFuncionario);
        System.out.println("O salario do funcionario é: " + empresa.valorSalarioFuncionario);

        Funcionario funcionario = new Funcionario();

//         double teste1 = 99.0; // maior espaço de memoria
//         float teste2 = 99.0F;
//         long teste3 = 99L;
//         int aumento = 99;

        float aumento = 120;
        float salarioFuncionario = 1512;

        System.out.println(salarioFuncionario);
        System.out.println(aumento + salarioFuncionario);
        System.out.println(aumento - salarioFuncionario);
        System.out.println(aumento * salarioFuncionario);
        System.out.println(aumento / salarioFuncionario);
        System.out.println(salarioFuncionario / aumento);

    }
}

// IntelliJ
// sout atalho para print
// CTRL + D duplica linha