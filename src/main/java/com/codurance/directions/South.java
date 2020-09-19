package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class South implements Direction {
  String name = "S";
  private final int stepWise = -1;

  @Override
  public Direction left() {
    return new East();
  }

  @Override
  public Direction right() {
    return new West();
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(x, y + stepWise, this);
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
