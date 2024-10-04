public class BakedGoods extends Dessert {
  //instance variables for BakedGoods class
  //sets up variables for the sub class BakedGoods by giving them a data type and a classified name
    public boolean isHot;
    public boolean isFresh;
  
  //no arguement constructors for BakedGoods
  // sets up default values for the instance variables by setting them equal to a value equivalent
  //to the data type set in lines 4-5
    public BakedGoods() {
      this.isHot = true;
      this.isFresh = true;
    }
  
  //constructors w./ arguements for BakedGoods class
  //this constructor allows the objects being called in the tester class to have values assigned
  // to each instance variable. It does this by defining specific arguements to initialize the object.
   public BakedGoods(String name, double price, String flavor, int quantity, boolean isHot, boolean isFresh) {
      super(name, price, flavor, quantity);
      this.isHot = isHot;
      this.isFresh = isFresh;
  }
  
  //accessor and mutator methods
  //the accessor methods return the value of an instance variable.
  //the mutator method used to modify the state of an object by changing the value.

  //accessor method for BakedGoods class just isHot
    public boolean getIsHot() {
      return isHot;
    }

  //accessor method for BakedGoods class just isFresh
    public boolean getIsFresh() {
      return isFresh;
    }

  //mutator method for BakedGoods class just isHot
    public void setIsHot (boolean isHot) {
      this.isHot = isHot;
    }

  //mutator method for BakedGoods class just isFresh
    public void setIsFresh (boolean isFresh) {
      this.isFresh = isFresh;
    }
  
  //toString() method for BakedGoods class
  // to string method for BakedGoods super keyword and isHot/isFresh instance variables
     public String toString() {
      return super.toString() + "\nIs it hot? : " + isHot + "\nIs it fresh? " + isFresh + "\n";
  }
}
