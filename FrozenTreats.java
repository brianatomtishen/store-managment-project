public class FrozenTreats extends Dessert {
  //instance variables for FrozenTreats class
  //sets up variables for the sub class FrozenTreats by giving them a data type and a classified name
    public boolean hasToppings;
    public String size;
  
  //no arguement constructors for FrozenTreats
  // sets up default values for the instance variables by setting them equal to a value equivalent
  //to the data type set in lines 4-5
    public FrozenTreats() {
      this.hasToppings = false;
      this.size = "Small";
    }
  
  //constructors w./ arguements for FrozenTreats class
  //this constructor allows the objects being called in the tester class to have values assigned
  // to each instance variable. It does this by defining specific arguements to initialize the object.
   public FrozenTreats(String name, double price, String flavor, int quantity, boolean hasToppings, String size) {
      super(name, price, flavor, quantity);
      this.hasToppings = hasToppings;
      this.size = size;
  }
  
  //accessor and mutator methods
  //the accessor methods return the value of an instance variable.
  //the mutator method used to modify the state of an object by changing the value.

  //accessor method for FrozenTreats class just hasToppings
    public boolean getHasToppings() {
      return hasToppings;
    }
    
  //accessor method for FrozenTreats class just size
    public String getSize() {
      return size;
    }
  
    //mutator method for FrozenTreats class just size
    public void setSize (String size) {
      this.size = size;
    }

    //mutator method for FrozenTreats class just hasToppings
    public void setHasToppings (boolean hasToppings) {
      this.hasToppings = hasToppings;
    }
  
  //toString() method for FrozenTreats class
  // to string method for FrozenTreats super keyword and hasToppings/size instance variables
     public String toString() {
      return super.toString() + "\nDoes it have toppings? : " + hasToppings + "\nSize: " + size + "\n";
  }
}
