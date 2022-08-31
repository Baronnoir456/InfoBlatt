package com.lars.infoblatt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InfoBlattService {

    private static final Logger LOGGER= LoggerFactory.getLogger(InfoBlattService.class);
    private final InfoBlattRepo infoBlattRepo;


    public InfoBlattService(InfoBlattRepo infoBlattRepo){
        this.infoBlattRepo = infoBlattRepo;
    }


    public void saveInfoblatt(InfoBlatt infoBlatt){
        infoBlattRepo.save(infoBlatt);
        LOGGER.info("folgende person wurde geloggt: "+ infoBlatt.getName()+" "+infoBlatt.getNachname());
    }
    public List<InfoBlatt> showinfoBlatt(){
        return infoBlattRepo.findAll();
    }

    public void deleteInfoBlatt(Long id){
        infoBlattRepo.deleteById(id);
    }
}
