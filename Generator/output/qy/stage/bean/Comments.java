package qy.stage.bean;

/**
* 文件名：Comments.java
* 功能描述：Comments类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:19
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Comments {
    private long commentId;
    private long commentPostId;
    private Object commentAuthor;
    private String commentAuthorEmail;
    private String commentAuthorUrl;
    private String commentAuthorIp;
    private Date commentDate;
    private Date commentDateGmt;
    private String commentContent;
    private int commentKarma;
    private String commentApproved;
    private String commentAgent;
    private String commentType;
    private long commentParent;
    private long userId;

    public long getCommentId() {
        return commentId;
    }
	
    public long setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public long getCommentPostId() {
        return commentPostId;
    }
	
    public long setCommentPostId(long commentPostId) {
        this.commentPostId = commentPostId;
    }

    public Object getCommentAuthor() {
        return commentAuthor;
    }
	
    public Object setCommentAuthor(Object commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }
	
    public String setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }
	
    public String setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }
	
    public String setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp;
    }

    public Date getCommentDate() {
        return commentDate;
    }
	
    public Date setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Date getCommentDateGmt() {
        return commentDateGmt;
    }
	
    public Date setCommentDateGmt(Date commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    public String getCommentContent() {
        return commentContent;
    }
	
    public String setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getCommentKarma() {
        return commentKarma;
    }
	
    public int setCommentKarma(int commentKarma) {
        this.commentKarma = commentKarma;
    }

    public String getCommentApproved() {
        return commentApproved;
    }
	
    public String setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved;
    }

    public String getCommentAgent() {
        return commentAgent;
    }
	
    public String setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent;
    }

    public String getCommentType() {
        return commentType;
    }
	
    public String setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public long getCommentParent() {
        return commentParent;
    }
	
    public long setCommentParent(long commentParent) {
        this.commentParent = commentParent;
    }

    public long getUserId() {
        return userId;
    }
	
    public long setUserId(long userId) {
        this.userId = userId;
    }

}

