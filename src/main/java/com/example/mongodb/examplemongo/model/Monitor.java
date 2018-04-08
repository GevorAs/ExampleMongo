package com.example.mongodb.examplemongo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "friendly_name",
        "url",
        "type",
        "sub_type",
        "keyword_type",
        "keyword_value",
        "http_username",
        "http_password",
        "port",
        "interval",
        "status",
        "ssl",
        "create_datetime"
})
public class Monitor implements Serializable {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("friendly_name")
    private String friendlyName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("sub_type")
    private String subType;
    @JsonProperty("keyword_type")
    private String keywordType;
    @JsonProperty("keyword_value")
    private String keywordValue;
    @JsonProperty("http_username")
    private String httpUsername;
    @JsonProperty("http_password")
    private String httpPassword;
    @JsonProperty("port")
    private String port;
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("ssl")
    private Ssl ssl;
    @JsonProperty("create_datetime")
    private Integer createDatetime;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("friendly_name")
    public String getFriendlyName() {
        return friendlyName;
    }

    @JsonProperty("friendly_name")
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("sub_type")
    public String getSubType() {
        return subType;
    }

    @JsonProperty("sub_type")
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @JsonProperty("keyword_type")
    public String getKeywordType() {
        return keywordType;
    }

    @JsonProperty("keyword_type")
    public void setKeywordType(String keywordType) {
        this.keywordType = keywordType;
    }

    @JsonProperty("keyword_value")
    public String getKeywordValue() {
        return keywordValue;
    }

    @JsonProperty("keyword_value")
    public void setKeywordValue(String keywordValue) {
        this.keywordValue = keywordValue;
    }

    @JsonProperty("http_username")
    public String getHttpUsername() {
        return httpUsername;
    }

    @JsonProperty("http_username")
    public void setHttpUsername(String httpUsername) {
        this.httpUsername = httpUsername;
    }

    @JsonProperty("http_password")
    public String getHttpPassword() {
        return httpPassword;
    }

    @JsonProperty("http_password")
    public void setHttpPassword(String httpPassword) {
        this.httpPassword = httpPassword;
    }

    @JsonProperty("port")
    public String getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(String port) {
        this.port = port;
    }

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("ssl")
    public Ssl getSsl() {
        return ssl;
    }

    @JsonProperty("ssl")
    public void setSsl(Ssl ssl) {
        this.ssl = ssl;
    }

    @JsonProperty("create_datetime")
    public Integer getCreateDatetime() {
        return createDatetime;
    }

    @JsonProperty("create_datetime")
    public void setCreateDatetime(Integer createDatetime) {
        this.createDatetime = createDatetime;
    }

}