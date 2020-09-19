package com.codurance.directions;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class West implements Cardinal {

  @Override
  public Cardinal left() {
    return null;
  }

  @Override
  public Cardinal right() {
    return null;
  }

  @Override
  public String name() {
    return null;
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
