package com.codurance;

public class MarsRover {

  private static final String MOVE_COMMAND = "M";
  private static final String NORTH = "N";
  private static final String SOUTH = "S";
  private int x;
  private int y;
  private final String cardinal;

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
      y++;
    if (facing(SOUTH))
      y--;
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private String formatCoordinate() {
    return String.format("%d %d %s", x, y, cardinal);
  }
}
