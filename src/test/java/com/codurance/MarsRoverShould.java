package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverShould {

  @ParameterizedTest
  @CsvSource({
      "1, 2, N, '1 2 N'",
      "1, 3, N, '1 3 N'"
  })
  public void return_initial_position_of_rover_without_any_command(int initialX, int initialY, String initialCardinal, String expectedCoordinate) {
    final String emptyCommand = "";

    assertThat(new MarsRover(initialX,initialY,initialCardinal).execute(emptyCommand), is(expectedCoordinate));
  }
}
