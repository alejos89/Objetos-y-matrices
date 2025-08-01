public class Alumno {
    String nombre;
    int edad;
    int clave;
    String carrera;

    public Alumno(String nombre, int edad, int clave, String carrera){
      this.nombre=nombre;
      this.edad=edad;
      this.clave=clave;
      this.carrera=carrera;
    }


    public void saludar(){
        System.out.println("Hola "+nombre);
        
    }
}
