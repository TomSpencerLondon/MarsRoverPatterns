package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class West implements Cardinal {

  String name = "W";
  private final int stepWise = -1;

  @Override
  public Cardinal left() {
    return new South();
  }

  @Override
  public Cardinal right() {
    return new North();
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(x + stepWise, y, this);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    return reflectionEquals(this, other);
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
}
