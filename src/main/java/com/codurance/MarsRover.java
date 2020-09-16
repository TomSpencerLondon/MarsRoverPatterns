package com.codurance;

public class MarsRover {

  private static final String NORTH = "N";
  private static final String SOUTH = "S";
  private static final String EAST = "E";
  private static final int RIGHT = 1;
  private Position position;
  private int x;
  private int y;
  private final String cardinal;

  private final int UP = 1;
  private final int DOWN = -1;
  private final String COORDINATE_FORMAT = "%d %d %s";
  private String MOVE_COMMAND = "M";
  private final String INTO_CHARACTERS = "";

  public MarsRover(Position position) {
    this.x = position.x();
    this.y = position.y();
    this.cardinal = position.cardinal();
    this.position = position;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)){
      if (isMove(command))
        move();
      if (command.equals("R"))
        position = new Position(position.x(), position.y(), "E");
    }

    return formatCoordinate();
  }

  private String[] commandsFrom(String input) {
    return input.split(INTO_CHARACTERS);
  }

  private void move() {
    if(facing(NORTH))
      moveVertically(UP);
    if (facing(SOUTH))
      moveVertically(DOWN);
    if (facing(EAST))
      moveHorizontally(RIGHT);
  }

  private void moveHorizontally(int stepSize) {
    position = new Position(position.x() + stepSize, position.y(), position.cardinal());
  }

  private void moveVertically(int stepSize) {
    position = new Position(position.x(), position.y() + stepSize, position.cardinal());
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private String formatCoordinate() {
    return String.format(COORDINATE_FORMAT, position.x(), position.y(), position.cardinal());
  }
}
