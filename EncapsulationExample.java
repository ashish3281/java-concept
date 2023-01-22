public class EncapsulationExample {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public static void main(String args[]){
        EncapsulationExample obj=new EncapsulationExample();
        obj.setName("ashish");
        System.out.println(obj.getName());
    }
}
