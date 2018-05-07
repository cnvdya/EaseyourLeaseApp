package sjsu.jentab.EaseYourLease.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sjsu.jentab.EaseYourLease.dao.FlatDAO;
import sjsu.jentab.EaseYourLease.model.Apartment;
import sjsu.jentab.EaseYourLease.model.Flat;

import java.util.List;
@Component

public class FlatDAOImpl {

    @Autowired
    private FlatDAO flatDAO;

    public List<Flat> flatslist(Integer apartmentId){
        return (List<Flat>)flatDAO.findByApartmentId(apartmentId);

    }

    public Flat getFlatbyid(Integer id){
        return (Flat)flatDAO.findOne(id);
    }

    public String addorUpdateFlat(Flat flat){
        String status;
        try{
            System.out.println("Flat Dao "+ flatDAO);
            //flat.setAvailability("true");
            flatDAO.save(flat);
            status="SUCCESS";
        }
        catch (Exception e){
            System.out.println(e);
            status="FAILED";
        }
        return status;
    }

    public String updateAvailibility(Integer flatid){
        System.out.println(flatid);
        System.out.println("Flat Dao "+ flatDAO);

        Flat flat=(Flat)getFlatbyid(flatid);

        System.out.println("Flat "+ flat);

        flat.setAvailability("false");

        System.out.println("testing"+flat.getId());
        System.out.println("---"+flat.getFlatName());
        System.out.println("---"+flat.getAvailability());
        System.out.println("---"+flat.getType());
        addorUpdateFlat(flat);
        return "availibility updated";
    }

}
