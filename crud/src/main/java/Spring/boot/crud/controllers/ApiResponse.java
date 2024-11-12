package Spring.boot.crud.controllers;

public class ApiResponse {
    private int status;   // for http status code
    private String message;   // for message to be displayed to user
    private Object data;  //its employee data
    private int Page;
    private int TotalPages;
    private long TotalElements;

    

    
    
    public ApiResponse(int status, String message, Object data, int page, int totalPages, long totalElements) {
        this.status = status;
        this.message = message;
        this.data = data;
        Page = page;
        TotalPages = totalPages;
        TotalElements = totalElements;
    }

    public ApiResponse(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.Page = 0;
        this.TotalPages = 0;
        this.TotalElements = 1;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public int getPage() {
        return Page;
    }


    public void setPage(int page) {
        Page = page;
    }


    public int getTotalPages() {
        return TotalPages;
    }


    public void setTotalPages(int totalPages) {
        TotalPages = totalPages;
    }


    public long getTotalElements() {
        return TotalElements;
    }


    public void setTotalElements(int totalElements) {
        TotalElements = totalElements;
    }


}
