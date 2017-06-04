package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Irina on 6/2/17.
 */
public class PrimeTests {

  @Test(enabled = false)
  public void testPrime() {

    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test
  public void testNonPrime() {

    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }

  @Test(enabled = false)
  public void testPrimeLong() {

    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }

  @Test
  public void testPrimeFast() {

    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }
}


