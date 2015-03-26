class TesteFuncionario{
 public static void main(String[] args){
  Funcionario a = new Funcionario();
  Funcionario b = new Funcionario();
  a.nome = "Naisa";
  a.salario = 2000.00;

  b.nome = "Kleber";
  b.salario = 2000.00;
 

  System.out.println(a.nome + " " + a.salario);
  System.out.println(b.nome + " " + b.salario);
}
}
