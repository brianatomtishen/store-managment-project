import java.util.Scanner;

public class BakeryRunner {
  public static void main(String[] args) {

      Dessert dessert1 = new Dessert();
      System.out.println(dessert1);
    
      Dessert dessert2 = new Dessert("Brownie", 1.50, "Chocolate", 5);
      System.out.println(dessert2);

      BakedGoods dessert3 = new BakedGoods();
      System.out.println(dessert3);
    
      BakedGoods dessert4 = new BakedGoods("Croissant", 2.00, "Plain", 2, true, true);
      System.out.println(dessert4);
    
      FrozenTreats dessert5 = new FrozenTreats();
      System.out.println(dessert5);
    
      FrozenTreats dessert6 = new FrozenTreats("Ice Cream", 3.00, "Strawberry", 1, true, "Medium");
      System.out.println(dessert6);

    
  }
}
