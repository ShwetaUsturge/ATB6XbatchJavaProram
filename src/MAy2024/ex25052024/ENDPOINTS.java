package MAy2024.ex25052024;


public enum ENDPOINTS {
    Home("https://www.flipkart.com/","homepage"),
    Login("https://www.flipkart.com/account/login?ret=/","Login page"),
    Dashboard("https://www.flipkart.com/plus","dashboard");

    ENDPOINTS(String url, String page) {
        this.url = url;
        this.page = page;
    }

    String url;
    String page;



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
