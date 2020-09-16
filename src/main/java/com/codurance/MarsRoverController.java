package com.codurance;

public class MarsRoverController {

  private Rover rover;
  private final String COORDINATE_FORMAT = "%d %d %s";
  private String MOVE_COMMAND = "M";
  private final String INTO_CHARACTERS = "";

  public MarsRoverController(Rover rover) {
    this.rover = rover;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)){
      if (isMove(command))
        rover = move();
      if (command.equals("R"))
        rover = rover.turn();
    }

    return formatCoordinate();
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
