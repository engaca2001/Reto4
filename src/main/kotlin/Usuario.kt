open class Usuario() {

    var name:String = "";
    var password:String = "";



    open fun login() {

        println("Username: ");
        this.name = readLine().toString();
        println("Password: ");
        this.password = readLine().toString();


    }

    open fun imprimir(){

        println("Nombre: $name");
    }

}