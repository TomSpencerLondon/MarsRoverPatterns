package com.codurance.directions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class EastDirectionShould {

  @Test
  void be_facing_south_when_turned_right() {
    Direction result = new East(10).right();
    assertThat(result, is(new South(10)));
  }

  @Test
  void be_facing_north_when_turned_left() {
    Direction result = new East(10).left();
    assertThat(result, is(new North(10)));
  }
}
