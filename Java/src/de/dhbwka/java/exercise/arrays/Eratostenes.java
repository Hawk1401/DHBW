package de.dhbwka.java.exercise.arrays;

import java.util.ArrayList;
import java.util.List;

public class Eratostenes {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      long start = System.currentTimeMillis();

      DoStuff stuff = new DoStuff();
      stuff.start();
      long finish = System.currentTimeMillis();
      stuff.log();
      long timeElapsed = finish - start;
      System.out.println("\n TimeSpand : " + timeElapsed + "ms");
    }
  }
}


class DoStuff {

  int n = 500000;
  int[] sieve = new int[n];
  int[] primes = new int[n];
  int primesIndex = -1;
  int sieveIndex = 2;


  public void start() {
    for (int i = 0; i < sieve.length; i++) {
      sieve[i] = i;
      primes[i] = -1;
    }
    CutTheListInhalf();
    while (!FindLowest()) {
      apllayFilterForEach();
    }
  }

  public void log() {
    for (int i = 0; i < sieve.length; i++) {
      if (primes[i] == -1) {
        return;
      }
      System.out.println(primes[i]);
    }
  }

  public void CutTheListInhalf() {
    int[] Newsieve = new int[(n / 2) + 1];
    List<Integer> myList = new ArrayList<Integer>();

    for (int i = 0; i < sieve.length; i++) {
      if (sieve[i] % 2 == 0) {
        if (sieve[i] != 2) {
          continue;
        }
      }
      myList.add(sieve[i]);
    }
    for (int i = 0; i < Newsieve.length; i++) {
      Newsieve[i] = myList.get(i);
    }
    sieve = Newsieve;
  }

  public boolean FindLowest() {
    for (int i = sieveIndex; i < sieve.length; i++) {
      if (sieve[i] != -1) {
        primesIndex++;
        primes[primesIndex] = sieve[i];
        sieve[i] = -1;
        sieveIndex = i;
        return false;
      }
    }
    return true;
  }

  public void apllayFilterForEach() {
    for (int i = 0; i < sieve.length; i++) {
      if (sieve[i] % primes[primesIndex] == 0) {
        sieve[i] = -1;
      }
    }
  }

  public void apllayFilter() {
    int start = 0;
    for (int i = 0; i < sieve.length; i++) {
      int number = primes[primesIndex] * i;
      if (number > n) {
        return;
      }
      for (int j = start; j < sieve.length; j++) {
        if (sieve[j] == number) {
          sieve[j] = -1;
          start = j;
          break;
        }
      }
    }
  }
}
