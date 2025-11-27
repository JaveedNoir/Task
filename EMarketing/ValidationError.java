package EMarketing;

public class ValidationError {
    String message;
    String field;

    public ValidationError(String message, String field) {
        this.message = message;
        this.field = field;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "ValidationError{" +
                "message='" + message + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
