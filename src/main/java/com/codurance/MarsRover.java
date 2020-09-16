package com.codurance;

public class MarsRover {

  private static final String MOVE_COMMAND = "M";
  private int x;
  private int y;
  private final String cardinal;

  public MarsRover(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }

  public String execute(String commands) {
    String[] individualCommands = commands.split("");
    
    for (String command : individualCommands){
      if (command.equals(MOVE_COMMAND))
        if(cardinal.equals("N"))
          y++;
        if (cardinal.equals("S"))
          y--;
    }

    return formatCoordinate();
  }

  private String formatCoordinate() {
    return String.format("%d %d %s", x, y, cardinal);
  }
}
