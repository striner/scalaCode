package striner.studyTrait

object Woman extends Person with Person02 {
  def run: String = "woman run"

  override def eat: String = "woman run"

  def buy(s: String) = s"woman buy $s"
}
