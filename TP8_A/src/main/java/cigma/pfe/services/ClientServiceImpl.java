package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientDao iClientDao;

    @Override
    @Transactional
    public Client save(Client c) {
        return iClientDao.save(c);
    }

    @Transactional
    public Client modify(Client newClt) {
        Client oldClt = iClientDao.findById(newClt.getId()).get();
        oldClt.setName(newClt.getName());
        return iClientDao.save(oldClt);
    }
    @Transactional
    public void remove(long idClt) {
        iClientDao.deleteById(idClt);
    }

    public Client getOne(long idClt) {
        return iClientDao.findById(idClt).get();
    }

    public List<Client> getAll() {
        return (List<Client>) iClientDao.findAll();
    }


}
