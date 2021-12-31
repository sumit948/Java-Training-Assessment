package com.example.RestPoc2.Week4.RestPoc2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Dates;
import com.example.RestPoc2.Week4.RestPoc2.Repositorys.DatesRepository;

@Service
public class DateService {
		@Autowired
		private DatesRepository datRepo;

		public Dates create(Dates sf) {
			// TODO Auto-generated method stub
			return datRepo.save(sf);
		}

		public Dates updateCall(Dates sf) {
			// TODO Auto-generated method stub
			return datRepo.save(sf);
		}

		public void deleteCall(Dates sf) {
			// TODO Auto-generated method stub
			datRepo.delete(sf);
		}

		public List<Dates> getCall() {
			// TODO Auto-generated method stub
			return datRepo.findAll();
		}
}
