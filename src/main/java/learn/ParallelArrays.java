/********************************************************************
 * File Name:    ParallelArrays.java
 *
 * Date Created: 2015年3月2日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package learn;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ParallelArrays
{
  public static void main(String[] args)
  {
    long[] arrayOfLong = new long[200];

    Arrays.parallelSetAll(arrayOfLong,
        index -> ThreadLocalRandom.current().nextInt(1000000));
    Arrays.stream(arrayOfLong).forEach(
        i -> System.out.print(i + " "));
    System.out.println();

    Arrays.parallelSort(arrayOfLong);
    Arrays.stream(arrayOfLong).forEach(
        i -> System.out.print(i + " "));
    System.out.println();
  }

}
