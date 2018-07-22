package qy.stage.bean;

/**
* 文件名：Usermeta.java
* 功能描述：Usermeta类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:29
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Usermeta {
    private long umetaId;
    private long userId;
    private String metaKey;
    private Object metaValue;

    public long getUmetaId() {
        return umetaId;
    }
	
    public long setUmetaId(long umetaId) {
        this.umetaId = umetaId;
    }

    public long getUserId() {
        return userId;
    }
	
    public long setUserId(long userId) {
        this.userId = userId;
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

