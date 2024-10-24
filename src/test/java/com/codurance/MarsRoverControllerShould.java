package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.codurance.directions.Direction;
import com.codurance.directions.East;
import com.codurance.directions.North;
import com.codurance.directions.South;
import com.codurance.directions.West;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverControllerShould {

  @ParameterizedTest
  @CsvSource({
      "1, 2, N, M, '1 3 N'",
      "1, 3, N, MM, '1 5 N'",
      "1, 3, N, MMMMM, '1 8 N'",
      "1, 8, S, M, '1 7 S'"
  })
  public void move(int initialX, int initialY, String initialDirection, String commands, String expectedCoordinate) {
    final MarsRoverController rover = new MarsRoverController(new Rover(initialX, initialY, directionFor(initialDirection, 10)));
    String actualCoordinate = rover.execute(commands);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  @ParameterizedTest
  @CsvSource({
      "N, R, E",
      "N, RR, S"
  })
  void turn(String initialCardinal, String commnds, String expectedCardinal) {
    Rover initialRover = new Rover(1, 1, directionFor(initialCardinal, 10));
    MarsRoverController marsRover = new MarsRoverController(initialRover);
    String actualPosition = marsRover.execute(commnds);
    String expectedPosition = "1 1 " + expectedCardinal;

    assertThat(actualPosition, is(expectedPosition));
  }

  @ParameterizedTest
  @CsvSource({
      "1, 2, N, LMLMLMLMM, '1 3 N'"
  })
  void move_and_turn(int initialX, int initialY, String initialCardinal, String commands, String expectedCoordinate) {
    Rover initialRover = new Rover(initialX, initialY, directionFor(initialCardinal, 10));
    MarsRoverController marsRover = new MarsRoverController(initialRover);

    String actualCoordinate = marsRover.execute(commands);
    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  private Direction directionFor(String cardinal, int maxDistance) {
    if (cardinal.equals("N"))
      return new North(maxDistance);
    if (cardinal.equals("E"))
      return new East(maxDistance);
    if (cardinal.equals("S"))
      return new South(maxDistance);
    return new West(maxDistance);

  }
}
