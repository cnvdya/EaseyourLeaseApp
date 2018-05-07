package sjsu.jentab.EaseYourLease.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sjsu.jentab.EaseYourLease.dao.FlatDAO;
import sjsu.jentab.EaseYourLease.dao.TenantsDAO;
import sjsu.jentab.EaseYourLease.dao.impl.FlatDAOImpl;
import sjsu.jentab.EaseYourLease.model.Tenant;

import java.util.List;

@Component
public class TenantDAOImpl {

    @Autowired
    private TenantsDAO tenantsDAO;


    @Autowired
    private FlatDAOImpl flatDAOImpl;


    public Integer addorUpdateTenant(Tenant tenant){
        System.out.println("flatid received="+tenant.getFlatid());
        String status;
        try{
            tenantsDAO.save(tenant);
            if(tenant!=null)
                 System.out.println("Tenant flat="+tenant.getFlatid());

            flatDAOImpl.updateAvailibility(tenant.getFlatid());
            status="SUCCESS";
        }
        catch (Exception e){
            System.out.println(e);
            status="FAILED";
        }
        return tenant.getId();
    }

    public Tenant getTenant(Integer id){
        return (Tenant)tenantsDAO.findOne(id);
    }

    public Tenant getTenantByflatid(Integer id){ return (Tenant)tenantsDAO.findByFlatid(id);}

}
