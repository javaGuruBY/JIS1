package enums;

public enum Category {
    PIZZA("pizza"),
    ICE("ice"),
    BOTTLE("bottle");

    private final String roleCode;

    Category(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleCode() {
        return roleCode;
    }
}
