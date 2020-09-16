package com.codurance;

public class MarsRover {

  private static final String MOVE_COMMAND = "M";
  private final int x;
  private final int y;
  private final String cardinal;

  public MarsRover(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }

  public String execute(String commands) {
    return "1 2 N";
  }
}
