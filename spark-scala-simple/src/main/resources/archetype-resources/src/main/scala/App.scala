package ${package}

import org.apache.spark.sql.SparkSession
/**
 * @author ${user.name}
 */
object App {

  def main(args : Array[String]) {
    val spark: SparkSession = SparkSession.builder.getOrCreate()
    val data:Array[Int] = Array(1,2,3,4,5)
    val rdd = spark.sparkContext.parallelize(data)
    println(rdd.take(2))
    println(rdd.map(_*2).take(2))
    spark.stop()          
  }

}
