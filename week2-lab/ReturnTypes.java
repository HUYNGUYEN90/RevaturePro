
public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a class instance
        ReturnTypes rt = new ReturnTypes();

        //call your method here
        rt.returnNothing();

        //call the other method here
        boolean b = rt.returnBoolean();

        System.out.println("The value of b is: " + b);
    }

    //create your first method here
    public void returnNothing(){
        System.out.println("Inside of a void method");
    }

    //a method that returns a boolean
    public boolean returnBoolean(){
        return true;

	}

}
