package com.example.mongodb.examplemongo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "stat",
        "pagination",
        "monitors"
})
@Builder
public class Example implements Serializable {


    private String id;
    @JsonProperty("stat")
    private String stat;
    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("monitors")
    private List<Monitor> monitors ;

    @JsonProperty("stat")
    public String getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("monitors")
    public List<Monitor> getMonitors() {
        return monitors;
    }

    @JsonProperty("monitors")
    public void setMonitors(List<Monitor> monitors) {
        this.monitors = monitors;
    }




}