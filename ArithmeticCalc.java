package Assignment;
import java.util.Scanner;
class Calculator{
 //initializing datatype of variables
 double number1,number2;
 Calculator(double number1, double number2){
  //this acts as a reference variable
  this.number1=number1;
  this.number2=number2;
 }
  //addition operation
  double add() {
   return number1 + number2;
  }
  //subtraction operation
  double subtract() {
   return number1 - number2;
  }
  //multiply operation
  double multiply() {
   return number1 * number2;
  }
  //division operation
  double division() {
   return number1/number2;
  }
 }
public class ArithmeticCalc {
 public static void main(String[] args) {
  //user input
  Scanner input = new Scanner(System.in);
  while(true) {
  //Getting first input
  System.out.println("Enter the First number: ");
  double number1 = input.nextDouble();
  //Getting second input
  System.out.println("Enter the Second number");
  double number2 = input.nextDouble();
  Calculator calc= new Calculator(number1,number2);
  double result=0;
  //Asks the user what operation to be performed 
  System.out.println("Enter the operator (+,-,*,/): ");
  String operator = input.next();
  switch(operator)
  {
  case "+" :result=calc.add();
      break;
  case "-" :result=calc.subtract();
      break;
  case "*" :result=calc.multiply();
      break;
  case "/" :result=calc.division();
      break;
  default:System.out.println("Invalid Input");
    break;
  }
  //provides output
  System.out.println(number1+operator+number2+"="+result);
 }
 }
}