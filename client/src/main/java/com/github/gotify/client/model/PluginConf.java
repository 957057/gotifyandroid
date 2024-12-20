/*
 * Gotify REST-API.
 * This is the documentation of the Gotify REST-API.  # Authentication In Gotify there are two token types: __clientToken__: a client is something that receives message and manages stuff like creating new tokens or delete messages. (f.ex this token should be used for an android app) __appToken__: an application is something that sends messages (f.ex. this token should be used for a shell script)  The token can be transmitted in a header named `X-Gotify-Key`, in a query parameter named `token` or through a header named `Authorization` with the value prefixed with `Bearer` (Ex. `Bearer randomtoken`). There is also the possibility to authenticate through basic auth, this should only be used for creating a clientToken.  \\---  Found a bug or have some questions? [Create an issue on GitHub](https://github.com/gotify/server/issues)
 *
 * OpenAPI spec version: 2.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.gotify.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Holds information about a plugin instance for one user.
 */
@Schema(description = "Holds information about a plugin instance for one user.")


public class PluginConf {
  @SerializedName("author")
  private String author = null;

  @SerializedName("capabilities")
  private List<String> capabilities = new ArrayList<String>();

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("modulePath")
  private String modulePath = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("website")
  private String website = null;

   /**
   * The author of the plugin.
   * @return author
  **/
  @Schema(example = "jmattheis", description = "The author of the plugin.")
  public String getAuthor() {
    return author;
  }

  public PluginConf capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public PluginConf addCapabilitiesItem(String capabilitiesItem) {
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Capabilities the plugin provides
   * @return capabilities
  **/
  @Schema(example = "[\"webhook\",\"display\"]", required = true, description = "Capabilities the plugin provides")
  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public PluginConf enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the plugin instance is enabled.
   * @return enabled
  **/
  @Schema(example = "true", required = true, description = "Whether the plugin instance is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * The plugin id.
   * @return id
  **/
  @Schema(example = "25", required = true, description = "The plugin id.")
  public Long getId() {
    return id;
  }

   /**
   * The license of the plugin.
   * @return license
  **/
  @Schema(example = "MIT", description = "The license of the plugin.")
  public String getLicense() {
    return license;
  }

   /**
   * The module path of the plugin.
   * @return modulePath
  **/
  @Schema(example = "github.com/gotify/server/plugin/example/echo", required = true, description = "The module path of the plugin.")
  public String getModulePath() {
    return modulePath;
  }

   /**
   * The plugin name.
   * @return name
  **/
  @Schema(example = "RSS poller", required = true, description = "The plugin name.")
  public String getName() {
    return name;
  }

  public PluginConf token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The user name. For login.
   * @return token
  **/
  @Schema(example = "P1234", required = true, description = "The user name. For login.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

   /**
   * The website of the plugin.
   * @return website
  **/
  @Schema(example = "gotify.net", description = "The website of the plugin.")
  public String getWebsite() {
    return website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConf pluginConf = (PluginConf) o;
    return Objects.equals(this.author, pluginConf.author) &&
        Objects.equals(this.capabilities, pluginConf.capabilities) &&
        Objects.equals(this.enabled, pluginConf.enabled) &&
        Objects.equals(this.id, pluginConf.id) &&
        Objects.equals(this.license, pluginConf.license) &&
        Objects.equals(this.modulePath, pluginConf.modulePath) &&
        Objects.equals(this.name, pluginConf.name) &&
        Objects.equals(this.token, pluginConf.token) &&
        Objects.equals(this.website, pluginConf.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, capabilities, enabled, id, license, modulePath, name, token, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConf {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    modulePath: ").append(toIndentedString(modulePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
