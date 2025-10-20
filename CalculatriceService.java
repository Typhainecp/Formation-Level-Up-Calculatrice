package fr.formation.spring.calculatrice;

import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {

  public int operation(int nombre1, int nombre2) {
    return nombre1 + nombre2;
  }

  public int addition(int number1, int number2) {
    return number1 + number2;
  }

  public int soustraction() {
    int number1 = 2;
    int number2 = 3;
    return number1 - number2;
  }

  public int multiplication() {
    int number1 = 2;
    int number2 = 3;
    return number1 * number2;
  }

  public int division() {
    int number1 = 2;
    int number2 = 3;
    return number2 / number1;
  }

  public int modulo() {
    int number1 = 2;
    int number2 = 3;
    return number1 % number2;
  }
}
