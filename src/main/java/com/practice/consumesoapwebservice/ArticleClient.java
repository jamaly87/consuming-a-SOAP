package com.practice.consumesoapwebservice;

import com.practice.consumesoap.stub.GetArticleRequest;
import com.practice.consumesoap.stub.GetArticleResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class ArticleClient extends WebServiceGatewaySupport {
    //Define a method to get an article by providing the article id
    //this method will also implement the JAXB2 Plugin to convert Java Object to xml format
    public GetArticleResponse getArticle(int id) {
        GetArticleRequest getArticleRequest = new GetArticleRequest();
        getArticleRequest.setId(id);
        return (GetArticleResponse) getWebServiceTemplate().marshalSendAndReceive(getArticleRequest);
    }
}
