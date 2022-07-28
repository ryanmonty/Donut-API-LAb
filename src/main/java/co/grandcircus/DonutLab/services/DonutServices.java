package co.grandcircus.DonutLab.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.DonutLab.Models.Donut;
import co.grandcircus.DonutLab.Models.DonutResponse;

@Service
public class DonutServices {
	
	RestTemplate request = new RestTemplate();
	
	public List<Donut> getAllDonuts(){
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		return request.getForObject(url, DonutResponse.class).getResults();
	}
	
	public Donut getDonutId(int id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{id}.json";
		return request.getForObject(url, Donut.class, id);
	}

}
