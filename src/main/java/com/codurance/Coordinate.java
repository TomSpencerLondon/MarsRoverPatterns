package com.codurance;

public class Coordinate {

  private final int x;
  private final int y;
  private final String cardinal;

  public Coordinate(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }


  public int X() {
    return x;
  }

  public int Y() {
    return y;
  }

  public String cardinal() {
    return cardinal;
  }
}
