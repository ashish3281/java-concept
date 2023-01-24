enum Level{
        LOW,
        MEDIUM,
        HIGH
}
public class enumsExample1{
    public static void main(String[] args){
        Level obj=Level.MEDIUM;
        switch(obj){
            case LOW:
            System.out.println("low level");
            break;
            case MEDIUM:
            System.out.println("Medium level");
            break;
            case HIGH:
            System.out.println("High level");
        }
    }
}

// for(Level obj:Level.values()){
//     System.out.println(obj);
// }