package enums;

public enum FilePath {
    USER_LIST_PATH("data\\User.csv"),
    PRODUCT_LIST_PATH("data\\ProductList.csv");

    private String path;

    private FilePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
