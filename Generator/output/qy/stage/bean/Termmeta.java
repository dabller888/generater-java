package qy.stage.bean;

/**
* 文件名：Termmeta.java
* 功能描述：Termmeta类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:27
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Termmeta {
    private long metaId;
    private long termId;
    private String metaKey;
    private Object metaValue;

    public long getMetaId() {
        return metaId;
    }
	
    public long setMetaId(long metaId) {
        this.metaId = metaId;
    }

    public long getTermId() {
        return termId;
    }
	
    public long setTermId(long termId) {
        this.termId = termId;
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

