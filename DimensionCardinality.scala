import scala.io.Source



def f[iter](it: Iterator[iter]) = {
  if (it.hasNext) {            
      
        println("csv")

  } else println("data not found")
}

def main(args: Array[String])={
 	val src = Source.fromFile("/home/anushika/Downloads/mywork/Scala_basic/CashExcessDB1107.csv")
	val iter = src.getLines().map(_.split(","))
	f(iter);
}

