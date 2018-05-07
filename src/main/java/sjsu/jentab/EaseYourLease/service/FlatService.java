package sjsu.jentab.EaseYourLease.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjsu.jentab.EaseYourLease.dao.impl.ApartmentDAOImpl;
import sjsu.jentab.EaseYourLease.dao.impl.FlatDAOImpl;
import sjsu.jentab.EaseYourLease.model.Apartment;
import sjsu.jentab.EaseYourLease.model.Flat;

import java.util.List;

@Service
public class FlatService {

    @Autowired
    private FlatDAOImpl flatDAO;

    public List<Flat> flatslist(Integer apartmentId) {
        return flatDAO.flatslist(apartmentId);
    }

    public String flatSave(Flat flat) {
        flat.setAvailability("true");
        return flatDAO.addorUpdateFlat(flat);
    }

    public Flat getFlatbyid(Integer id){
        return flatDAO.getFlatbyid(id);
    }
}
