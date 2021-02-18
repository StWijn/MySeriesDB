package com.stwijn.myseriesdb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stwijn.myseriesdb.dao.SeriesDAO;
import com.stwijn.myseriesdb.entity.Series;

@Controller
public class MySeriesDbController {

	@Autowired // DI
	private SeriesDAO seriesDAO;

	@RequestMapping("/")
	public String getMySeries(Model theModel) {

		List<Series> mySeries = seriesDAO.getMySeries();

		theModel.addAttribute("mySeries", mySeries);

		return "overview";
	}
	
	
	@GetMapping("/addSerie")
	public String addSerie(Model theModel) {		
		
		//nieuw Serie object meegeven aan model om te bewerken in form
		Series mySerie = new Series();
		
		theModel.addAttribute("serie", mySerie);
		return "form";
		
	}
	
	@PostMapping("/saveSerie")
	public String saveSerie(@Valid @ModelAttribute("serie") Series mySerie, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "form";
		}
		//bewerkt Serie object opslaan via dao
		seriesDAO.saveSerie(mySerie);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/return")
	public String returnHome() {
				
		return "redirect:/";
		
	}
	
	
	@GetMapping("/update")
	public String updateSerie(@RequestParam("serieId") int id, Model theModel) {
		
		Series mySerie = seriesDAO.getSerie(id);
		
		// Prepopulating form met opgehaalde serie object
		theModel.addAttribute("serie", mySerie);
		
		return "form";	
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("serieId") int id) {
		
		seriesDAO.deleteSerie(id);
		
		return "redirect:/";
	}
	
}
