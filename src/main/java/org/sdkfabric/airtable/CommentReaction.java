/**
 * CommentReaction automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.airtable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class CommentReaction {
    private String emoji;
    private CommentAuthor reactingUser;
    @JsonSetter("emoji")
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
    @JsonGetter("emoji")
    public String getEmoji() {
        return this.emoji;
    }
    @JsonSetter("reactingUser")
    public void setReactingUser(CommentAuthor reactingUser) {
        this.reactingUser = reactingUser;
    }
    @JsonGetter("reactingUser")
    public CommentAuthor getReactingUser() {
        return this.reactingUser;
    }
}