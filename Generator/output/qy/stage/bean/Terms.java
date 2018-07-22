package qy.stage.bean;

/**
* 文件名：Terms.java
* 功能描述：Terms类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:28
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Terms {
    private long termId;
    private String name;
    private String slug;
    private long termGroup;

    public long getTermId() {
        return termId;
    }
	
    public long setTermId(long termId) {
        this.termId = termId;
    }

    public String getName() {
        return name;
    }
	
    public String setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }
	
    public String setSlug(String slug) {
        this.slug = slug;
    }

    public long getTermGroup() {
        return termGroup;
    }
	
    public long setTermGroup(long termGroup) {
        this.termGroup = termGroup;
    }

}

