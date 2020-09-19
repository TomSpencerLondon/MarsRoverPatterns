package com.codurance.directions;
import com.codurance.Rover;

public interface Direction {
  Direction left();
  Direction right();
  Rover move(int x, int y);
  String name();
}
