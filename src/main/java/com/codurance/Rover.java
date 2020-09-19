package com.codurance;

import com.codurance.directions.Direction;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;

public class Rover {
  private final int x;
  private final int y;
  private final Direction direction;

  public Rover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }


  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public Rover move() {
    return direction.move(x, y);
  }

  public String cardinal() {
    return direction.name();
  }

  public Rover turn() {
    if (direction.equals(new North()))
      return new Rover(x, y, new East());
    if (direction.equals(new East()))
      return new Rover(x, y, new South());
    if (direction.equals(new South()))
      return new Rover(x, y, new West());
    if (direction.equals(new West()))
      return new Rover(x, y, new North());
    return this;
  }
}
