package programs.designPattern.structuralDesignPattern.adapterPattern;
/*
interface RestClient {
    String get(String url);
}

class RestTemplateClient implements RestClient {
    private RestTemplate restTemplate = new RestTemplate();

    public String get(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}

public class AdapterForRestApiClient implements RestClient {
    private ExternalApiClient externalApiClient;

    public AdapterForRestApiClient(ExternalApiClient externalApiClient) {
        this.externalApiClient = externalApiClient;
    }

    public String get(String url) {
        return externalApiClient.fetch(url);
    }
}*/
