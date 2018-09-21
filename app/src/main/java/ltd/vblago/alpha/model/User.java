package ltd.vblago.alpha.model;

public class User {
    public int id;
    public float longitude;
    public float latitude;
    public int bearing;

    public User(int id, float longitude, float latitude, int bearing) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.bearing = bearing;
    }

    public User() {
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getLongitude() {
        return String.valueOf(longitude);
    }

    public String getLatitude() {
        return String.valueOf(latitude);
    }

    public String getBearing() {
        return String.valueOf(bearing);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setBearing(int bearing) {
        this.bearing = bearing;
    }
}
