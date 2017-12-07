package example

import org.scalatest.FunSuite

/**
  * Created by Abhinav on 07-Dec-17.
  */
class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    println(s"Testing CubeCalculator....")
    assert(CubeCalculator.cube(3) === 27)
  }
}
