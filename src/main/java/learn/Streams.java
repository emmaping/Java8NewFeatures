/********************************************************************
 * File Name:    Streams.java
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
import java.util.Collection;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Streams
{
  private enum Status
  {
    OPEN, CLOSED
  };

  private static final class Task
  {
    private final Status status;
    private final Integer points;

    Task(final Status status, final Integer points)
    {
      this.status = status;
      this.points = points;
    }

    public Integer getPoints()
    {
      return points;
    }

    public Status getStatus()
    {
      return status;
    }

    @Override
    public String toString()
    {
      return String.format("[%s, %d]", status, points);
    }
  }

  public static void main(String[] args)
  {
    final Collection<Task> tasks = Arrays.asList(
        new Task(Status.OPEN, 5),
        new Task(Status.OPEN, 13),
        new Task(Status.CLOSED, 8)
        );

    // Calculate total points of all active tasks using sum()
    final long totalPointsOfOpenTasks = tasks
        .stream()
        .filter(e -> e.getStatus() == Status.OPEN)
        .mapToInt(Task::getPoints)
        .sum();

    System.out.println("Total points: " + totalPointsOfOpenTasks);

    final double totalPoints = tasks
        .stream()
        .parallel()
        .filter(e -> e.getStatus() == Status.OPEN)
        .map(task -> task.getPoints()) // or map( Task::getPoints )
        .reduce(0, Integer::sum);

    System.out.println("Total points (all tasks): " + totalPoints);

  }

}
