public enum Role {
    ADMIN("Администратор", "https://"),
    USER("Пользователь", "https://web-for-user"),
    TEEN("Подросток", "https://web-for-teen");
    private String russianName;
    private String accessToSiteStartedWith;

    Role(String accessToSiteStartedWith) {
        this.accessToSiteStartedWith = accessToSiteStartedWith;
    }

    Role(String russianName, String accessToSiteStartedWith) {
        this.russianName = russianName;
        this.accessToSiteStartedWith = accessToSiteStartedWith;
    }

    public String getRussianName() {
        return russianName;
    }

    public String getAccessToSiteStartedWith() {
        return accessToSiteStartedWith;
    }
}
