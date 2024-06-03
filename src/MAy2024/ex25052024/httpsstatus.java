package MAy2024.ex25052024;

public class httpsstatus {
    public static void main(String[] args) {
httpcode status= httpcode.Accepted;
//httpcode status= httpcode.Created;
        System.out.println(status.getCode()+"-" +status.getMessage());
    }
}
enum httpcode{
    OK(200,"ok"),
    Created(201,"created"),
    Accepted(202,"Accepted"),
    NO_Content(204,"No -Content"),
    Bad_Requested(400,"Badrequested"),
    Unauthorised(401,"Unauthorised"),
    Forbidden(403,"Forbidden"),
    Not_found(404,"Not found"),
    Internal_Server(500,"InternalServer");

    private int code;
    private String message;

    httpcode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
