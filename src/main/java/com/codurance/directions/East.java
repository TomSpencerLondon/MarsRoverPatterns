package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class East implements Direction {
  private final int maxDistance;
  private String name = "E";
  private final int stepSize = 1;

  public East(int maxDistance) {
    this.maxDistance = maxDistance;
  }

  @Override
  public Direction left() {
    return new North(this.maxDistance);
  }

  @Override
  public Direction right() {
    return new South(this.maxDistance);
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(
            (x + stepSize) % this.maxDistance,
            y, this);
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
