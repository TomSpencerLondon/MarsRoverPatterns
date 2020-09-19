package com.codurance.directions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class EastCardinalShould {

  @Test
  void be_facing_south_when_turned_right() {
    Cardinal result = new East().right();
    assertThat(result, is(new South()));
  }
}
