class TesteTurma{
 public static void main(String[] args){
 Turma a = new Turma();
 Turma b = new Turma();
 a.periodo = "Manhã";
 a.serie = "2";
 a.sigla = "F";
 a.tipoDeEnsino = "Ensino Médio";
 b.periodo = "Tarde";
 b.serie = "2";
 b.sigla = "B";
 b.tipoDeEnsino = "Ensino Fundamental";
 System.out.println(a.periodo + " " + a.serie + " " + a.sigla + " " + a.tipoDeEnsino);
 System.out.println(b.periodo + " " + b.serie + " " + b.sigla + " " + b.tipoDeEnsino);
}
}
