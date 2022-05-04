public class ClassPart1 {


    public static void main(String[] args) {

        Car porsche = new Car(); // constructor
        Car holden  = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera"); // initialize them
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());



    }

}
