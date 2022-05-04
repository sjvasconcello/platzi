// Utils
def getTotal(list: Iterable[Int]) = {
  list.reduce((item, next) => item + next)
}
def getCount(list: Iterable[Int]) = {
  list.fold(0)((item, next) => item + 1)
}
def getMiddle(list: List[Int]) = {
  val middle = getCount(list).toFloat / 2
  if (middle.isValidInt) {
    (list(middle.toInt - 1), list(middle.toInt))
  } else {
    list(middle.floor.toInt)
  }
}
def getFrequency(list: List[Int]) = {
  list.toList.groupMapReduce(identity)(_ => 1)(_ + _)
}

// Controllers

def getAverage(list: Iterable[Int]) = {
  getTotal(list) / getCount(list)
}

def getMedian(list: Iterable[Int]) = {
  getMiddle(list.toList.sorted)
}
def getMode(list: Iterable[Int]) = {
  val frequencyMap = getFrequency(list.toList)
  frequencyMap.filter(item => {
    item._2 == frequencyMap.valuesIterator.max
  })
}

val getMean = getAverage(_)

// View
def getStats(list: Iterable[Int]) = {
  Map(
    ("mean", getMean(list)),
    ("median", getMedian(list)),
    ("mode", getMode(list))
  )
}

// Data
val data = List(100, 2000, 2, 4151, 1515, 3, 3)

// Rendering view
getStats(data)
