public class Main {

  public static void main(String[] args) {
    // Primitive Data Types
    // Strings
    String name = "João Paulo";
    System.out.println("Hello, " + name + "!");
    System.out.println("========================");

    // Numbers
    int a = 3;
    int b = 2;
    int sum = a + b;
    int sub = a - b;
    int multi = a * b;
    int div = a / b;
    System.out.println(sum);
    System.out.println(sub);
    System.out.println(multi);
    System.out.println(div);
    System.out.println("========================");

    // Booleans and Logical Operators
    boolean weekend = true;
    boolean sun = true;
    boolean goingToBeach = weekend && sun;
    System.out.println("É final de semana? " + goingToBeach);
    System.out.println("========================");
    String message = weekend ? "É fim de semana" : "Não é fim de semana";
    System.out.println(message);
    System.out.println("========================");

    // Flow Control
    // Conditional
    int score = 100;
    if (score >= 70) {
      System.out.println("Aluno aprovado!");
    } else {
      System.out.println("Aluno reprovado!");
    }
    System.out.println("========================");
    // Score grade
    // A -> 80; B -> 70; C -> 60; D -> 0
    if (score >= 80) {
      System.out.println("Graduação A");
    } else if (score < 80 && score >= 70) {
      System.out.println("Graduação B");
    } else if (score < 70 && score >= 60) {
      System.out.println("Graduação C");
    } else if (score < 60 && score >= 0) {
      System.out.println("Graduação D");
    } else {
      System.out.println("Nota Inválida");
    }
    System.out.println("========================");

    // Check Approved or Reproved
    String grade;
    if (score >= 80) {
      grade = "A";
    } else if (score < 80 && score >= 70) {
      grade = "B";
    } else if (score < 70 && score >= 60) {
      grade = "C";
    } else if (score < 60 && score >= 0) {
      grade = "D";
    } else {
      grade = "-";
    }

    System.out.println("Graduação atribuída: " + grade);
    System.out.println("========================");

    // Switch
    switch (grade) {
      case "A":
      case "B":
        System.out.println("Aluno Aprovado!");
        break;
      case "C":
      case "D":
        System.out.println("Aluno Reprovado");
        break;
      default:
        System.out.println("Graduação Inválida");
        break;
    }
    System.out.println("========================");


  }
}