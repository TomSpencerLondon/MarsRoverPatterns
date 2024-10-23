package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class North implements Direction {
  private final int maxDistance;
  private String name = "N";
  private final int stepWise = 1;

  public North(int maxDistance) {
    this.maxDistance = maxDistance;
  }

  @Override
  public Direction left() {
    return new West(this.maxDistance);
  }

  @Override
  public Direction right() {
    return new East(10);
  }

  @Override
  public Rover move(int x, int y) {

    return new Rover(x,
            (y + stepWise) % this.maxDistance,
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
