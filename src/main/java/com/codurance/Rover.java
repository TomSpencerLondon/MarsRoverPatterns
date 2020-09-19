package com.codurance;

import com.codurance.directions.Cardinal;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;

public class Rover {

  private static final String NORTH = "N";
  private static final String SOUTH = "S";
  private static final String EAST = "E";
  private static final String WEST = "W";
  private static final int RIGHT = 1;
  private static final int LEFT = -1;
  private final int x;
  private final int y;
  private final Cardinal cardinal;
  private final int UP = 1;
  private final int DOWN = -1;

  public Rover(int x, int y, Cardinal cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }


  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public Rover move() {
    return cardinal.move(x, y);
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private Rover moveHorizontally(int stepSize) {
    return new Rover(x + stepSize, y, this.cardinal);
  }

  private Rover moveVertically(int stepSize) {
    return new Rover(x, y + stepSize, this.cardinal);
  }

  public String cardinal() {
    return cardinal.name();
  }

  public Rover turn() {
    if (cardinal.equals(new North()))
      return new Rover(x, y, new East());
    if (cardinal.equals(new East()))
      return new Rover(x, y, new South());
    if (cardinal.equals(new South()))
      return new Rover(x, y, new West());
    if (cardinal.equals(new West()))
      return new Rover(x, y, new North());
    return this;
  }
}
