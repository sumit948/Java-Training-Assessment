package com.example.dtoclass.weekfivedtoclass;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AlbumController {
	@Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    //@HystrixCommand(fallbackMethod = "retrierback")
    public List<Album> getAllAlbums() {
        List<Album> albums= restTemplate.getForObject("https://jsonplaceholder.typicode.com/albums", List.class);
 
        return albums;
    }
    public List<Album> retrierback(){
        List<Album> albums=new ArrayList<>();
        albums.add(new Album());
        return albums;
    }
}
