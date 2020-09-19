package com.codurance.directions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class NorthDirectionShould {

  @Test
  void be_facing_east_when_turned_right() {
    Direction result = new North().right();
    assertThat(result, is(new East()));
  }

  @Test
  void be_facing_west_when_turned_left() {
    Direction result = new North().left();
    assertThat(result, is(new West()));
  }
}
