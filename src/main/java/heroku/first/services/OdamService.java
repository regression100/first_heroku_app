package heroku.first.services;

import heroku.first.model.Odam;
import org.springframework.stereotype.Service;

@Service
public class OdamService {
    public Odam generateExample(){
        return new Odam("Alkash", "Bangiyev",30);
    }
}
