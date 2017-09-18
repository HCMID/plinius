import java.io.File
import scala.io.Source
// Run this script from root directory of repository.

// get files in images directory.
// display with thumbnails.
//
val width = 100
val thumb = "http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/deepzoom/${namespace}/${collection}/${version}/${image}.tif&WID=&${width}CVT=JPEG"


def listFiles(dir: String): Vector[File] = {
  val d = new File(dir)
  if (d.exists && d.isDirectory) {
    val realFiles =  d.listFiles.filter(_.isFile).toVector
    realFiles.filter(_.getName.matches(".+cex"))
  } else {
      Vector[File]()
  }
}




val fList = listFiles("images")

for (f <- fList) {
  val base = f.getName.replaceAll(".cex", "")

  val lines = Source.fromFile(f).getLines.toVector.drop(1)
  println(base + " has " + lines.size + "images")
  
}
