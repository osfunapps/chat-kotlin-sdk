package chat.rocket.core.model.attachment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005\u00a8\u0006\u0014"}, d2 = {"Lchat/rocket/core/model/attachment/FileAttachment;", "Lchat/rocket/core/model/attachment/Attachment;", "description", "", "getDescription", "()Ljava/lang/String;", "size", "", "getSize", "()Ljava/lang/Long;", "title", "getTitle", "titleLink", "getTitleLink", "titleLinkDownload", "", "getTitleLinkDownload", "()Ljava/lang/Boolean;", "type", "getType", "core"})
public abstract interface FileAttachment extends chat.rocket.core.model.attachment.Attachment {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getTitle();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getDescription();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getTitleLink();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean getTitleLinkDownload();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getType();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getSize();
}