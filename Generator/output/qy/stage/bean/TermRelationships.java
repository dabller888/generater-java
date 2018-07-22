package qy.stage.bean;

/**
* 文件名：TermRelationships.java
* 功能描述：TermRelationships类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:26
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class TermRelationships {
    private long objectId;
    private long termTaxonomyId;
    private int termOrder;

    public long getObjectId() {
        return objectId;
    }
	
    public long setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public long getTermTaxonomyId() {
        return termTaxonomyId;
    }
	
    public long setTermTaxonomyId(long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    public int getTermOrder() {
        return termOrder;
    }
	
    public int setTermOrder(int termOrder) {
        this.termOrder = termOrder;
    }

}

