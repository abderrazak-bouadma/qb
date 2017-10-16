package io.quarterbacks.qbapi.io.quarterbacks.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by Abderrazak BOUADMA
 * on 15/10/2017.
 */
@Data
public class WebHookIssueDto {

    private String url;

    @JsonProperty("label_url")
    private String labelsUrl;

    @JsonProperty("comments_url")
    private String commentsUrl;

    private String id;

    private String title;

    private WebHookUserDto user;

    private WebHookLabelDto[] labels;

    private String state;

    private String assignee;

    private String milestone;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("closed_at")
    private Date closedAt;

}
