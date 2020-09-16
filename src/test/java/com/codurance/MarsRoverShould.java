package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverShould {

  @ParameterizedTest
  @CsvSource({
      "1, 2, N, M, '1 3 N'",
      "1, 3, N, MM, '1 5 N'",
      "1, 3, N, MMMMM, '1 8 N'",
      "1, 8, S, M, '1 7 S'"
  })
  public void move(int initialX, int initialY, String initialCardinal, String commands, String expectedCoordinate) {
    final MarsRover rover = new MarsRover(new Coordinate(initialX, initialY, initialCardinal));
    String actualCoordinate = rover.execute(commands);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }
}
