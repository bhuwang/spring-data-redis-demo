/**
 * 
 */
package com.springredisdemo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * @author bhuwangautam
 *
 */
@RedisHash("redi::requests")
public class RedisRequestCache {

    @Id
    @Indexed
    private String requestId;
    private String requestMethod;
    private String requestUrl;
    private String payload;
    private Date createAt;
    private Date updatedAt;
    @Indexed
    private Integer isSync;
    private Integer httpErrorCode;
    private String httpErrorMessage;
    private Date erroredAt;
    private String handlerMethod;
    private String handlerUrl;
    @Indexed
    private Integer retryCount;

    RedisRequestCache() {

    }

    public RedisRequestCache(String requestId, String requestMethod, String requestUrl, String payload, Date createAt, Date updatedAt,
            Integer isSync, Integer httpErrorCode, String httpErrorMessage, Date erroredAt, String handlerMethod, String handlerUrl,
            Integer retryCount) {
        this.requestId = requestId;
        this.requestMethod = requestMethod;
        this.requestUrl = requestUrl;
        this.payload = payload;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
        this.isSync = isSync;
        this.httpErrorCode = httpErrorCode;
        this.httpErrorMessage = httpErrorMessage;
        this.erroredAt = erroredAt;
        this.handlerMethod = handlerMethod;
        this.handlerUrl = handlerUrl;
        this.retryCount = retryCount;
    }

    @Override
    public String toString() {
        return "RedisRequestCache [requestId=" + requestId + ", requestMethod=" + requestMethod + ", requestUrl=" + requestUrl
                + ", payload=" + payload + ", createAt=" + createAt + ", updatedAt=" + updatedAt + ", isSync=" + isSync + ", httpErrorCode="
                + httpErrorCode + ", httpErrorMessage=" + httpErrorMessage + ", erroredAt=" + erroredAt + ", handlerMethod=" + handlerMethod
                + ", handlerUrl=" + handlerUrl + ", retryCount=" + retryCount + "]";
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public Integer getHttpErrorCode() {
        return httpErrorCode;
    }

    public void setHttpErrorCode(Integer httpErrorCode) {
        this.httpErrorCode = httpErrorCode;
    }

    public String getHttpErrorMessage() {
        return httpErrorMessage;
    }

    public void setHttpErrorMessage(String httpErrorMessage) {
        this.httpErrorMessage = httpErrorMessage;
    }

    public Date getErroredAt() {
        return erroredAt;
    }

    public void setErroredAt(Date erroredAt) {
        this.erroredAt = erroredAt;
    }

    public String getHandlerMethod() {
        return handlerMethod;
    }

    public void setHandlerMethod(String handlerMethod) {
        this.handlerMethod = handlerMethod;
    }

    public String getHandlerUrl() {
        return handlerUrl;
    }

    public void setHandlerUrl(String handlerUrl) {
        this.handlerUrl = handlerUrl;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

}
