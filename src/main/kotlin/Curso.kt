class Curso(var nombre:String,var instructor:Instructor) {


    var estudiantes:MutableList<Estudiante> = mutableListOf();

    init{

        instructor.cursos.add(this)

    }

    fun añadirEstudiante(estudiante:Estudiante)
    {
        estudiantes.add(estudiante);

    }

    fun imprimir()
    {
        println("Nombre curso: $nombre");
        println("---------------");

    }









}