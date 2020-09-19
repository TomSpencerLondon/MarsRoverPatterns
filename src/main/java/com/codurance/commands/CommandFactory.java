package com.codurance.commands;

import com.codurance.Rover;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
  private Rover rover;
  private static final String MOVE = "M";
  private static final String LEFT = "L";
  private static final String RIGHT = "R";
  private static final String EMPTY = "";
  private Map<String, Command> commands;

  public CommandFactory(Rover rover) {
    initializeCommands(rover);
  }

  private void initializeCommands(Rover rover) {
    commands = new HashMap<>(){
      {
        put(MOVE, new MoveCommand(rover));
        put(LEFT, new MoveCommand(rover));
        put(RIGHT, new MoveCommand(rover));
        put(EMPTY, new MoveCommand(rover));
      }
    };
  }

  public Command commandFrom(String command){
    return commands.get(command);
  }
}
