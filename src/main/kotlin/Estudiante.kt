class Estudiante(var edad:Int):Usuario() {

    var cursos:MutableList<Curso> = mutableListOf();

   override fun login()
   {
       println("Estudiante: ")
       super.login()
   }
   override fun imprimir()
   {
       println("Estudiante: ")
       super.imprimir()
       println("Edad: $edad")
       println("Cursos matriculados: ")

       for (elemento in cursos)
       {
           elemento.imprimir();
       }

       println("------------------");

   }

   fun matricular( curso:Curso)
   {
        cursos.add(curso);
        curso.añadirEstudiante(this);
   }







}