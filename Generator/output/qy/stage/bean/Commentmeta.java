package qy.stage.bean;

/**
* 文件名：Commentmeta.java
* 功能描述：Commentmeta类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:18
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Commentmeta {
    private long metaId;
    private long commentId;
    private String metaKey;
    private Object metaValue;

    public long getMetaId() {
        return metaId;
    }
	
    public long setMetaId(long metaId) {
        this.metaId = metaId;
    }

    public long getCommentId() {
        return commentId;
    }
	
    public long setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getMetaKey() {
        return metaKey;
    }
	
    public String setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public Object getMetaValue() {
        return metaValue;
    }
	
    public Object setMetaValue(Object metaValue) {
        this.metaValue = metaValue;
    }

}

