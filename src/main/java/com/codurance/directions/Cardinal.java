package com.codurance.directions;
import com.codurance.Rover;

public interface Cardinal {
  Cardinal left();
  Cardinal right();
  Rover move(int x, int y);
  String name();
}
