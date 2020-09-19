package com.codurance;

import com.codurance.directions.Direction;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;

public class Rover {
  private final int x;
  private final int y;
  private final Direction direction;

  public Rover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }


  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public Rover move() {
    return direction.move(x, y);
  }

  public String direction() {
    return direction.name();
  }

  public Rover right(){
    return new Rover(x, y, direction.right());
  }

  public Rover left() {
    return new Rover(x, y, direction.left());
  }
}
