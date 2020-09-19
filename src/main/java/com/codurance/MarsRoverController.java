package com.codurance;

public class MarsRoverController {

  private Rover rover;
  private final String COORDINATE_FORMAT = "%d %d %s";
  private final String MOVE_COMMAND = "M";
  private final String INTO_CHARACTERS = "";
  private final String RIGHT_COMMAND = "R";
  private final String LEFT_COMMAND = "L";

  public MarsRoverController(Rover rover) {
    this.rover = rover;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)){
      if (isMove(command))
        rover = move();
      if (isTurn(command))
        rover = rover.turn();
    }

    return formatCoordinate();
  }

  private boolean isTurn(String command) {
    return RIGHT_COMMAND.equals(command) || LEFT_COMMAND.equals(command);
  }

  private String[] commandsFrom(String input) {
    return input.split(INTO_CHARACTERS);
  }

  private Rover move() {
    return this.rover.move();
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private String formatCoordinate() {
    return String.format(COORDINATE_FORMAT, rover.x(), rover.y(), rover.cardinal());
  }
}
