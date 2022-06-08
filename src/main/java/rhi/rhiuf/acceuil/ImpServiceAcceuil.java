package rhi.rhiuf.acceuil;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rhi.rhiuf.dashboard.bio.Bio;
import rhi.rhiuf.dashboard.bio.RepositoryBio;

@Service
public class ImpServiceAcceuil implements ServiceAcceuil {

    @Autowired
    private RepositoryBio bioRepo;
    @Override
    public List<Bio> getBiographies() {
        return this.bioRepo.findAll().stream().filter(bio -> bio.getBioEnabled() == true).collect(Collectors.toList());
    }
    
}
