package qy.stage.bean;

/**
* 文件名：Links.java
* 功能描述：Links类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:21
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Links {
    private long linkId;
    private String linkUrl;
    private String linkName;
    private String linkImage;
    private String linkTarget;
    private String linkDescription;
    private String linkVisible;
    private long linkOwner;
    private int linkRating;
    private Date linkUpdated;
    private String linkRel;
    private Object linkNotes;
    private String linkRss;

    public long getLinkId() {
        return linkId;
    }
	
    public long setLinkId(long linkId) {
        this.linkId = linkId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
	
    public String setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkName() {
        return linkName;
    }
	
    public String setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkImage() {
        return linkImage;
    }
	
    public String setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getLinkTarget() {
        return linkTarget;
    }
	
    public String setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

    public String getLinkDescription() {
        return linkDescription;
    }
	
    public String setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    public String getLinkVisible() {
        return linkVisible;
    }
	
    public String setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible;
    }

    public long getLinkOwner() {
        return linkOwner;
    }
	
    public long setLinkOwner(long linkOwner) {
        this.linkOwner = linkOwner;
    }

    public int getLinkRating() {
        return linkRating;
    }
	
    public int setLinkRating(int linkRating) {
        this.linkRating = linkRating;
    }

    public Date getLinkUpdated() {
        return linkUpdated;
    }
	
    public Date setLinkUpdated(Date linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    public String getLinkRel() {
        return linkRel;
    }
	
    public String setLinkRel(String linkRel) {
        this.linkRel = linkRel;
    }

    public Object getLinkNotes() {
        return linkNotes;
    }
	
    public Object setLinkNotes(Object linkNotes) {
        this.linkNotes = linkNotes;
    }

    public String getLinkRss() {
        return linkRss;
    }
	
    public String setLinkRss(String linkRss) {
        this.linkRss = linkRss;
    }

}

