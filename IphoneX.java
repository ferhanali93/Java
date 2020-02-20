public class IphoneX {

/**
* Class is the plan of IphoneX
* Now we will send this to china to build IphoneX for us
*/
//myIphoneX--> by using new keyword you invoke constructor to create myIphoneX
//IphoneX()-->Constructor-->Same as class name with ();
//IphoneX myIphoneX = new IphoneX();
IphoneX myIphoneX;
//Create object/Assigning 
//myIphoneX = new IphoneX();
//Function = method
//Here the name of the function is call
public static void main(String[] args) {
    IphoneX myIphoneX = new IphoneX();
    myIphoneX.call();
    //calling using myIphoneX
    //by doing this we have created a relationship with main() method call() method
}
public void call() {
System.out.println("This method can make a call");
} 
}
