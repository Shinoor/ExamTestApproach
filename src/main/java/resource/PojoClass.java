package resource;

public class PojoClass {
    private String name;
    private String description;
    private String OrderNumber;
    private String Level;
    private String Code;
    private String Description;
    private String ItemIncludes;
    private  String ReferenceToIsicRev4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemIncludes() {
        return ItemIncludes;
    }

    public void setItemIncludes(String itemIncludes) {
        ItemIncludes = itemIncludes;
    }

    public String getReferenceToIsicRev4() {
        return ReferenceToIsicRev4;
    }

    public void setReferenceToIsicRev4(String referenceToIsicRev4) {
        ReferenceToIsicRev4 = referenceToIsicRev4;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}
