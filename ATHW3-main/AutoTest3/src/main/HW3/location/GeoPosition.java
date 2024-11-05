public class GeoPosition {

    @JsonProperty("Latitude")
    private Double latitude;
    @JsonProperty("Longitude")
    private Double longitude;
    @JsonProperty("Elevation")
    private Elevation elevation;

    @JsonProperty("Latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("Longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("Elevation")
    public Elevation getElevation() {
        return elevation;
    }

    @JsonProperty("Elevation")
    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
    }

}