package com.example.nico.esindexer.wsentity;

import java.io.Serializable;
import java.util.Objects;

public class ResultEntity implements Serializable {

    private String id;
    private String url;
    private String type;
    private String is_returned;
    private String t_inserted;
    private String t_updated;
    private String comment_publish;
    private String d_lost;
    private String street;
    private String zip;
    private String city;
    private String region;
    private String country;
    private String geo_lat;
    private String geo_lng;
    private String language;
    private String name;
    private String sex;
    private String fur_size;
    private String fur_drawing;
    private String steril;
    private String tatoo;
    private String tatoo_detail;
    private String chip;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIs_returned() {
        return is_returned;
    }

    public void setIs_returned(String is_returned) {
        this.is_returned = is_returned;
    }

    public String getT_inserted() {
        return t_inserted;
    }

    public void setT_inserted(String t_inserted) {
        this.t_inserted = t_inserted;
    }

    public String getT_updated() {
        return t_updated;
    }

    public void setT_updated(String t_updated) {
        this.t_updated = t_updated;
    }

    public String getComment_publish() {
        return comment_publish;
    }

    public void setComment_publish(String comment_publish) {
        this.comment_publish = comment_publish;
    }

    public String getD_lost() {
        return d_lost;
    }

    public void setD_lost(String d_lost) {
        this.d_lost = d_lost;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGeo_lat() {
        return geo_lat;
    }

    public void setGeo_lat(String geo_lat) {
        this.geo_lat = geo_lat;
    }

    public String getGeo_lng() {
        return geo_lng;
    }

    public void setGeo_lng(String geo_lng) {
        this.geo_lng = geo_lng;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFur_size() {
        return fur_size;
    }

    public void setFur_size(String fur_size) {
        this.fur_size = fur_size;
    }

    public String getFur_drawing() {
        return fur_drawing;
    }

    public void setFur_drawing(String fur_drawing) {
        this.fur_drawing = fur_drawing;
    }

    public String getSteril() {
        return steril;
    }

    public void setSteril(String steril) {
        this.steril = steril;
    }

    public String getTatoo() {
        return tatoo;
    }

    public void setTatoo(String tatoo) {
        this.tatoo = tatoo;
    }

    public String getTatoo_detail() {
        return tatoo_detail;
    }

    public void setTatoo_detail(String tatoo_detail) {
        this.tatoo_detail = tatoo_detail;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultEntity that = (ResultEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", is_returned='" + is_returned + '\'' +
                ", t_inserted='" + t_inserted + '\'' +
                ", t_updated='" + t_updated + '\'' +
                ", comment_publish='" + comment_publish + '\'' +
                ", d_lost='" + d_lost + '\'' +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", geo_lat='" + geo_lat + '\'' +
                ", geo_lng='" + geo_lng + '\'' +
                ", language='" + language + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", fur_size='" + fur_size + '\'' +
                ", fur_drawing='" + fur_drawing + '\'' +
                ", steril='" + steril + '\'' +
                ", tatoo='" + tatoo + '\'' +
                ", tatoo_detail='" + tatoo_detail + '\'' +
                ", chip='" + chip + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
