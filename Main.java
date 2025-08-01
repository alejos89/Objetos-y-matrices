public class Main {
    public static void main(String[] args) {
         
        //Data (Json)
        String data[][] = {
            {"Juanito", "10", "11", "Compu"},
            {"Maria", "9", "12", "Math"},
            {"Pedro", "11", "10", "Science"},
            {"Ana", "12", "9", "History"},
            {"Luis", "8", "13", "Art"},
            {"Sofia", "13", "8", "Physics"},
            {"Carlos", "7", "14", "Chemistry"},
            {"Laura", "14", "7", "Biology"},
            {"Miguel", "6", "15", "Geography"},
            {"Isabel", "15", "6", "Literature"}
        };
        
        // You can now process this data as needed
      for (int i = 0; i < data.length; i++) {
      int edad= Integer.parseInt(data[i][1]);
            int clave= Integer.parseInt(data[i][2]);


        Alumno alumno1=new Alumno(data[i][0],edad,clave,data[i][3]);
        alumno1.saludar();
      }
    }
}