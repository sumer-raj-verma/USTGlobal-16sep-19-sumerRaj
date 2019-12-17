package com.ustglobal.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibraryResponse;
import com.ustglobal.librarymanagementsystem.dto.LibrerianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;
import com.ustglobal.librarymanagementsystem.service.LibraryService;

@RestController
public class LibraryController {
	@Autowired
	private LibraryService service;
	@Autowired
	private LibraryResponse resp;

	@PostMapping(path="/registerstud",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerStudent(@RequestBody StudentBean bean) {
		if(service.registerStudent(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Student Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Student not register");
		}
		return resp;
	}

	@PostMapping(path="/registerlib",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerLib(@RequestBody LibrerianBean bean) {
		if(service.registerLibrerian(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Librerian Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Librerian not register");
		}
		return resp;
	}

	@PostMapping(path="/addbook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBook(@RequestBody BookBean bean) {
		if(service.addBook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("New Book Added");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Can't add this book");
		}
		return resp;
	}

	@GetMapping(path="/searchbook",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@RequestParam("id")int id) {
		BookBean bean = service.searchBook(id);
		if(bean!=null) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book available");
			resp.setBook(bean);
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book not available");
		}
		return resp;
	}

	@PutMapping(path="/updatebook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody BookBean bean) {
		if(service.updatebook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information update");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book information not update");
		}
		return resp;
	}
	
	@DeleteMapping(path="/delete",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@RequestParam("id")int id) {
		if(service.deletebook(id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information deleted");
		} else {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book not found");
		}
		return resp;
	}
	
	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllBook(){
          LibraryResponse response = new LibraryResponse();
		List< BookBean> beans = service.getAllBook();
		
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("data found to db");
			response.setBookbean(beans);
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found to db");
		}
		return response;
	}
	
	
	@PutMapping(path = "/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse modifyStudent(@RequestBody StudentBean bean) {
		LibraryResponse response = new LibraryResponse();
		if(service.modifyStudent(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("data modified to db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified to db");
		}
		return response;	
	}	
	
	@DeleteMapping(path = "/delete/{id}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteStudent(@PathVariable("id")int id) {
		
		LibraryResponse response = new LibraryResponse();
		if(service.deleteStudent(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("data delete to db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not delete to db");
		}
		return response;
		
	}
	
	
	
}
