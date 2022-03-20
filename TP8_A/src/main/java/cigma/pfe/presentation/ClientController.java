package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("controller")
public class ClientController {
    @Autowired
    IClientService IClientService;

    public Client save(Client c){
        return IClientService.save(c);
    }
    public Client modify(Client clt) {
        return IClientService.modify(clt);
    }
    public void remove(long idClt) {
        IClientService.remove(idClt);
    }
    public Client getOne(long idClt) {
        return IClientService.getOne(idClt);
    }
    public List<Client> getAll() {
        return IClientService.getAll();
    }

    public IClientService getIClientService() {
        return IClientService;
    }
}
