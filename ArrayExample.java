public class ArrayExample {
    public static void main(String args[]){
     String[] cars={"Volvo","BMW","Ford","Mazda"};
     System.out.println(cars[0]);
     cars[0]="Opel";
     System.out.println(cars[0]);
     System.out.println(cars.length);

     //loops through an array
     for(int i=0;i<cars.length;i++){
        System.out.println(cars[i]);
     }
    }
}
