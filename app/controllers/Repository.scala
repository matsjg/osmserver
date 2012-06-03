package controllers

/**
 *
*/
import anorm._
import xml.NodeSeq
import play.api.db._
import play.api.Play.current


object Repository {


  def findById(id: Long)  = {
    DB.withConnection { implicit connection =>
      SQL("select * from computer where id = {id}").execute()
    }
  }


}