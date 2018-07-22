package qy.stage.bean;

/**
* 文件名：Posts.java
* 功能描述：Posts类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:24
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Posts {
    private long id;
    private long postAuthor;
    private Date postDate;
    private Date postDateGmt;
    private Object postContent;
    private String postTitle;
    private String postExcerpt;
    private String postStatus;
    private String commentStatus;
    private String pingStatus;
    private String postPassword;
    private String postName;
    private String toPing;
    private String pinged;
    private Date postModified;
    private Date postModifiedGmt;
    private Object postContentFiltered;
    private long postParent;
    private String guid;
    private int menuOrder;
    private String postType;
    private String postMimeType;
    private long commentCount;

    public long getId() {
        return id;
    }
	
    public long setId(long id) {
        this.id = id;
    }

    public long getPostAuthor() {
        return postAuthor;
    }
	
    public long setPostAuthor(long postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Date getPostDate() {
        return postDate;
    }
	
    public Date setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Date getPostDateGmt() {
        return postDateGmt;
    }
	
    public Date setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    public Object getPostContent() {
        return postContent;
    }
	
    public Object setPostContent(Object postContent) {
        this.postContent = postContent;
    }

    public String getPostTitle() {
        return postTitle;
    }
	
    public String setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostExcerpt() {
        return postExcerpt;
    }
	
    public String setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    public String getPostStatus() {
        return postStatus;
    }
	
    public String setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getCommentStatus() {
        return commentStatus;
    }
	
    public String setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }
	
    public String setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getPostPassword() {
        return postPassword;
    }
	
    public String setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    public String getPostName() {
        return postName;
    }
	
    public String setPostName(String postName) {
        this.postName = postName;
    }

    public String getToPing() {
        return toPing;
    }
	
    public String setToPing(String toPing) {
        this.toPing = toPing;
    }

    public String getPinged() {
        return pinged;
    }
	
    public String setPinged(String pinged) {
        this.pinged = pinged;
    }

    public Date getPostModified() {
        return postModified;
    }
	
    public Date setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    public Date getPostModifiedGmt() {
        return postModifiedGmt;
    }
	
    public Date setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    public Object getPostContentFiltered() {
        return postContentFiltered;
    }
	
    public Object setPostContentFiltered(Object postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    public long getPostParent() {
        return postParent;
    }
	
    public long setPostParent(long postParent) {
        this.postParent = postParent;
    }

    public String getGuid() {
        return guid;
    }
	
    public String setGuid(String guid) {
        this.guid = guid;
    }

    public int getMenuOrder() {
        return menuOrder;
    }
	
    public int setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getPostType() {
        return postType;
    }
	
    public String setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostMimeType() {
        return postMimeType;
    }
	
    public String setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    public long getCommentCount() {
        return commentCount;
    }
	
    public long setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

}

