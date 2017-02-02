package co.cmunoz.geofencesdemo

import java.util.*

/**
 * Constants class

 * User: cmunoz
 * Date: 2/1/17
 * Time: 10:49 AM
 */

object Constants {

  val GEOFENCE_EXPIRATION_IN_MILLISECONDS = (12 * 60 * 60 * 1000).toLong()
  val GEOFENCE_RADIUS_IN_METERS = 40f

  val LANDMARKS = HashMap<String, LatLng>()

  init {
    // Ruta N
    LANDMARKS.put("Ruta N", LatLng(6.265439, -75.566905))
    // Juan Valdez
    LANDMARKS.put("Juan Valdez CC Aventura", LatLng(6.263983, -75.566887))
  }


}

data class LatLng (val latitude: Double, val longitude: Double)
