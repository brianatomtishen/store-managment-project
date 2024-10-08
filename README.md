# store-managment-project

# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![Screenshot 2024-10-02 11 24 52 AM](https://github.com/user-attachments/assets/a2706f0e-5ce1-4260-a067-14ae6747e6d5)

## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is use to output information for your store in the console.

My project created a bakery buisness that sells desserts to the public. It was created using one super class called dessert and two sub classes called Baked Goods and Frozen Treats dividing the desserts being sold into two common groups. I used four instance variables in the super class called name, price, flavor, and quantity. There variables will be used to describe the dessert your purchasing. In the sub class Baked Goods I created the instance variables is Hot and is Fresh to represent whether the item is freshly made and if it is supposed to be hot or cold when served. I created 6 different dessert items in my tester class to represent the different kind of desserts you can buy at my bakery. I named them dessert 1-6 and added arguements to half of the desserts. For dessert 2 I used the values "Brownie", 1.50, "Chocolate", and 5. For dessert 1 since I did not use arguements it defaulted to the values I set in the super classes and sub classes. In my subclasses I used access modifiers to store information about my dessert objects and mutator methods to modify the states of the objects by changing their value. Lastly in my super class and sub classes I was able to use no arguement and arguement constructors to help set values to the different variables.
