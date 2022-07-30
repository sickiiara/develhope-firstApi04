package co.develhope.FirstApi04.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;


@RestController
public class HeaderController{

    @GetMapping("/headers")
    public ResponseEntity<String> headers (@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        String url = "http://" + host.getHostName() + ":" + host.getPort();
        return new ResponseEntity<>(String.format("URL = " + url), HttpStatus.OK);
    }
}