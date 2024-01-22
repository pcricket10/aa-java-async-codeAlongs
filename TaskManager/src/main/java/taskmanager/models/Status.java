package taskmanager.models;

public enum Status {
    TODO("To do"),
    IN_PROGRESS("In_progress"),
    COMPLETE("Complete");

    private String displayText;

    public String getDisplayText() {
        return displayText;
    }

    Status(String displayText){
        this.displayText = displayText;
    }
}
