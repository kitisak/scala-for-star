package exercises

object FunWithLists {

  def labels(ls: List[Game]) = Nil

  def totalRatingsOf(ls: List[Game]):Int = 0

  def averageRatingsOf(l:String,  ls:List[Game]) = 0

  def totalRatingsOfLabel(label: String, list: List[Game]):Int = 0

  def increaseRatingBy(inc: Int, ls: List[Game]) = Nil

  def decreaseRatingBy(i: Int, s: String, list: List[Game]) = Nil

  def createFunctionToFindGamesByLabel(label: String):(List[Game]) => List[Game] = identity(_)

}
