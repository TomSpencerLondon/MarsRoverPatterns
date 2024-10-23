package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class South implements Direction {
  private final int maxDistance;
  String name = "S";
  private final int stepWise = -1;

  public South(int maxDistance) {
    this.maxDistance = maxDistance;
  }

  @Override
  public Direction left() {
    return new East(10);
  }

  @Override
  public Direction right() {
    return new West(10);
  }

  @Override
  public Rover move(int x, int y) {

    return new Rover(x,
            (y > 0) ? y + stepWise :
            this.maxDistance + stepWise,
            this);
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
