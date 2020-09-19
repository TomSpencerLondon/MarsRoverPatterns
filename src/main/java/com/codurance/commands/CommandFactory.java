package com.codurance.commands;

import com.codurance.Rover;

public class CommandFactory {
  private Rover rover;

  public CommandFactory(Rover rover) {
    this.rover = rover;
  }

  public Command commandFrom(String command){
    if (command.equals("M")){
      return new MoveCommand(rover);
    }
    if (command.equals("R")){
      return new TurnRightCommand(rover);
    }
    if (command.equals("L")){
      return new TurnLeftCommand(rover);
    }
    throw new UnsupportedOperationException("Situation not implemented");
  }
}
