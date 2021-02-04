package patterns.structural.adapter.practice;

import patterns.structural.adapter.practice.adapters.SquarePegAdapter;
import patterns.structural.adapter.practice.round.RoundHole;
import patterns.structural.adapter.practice.round.RoundPeg;
import patterns.structural.adapter.practice.square.SquarePeg;

/**
 * 1.0v created by wujf on 2021-2-2
 */
public class AdapterDemoClient {
  public static void main(String[] args) {
    RoundHole hole = new RoundHole(5);
    RoundPeg rpeg = new RoundPeg(5);
    if (hole.fits(rpeg)) {
      System.out.println("Round peg r5 fits round hole r5.");
    }

    SquarePeg smallSqPeg = new SquarePeg(2);
    SquarePeg largeSqPeg = new SquarePeg(20);
    // hole.fits(smallSqPeg); // Won't compile.

    // Adapter solves the problem.
    SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
    SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
    if (hole.fits(smallSqPegAdapter)) {
      System.out.println("Square peg w2 fits round hole r5.");
    }
    if (!hole.fits(largeSqPegAdapter)) {
      System.out.println("Square peg w20 does not fit into round hole r5.");
    }
  }
}
