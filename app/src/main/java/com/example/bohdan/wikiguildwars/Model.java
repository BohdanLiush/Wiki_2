package com.example.bohdan.wikiguildwars;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
  Created by bohdan on 03.04.2018.
 */

public class Model implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("vendor_value")
    @Expose
    private Integer vendorValue;
    @SerializedName("default_skin")
    @Expose
    private Integer defaultSkin;
    @SerializedName("game_types")
    @Expose
    private List<String> gameTypes = null;
    @SerializedName("flags")
    @Expose
    private List<String> flags = null;
    @SerializedName("restrictions")
    @Expose
    private List<Object> restrictions = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("chat_link")
    @Expose
    private String chatLink;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("description")
    @Expose
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Integer getVendorValue() {
        return vendorValue;
    }

    public void setVendorValue(Integer vendorValue) {
        this.vendorValue = vendorValue;
    }

    public Integer getDefaultSkin() {
        return defaultSkin;
    }

    public void setDefaultSkin(Integer defaultSkin) {
        this.defaultSkin = defaultSkin;
    }

    public List<String> getGameTypes() {
        return gameTypes;
    }

    public void setGameTypes(List<String> gameTypes) {
        this.gameTypes = gameTypes;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public List<Object> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Object> restrictions) {
        this.restrictions = restrictions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChatLink() {
        return chatLink;
    }

    public void setChatLink(String chatLink) {
        this.chatLink = chatLink;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
