package com.codurance;

public class MarsRover {

  private static final String NORTH = "N";
  private static final String SOUTH = "S";
  private int x;
  private int y;
  private final String cardinal;

  private final int UP = 1;
  private final int DOWN = -1;
  private final String COORDINATE_FORMAT = "%d %d %s";
  private String MOVE_COMMAND = "M";

  public MarsRover(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }

  public String execute(String input) {
    String[] commands = input.split("");
    
    for (String command : commands){
      if (isMove(command))
        move();
    }

    return formatCoordinate();
  }

  private void move() {
    if(facing(NORTH))
      moveVertically(UP);
    if (facing(SOUTH))
      moveVertically(DOWN);
  }

  private void moveVertically(int stepSize) {
    y += stepSize;
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private String formatCoordinate() {
    return String.format(COORDINATE_FORMAT, x, y, cardinal);
  }
}
