package controllers

import play.api._
import play.api.mvc._

/**
 *
 */
object OSM extends Controller {

  def getCapabilities = Action {
    Ok(
      <osm version="0.6" generator="osmserver">
        <api>
            <version minimum="0.6" maximum="0.6"/>
            <area maximum="0.25"/>
            <tracepoints per_page="5000"/>
            <waynodes maximum="2000"/>
            <changesets maximum_elements="50000"/>
            <timeout seconds="300"/>
        </api>
      </osm>
    )
  }


  def getPermissions = Action {
    TODO
  }

  // ==========================================
  // map
  // ==========================================

  def getMap(bbox: String) = Action {
    TODO
  }

  // ==========================================
  // changeset
  // ==========================================
  def createChangeSet() = Action {
    TODO
  }

  def getChangeet(id: Long) = Action {
    TODO
  }

  def uploadChangeSet(id: Long) = Action {
    TODO
  }

  def updateChangeet(id: Long) = Action {
    TODO
  }

  def closeChangeSet(id: Long) = Action {
    TODO
  }

  def downloadChangeSet(id: Long) = Action {
    TODO
  }

  def expandChangeSetBBOX(id: Long) = Action {
    TODO
  }

  def listChangeSetsInBBOX(bbox: String) = Action {
    TODO
  }

  def listChangeSetsForUser(user: String) = Action {
    TODO
  }

  def listChangeSets(time: String) = Action {
    TODO
  }

  def listChangeSetsOpened(open: String) = Action {
    TODO
  }

  def listChangeSetsClosed(closed: String) = Action {
    TODO
  }


  // ==========================================
  // node
  // ==========================================

  def createNode() = Action {
    TODO
  }

  def updateNode(id: Long) = Action {
    TODO
  }

  def removeNode(id: Long) = Action {
    TODO
  }

  def getNode(id: Long) = Action {
    TODO
  }

  def getNodeVersion(id: Long, version: Long) = Action {
    TODO
  }

  def getNodeHistory(id: Long) = Action {
    TODO
  }

  def getNodeRelations(id: Long) = Action {
    TODO
  }

  def getNodeWays(id: Long) = Action {
    TODO
  }

  def getNodes(nodes: String) = Action {
    TODO
  }

  // ==========================================
  // way
  // ==========================================

  def createWay() = Action {
    TODO
  }

  def updateWay(id: Long) = Action {
    TODO
  }

  def removeWay(id: Long) = Action {
    TODO
  }

  def getWay(id: Long) = Action {
    TODO
  }

  def getWayVersion(id: Long, version: Long) = Action {
    TODO
  }

  def getWayHistory(id: Long) = Action {
    TODO
  }

  def getWayRelations(id: Long) = Action {
    TODO
  }

  def getWayFull(id: Long) = Action {
    TODO
  }

  def getWays(ways: String) = Action {
    TODO
  }

  // ==========================================
  // relation
  // ==========================================

  def createRelation() = Action {
    TODO
  }

  def updateRelation(id: Long) = Action {
    TODO
  }

  def removeRelation(id: Long) = Action {
    TODO
  }

  def getRelation(id: Long) = Action {
    TODO
  }

  def getRelationVersion(id: Long, version: Long) = Action {
    TODO
  }

  def getRelationHistory(id: Long) = Action {
    TODO
  }

  def getRelationRelations(id: Long) = Action {
    TODO
  }

  def getRelationFull(id: Long) = Action {
    TODO
  }

  def getRelations(relations: String) = Action {
    TODO
  }

  // ==========================================
  // gpx
  // ==========================================
  def getTrackPoints(bbox: String, page: Int) = Action {
    TODO
  }

  def createGPXFile() = Action {
    TODO
  }

  def getGPXFileDetails(id: Long) = Action {
    TODO
  }

  def getGPXFile(id: Long) = Action {
    TODO
  }


}