package com.mitrais.cdc.java;

import java.util.*;
import java.util.concurrent.*;

public class MathUtils {
  private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
  
  /** Make an ordinary (serial) method that, given a boolean[], will loop down the array and mark each
   * entry as true or false, depending on whether that index is prime. For example, array[0] and array[1]
   * should be false (0 and 1 are not prime), array[2] and array[3] should be true (2 and 3 are prime),
   * array[4] should be false (4 is not prime), array[5] should be true (5 is prime), and so forth.
   * Notes:
   * � Use Primes.isPrime(number) to test whether a number is prime. This method is already built in to
   * the Primes class that you copied from the fork-join-exercises project.
   * � To simplify the later parallel version, break your code into two methods, one that takes the whole
   * array and one that takes the array and two indices.
   */
  public static void markPrimesSerial(boolean[] primeFlags, 
                                      int lowerIndex, int upperIndex) {
	  // To Do : One simple line of code that uses Primes.isPrime
  }
  
  /** Marks each entry i with true or false depending on
   *  whether i is prime or not. Serial version that
   *  marks all entries in the array.
   */
  public static void markPrimesSerial(boolean[] primeFlags) {
    markPrimesSerial(primeFlags, 0, primeFlags.length-1);
  }
  
  /** Marks each entry i with true or false depending on
   *  whether i is prime or not. Parallel version that
   *  marks all entries in the array.
   */
  public static void markPrimesParallel(boolean[] primeFlags) {
	  // To Do : create parallel version of mark primes
  }
  
  /** Given an already-marked boolean[] of flags that says
   *  whether each index is prime or not, produces a List
   *  of the primes. Used by both the serial and parallel versions.
   */
  public static List<Integer> collectPrimes(boolean[] primeFlags) {
	  // To Do : collect and return list of marked prime numbers from array
	  return null;
  }
  
  /** Given an unmarked boolean[] of flags, serially marks each one saying
   *  whether the index is prime or not, then passes that array
   *  to collectPrimes to produce a List of primes. The version where
   *  you pass in the array (here) was split into a separate method so that,
   *  for timing purposes, you can separate the time of making the array
   *  from the time of marking it.
   */
  
  public static List<Integer> findPrimesSerial(boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
   return null;
  }
  
  /** Uses findPrimesSerial(booleanArray) to produce a List of primes
   *  less than the given size. */
  
  public static List<Integer> findPrimesSerial(int size) {
	// To Do : collect and return list of marked prime numbers from given only the size
    return null;
  }
  
  /** Given an unmarked boolean[] of flags, marks each one in parallel, saying
   *  whether the index is prime or not, then passes that array
   *  to collectPrimes to produce a List of primes. The version where
   *  you pass in the array (here) was split into a separate method so that,
   *  for timing purposes, you can separate the time of making the array
   *  from the time of marking it.
   */
  
  public static List<Integer> findPrimesParallel(boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
    return null;
  }
  
  /** Uses findPrimesParallel(booleanArray) to produce a List of primes
   *  less than the given size. */
  
  public static List<Integer> findPrimesParallel(int size) {
    // To Do : collect and return list of marked prime numbers from given only the size
    return null;
  }
  
}