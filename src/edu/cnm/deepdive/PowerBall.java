package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class PowerBall {
  private static final int POWER_BALL = 59;
  private static final int MAXIMUM_NUMBER = 37;
  private static final int NUMBER_TO_PICK = 5;
  private static final int NUMBER_OF_TICKETS = 10;
  private static final String PICK_FORMAT =
      "Ticket #%d: %s%n";

    public static void main (String[]args){
      Lottery lotto = new Lottery(MAXIMUM_NUMBER);
      Lottery power = new Lottery(POWER_BALL);
      Random rng = new SecureRandom();
      for (int i = 0; i < NUMBER_OF_TICKETS; i++) {
        int[] pick = lotto.pick(NUMBER_TO_PICK, rng);
        String prettyPick = Arrays.toString(pick);
        System.out.printf(PICK_FORMAT, i + 1, prettyPick);
        int[] pick2 = power.pick(1, rng);
        String uglypick = Arrays.toString(pick2);
        System.out.printf(PICK_FORMAT, i + 1, uglypick);
      }

    }
  }

