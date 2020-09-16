package com.codurance;

public class Rover {

  private static final String NORTH = "N";
  private static final String SOUTH = "S";
  private static final String EAST = "E";
  private static final String WEST = "W";
  private static final int RIGHT = 1;
  private static final int LEFT = -1;
  private final int x;
  private final int y;
  private final String cardinal;
  private final int UP = 1;
  private final int DOWN = -1;

  public Rover(int x, int y, String cardinal) {
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
    if (facing(NORTH)) {
      return moveVertically(UP);
    }
    if (facing(SOUTH)) {
      return moveVertically(DOWN);
    }
    if (facing(EAST)) {
      return moveHorizontally(RIGHT);
    }
    if (facing(WEST)) {
      return moveHorizontally(LEFT);
    }
    return this;
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private Rover moveHorizontally(int stepSize) {
    return new Rover(x + stepSize, y, cardinal());
  }

  private Rover moveVertically(int stepSize) {
    return new Rover(x, y + stepSize, cardinal());
  }

  public String cardinal() {
    return cardinal;
  }

  public Rover turn() {
    if (cardinal.equals("N"))
      return new Rover(x, y, "E");
    if (cardinal.equals("E"))
      return new Rover(x, y, "S");
    if (cardinal.equals("S"))
      return new Rover(x, y, "W");
    if (cardinal.equals("W"))
      return new Rover(x, y, "N");
    return this;
  }
}
