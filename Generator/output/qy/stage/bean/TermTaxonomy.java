package qy.stage.bean;

/**
* 文件名：TermTaxonomy.java
* 功能描述：TermTaxonomy类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:27
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class TermTaxonomy {
    private long termTaxonomyId;
    private long termId;
    private String taxonomy;
    private Object description;
    private long parent;
    private long count;

    public long getTermTaxonomyId() {
        return termTaxonomyId;
    }
	
    public long setTermTaxonomyId(long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    public long getTermId() {
        return termId;
    }
	
    public long setTermId(long termId) {
        this.termId = termId;
    }

    public String getTaxonomy() {
        return taxonomy;
    }
	
    public String setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Object getDescription() {
        return description;
    }
	
    public Object setDescription(Object description) {
        this.description = description;
    }

    public long getParent() {
        return parent;
    }
	
    public long setParent(long parent) {
        this.parent = parent;
    }

    public long getCount() {
        return count;
    }
	
    public long setCount(long count) {
        this.count = count;
    }

}

