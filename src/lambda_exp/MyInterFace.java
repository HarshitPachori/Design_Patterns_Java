package lambda_exp;

/**
 * MyInterFace
 */

 // functional interface -> interface having one abstract method and it is used for lamda exp in java

public interface MyInterFace {
  abstract void greet();  // abstract methods are used ?
}

// now we have two choices 
// 1. will create another class implementinmg this interface and then creating object and then calling the greet() method using it  
// 2. will create  anonymous class without creating object of the function