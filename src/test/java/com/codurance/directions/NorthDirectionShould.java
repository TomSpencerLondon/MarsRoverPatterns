package com.codurance.directions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class NorthDirectionShould {

  @Test
  void be_facing_east_when_turned_right() {
    Direction result = new North(10).right();
    assertThat(result, is(new East(10)));
  }

  @Test
  void be_facing_west_when_turned_left() {
    Direction result = new North(10).left();
    assertThat(result, is(new West(10)));
  }
}
