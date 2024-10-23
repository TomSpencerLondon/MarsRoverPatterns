package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class West implements Direction {

  private final int maxDistance;
  String name = "W";
  private final int stepWise = -1;

  public West(int maxDistance) {
    this.maxDistance = maxDistance;
  }

  @Override
  public Direction left() {
    return new South(this.maxDistance);
  }

  @Override
  public Direction right() {
    return new North(this.maxDistance);
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(
            (x > 0) ? x + stepWise :
                    this.maxDistance + stepWise,
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
