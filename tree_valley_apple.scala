//1
package com.fashlooks

import scala.collection.mutable.ArrayBuffer

object PersonalStylingService {

  //2
  def main(args: Array[String]): Unit = {

    //3
    //Initialization of the styling service
    val stylingService = new PersonalStylingService

    //4
    //Adding all the styling services to the array buffer
    val stylingOptions = ArrayBuffer[String]()
    stylingOptions += "Fashion Advice"
    stylingOptions += "Wardrobe Planning"
    stylingOptions += "Color Palette Selection"
    stylingOptions += "Style Shopping"
    stylingOptions += "Outfit Styling"
    stylingOptions += "Personal Shopping"

    //5
    //Registering the styling options with the styling service
    stylingService.registerStylingOptions(stylingOptions.toArray)

    //6
    //Setting up the styling service for the customer
    stylingService.setup()

    //7
    //Generating a styling report for the customer
    val stylingReport = stylingService.generateStylingReport()

    //8
    //Printing the styling report for the customer
    stylingService.printStylingReport(stylingReport)

  }

}

//9
class PersonalStylingService {

  //10
  var stylingOptions: Array[String] = Array()

  //11
  def registerStylingOptions(stylingOptions: Array[String]): Unit = {
    this.stylingOptions = stylingOptions
  }

  //12
  def setup(): Unit = {
    // Setup the styling service for the customer
  }

  //13
  def generateStylingReport(): String = {
    // Generate a styling report for the customer
    "This is a sample styling report"
  }

  //14
  def printStylingReport(stylingReport: String): Unit = {
    println(stylingReport)
  }

}