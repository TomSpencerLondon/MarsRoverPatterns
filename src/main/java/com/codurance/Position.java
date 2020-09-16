package com.codurance;

public class Position {

  private final int x;
  private final int y;
  private final String cardinal;

  public Position(int x, int y, String cardinal) {
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

  public String cardinal() {
    return cardinal;
  }

  public Position turn() {
    if (cardinal.equals("N"))
      return new Position(x, y, "E");
    return  new Position(x, y, "S");
  }
}
