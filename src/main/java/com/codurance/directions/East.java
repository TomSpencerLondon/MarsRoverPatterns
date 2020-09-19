package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import com.codurance.Rover;

public class East implements Cardinal {
  private String name = "E";
  private final int stepSize = 1;

  @Override
  public Cardinal left() {
    return new North();
  }

  @Override
  public Cardinal right() {
    return new South();
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(x + stepSize, y, this);
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
