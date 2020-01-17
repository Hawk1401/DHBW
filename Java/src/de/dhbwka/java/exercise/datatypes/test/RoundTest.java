package de.dhbwka.java.exercise.datatypes.test;
import static org.junit.jupiter.api.Assertions.*;

import de.dhbwka.java.exercise.datatypes.Round;

class RoundTest {

  @org.junit.jupiter.api.Test
  void round() {
    assertEquals(4, Round.round(3.5));
    assertEquals(4, Round.round(3.6));
    assertEquals(3, Round.round(3.3));
    assertEquals(3, Round.round(3));

    assertEquals(-4, Round.round(-3.5));
    assertEquals(-4, Round.round(-3.6));
    assertEquals(-3, Round.round(-3.3));
    assertEquals(-3, Round.round(-3));
  }
}