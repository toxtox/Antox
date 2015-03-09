package im.tox.antox.utils

import java.sql.Timestamp

import im.tox.tox4j.core.enums.ToxStatus

//remove if not needed

class LeftPaneItem(
  val viewType: Int,
  val key: String,
  val first: String,
  val second: String,
  val isOnline: Boolean,
  val status: ToxStatus,
  val count: Int,
  val timestamp: Timestamp) {

  def this(
    key: String,
    first: String,
    second: String,
    isOnline: Boolean,
    status: ToxStatus,
    count: Int,
    timestamp: Timestamp) = this(Constants.TYPE_FRIEND, key, first, second, isOnline, status, count, timestamp)

  def this(header: String) = this(Constants.TYPE_HEADER, "", header, null, false, null, 0, null)

  def this(viewType: Int, key: String, message: String) = this(viewType, key, key, message, false, null, 0, null)

}
