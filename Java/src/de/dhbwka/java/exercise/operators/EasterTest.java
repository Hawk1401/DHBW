package de.dhbwka.java.exercise.operators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EasterTest {

  @Test
  void getEaster() {
    assertEquals(20, Easter.GetEaster(1924));
    assertEquals(21, Easter.GetEaster(1935));
    assertEquals(8, Easter.GetEaster(2007));
    assertEquals(21, Easter.GetEaster(2030));
    assertEquals(18, Easter.GetEaster(2060));
    assertEquals(7, Easter.GetEaster(1901));



  }
}