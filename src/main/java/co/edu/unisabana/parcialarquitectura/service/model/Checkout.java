package co.edu.unisabana.parcialarquitectura.service.model;


import lombok.Data;

@Data
public class Checkout {

  private final String facility;

  private final String driver;

  private final int dayOfMonth;
}
