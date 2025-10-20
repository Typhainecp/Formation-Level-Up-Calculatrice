package fr.formation.spring.calculatrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatriceController {

  @Autowired private CalculatriceService calculatriceService;

  @GetMapping("/operation")
  public int operation(Operation operation) {
    return calculatriceService.operation(operation.getNombre1(), operation.getNombre2());
  }

  @GetMapping("/addition")
  public int addition(@RequestParam int number1, @RequestParam int number2) {
    return calculatriceService.addition(number1 , number2);
  }

  @GetMapping("/soustraction")
  public int soustraction() {
    return calculatriceService.soustraction();
  }

  @GetMapping("/multiplication")
  public int multiplication() {
    return calculatriceService.multiplication();
  }

  @GetMapping("/division")
  public int division() {
    return calculatriceService.division();
  }

  @GetMapping("/modulo")
  public int modulo() {
    return calculatriceService.modulo();
  }
}
