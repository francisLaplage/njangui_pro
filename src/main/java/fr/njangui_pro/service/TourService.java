package fr.njangui_pro.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import fr.njangui_pro.entities.Cahier;
import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.entities.Tour;
import fr.njangui_pro.repository.TourRepository;

@Component
public class TourService {
	
	private TourRepository tourRepository;

	public TourService(TourRepository tourRepository) {
		super();
		this.tourRepository = tourRepository;
	}
	
	public List<Tour> getAllTour(){
		return this.tourRepository.findAll();
	}
	
	public Optional<Tour> getOneTour(int id){
		return this.tourRepository.findById(id);
	}
	
	public void deleteTour(Tour tour) {
		this.tourRepository.delete(tour);
	}
	
	public void updateTour(Tour tour) {
		this.tourRepository.save(tour);
	}
	
	public void insertTour(Tour tour) {
		this.tourRepository.save(tour);
	}
	public Date convertStringToDate(String dateIn) {
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd"); 
		Date startDate = null;
		try {
		    startDate = df.parse(dateIn);
		    	    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return startDate;
	}
}
