public class Dessert {
  //instance variables for dessert class
  //sets up variables for the super class dessert by giving them a data type and a classified name
  //also sets the access to public to allow the instance variables to be accessed in other classes
  public String name;
  public double price;
  public String flavor;
  public int quantity;
  //no arguement constructors for dessert
  // sets up default values for the instance variables by setting them equal to a value equivalent
  //to the data type set in lines 5-8
  public Dessert() {
    this.name = "Not declared";
    this.price = 0.00;
    this.flavor = "Unknown";
    this.quantity = 0;
  }
  //constructors w./ arguements for dessert class
  //this constructor allows the objects being called in the tester class to have values assigned
  // to each instance variable. It does this by defining specific arguements to initialize the object.
  public Dessert (String name, double price, String flavor, int quantity) {
    this.name = name;
    this.price = price;
    this.flavor = flavor;
    this.quantity = quantity;
  }
  //accessor and mutator methods
  //the accessor methods return the value of an instance variable.
  //the mutator method used to modify the state of an object by changing the value.

  //accessor method for dessert class just name
  public String getName() {
    return name;
  }

  //accessor method for dessert class just price
  public double getPrice() {
    return price;
  }

  //accessor method for dessert class just flavor
  public String getFlavor() {
    return flavor;
  }

  //accessor method for dessert class just quantity
  public int getQuantity() {
    return quantity;
  }

  //mutator method for dessert class just name
  public void setName (String name) {
    this.name = name;
  }

  //mutator methods for dessert class just price
  public void setPrice (double price) {
    this.price = price;
  }

  //mutator method for dessert class just flavor
  public void setFlavor (String flavor) {
    this.flavor = flavor;
  }

  //mutator method for dessert class just quantity
  public void setQuantity (int quantity) {
    this.quantity = quantity;
  }
  
  //toString() for Dessert class
  // to string method for dessert class with all instance variables
  public String toString() {
    return "Name: " + name + "\nPrice: " + price + "\nFlavor: " + flavor + "\nQuantity: " + quantity;
  }
  //other methods
}
