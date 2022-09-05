import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

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

    // Strings and Dates
    String username = "João Paulo";
    System.out.println(username.toUpperCase());
    System.out.println(username.toLowerCase());
    System.out.println(username.length());

    String newUsername = "João paulo";
    System.out.println("Case Sensitive: " + username.equals(newUsername));
    System.out.println("Case Insensitive: " +
        username.equalsIgnoreCase(newUsername));

    LocalDate today = LocalDate.now();
    Locale brazilLocale = new Locale("pt", "BR");
    System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL,
        brazilLocale));

    String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL,
        brazilLocale);
    String greeting;

    LocalDateTime now = LocalDateTime.now();
    if (now.getHour() >= 0 && now.getHour() < 12) {
      greeting = "Bom dia!";
    } else if (now.getHour() >= 12 && now.getHour() < 18) {
      greeting = "Boa tarde!";
    } else if (now.getHour() >= 18 && now.getHour() < 24) {
      greeting = "Boa noite!";
    } else {
      greeting = "Olá!";
    }

    System.out.printf("Olá, %s! Hoje é %s, %s%n", username, dayOfWeek,
        greeting.toUpperCase());

    // Laços Numéricos
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(j + " x " + i + " = " + (j * i));
      }
      System.out.println(" ");
    }

    // Vetores
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;

    for (int k = 0; k < numbers.length; k++) {
      System.out.println(numbers[k]);
    }

    System.out.println(Arrays.toString(numbers));

    int[] randomNumbers = { 9, 10, 12, 25, 2 };
    int maxNumber = randomNumbers[0];
    int minNumber = randomNumbers[0];
    int averageNumber = 0;

    for (int l = 0; l < randomNumbers.length; l++) {
      // Verifica o maior número do array
      if (randomNumbers[l] > maxNumber) {
        maxNumber = randomNumbers[l];
      }
      // Verifica o menor número do array
      if (randomNumbers[l] < minNumber) {
        minNumber = randomNumbers[l];
      }
      // Calcula a média
      averageNumber += randomNumbers[l];
    }
    System.out.println("Maior: " + maxNumber);
    System.out.println("Menor: " + minNumber);
    System.out.println("Média: " + averageNumber / randomNumbers.length);

    // Functions
    greeting("João Paulo");
    int sumResult = sum(2, 3);
    System.out.println(sumResult);

  }

  public static void greeting(String name) {
    System.out.println("Hello, " + name);
  }

  public static int sum(int a, int b) {
    return a + b;
  }
}