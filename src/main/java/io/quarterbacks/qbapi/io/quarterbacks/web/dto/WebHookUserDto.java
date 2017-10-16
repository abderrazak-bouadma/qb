package io.quarterbacks.qbapi.io.quarterbacks.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Abderrazak BOUADMA
 * on 15/10/2017.
 */
public class WebHookUserDto {

    private String login;

    private String id;

    @JsonProperty("avatar_url")
    private String avatarUrl;


}
