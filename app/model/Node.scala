package model


import java.util.Date

/**
 * Created by IntelliJ IDEA.
 * User: ponr
 * Date: 2012-06-02
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */

case class Node (
  id: Long,
  version: Long,
  timestamp: Date,
  changesetId: Long,
  latitude: Int,
  longitude: Int,
  tile: Long,
  visible: Boolean,
  tags: Seq[Tag]

)

