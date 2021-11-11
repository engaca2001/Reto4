fun main(args: Array<String>) {

  val estudiante1:Estudiante;
  var estudiante2:Estudiante;
  val instructor1:Instructor;
  val curso1:Curso;
  var curso2:Curso;

    estudiante1 = Estudiante(5);
    estudiante1.login();
    estudiante2 = Estudiante(8);
    estudiante2.login();


    instructor1 = Instructor("inicial");
    instructor1.login();


    curso1 = Curso("java",instructor1);
    curso2 = Curso("kotlin",instructor1);

    estudiante1.matricular(curso1);
    estudiante2.matricular(curso2);

    estudiante1.imprimir();
    estudiante2.imprimir();

    instructor1.imprimir();












}