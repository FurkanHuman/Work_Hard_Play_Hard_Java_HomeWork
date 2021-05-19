package core.adapters.concretes;

import GServicesManager.GUser;
import GServicesManager.GoogleManager;
import core.adapters.abstracts.GAuthService;
import entities.concretes.User;

public class GServicesManagerAdaptor implements GAuthService {

    @Override
    public User registerWithGoogle() {
        GoogleManager googleManager = new GoogleManager();

        GUser gUser = googleManager.register();

        User user = new User(10, gUser.getFirstName(), gUser.getLastName(), gUser.geteMail(), gUser.getPassword());

        return user;
    }

}
