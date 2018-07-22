package qy.stage.bean;

/**
* 文件名：Options.java
* 功能描述：Options类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:23
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Options {
    private long optionId;
    private String optionName;
    private Object optionValue;
    private String autoload;

    public long getOptionId() {
        return optionId;
    }
	
    public long setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }
	
    public String setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Object getOptionValue() {
        return optionValue;
    }
	
    public Object setOptionValue(Object optionValue) {
        this.optionValue = optionValue;
    }

    public String getAutoload() {
        return autoload;
    }
	
    public String setAutoload(String autoload) {
        this.autoload = autoload;
    }

}

