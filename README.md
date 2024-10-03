# store-managment-project
# Unit 2 - Management Poject

## INTRODUCTION

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## PROJECT REQUIREMENTS

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** - Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** - Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** - Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** - Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** - Write toString() methods in the superclass and subclasses that return information about the state of an object.
## Optional Features
- **Use the this keyword**  - Use the this keyword to refer to the current object's instance variables and/or to call another constructor in the class.
- **(some extra credit) Incorporate user interaction** - Use methods in the Scanner class to obtain user input to interact with your store management system

## Notes: Neighborhood & Painter Class

This project was created on Code.org's JavaLab platform using the built in Neightborhood GUI output. To test and edit this project you must build in Code.org's JavaLab with the Neighborhood GUI enabled. For reference to the Painter class documentation, [you can read more here.](https://studio.code.org/docs/ide/javalab/classes/Painter)

## UML DIAGRAM 

![Screenshot 2024-10-02 11 24 52 AM](https://github.com/user-attachments/assets/a2706f0e-5ce1-4260-a067-14ae6747e6d5)

## Notes: Neighborhood & Painter Class

This project was created on Code.org's JavaLab platform using the built in Neightborhood GUI output. To test and edit this project you must build in Code.org's JavaLab with the Neighborhood GUI enabled. For reference to the Painter class documentation, [you can read more here.](https://studio.code.org/docs/ide/javalab/classes/Painter)

## Reflection

1. Describe your project.

My project created a bakery buisness that sells desserts to the public. It was created using one super class called dessert and two sub classes called Baked Goods and Frozen Treats dividing the desserts being sold into two common groups. I used four instance variables in the super class called name, price, flavor, and quantity. There variables will be used to describe the dessert your purchasing. In the sub class Baked Goods I created the instance variables is Hot and is Fresh to represent whether the item is freshly made and if it is supposed to be hot or cold when served. I created 6 different dessert items in my tester class to represent the different kind of desserts you can buy at my bakery. I named them dessert 1-6 and added arguements to half of the desserts. For dessert 2 I used the values "Brownie", 1.50, "Chocolate", and 5. For dessert 1 since I did not use arguements it defaulted to the values I set in the super classes and sub classes.

2. What are two things about your project that you are proud of?

I am most proud of all of the instance variables and the methods in my program that allow me to add details to what type of dessert they are purchasing such as if it is hot or fresh. This allows customers of my store to know in detail what they are purchasing based on what they want. I also like the format of how my code spits out, and if there are multiple items it seperates the details so you can observe everything you are purchasing at one.

3. Describe something you would improve or do differently if you had an opportunity to change something about your project.

If I had an oppurtunity to do something differently I woulkd love to find a way for people to see the options my bakery serves and be able to select them rather than typing it out. When the dessert item is selected it will spit out the details of the dessert which I believe would be more useful and effective for the user.
