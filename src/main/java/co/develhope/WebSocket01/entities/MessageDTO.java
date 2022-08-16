package co.develhope.WebSocket01.entities;

public class MessageDTO {

    private String type;
    private String message;

    public MessageDTO() {
    }

    public MessageDTO(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setTMessage(String text) {
        this.message = text;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
