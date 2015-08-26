import scala.util.Sorting._

package euler {
  object Euler022 {
    val nameArray = scala.io.Source.fromFile("p022_names.txt").getLines.toList.head.replaceAll("\"","").split(",").sorted

    def run_problem() {
      println(nameArray)
    }
  }
}
