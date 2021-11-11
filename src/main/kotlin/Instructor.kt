class Instructor(var nivel:String):Usuario() {

    var cursos:MutableList<Curso> = mutableListOf();

    override fun login()
    {
        println("Instructor: ")
        super.login()
    }
    override fun imprimir(){

        println("Intructor: ")
        super.imprimir();
        println("Nivel: $nivel")

        println("Cursos impartidos:")

        for (elemento in cursos)
        {
            elemento.imprimir();
        }

        println("-----------------");
    }

    fun corregir()
    {
        println("Corrigiendo");
    }
}